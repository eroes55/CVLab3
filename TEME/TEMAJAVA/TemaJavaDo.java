import java.util.Scanner;

public class TemaJavaDo {
    public void MainMenu(){
        int a = 10;
        boolean x = true;
        while (a!=11) {
            if (x) {
                System.out.println("\n\tMeniu\n" +
                        "\n(1) Exercitiu 1 Nivel 1\n" +
                        "\n(2) Exercitiu 2 Nivel 1\n" +
                        "\n(3) Exercitiu 3 Nivel 1\n" +
                        "\n(4) Exercitiu 4 Nivel 1\n" +
                        "\n(5) Exercitiu 1 Nivel 2\n" +
                        "\n(6) Exercitiu 2 Nivel 2\n" +
                        "\n(7) Exercitiu 3 Nivel 2\n" +
                        "\n(8) Exercitiu 4 Nivel 2\n" +
                        "\n(9) Exercitiu 1 Nivel 3\n" +
                        "\n(0) Exercitiu 2 Nivel 3\n" +
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
                    DoEx(1, 2);
                    break;
                case 6:
                    DoEx(2, 2);
                    break;
                case 7:
                    DoEx(3, 2);
                    break;
                case 8:
                    DoEx(4, 2);
                    break;
                case 9:
                    DoEx(1, 3);
                    break;
                case 0:
                    DoEx(2, 3);
                    break;
                case 11:
                    System.out.println("\n\tTerminated\n");
                    break;
                default:
                    System.out.println("\nI/O Invalid\n");
                    break;
            }
            if (a!=11) {
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
                break;
            case 2 :
                if (exercitiu == 1) Ex21();
                if (exercitiu == 2) Ex22();
                if (exercitiu == 3) Ex23();
                if (exercitiu == 4) Ex24();
                break;
            case 3 :
                if (exercitiu == 1) Ex31();
                if (exercitiu == 2) Ex32();
                break;
            default : break;
        }

    }

    public void Ex11(){
        System.out.println("Scrieti un program care sa scrie toate numerele de la 7 la 15.");
        for(int i = 7;i<=15;i++){
            System.out.print(i+" ");
        }
    }
    public void Ex12(){
        System.out.println("Scrieti un program care sa intrebe utilizatorul care e culoarea lui\n" +
                "preferata si sa afiseze:\n" +
                "„Culoarea ta preferata este …”\n");
        Scanner Culoare = new Scanner(System.in);
        String color = Culoare.next();
        System.out.println("Culoarea ta preferata este "+color);
    }
    public void Ex13(){
        System.out.println("Scrieti un program care cere doua numere si afiseaza produsul dintre ele.\n");
        Scanner nr = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int a = nr.nextInt();
        System.out.println("Introduceti al 2-lea numar:");
        int b = nr.nextInt();
        System.out.println("Produsul celor 2 numere este : "+ (a*b));
    }
    public void Ex14(){
        System.out.println("Scrieti un program care cere trei numere si afiseaza produsul dintre ele.");
        Scanner nr = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int a = nr.nextInt();
        System.out.println("Introduceti al 2-lea numar:");
        int b = nr.nextInt();
        System.out.println("Introduceti al 3-lea numar:");
        int c = nr.nextInt();
        System.out.println("Produsul celor 3 numere este:"+(a*b*c));
    }
    public void Ex21(){
        System.out.println("Scrieti un program care aduna numerele de la 1 la 10 si afiseaza suma.");
        int suma = 0;
        for(int i = 1;i<=10;i++){
            suma+=i;
        }
        System.out.println(suma);
    }
    public void Ex22(){
        int suma = 0;
        System.out.println("Scrieti un program care citeste doua numere si aduna toate numerele de la cel mic la cel mare.");
        Scanner nr = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int a = nr.nextInt();
        System.out.println("introduceti un numar mai mare ca "+a+" :");
        int b = nr.nextInt();
        if (b<a){
            System.out.println("I/O invalid");
        }else{
            for(int i =a;i<=b;i++){
                suma+=i;
            }
            System.out.println(suma);
        }
    }
    public void Ex23(){
        System.out.println("Scrieti un program care scrie toate numerele de la 10 la 1");
        for(int i = 0;i<=9;i++){
            System.out.print((10-i)+" ");
        }
    }
    public void Ex24(){
        System.out.println("Scrieti un program care scrie numerele pare de la 1 la 10");
        for(int i = 1;i<=5;i++){
            System.out.print((i*2)+" ");
        }
    }
    public void Ex31(){
        String Sir = "11 12 13 14 15 16 17 18 19 20";
        for(int i = 1;i<=4;i++){
            System.out.println(Sir);
        }
    }
    public void Ex32(){
        int afisare = 10;
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=10;j++){
                System.out.print((afisare+j)+" ");
            }
            System.out.println();
            afisare+=10;
        }
    }

}
