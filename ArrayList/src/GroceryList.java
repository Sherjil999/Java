import java.util.ArrayList;
import java.util.List;

public class GroceryList {
	List<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");//
		
		for(int i = 0; i < groceryList.size(); i++) {
			System.out.println((i + 1) + "." + groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);		
	}
	
	public void removeGroceryItem(int position) {
		groceryList.remove(position);
	}
	
	public String findItem(String searchItem) {
		int position = groceryList.indexOf(searchItem);
		
		if(position >= 0) {
			return groceryList.get(position);
		}
		else {
			return null;
		}
	}
		
	public int findItemIndex(String searchItem) {
		int index = groceryList.indexOf(searchItem);
		return index;
	}
	
}
