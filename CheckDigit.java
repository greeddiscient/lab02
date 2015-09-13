import java.util.*;

public class CheckDigit {

    public static void main (String [ ] args) {
        int id = 0;
        try {
            id = Integer.parseInt (args[0]);
        } catch (NumberFormatException e) {
            System.out.println ("The argument has to be a sequence of digits.");
            System.exit (1);
        }

        boolean isLegal = true;
        // TODO Your code here
        int lastnum= id%10;
        String s= Integer.toString(id);
        List<Integer> digits= new ArrayList<Integer>();

        
        
        while (id> 10){
        	id= id/10;
        	digits.add(id%10);       	
        }
        int sum=0;
        for (int i : digits){
        	sum+=i;
        }
        if (sum%10== lastnum){
        	isLegal=true;
        	
        }
        else{
        	isLegal=false;
        }
        
        
        
        
        if (isLegal) {
            System.out.println (s + " is legal");
        } else {
            System.out.println (s + " is not legal");
        }
    }

}
