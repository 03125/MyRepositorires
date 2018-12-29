package com.example.rose.githubtest;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("HandlerLeak")
    Handler handler  = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //蒋坤坤是大傻子哼@！！@@@@@@@@@@@@@@@@@@@@@！！！！！！！！！！！！！！！
		// 王玮是个大傻子   ######################!!!!!
        //月永豪是个大傻子！！！！！！！！！
        Message message = new Message();

        handler.sendMessage(message);
    }
}
