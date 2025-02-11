package model;

public class User {
    private String username;
    private  String password;
    private String displayName;
    private boolean online;
    public User() {
        username  = "";
        password = "";
        displayName = "";
        online = false;
    }
    public User(String tempuser, String temppassword, String tempdisplayname, boolean temponline) {
        username  = tempuser;
        password = temppassword;
        displayName = tempdisplayname;
        online = temponline;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isOnline() {
        return online;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User otherUser = (User) obj;
        return username.equals(otherUser.username);
    }
}
