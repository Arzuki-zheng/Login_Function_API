package tw.kewang.testserver.api;

import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("Userdata")
public class ApiOfUser {
    private static final Gson GSON=new Gson();
    @POST
    @Path("addUser")
    public Response addUserdata(String data){
        Userdata userdata=new Userdata();
        userdata=GSON.fromJson(data,Userdata.class);
        UserResponse userResponse=new UserResponse();
        if(userdata.getUsername().equals("TEST_USER")&&userdata.getPassword().equals("00000000")){
            userResponse.setR(0);
            userResponse.setMessage("success");
        }else {
            userResponse.setR(1);
            userResponse.setMessage("failure");
        }
        return Response.ok().entity(GSON.toJson(userResponse)).build();
    }
}


