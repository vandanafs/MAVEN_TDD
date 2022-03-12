import java.util.Arrays;

public class Demo {


    public String demoMethod ( String input ) {
        return input.toUpperCase();
    }


    public String[] stringSort ( String[] input ) {
        for (int i = 0; i < input.length - 1; i++) {
                if(firstNumBigger(input[i], input[i+1])){
                    String temp = input[i];
                    input[i] = input[i + 1];
                    input[i +1] = temp;
                    i=0;

                }
            }
            System.out.println(Arrays.toString(input));
            return input;
    }



    public Boolean  firstNumBigger(String first, String second) {
       // boolean flag=false;

          if(first.charAt(0)== '-' && second.charAt(0)!='-') return false;
        if(first.charAt(0)!= '-' && second.charAt(0)=='-') return true;
        if(first.charAt(0)=='-' && second.charAt(0)=='-')  {
            if(first.length() > second.length() ) return false;
            if(first.length() == second.length() && first.compareTo(second) >0 )  return false;
        }
         if(first.length() > second.length() ) return true;
          if(first.length()==second.length() && first.compareTo(second) >0 )  return true;
       return false;
    }




}
