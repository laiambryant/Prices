/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author liam
 */
public class Me_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Me_Gui
     */
    public Me_GUI() {
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

        InformationTitleLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        File_Menu = new javax.swing.JMenu();
        New_Tab_Menu_Item = new javax.swing.JMenuItem();
        Exit_Tab_Menu_Item = new javax.swing.JMenuItem();
        Info_Menu = new javax.swing.JMenu();
        Info_Menu_Item = new javax.swing.JMenuItem();
        Help_Menu_Item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About me");

        InformationTitleLabel.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        InformationTitleLabel.setText("Who am I? What does this app do?");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Hi, my name is Liam Bryant. \n\nMy github: https://github.com/laiambryant\n\nThis app is made to study the\nbehaviour of markets with one good in various possible\nsituations. Agents are supposed to be price takers.\n\nData calculated will be in a .csv file that will be generated\nJIT so should you want the raw data you have it in the \napplication folder. \n\nYou will also be able to access the images for the graphs\ngenerated in the application folder.\n\nEnjoy!");
        jTextArea2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(jTextArea2);

        File_Menu.setText("File");

        New_Tab_Menu_Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        New_Tab_Menu_Item.setText("New Window");
        New_Tab_Menu_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_Tab_Menu_ItemActionPerformed(evt);
            }
        });
        File_Menu.add(New_Tab_Menu_Item);

        Exit_Tab_Menu_Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Exit_Tab_Menu_Item.setText("Exit");
        Exit_Tab_Menu_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_Tab_Menu_ItemActionPerformed(evt);
            }
        });
        File_Menu.add(Exit_Tab_Menu_Item);

        jMenuBar1.add(File_Menu);

        Info_Menu.setText("?");

        Info_Menu_Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        Info_Menu_Item.setText("Information");
        Info_Menu_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Info_Menu_ItemActionPerformed(evt);
            }
        });
        Info_Menu.add(Info_Menu_Item);

        Help_Menu_Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        Help_Menu_Item.setText("Help");
        Info_Menu.add(Help_Menu_Item);

        jMenuBar1.add(Info_Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InformationTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InformationTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void New_Tab_Menu_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_Tab_Menu_ItemActionPerformed
        new Prices_GUI().setVisible(true);
    }//GEN-LAST:event_New_Tab_Menu_ItemActionPerformed

    private void Exit_Tab_Menu_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_Tab_Menu_ItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exit_Tab_Menu_ItemActionPerformed

    private void Info_Menu_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Info_Menu_ItemActionPerformed
        new Me_GUI().setVisible(true);
    }//GEN-LAST:event_Info_Menu_ItemActionPerformed

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
            java.util.logging.Logger.getLogger(Me_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Me_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Me_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Me_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Me_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit_Tab_Menu_Item;
    private javax.swing.JMenu File_Menu;
    private javax.swing.JMenuItem Help_Menu_Item;
    private javax.swing.JMenu Info_Menu;
    private javax.swing.JMenuItem Info_Menu_Item;
    private javax.swing.JLabel InformationTitleLabel;
    private javax.swing.JMenuItem New_Tab_Menu_Item;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
