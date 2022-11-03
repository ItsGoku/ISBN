import java.util.Scanner;

public class isbn {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);

		int[] arr = new int[9];  
		System.out.println("Enter your 9 digit number: ");  
		
		int input = sc.nextInt();
		int a = input;
		int b = 0;
		
		while (a != 0) {
			
			arr[b]= a%10;
			a /= 10;
			b++;
			
		}
		
		int sum = 0;
		int x =10;
		
		for (int i=8; i>=0; i--) {

			sum += arr[i]*x;
			x--;
			
		}
		
		int f=0;
		f= 11-(sum%11);
		System.out.println("Input:"+ input);
		
		if(f >= 10) {
			
			System.out.println("Formatted ISBN:");
			 
			for(int i=8; i>=0; i--) {
				
				System.out.print(arr[i]);
				
				if (i==8 || i==5 || i==0) {
					
					System.out.print("-");
					
				}
			}
			
			System.out.print("X");
			
		}
		else {
			
			System.out.println("Formatted ISBN:");
			 
			for(int i=8; i>=0; i--) {
				
				System.out.print(arr[i]);
				
				if (i==8 || i==5 || i==0) {
					
					System.out.print("-");
					
				}
				
			}
			
			System.out.print(f);
			
		}
			
		}
		
}

