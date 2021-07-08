package com.example.uikitinsidefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sendbird.uikit.fragments.ChannelListFragment;

public class MainActivity extends AppCompatActivity {

    Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * This button will call the UIKit activity with a Fragment inside
         */
        Button butCallUIKit = (Button) findViewById(R.id.butCallUIKit);
        butCallUIKit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, UIKitActivity.class);
                startActivity(intent);
            }
        });

    }

}