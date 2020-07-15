/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.record;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Navi Choudhary
 */
public class MainMenu extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
      conn=db.java_db();
        initComponents(); 
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
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
        membutton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        supplbutton = new javax.swing.JButton();
        stockbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Main Menu");
        setResizable(false);

        jPanel1.setLayout(null);

        membutton.setBackground(new java.awt.Color(255, 255, 255));
        membutton.setForeground(new java.awt.Color(0, 0, 0));
        membutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/record/images/Add.png"))); // NOI18N
        membutton.setText("Member Record");
        membutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        membutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membuttonActionPerformed(evt);
            }
        });
        jPanel1.add(membutton);
        membutton.setBounds(570, 430, 190, 60);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/record/images/logout.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(750, 10, 40, 30);

        supplbutton.setBackground(new java.awt.Color(255, 255, 255));
        supplbutton.setForeground(new java.awt.Color(0, 0, 0));
        supplbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/record/images/Whey_Protein1.png"))); // NOI18N
        supplbutton.setText("Suppliment Record");
        supplbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supplbutton.setMaximumSize(new java.awt.Dimension(175, 66));
        supplbutton.setMinimumSize(new java.awt.Dimension(175, 66));
        supplbutton.setPreferredSize(new java.awt.Dimension(175, 66));
        supplbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(supplbutton);
        supplbutton.setBounds(570, 340, 190, 70);

        stockbutton.setBackground(new java.awt.Color(255, 255, 255));
        stockbutton.setForeground(new java.awt.Color(0, 0, 0));
        stockbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/record/images/stock1.png"))); // NOI18N
        stockbutton.setText("Stock");
        stockbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stockbutton.setMaximumSize(new java.awt.Dimension(175, 66));
        stockbutton.setMinimumSize(new java.awt.Dimension(175, 66));
        stockbutton.setPreferredSize(new java.awt.Dimension(175, 66));
        stockbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(stockbutton);
        stockbutton.setBounds(570, 250, 190, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/record/images/gymwall1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -30, 800, 560);

        jMenuBar1.setBorder(null);

        jMenu1.setText("File");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setText("Audit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Users");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                   Login j = new Login();
                   j.setVisible(true);
                   this.dispose();
                   
                   
                   try{
                   Date currentDate = GregorianCalendar.getInstance().getTime();
                  DateFormat df = DateFormat.getDateInstance();
                  String dateString = df.format(currentDate);

                  Date d = new Date();
                  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                  String timeString = sdf.format(d);

                  String value0 = timeString;
                  String values = dateString;
                   
                   
                   int value = Emp.empId;
                   String reg = "insert into Audit (emp_id,date,status) values ('"+value+"','"+value0+" / "+values+"','Logged out')";
                   pst=conn.prepareStatement(reg);
                   pst.execute();
                   this.dispose();
          }catch (Exception e){
              
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
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void membuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membuttonActionPerformed
        // TODO add your handling code here:
        
         membinfo j= new membinfo();
                   j.setVisible(true);
                  this.dispose();
                   
    }//GEN-LAST:event_membuttonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
                   Audit_details j = new Audit_details();
                   j.setVisible(true);
                   
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
                  users j = new users();
                   j.setVisible(true);
                   this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void supplbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplbuttonActionPerformed
        // TODO add your handling code here:
         supplinfo j= new supplinfo();
                   j.setVisible(true);
                   this.dispose();
    }//GEN-LAST:event_supplbuttonActionPerformed

    private void stockbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockbuttonActionPerformed
        // TODO add your handling code here:
         stock j= new stock();
                   j.setVisible(true);
                   this.dispose();
    }//GEN-LAST:event_stockbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton membutton;
    private javax.swing.JButton stockbutton;
    private javax.swing.JButton supplbutton;
    // End of variables declaration//GEN-END:variables
}