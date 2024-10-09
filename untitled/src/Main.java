import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int yas;
//        yas = 25;
//        String isim ;
//        isim = "John";
//        double maas ;
//        maas = 50000 ;
//        System.out.println("Bilgileriniz Şu Şelikdedir ; ");
//        System.out.println("İsminiz : "+isim);
//        System.out.println("Yaşınız : "+yas);
//        System.out.println("Maaşınız : "+maas);
//
//        int dogumYili = 1950 ;
//        int yil = 2024 ;
//
//        System.out.println("Yaşınız: "+ (yil-dogumYili));
//
//        int x;
//        x=10;
//
//        {
//            int y = 10;
//            System.out.println(x+y);
//            System.out.println("x ve y Toplamı = "+ (x+y));
//        }

        //System.out.println("X ve Y toplamı =" + (x+y)); Çalışmaz çünkü y Garbage Collection alanı içindedir//

        //BASİT HESAPLAMALAR

//        float a = 10;
//        float b = 4;
//        float sum = (a+b);
//        float dif=(a-b);
//        float div =(a/b);
//        float mod =(a%b);
//        System.out.println("a ve b nin toplamı "+ sum);
//        System.out.println("a ve b nin farkı "+ dif);
//        System.out.println("a nın b ye bölümü "+div);
//        System.out.println("a nın b ye bölümünden kalan "+mod);


        //ÜCGEN ÖDEVİ

//        float taban;
//        float yukseklik;
//        System.out.println("Üçgenin Taban Uzunluğunu Giriniz;");
//        taban = input.nextInt();
//        System.out.println("Üçgenin Yüksekliğini Giriniz;");
//        yukseklik = input.nextInt();
//        float ucgenalani=((taban*yukseklik)/2);
//        if (taban>=0 && yukseklik>=0)
//            System.out.println("Girmiş olduğunuz taban ve yükseklikteki üçgenin alanı;"+(ucgenalani));
//        else
//            System.out.println("Lütfen Geçerli Sayı Giriniz !");

        //Kullanıcı Giris Ekranı
//
//        String kullaniciAdi = "Yusuf";
//        String sifre = "12345";
//        System.out.println("Kullanıcı Adı Giriniz: ");
//        String girilenKullaniciAdi = input.nextLine();
//        System.out.println("Şifrenizi Giriniz: ");
//        String girilenSifre = input.nextLine();
//
//        if (girilenKullaniciAdi.equals(kullaniciAdi) && girilenSifre.equals(sifre))
//            System.out.println("Giriş Başarılı Hoşgeldiniz "+kullaniciAdi);
//        else
//            System.out.println("Kullanıcı Adı veya Şifrenizi Kontrol Ediniz !");

        //Tip DÖNÜŞÜMÜ
//        int num1 = 5;
//        int num2 = 4;
//        double quotient = (double) num1/num2;
//        System.out.println(quotient);

        //int to str
//        int number = 43;
//        String strNumber = String.valueOf(number);
//
//        System.out.println("integer : "+ number);
//        System.out.println("string : "+ strNumber);

        //str to int
//        String str = "123";
//        int numberStr = Integer.parseInt(str);

        //homeWork

        //Widening
//        int number1 = 34;
//        double number1Double = (double) number1;
//        System.out.println(number1Double);
        //Narrowing
//        double number1 = 44.5;
//        int number1int = (int) number1;
//        System.out.println(number1int);
        // Wrapper Classes
//        Scanner input = new Scanner(System.in);
//        System.out.println("Lütfen bir sayı giriniz: ");
//        String numberLog = input.nextLine();
//        int numberLogInt = Integer.parseInt(numberLog);
//        int test = (numberLogInt+1);
//        System.out.println("sonuc : "+test);

        // IF ELSE AND SWITCH CASE

//        int age = 15;
//        if (age>=18) {
//            System.out.println("yetişkin");
//        } else if (age==15) {
//            System.out.println("yasonbes");
//        } else {
//            System.out.println("cocuk");
//        }


