package tw.kewang.testserver.api;

import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("Userdata")
public class ApiOfUser {
    private static final Gson GSON=new Gson();
    @POST
    @Path("addUser")
    public Response addUserdata(String data){
        UserResponse userResponse=new UserResponse();
        Userdata userdata=new Userdata();
        userdata=GSON.fromJson(data,Userdata.class);
        System.out.println(userdata.getUsername()+"\n"+userdata.getPassword());
        userResponse.show();
        return Response.ok().entity(GSON.toJson(userResponse)).build();
    }
}


