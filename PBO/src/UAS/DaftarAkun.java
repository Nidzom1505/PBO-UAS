/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UAS;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Nidzzz
 */
public class DaftarAkun extends javax.swing.JFrame {

    /**
     * Creates new form DaftarAkun
     */
    public DaftarAkun() {
        initComponents();
        lblPeringatan.setVisible(false);
        lblSama.setVisible(false);
        lblTutup.setVisible(false);
        lblTutup1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBuat = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();
        lblPeringatan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSama = new javax.swing.JLabel();
        tfKonfirmasi = new javax.swing.JPasswordField();
        tfPass = new javax.swing.JPasswordField();
        lblBuka = new javax.swing.JLabel();
        lblTutup = new javax.swing.JLabel();
        lblBuka1 = new javax.swing.JLabel();
        lblTutup1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username:");

        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });

        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("DAFTAR");

        btnBuat.setText("BUAT");
        btnBuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuatActionPerformed(evt);
            }
        });

        lblBack.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblBack.setText("<");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        lblPeringatan.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblPeringatan.setForeground(new java.awt.Color(255, 0, 51));
        lblPeringatan.setText("Password harus terdiri huruf besar, huruf kecil, angka, dan simbol");

        jLabel4.setText("Konfirmasi:");

        lblSama.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblSama.setForeground(new java.awt.Color(255, 0, 51));
        lblSama.setText("Password yang dimasukkan tidak sama");

        tfKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKonfirmasiActionPerformed(evt);
            }
        });

        tfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassActionPerformed(evt);
            }
        });

        lblBuka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/el--eye-open.png"))); // NOI18N
        lblBuka.setText("jLabel5");
        lblBuka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBukaMouseClicked(evt);
            }
        });

        lblTutup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/solar--eye-closed-broken.png"))); // NOI18N
        lblTutup.setText("jLabel5");
        lblTutup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTutupMouseClicked(evt);
            }
        });

        lblBuka1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/el--eye-open.png"))); // NOI18N
        lblBuka1.setText("jLabel5");
        lblBuka1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuka1MouseClicked(evt);
            }
        });

        lblTutup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/solar--eye-closed-broken.png"))); // NOI18N
        lblTutup1.setText("jLabel5");
        lblTutup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTutup1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tfKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTutup1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBuka1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfUser, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(tfPass))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBuka, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblPeringatan))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnBuat))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lblSama)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTutup)
                        .addComponent(lblBuka)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPeringatan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuka1)
                    .addComponent(lblTutup1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSama)
                .addGap(34, 34, 34)
                .addComponent(btnBuat)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String cekPass(String password) {
        if (password.length() < 8) {
            return "Password minimal 8 karakter.";
        }
        if (!password.matches(".*[A-Z].*")) {
            return "Password harus mengandung minimal satu huruf besar.";
        }
        if (!password.matches(".*[a-z].*")) {
            return "Password harus mengandung minimal satu huruf kecil.";
        }
        if (!password.matches(".*[0-9].*")) {
            return "Password harus mengandung minimal satu angka.";
        }
        if (!password.matches(".*[!@#$%^&(),.?\\\":{}|<>].*")) {
            return "Password harus mengandung minimal satu simbol.";
        }
        return null;
    }

    private void btnBuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatActionPerformed
        String user, pw;
        user = tfUser.getText();
        pw = tfPass.getText();

        if (tfUser.getText().equals("") || tfPass.getText().equals("") || tfKonfirmasi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Isi semua data");
        } else {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PBOPU");
            EntityManager em = emf.createEntityManager();
            Login y = em.find(Login.class, user);
            if (y != null) {
                JOptionPane.showMessageDialog(null, "Username sudah ada, gunakan username lain");
                bersih();
                tfUser.requestFocus();
            } else {
                String cek = cekPass(pw);
                if (cek != null) {
                    lblPeringatan.setVisible(true);
                } else if (!tfKonfirmasi.getText().equals(pw)) {
                    lblSama.setVisible(true);
                    lblPeringatan.setVisible(false);
                } else {
                    em.getTransaction().begin();
                    Login x = new Login();
                    x.setUsern(user);
                    x.setPassword(pw);
                    em.persist(x);
                    em.getTransaction().commit();

                    JOptionPane.showMessageDialog(null, "Sukses dibuat");
                    bersih();

                    LoginAkun z = new LoginAkun();
                    z.setVisible(true);
                    this.dispose();

                    em.close();
                    emf.close();
                }
            }
        }
    }//GEN-LAST:event_btnBuatActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        LoginAkun y = new LoginAkun();
        y.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
        if (tfUser.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Isi terlebih dahulu");
        } else {
            tfPass.requestFocus();
        }
    }//GEN-LAST:event_tfUserActionPerformed

    private void tfKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKonfirmasiActionPerformed
        btnBuat.doClick();
    }//GEN-LAST:event_tfKonfirmasiActionPerformed

    private void lblBukaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBukaMouseClicked
        tfPass.setEchoChar((char) 0);
        lblTutup.setVisible(true);
        lblBuka.setVisible(false);
    }//GEN-LAST:event_lblBukaMouseClicked

    private void lblTutupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTutupMouseClicked
        tfPass.setEchoChar('*');
        lblTutup.setVisible(false);
        lblBuka.setVisible(true);
    }//GEN-LAST:event_lblTutupMouseClicked

    private void lblBuka1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuka1MouseClicked
        tfKonfirmasi.setEchoChar((char) 0);
        lblTutup1.setVisible(true);
        lblBuka1.setVisible(false);
    }//GEN-LAST:event_lblBuka1MouseClicked

    private void lblTutup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTutup1MouseClicked
        tfKonfirmasi.setEchoChar('*');
        lblTutup1.setVisible(false);
        lblBuka1.setVisible(true);
    }//GEN-LAST:event_lblTutup1MouseClicked

    private void tfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassActionPerformed
        if (tfPass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Isi terlebih dahulu");
        } else {
            tfKonfirmasi.requestFocus();
        }
    }//GEN-LAST:event_tfPassActionPerformed

    public void bersih() {
        tfUser.setText("");
        tfPass.setText("");
    }

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
            java.util.logging.Logger.getLogger(DaftarAkun.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarAkun.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarAkun.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarAkun.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarAkun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBuka;
    private javax.swing.JLabel lblBuka1;
    private javax.swing.JLabel lblPeringatan;
    private javax.swing.JLabel lblSama;
    private javax.swing.JLabel lblTutup;
    private javax.swing.JLabel lblTutup1;
    private javax.swing.JPasswordField tfKonfirmasi;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
