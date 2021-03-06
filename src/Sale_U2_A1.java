/* Hildana.M
 * Sale_U2_A1.java
 * This program calculates the discount for prices over $10
 * March/23/2018
 */

import java.text.DecimalFormat;
public class Sale_U2_A1 extends javax.swing.JFrame {

    /**
     * Creates new form Sale_U2_A1
     */
    public Sale_U2_A1() {
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

        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelAmount = new javax.swing.JLabel();
        textEnterAmount = new javax.swing.JTextField();
        buttonCalculate = new javax.swing.JButton();
        labelDiscountAmount = new javax.swing.JLabel();
        labelDiscountPrice = new javax.swing.JLabel();
        textDiscountAmount = new javax.swing.JTextField();
        textDiscountPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTitle.setText("$uper $tore $ale");

        labelAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelAmount.setText("Amount of Purchases:");

        textEnterAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textEnterAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEnterAmountActionPerformed(evt);
            }
        });

        buttonCalculate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonCalculate.setText("Calculate");
        buttonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateActionPerformed(evt);
            }
        });

        labelDiscountAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelDiscountAmount.setText("Discount Amount:");

        labelDiscountPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelDiscountPrice.setText("Discounted Price");

        textDiscountAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        textDiscountPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(labelTitle))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelDiscountPrice)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDiscountAmount)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelAmount)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textEnterAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textDiscountPrice)
                        .addComponent(buttonCalculate, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textDiscountAmount)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAmount)
                    .addComponent(textEnterAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(buttonCalculate)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDiscountAmount)
                    .addComponent(textDiscountAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDiscountPrice)
                    .addComponent(textDiscountPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textEnterAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEnterAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEnterAmountActionPerformed

    private void buttonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateActionPerformed
      
      double numAmount,discountAmount, discountPrice; //declaring varable 
      
      //convert string to double 
      numAmount = Double.parseDouble (textEnterAmount.getText());
      
      //if the amount entered is greater than 10, than apply discount
      if (numAmount >= 10)
      {
          discountAmount = numAmount*0.10; // discount amount 
          discountPrice = numAmount - discountAmount; //final price 
          
          //round to 2 decimal place
          DecimalFormat round = new DecimalFormat ("###.##"); 
          
          //display the discont amount and the final discounted price 
          textDiscountAmount.setText("$" + round.format (discountAmount));
          textDiscountPrice.setText("$" + round.format (discountPrice));
      } 
      else //else don't apply the discount
      {
          //display that no dicount amount was applied to price
          textDiscountAmount.setText("$ 0.00");
          
          //display the amount entered without discount 
          textDiscountPrice.setText("$" + numAmount);
      }
        
        
        
        
        
        
    }//GEN-LAST:event_buttonCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(Sale_U2_A1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale_U2_A1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale_U2_A1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale_U2_A1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale_U2_A1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalculate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAmount;
    private javax.swing.JLabel labelDiscountAmount;
    private javax.swing.JLabel labelDiscountPrice;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField textDiscountAmount;
    private javax.swing.JTextField textDiscountPrice;
    private javax.swing.JTextField textEnterAmount;
    // End of variables declaration//GEN-END:variables
}
