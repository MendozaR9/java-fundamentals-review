import java.util.Arrays;

public class AssessmentReview {
    public static int cubed(int number){
        return (int) Math.pow(number,3);
    }

    public static  double difference(double num1, double num2){
        return num1 - num2;
    }

    public static double median(int[] arraynumber){
        Arrays.sort(arraynumber);
        double median=0 ;

       if (arraynumber.length%2 ==1){
           median =(double) arraynumber[(arraynumber.length+1)/2-1];
       }
       else {
           median=(double)(arraynumber[arraynumber.length/2-1]+arraynumber[arraynumber.length/2])/2;
       }
return median;
    }



}
