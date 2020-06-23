package tw.kewang.testserver.api;

public class UserResponse {
    private int r;
    private String m;

    public void setR(int r) {
        this.r = r;
    }

    public void setMessage(String message) {
        this.m = message;
    }

    public String getMessage() {
        return m;
    }

    public int getR() {
        return r;
    }

    UserResponse() {
        /*empty*/
    }
}
