import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		
		
		while(!quit) {
			printInstruction();
			System.out.println("Enter your choice: ");
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
		System.out.println("Enter item to search from grocery list: ");
		String item = scanner.nextLine();
		
		int index = groceryList.findIndex(item);
		
		if(index == -1) {
			System.out.println("Item not found");
		}
		else {
			System.out.println(item + " found at postion " + index);
		}
		
	}

	private static void removeItem() {
		System.out.println("Enter item to remove from grocery list: ");
		String item = scanner.nextLine();
		
		int index = groceryList.findIndex(item);
		
		if(index == -1) {
			System.out.println("Item not found");
		}
		else {
			groceryList.removeGroceryItem(index);
			System.out.println(item + " removed from grocery list.");
		}
	}

	private static void modifyItem() {
		System.out.println("Enter item you want to modify in grocery list: ");
		String item = scanner.nextLine();
		
		System.out.println("Enter new item: ");
		String newItem = scanner.nextLine();
		
		int index = groceryList.findIndex(item);
		
		if(index == -1) {
			System.out.println("Item not found");
		}
		else {
			groceryList.modifyGroceryItem(index, newItem);
			System.out.println(item + " changed to " + newItem);
		}
		
	}

	private static void addItem() {
		System.out.println("Enter item to add to grocery list: ");
		String item = scanner.nextLine();
		
		groceryList.addGroceryItem(item);
		System.out.println(item + " added to grocery list.");
		
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
