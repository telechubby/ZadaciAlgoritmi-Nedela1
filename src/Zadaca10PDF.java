/*
    Дадена е еднострано поврзана листа. Да се напише функција која ќе ги избрише сите
    повеќекратни елементи од листата (при секоја појава на два соседни елементи со иста
    информација едниот треба да се избрише). Како резултат функцијата да врати колку јазли
    биле избришани.
    Влез:
    Во првиот ред се внесува бројот на елементи во листата. Во вториот ред се
    внесуваат елементите.
    Излез:
    Во првиот ред се печати резултантната листа. Во вториот ред се печати колку
    елементи биле избришани.
    Пример:
    Влез:
    11
    3 4 4 7 6 4 4 4 7 3 2
    Излез:
    List: 3->4->7->6->4->7->3->2
    Elements deleted: 3
 */

import java.util.Scanner;

public class Zadaca10PDF {
    public static int deleteDuplicates(SLL<Integer> lista)
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
        n=deleteDuplicates(lista);
        System.out.printf("Result:\nList: %s\nElements removed: %d\n",lista);
    }
}
