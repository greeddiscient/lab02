
public class TriangleDrawer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 0;
		int SIZE = 10;
		while (row < SIZE) {
			int col = 0;
			while (col <= row) {
				System.out.print ('*');
				col = col + 1;
			}
			row = row + 1;
			System.out.println ( );
			
		}
	}
}


