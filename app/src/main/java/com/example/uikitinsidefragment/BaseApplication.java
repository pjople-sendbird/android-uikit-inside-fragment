package com.example.uikitinsidefragment;

import android.app.Application;

import com.sendbird.uikit.SendBirdUIKit;
import com.sendbird.uikit.adapter.SendBirdUIKitAdapter;
import com.sendbird.uikit.interfaces.UserInfo;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        SendBirdUIKit.init(new SendBirdUIKitAdapter() {
            @Override
            public String getAppId() {
                return "SENDBIRD APPLICATION ID";  // Specify your Sendbird application ID.
            }

            @Override
            public String getAccessToken() {
                return "";
            }

            @Override
            public UserInfo getUserInfo() {
                return new UserInfo() {
                    @Override
                    public String getUserId() {
                        return "SENDBIRD USER ID";  // Specify your user ID.
                    }

                    @Override
                    public String getNickname() {
                        return "SENDBIRD USER NICKNAME";  // Specify your user nickname.
                    }

                    @Override
                    public String getProfileUrl() {
                        return "";
                    }
                };
            }
        }, this);

    }
}
