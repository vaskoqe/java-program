import java.util.Scanner;
public class Отпечатване {

	public static void main(String[] args) {
		
			Scanner input= new Scanner(System.in);
			System.out.println("Въведи число а");
			long a= input.nextLong();
			System.out.println("Въведи число b");
			long b= input.nextLong();
			long product =1;
			long temp = a;
			while(temp<=b) {
				product *= temp;
				temp++;
			}
			System.out.println("Произведението на числата в интервала е: " +product);
		
		
		

	}

}
