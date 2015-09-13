import java.util.*;

public class AddingMachine {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean justStarting = true;
		int total = 0;
		int subtotal = 0;
		while (true) {
		    // TODO Your code here
			int k;
			k=scanner.nextInt();
			if (k==0 && justStarting==true){
				System.out.println(String.format("Subtotal: %d", subtotal));
				total+=subtotal;
				subtotal=0;
				justStarting= false;
			}
			else if (k==0 && justStarting== false){
				System.out.println(String.format("Total: %d", total));
				return;
			}
			else{
				subtotal+=k;
				justStarting=true;
			}
		}
	}

}
