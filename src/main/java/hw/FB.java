package hw;

/**
 * Created by ywang83 on 9/8/2017.
 */

public class FB {
    public String getNumber(int n, int m)
    {
        m =10;
        for(n = 1; n<m; n++){
            if(n%15 == 0 ){
                System.out.println("fizzbuzz");
            }
            else if(n%5 == 0 ){
                System.out.println("buzz");
            }
            else if(n%3 == 0 ){
                System.out.println("fizz");
            }
            else {System.out.println( Integer.toString(n));}
        }
        return null;
    }
}
