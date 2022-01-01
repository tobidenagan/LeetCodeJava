import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args)
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        //fizzBuzz(10);
        //new FizzBuzz().FizzBuzzMethod(5);
        System.out.println(fizzBuzz.FizzBuzzMethod(15));
        //System.out.println(3%3);
        //String[] testStrArray = {"ab", "cd"};
        //System.out.println(Arrays.toString((testStrArray)));
        //System.out.println(testStrArray.toString());

    }



    public List<String> FizzBuzzMethod(int n){
        if (n < 0) return null;

        var arrList = new LinkedList<String>();

        for (int i = 1; i < n + 1; i++ ){

            if ((i % 3 == 0) && (i % 5 == 0)){
                arrList.add("FizzBuzz");
            }
            else if (i % 3 == 0){
                arrList.add("Fizz");
            }
            else if (i % 5 == 0 ){
                arrList.add("Buzz");
            }
            else {
                arrList.add(Integer.toString(i));
            }
        }

        return arrList;
    }

}
