import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by IntelliJ IDEA.
 * User: ktana
 * Date: 11/10/29
 * Time: 1:06
 * To change this template use File | Settings | File Templates.
 */
@Path("hello")
public class HelloResource {

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String hello() {
        return "Hello world!";
    }
}
