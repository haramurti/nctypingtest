import java.util.concurrent.TimeUnit;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;


public class Wpmtracker {
    static String[] words ={"makan", "ikan", "lalu", "air", "buku", "cina", "dalam", "emas", "fajar", "gajah", "hutan", "indah", "jalan", "kuda", "laut", "mimpi", "nasi", "olah", "pagi", "rumah", "sapi", "taman", "ular", "warna", "yakin", "zebra", "ayam", 
    "bebek", "cerah", "daun", "elang", "film", "gigi", "hati", "ilmu", "jas", "kaca", "langit", "muda", "nasib", "obat", "pohon", "ruang", "sayur", "tanah", "udara", "waktu", "yatim"};

    public static void main (String [] args) throws InterruptedException {

        System.out.println("5");
        TimeUnit.SECONDS.sleep(1);
        
        System.out.println("4");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random r = new Random();
        for (int i=0; i<12; i++ ){
        System.out.print(words[r.nextInt(48)]+ " ");
        }
        System.out.println();// typing order gaved 
        System.out.println('\n');
        System.out.println('\n');
        double start = LocalTime.now().toNanoOfDay(); //after i print out the words to follow ,this local stop watch will start until i pressed eneter

        Scanner sc = new Scanner(System.in);
        String typing = sc.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elapsed =  end - start;
        double sec= elapsed / 1000000000.0;
        int number =typing.length();
        System.out.println(sec);
        
        int wpm =(int)((((double)number/5) / sec)*60);
        System.out.print("WPM=" +wpm);
    }
}