/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.record;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;


/**
 *
 * @author Navi Choudhary
 */
public final class manage extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
public String id= membinfo.txt_studentid.getText();
    /**
     * Creates new form manage
     */
    public manage() {
         initComponents();
        conn=db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        update_table2();
        update_table1();
        update_qty();
        update_price();
    }
 private void update_table2() {
     
     try{
         String sql="select * from managerecord where id='"+id+"' ";
         pst=conn.prepareStatement(sql);
         rs= pst.executeQuery();
         jTable2.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
         
     }
     catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e);
     }
      finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
                
            }
        }
 }  
 
private void update_table1(){
    try{
         String sql="select * from managerecord where id='"+id+"' ";
         pst=conn.prepareStatement(sql);
         rs= pst.executeQuery();
        // jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
    }
    catch(SQLException | HeadlessException e){
        
    }
     finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
                
            }
        }
}

  private void update_qty(){ 
   Object selected = pnamebox.getSelectedItem();
   {
        switch (selected.toString()) {
            case "Protein":
                try{
                    String sql="select qty from managerecord where product='Protein' AND id='"+id+"' ";
                    pst=conn.prepareStatement(sql);
                    rs= pst.executeQuery();
                    qtydb.setText(rs.getString("qty"));
                   // jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e){
                    
                }           break;
            case "Gainer":
                try{
                    String sql="select qty from managerecord where product='Gainer' AND id='"+id+"' ";
                    pst=conn.prepareStatement(sql);
                    rs= pst.executeQuery();
                    qtydb.setText(rs.getString("qty"));
                    jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e){
                    
                }           break;
            case "BCAA":
                try{
                    String sql="select qty from managerecord where product='BCAA' AND id='"+id+"' ";
                    pst=conn.prepareStatement(sql);
                    rs= pst.executeQuery();
                    qtydb.setText(rs.getString("qty"));
                    jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e){
                    
                }           break;
            case "Peanut Butter":
                try{
                    String sql="select qty from managerecord where product='Peanut Butter' AND id='"+id+"' ";
                    pst=conn.prepareStatement(sql);
                    rs= pst.executeQuery();
                    qtydb.setText(rs.getString("qty"));
                    jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e){
                    
                }           break;
            case "Fishoil":
                try{
        String sql="select qty from managerecord where product='Fishoil' AND id='"+id+"' ";
        pst=conn.prepareStatement(sql);
       rs= pst.executeQuery();
       qtydb.setText(rs.getString("qty"));
        jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
        
    }           break;
        }
   }
   
} 

