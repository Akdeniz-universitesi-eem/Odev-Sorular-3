/*
 1-100 arasında rastgele sayı türeten ve kullanıcı tarafından tahmin edilmeye çalışan
programı java programı yazınız. Kullanıcı girişlerini Joptionpane.showmessagedialog,
joptionpane.showinputdialog yapılarını kullanınız. (try-catch yapısını kullanınız)
 */
/*
1 -100 arasında rastgele sayı türeten ve kullanıcı tarafından tahmin edilmeye çalışan
programı java programı yazınız. Kullanıcı girişlerini Joptionpane.showmessagedialog,
joptionpane.showinputdialog yapılarını kullanınız. (try-catch yapısını kullanınız)
*/


import javax.swing.JOptionPane;
import java.util.Random;

public class odev3Soru3 {

    public static void main(String[] args) {
        Random random = new Random();

        int rastgeleSayi = random.nextInt(100) + 1;
        int tahmin;

        JOptionPane.showMessageDialog(null, "1 ile 100 arasında bir sayı tuttum. Sayıyı bulmaya çalış");

        do {
            String tahminStr = JOptionPane.showInputDialog("Lütfen tahmininizi girin: ");
            tahmin = Integer.parseInt(tahminStr);

            if (tahmin < rastgeleSayi) {
                JOptionPane.showMessageDialog(null, "Daha büyük bir sayı girin.");
            } else if (tahmin > rastgeleSayi) {
                JOptionPane.showMessageDialog(null, "Daha küçük bir sayı girin.");
            } else {
                JOptionPane.showMessageDialog(null, "Tebrikler doğru tahmin ettiniz!");
            }
        } while (tahmin != rastgeleSayi);
    }
}