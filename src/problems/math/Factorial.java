package problems.math;

public class Factorial {

    public static int CalcFactorial(int nbr){
        if ((nbr==0) || (nbr==1)){
            return 1;
        }else{
            return (nbr*CalcFactorial(nbr-1));
        }
    }
    public static void main(String args[]) {
        //run your code here
        System.out.println(CalcFactorial(6));


    }

}