//        String isik = "sari";
//        switch (isik) {
//            case "kirmizi":
//                System.out.println("dur");
//                break;
//            case "sari":
//                System.out.println("hazirlan");
//                break;
//            case "yesil":
//                System.out.println("geç");
//                break;
//        }

        // IF ELSE HOME WORK

        //Sınav Notu Hesaplayıcı
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Lütfen notunuzu giriniz: ");
//        int not = input.nextInt();
//        if (not>=50){
//            System.out.println("Başarılı");
//        } else {
//            System.out.println("Başarısız");
//        }

        // DÖRT İSLEM HESAPLAYICI

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Lütfen İlk Sayıyı Giriniz");
//        double sayi1 = input.nextDouble();
//        System.out.println("Lütfen İkinci Sayıyı Giriniz");
//        double sayi2 = input.nextDouble();
//
//        System.out.println("İşlem Seçiniz : + - / *");
//        String islem = input.next();
//
//        if (islem.equals("+")) {
//            System.out.println("Sonuc = " + (sayi1 + sayi2));
//        } else if (islem.equals("-")) {
//            System.out.println("Sonuc = " + (sayi1 - sayi2));
//        } else if (islem.equals("/")) {
//            System.out.println("Sonuc = " + (sayi1 / sayi2));
//        } else if (islem.equals("*")) {
//            System.out.println("Sonuc = " + (sayi1 * sayi2));
//        } else {
//            System.out.println("Hata");
//        }

        // HAFTANIN GÜNLERİ

//        Scanner input = new Scanner(System.in);
//        System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz:");
//        String logNumber = input.next();
//
//        switch (logNumber){
//            case "1":
//                System.out.println("Pazartesi");
//                break;
//            case "2":
//                System.out.println("Salı");
//                break;
//            case "3":
//                System.out.println("Çarşamba");
//                break;
//            case "4":
//                System.out.println("Perşembe");
//                break;
//            case "5":
//                System.out.println("Cuma");
//                break;
//            case "6":
//                System.out.println("Cumartesi");
//                break;
//            case "7":
//                System.out.println("Pazar");
//                break;
//            default:
//                System.out.println("Hatalı Giriş Yaptınız");
//        }
        // ÜRÜN İNDİRİM HESAPLAYICI

//        Scanner input = new Scanner(System.in);
//        System.out.println("Lütfen Sepet Tutarını Giriniz :");
//        double sepetTutar = input.nextDouble();
//        System.out.println("Sepete Yüzde Kaç İndirim Uygulanacak Giriniz :");
//        double indirimTutar = input.nextDouble();
//
//        if (sepetTutar<1500){
//            System.out.println("Sepet Tutarı Minimum 1500 TL olmalıdır");
//        } else if (indirimTutar>70) {
//            System.out.println("Maksimum %70 İndirim Yapılmaktadır");
//        } else if (sepetTutar>=1500 && indirimTutar<70) {
//            System.out.println("Sepetiniz : "+ ((sepetTutar*indirimTutar)/100));
//        }

        //DÖNGÜLER LOOPS

        //while döngüsü

//        int sayac = 0;
//        while (sayac<=5) {
//            System.out.println("While Sayacı : "+sayac);
//            sayac++;
//        }

        //Do-while döngüsü

//        int sayacDoWhile = 0;
//        do {
//            System.out.println("Do-while sayacı : " +sayacDoWhile);
//            sayacDoWhile++;
//        } while (sayacDoWhile<5);

        // For Döngüsü

//        for (int i=0; i <5 ; i++) {
//            System.out.println("for döngüsü sayac : "+i);
//        }

        //Foreach Döngüsü

//        int[] numbers={1,2,3,4,5,52};
//        for (int num : numbers) {
//            System.out.println("Foreach döngüsü : "+num);
//        }

        // LOOPS HOMEWORK

//        Scanner scanner = new Scanner(System.in);
//        String devamMi;
//
//        do {
//            // Kullanıcıdan bir tam sayı al
//            System.out.print("Çarpım tablosu için bir sayı girin: ");
//            int sayi = scanner.nextInt();
//
//            // Çarpım tablosunu oluştur ve ekrana yazdır
//            for (int i = 1; i <= sayi; i++) {
//                for (int j = 1; j <= sayi; j++) {
//                    System.out.print(i * j +"\t");  // Çarpım işlemi ve düzgün formatlama
//                }
//                System.out.println();  // Bir sonraki satıra geç
//            }
//
//            // Kullanıcıya devam etmek isteyip istemediğini sor
//            System.out.print("Başka bir çarpım tablosu oluşturmak ister misiniz? (evet/hayır): ");
//            devamMi = scanner.next();
//        } while (devamMi.equals("evet"));  // Eğer kullanıcı "evet" derse döngü devam eder
//
//        System.out.println("Program sonlandırıldı.");
//        scanner.close();

        // LISTELER KOLEKSİYONU

