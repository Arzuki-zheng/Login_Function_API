package tw.kewang.testserver.api;

public class Userdata {                                 //define the class of Userdata to store the username and password

    private String username;
    private String password;

    public void setUsername(String username_In) {
        username = username_In;
    }

    public void setPassword(String password_In) {
        password = password_In;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    Userdata() {/*empty*/}                              //Constructor

}
