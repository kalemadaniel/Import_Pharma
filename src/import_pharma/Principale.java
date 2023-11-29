/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package import_pharma;

import import_pharma.classes.clsFile;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Principale extends javax.swing.JFrame {

    clsFile fl = new clsFile();

    /**
     * Creates new form Principale
     */
    public Principale() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        datefin = new org.jdesktop.swingx.JXDatePicker();
        datedebut = new org.jdesktop.swingx.JXDatePicker();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Selectionner");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 274, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText(".\\\\data.csv");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 270, 30));

        jButton3.setText("Supprimer les données");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, -1));

        jButton2.setText("Charger depuis le fichier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 180, -1));

        jButton6.setText("1. Inseré les lignes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 180, -1));

        jButton5.setText("2. Completer les infos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 180, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Importer via un fichier CSV de la pharmacie et retrouver la consommation");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setText("5. Alimenter les données de la table structuré ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("B. Imprimer le rapport");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 170, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("1. Creer un fichier Csv de l'export CERHIS avec 6 champs respective (`cEVT_ID`, `cEVT_Date`, `cCHP_VAL_Alpha`,  ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel6.setText("2. Importer le fichier  ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel7.setText("3. Vider les tables des données  ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel8.setText("4. Charger les données du fichier CSV vers la table des données temporaire  ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("A. Importation des données");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, 20));
        jPanel1.add(datefin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 180, 30));
        jPanel1.add(datedebut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 180, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Au :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 40, 30));

        jLabel11.setText("Du :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 30, 30));

        jButton4.setText("Rapport synthèse");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 150, -1));

        jButton7.setText("Total par produit par date");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 170, 30));

        jButton8.setText("Rapport detaillé");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 150, -1));

        jButton9.setText("Consommation par date");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 170, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setText(" `cCHP_VAL_Num`, `cCHP_VAL_Memo`, `cCHP_Code`, `cPAT_Famille`, `cPAT_Nom`, `cPAT_Prenom`, `cPAT_Genre`, `cPAT_Ddn`)");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 86, 790, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clsFile fil = new clsFile();
        jTextField1.setText(fil.choixFichier());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            fl.suprimer("tb_tempo");
            fl.suprimer("tb_mvt");
        } catch (SQLException ex) {
            Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Suppression réussie ");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Selectionner le fichier des données avant SVP ! ");
        } else {
            fl.loarddata();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            fl.parcourirtableQtePrs();
        } catch (Exception ex) {
            Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        fl.insertdata();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (datedebut.getDate() == null || datefin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner la date de début et la date limite \n S'il vous plaît");
        } else {
            try {
                // Imprimer la liste des prescriptions et dispensation
                java.sql.Date dts = new java.sql.Date(datedebut.getDate().getYear(), datedebut.getDate().getMonth(), datedebut.getDate().getDate());
                java.sql.Date dst = new java.sql.Date(datefin.getDate().getYear(), datefin.getDate().getMonth(), datefin.getDate().getDate());
                fl.EtatSortie("SELECT produit , SUM(qte_disp) AS tot from tb_mvt WHERE date_dis BETWEEN '" + dts + "' AND '" + dst + "' GROUP BY produit ORDER BY produit", "conso_tot");
            } catch (Exception ex) {
                Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Total par date par produit
        if (datedebut.getDate() == null || datefin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner la date de début et la date limite \n S'il vous plaît");
        } else {
            try {
                // Imprimer la liste 
                java.sql.Date dts = new java.sql.Date(datedebut.getDate().getYear(), datedebut.getDate().getMonth(), datedebut.getDate().getDate());
                java.sql.Date dst = new java.sql.Date(datefin.getDate().getYear(), datefin.getDate().getMonth(), datefin.getDate().getDate());
                fl.EtatSortie("SELECT date_dis,produit , SUM(qte_disp) AS tot FROM tb_mvt WHERE date_dis BETWEEN '" + dts + "' AND '" + dst + "' GROUP BY date_dis,produit ORDER BY date_dis,produit", "rap_parproddate");
            } catch (Exception ex) {
                Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         if (datedebut.getDate() == null || datefin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner la date de début et la date limite \n S'il vous plaît");
        } else {
            try {
                // Imprimer la liste 
                java.sql.Date dts = new java.sql.Date(datedebut.getDate().getYear(), datedebut.getDate().getMonth(), datedebut.getDate().getDate());
                java.sql.Date dst = new java.sql.Date(datefin.getDate().getYear(), datefin.getDate().getMonth(), datefin.getDate().getDate());
                fl.EtatSortie("SELECT * FROM tb_mvt WHERE date_dis BETWEEN '" + dts + "' AND '" + dst + "' ORDER BY date_dis", "rapport");
            } catch (Exception ex) {
                Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if (datedebut.getDate() == null || datefin.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner la date de début et la date limite \n S'il vous plaît");
        } else {
            try {
                // Imprimer la liste 
                java.sql.Date dts = new java.sql.Date(datedebut.getDate().getYear(), datedebut.getDate().getMonth(), datedebut.getDate().getDate());
                java.sql.Date dst = new java.sql.Date(datefin.getDate().getYear(), datefin.getDate().getMonth(), datefin.getDate().getDate());
                fl.EtatSortie("SELECT * FROM tb_mvt WHERE date_dis BETWEEN '" + dts + "' AND '" + dst + "' ORDER BY date_dis,produit", "rap_pardate");
            } catch (Exception ex) {
                Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker datedebut;
    private org.jdesktop.swingx.JXDatePicker datefin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
