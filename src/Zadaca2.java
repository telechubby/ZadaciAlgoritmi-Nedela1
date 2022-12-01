/*
    Zadaca 2: Na daden natprevar po boxing imame natprevaruvaci od dve kategorii:
              lesna i teska. Potrebno e da se napravi balansiranje na ovie dve kategorii.
              Pod balansiranje se podrazbira najslabiot boxer od teska kategorija da se
              stavi na krajot od listata so boxeri od lesna kategorija, a potoa najjakiot
              boxer od lesna kategorija da se stavi na pocetokot od listata so boxeri od
              teska kategorija. Jacinata na boxerot se dobiva so funkcijata
              calculateStrength(), sto e del od klasata Boxer. Se presmetuva kako proizvod
              na brojot na pobedi, tezinata i godinite podeleno so 3.

    Vlez:     Vo prviot red e brojot na boxeri od lesna kategorija.
              Vo slednite n redovi se vnesuvaat boxerite od lesna kategorija
              (ime, godini, tezina, brojNaPobedi).
              Potoa se vnesuva brojot na boxeri od teska kategorija.
              Vo slednite m redovi se vnesuvaat boxerite od teska kategorija

    Izlez:    Se pecatat dvete listi na boxeri posle napravenata promena.

    Test Primer:

    Vlez:
        3
        Andrej 20 65 4
        Petar 21 58 2
        Ivan 20 68 3
        2
        Ace 20 82 5
        Ljupce 21 87 6
    Izlez:
        Lightweight Boxers:
        Name: Andrej | Age: 20 | Weight: 65 | Number of wins: 4
        Petar 21 58 2
        Ivan 20 68 3
        Heavyweight Boxers:
        Ace 20 82 5
        Ljupce 21 87 6

    Test Primer 2:

    Vlez:
        3
        Andrej 20 83 5
        Petar 21 58 2
        Ivan 20 68 3
        2
        Ljupce 21 87 6
        Ace 20 82 5

    Izlez:
        Lightweight Boxers:
        Petar 21 58 2
        Ivan 20 68 3
        Ace 20 82 5
        Heavyweight Boxers:
        Andrej 20 83 5
        Ljupce 21 87 6

    -----------------------------------------------------------------------------------------

    *Bitno* Kako i za prvata zadaca, potrebno e da gi dodades DLL i DLLNode klasite,
            dali vo istiot java file ili vo poseben ne e bitno.
    *Bitno* Dadena ti e Boxer klasata so site potrebni funkcii, kako i main funkcijata
            za vnes na boxerite i nivno pecatenje.
    *Bitno* Funkcijata ne treba da vrakja nisto (treba da ostane void) i treba da vrsi
            promena na vleznite listi (listite sto se parametri na funkcijata).
    *Bitno* Mozno e da se sluci istiot boxer da se prefrli od ednata lista vo drugata,
            a potoa nazad vo prvata. Dvete operacii se pravat edna po druga.
 */

import java.util.Scanner;

class Boxer{
    String name;
    int age;
    float weight;
    int numberOfWins;

    public Boxer(String name, int age, float weight, int numberOfWins) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.numberOfWins = numberOfWins;
    }

    public float calculateStrength(){
        return age*weight*numberOfWins/3;
    }

    @Override
    public String toString(){
        return String.format("Name: %s | Age: %d | Weight: %.2fkg | Number of wins: %d",name,age,weight,numberOfWins);
    }
}

public class Zadaca2 {
    public static void balanceBoxers(DLL<Boxer> lightWeight, DLL<Boxer> heavyWeight){
        //TODO: your code here
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        DLL<Boxer> lightWeight=new DLL<>();
        for(int i=0;i<n;i++){
            String[] input=scanner.nextLine().split(" ");
            lightWeight.insertLast(new Boxer(input[0],Integer.parseInt(input[1]),Integer.parseInt(input[2]),Integer.parseInt(input[3])));
        }
        int m=Integer.parseInt(scanner.nextLine());
        DLL<Boxer> heavyWeight=new DLL<>();
        for(int i=0;i<m;i++){
            String[] input=scanner.nextLine().split(" ");
            heavyWeight.insertLast(new Boxer(input[0],Integer.parseInt(input[1]),Integer.parseInt(input[2]),Integer.parseInt(input[3])));
        }

        balanceBoxers(lightWeight,heavyWeight);

        System.out.println("Lightweight Boxers:");
        DLLNode<Boxer> current=lightWeight.getFirst();
        while(current!=null){
            System.out.println(current.element);
            current=current.succ;
        }
        System.out.println("Heavyweight Boxers:");
        current=heavyWeight.getFirst();
        while(current!=null){
            System.out.println(current.element);
            current=current.succ;
        }
    }
}
