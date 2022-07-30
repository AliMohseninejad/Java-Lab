package com.example.mychatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends MyBaseActivity {

    SocketMessageHandler socketMessageSender = ConnectToServerActivity.socketMessageSender;
    SocketMessageHandler socketMessageReceiver = ConnectToServerActivity.socketMessageReceiver;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }

    public void chatWithUserHandler(View v) {

        EditText userText = findViewById(R.id.Main_connectTo);

        String targetUser = userText.getText().toString();
        socketMessageSender.setMessage("[connect] " + targetUser);
        String ack = socketMessageReceiver.listenAndSend();

        MessageDecoder ackDecoded = new MessageDecoder(ack);
        String ackCommand = ackDecoded.getCommand();

        Log.i("Decode",ackCommand);
        Log.i("Decode",ack);

        if (ackCommand.equals("ConnectedTo")) {
            String target = ackDecoded.getMessage();
            Toast.makeText(this, "Talk to " + ackDecoded.getMessage(), Toast.LENGTH_LONG).show();
        }
        else if (ackCommand.equals("ConnectFailSelf")) {
            Toast.makeText(this, "Cannot talk to self", Toast.LENGTH_LONG).show();
        }
        else if (ackCommand.equals("ConnectFailUserNotFound")) {
            Toast.makeText(this, "Username not found", Toast.LENGTH_LONG).show();
        }

        if (ackCommand.equals("DisconnectedFrom")) {
            String prevTarget = ackDecoded.getMessage();
        }
    }

}