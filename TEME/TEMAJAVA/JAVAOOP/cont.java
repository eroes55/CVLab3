import java.util.Scanner;

public class cont{
    protected int id;
    protected int sold;
    protected String nume;
    public int com;
    public int value;

    public void getInfo(int val){
        int nr=val;
        switch (nr){
            case 1:
                getId();
            case 2:
                getNume();
                getSold();
                break;
            default:
                System.out.println("Neautorizat");
                break;
        }
    }
    private void setSold(int val){
        if (val>0){
            this.sold=val;
        }else{
            System.out.println("Suma invalida");
        }
    }
    public void Depozitare_Numerar(int val){
        if (val>=0){
            setSold(this.sold+val);
            getInfo(2);
        }else{
            System.out.println("Suma invalida");
        }
    }
    public void Extragere_Sold(int val){
        if (this.sold-val<0){
            System.out.println("Insuficiente fonduri");
        }else{
            setSold(this.sold-val);
            getInfo(2);
        }
    }
    public void getId(){
        System.out.println("Contul introdus are id-ul: "+this.id);
    }
    public void getNume(){
        System.out.println("Detinatorul contului se numeste: "+this.nume);
    }
    public void getSold(){
        System.out.println("Si are suma de: "+this.sold);
    }
    public cont(int id,int sold,String nume){
        this.id=id;
        this.sold=sold;
        this.nume=nume;
    }
    public void control(int command,int value){
        if (value>=0){
        switch(this.com) {
            case 1:
                getInfo(value);
                break;
            case 2:
                Depozitare_Numerar(value);
                break;
            case 3:
                Extragere_Sold(value);
                break;
            default:
                System.out.println("Comanda invalida.");
                break;
        }
        }
        else{
            System.out.println("Nice try hakierule.");
        }
    }
    public void GetCommand(){
        Scanner comandaIN = new Scanner(System.in);
        Scanner valueIN = new Scanner(System.in);
        int val=0;
        System.out.println("Introduceti comanda (1-informatie 2-Depozitare 3-Extragere):");
        int command = comandaIN.nextInt();
        if (command==1) {
            System.out.println("1-administrator 2-utilizator 3-strain :");
            val = valueIN.nextInt();
        }else{
            System.out.println("Introduceti o suma :");
            val = valueIN.nextInt();
        }
        this.com=command;
        this.value=val;
        control(command,val);
    }
}
