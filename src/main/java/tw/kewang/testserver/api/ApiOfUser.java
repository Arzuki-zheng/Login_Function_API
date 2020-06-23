package tw.kewang.testserver.api;

import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;                           //import the functions

@Path("Userdata")                                           //set the outer Path for class
public class ApiOfUser {
    private static final Gson GSON=new Gson();
    @POST                                                   //add new data
    @Path("addUser")                                        //set the inter Path for class
    public Response addUserdata(String data){
        Userdata userdata=new Userdata();
        userdata=GSON.fromJson(data,Userdata.class);        //load the private attributes
        UserResponse userResponse=new UserResponse();
        if(userdata.getUsername().equals("TEST_USER")&&userdata.getPassword().equals("00000000")){
            userResponse.setR(0);
            userResponse.setMessage("success");
        }else {
            userResponse.setR(1);
            userResponse.setMessage("failure");             //check the input is equal to SAMPLE
        }
        return Response.ok().entity(GSON.toJson(userResponse)).build(); //use GSON trans objects to json
    }
}


