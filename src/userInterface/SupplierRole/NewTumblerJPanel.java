/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SupplierRole;

import business.models.Product.Tumbler;
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
public class NewTumblerJPanel extends javax.swing.JPanel {
    private final Enterprise enterprise;
    private final JPanel userProcessContainer;


    NewTumblerJPanel(Enterprise enterprise, JPanel userProcessContainer) {
       initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        capacityTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        heightTxt = new javax.swing.JTextField();
        widthTxt = new javax.swing.JTextField();
        typeCombo = new javax.swing.JComboBox();
        addTumblerBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        quantTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameError = new javax.swing.JLabel();
        priceError = new javax.swing.JLabel();
        capacityError = new javax.swing.JLabel();
        heightError = new javax.swing.JLabel();
        widthError = new javax.swing.JLabel();
        quantError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Price");

        jLabel4.setText("Tumbler Type");

        jLabel5.setText("Tumbler Name");

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

        jLabel2.setText("Capacity");

        capacityTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                capacityTxtFocusLost(evt);
            }
        });

        jLabel6.setText("Height");

        jLabel7.setText("Width");

        heightTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                heightTxtFocusLost(evt);
            }
        });

        widthTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                widthTxtFocusLost(evt);
            }
        });

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Small-S", "Medium-M", "Large-L" }));

        addTumblerBtn.setBackground(new java.awt.Color(153, 204, 255));
        addTumblerBtn.setText("Add Tumbler");
        addTumblerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTumblerBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(153, 204, 255));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Quantity");

        quantTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantTxtFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setText("Create new Tumbler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addTumblerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(widthTxt)
                                    .addComponent(heightTxt)
                                    .addComponent(capacityTxt)
                                    .addComponent(priceTxt)
                                    .addComponent(typeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(quantTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameError, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceError, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(capacityError, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heightError, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(widthError, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantError, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(backBtn)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(nameError, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(priceError, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(capacityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(capacityError, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(heightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(heightError, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(widthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(widthError, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(quantError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addTumblerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addTumblerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTumblerBtnActionPerformed
        if(nameTxt.getText().equals("") || priceTxt.getText().equals("") || capacityTxt.getText().equals("") || 
                heightTxt.getText().equals("") || widthTxt.getText().equals("") || quantTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(userProcessContainer, "One or more fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(!nameError.getText().isEmpty() || !priceError.getText().isEmpty() || !capacityError.getText().isEmpty() 
                  || !heightError.getText().isEmpty() || !widthError.getText().isEmpty() || !quantError.getText().isEmpty()){
            JOptionPane.showMessageDialog(userProcessContainer, "One or more fields are Invalid", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        else {
            Tumbler tumbler = (Tumbler) enterprise.getProductDirectory().createProduct("tumbler");
            tumbler.setName(nameTxt.getText());
            tumbler.setPrice(Double.parseDouble(priceTxt.getText()));
            tumbler.setType(String.valueOf(typeCombo.getSelectedItem()));
            tumbler.setCapacity(Integer.parseInt(capacityTxt.getText()));
            tumbler.setHeight(Integer.parseInt(heightTxt.getText()));
            tumbler.setWidth(Integer.parseInt(widthTxt.getText()));
            tumbler.setProductType("tumbler");
            tumbler.setQuantity(Integer.parseInt(quantTxt.getText()));
            
            JOptionPane.showMessageDialog(userProcessContainer, "Tumbler Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            
            nameTxt.setText(""); 
            priceTxt.setText(""); 
            capacityTxt.setText(""); 
            heightTxt.setText(""); 
            widthTxt.setText(""); 
            quantTxt.setText(""); 
        }
    }//GEN-LAST:event_addTumblerBtnActionPerformed

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
           nameError.setText("");
        }
        else{
           nameError.setText("Tumbler Name should be Alphabetic");
           nameError.setForeground(Color.red);
        }
    }//GEN-LAST:event_nameTxtFocusLost

    private void priceTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceTxtFocusLost
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(priceTxt.getText());
        
        if(matcher.matches()){
           priceError.setText("");
        }
        else{
           priceError.setText("Tumbler Price should be Numeric");
           priceError.setForeground(Color.red);
        }
    }//GEN-LAST:event_priceTxtFocusLost

    private void capacityTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_capacityTxtFocusLost
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(capacityTxt.getText());
        
        if(matcher.matches()){
           capacityError.setText("");
        }
        else{
           capacityError.setText("Tumbler Capacity should be Numeric");
           capacityError.setForeground(Color.red);
        }
    }//GEN-LAST:event_capacityTxtFocusLost

    private void heightTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heightTxtFocusLost
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(heightTxt.getText());
        
        if(matcher.matches()){
           heightError.setText("");
        }
        else{
           heightError.setText("Tumbler Height should be Numeric");
           heightError.setForeground(Color.red);
        }
    }//GEN-LAST:event_heightTxtFocusLost

    private void widthTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_widthTxtFocusLost
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(widthTxt.getText());
        
        if(matcher.matches()){
           widthError.setText("");
        }
        else{
           widthError.setText("Tumbler Width should be Numeric");
           widthError.setForeground(Color.red);
        }
    }//GEN-LAST:event_widthTxtFocusLost

    private void quantTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantTxtFocusLost
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(quantTxt.getText());
        
        if(matcher.matches()){
           quantError.setText("");
        }
        else{
           quantError.setText("Quantity should be Numeric");
           quantError.setForeground(Color.red);
        }
    }//GEN-LAST:event_quantTxtFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTumblerBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel capacityError;
    private javax.swing.JTextField capacityTxt;
    private javax.swing.JLabel heightError;
    private javax.swing.JTextField heightTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nameError;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel priceError;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JLabel quantError;
    private javax.swing.JTextField quantTxt;
    private javax.swing.JComboBox typeCombo;
    private javax.swing.JLabel widthError;
    private javax.swing.JTextField widthTxt;
    // End of variables declaration//GEN-END:variables
}
