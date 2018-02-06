import java.util.Random;
import java.util.Scanner;
public class TemaJavaSup {
    public void MainMenu() {
        int a = 10;
        boolean x = true;
        while (a != 11) {
            if (x) {
                System.out.println("\n\tMeniu\n" +
                        "\n(1) Exercitiu 1 Nivel 1\n" +
                        "\n(2) Exercitiu 2 Nivel 1\n" +
                        "\n(3) Exercitiu 3 Nivel 1\n" +
                        "\n(4) Exercitiu 4 Nivel 1\n" +
                        "\n(5) Exercitiu 5 Nivel 1\n" +
                        "\n(11) Terminarea programului\n");
            }
            x = false;
            Scanner NrEx = new Scanner(System.in);
            System.out.println("Introduceti numarul exercitiului : ");
            a = NrEx.nextInt();

            switch (a) {
                case 1:
                    DoEx(1, 1);
                    break;
                case 2:
                    DoEx(2, 1);
                    break;
                case 3:
                    DoEx(3, 1);
                    break;
                case 4:
                    DoEx(4, 1);
                    break;
                case 5:
                    DoEx(5, 1);
                    break;
                default:
                    System.out.println("\nI/O Invalid\n");
                    break;
            }
            if (a != 11) {
                System.out.println("\nShow menu agian? (1) = yes , (0) = no\n");
                a = NrEx.nextInt();
                if (a == 1) {
                    x = true;
                }
            }
        }
    }
        public void DoEx(int exercitiu, int nivel){
            switch (nivel){
                case 1 :
                    if (exercitiu == 1) Ex11();
                    if (exercitiu == 2) Ex12();
                    if (exercitiu == 3) Ex13();
                    if (exercitiu == 4) Ex14();
                    if (exercitiu == 5) Ex15();
                    break;
                default : break;
            }

        }
        public void Ex11(){
            Scanner NrEx = new Scanner(System.in);
            System.out.println("Introduceti latimea : ");
            int a = NrEx.nextInt();
            System.out.println("Introduceti lungimea : ");
            int b = NrEx.nextInt();
            System.out.println("Aria triunghiului este :"+Ex11F1(a,b));
            System.out.println("Perimetrul triunghiului este :"+Ex11F2(a,b));
        }
        public int Ex11F1(int a, int b){
            return (a*b);
        }
        public int Ex11F2(int a, int b){
            return (2*a+2*b);
        }


        public void Ex12(){
            int max=10;
            int min=1;
            Random randomNum = new Random();
            int Ghiceste = min+randomNum.nextInt(max);
            Scanner Nr = new Scanner(System.in);
            int x = Nr.nextInt();
            boolean test = false;
            while (!test) {
                if (x < Ghiceste) {
                    System.out.println("Numarul introdus este mai mic");
                    x = Nr.nextInt();
                } else if (x > Ghiceste){
                    System.out.println("Numarul introdus este mai mare");
                    x = Nr.nextInt();
                } else {
                    System.out.println("Correct");
                    test = true;
                }
            }
        }


        public void Ex13(){
        String printare = "##########";
        for (int i = 1 ;i <=5; i++){
            System.out.println(printare);
        }
        }


        public void Ex14(){
            Scanner Nr = new Scanner(System.in);
            System.out.println("Introduceti nr de coloane");
            int x = Nr.nextInt();
            System.out.println("Introduceti nr de randuri");
            int y = Nr.nextInt();
            for(int i = 1;i<=x;i++){
                for(int j = 1;j<=y;j++){
                    System.out.print("#");
                }
                System.out.println();
            }
        }

        public void Ex15(){
            Scanner nr = new Scanner(System.in);
            System.out.println("Cate randuri?");
            int a = nr.nextInt();
            for (int i = 1;i<a;i++){
                for(int j = 1; j<=i;j++){
                    System.out.print(j);
                }
                System.out.println("");
            }
        }
    }

