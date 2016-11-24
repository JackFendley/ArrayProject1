import java.util.Scanner;

/**
 * 
 */

/**
 * @author j.fendley
 *
 */
public class ArrayProject1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
	
		int[] arrayToSearch = {15, 67, 34, 97, 53, 23};	
		int indexOfSearched = -1;	
		int searchValue;
		
		System.out.print("The Array: ");
	
		for(int i = 0; i < arrayToSearch.length; i++){
			
			System.out.print(arrayToSearch[i] + " ");
		}
			System.out.println("\nWhat value do you want the index of?");
			searchValue = userInput.nextInt();
			
			for(int i = 0; i < arrayToSearch.length; i++){
				if(arrayToSearch[i]==searchValue){
					indexOfSearched = i;
				}
			}
			
			if(indexOfSearched == -1){
				System.out.println("This is not in the array!");
				} else {
					System.out.println(searchValue + " is at index " + indexOfSearched);
			}
			

	userInput.close();
	}

}
