/*
Дадена е еднострано поврзана листа. Да се напише функција која ќе ги удвои елементите кои
во info полето имаат вредност x (до нив ќе вметне нов јазел со иста информација). Како
резултат функцијата да врати колку нови јазли биле вметнати.
Влез:
Во првиот ред се внесува бројот на елементи во листата. Во вториот ред се
внесуваат елементите. Во третиот ред се внесува x
Излез:
Во првиот ред се печати резултантната листа. Во вториот ред се печати колку
елементи биле додадени.

Пример:
Влез:
8
3 4 7 6 4 7 3 2
4
Излез:
List: 3->4->4->7->6->4->4->7->3->2
Elements added: 2
 */

import java.util.Scanner;

public class Zadaca9PDF {
    public static int addDuplicateAfterX(SLL<Integer> lista, Integer x)
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
        n=addDuplicateAfterX(lista,n);
        System.out.printf("Result:\nList: %s\nElements added: %d\n",lista,n);
    }
}
