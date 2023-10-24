/*
   abc üç basamaklı bir tamsayıdır ve aşağıdaki koşulları sağlamaktadır:
   koşul 1 cba > abc olacak
   koşul 2 abc asal sayı olacak
   koşul 3 cba asal sayı olacak
   koşul 4 ab asal sayı olacak
   koşul 5 bc asal sayı olacak
   koşul 6 cb asal sayı olacak
   koşul 7 ba asal sayı olacak
   Yukarıdaki koşulların hepsini sağlayan tüm abc sayılarını bulan programı yazınız
    */
/*
abc üç basamaklı bir tamsayıdır ve aşağıdaki koşulları sağlamaktadır:
koşul 1 cba > abc olacak
koşul 2 abc asal sayı olacak
koşul 3 cba asal sayı olacak
koşul 4 ab asal sayı olacak
koşul 5 bc asal sayı olacak
koşul 6 cb asal sayı olacak
koşul 7 ba asal sayı olacak
Yukarıdaki koşulların hepsini sağlayan tüm abc sayılarını bulan programı yazınız.
*/



public class odev3Soru4 {
    public static void main(String[] args) {
        for (int abc = 100; abc <= 999; abc++) {
            int cba = Integer.parseInt(new StringBuilder(String.valueOf(abc)).reverse().toString());
            int ab = abc / 10;
            int bc = abc % 100;
            int cb = cba / 10;
            int ba = cba % 100;

            if (cba > abc && isPrime(abc) && isPrime(cba) && isPrime(ab) && isPrime(bc) && isPrime(cb) && isPrime(ba)) {
                System.out.println(abc);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
