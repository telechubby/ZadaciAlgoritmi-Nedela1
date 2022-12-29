/*
Дадена е еднострано поврзана листа. Да се напише функција која пред секој елемент
кој во info полето има вредност x ќе вметне нов јазел со информација y. Како резултат
функцијата да врати колку нови јазли биле вметнати.
Влез:
Во првиот ред се внесува бројот на елементи во листата. Во вториот ред се
внесуваат елементите. Во третиот ред се внесуваат x и y.
Излез:
Во првиот ред се печати резултантната листа. Во вториот ред се печати колку
елементи биле додадени.
Пример:
Влез:
8
3 4 7 6 4 7 3 2
3 1
Излез:
List: 1->3->4->7->6->4->7->1->3->2
Elements added: 2
 */

import java.util.Scanner;

public class Zadaca7PDF {
    public static int insertBeforeX(SLL<Integer> lista,Integer x, Integer y)
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
        input=scanner.nextLine().split(" ");
        n=insertBeforeX(lista,Integer.parseInt(input[0]),Integer.parseInt(input[1]));
        System.out.printf("Result:\nList: %s\nElements added: %d\n",lista,n);
    }
}
