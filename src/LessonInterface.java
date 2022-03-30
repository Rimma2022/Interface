import javax.swing.*;
import java.awt.*;

public class LessonInterface {
    public static void main(String[] args) {
        TelegramMessager telegramMessager = new TelegramMessager();
        ViberMessager viberMessager = new ViberMessager();
        telegramMessager.call("+375291581407");
        viberMessager.call("+375333900489");
        telegramMessager.createChat("TelegramChat");
        viberMessager.createChat("ViberChat");

        TestSvingListener testSvingListener = new TestSvingListener();
        JFrame frame = new JFrame();
        JButton buttonOK = new JButton("OK");
        buttonOK.addMouseMotionListener(testSvingListener);
        frame.add(buttonOK);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }
}
