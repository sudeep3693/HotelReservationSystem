
package hotelreservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class account extends javax.swing.JInternalFrame {

    private Object desktopPane;


    public account() {
        initComponents();
    }
    Connection con;
    PreparedStatement p;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Your Detail");
        setOpaque(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setText("Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, -1, -1));

        address.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 46, 160, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Address:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 55, -1, -1));

        name.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 15, 160, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email Addess:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, -1, -1));

        email.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 77, 190, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Contact:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 117, -1, -1));

        contact.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 108, 160, 25));

        setBounds(150, 80, 402, 186);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
          try
            {
                connectDatabase();
                readData();
                con.close();
            }
            catch(ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_formInternalFrameOpened
    public void connectDatabase() throws ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","Sudeep@369");
            //JOptionPane.showMessageDialog(null,"Connection Successful");
        }
        catch(SQLException ee){
            JOptionPane.showMessageDialog(null,ee);
        }
    }
    public void readData()
    {
        try
        {
            
            String sql = "select * from info where email = (select email from login where username= ?)";
            p = con.prepareCall(sql);
            p.setString(1, login.s);
            ResultSet rs = p.executeQuery();
            if(rs.next())
            {
            name.setText(rs.getString(2).concat( " ".concat(rs.getString(3))));
            address.setText(rs.getString(4));
            email.setText(rs.getString(5));
            contact.setText(rs.getString(6));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error");
            }
             
        }
        catch(SQLException eee)
        {
           JOptionPane.showMessageDialog(rootPane, eee);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
