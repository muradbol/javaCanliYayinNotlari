import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Selam dünya");


        //değişken stringler
        String ortaMetin ="İlginizi Çekebilir";
        String altMetin = "Vade Süresi";
        System.out.println("Lütfen doların dunki değerini girin");
        Scanner alinandeger=new Scanner(System.in);
        double dolarDun= alinandeger.nextDouble();
        System.out.println("Lütfen doların bugünün değerini girin");
        double dolarBugun= alinandeger.nextDouble();

        System.out.println("deneme");

        System.out.println(ortaMetin);
        //integer kullanımları

        int vade = 12;
       // double dolarDun=17.64;
       // double dolarBugun=17.60;
        if (dolarDun==dolarBugun){
            System.out.println("Dolar dünki kurla aynı");
        }else if (dolarDun>dolarBugun){
            System.out.println("Dolar Düşüşte");
        }else if(dolarDun<dolarBugun){
            System.out.println("Dolar Artışta");
        }

    }
}