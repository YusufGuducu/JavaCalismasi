//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int yas;
        yas = 25;
        String isim ;
        isim = "John";
        double maas ;
        maas = 50000 ;
        System.out.println("Bilgileriniz Şu Şelikdedir ; ");
        System.out.println("İsminiz : "+isim);
        System.out.println("Yaşınız : "+yas);
        System.out.println("Maaşınız : "+maas);

        int dogumYili = 1950 ;
        int yil = 2024 ;

        System.out.println("Yaşınız: "+ (yil-dogumYili));

        int x;
        x=10;

        {
            int y = 10;
            System.out.println(x+y);
            System.out.println("x ve y Toplamı = "+ (x+y));
        }

        //System.out.println("X ve Y toplamı =" + (x+y)); Çalışmaz çünkü y Garbage Collection alanı içindedir//

    }
}