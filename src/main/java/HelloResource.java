import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * JAX-RS Resource class
 * 
 * @author kenichiro22
 */
@Path("hello2")
public class HelloResource {

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String hello() {
        return "Hello world from JAX-RS!";
    }
}
