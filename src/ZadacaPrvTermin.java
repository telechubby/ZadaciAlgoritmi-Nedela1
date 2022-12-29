import java.util.Scanner;

class Element {
    private int id;

    public Element(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}

public class ZadacaPrvTermin {
    private static void listTransform(SLL<Element> original) {
        //TODO: Your code
        SLL<Element>[] listi=new SLL[10];
        int numOfElements=(int)Math.floor(original.length()/10);
        int numOfExtraLists=original.length()%10;
        SLLNode<Element> current=original.getFirst();
        for(int i=0;i<10;i++){
            listi[i]=new SLL<>();
            for(int j=0;j<numOfElements;j++){
                listi[i].insertLast(current.element);
                current=current.succ;
            }
            if(i<numOfExtraLists){
                listi[i].insertLast(current.element);
                current=current.succ;
            }
        }
        for(SLL list:listi)
            System.out.println(list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        SLL<Element> list = new SLL<>();
        for (int i = 0; i < num; i++) {
            int n = scanner.nextInt();
            list.insertLast(new Element(n));
        }
        listTransform(list);
    }
}