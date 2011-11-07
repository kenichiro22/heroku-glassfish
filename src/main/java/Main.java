import org.glassfish.embeddable.GlassFish;
import org.glassfish.embeddable.GlassFishProperties;
import org.glassfish.embeddable.GlassFishRuntime;
import org.glassfish.embeddable.archive.ScatteredArchive;

import java.io.File;
import org.glassfish.embeddable.Deployer;

/**
 * Bootstrap class
 * 
 * @author kenichiro22
 */
public class Main{
    public static void main(String[] args) throws Exception {
        String port = System.getenv("PORT");
        port = port != null ? port : "8080";
        GlassFishProperties gfProps = new GlassFishProperties();
        gfProps.setPort("http-listener", Integer.parseInt(port));

        GlassFish glassfish = GlassFishRuntime.bootstrap().newGlassFish(gfProps);
        glassfish.start();

        File webRoot = new File("src/main/webapp");
        File classRoot = new File("target", "classes");

        Deployer deployer = glassfish.getDeployer();
        ScatteredArchive archive = new ScatteredArchive("hello", ScatteredArchive.Type.WAR, webRoot);
        archive.addClassPath(classRoot);
        deployer.deploy(archive.toURI());
    }
}
