package view;

import javax.swing.JOptionPane;

public class Tela2 extends javax.swing.JFrame {
    public Tela2() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPrincipaisFisicos = new javax.swing.JButton();
        jQuiz = new javax.swing.JButton();
        jGrandesDescobertas = new javax.swing.JButton();
        jFormula = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenInicio = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPrincipaisFisicos.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jPrincipaisFisicos.setText("Principais físicos");
        jPrincipaisFisicos.setToolTipText("Aqui iremos falar um pouco sobre alguns dos físicos que marcaramm a história.");
        jPrincipaisFisicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrincipaisFisicosActionPerformed(evt);
            }
        });
        getContentPane().add(jPrincipaisFisicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 169, 65));

        jQuiz.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jQuiz.setText("Quiz");
        jQuiz.setToolTipText("Descubra se você tem um perfil de um físico com esse teste.");
        jQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuizActionPerformed(evt);
            }
        });
        getContentPane().add(jQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 57, 177, 65));

        jGrandesDescobertas.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jGrandesDescobertas.setText("Grandes descobertas");
        jGrandesDescobertas.setToolTipText("Quais foram as grandes descobertas físicas que marcaram a história?");
        jGrandesDescobertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGrandesDescobertasActionPerformed(evt);
            }
        });
        getContentPane().add(jGrandesDescobertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, -1, 65));

        jFormula.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jFormula.setText("Fórmulas");
        jFormula.setToolTipText("Precisa de ajuda? Aqui mostra as fórmulas mais usadas na física.");
        jFormula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormulaActionPerformed(evt);
            }
        });
        getContentPane().add(jFormula, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 156, 177, 65));

        jLabel1.setText("VERSÃO ALPHA A1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 266, -1, -1));

        jMenuAjuda.setText("Ajuda");
        jMenuAjuda.setToolTipText("AJuda");
        jMenuAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuAjudaMouseReleased(evt);
            }
        });
        jMenuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAjudaActionPerformed(evt);
            }
        });

        jMenuItem1.setText("ajuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItem1);

        jMenuItem4.setText("Problemas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItem4);

        jMenuBar1.add(jMenuAjuda);

        jMenuSobre.setText("Sobre");

        jMenuItem2.setText("Sobre o aplicativo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItem2);

        jMenuBar1.add(jMenuSobre);

        jMenInicio.setText("Início");
        jMenInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenInicioActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Voltar ao início");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenInicio.add(jMenuItem3);

        jMenuBar1.add(jMenInicio);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAjudaActionPerformed
        
    }//GEN-LAST:event_jMenuAjudaActionPerformed

    private void jMenInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenInicioActionPerformed

    }//GEN-LAST:event_jMenInicioActionPerformed

    private void jPrincipaisFisicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrincipaisFisicosActionPerformed
        TelaFisicos tfi= new TelaFisicos();
        this.dispose();
        tfi.setLocationRelativeTo(null);
        tfi.setVisible(true);
    }//GEN-LAST:event_jPrincipaisFisicosActionPerformed

    private void jGrandesDescobertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGrandesDescobertasActionPerformed
        TelaGrDescobertas td= new TelaGrDescobertas();
        this.dispose();
        td.setLocationRelativeTo(null);
        td.setVisible(true);
    }//GEN-LAST:event_jGrandesDescobertasActionPerformed

    private void jFormulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormulaActionPerformed
        TelaFormula tf= new TelaFormula();
        this.dispose();
        tf.setLocationRelativeTo(null);
        tf.setVisible(true);
        
    }//GEN-LAST:event_jFormulaActionPerformed

    private void jQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuizActionPerformed
        //TelaQuiz tq= new TelaQuiz();
        //this.dispose();
        //tq.setLocationRelativeTo(null);
        //tq.setVisible(true);
    }//GEN-LAST:event_jQuizActionPerformed

    private void jMenuAjudaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAjudaMouseReleased

    }//GEN-LAST:event_jMenuAjudaMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Escolha uma das opções abaixo e desfrute de nosso software.");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaLogin tl = new TelaLogin();
        this.dispose();
        tl.setVisible(true);
        tl.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaSOBRE tS = new TelaSOBRE();
        this.dispose();
        tS.setVisible(true);
        tS.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(null, "Para qualquer dúvida neste software, procure o Lucas Ramos do 1º Redes.");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jFormula;
    private javax.swing.JButton jGrandesDescobertas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenInicio;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JButton jPrincipaisFisicos;
    private javax.swing.JButton jQuiz;
    // End of variables declaration//GEN-END:variables
}
