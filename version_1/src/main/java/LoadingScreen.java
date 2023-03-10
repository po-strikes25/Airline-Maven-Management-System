
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shilpi Mazumdar
 */
public class LoadingScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoadingScreen
     */
    public LoadingScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundcolor = new javax.swing.JPanel();
        loadingBar = new javax.swing.JProgressBar();
        loadvalue = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        poweredby = new javax.swing.JLabel();
        InternationalAirlineMavenPortal = new javax.swing.JLabel();
        airplane = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundcolor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        backgroundcolor.add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 480, 20));

        loadvalue.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        loadvalue.setForeground(new java.awt.Color(255, 255, 255));
        loadvalue.setText("0 %");
        backgroundcolor.add(loadvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        loading.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 255));
        loading.setText("Loading ...");
        backgroundcolor.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 410, -1));

        poweredby.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        poweredby.setForeground(new java.awt.Color(255, 255, 255));
        poweredby.setText("Powered by regexSoftCorp");
        backgroundcolor.add(poweredby, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 180, -1));

        InternationalAirlineMavenPortal.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        InternationalAirlineMavenPortal.setForeground(new java.awt.Color(255, 255, 255));
        InternationalAirlineMavenPortal.setText("International Airline Maven Portal");
        backgroundcolor.add(InternationalAirlineMavenPortal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 290, -1));

        airplane.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shilpi Mazumdar\\Desktop\\Acciojob Projects\\Airline Mgmt\\wallpaperflare.com_wallpaper (2) (1).jpg")); // NOI18N
        backgroundcolor.add(airplane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 480, 290));

        getContentPane().add(backgroundcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        LoadingScreen loadingscreen = new LoadingScreen();
        loadingscreen.setVisible(true);
        
        try {
            for(int i = 0 ; i <= 100 ; i++) {
                Thread.sleep(100);
                loadingscreen.loadvalue.setText(i + "%");
                
                if(i == 10) 
                    loadingscreen.loading.setText("Establishing connection with the Management System . . .");
                if(i == 20) 
                    loadingscreen.loading.setText("Loading Passenger Data Files . . .");
                if(i == 30) 
                    loadingscreen.loading.setText("Loading Flight Data Files . . .");
                if(i == 70) 
                    loadingscreen.loading.setText("Connection Successful !");
                if(i == 80) 
                    loadingscreen.loading.setText("Launching Application");
                loadingscreen.loadingBar.setValue(i);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        loadingscreen.setVisible(false);
        MandatoryCheck mandatorycheck = new MandatoryCheck();
        mandatorycheck.setVisible(true);
        loadingscreen.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InternationalAirlineMavenPortal;
    private javax.swing.JLabel airplane;
    private javax.swing.JPanel backgroundcolor;
    private javax.swing.JLabel loading;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadvalue;
    private javax.swing.JLabel poweredby;
    // End of variables declaration//GEN-END:variables
}
