import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
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

        //BASİT HESAPLAMALAR

        float a = 10;
        float b = 4;
        float sum = (a+b);
        float dif=(a-b);
        float div =(a/b);
        float mod =(a%b);
        System.out.println("a ve b nin toplamı "+ sum);
        System.out.println("a ve b nin farkı "+ dif);
        System.out.println("a nın b ye bölümü "+div);
        System.out.println("a nın b ye bölümünden kalan "+mod);


        //ÜCGEN ÖDEVİ

        float taban;
        float yukseklik;
        System.out.println("Üçgenin Taban Uzunluğunu Giriniz;");
        taban = input.nextInt();
        System.out.println("Üçgenin Yüksekliğini Giriniz;");
        yukseklik = input.nextInt();
        float ucgenalani=((taban*yukseklik)/2);
        if (taban>=0 && yukseklik>=0)
            System.out.println("Girmiş olduğunuz taban ve yükseklikteki üçgenin alanı;"+(ucgenalani));
        else
            System.out.println("Lütfen Geçerli Sayı Giriniz !");

        //Kullanıcı Giris Ekranı

        String kullaniciAdi = "Yusuf";
        String sifre = "12345";
        System.out.println("Kullanıcı Adı Giriniz: ");
        String girilenKullaniciAdi = input.nextLine();
        System.out.println("Şifrenizi Giriniz: ");
        String girilenSifre = input.nextLine();

        if (girilenKullaniciAdi.equals(kullaniciAdi) && girilenSifre.equals(sifre))
            System.out.println("Giriş Başarılı Hoşgeldiniz "+kullaniciAdi);
        else
            System.out.println("Kullanıcı Adı veya Şifrenizi Kontrol Ediniz !");

    }
}