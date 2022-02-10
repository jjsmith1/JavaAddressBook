import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	private static ArrayList<Entry> addressBook;
    private static Scanner scanner;
    
	public static void main(String[] args) {
		addressBook=new ArrayList<>();
        scanner=new Scanner(System.in);

        while (true){
            printMenu();
            char input= scanner.next().charAt(0);
            while (input<'1' || input>'6'){
                System.out.println("Invalid Input, try again...");
                printMenu();
                input= scanner.next().charAt(0);
            }
            
            if(input=='1'){
                System.out.println("\nFirst Name: ");
                String firstName= scanner.next();
                System.out.println("\nLast Name: ");
                String lastName=scanner.next();
                System.out.println("\nPhone Number: ");
                String phoneNumber= scanner.next();
                System.out.println("\nEmail Address: ");
                String email= scanner.next();

                addressBook.add(new Entry(firstName,lastName,phoneNumber,email));

                System.out.println("\nAdded new entry!\n");
            
            }else if(input=='2'){
                System.out.println("\nEnter an entry's email to remove: ");
                String email= scanner.next();
                boolean found=false;
                int index=0;
                int i=0;

                for (Entry entry : addressBook) {
                    if(entry.getEmail().equals(email)){
                        found=true;
                        index=i;
                    }
                    i++;
                }

                if(!found){
                    System.out.println("\nEntry not found!\n");
                }else{
                    System.out.println("\nDeleted the following entry:\n");
                    System.out.println(addressBook.get(index));
                    addressBook.remove(index);
                }
            }else if (input=='3'){
                System.out.println("\n1) First Name\n\n" +
                        "2) Last Name\n\n" +
                        "3) Phone Number\n\n" +
                        "4) Email Adress\n\n" +
                        "Chose a search type: ");
                char in= scanner.next().charAt(0);
                if(in>='1' && in<='4'){
                    boolean flag=true;
                    System.out.print("\nEnter your search: ");
                    String key= scanner.next();
                    System.out.println();
                    for (Entry entry : addressBook) {
                        if(in=='1'){
                            if(entry.getFirstName().contains(key)){
                                System.out.println(entry);
                                flag=false;
                            }
                        }else if(in=='2'){
                            if(entry.getLastName().contains(key)){
                                System.out.println(entry);
                                flag=false;
                            }
                        }else if(in=='3'){
                            if(entry.getPhoneNumber().contains(key)){
                                System.out.println(entry);
                                flag=false;
                            }
                        }else{
                            if(entry.getEmail().contains(key)){
                                System.out.println(entry);
                                flag=false;
                            }
                        }
                    }
                    
                    if (flag){
                        System.out.println("No results found!\n");
                    }

                }else{
                    System.out.println("\nInvalid search option.\n");
                }

            }else if(input=='4'){

                if(!addressBook.isEmpty()){
                    System.out.println();
                    for (Entry entry : addressBook) {
                        System.out.println(entry);
                    }
                }else{
                    System.out.println("\nAddress Book is empty!\n");
                }
                    
            }else if(input=='5'){
                addressBook.clear();
                System.out.println("\nAddress book cleared!\n");

            }else {
            
 
               break;
            }
             
        }
        
	}    
        
        public static void printMenu() {
            System.out.println("Add an entry\n");
            System.out.println("Remove an entry\n");
            System.out.println(" Search for a specific entry\n"); 
            System.out.println(" Print Address Book\n");
            System.out.println(" Delete Book\n\n");
            System.out.println(" Quit\n\n" +
                    "Please choose what you'd like to do with the database: ");
        

	

	
	
	}
	

	
	
	
	
}
