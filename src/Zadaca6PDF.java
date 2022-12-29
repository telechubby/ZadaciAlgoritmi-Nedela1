/*
    Дадена е еднострано поврзана листа. Да се напише функција која од листата ќе ги
    избрише сите елементи кои во info полето имаат непарен број. Како резултат функцијата
    да враќа колку јазли биле избришани.
    Влез:
    Во првиот ред се внесува бројот на елементи во листата. Во вториот ред се
    внесуваат елементите.
    Излез:
    Во првиот ред се печати резултантната листа. Во вториот ред се печати колку
    елементи биле избришани.
    Пример:
    Влез:
    8
    4->3->7->6->4->7->3->2
    Излез:
    List: 4->6->4->2
    Elements deleted: 4
 */

import java.util.Scanner;

public class Zadaca6PDF {
    public static int deleteOdd(SLL<Integer> lista)
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
        n=deleteOdd(lista);
        System.out.printf("Result:\nList: %s\nElements deleted: %d\n",lista,n);
    }
}
