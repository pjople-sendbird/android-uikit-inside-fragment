package com.example.uikitinsidefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.sendbird.uikit.fragments.ChannelListFragment;
import com.sendbird.uikit.fragments.ChannelListFragment;

public class UIKitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uikit);

        invokeUIKit();
    }

    /**
     * Show UIKit fragment
     */
    private void invokeUIKit() {
        ChannelListFragment fragment = createChannelListFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.popBackStack();
        manager.beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit();
    }

    protected ChannelListFragment createChannelListFragment() {
        return new ChannelListFragment.Builder()
                .setUseHeader(true)
                .build();
    }

}