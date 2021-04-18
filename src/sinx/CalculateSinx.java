package sinx;

import java.util.Scanner;

public class CalculateSinx {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

        double x;
        int n;
        
            System.out.println("Enter x");
            x=sc.nextDouble();
            
            System.out.println("Enter n");
            n=sc.nextInt();
           
        double y;

        y = x*Math.PI/180;

        

        int i,j;
        int fact;
        double result = 0;

        for(i=0; i<=n; i++){

        	fact = 1;

            for(j=2; j<=2*i+1; j++){

            	fact*=j;

            }

            result+=Math.pow(-1.0,i)*Math.pow(y,2*i+1)/fact;

        }

        System.out.format("The sin of " + x + " is %f",result);
		
	}

}
