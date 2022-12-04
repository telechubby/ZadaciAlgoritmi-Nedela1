import java.util.Scanner;

public class ZadacaVtorTermin {
    // 1 3 5 1 3 8 9
    private static void listTransform(DLL<Element> original, int N) {
        //TODO: Your code here
        for(int i=0;i<N;i++){
            Element posleden=original.getLast().element;
            original.deleteLast();
            DLLNode<Element> current=original.getFirst();
            //1 2 3 4
            //5
            int cumulativeSum=0;
            while(current!=null && cumulativeSum+current.element.getId()<=posleden.getId()){
                cumulativeSum+=current.element.getId();
                current=current.succ;
            }
            if(current==null){
                original.insertLast(posleden);
            }
            else{
                original.insertBefore(posleden,current);
            }
        }
        System.out.println(original);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        DLL<Element> list = new DLL<>();

        for (int i = 0; i < num; i++) {
            int n = scanner.nextInt();
            list.insertLast(new Element(n));
        }

        listTransform(list, N);
    }
}