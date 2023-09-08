package hotelreservation;


//import hotelreservation.login;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class signup extends javax.swing.JFrame {
String gender;
    int age;
    public signup() {
        initComponents();
    }
    private Connection con;
    private PreparedStatement pstm,p;
    login l = new login();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfirst = new javax.swing.JTextField();
        tlast = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        taddress = new javax.swing.JTextField();
        temail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tcontact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tuser = new javax.swing.JTextField();
        tpass = new javax.swing.JPasswordField();
        tcpass = new javax.swing.JPasswordField();
        bsubmit = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        blog = new javax.swing.JButton();
        tage = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("First Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("Last Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 90, -1));

        tfirst.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(tfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 130, -1));

        tlast.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(tlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 150, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setText("Address");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Email address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 90, 25));

        taddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(taddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 130, -1));

        temail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temailActionPerformed(evt);
            }
        });
        getContentPane().add(temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 80, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("Contact no");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 24));

        tcontact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(tcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 90, -1));

        bg.add(male);
        male.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        male.setText("male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 174, -1, -1));

        bg.add(female);
        female.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        female.setText("female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 174, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 174, 80, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 2));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel8.setText("Username");

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel9.setText("Password");

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel10.setText("Confirm Password");

        tuser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tpass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tpassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tpassMouseReleased(evt);
            }
        });

        tcpass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tcpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tcpassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tcpassMouseReleased(evt);
            }
        });
        tcpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcpassActionPerformed(evt);
            }
        });

        bsubmit.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bsubmit.setForeground(new java.awt.Color(51, 153, 0));
        bsubmit.setText("Submit");
        bsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubmitActionPerformed(evt);
            }
        });

        result.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bsubmit)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tuser)
                            .addComponent(tpass)
                            .addComponent(tcpass, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tcpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bsubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 550, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel11.setText("Already Have account?");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, 29));

        blog.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        blog.setForeground(new java.awt.Color(0, 0, 255));
        blog.setText("Log in");
        blog.setBorderPainted(false);
        blog.setContentAreaFilled(false);
        blog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogActionPerformed(evt);
            }
        });
        getContentPane().add(blog, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        tage.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        tage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80" }));
        getContentPane().add(tage, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 150, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void temailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temailActionPerformed
        
    }//GEN-LAST:event_temailActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        gender = male.getText();
    }//GEN-LAST:event_maleActionPerformed

    private void tcpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcpassActionPerformed
        
    }//GEN-LAST:event_tcpassActionPerformed

    private void bsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubmitActionPerformed
        try{
            age = parseInt((String) tage.getSelectedItem());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"error");
        }
       
        try{
            
           if(tpass.getText().length()>=6)
           {
            if(tfirst.getText().equals("") || tlast.getText().equals("") || taddress.getText().equals(""))
            {
              JOptionPane.showMessageDialog(null,"Any of these fields cannot be empty");
            }
            else
            {
                if(male.isSelected() || female.isSelected())
            {
                int x = tcontact.getText().length();
                       if(x==10)
                       {
                           if(tpass.getText().equals(tcpass.getText()))
                           {
                               if(tuser.getText().equals(""))
                               {
                                   result.setText("username cannot be empty");
                               }
                               else
                               {
                                   
                                   
                                   if(age >=16 && age <=80)
                                   {
                                       if(tuser.getText().startsWith("1")&&tuser.getText().endsWith("2"))
                                       {
                                           String st = JOptionPane.showInputDialog(null,"Please Enter default admin password");
                                           if(st.equals("password123"))
                                           {
                                               if(temail.getText().equals(""))
                                               {
                                                JOptionPane.showMessageDialog(null,"Email cannot be empty");   
                                               }
                                               else
                                               {
                                                  connectDatabase();
                                                  writeData();
                                                  loginData();
                                                  con.close();  
                                               }
                                        
                                           }
                                           else
                                           {
                                               JOptionPane.showMessageDialog(null,"please enter valid password");
                                           }
                                        
                                       }
                                       else
                                       {
                                           if(temail.getText().equals(""))
                                           {
                                           JOptionPane.showMessageDialog(null,"Email cannot be empty");   
  
                                           }
                                           else
                                           {
                                        connectDatabase();
                                        writeData();
                                        loginData();
                                        con.close();  
                                           }
                                         
                                       }
                                      
                                   }
                                   else
                                   {
                                       JOptionPane.showMessageDialog(null,"Age must be greater than 16 and less than 80");
                                   }
                               }
                           }
                           else
                           {
                               result.setText("Re-Check the password");
                           }
                       }
                        else
                       {
                           JOptionPane.showMessageDialog(null,"Contact number must be equal to 10");
                       }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"please select your gender");
            }  
           }  
           }
           else
           {
               result.setText("Password length must be greater than 6");
           }
 
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_bsubmitActionPerformed

    private void blogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogActionPerformed
       
       l.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_blogActionPerformed

    private void tpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpassMousePressed
       tpass.setEchoChar((char)0);
    }//GEN-LAST:event_tpassMousePressed

    private void tcpassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcpassMouseReleased
        tcpass.setEchoChar('*');
    }//GEN-LAST:event_tcpassMouseReleased

    private void tpassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpassMouseReleased
       tpass.setEchoChar('*');
    }//GEN-LAST:event_tpassMouseReleased

    private void tcpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcpassMousePressed
        tcpass.setEchoChar((char)0);
    }//GEN-LAST:event_tcpassMousePressed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        gender = female.getText();
    }//GEN-LAST:event_femaleActionPerformed
    public void connectDatabase() throws ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/project","root","Sudeep@369");
            //JOptionPane.showMessageDialog(null, "connection established successfully");
        }
        catch(SQLException ee)
        {
            JOptionPane.showMessageDialog(null, ee);
        }
    }
    public void writeData()
    {
       
        try{
            String sql="insert into info(fName,lName,address,email,contact,age,gender,priority) values(?,?,?,?,?,?,?,?)";
            pstm = con.prepareStatement(sql);
            pstm.setString(1,tfirst.getText());
            pstm.setString(2,tlast.getText());
            pstm.setString(3,taddress.getText());
            pstm.setString(4,temail.getText());
            pstm.setString(5,tcontact.getText());
            pstm.setString(6, (String) tage.getSelectedItem());
            pstm.setString(7,gender);
            if(tuser.getText().startsWith("1")&&tuser.getText().endsWith("2"))
            {
                pstm.setString(8,"1");

            }
            else
            {
               pstm.setString(8,"0");
            }
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registered Successfully");
            this.setVisible(false);
            l.setVisible(true);
            
        }
        catch(SQLException eee)
        {
            JOptionPane.showMessageDialog(null, eee);
        }
    }
    public void loginData()
    {
         
                try{
                String s = "insert into login (username,password,email,priority) values(?,?,?,?)";
                p = con.prepareStatement(s);
                p.setString(1,tuser.getText());
                p.setString(2, tpass.getText());
                p.setString(3, temail.getText());
             if(tuser.getText().startsWith("1")&&tuser.getText().endsWith("2"))
            {
              
               p.setString(4,"1");
            }
            else
            {
               p.setString(4,"0");
            }
              p.executeUpdate();
        }
        catch(SQLException eeee){
            JOptionPane.showMessageDialog(null,eeee);
        } 
              
        
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            signup s =new signup();
            s.setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JButton blog;
    private javax.swing.JButton bsubmit;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel result;
    private javax.swing.JTextField taddress;
    private javax.swing.JComboBox<String> tage;
    private javax.swing.JTextField tcontact;
    private javax.swing.JPasswordField tcpass;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tfirst;
    private javax.swing.JTextField tlast;
    private javax.swing.JPasswordField tpass;
    private javax.swing.JTextField tuser;
    // End of variables declaration//GEN-END:variables
}
