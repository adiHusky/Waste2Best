/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SupplierRole;

import business.models.Product.Seed;
import enterprise.Enterprise;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class NewSeedJPanel extends javax.swing.JPanel {
    private final Enterprise enterprise;
    private final JPanel userProcessContainer;
    
    NewSeedJPanel(Enterprise enterprise, JPanel userProcessContainer) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        quantityTxt = new javax.swing.JTextField();
        typeTxt = new javax.swing.JTextField();
        seedBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        seedNameError = new javax.swing.JLabel();
        seedTypeError = new javax.swing.JLabel();
        priceError = new javax.swing.JLabel();
        quantityError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Price/Unit");

        jLabel3.setText("Quantity");

        jLabel4.setText("Seed Type");

        jLabel5.setText("Seed Name");

        nameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTxtFocusLost(evt);
            }
        });

        priceTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                priceTxtFocusLost(evt);
            }
        });

        quantityTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityTxtFocusLost(evt);
            }
        });

        typeTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                typeTxtFocusLost(evt);
            }
        });

        seedBtn.setBackground(new java.awt.Color(153, 204, 255));
        seedBtn.setText("Add Seed");
        seedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seedBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(153, 204, 255));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Create new Seed");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(296, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(seedNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(467, 467, 467))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(quantityError, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(seedBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addComponent(seedTypeError, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addComponent(priceError, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seedNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(priceError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(quantityError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seedTypeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(seedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void seedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seedBtnActionPerformed
       if(nameTxt.getText().equals("") || priceTxt.getText().equals("") || quantityTxt.getText().equals("") || typeTxt.getText().equals("")){
           JOptionPane.showMessageDialog(userProcessContainer, "One or more fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
       } else if(!seedNameError.getText().isEmpty() || !seedTypeError.getText().isEmpty() || !priceError.getText().isEmpty() || !quantityError.getText().isEmpty()){
           JOptionPane.showMessageDialog(userProcessContainer, "One or more fields are Invalid", "Error", JOptionPane.ERROR_MESSAGE);
       } else{
        Seed seed = (Seed) enterprise.getProductDirectory().createProduct("seed");
        seed.setName(nameTxt.getText());
        seed.setPrice(Double.parseDouble(priceTxt.getText()));
        seed.setQuantity(Integer.parseInt(quantityTxt.getText()));
        seed.setType(typeTxt.getText());
        seed.setProductType("seed");
        
        JOptionPane.showMessageDialog(userProcessContainer, "Seed Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        nameTxt.setText("");
        priceTxt.setText("");
        quantityTxt.setText("");
        typeTxt.setText("");
       }
    }//GEN-LAST:event_seedBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
         Component[] comps = userProcessContainer.getComponents();
        for (Component c: comps)
        {
            if(c instanceof SupplierWorkAreaJPanel)
            {
                SupplierWorkAreaJPanel panel =(SupplierWorkAreaJPanel) c;
                panel.populateTable();
            }
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void nameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusLost
        String regex = "^[A-Za-z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nameTxt.getText());
        
        if(matcher.matches()){
           seedNameError.setText("");
        }
        else{
           seedNameError.setText("Seed Name should be Alphabetic");
           seedNameError.setForeground(Color.red);
        }
    }//GEN-LAST:event_nameTxtFocusLost

    private void typeTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typeTxtFocusLost
        String regex = "^[A-Za-z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(typeTxt.getText());
        
        if(matcher.matches()){
           seedTypeError.setText("");
        }
        else{
           seedTypeError.setText("Seed Type should be Alphabetic");
           seedTypeError.setForeground(Color.red);
        }
    }//GEN-LAST:event_typeTxtFocusLost

    private void priceTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceTxtFocusLost
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(priceTxt.getText());
        
        if(matcher.matches()){
           priceError.setText("");
        }
        else{
           priceError.setText("Seed Price should be Numeric");
           priceError.setForeground(Color.red);
        }
    }//GEN-LAST:event_priceTxtFocusLost

    private void quantityTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityTxtFocusLost
         String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(quantityTxt.getText());
        
        if(matcher.matches()){
           quantityError.setText("");
        }
        else{
           quantityError.setText("Seed Quantity should be Numeric");
           quantityError.setForeground(Color.red);
        }
    }//GEN-LAST:event_quantityTxtFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel priceError;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JLabel quantityError;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton seedBtn;
    private javax.swing.JLabel seedNameError;
    private javax.swing.JLabel seedTypeError;
    private javax.swing.JTextField typeTxt;
    // End of variables declaration//GEN-END:variables
}
