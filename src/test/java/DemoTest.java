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

    @Test
    public void stringSortTest(){
        //given
        String[] str={"1","5","15","9","4"};
        String[] expected={"1","4","5","9","15"};

        //when
        String[] actual=  demoObj.stringSort(str);

        //then
        Assert.assertArrayEquals(expected,actual);
        //Assert.assertEquals(expected,actual);

    }


    @Test
    public void firstNumBiggerTest(){
        //given
        String  first="15";
        String second="10";
         //when
        Boolean actual=demoObj.firstNumBigger(first,second);

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void firstNumBiggerTest1(){
        //given
        String  first="10";
        String second="15";
        //when
        Boolean actual=demoObj.firstNumBigger(first,second);

        //then
        Assert.assertFalse(actual);
    }


}
