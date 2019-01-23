package examples;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

public class ClasspathExample
{
    @Config.Sources({"classpath:Test1.properties" })
    public static interface DefaultTest extends Config
    {
        String FirstName();
        String LastName();
    }

    @Test
    public void test1() throws Exception
    {
        DefaultTest defaultTest = ConfigFactory.create(DefaultTest.class);
        System.out.println(defaultTest.FirstName());
        System.out.println(defaultTest.LastName());
    }



}
