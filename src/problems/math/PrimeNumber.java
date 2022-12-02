package problems.math;

public class PrimeNumber {

    /*
     *
     * find collections of Prime numbers from number 2 to 1 million.
     * output number of Prime numbers on the given range.
     *
     */

    public static void main(String[] args) {
        int nombre=0;
        for(int i = 2; i<=10;){
            int premier = 1;
            for(int loop = 2; loop <=i; loop++) {
                if((i % loop) == 0 && loop!=i) {
                    premier = 0;
                }
            }
            if (premier != 0){
                System.out.println(i+" it's prime number");
                i++;
                nombre++;
            }
            else
                i ++;
        }
        System.out.println(nombre+" of Prime numbers");
    }
        //write your code here

    }

