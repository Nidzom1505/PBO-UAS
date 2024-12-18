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
public class UbahPass extends javax.swing.JFrame {

    /**
     * Creates new form UbahPass
     */
    public UbahPass() {
        initComponents();
        lblPass.setVisible(false);
        btnUbah.setVisible(false);
        tfPass.setVisible(false);
        tfKonfirmasi.setVisible(false);
        lblPeringatan.setVisible(false);
        lblSama.setVisible(false);
        lblTanda.setVisible(false);
        lblBuka.setVisible(false);
        lblBuka1.setVisible(false);
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
        lblBack = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        lblPass = new javax.swing.JLabel();
        btnUbah = new javax.swing.JButton();
        tfPass = new javax.swing.JPasswordField();
        tfKonfirmasi = new javax.swing.JPasswordField();
        lblPeringatan = new javax.swing.JLabel();
        lblSama = new javax.swing.JLabel();
        lblTanda = new javax.swing.JLabel();
        lblBuka = new javax.swing.JLabel();
        lblTutup = new javax.swing.JLabel();
        lblTutup1 = new javax.swing.JLabel();
        lblBuka1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("UBAH");

        lblBack.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblBack.setText("<");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        jLabel2.setText("Username:");

        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });

        btnCari.setText("CARI");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        lblPass.setText("Password:");

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        tfPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassActionPerformed(evt);
            }
        });

        tfKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKonfirmasiActionPerformed(evt);
            }
        });

        lblPeringatan.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblPeringatan.setForeground(new java.awt.Color(255, 0, 51));
        lblPeringatan.setText("Password harus terdiri huruf besar, huruf kecil, angka, dan simbol");

        lblSama.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblSama.setForeground(new java.awt.Color(255, 0, 51));
        lblSama.setText("Password yang dimasukkan tidak sama");

        lblTanda.setText("Konfirmasi:");

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

        lblTutup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/solar--eye-closed-broken.png"))); // NOI18N
        lblTutup1.setText("jLabel5");
        lblTutup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTutup1MouseClicked(evt);
            }
        });

        lblBuka1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS/el--eye-open.png"))); // NOI18N
        lblBuka1.setText("jLabel5");
        lblBuka1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuka1MouseClicked(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCari))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTanda))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPeringatan)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblBuka, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblBuka1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblTutup1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(lblSama)))))
                            .addComponent(lblBack)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnUbah)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCari)
                    .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuka)
                    .addComponent(lblTutup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPeringatan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTanda)
                    .addComponent(lblTutup1)
                    .addComponent(lblBuka1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSama)
                .addGap(33, 33, 33)
                .addComponent(btnUbah)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        LoginAkun y = new LoginAkun();
        y.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        if (tfUser.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Isi Terlebih Dahulu");
        } else {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PBOPU");
            EntityManager em = emf.createEntityManager();

            em.getTransaction().begin();

            String user = tfUser.getText();
            Login y = em.find(Login.class, user);

            if (y == null) {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
                tfUser.requestFocus();
            } else {
                lblPass.setVisible(true);
                btnUbah.setVisible(true);
                tfPass.setVisible(true);
                tfKonfirmasi.setVisible(true);
                tfUser.setEditable(false);
                lblTanda.setVisible(true);
                lblBuka.setVisible(true);
                lblBuka1.setVisible(true);
                tfPass.requestFocus();
            }
            em.getTransaction().commit();
            em.close();
            emf.close();
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        if (tfPass.getText().equals("") && tfKonfirmasi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Cari Terlebih Dahulu");
        } else {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PBOPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            String user, pw;
            user = tfUser.getText();
            pw = tfPass.getText();
            String cek = cekPass(pw);

            if (cek != null) {
                lblPeringatan.setVisible(true);
            } else if (!tfKonfirmasi.getText().equals(pw)) {
                lblSama.setVisible(true);
                lblPeringatan.setVisible(false);
            } else {
                Login x = em.find(Login.class, user);
                x.setUsern(user);
                x.setPassword(pw);
                em.persist(x);

                em.getTransaction().commit();

                JOptionPane.showMessageDialog(null, "Berhasil diubah");

                em.close();
                emf.close();

                LoginAkun y = new LoginAkun();
                y.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnUbahActionPerformed

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

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
        if (tfUser.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Isi username dulu!");
        } else {
            btnCari.doClick();
        }
    }//GEN-LAST:event_tfUserActionPerformed

    private void tfKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKonfirmasiActionPerformed
        if (tfKonfirmasi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Isi terlebih dahulu");
        } else {
            btnUbah.doClick();
        }
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

    private void lblTutup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTutup1MouseClicked
        tfKonfirmasi.setEchoChar('*');
        lblTutup1.setVisible(false);
        lblBuka1.setVisible(true);
    }//GEN-LAST:event_lblTutup1MouseClicked

    private void lblBuka1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuka1MouseClicked
        tfKonfirmasi.setEchoChar((char) 0);
        lblTutup1.setVisible(true);
        lblBuka1.setVisible(false);
    }//GEN-LAST:event_lblBuka1MouseClicked

    private void tfPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassActionPerformed
        if (tfPass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Isi terlebih dahulu");
        } else {
            tfKonfirmasi.requestFocus();
        }
    }//GEN-LAST:event_tfPassActionPerformed

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
            java.util.logging.Logger.getLogger(UbahPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UbahPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UbahPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UbahPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UbahPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBuka;
    private javax.swing.JLabel lblBuka1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPeringatan;
    private javax.swing.JLabel lblSama;
    private javax.swing.JLabel lblTanda;
    private javax.swing.JLabel lblTutup;
    private javax.swing.JLabel lblTutup1;
    private javax.swing.JPasswordField tfKonfirmasi;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
