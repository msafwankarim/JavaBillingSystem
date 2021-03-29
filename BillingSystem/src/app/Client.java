package app;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Client {
    public static void main(String[] args) {

        try {
            // Set cross-platform Java L&F (also called "Metal")
            //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            for (LookAndFeelInfo info:
                 UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getClassName());
            }

            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e) {
            System.out.println(e);
        }

        new LogIn();    //Creates and displayLog In Form

    }
}