package tw.kewang.testserver.api;
public class Userdata {
    //private String id;
    private String username;
    private String password;

    //public void setId(String id_In) { id = id_In; }
    public void setUsername(String username_In) { username = username_In; }
    public void setPassword(String password_In) { password = password_In; }

    //public String getId() { return this.id; }
    public String getUsername() { return this.username; }
    public String getPassword() { return this.password; }
    Userdata(String username_In,String password_In){
        username=username_In;
        password=password_In;
    }
    Userdata(){/*empty*/};
}
