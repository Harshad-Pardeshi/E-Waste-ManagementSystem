/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.ui.userworkarea;

import com.ewaste.business.enterprise.Enterprise;
import com.ewaste.business.network.Network;
import com.ewaste.business.product.Product;
import com.ewaste.business.useraccount.UserAccount;
import com.ewaste.business.workqueue.WorkRequest;
import com.ewaste.ui.testingWorkArea.ProductTestPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author varsha bhanushali
 */
public class BuyEwastePanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Network network;
    /**
     * Creates new form BuyEwastePanel
     */
    public BuyEwastePanel(JPanel userProcessContainer, UserAccount userAccount, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.network = network;
        populateProductTable();
    }

    public void populateProductTable(){
        DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();

        model.setRowCount(0);
        for(Product p : network.getProductCatlog().getProductList() ){
            Object[] row = new Object[4];
            row[0] = p;
            row[1] = p.getCategory();
            row[2] = p.getProductManufacturer();
            row[3] = p.getProducDescription();
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

        lblProductCatalog = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductCatalog = new javax.swing.JTable();
        lblCategory = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        lblVendor = new javax.swing.JLabel();
        cmbVendor = new javax.swing.JComboBox<>();
        lblPrice = new javax.swing.JLabel();
        cmbPrice = new javax.swing.JComboBox<>();
        lblSearchByDescription = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnBuy = new javax.swing.JButton();

        lblProductCatalog.setText("Product Catalog");

        tblProductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Name", "Product_Category", "Product_Company", "Product_Price"
            }
        ));
        jScrollPane1.setViewportView(tblProductCatalog);

        lblCategory.setText("Category:");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Large household appliances", "Small household appliances", "Computer parts", "Industry System", "Networking Equipment" }));

        lblVendor.setText("Vendor:");

        cmbVendor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Dell", "HP", "Lenovo", "Apple" }));
        cmbVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVendorActionPerformed(evt);
            }
        });

        lblPrice.setText("Price:");

        cmbPrice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Low to High", "High to Low" }));

        lblSearchByDescription.setText("Search By Description:");

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBuy.setText("Buy");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(lblProductCatalog)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblVendor)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSearchByDescription)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(78, 78, 78)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCategory)
                                .addGap(10, 10, 10)
                                .addComponent(btnViewDetails)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuy))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPrice)
                                .addGap(18, 18, 18)
                                .addComponent(cmbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategory)
                    .addComponent(lblVendor)
                    .addComponent(cmbVendor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice)
                    .addComponent(cmbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProductCatalog)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearchByDescription))
                        .addGap(73, 73, 73)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetails)
                    .addComponent(btnBuy))
                .addGap(85, 85, 85)
                .addComponent(btnBack)
                .addGap(127, 127, 127))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVendorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVendorActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:

       ArrayList<Product> matchArray = network.getProductCatlog().getProductList();
        String keyCategory = cmbCategory.getSelectedItem().toString();

        if(keyCategory.equalsIgnoreCase("All")){
//            //ArrayList<Product> matchArray;
           matchArray = network.getProductCatlog().getProductList();
       }
        else{
            ArrayList<Product> filteredArray = new ArrayList<>();
            for(Product product: matchArray){
                if(product.getCategory().equalsIgnoreCase(keyCategory)){
                    filteredArray.add(product);
                }
           }
            matchArray = filteredArray;
        }

        String keyVendor = cmbVendor.getSelectedItem().toString();

        if(keyVendor.equalsIgnoreCase("All")){
            matchArray = matchArray;
        }

        else{
            ArrayList<Product> vendorFilteredArray = new ArrayList<>();
            for(Product product: matchArray){
                if(product.getProductManufacturer().equalsIgnoreCase(keyVendor)){
                    vendorFilteredArray.add(product);
                }
            }
            matchArray = vendorFilteredArray;
        }
//        //populateTable(matchArray);
//
        int keyPrice = cmbPrice.getSelectedIndex();

        if(keyPrice==1){
            Collections.sort(matchArray);
        }
        else{
            Collections.sort(matchArray , Collections.reverseOrder());
        }

        populateTable(matchArray);

        String description = txtDescription.getText();

        if(!description.trim().isEmpty()){
            ArrayList<Product> descripFilteredArray = new ArrayList<>();
            for(Product product: matchArray){
                if(product.getProducDescription().trim().toLowerCase().contains(description.trim().toLowerCase())){
                    descripFilteredArray.add(product);
                }
            }
            matchArray = descripFilteredArray;
        }

        populateTable(matchArray);

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProductCatalog.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a Product to process further");
            return;
        }
        Product product = (Product)tblProductCatalog.getValueAt(selectedRow, 0);
        ViewProductDetailsPanel productTestPanel = new ViewProductDetailsPanel(userProcessContainer, product);
        userProcessContainer.add("ViewProductDetailsPanel",productTestPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewDetailsActionPerformed
    private void populateTable(ArrayList<Product> a) {
        
        DefaultTableModel dtm = (DefaultTableModel) tblProductCatalog.getModel();
        dtm.setRowCount(0);
        
        for(Product product: a){
            
            Object row[] = new Object[5];
            
            row[0] = product;
            row[1] = product.getCategory();
            row[2] = product.getProductManufacturer();
            row[3] = product.getSellingPrice();
            //row[4] = product.getBasePrice();
            
            dtm.addRow(row);
        }
                
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        int selectedRow = tblProductCatalog.getSelectedRow();
       
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a Product to process further");
            return;
        }
       Product p = (Product) tblProductCatalog.getValueAt(selectedRow, 0);
      
       userAccount.getOrderList().addOrder(p, 1);
       network.getProductCatlog().removeProduct(p);
       JOptionPane.showMessageDialog(null, "Product has been successfully added to your cart");
       populateProductTable();
        
    }//GEN-LAST:event_btnBuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbPrice;
    private javax.swing.JComboBox<String> cmbVendor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductCatalog;
    private javax.swing.JLabel lblSearchByDescription;
    private javax.swing.JLabel lblVendor;
    private javax.swing.JTable tblProductCatalog;
    private javax.swing.JTextField txtDescription;
    // End of variables declaration//GEN-END:variables
}