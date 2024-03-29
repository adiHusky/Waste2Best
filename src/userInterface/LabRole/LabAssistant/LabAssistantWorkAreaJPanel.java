/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.LabRole.LabAssistant;

import business.models.User.User;
import business.models.workRequest.CompostGeneratedWorkRequest;
import business.models.workRequest.LabTestWorkRequest;
import business.models.workRequest.WorkRequest;
import enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import organizations.DistributorOrganization;
import organizations.LabOrganization;

/**
 *
 * @author tinyteddybear
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private LabOrganization organization;
    private Enterprise enterprise;
    private User userAccount;
    /**
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, User account, LabOrganization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());
        populateTable();
    }
    
          public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[3];
            row[0] = request;
            row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[2] = request.getStatus();
            
            model.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Lab Assistant Dashboard");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setBackground(new java.awt.Color(153, 204, 255));
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setBackground(new java.awt.Color(153, 204, 255));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setBackground(new java.awt.Color(153, 204, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignJButton)
                        .addGap(24, 24, 24)
                        .addComponent(processJButton))
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(processJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assignJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if (!request.getStatus().equals("Sent to Lab")){
             JOptionPane.showMessageDialog(null, "Request already in process");
        }else{
            request.setReceiver(userAccount);
        request.setStatus("Pending by Lab");
        }
        
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        WorkRequest req = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
      if(req.getStatus().equals("Sent to Lab")){
          JOptionPane.showMessageDialog(null, "Assign to yourself and then Process");
      }else if (req.getStatus().equals("Pending by Lab")||req.getStatus().equals("Processing by Lab")){
            if (workRequestJTable.getValueAt(selectedRow, 0) instanceof CompostGeneratedWorkRequest ){
            CompostGeneratedWorkRequest compostGeneratedWorkRequest = (CompostGeneratedWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

            compostGeneratedWorkRequest.setStatus("Processing by Lab");

            LabAssistantProcessJPanel processWorkRequestJPanel = new LabAssistantProcessJPanel(userProcessContainer,userAccount,enterprise, compostGeneratedWorkRequest);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
      }else{
           JOptionPane.showMessageDialog(null, "Either completed or already in process");
      
      }

      

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
