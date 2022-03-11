import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
      Demo demoObj=new Demo();

    @Test
    public void demoMethodTest(){
        //given
        String expected="VANDANA";

        //when
     String actual=   demoObj.demoMethod("vandana");

     //then
        Assert.assertEquals(expected,actual);
    }
}
