import java.util.Scanner;
class Fredy{
	public static void main(String[] args){
		
		
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the distance");
			double length = scanner.nextDouble();
			
			int jumpCount=0;
			int gap = 0;
			double totalTime=0;
			if(length > 0){
					while(length > 0){
					if(gap==0 && length > 0){
						length = length - 5;
						jumpCount++;
						totalTime = totalTime + 1;
						gap++;
					}
					if(gap==1 && length > 0){
						length = length - 3;
						jumpCount++;
						totalTime = totalTime + 2;
						gap++;
					}
					if(gap==2 && length > 0){
						length = length - 1;
						jumpCount++;
						totalTime = totalTime + 3.5;
						gap=0;
					}
				
				}
			System.out.println("Fredy's total time is taken for the distance :"+ totalTime);
			System.out.println("Fredy's total jump count is for the distance :"+ jumpCount);
			}
			else {
				System.out.println("Invalid Distance value");
			}
		}
		catch(Exception ex){
				System.out.println("Invalid input");
		}
	
	
	}
}