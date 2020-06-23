package tw.kewang.testserver.api;

public class UserResponse {
   private boolean r=false;
   private String message;

    public void setR(boolean r) {
        this.r = r;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public boolean getR(){
        return r;
    }
    public void show(){
        System.out.println("WOWOWO");
    }
}
