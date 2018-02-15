import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        cont Cont = new cont(1,5500,"Valica");
        int a = 1;
        Scanner scan = new Scanner(System.in);
        while (a!=0) {
            Cont.GetCommand();
            System.out.println("Pentru a te opri apasa 0 si enter");
            a=scan.nextInt();
        }
    }
}
