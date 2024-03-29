/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclodecalvin;
import java.awt.Color;
/**
 *
 * @author 18PROGB0448
 */
public class pagina2 extends javax.swing.JFrame {

    /**
     * Creates new form pagina2
     */
    public pagina2() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(Pagina_inicial.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txainformacion = new javax.swing.JTextArea();
        btnatras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ciclo de Calvin");
        setResizable(false);

        txainformacion.setEditable(false);
        txainformacion.setBackground(new java.awt.Color(204, 255, 255));
        txainformacion.setColumns(20);
        txainformacion.setLineWrap(true);
        txainformacion.setRows(5);
        txainformacion.setText("\nLas plantas usan la energía del Sol en diminutas fábricas de energía llamadas cloroplastos. Usando la clorofila en el proceso de la fotosíntesis, convierten la energía del Sol en una forma almacen able, en moléculas de azúcar ordenadas como la glucosa. De esta manera, el dióxido de carbono del aire y el agua del suelo que están en un estado más desordenado, se combinan para formar moléculas más ordenadas de azúcar.\n\nEl dióxido de carbono es capturado en un ciclo de reacciones conocido como ciclo de Calvin, o ciclo de Calvin-Benson en honor a sus descubridores. \n\nTambién se conoce como simplemente ciclo. Las plantas que utilizan sólo el ciclo de Calvin para la fijación del carbono, se conocen como plantas. El dióxido de carbono se difunda en \nel estroma de los cloroplastos y se combina con un azúcar de cinco carbonos, la ribulosa-1,5-bifosfato.\n\nLa enzima que cataliza esta reacción se conoce como RuBisCo, una gran molécula que puede ser la molécula orgánica más abundante\nen la Tierra. Esta reacción catalizada produce un intermedio de 6 carbonos, que se descompone casi de inmediato para formar dos moléculas del compuesto de 3 carbonos el ácido 3-fosfoglicérico. \nEl hecho de que esta molécula de 3 carbonos sea el primer producto estable de la  fotosíntesis, lleva a la práctica de llamar a  esto el ciclolo.");
        txainformacion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txainformacion);

        btnatras.setBackground(new java.awt.Color(51, 204, 255));
        btnatras.setText("ATRAS");
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnatras)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnatras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
        // TODO add your handling code here:
   
         dispose ();

    }//GEN-LAST:event_btnatrasActionPerformed

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
            java.util.logging.Logger.getLogger(pagina2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagina2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagina2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagina2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagina2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnatras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txainformacion;
    // End of variables declaration//GEN-END:variables
}
