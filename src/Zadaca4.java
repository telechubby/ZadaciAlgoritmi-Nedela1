/*
You are planning a trip around the world and want to keep track of all the places you
will visit. You decide to use a doubly linked list to store the names of the cities you
will visit and the order in which you will visit them.

The list should have the following operations:

-  -insert_city(name: str, position: int) -> None: This function should insert a new city
    with the given name at the given position in the list. For example, if the list contains
    the cities "Paris", "New York" and "London" in that order, and you call
    insert_city("Tokyo", 2), the list should now contain the cities
    "Paris", "Tokyo", "New York" and "London" in that order.
-  -remove_city(position: int) -> str: This function should remove the city at the given
    position from the list and return its name. For example, if the list contains the cities
    "Paris", "Tokyo", "New York" and "London" in that order, and you call remove_city(2),
    the function should remove "Tokyo" from the list and return "Tokyo". The list should
    now contain the cities "Paris", "New York" and "London" in that order.
-  -swap_cities(position1: int, position2: int) -> None: This function should swap the
    cities at the given positions in the list. For example, if the list contains the
    cities "Paris", "New York" and "London" in that order, and you call swap_cities(1, 2),
    the list should now contain the cities "Paris", "London" and "New York" in that order.
-   reverse_trip() -> None: This function should reverse the order of the cities in the list.
    For example, if the list contains the cities "Paris", "New York" and "London" in that
    order, and you call reverse_trip(), the list should now contain the cities
    "London", "New York" and "Paris" in that order.

You should implement the doubly linked list and the four operations described above.
You can assume that the positions given to the insert_city, remove_city and swap_cities
functions are valid, i.e., they correspond to existing cities in the list or to valid
positions where a city can be inserted.
 */

import java.util.Scanner;

public class Zadaca4 {
    public static DLL<String> cities=new DLL<>();
    public static void insert_city(String name, int position){
        //TODO: your code here
        System.out.println(cities.length());
        if(position<=0)
            cities.insertFirst(name);
        else if(position>= cities.length()) {
            cities.insertLast(name);
        }
        else{
            DLLNode<String> current=cities.getFirst();
            for(int i=0;i<position;i++)
                current=current.succ;
            cities.insertBefore(name,current);
        }
    }

    public static void remove_city(int position){
        //TODO: your code here
        if(position<=0)
            cities.deleteFirst();
        else if(position>= cities.length()-1)
            cities.deleteLast();
        else{
            DLLNode<String> current=cities.getFirst();
            for(int i=0;i<position;i++)
                current=current.succ;
            cities.delete(current);
        }
    }

    public static void swap_cities(int position1, int position2){
        //TODO: your code here
        if(position1<0)
            position1=0;
        if(position2<0)
            position2=0;
        if(position1> cities.length()-1)
            position1= cities.length()-1;
        if(position2> cities.length()-1)
            position2= cities.length()-1;
        DLLNode<String> current1=cities.getFirst();
        DLLNode<String> current2=cities.getFirst();
        for(int i=0;i<position1;i++)
            current1=current1.succ;
        for(int i=0;i<position2;i++)
            current2=current2.succ;
        String tmp=current1.element;
        current1.element= current2.element;
        current2.element=tmp;
    }

    public static void reverse_trip() {
        //TODO: your code here
        DLLNode<String> current1=cities.getFirst();
        DLLNode<String> current2=cities.getLast();
        int length= cities.length();
        for(int i=0;i<length/2;i++){
            String tmp=current1.element;
            current1.element= current2.element;
            current2.element=tmp;
            current1=current1.succ;
            current2=current2.pred;
        }
    }

    public static void main(String[] args) {
        cities.insertLast("0");
        cities.insertLast("1");
        cities.insertLast("2");
        Scanner scanner=new Scanner(System.in);
        int n=-1;
        while(n!=5){
            System.out.println("Please enter the desired operation: ");
            System.out.println("1.\tInsert city");
            System.out.println("2.\tRemove city");
            System.out.println("3.\tSwap cities");
            System.out.println("4.\tReverse order");
            System.out.println("5.\tPrint the list and exit");
            n=Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1 -> {
                    System.out.print("Please enter the city name: ");
                    String name = scanner.nextLine();
                    System.out.printf("Please enter the position of the city in the list (from 0 to %d): ",cities.length());
                    int position = Integer.parseInt(scanner.nextLine());
                    insert_city(name, position);
                    System.out.println(cities);
                }
                case 2 -> {
                    System.out.printf("Please enter the position of the city in the list (from 0 to %d): ",cities.length()-1);
                    int position = Integer.parseInt(scanner.nextLine());
                    remove_city(position);
                    System.out.println(cities);
                }
                case 3 -> {
                    System.out.printf("Please enter the position of the first city in the list (from 0 to %d): ",cities.length()-1);
                    int position1 = Integer.parseInt(scanner.nextLine());
                    System.out.printf("Please enter the position of the second city in the list (from 0 to %d): ",cities.length()-1);
                    int position2 = Integer.parseInt(scanner.nextLine());
                    swap_cities(position1, position2);
                    System.out.println(cities);
                }
                case 4 -> {
                    reverse_trip();
                    System.out.println(cities);
                }
                case 5 -> {
                    break;
                }
                case default -> System.out.println("Please enter a valid option 1-4");
            }
        }
        System.out.print("The result list is: ");
        System.out.println(cities);
    }
}