/**private void update_qty(){
    Object selected = pnamebox.getSelectedItem();
    {
        switch (selected.toString()) {
            case "Protein":
                try {
                    PreparedStatement st = conn.prepareStatement("select qty from stock where product LIKE 'Protein'");
                    ResultSet rst = st.executeQuery();
                    qtydb.setText(rst.getString("qty"));
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }           break;
            case "Gainer":
                try {
                    PreparedStatement st = conn.prepareStatement("select qty from stock where product LIKE 'Gainer'");
                    ResultSet rst = st.executeQuery();
                    qtydb.setText(rst.getString("qty"));
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                  }
                break;
            case "BCAA":
                try {
                    PreparedStatement st = conn.prepareStatement("select qty from stock where product LIKE 'BCAA'");
                    ResultSet rst = st.executeQuery();
                    qtydb.setText(rst.getString("qty"));
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case "Fishoil":
                try {
                    PreparedStatement st = conn.prepareStatement("select qty from stock where product LIKE 'Fishoil'");
                    ResultSet rst = st.executeQuery();
                    qtydb.setText(rst.getString("qty"));
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case "Peanut Butter":
                try {
                    PreparedStatement st = conn.prepareStatement("select qty from stock where product LIKE 'Peanut Butter'");
                    ResultSet rst = st.executeQuery();
                    qtydb.setText(rst.getString("qty"));
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                
                
                finally {
                    
                    try{
                        rs.close();
                        pst.close();
                        
            }
            catch(Exception e){
            }   
              } break;
        }
    }     
}
**/
private void update_price(){
    try {        
         //  String sql="insert into stock( product, qty, price) values('Protein','"+qty+"','"+price+"')";
                 PreparedStatement st = conn.prepareStatement("select price from stock where product LIKE 'Protein'");
          // pst=conn.prepareStatement(sql);
              // ResultSet rs= st.execute();
               ResultSet rst = st.executeQuery();
               pricedb.setText(rst.getString("price"));
                }
                  catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
      finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
            }   
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnamebox = new javax.swing.JComboBox();
        txt_qty = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        pricedb = new javax.swing.JTextField();
        qtynew1 = new javax.swing.JTextField();
        pricenew1 = new javax.swing.JTextField();
        qtystockdb = new javax.swing.JTextField();
        qtystocknew1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        daybox = new javax.swing.JComboBox();
        monthbox = new javax.swing.JComboBox();
        yearbox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        feebox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        membid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        qtydb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Manage Record"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Suppliments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Adobe Arabic", 3, 18))); // NOI18N

        jLabel3.setText("Product Name :");

        jLabel4.setText("Qty:");

        jLabel5.setText("Price :");

        pnamebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Protein", "Gainer", "BCAA", "Fishoil", "Peanut Butter", "Others" }));
        pnamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameboxActionPerformed(evt);
            }
        });

        txt_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qtyActionPerformed(evt);
            }
        });
        txt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_qtyKeyReleased(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product", "Qty", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Total :");

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtystockdb, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtystocknew1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pricedb, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(qtynew1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pricenew1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(pnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(qtystocknew1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(pricenew1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(qtynew1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pricedb, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qtystockdb, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setText("Date :");

        daybox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" }));

        yearbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2020", "2021", "2022", "2023", "2024", "2025" }));

        jLabel2.setText("Fees :");

        feebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paid", "Not Paid" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Product", "Qty", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel7.setText("Member Id :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(feebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(qtydb, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(daybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(membid, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(daybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yearbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(membid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(feebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(qtydb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(973, 584));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    Object selected = pnamebox.getSelectedItem();
    String qtyset,priceset;
    qtyset= qtynew1.getText();
      
       int qty,qtydatabase,qtynew;
            qty = Integer.parseInt(txt_qty.getText());
      qtydatabase = Integer.parseInt(qtydb.getText());
      qtynew = qty + qtydatabase;
      String qtytxt = String.valueOf(qtynew);
      qtynew1.setText(qtytxt);
      
      int price,pricedatabase,pricenew;
       price = Integer.parseInt(txt_price.getText());
       pricedatabase = Integer.parseInt(pricedb.getText());
        pricenew = price + pricedatabase ;
       String pricetxt = String.valueOf(pricenew);
       pricenew1.setText(pricetxt);
       priceset = pricenew1.getText();
 
       {
        switch (selected.toString()) {
            case "Protein":
                try{
                    String sql="update stock set qty='"+qtyset+"', price='"+priceset+"' where product LIKE 'Protein' ";
                    pst=conn.prepareStatement(sql);
                    rs= pst.executeQuery();
                    jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "error");
                }           break;
            case "Gainer":
                try{
                    String sql="update managerecord set qty='"+qtyset+"' where product='Gainer' AND id='"+id+"'";
                    pst=conn.prepareStatement(sql);
                    rs= pst.executeQuery();
      
    }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "error");
                }           break;
            case "BCAA":
                try{
                    String sql="update managerecord set qty='"+qtyset+"' where product='BCAA' AND id='"+id+"'";
                    pst=conn.prepareStatement(sql);
                    rs= pst.executeQuery();
                    
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "error");
                }           break;
            case "Peanut Butter":
                try{
                    String sql="update managerecord set qty='"+qtyset+"' where product='Peanut Butter' AND id='"+id+"'";
                    pst=conn.prepareStatement(sql);
                    rs= pst.executeQuery();
                    
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "error");
                }           break;
            case "Fishoil":
                try{
        String sql="update managerecord set qty='"+qtyset+"' where product='Fishoil' AND id='"+id+"'";
        pst=conn.prepareStatement(sql);
       rs= pst.executeQuery();
       
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "error");
    }           break;
        }
   }
       
      
      update_qty();
       update_table1();
        update_table2();
    }//GEN-LAST:event_jButton2ActionPerformed

   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {        
         //  String sql="insert into stock( product, qty, price) values('Protein','"+qty+"','"+price+"')";
                String sql="delete from managerecordtemp ";
           pst=conn.prepareStatement(sql);
                pst.execute();
              //  JOptionPane.showMessageDialog(null, "Record Added");
                }
                  catch(SQLException | HeadlessException e){
                  JOptionPane.showMessageDialog(null, "error");
            }  
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        membinfo j= new membinfo();
                   j.setVisible(true);
                   this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void pnameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameboxActionPerformed
        // TODO add your handling code here:
       update_qty();
       update_table1();
    }//GEN-LAST:event_pnameboxActionPerformed

    private void txt_qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyReleased
        // TODO add your handling code here:
      /** if(txt_qty.getText() != null){     
         int qty,qtydatabase,qtynew;
            qty = Integer.parseInt(txt_qty.getText());
      qtydatabase = Integer.parseInt(qtydb.getText());
      qtynew = qty + qtydatabase;
      String qtytxt = String.valueOf(qtynew);
      qtynew1.setText(qtytxt);
       } 
       else if(txt_qty.getText() == null){
           txt_qty.setText("0");
       } **/
    }//GEN-LAST:event_txt_qtyKeyReleased

    private void txt_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_qtyActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new manage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox daybox;
    private javax.swing.JComboBox feebox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField membid;
    private javax.swing.JComboBox monthbox;
    private javax.swing.JComboBox pnamebox;
    private javax.swing.JTextField pricedb;
    private javax.swing.JTextField pricenew1;
    private javax.swing.JTextField qtydb;
    private javax.swing.JTextField qtynew1;
    private javax.swing.JTextField qtystockdb;
    private javax.swing.JTextField qtystocknew1;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JComboBox yearbox;
    // End of variables declaration//GEN-END:variables
}
