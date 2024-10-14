import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
//                System.out.println(AppApi.getLocationData("Tokyo"));
//                System.out.println(AppApi.getCurrentTime());
            }
        });
    }
}
