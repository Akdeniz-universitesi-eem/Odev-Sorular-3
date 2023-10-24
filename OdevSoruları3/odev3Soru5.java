/*
Soru 5- Aşağıda açıklanan isPrimeX isimli metodu yazınız
 */
/*
Aşağıda açıklanan isPrimeX isimli metodu yazınız:
isPrimeX metodu içerisinde, gönderilen argumanın asal olup olmadığı test edilecek, eğer
sayı asal ise bu kez sayının basamak değerleri toplanarak elde edilen sayının asal olup
olmadığı test edilecektir. Bu işlem sonuçta tek basamaklı bir sayı kalana kadar devam
edilecektir. Eğer en son elde edilen tek basamaklı sayı dahil tüm sayılar asal ise isPrimeX
metodu true değerine geri dönecektir. Eğer herhangi bir kademede asal olmayan bir sayı
elde edilirse metot false değerine geri dönecektir
*/
import java.util.Scanner;
public class odev3Soru5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        boolean result = isPrimeX(number);
        System.out.println("Sonuç: " + result);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public static boolean isPrimeX(int num) {
        while (num >= 10) {
            if (!isPrime(num)) {
                System.out.println(num + " asal değil.");
                return false;
            }
            System.out.println(num + " asal.");
            num = sumOfDigits(num);
        }
        System.out.println(num);
        return isPrime(num);
    }
}