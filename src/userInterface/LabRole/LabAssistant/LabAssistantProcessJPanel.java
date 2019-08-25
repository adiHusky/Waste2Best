/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.LabRole.LabAssistant;

import business.models.User.User;
import business.models.workRequest.CompostGeneratedWorkRequest;
import business.models.workRequest.LabTestWorkRequest;
import com.itextpdf.text.BadElementException;
import enterprise.Enterprise;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import userInterface.FarmerRole.FarmerWorkAreaJPanel;

/**
 *
 * @author tinyteddybear
 */
public class LabAssistantProcessJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    CompostGeneratedWorkRequest request;
    User userAccount;
    Enterprise enterprise;
    int valueN, valueP, valueK;
    private final Logger logger = LoggerFactory.getLogger(LabAssistantProcessJPanel.class);
    
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
     public LabAssistantProcessJPanel(JPanel userProcessContainer, User userAccount ,Enterprise enterprise, CompostGeneratedWorkRequest  request) {
        initComponents();
        usernameLabel.setText(request.getCompostUserName());
        generateReportButton.setVisible(false);
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
         populateCombo();
        request.getMetalContents().clear();
    }
     
     public void populateCombo(){  
         ratingJComboBox.removeAllItems();
         ratingJComboBox.addItem("1");
         ratingJComboBox.addItem("2");
         ratingJComboBox.addItem("3");
         ratingJComboBox.addItem("4");
         ratingJComboBox.addItem("5");
     }
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carbonCheckBox = new javax.swing.JCheckBox();
        potassiumJslider = new javax.swing.JSlider();
        magnesiumCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        copperCheckBox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        ironCheckBox = new javax.swing.JCheckBox();
        iodineCheckBox = new javax.swing.JCheckBox();
        zincCheckBox = new javax.swing.JCheckBox();
        mangeneseCheckBox = new javax.swing.JCheckBox();
        completeReqBtn = new javax.swing.JButton();
        nitrogenJslider = new javax.swing.JSlider();
        sulphurCheckBox = new javax.swing.JCheckBox();
        phosphorousJslider = new javax.swing.JSlider();
        ratingLabel = new javax.swing.JLabel();
        ratingJComboBox = new javax.swing.JComboBox<String>();
        compostAnalysisBtn = new javax.swing.JButton();
        generateReportButton = new javax.swing.JButton();
        compostUserLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        carbonCheckBox.setText("Carbon");

        potassiumJslider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                potassiumJsliderStateChanged(evt);
            }
        });

        magnesiumCheckBox.setText("Magnesium");

        jLabel3.setText("Nitrogen");

        jLabel4.setText("Phosphorous");

        jLabel5.setText("Potassium");

        copperCheckBox.setText("Copper");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Lab Assistant Dashboard");

        ironCheckBox.setText("Iron");

        iodineCheckBox.setText("Iodine");

        zincCheckBox.setText("Zinc");

        mangeneseCheckBox.setText("Mangenese");

        completeReqBtn.setBackground(new java.awt.Color(153, 204, 255));
        completeReqBtn.setText("Complete Request");
        completeReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeReqBtnActionPerformed(evt);
            }
        });

        nitrogenJslider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nitrogenJsliderStateChanged(evt);
            }
        });

        sulphurCheckBox.setText("Sulphur");

        phosphorousJslider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                phosphorousJsliderStateChanged(evt);
            }
        });

        ratingLabel.setText("Rating");

        ratingJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        compostAnalysisBtn.setBackground(new java.awt.Color(153, 204, 255));
        compostAnalysisBtn.setText("Compost Analysis");
        compostAnalysisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compostAnalysisBtnActionPerformed(evt);
            }
        });

        generateReportButton.setBackground(new java.awt.Color(153, 204, 255));
        generateReportButton.setText("Generate Report");
        generateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportButtonActionPerformed(evt);
            }
        });

        compostUserLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        compostUserLabel.setText("Compost Testing of");

        usernameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        backBtn.setBackground(new java.awt.Color(153, 204, 255));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ratingLabel)
                                        .addGap(97, 97, 97)
                                        .addComponent(ratingJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nitrogenJslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(phosphorousJslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(potassiumJslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carbonCheckBox)
                                    .addComponent(sulphurCheckBox)
                                    .addComponent(magnesiumCheckBox)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(copperCheckBox)
                                        .addComponent(ironCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(iodineCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(zincCheckBox, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(mangeneseCheckBox)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(completeReqBtn)
                                .addGap(38, 38, 38)
                                .addComponent(compostAnalysisBtn)
                                .addGap(42, 42, 42)
                                .addComponent(generateReportButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(compostUserLabel)
                                .addGap(18, 18, 18)
                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(compostUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completeReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compostAnalysisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nitrogenJslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(phosphorousJslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addComponent(potassiumJslider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sulphurCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carbonCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(magnesiumCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(copperCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ironCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iodineCheckBox)
                            .addComponent(ratingLabel)
                            .addComponent(ratingJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zincCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mangeneseCheckBox)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void completeReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeReqBtnActionPerformed
        request.getMetalContents().clear();
        nitrogenJslider.setPreferredSize(new Dimension(40, 0));
       phosphorousJslider.setPreferredSize(new Dimension (40,0));
       potassiumJslider.setPreferredSize(new Dimension (40,0));
       logger.info("Sending NPK Values: {}{}{}", valueN, valueP, valueK);
       request.setNitrogen(valueN);
       request.setPhosphorous(valueP);
       request.setPotassium(valueK);
       request.setResult(ratingJComboBox.getSelectedItem().toString());
       request.setStatus("Completed"+" Rating is "+request.getResult());
      
       if(sulphurCheckBox.isSelected()){
           request.addMetalContents("Sulphur");
       }
       if(ironCheckBox.isSelected()){
           request.addMetalContents("Iron");
       }
       if(carbonCheckBox.isSelected()){
           request.addMetalContents("Carbon");
       }
       if(mangeneseCheckBox.isSelected()){
           request.addMetalContents("Manganese");
       }
       if(iodineCheckBox.isSelected()){
           request.addMetalContents("Iodine");
       }
       if(magnesiumCheckBox.isSelected()){
           request.addMetalContents("Magnesium");
       }
       if(zincCheckBox.isSelected()){
           request.addMetalContents("Zinc");
       }
       if(copperCheckBox.isSelected()){
           request.addMetalContents("Copper");
       }
       JOptionPane.showMessageDialog(null, "Request submitted Successfully");
     
    }//GEN-LAST:event_completeReqBtnActionPerformed

    private void compostAnalysisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compostAnalysisBtnActionPerformed
        try {
            logger.info("Sending NPK Values: {}{}{}", valueN, valueP, valueK);
            PieChartAnalysis ex = new PieChartAnalysis(valueN, valueP, valueK);
            ex.setVisible(true);
            generateReportButton.setVisible(true);
        } catch (IOException ex1) {
            java.util.logging.Logger.getLogger(LabAssistantProcessJPanel.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }//GEN-LAST:event_compostAnalysisBtnActionPerformed

    private void nitrogenJsliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nitrogenJsliderStateChanged
        valueN = nitrogenJslider.getValue();
        logger.info("Nitrogen Value changed: {}{}{}", valueN); 
    }//GEN-LAST:event_nitrogenJsliderStateChanged

    private void phosphorousJsliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_phosphorousJsliderStateChanged
        valueP = phosphorousJslider.getValue();
        logger.info("Phosphorous Value changed: {}{}{}", valueP);
    }//GEN-LAST:event_phosphorousJsliderStateChanged

    private void potassiumJsliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_potassiumJsliderStateChanged
        valueK = potassiumJslider.getValue();
        logger.info("Potassium Value changed: {}{}{}", valueK);
    }//GEN-LAST:event_potassiumJsliderStateChanged

    private void generateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportButtonActionPerformed
        try {
             request.getMetalContents().clear();
            // TODO add your handling code here:
            
           
            if(sulphurCheckBox.isSelected()){
                request.addMetalContents("Sulphur");
            }
            if(ironCheckBox.isSelected()){
                request.addMetalContents("Iron");
            }
            if(carbonCheckBox.isSelected()){
                request.addMetalContents("Carbon");
            }
            if(mangeneseCheckBox.isSelected()){
                request.addMetalContents("Manganese");
            }
            if(iodineCheckBox.isSelected()){
                request.addMetalContents("Iodine");
            }
            if(magnesiumCheckBox.isSelected()){
                request.addMetalContents("Magnesium");
            }
            if(zincCheckBox.isSelected()){
                request.addMetalContents("Zinc");
            }
            if(copperCheckBox.isSelected()){
                request.addMetalContents("Copper");
            }
            PDFGenerator gen = new PDFGenerator(request,valueN, valueP, valueK, ratingJComboBox.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "PDF generated Successfully");
        } catch (BadElementException ex) {
            java.util.logging.Logger.getLogger(LabAssistantProcessJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LabAssistantProcessJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generateReportButtonActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
         Component[] comps = userProcessContainer.getComponents();
        for (Component c: comps)
        {
            if(c instanceof LabAssistantWorkAreaJPanel)
            {
                LabAssistantWorkAreaJPanel panel =(LabAssistantWorkAreaJPanel) c;
                panel.populateTable();
            }
        }
        
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JCheckBox carbonCheckBox;
    private javax.swing.JButton completeReqBtn;
    private javax.swing.JButton compostAnalysisBtn;
    private javax.swing.JLabel compostUserLabel;
    private javax.swing.JCheckBox copperCheckBox;
    private javax.swing.JButton generateReportButton;
    private javax.swing.JCheckBox iodineCheckBox;
    private javax.swing.JCheckBox ironCheckBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox magnesiumCheckBox;
    private javax.swing.JCheckBox mangeneseCheckBox;
    private javax.swing.JSlider nitrogenJslider;
    private javax.swing.JSlider phosphorousJslider;
    private javax.swing.JSlider potassiumJslider;
    private javax.swing.JComboBox<String> ratingJComboBox;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JCheckBox sulphurCheckBox;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JCheckBox zincCheckBox;
    // End of variables declaration//GEN-END:variables
}