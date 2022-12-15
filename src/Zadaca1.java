/*
    Zadaca 1: Neka e dadena lista na obleki sto se dostapni vo eden dukjan.
    Da se najde najevtinata obleka od daden tip na obleki i od daden pol (masko ili zensko).
    Dokolku ima poveke takvi obleki so ista cena, da se vrati prvata sto e najdena.
    Dokolku ne postoi takva obleka da se vrati null.


    Vlez: Vo prv red se vnesuva brojot na dostapni obleki vo dukjanot.
    Vo slednite n redovi se vnesuva po edna obleka - ime, tip, pol i cena
    Vo poslednite dva reda se vnesuva tipot i polot za koj prebaruvame

    Izlez: Najevtinata obleka sto e najdena sto e od vneseniot tip i za vneseniot pol

    Test primer:

    Vlez:
    5
    PlavaBluza Bluza Masko 350
    SkinnyFarmerki Pantoloni Zensko 600
    Helanki Pantoloni Zensko 450
    CropTop Bluza Zensko 400
    CargoPantoloni Pantoloni Masko 1000
    Pantoloni
    Zensko

    Izlez:
    Helanki

    ----------------------------------------------------------------------------------------

    *Bitno* Klasata Obleka i main funkcijata se dadeni, treba da ja implementiras
            funkcijata za prebaruvanje. Pecatenjeto e isto taka napraveno vo main kodot,
            samo treba da se vrati objekt od tip DLLNode<Obleka>
    *Bitno* DLL i DLLNode klasite ne se vo ovoj java file, dodadi gi pred ili posle kodot
            ili dodadi gi kako poseben file vo src folderot na proektot
            (vidi slika na messenger)
 */

import java.util.Scanner;

class Obleka{
    String name;
    String type;
    String forSex;
    int price;

    public Obleka(String name, String type, String forSex, int price) {
        this.name = name;
        this.type = type;
        this.forSex = forSex;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class Zadaca1 {

    static DLLNode<Obleka> findBestPricedItem(DLL<Obleka> obleki, String tip, String pol){
        //TODO: your code here
        DLLNode<Obleka> najmal=obleki.getFirst();
        while(najmal!=null){
            if(najmal.element.type.equals(tip) && najmal.element.forSex.equals(pol))
                break;
            najmal=najmal.succ;
        }
        if(najmal==null){
            return null;
        }
        DLLNode<Obleka> current=najmal.succ;
        while (current!=null){
            if(current.element.type.equals(tip) && current.element.forSex.equals(pol) && current.element.price<najmal.element.price)
                najmal=current;
            current=current.succ;
        }
        return najmal;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        DLL<Obleka> obleki=new DLL<>();
        for(int i=0;i<n;i++){
            String[] input=scanner.nextLine().split(" ");
            obleki.insertLast(new Obleka(input[0],input[1],input[2],Integer.parseInt(input[3])));
        }
        String tip=scanner.nextLine();
        String pol=scanner.nextLine();

        DLLNode<Obleka> najevtina=findBestPricedItem(obleki,tip,pol);
        if(najevtina==null)
            System.out.println("Ne postoi obleka so dadenite tip i pol");
        else
            System.out.println(najevtina.element);
    }
}
