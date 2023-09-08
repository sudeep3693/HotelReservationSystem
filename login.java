
package hotelreservation;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {
    public static Connection con;
    static PreparedStatement st;
    public static String s;
    public static int priorit ;
    home h = new home();

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tpassword = new javax.swing.JPasswordField();
        bexit = new javax.swing.JButton();
        blogin = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        notif = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bglogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 26)); // NOI18N
        jLabel1.setText("Hotel Reservation System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 14, 362, 41));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setText("USERNAME:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 94, 90, -1));

        tusername.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(tusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 92, 150, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setText("PASSWORD:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 90, -1));

        tpassword.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        tpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(tpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 150, 25));

        bexit.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        bexit.setForeground(new java.awt.Color(255, 0, 0));
        bexit.setText("Exit");
        bexit.setDefaultCapable(false);
        bexit.setFocusable(false);
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });
        getContentPane().add(bexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 203, 66, -1));

        blogin.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        blogin.setForeground(new java.awt.Color(51, 51, 255));
        blogin.setText("Log In");
        blogin.setFocusable(false);
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });
        getContentPane().add(blogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        check.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        check.setText("Show Password");
        check.setContentAreaFilled(false);
        check.setFocusable(false);
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 171, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Register");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, 20));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 85, -1, 28));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 137, 30, 22));
        getContentPane().add(notif, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 117, 149, 14));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Have no account?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 26));

        bglogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelreservation/background.jpg"))); // NOI18N
        getContentPane().add(bglogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 420, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        signup t = new signup();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpasswordActionPerformed
      
    }//GEN-LAST:event_tpasswordActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if(check.isSelected()){
            tpassword.setEchoChar((char)0);
        }
        else{
            tpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_checkActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_bexitActionPerformed

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed

        try {
            connectDatabase();
            checkUsername();
        } 
        catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_bloginActionPerformed
 public static void connectDatabase() throws ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/project","root","Sudeep@369");
        }
        catch(SQLException ee)
        {
            JOptionPane.showMessageDialog(null, ee);
        }
    }
 public void checkUsername()
 {
     try{
         String sql = "SELECT * FROM login WHERE username = ? AND password = ?";
         st= con.prepareCall(sql);
         st.setString(1,tusername.getText());
         st.setString(2,tpassword.getText());
         
         ResultSet rs;
         rs = st.executeQuery();
         
         if(rs.next())
         {
             s = tusername.getText();
             String prior = rs.getString("priority");
             priorit = parseInt(prior);
             h.setVisible(true);
             this.disable();
             this.setVisible(false);  
             
         }
         else
         {
             JOptionPane.showMessageDialog(rootPane, "Invalid Username or Password");
         }

     }
     catch(SQLException e){
         JOptionPane.showMessageDialog(null,e);
     }
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bexit;
    private javax.swing.JLabel bglogin;
    private javax.swing.JButton blogin;
    private javax.swing.JCheckBox check;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel notif;
    private javax.swing.JPasswordField tpassword;
    private javax.swing.JTextField tusername;
    // End of variables declaration//GEN-END:variables
}
