import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		
		
		while(!quit) {
			printInstruction();
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstruction();
				break;
			case 1:
				printList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				quit = true;
				break;
			}
		}
	}

	private static void searchItem() {
		System.out.print("Enter item to search in grocery list: ");
		String searchItem = scanner.nextLine();
		
		String item = groceryList.findItem(searchItem);
						
		if(item == null) {
			System.out.println(searchItem + " not found");
		}
		else {
			int index = groceryList.findItemIndex(searchItem);
			System.out.println(searchItem + " found at position " +  (index + 1));
		}
		
	}

	private static void removeItem() {
		System.out.print("Enter item to remove from grocery list: ");
		String itemToRemove = scanner.nextLine();
		
		String item = groceryList.findItem(itemToRemove);
				
		if(item == null) {
			System.out.println(itemToRemove + " not found");
		}
		else {
			int index = groceryList.findItemIndex(itemToRemove);
			groceryList.removeGroceryItem(index);
			System.out.println(itemToRemove + " removed from grocery list.");
		}
	}

	private static void modifyItem() {
		System.out.print("Enter item you want to modify in grocery list: ");
		String itemToModify = scanner.nextLine();
		
		System.out.print("Enter new item: ");
		String newItem = scanner.nextLine();
		
		String item = groceryList.findItem(itemToModify);

		
		
		
		if(item == null) {
			System.out.println(itemToModify + " not found");
		}
		else {
			int index = groceryList.findItemIndex(itemToModify);
			groceryList.modifyGroceryItem(index, newItem);
			System.out.println(itemToModify + " changed to " + newItem);
		}
		
	}

	private static void addItem() {
		System.out.print("Enter item to add to grocery list: ");
		String itemToAdd = scanner.nextLine();
		
		groceryList.addGroceryItem(itemToAdd);
		System.out.println(itemToAdd + " added to grocery list successfully.");
		
	}

	private static void printList() {
		groceryList.printGroceryList();
	}

	private static void printInstruction() {
		System.out.println("Choose an option:\n1-Print grocery list"
										  +	"\n2-Add item"
										  + "\n3-Modify item"
										  + "\n4-Remove item"
										  + "\n5-Search item"
										  + "\n6-Quit");
	}

}