//        List<String> isimler = new ArrayList<>();
//        isimler.add("ali");
//        isimler.add("mervem");
//        isimler.add("yusuf");
//        isimler.remove("ali");
//        isimler.remove(1);
//        System.out.println("İsimler Listesi ;");
//        for (String isim : isimler) {
//            System.out.println(isim);
//        }

        //SET KOLEKSİYONU (KÜMELER)

//        Set<Integer> sayilar = new HashSet<>();
//        sayilar.add(10);
//        sayilar.add(20);
//        sayilar.add(50);
//
//        System.out.println("Sayılar Kümesi");
//        for (int sayi : sayilar) {
//            System.out.println(sayi);
//        }

        // MAP KOLEKSİYONU

//        Map<String, String> ulkeler = new HashMap<>();
//        ulkeler.put("TR", "Türkiye");
//        ulkeler.put("DE", "Almanya");
//        ulkeler.put("US", "Amerika");
//
//        System.out.println("Ülkeler :");
//        for (Map.Entry<String, String> entry : ulkeler.entrySet()) {
//            System.out.println(entry.getKey() + "->" + entry.getValue());
//        }

        // TELEFON REHBERİ ÖRNEĞİ

//        Map<String, String> rehber = new HashMap<>();
//        rehber.put("Ahmet","0531");
//        rehber.put("Mehmet","0532");
//        rehber.put("Zeki","0533");
//        rehber.put("Kadir","0534");
//
//        String arananIsim = "Mehmet";
//        if (rehber.containsKey(arananIsim)) {
//            String telefonNumarasi = rehber.get(arananIsim);
//            System.out.println(arananIsim + " adlı kişinin numarası: " +telefonNumarasi);
//        } else {
//            System.out.println(arananIsim + "adlı kişi rehberde bulunamadı.");
//        }

        //SEPET ORNEGİ

//        List<String> sepet = new ArrayList<>();
//        sepet.add("Elma");
//        sepet.add("Süt");
//        sepet.add("Ekmek");
//
//        System.out.println("Sepetteki Ürünler :");
//        for (String urun : sepet) {
//            System.out.println(urun);
//        }


        // MUSTERİ VERİ TABANİ

//        List<String> customers = new ArrayList<>();
//        customers.add("Jhon");
//        customers.add("Frank");
//        customers.add("Charlie");
//
//        System.out.println("Customers ;");
//        for (String customerList : customers) {
//            System.out.println(customerList);
//        }

        // Class Score Calculator

//        List<Integer> scoreList = new ArrayList<>();
//        scoreList.add(50);
//        scoreList.add(80);
//        scoreList.add(75);
//        scoreList.add(40);
//        scoreList.add(24);
//
//        System.out.println("Score List;");
//        System.out.println(scoreList);
//
//        int sum =0;
//
//        for(int num : scoreList) {
//            sum = sum + num ;
//        }
//        System.out.println("toplam : "+ sum);
//        System.out.println("ortalama : "+ (sum/scoreList.size()));

        // Otel Rezerversyonu

//        Scanner input = new Scanner(System.in);
//
//        Map<String, String> odalar = new HashMap<>();
//        odalar.put("Oda 1", "Dolu");
//        odalar.put("Oda 2", "Dolu");
//        odalar.put("Oda 3", "Boş");
//        odalar.put("Oda 4", "Dolu");
//        odalar.put("Oda 5", "Boş");
//
//        System.out.println("Lütfen Bir Oda Seçiniz");
//        String secilenOda = input.nextLine();
//        System.out.println(secilenOda);
//
//        if (odalar.containsKey(secilenOda)) {
//            String musaitlik = odalar.get(secilenOda);
//            System.out.println(secilenOda + " Durumu "+ musaitlik);
//        } else {
//            System.out.println("Böyle bir oda bulunmamaktadır");
//        }

        // Sözlük Sistemi
//
//        Scanner input = new Scanner(System.in);
//
//        Map<String, String> kelimeler = new HashMap<>();
//        kelimeler.put("selam", "hi");
//        kelimeler.put("merhaba", "hello");
//        kelimeler.put("ben", "I");
//        kelimeler.put("benim", "mine");
//        kelimeler.put("sen", "you");
//        kelimeler.put("gel", "come");
//
//        System.out.println("Bir Kelime giriniz");
//        String girilenKelime = input.next();
//
//        if (kelimeler.containsKey(girilenKelime)) {
//            String ceviri = kelimeler.get(girilenKelime);
//            System.out.println(girilenKelime+" means "+ceviri);
//        } else {
//            System.out.println("Girdiğiniz kelimenin henüz bir çevirisi yok");
//        }

    }
}