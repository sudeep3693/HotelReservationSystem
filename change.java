
package hotelreservation;

import static hotelreservation.login.con;
import static hotelreservation.login.s;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class change extends javax.swing.JInternalFrame {

    public change() {
        initComponents();
    }
    public String password1;
    PreparedStatement p,q;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        current = new javax.swing.JPasswordField();
        newp = new javax.swing.JPasswordField();
        retype = new javax.swing.JPasswordField();
        bsubmit = new javax.swing.JButton();
        result = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Change Password");
        setOpaque(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        jLabel1.setText("Current Password:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        jLabel2.setText("New Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        jLabel3.setText("Re-Type New Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        current.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        current.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                currentMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                currentMouseReleased(evt);
            }
        });
        getContentPane().add(current, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 170, -1));

        newp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newpMouseReleased(evt);
            }
        });
        getContentPane().add(newp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 170, -1));

        retype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                retypeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                retypeMouseReleased(evt);
            }
        });
        getContentPane().add(retype, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 170, -1));

        bsubmit.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bsubmit.setText("Submit");
        bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(bsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        result.setFont(new java.awt.Font("Segoe UI Emoji", 1, 10)); // NOI18N
        result.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 20));

        setBounds(150, 80, 402, 186);
    }// </editor-fold>//GEN-END:initComponents

    private void bsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubmitActionPerformed
        try{
            login.connectDatabase();
            extractData();
            putData();
            con.close();
            current.setText("");
            newp.setText("");
            retype.setText("");
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_bsubmitActionPerformed

    private void currentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentMousePressed
        current.setEchoChar((char)0);
    }//GEN-LAST:event_currentMousePressed

    private void currentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentMouseReleased
        current.setEchoChar('*');
    }//GEN-LAST:event_currentMouseReleased

    private void newpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newpMousePressed
        newp.setEchoChar((char)0);
    }//GEN-LAST:event_newpMousePressed

    private void newpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newpMouseReleased
        newp.setEchoChar('*');
    }//GEN-LAST:event_newpMouseReleased

    private void retypeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retypeMousePressed
        retype.setEchoChar((char)0);
    }//GEN-LAST:event_retypeMousePressed

    private void retypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retypeMouseReleased
       retype.setEchoChar('*');
    }//GEN-LAST:event_retypeMouseReleased
    
    public void extractData()
    {
        String sql = "select * from login where username = ?";
        try{
            p = con.prepareCall(sql);
            p.setString(1,s);
            ResultSet rs = p.executeQuery();
            if(rs.next())
            {
                password1 = rs.getString("password");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error");
        }
        }
        catch(HeadlessException | SQLException ee)
        {
            JOptionPane.showMessageDialog(null,ee);
        }
    }
    public void putData()
    {
        String x = "update login set password = ? where username = ?";
        
            if(current.getText().equals(password1))
            {
                if(newp.getText().length()>=6)
                {
                  if(newp.getText().equals(retype.getText()))
                {  
                    if(!newp.getText().matches(current.getText()))
                    {
                       try
                {
                    q = con.prepareCall(x);
                    q.setString(1, newp.getText());
                    q.setString(2,s);
                    q.executeUpdate();
                   
                    JOptionPane.showMessageDialog(null,"Password changed successfully");
                    this.setVisible(false);
                }
                catch(SQLException eee)
                {
                   JOptionPane.showMessageDialog(null,eee); 
                } 
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Old password and new password matches");
                    }
                
                }
                else
                {
                  result.setText("*Password and Re-typed password didnot match");
                } 
                }
                else
                {
                    result.setText("*Password length must be greater than 6");
                }

            }
            else
            {
                JOptionPane.showMessageDialog(null,"old password didnot match");
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsubmit;
    private javax.swing.JPasswordField current;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField newp;
    private javax.swing.JLabel result;
    private javax.swing.JPasswordField retype;
    // End of variables declaration//GEN-END:variables
}
