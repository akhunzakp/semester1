package jobsheet7;

import java.util.Scanner;

public class ForMultiples26 {
    
    public static void main(String[] args) {
    
        Scanner input =new Scanner(System.in);
        int multiple, sum = 0, counter = 0;
        
        System.out.println("Input the multiple  = ");
        multiple = input.nextInt();
        
        for(int i=1;i<=50;i++){
            if(i % multiple == 0){
                sum = sum + i;
                counter++;

            }
        }
        double average = sum / counter;
        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiple, sum);
        System.out.printf("the average off all multiples of %d in the range 1 to 50 is %.2f.. \n" , multiple, average);

            }
}
   