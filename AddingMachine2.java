import java.util.Scanner;

public class AddingMachine2 {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean justStarting = true;
		int total = 0;
		int subtotal = 0;
		while (true) {
		    // TODO Your code here
			
			while (justStarting==true){
				int k;
				k=scanner.nextInt();
				if (k==0){
					total+=subtotal;
					System.out.println(String.format("Subtotal: %d", subtotal));
					subtotal=0;
					justStarting=false;
				}
				else{
					subtotal+=k;
				}
			}
			int j;
			j=scanner.nextInt();
			if (j==0){
				System.out.println(String.format("Total: %d", total));
				return;
			}
			else{
				subtotal+=j;
				justStarting=true;	
			}
		
		}
	}

}
