/*
  Zadaca: Na vlez se dadeni dve dvojno povrzani listi, da se kreira nova taka shto naizmenicno
  ke se dodavaat po tri jazli od prvata pa od vtorata
  Vlez:
7
3 7 1 2 5 6 4
5
3 7 1 2 4

Izlez

3 7 1 3 7 1 2 5 6 2 4 4
 */

import java.util.Scanner;

public class TriJazli {
    public static DLL<Integer> spojListiPoTri(DLL<Integer> lista1, DLL<Integer> lista2)
    {
        DLL<Integer> rezultat=new DLL<>();
        //TODO: your code here
        return rezultat;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        DLL<Integer> lista1=new DLL<>();
        String[] input=scanner.nextLine().split(" ");
        for(String number:input)
            lista1.insertLast(Integer.parseInt(number));
        n=Integer.parseInt(scanner.nextLine());
        DLL<Integer> lista2=new DLL<>();
        input=scanner.nextLine().split(" ");
        for(String number:input)
            lista2.insertLast(Integer.parseInt(number));
        DLL<Integer> rezultat=spojListiPoTri(lista1,lista2);
        System.out.println("Rezultat: "+rezultat);
    }
}
