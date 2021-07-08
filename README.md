# Android UIKit inside a Fragment

Sample Android project for showing it inside a Fragment.

Make sure you edit this information from ```BaseApplication``` and add your SendBird application ID, user ID and user nickname.
```
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
```
