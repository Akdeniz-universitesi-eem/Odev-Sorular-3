
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class odev3Soru2 extends JFrame {

    //Erişim belirleyicileri
    private JLabel diceLabel1, diceLabel2;
    private JButton rollButton;
    private Random randomGenerator;
    private String imagePath = "C:\\javademos\\ElifAydin\\odev3Soru2\\src";

    public odev3Soru2() {
        // Pencere başlığını ayarla
        super("Zar Atma Oyunu");

        // Random nesnesini oluştur
        randomGenerator = new Random();

        // Zar etiketlerini ve atma butonunu oluştur
        diceLabel1 = new JLabel(new ImageIcon(imagePath + ".png"));
        diceLabel2 = new JLabel(new ImageIcon(imagePath + ".png"));
        rollButton = new JButton("Zar At");

        // Butona tıklanınca ne olacağını ayarla
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rollDice();
            }
        });

        // Pencere düzenini ayarla ve bileşenleri ekle
        setLayout(new FlowLayout());
        add(diceLabel1);
        add(diceLabel2);
        add(rollButton);

        // Pencereyi kapatınca programı sonlandır
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Pencere boyutunu ayarla
        setSize(300, 200);
        // Pencereyi görünür yap
        setVisible(true);
    }

    private void rollDice() {
        // 1 ile 6 arasında rastgele sayılar üret
        int number1 = randomGenerator.nextInt(6) + 1;
        int number2 = randomGenerator.nextInt(6) + 1;
        // Zar resimlerini güncelle
        diceLabel1.setIcon(new ImageIcon(imagePath + number1 + ".png"));
        diceLabel2.setIcon(new ImageIcon(imagePath + number2 + ".png"));
    }

    public static void main(String[] args) {
        // Pencereyi oluştur ve göster
        new odev3Soru2();
}
}