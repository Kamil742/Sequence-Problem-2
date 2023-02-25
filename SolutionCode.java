//Level 1 
//Generate the first 100 multiples of 7 which are positive numbers and also odd numbers. 
//Store these 1000 numbers in an array.
//Generate the first 100 multiples of 7 which are positive numbers and also odd numbers. 
//Store these 100 numbers in an array.Display these 100 numbers. 
//Level 2 
//1. Print all such numbers to which starts with an even digit.
//2. Print how many such numbers are found.Example of such numbers: 21,49,63…… 
//Level 3 
//Display how many of the numbers stored in the array have the digit 1. Replace the numbers with reverse of the numbers.

public class Main {

	public static void main(String[] args) {
		
		int number = 7, next = 1, num = 0, count = 0, cnt = 0;
		int array[] = new int[100];
		int arr[] = new int[10];
		int store[] = new int[100];
		
		
		// Level 1
		for(int a = 0; a < 100;a++) {
			
			array[a] = number;
			number+=14;
		}
		System.out.println(" The first 100 Odd multiples of 7 are: \n");
		for(int b = 0; b < 100; b++) {
			System.out.print(" "+array[b]+"  ");
			if(next%20 == 0) {
				System.out.println("\n");
			}
			next++;
		}
		
		//Level 2
		
		for(int c = 0; c < 100;c++) {
			 
			num = array[c];
			while(num > 0) {
				int remainder = num % 10;
				num = num / 10;
				arr[count] = remainder;
				count++;	
			}
			 if(arr[count - 1] % 2 ==0) {
				 store[cnt] = array[c];
				 cnt++;
			 }
			 count = 0;
		}
		System.out.println("\n The numbers start with even numbers are: \n");
		next = 1;
		for(int d = 0; d < cnt; d++) {
			
			System.out.print(" "+store[d]+"  ");
			if(next%10 ==0) {
				System.out.println("\n");	
			}
			next++;
		}
		System.out.println("\n\n The count of Numbers which start with even numbers are: "+cnt+"\n");

		//Level 3
		num = 0;count = 0;next = 1;cnt=0;
		for(int e = 0; e < 100; e++) {
			num = array[e];
			while(num > 0) {
				int remainder = num % 10;
				num = num / 10;
				arr[count] = remainder;
				count++;	
			}
			
			for(int f = 0; f < count; f++) {
				if(arr[f] == 1) {
					array[e] = 0;
					cnt++;
					for(int g = 0; g < count; g++) {
						if(g != count - 1)
						array[e] =( array[e] + arr[g] )* 10;
						else
							array[e] =( array[e] + arr[g] );

						
					}
				break;	
				}
			}
			
			count = 0;
		}
		System.out.println("\n The array of numbers with reverse integers(which has 1 as a digit) are : \n");
		for(int h = 0; h < 100; h++) {
			System.out.print(" "+array[h]+"  ");
			if(next%20 == 0) {
				System.out.println("\n");
			}
			next++;
		}
		System.out.println("\n The count of numbers which 1 as a digit in it are: "+cnt);
	}

}
