
package hotelreservation;

import static hotelreservation.login.con;
import static hotelreservation.login.s;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class delete extends javax.swing.JInternalFrame {
    public delete() {
        initComponents();
    }
     PreparedStatement p,q;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        result = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Delete Account");
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
        jLabel1.setText("Enter Your Password:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 60, -1, -1));

        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordMouseReleased(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 56, 159, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Enter email:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 26, -1, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 22, 159, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Delete Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 107, -1, -1));

        result.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        result.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 84, 322, 17));

        setBounds(150, 80, 402, 187);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try
        {
            login.connectDatabase();
            selectData(); 
            con.close();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed
        password.setEchoChar((char)0);
    }//GEN-LAST:event_passwordMousePressed

    private void passwordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseReleased
        password.setEchoChar('*');
    }//GEN-LAST:event_passwordMouseReleased
    
    public void selectData()
    {
        String sql = "select * from login where username = ?";
        try{
            p = con.prepareCall(sql);
            p.setString(1, s);
            ResultSet rs;
            rs = p.executeQuery();
            if(rs.next())
            {
               String a = rs.getString("email"); 
               String b = rs.getString("password");
                if(email.getText().equals(a) && password.getText().equals(b))
                {
                    int data = JOptionPane.showConfirmDialog(null,"Are you sure want to delete your account?");
                    if(data==0)
                    {
                      deleteAccount();
                    deleteinfo();
                    System.exit(WIDTH);
                    } 
                }
                else
                {
                  result.setText("Invalid email or password");
                }
            }
        }
        
        catch(SQLException ee)
        {
          JOptionPane.showMessageDialog(null, ee);
        }         
    }
    public void deleteAccount()
    {
        String x ="delete from login where email= ?";
        try
        {
            q = con.prepareCall(x);
            q.setString(1, email.getText());
            q.executeUpdate();
        }
        catch(SQLException eee)
        {
            JOptionPane.showMessageDialog(null, eee);
        }
    }
     public void deleteinfo()
    {
        String y ="delete from info where email= ?";
        try
        {
            q = con.prepareCall(y);
            q.setString(1, email.getText());
            q.executeUpdate();
        }
        catch(SQLException eee)
        {
            JOptionPane.showMessageDialog(null, eee);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}
