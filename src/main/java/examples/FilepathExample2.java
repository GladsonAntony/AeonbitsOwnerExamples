package examples;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

public class FilepathExample2
{
    @Config.Sources({"file:~/src/main/resources/Test2.properties"})
    public static interface DefaultTest extends Config
    {
        String FirstName();
        String MiddleName();
        String LastName();
    }

    @Test
    public void test1() throws Exception
    {
        DefaultTest defaultTest = ConfigFactory.create(DefaultTest.class);
        System.out.println(defaultTest.FirstName());
        System.out.println(defaultTest.MiddleName());
        System.out.println(defaultTest.LastName());
    }



}
