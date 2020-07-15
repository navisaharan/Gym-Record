/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.record;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Navi Choudhary
 */
public class manage1 extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
public String id = membinfo.txt_studentid.getText(); ;

    /**
     * Creates new form manage1
     */
    public manage1() {
        initComponents();
        conn=db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
       update_qty();
       update_price();
        update_table();
         update_table2();
       // pnamebox.setSelectedIndex(2);
    }
private void update_table() {
  // String id= membinfo.txt_studentid.getText();
     try{
         String sql="select * from managerecord where id='"+id+"' ";
         pst=conn.prepareStatement(sql);
         rs= pst.executeQuery();
         jTable1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
         
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
private void update_table2() {
   //  String id= membid.getText();
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
private void update_qty(){
   // String id= membinfo.txt_studentid.getText();
    Object selected = pnamebox.getSelectedItem();
    try{
    {
        switch (selected.toString()) {
            case "Protein":
                try {
                    PreparedStatement st = conn.prepareStatement("select qty from managerecord where product='Protein' AND id='"+id+"' ");
                    ResultSet rst = st.executeQuery();
                    qtydb.setText(rst.getString("qty"));
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }           break;
            case "Gainer":
                try {
                    PreparedStatement st = conn.prepareStatement("select qty from managerecord where product LIKE 'Gainer' AND id='"+id+"' ");
                    ResultSet rst = st.executeQuery();
                    qtydb.setText(rst.getString("qty"));
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                  }
                break;
            case "BCAA":
                try {
                    PreparedStatement st = conn.prepareStatement("select qty from managerecord where product LIKE 'BCAA' AND id='"+id+"' ");
                    ResultSet rst = st.executeQuery();
                    qtydb.setText(rst.getString("qty"));
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case "Fishoil":
                try {
                    PreparedStatement st = conn.prepareStatement("select qty from managerecord where product LIKE 'Fishoil' AND id='"+id+"' ");
                    ResultSet rst = st.executeQuery();
                    qtydb.setText(rst.getString("qty"));
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case "Peanut Butter":
                try {
                    PreparedStatement st = conn.prepareStatement("select qty from managerecord where product LIKE 'Peanut Butter' AND id='"+id+"' ");
                    ResultSet rst = st.executeQuery();
                    qtydb.setText(rst.getString("qty"));
                }
                catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
                  }
                break;
        }
        }
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
private void update_price(){
    // String id= membinfo.txt_studentid.getText();
    Object selected = pnamebox.getSelectedItem();
    try{
    {
     if(selected.toString().equals("Protein"))
        {
          try {        
           PreparedStatement st = conn.prepareStatement("select price from managerecord where product LIKE 'Protein' AND id='"+id+"' ");
               ResultSet rst = st.executeQuery();
               pricedb.setText(rst.getString("price"));
                }
                  catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }   
        }
        else if(selected.toString().equals("Gainer"))
        {
          try {        
           PreparedStatement st = conn.prepareStatement("select price from managerecord where product LIKE 'Gainer' AND id='"+id+"' ");
               ResultSet rst = st.executeQuery();
               pricedb.setText(rst.getString("price"));
                }
                  catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
                  }
        }
      else if(selected.toString().equals("BCAA"))
        {
          try {        
           PreparedStatement st = conn.prepareStatement("select price from managerecord where product LIKE 'BCAA' AND id='"+id+"' ");
               ResultSet rst = st.executeQuery();
               pricedb.setText(rst.getString("price"));
                }
                  catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
                  }
        }
         else if(selected.toString().equals("Fishoil"))
        {
          try {        
           PreparedStatement st = conn.prepareStatement("select price from managerecord where product LIKE 'Fishoil' AND id='"+id+"' ");
               ResultSet rst = st.executeQuery();
               pricedb.setText(rst.getString("price"));
                }
                  catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
                  }
        }
      else if(selected.toString().equals("Peanut Butter"))
        {
          try {        
           PreparedStatement st = conn.prepareStatement("select price from managerecord where product LIKE 'Peanut Butter' AND id='"+id+"' ");
               ResultSet rst = st.executeQuery();
               pricedb.setText(rst.getString("price"));
                }
                  catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
                  }
        }
    }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnamebox = new javax.swing.JComboBox();
        txt_qty = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        qtydb = new javax.swing.JTextField();
        pricedb = new javax.swing.JTextField();
        qtynew1 = new javax.swing.JTextField();
        pricenew1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        yearbox = new javax.swing.JComboBox();
        monthbox = new javax.swing.JComboBox();
        daybox = new javax.swing.JComboBox();
        feebox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        membid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 3, 14))); // NOI18N

        jLabel1.setText("Product :");

        jLabel2.setText("Qty :");

        jLabel3.setText("Price :");

        pnamebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Products /", "Protein", "Gainer", "BCAA", "Fishoil", "Peanut Butter", "Others" }));
        pnamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameboxActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
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

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Total");

        jButton2.setText("Submit");

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(pnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(qtydb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pricedb, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(jButton1))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtynew1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(pricenew1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qtydb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pricedb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtynew1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pricenew1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(44, 44, 44))
        );

        yearbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2020", "2021", "2022", "2023", "2024", "2025" }));

        monthbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" }));

        daybox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        feebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paid", "Not Paid" }));

        jLabel5.setText("Fees :");

        jLabel7.setText("Member Id :");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(feebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(daybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(membid, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(membid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(feebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        setSize(new java.awt.Dimension(958, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     //   String id= membid.getText();
        int qty,price,qtydatabase,qtynew,pricedatabase,pricenew;
        String qtyset,priceset;
        Object selected = pnamebox.getSelectedItem();
        qty = Integer.parseInt(txt_qty.getText());
        price = Integer.parseInt(txt_price.getText());
       qtydatabase = Integer.parseInt(qtydb.getText());
       qtynew = qty + qtydatabase ;
       String qtytxt = String.valueOf(qtynew);
       qtynew1.setText(qtytxt);
       qtyset = qtynew1.getText();
       pricedatabase = Integer.parseInt(pricedb.getText());
       pricenew = price + pricedatabase ;
       String pricetxt = String.valueOf(pricenew);
       pricenew1.setText(pricetxt);
       priceset = pricenew1.getText();
    switch (selected.toString()) {
        case "Protein":
            try {
                //String sql="insert into stock( product, qty, price) values('Gainer','"+qty+"','"+price+"')";
                String sql="update managerecord set qty='"+qtyset+"', price='"+priceset+"' where product='Protein' AND id='"+id+"' ";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Added");
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, "error");
            }
            break;
        case "Gainer":
            try {
                //String sql="insert into stock( product, qty, price) values('Gainer','"+qty+"','"+price+"')";
                String sql="update stock set qty='"+qtyset+"', price='"+priceset+"' where product LIKE 'Gainer' ";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Added");
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, "error");
            }
            break;
        case "BCAA":
            try {        
                //String sql="insert into stock( product, qty, price) values('BCAA','"+qty+"','"+price+"')";
                String sql="update stock set qty='"+qtyset+"', price='"+priceset+"' where product LIKE 'BCAA' ";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Added");
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, "error");
            }
            break;
        case "Fishoil":
            try {        
                //String sql="insert into stock( product, qty, price) values('Fishoil','"+qty+"','"+price+"')";
                String sql="update stock set qty='"+qtyset+"', price='"+priceset+"' where product LIKE 'Fishoil' ";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Added");
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, "error");
            }
            break;
        case "Peanut Butter":
            try {        
                // String sql="insert into stock( product, qty, price) values('Peanut Butter','"+qty+"','"+price+"')";
                String sql="update stock set qty='"+qtyset+"', price='"+priceset+"' where product LIKE 'Peanut Butter' ";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Added");
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, "error");
            }
            break;
    }
        update_table();
        update_table2();
        update_qty();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pnameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameboxActionPerformed
        // TODO add your handling code here:
       update_qty();
       update_price();
        txt_qty.setText("");
        txt_price.setText("");
    }//GEN-LAST:event_pnameboxActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        membinfo j= new membinfo();
                   j.setVisible(true);
                   this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txt_qty.setText("");
        txt_price.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(manage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new manage1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox daybox;
    private javax.swing.JComboBox feebox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JComboBox yearbox;
    // End of variables declaration//GEN-END:variables
}
