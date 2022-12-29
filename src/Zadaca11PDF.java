/*
    Дадена е еднострано поврзана листа. Да се напише функција која ќе ги замени местата
    на првиот и последниот јазел во листата. Да се заменат местата на целите јазли,
    а не само на информациите во нив!
    Влез:
    Во првиот ред се внесува бројот на елементи во листата. Во вториот ред се
    внесуваат елементите.
    Излез:
    Во единствениот ред се печати резултантната листа

    Пример:
    Влез:
    8
    3 4 7 6 4 7 3 2
    Излез
    List: 2->4->7->6->4->7->3->3
 */

import java.util.Scanner;

public class Zadaca11PDF {
    public static void swapEnds(SLL<Integer> lista)
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
        swapEnds(lista);
        System.out.printf("Result:\nList: %s\n",lista);
    }
}
