import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Selam dünya");
        System.out.println("Lütfen doların dunki değerini girin");
        //Scanner kullanıcıdan değer almak için kullandığımız parametre
        Scanner alinandeger=new Scanner(System.in);
        double dolarDun= alinandeger.nextDouble();
        System.out.println("Lütfen doların bugünün değerini girin");
        double dolarBugun= alinandeger.nextDouble();
        //integer kullanımları
        if (dolarDun==dolarBugun){
            System.out.println("Dolar dünki kurla aynı");
        }else if (dolarDun>dolarBugun){
            System.out.println("Dolar Düşüşte");
        }else if(dolarDun<dolarBugun){
            System.out.println("Dolar Artışta");
        }

    }
}