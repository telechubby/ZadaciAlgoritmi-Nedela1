/*
    Дадена е еднострано поврзана листа. Да се напише функција која во листата ќе го пронајде
    првиот јазол со информација x и ќе го префрли на крај на листата. Како резултат
    функцијата да ја враќа позицијата (броено од почетокот на листата) на која бил
    пронајден бараниот јазол или -1 ако таков јазол не бил пронајден во листата.
    Влез:
    Во првиот ред се внесува бројот на елементи на листата. Во вториот ред се внесуваат
    елементите на листата. Во третиот ред се внесува елементот што се бара во листата.
    Пример:
    8
    3 4 7 6 4 7 3 2
    7
    Излез:
    List: 3->4->6->4->7->3->2->7
    Element position=3
 */

import java.util.Scanner;

class Zadaca2PDF {
    public static int findFirstElement(SLL<Integer> lista,Integer element)
    {
        //TODO: your code here
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        SLL<Integer> lista=new SLL<>();
        String[] input=scanner.nextLine().split(" ");
        for(String number:input)
            lista.insertLast(Integer.parseInt(number));
        n=Integer.parseInt(scanner.nextLine());
        n=findFirstElement()Element(lista,n);
        System.out.printf("Result:\nList: %s\nElement position: %d\n",lista,n);
    }
}