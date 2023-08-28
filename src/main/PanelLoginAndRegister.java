
package main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;


public class PanelLoginAndRegister extends javax.swing.JLayeredPane {

    public PanelLoginAndRegister() {
        initComponents();
        initRegister();
        initLogin();
        loginPanel.setVisible(false);
        registerPanel.setVisible(true);
    }

    private void initRegister(){
        registerPanel.setLayout(new MigLayout("wrap","push[center]push", ""));
        JLabel label = new JLabel("Create Account");
        label.setFont(new Font("sansserif",1,30));
        label.setForeground(new Color(7,164,121));
        registerPanel.add(label);
        MyTextField txtUser = new MyTextField();
        //txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("C:\\Users\\lalo_\\Desktop\\JAVALogIn&Register\\Sample_User_Icon.png")));
    }
    
    private void initLogin(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        registerPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new java.awt.CardLayout());

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(loginPanel, "card3");

        registerPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(registerPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel registerPanel;
    // End of variables declaration//GEN-END:variables
}
