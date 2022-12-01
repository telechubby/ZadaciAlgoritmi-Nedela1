/*
    Zadaca 3: Neka e dadena lista od broevi. Listata da se podeli vo dve listi:
              parni i neparni, taka sto listata od parni broevi da ostane vo ist redosled,
              a listata so neparni broevi da stane vo obraten redosled.

    Vlez:  Vo prviot red se cita n-brojot na elementi na listata, a potoa vo slednite
           n redovi se citaat elementite na listata
    Izlez: Se pecati prvo listata so parni broevi, a potoa so neparni broevi.

    Test primer:

    Vlez:
        9
        1
        2
        3
        4
        5
        6
        7
        8
        9
    Izlez:
        2 4 6 8
        9 7 5 3 1

    ---------------------------------------------------------------------------------------
    *Bitno* Kako i za prvata zadaca, potrebno e da gi dodades DLL i DLLNode klasite,
            dali vo istiot java file ili vo poseben ne e bitno.
    *Bitno* Listite za parni i neparni broevi veke postojat, samo treba da se napolnat
            so soodvetnite elementi. Parnite odat vo even, neparnite vo odd.
 */

import java.util.Scanner;

public class Zadaca3 {
    static void splitEvenOdd(DLL<Integer> list, DLL<Integer> even, DLL<Integer> odd){
        //TODO: your code here
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        DLL<Integer> list=new DLL<>(), even=new DLL<>(), odd=new DLL<>();
        for(int i=0;i<n;i++)
            list.insertLast(Integer.parseInt(scanner.nextLine()));
        splitEvenOdd(list,even,odd);
        System.out.printf("Parni broevi: %s\n",even.toString());
        System.out.printf("Neparni broevi: %s\n",odd.toString());
    }
}
