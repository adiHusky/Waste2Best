/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.FarmerRole;

import business.models.User.User;
import business.models.workRequest.SellCropProduceWorkRequest;
import enterprise.Enterprise;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import organizations.DistributorOrganization;
import organizations.Organization;

/**
 *
 * @author Aditya
 */
public class RequestSellProductPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private Enterprise enterprise;
    private User user;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestSellProductPanel(JPanel userProcessContainer, User user, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.user = user;
        valueLabel.setText(enterprise.getName());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cropNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        cropQuantityTextField = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cropPriceTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cropExpensesTxt = new javax.swing.JTextField();
        compostRequiredTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cropNameError = new javax.swing.JLabel();
        cropQuantError = new javax.swing.JLabel();
        cropPriceError = new javax.swing.JLabel();
        cropExpError = new javax.swing.JLabel();
        compostReqError = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Crop Name");

        cropNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cropNameTextFieldFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Sell Crop Produce");

        submitButton.setBackground(new java.awt.Color(153, 204, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cropQuantityTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cropQuantityTextFieldFocusLost(evt);
            }
        });
        cropQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cropQuantityTextFieldActionPerformed(evt);
            }
        });

        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        jLabel6.setText("Crop Quantity");

        cropPriceTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cropPriceTextFieldFocusLost(evt);
            }
        });
        cropPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cropPriceTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Crop Price");

        jLabel8.setText("Crop Expenses");

        cropExpensesTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cropExpensesTxtFocusLost(evt);
            }
        });
        cropExpensesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cropExpensesTxtActionPerformed(evt);
            }
        });

        compostRequiredTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                compostRequiredTxtFocusLost(evt);
            }
        });
        compostRequiredTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compostRequiredTxtActionPerformed(evt);
            }
        });

        jLabel9.setText("Compost Required");

        buttonBack.setBackground(new java.awt.Color(153, 204, 255));
        buttonBack.setText("<<Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel4)))
                .addContainerGap(308, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compostRequiredTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(compostReqError, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(402, 402, 402))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cropNameTextField)
                                .addGap(35, 35, 35)
                                .addComponent(cropNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cropExpensesTxt)
                                    .addComponent(cropPriceTextField)
                                    .addComponent(cropQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cropExpError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cropPriceError, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cropQuantError, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cropNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cropNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cropQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(cropQuantError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cropPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cropPriceError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cropExpError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cropExpensesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(compostRequiredTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(compostReqError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
       if(cropNameTextField.getText().equals("") || cropQuantityTextField.getText().equals("") || compostRequiredTxt.getText().equals("") 
               || cropExpensesTxt.getText().equals("") || cropPriceTextField.getText().equals("")){
           JOptionPane.showMessageDialog(userProcessContainer, "One or many field is empty", "Error", JOptionPane.ERROR_MESSAGE);
       } else if(!cropNameError.getText().isEmpty() || !cropQuantError.getText().isEmpty() || !cropExpError.getText().isEmpty() 
               || !cropPriceError.getText().isEmpty() || !compostReqError.getText().isEmpty()){
           JOptionPane.showMessageDialog(userProcessContainer, "One or many field is having invalid data", "Error", JOptionPane.ERROR_MESSAGE);
       } else{
            String cropName = cropNameTextField.getText();
            Double cropPrice = Double.parseDouble(cropPriceTextField.getText());
            Integer cropQuantity =  Integer.valueOf(cropQuantityTextField.getText());
            Double compostRequired = Double.parseDouble(compostRequiredTxt.getText());
            Double expenses = Double.parseDouble(cropExpensesTxt.getText());

            SellCropProduceWorkRequest request = new SellCropProduceWorkRequest();
            request.setCropName(cropName);
            request.setCropQuantity(cropQuantity);
            request.setPrice(cropPrice);
            request.setSender(user);
            request.setStatus("Sent");
            request.setExpenses(expenses);
            request.setCompostRequired(compostRequired);


            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof DistributorOrganization){
                    org = organization;
                    break;
                }
            }
            if (org!=null){
                org.getWorkQueue().getWorkRequestList().add(request);
                user.getWorkQueue().getWorkRequestList().add(request);
                JOptionPane.showMessageDialog(null, "Request submitted Successfully");
                clearFields();
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void clearFields() {
        cropNameTextField.setText("");
        cropQuantityTextField.setText("");
        compostRequiredTxt.setText("");
        cropExpensesTxt.setText("");
        cropPriceTextField.setText("");
    }
            
    private void cropQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cropQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cropQuantityTextFieldActionPerformed

    private void cropPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cropPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cropPriceTextFieldActionPerformed

    private void cropExpensesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cropExpensesTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cropExpensesTxtActionPerformed

    private void compostRequiredTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compostRequiredTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compostRequiredTxtActionPerformed

    private void cropNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cropNameTextFieldFocusLost
        String regex = "^[A-Za-z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cropNameTextField.getText());
        
        if(matcher.matches()){
           cropNameError.setText("");
        }
        else{
           cropNameError.setText("Crop Name should be Alphabetic");
        }
    }//GEN-LAST:event_cropNameTextFieldFocusLost

    private void cropQuantityTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cropQuantityTextFieldFocusLost
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cropQuantityTextField.getText());
        
        if(matcher.matches()){
           cropQuantError.setText("");
        }
        else{
           cropQuantError.setText("Quantity should be Numeric");
        }
    }//GEN-LAST:event_cropQuantityTextFieldFocusLost

    private void cropPriceTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cropPriceTextFieldFocusLost
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cropPriceTextField.getText());
        
        if(matcher.matches()){
           cropPriceError.setText("");
        }
        else{
           cropPriceError.setText("Crop Price should be Numeric");
        }
    }//GEN-LAST:event_cropPriceTextFieldFocusLost

    private void cropExpensesTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cropExpensesTxtFocusLost
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cropExpensesTxt.getText());
        
        if(matcher.matches()){
           cropExpError.setText("");
        }
        else{
           cropExpError.setText("Expenses should be Numeric");
        }
    }//GEN-LAST:event_cropExpensesTxtFocusLost

    private void compostRequiredTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_compostRequiredTxtFocusLost
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(compostRequiredTxt.getText());
        
        if(matcher.matches()){
           compostReqError.setText("");
        }
        else{
           compostReqError.setText("Compost Require should be Numeric");
        }
    }//GEN-LAST:event_compostRequiredTxtFocusLost

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        Component[] comps = userProcessContainer.getComponents();
        for (Component c: comps)
        {
            if(c instanceof FarmerWorkAreaJPanel)
            {
                FarmerWorkAreaJPanel panel =(FarmerWorkAreaJPanel) c;
                panel.populateRequestTable();
            }
        }
    }//GEN-LAST:event_buttonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JLabel compostReqError;
    private javax.swing.JTextField compostRequiredTxt;
    private javax.swing.JLabel cropExpError;
    private javax.swing.JTextField cropExpensesTxt;
    private javax.swing.JLabel cropNameError;
    private javax.swing.JTextField cropNameTextField;
    private javax.swing.JLabel cropPriceError;
    private javax.swing.JTextField cropPriceTextField;
    private javax.swing.JLabel cropQuantError;
    private javax.swing.JTextField cropQuantityTextField;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
