/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opac;

import java.awt.Color;
import javax.swing.Box;

/**
 *
 * @author ADMIN
 */
public class vismis extends javax.swing.JFrame {

    /**
     * Creates new form vismis
     */
    public vismis() {
        initComponents();
        
        lblcopy.setText("Copyright \u00a9 St. Cecilia's College, Inc. All Rights Reserved. ");
        jMenu1.setText("Account");
        jMenuBar1.add(Box.createHorizontalGlue());
        jMenuBar1.add(jMenu1);
        
        tt1.setLineWrap(true);
        tt1.setWrapStyleWord(true);
        
        
        
        tt1.setText("\n" + "Vision" + "\n\n"+ "Saint Cecilia’s College Library System aspires to provide outstanding information resources and services that advance research and learning, support the school’s vision, mission, goals and objectives in producing globally competitive leaders and professionals."
        + "\n\n\n" + "Mission" + "\n\n" + "Saint Cecilia’s College Library System supports and enriches the instructional and research needs of the Cecilian community through the stewardship of scholarly information and the delivery of information services.");  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblopac = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tt1 = new javax.swing.JTextArea();
        lblcopy = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmsearch = new javax.swing.JMenu();
        jmfind = new javax.swing.JMenuItem();
        jmabout = new javax.swing.JMenu();
        jmservices = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmmisvis = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmrules = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 0));
        setMaximumSize(new java.awt.Dimension(700, 621));
        setMinimumSize(new java.awt.Dimension(700, 621));
        getContentPane().setLayout(null);

        lblopac.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        lblopac.setForeground(new java.awt.Color(255, 255, 255));
        lblopac.setText("Online Public Access Catalog");
        lblopac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblopacMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblopacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblopacMouseExited(evt);
            }
        });
        getContentPane().add(lblopac);
        lblopac.setBounds(330, 10, 370, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("- Mission");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 160, 90, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Vision");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 170, 70, 20);

        tt1.setEditable(false);
        tt1.setBackground(new java.awt.Color(255, 255, 204));
        tt1.setColumns(20);
        tt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tt1.setRows(5);
        jScrollPane2.setViewportView(tt1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 210, 570, 280);

        lblcopy.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblcopy.setText("Copyright u00a9 St. Cecilia's College, Inc. All Rights reserved. ");
        lblcopy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcopyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcopyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcopyMouseExited(evt);
            }
        });
        getContentPane().add(lblcopy);
        lblcopy.setBounds(170, 500, 360, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opac/mn7.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 621);

        jmsearch.setForeground(new java.awt.Color(255, 0, 51));
        jmsearch.setText("Search");
        jmsearch.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jmsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmsearchActionPerformed(evt);
            }
        });

        jmfind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jmfind.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jmfind.setForeground(new java.awt.Color(255, 0, 51));
        jmfind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opac/srch.png"))); // NOI18N
        jmfind.setText("Find");
        jmfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmfindActionPerformed(evt);
            }
        });
        jmsearch.add(jmfind);

        jMenuBar1.add(jmsearch);

        jmabout.setForeground(new java.awt.Color(255, 0, 51));
        jmabout.setText("About");
        jmabout.setContentAreaFilled(false);
        jmabout.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jmabout.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jmabout.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jmservices.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jmservices.setForeground(new java.awt.Color(255, 0, 51));
        jmservices.setText("Services");
        jmservices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmservicesActionPerformed(evt);
            }
        });
        jmabout.add(jmservices);
        jmabout.add(jSeparator1);

        jmmisvis.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jmmisvis.setForeground(new java.awt.Color(255, 0, 51));
        jmmisvis.setText("Mission/Vision");
        jmmisvis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmmisvisActionPerformed(evt);
            }
        });
        jmabout.add(jmmisvis);
        jmabout.add(jSeparator2);

        jmrules.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jmrules.setForeground(new java.awt.Color(255, 0, 51));
        jmrules.setText("Rules and Regulation");
        jmrules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmrulesActionPerformed(evt);
            }
        });
        jmabout.add(jmrules);

        jMenuBar1.add(jmabout);

        jMenu1.setForeground(new java.awt.Color(255, 0, 51));
        jMenu1.setText("Account");
        jMenu1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 0, 51));
        jMenuItem1.setText("Sign In");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(255, 0, 51));
        jMenuItem2.setText("Register");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmfindActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Zearch().setVisible(true);
    }//GEN-LAST:event_jmfindActionPerformed

    private void jmsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmsearchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jmsearchActionPerformed

    private void jmservicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmservicesActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new serve().setVisible(true);

    }//GEN-LAST:event_jmservicesActionPerformed

    private void jmmisvisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmmisvisActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new vismis().setVisible(true);

    }//GEN-LAST:event_jmmisvisActionPerformed

    private void jmrulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmrulesActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new rul().setVisible(true);

    }//GEN-LAST:event_jmrulesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new loginn().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new reg().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void lblopacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblopacMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Main().setVisible(true);

    }//GEN-LAST:event_lblopacMouseClicked

    private void lblopacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblopacMouseEntered
        // TODO add your handling code here:
        this.lblopac.setForeground(Color.BLACK);
        this.lblopac.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblopacMouseEntered

    private void lblopacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblopacMouseExited
        // TODO add your handling code here:
        this.lblopac.setForeground(Color.WHITE);
        this.lblopac.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblopacMouseExited

    private void lblcopyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcopyMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lblcopyMouseClicked

    private void lblcopyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcopyMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_lblcopyMouseEntered

    private void lblcopyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcopyMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_lblcopyMouseExited

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
            java.util.logging.Logger.getLogger(vismis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vismis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vismis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vismis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vismis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu jmabout;
    private javax.swing.JMenuItem jmfind;
    private javax.swing.JMenuItem jmmisvis;
    private javax.swing.JMenuItem jmrules;
    private javax.swing.JMenu jmsearch;
    private javax.swing.JMenuItem jmservices;
    private javax.swing.JLabel lblcopy;
    private javax.swing.JLabel lblopac;
    private javax.swing.JTextArea tt1;
    // End of variables declaration//GEN-END:variables
}
