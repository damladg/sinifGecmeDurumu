import java.util.Scanner;

public class sinifGecmeDurumu {
    public static void main(String[] args) {
        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //Geçme Notu : 55
        //Ödev
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

        int matematik, fizik, turkce, kimya, muzik;
        int gecmeNotu = 55;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        matematik = scan.nextInt();

        System.out.print("Fizik notunuz :");
        fizik = scan.nextInt();

        System.out.print("Türkçe notunuz :");
        turkce = scan.nextInt();

        System.out.print("Kimya notunuz :");
        kimya = scan.nextInt();

        System.out.print("Müzik notunuz :");
        muzik = scan.nextInt();

        double ortalama = (matematik + fizik + turkce + kimya + muzik) / 5.0 ;

        if (matematik >= 0 && matematik <= 100 && fizik >= 0 && fizik <= 100 && turkce >= 0 && turkce <= 100
                && kimya >= 0 && kimya <= 100 && muzik >= 0 && muzik <= 100) {

            if (ortalama >= 55) {
                System.out.println("Ortalamanız : " + ortalama);
                System.out.println("Geçtiniz!");
            } else {
                System.out.println("Ortalamanız :" + ortalama);
                System.out.println("Kaldınız!");

            }
        }else {
                System.out.println("Geçerli aralıkta ders notu girilmedi. 0-100 arasında not giriniz!");

            }

        }


    }


