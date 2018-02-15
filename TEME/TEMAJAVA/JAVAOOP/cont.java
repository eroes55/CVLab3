import java.util.Scanner;

public class cont{
    protected int id;
    protected int sold;
    protected String nume;
    public int com;
    public int value;

    public void getInfo(int value){
        int nr=value;
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
    private void setSold(int value){
        if (value>0){
            this.sold=value;
        }else{
            System.out.println("Suma invalida");
        }
    }
    public void Depozitare_Numerar(int value){
        if (value>=0){
            setSold(this.sold+value);
            getInfo(2);
        }else{
            System.out.println("Suma invalida");
        }
    }
    public void Extragere_Sold(int value){
        if (this.sold-value<0){
            System.out.println("Insuficiente fonduri");
        }else{
            setSold(this.sold-value);
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
        int command = comandaIN.nextInt();
        int value = valueIN.nextInt();
        this.com=command;
        this.value=value;
        control(command,value);
    }
}
