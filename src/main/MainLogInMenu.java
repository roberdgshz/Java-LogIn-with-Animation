
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class MainLogInMenu extends javax.swing.JFrame {
    
    private MigLayout layout;
    private PanelCover cover;
    private PanelLoginAndRegister loginAndRegister;
    private boolean isLogin;
    private final double addSize = 30;
    private final double coverSize = 40;
    private final double loginSize = 60;
    private final DecimalFormat df = new DecimalFormat("##0.###");
    public MainLogInMenu() {
        initComponents();
        init();
    }
    
    private void init(){
        layout = new MigLayout("fill, insets 0");
        cover = new PanelCover();
        loginAndRegister = new PanelLoginAndRegister();
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction){
                double fractionCover;
                double fractionLogin;
                double size = coverSize;
                if(fraction <= .5f){
                    size += fraction*addSize;
                }else{
                    size += addSize-fraction*addSize;
                }
                if(isLogin){
                    fractionCover = 1f-fraction;
                    fractionLogin=fraction;
                }else{
                    fractionCover = fraction;
                    fractionLogin = 1f-fraction;
                }
                fractionCover = Double.valueOf(df.format(fractionCover));
                fractionLogin = Double.valueOf(df.format(fractionLogin));
                layout.setComponentConstraints(cover, "width "+size+
                        "%, pos "+fractionCover+"al 0 n 100%");
                layout.setComponentConstraints(loginAndRegister, "width "+
                        loginSize+"%, pos "+fractionLogin+"al 0 n 100%");
                LayeredBackground.revalidate();
            }
            @Override
            public void end(){
                isLogin = !isLogin;
            }
        };
        Animator animator = new Animator(1000,target);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.setResolution(0);
        LayeredBackground.setLayout(layout);
        LayeredBackground.add(cover,"width "+coverSize+"%, pos 0al 0 n 100%");
        LayeredBackground.add(loginAndRegister,"width "+loginSize+"%, pos 1al 0 n 100%");
        cover.addEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                if(!animator.isRunning()){
                    animator.start();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LayeredBackground = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LayeredBackground.setBackground(new java.awt.Color(255, 255, 255));
        LayeredBackground.setOpaque(true);

        javax.swing.GroupLayout LayeredBackgroundLayout = new javax.swing.GroupLayout(LayeredBackground);
        LayeredBackground.setLayout(LayeredBackgroundLayout);
        LayeredBackgroundLayout.setHorizontalGroup(
            LayeredBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1121, Short.MAX_VALUE)
        );
        LayeredBackgroundLayout.setVerticalGroup(
            LayeredBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LayeredBackground, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LayeredBackground, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(MainLogInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLogInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLogInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLogInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLogInMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LayeredBackground;
    // End of variables declaration//GEN-END:variables
}
//<a href="https://es.vecteezy.com/free-png-es/icono-de-correo-electr%C3%B3nico">Icono De Correo Electrónico PNGs por Vecteezy</a>
//<a href="https://es.vecteezy.com/free-png-es/password">Password PNGs por Vecteezy</a>