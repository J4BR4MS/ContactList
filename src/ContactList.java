import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that stores subclasses of Person as a contact list.
 * The user is presented with a menu of options and may add, sort,
 * search, or list the contacts.
 *
 * Created for Menlo School CS2
 *
 * @author: Ms. Namasivayam & Mr. Blick
 * @version: 2022-2023
 */


public class ContactList
{
    // TODO: Create your array contacts

    // TODO: Write a Constructor

    ArrayList<Person> contacts;

    public ContactList(){
        contacts = new ArrayList<>();
    }



    public void printMenuOptions() {
        System.out.println("Menu: ");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts By First Name");
        System.out.println("3. List All Contacts By Last Name");
        System.out.println("4. List All Contacts By Phone Number");
        System.out.println("5. List All Students");
        System.out.println("6. Search By First Name");
        System.out.println("7. Search By Last Name");
        System.out.println("8. Search by Phone Number");
        System.out.println("0. Exit");
    }

    /**
     * Asks user for input to create and add a new Person
     * to the contact list
     */
    public void addContact(Person contact){
        contacts.add(contact);
    }

    /**
     * Loops through and prints all contacts
     */
    public void printContacts() {
        for(int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i));
        }
    }

    /**
     * Bubble sorts the contacts in the list by firstName,
     * lastName, or phoneNumber
     * @param sortBy: 0=firstName, 1=lastName, 2=phoneNumber
     */
    public void sort(int sortBy) {
        //sort by first name
        if(sortBy == 0)
        {
            for(int i = 0; i < contacts.size() - 1; i++){
                for(int j = 0; j < contacts.size() - 1; j++){
                    Person p1 = contacts.get(j);
                    Person p2 = contacts.get(j + 1);
                    if(p1.getFirstName().compareTo(p2.getFirstName()) == -1){
                        contacts.set(j, p2);
                        contacts.set(j + 1, p1);
                    }
                }
            }
        }

        //sort by last name
        if(sortBy == 1)
        {
            for(int i = 0; i < contacts.size() - 1; i++){
                for(int j = 0; j < contacts.size() - 1; j++){
                    Person p1 = contacts.get(j);
                    Person p2 = contacts.get(j + 1);
                    if(p1.getLastName().compareTo(p2.getLastName()) == -1){
                        contacts.set(j, p2);
                        contacts.set(j + 1, p1);
                    }
                }
            }
        }

        //sort by phone number
        if(sortBy == 2)
        {
            for(int i = 0; i < contacts.size() - 1; i++){
                for(int j = 0; j < contacts.size() - 1; j++){
                    Person p1 = contacts.get(j);
                    Person p2 = contacts.get(j + 1);
                    if(p1.getPhoneNumber().compareTo(p2.getPhoneNumber()) == -1){
                        contacts.set(j, p2);
                        contacts.set(j + 1, p1);
                    }
                }
            }
        }
    }

    /**
     * Lists just the Student objects in the Contact List
     */
    public void listStudents() {
        for(int i = 0; i < contacts.size() - 1; i++){
            if(contacts.get(i) instanceof Student){
                System.out.println(contacts.get(i));
            }
        }
    }

    public Person searchByFirstName(String firstName){
        for(int i = 0; i < contacts.size() - 1; i++){
            if(firstName.equals(contacts.get(i).getFirstName())){
                return contacts.get(i);
            }
        }
        return null;
    }

    public Person searchByLastName(String lastName){
        for(int i = 0; i < contacts.size() - 1; i++){
            if(lastName.equals(contacts.get(i).getLastName())){
                return contacts.get(i);
            }
        }
        return null;
    }

    public Person searchByPhoneNumber(String phoneNumber){
        for(int i = 0; i < contacts.size() - 1; i++){
            if(phoneNumber.equals(contacts.get(i).getPhoneNumber())){
                return contacts.get(i);
            }
        }
        return null;
    }




    /**
     * Loops providing menu options to the user
     * until the user exits
     */
    public void run() {
        System.out.println("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options");
        printMenuOptions();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input != 0) {
            if (input == 1) {
                System.out.println("Student or Cheese Connoisseur? [0/1]");
                int j = sc.nextInt();
                if (j == 0) {
                    System.out.println("First name: ");
                    String firstName = sc.nextLine();
                    firstName = sc.nextLine();

                    System.out.println("Last name: ");
                    String lastName = sc.nextLine();

                    System.out.println("Phone number: ");
                    String phoneNumber = sc.nextLine();


                    System.out.println("Grade: ");
                    int grade = sc.nextInt();
                }

                if (j == 1) {
                    System.out.println("First name: ");
                    String firstName = sc.nextLine();
                    firstName = sc.nextLine();

                    System.out.println("Last name: ");
                    String lastName = sc.nextLine();


                    System.out.println("Phone number: ");
                    String phoneNumber = sc.nextLine();


                    System.out.println("Joke: ");
                    String joke = sc.nextLine();
                }
                System.out.println("Choose an option from the menu again. [1-10]");
                input = sc.nextInt();
            }
            if (input == 2) {
                    sort(0);
                    printContacts();
            }
            if (input == 3) {
                sort(1);
                printContacts();
            }
            if (input == 4) {
                    sort(2);
                    printContacts();
            }
            if (input == 5) {
                    listStudents();
            }
            if (input == 6) {
                    System.out.println("Enter first name: ");
                    searchByFirstName(sc.nextLine());
            }
            if (input == 7) {
                    System.out.println("Enter last name: ");
                    searchByLastName(sc.nextLine());
            }
            if (input == 8) {
                    System.out.println("Enter phone number: ");
                    searchByPhoneNumber(sc.nextLine());
            }
        }
    }
        public static void main(String[] args){
        ContactList cl = new ContactList();
        cl.run();
    }
}
