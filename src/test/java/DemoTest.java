import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
      Demo demoObj=new Demo();
/*
   Restrictions : String input should be numbers.
   Edge cases-Code must account for negative numbers, leading zeros,
   decimal numbers
   Bleeding edge cases-fractions,

 */
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
    @Test
    public void firstNumBiggerSameLengthFirstNegTest(){
        //given
        String  first="-2";
        String second="10";
        //when
        Boolean actual=demoObj.firstNumBigger(first,second);

        //then
        Assert.assertFalse(actual);
    }
    @Test
    public void firstNumBiggerSameLengthSecondNegTest(){
        //given
        String  first="21";
        String second="-1";
        //when
        Boolean actual=demoObj.firstNumBigger(first,second);

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void firstNumBiggerSameLengthBothNagativeTest(){
        //given
        String  first="-21";
        String second="-10";
        //when
        Boolean actual=demoObj.firstNumBigger(first,second);

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void firstNumBigger_firstShortFirstNegativeTest(){
        //given
        String  first="-1";
        String second="800";
        //when
        Boolean actual=demoObj.firstNumBigger(first,second);

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void firstNumBigger_firstShortSecondtNegativeTest(){
        //given
        String  first="10";
        String second="-800";
        //when
        Boolean actual=demoObj.firstNumBigger(first,second);

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void firstNumBigger_firstShortBothNegativeTest(){
        //given
        String  first="-100";
        String second="-80";
        //when
        Boolean actual=demoObj.firstNumBigger(first,second);

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void firstNumBigger_firstLongFirstNegativeTest(){
        //given
        String  first="-100";
        String second="50";
        //when
        Boolean actual=demoObj.firstNumBigger(first,second);

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void firstNumBigger_firstLongSecondtNegativeTest(){
        //given
        String  first="10000";
        String second="-800";
        //when
        Boolean actual=demoObj.firstNumBigger(first,second);

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void firstNumBigger_firstLongBothNegativeTest(){
        //given
        String  first="-100";
        String second="-80";
        //when
        Boolean actual=demoObj.firstNumBigger(first,second);

        //then
        Assert.assertFalse(actual);
    }



}
