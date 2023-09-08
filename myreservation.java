
package hotelreservation;

import static hotelreservation.login.con;
import static hotelreservation.login.s;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class myreservation extends javax.swing.JInternalFrame {

    public myreservation() {
        initComponents();
    }
     String pqr = null;
    PreparedStatement p;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        checkin = new javax.swing.JLabel();
        checkout = new javax.swing.JLabel();
        noofdays = new javax.swing.JLabel();
        noofpeople = new javax.swing.JLabel();
        typeofmeal = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        cid = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        agee = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cidd = new javax.swing.JLabel();
        tname = new javax.swing.JLabel();
        taddress = new javax.swing.JLabel();
        tcontact = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        roomno = new javax.swing.JLabel();
        checkindate = new javax.swing.JLabel();
        checkoutdate = new javax.swing.JLabel();
        noofdaays = new javax.swing.JLabel();
        noofpeoplee = new javax.swing.JLabel();
        typeofmeall = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        jLabel18.setText("jLabel18");

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Your Reservation");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 320, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Customer Id:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 10, 230));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Address:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("Contact No:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setText("Room no:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 91, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel8.setText("Check In Date:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 119, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel9.setText("Check Out Date:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 147, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel10.setText("No of People:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 203, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel11.setText("Type of Meal:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 231, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel12.setText("No of Days:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 175, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel13.setText("Total Price:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 259, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 118, -1, -1));
        getContentPane().add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 118, 132, -1));
        getContentPane().add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 145, 132, -1));
        getContentPane().add(noofdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 174, 132, -1));
        getContentPane().add(noofpeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 201, 132, -1));
        getContentPane().add(typeofmeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 229, 132, -1));
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 257, 132, -1));
        getContentPane().add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, -1));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 148, 150, -1));
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 174, 150, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Age:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        getContentPane().add(agee, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 208, 150, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("Your detail");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 130, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jLabel17.setText("Room detail");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        cidd.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(cidd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, 18));
        cidd.getAccessibleContext().setAccessibleName("");
        cidd.getAccessibleContext().setAccessibleDescription("");

        tname.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 130, 18));
        tname.getAccessibleContext().setAccessibleName("");
        tname.getAccessibleContext().setAccessibleDescription("");

        taddress.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(taddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 130, 18));
        taddress.getAccessibleContext().setAccessibleName("");
        taddress.getAccessibleContext().setAccessibleDescription("");

        tcontact.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(tcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 130, 18));
        tcontact.getAccessibleContext().setAccessibleName("");
        tcontact.getAccessibleContext().setAccessibleDescription("");

        age.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 130, 18));
        age.getAccessibleContext().setAccessibleName("");
        age.getAccessibleContext().setAccessibleDescription("");

        roomno.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(roomno, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 130, 18));
        roomno.getAccessibleContext().setAccessibleName("");
        roomno.getAccessibleContext().setAccessibleDescription("");

        checkindate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(checkindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 130, 18));
        checkindate.getAccessibleContext().setAccessibleName("");
        checkindate.getAccessibleContext().setAccessibleDescription("");

        checkoutdate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(checkoutdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 130, 18));
        checkoutdate.getAccessibleContext().setAccessibleName("");
        checkoutdate.getAccessibleContext().setAccessibleDescription("");

        noofdaays.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(noofdaays, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 130, 18));
        noofdaays.getAccessibleContext().setAccessibleName("");
        noofdaays.getAccessibleContext().setAccessibleDescription("");

        noofpeoplee.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(noofpeoplee, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 130, 18));
        noofpeoplee.getAccessibleContext().setAccessibleName("");
        noofpeoplee.getAccessibleContext().setAccessibleDescription("");

        typeofmeall.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(typeofmeall, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 130, 18));
        typeofmeall.getAccessibleContext().setAccessibleName("");
        typeofmeall.getAccessibleContext().setAccessibleDescription("");

        total.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 130, 18));
        total.getAccessibleContext().setAccessibleName("");
        total.getAccessibleContext().setAccessibleDescription("");

        setBounds(50, 50, 616, 345);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       
            try{
           login.connectDatabase();
           retrieveData();
           
            }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error detected" + e);
        } 
        
        
       
       
    }//GEN-LAST:event_formInternalFrameActivated

    public void retrieveData()
    {
        String sql = "select * from reservedetail where C_id = (select id from info where email =(select email from login where username = ?)) ";
            
        
        try{
            p = con.prepareStatement(sql);
            p.setString(1, s);
            ResultSet rs = p.executeQuery();
           if(rs.next())
            {
                cidd.setText(rs.getString(12));
                tname.setText(rs.getString(4).concat(" ").concat(rs.getString(5)));
                taddress.setText(rs.getString(9) .concat(" ").concat(rs.getString(10)));
                tcontact.setText(rs.getString(7));
                age.setText(rs.getString(6));
                roomno.setText((rs.getString(22)));
                checkindate.setText(rs.getString(15));
                checkoutdate.setText(rs.getString(14));
                noofdaays.setText(rs.getString(16));
                noofpeoplee.setText(rs.getString(13));
                typeofmeall.setText(rs.getString(17));
                total.setText(rs.getString(18));
            }
           
            else
                {
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null,"No Reservation Yet.");
                }
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,e) ;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JLabel agee;
    private javax.swing.JLabel checkin;
    private javax.swing.JLabel checkindate;
    private javax.swing.JLabel checkout;
    private javax.swing.JLabel checkoutdate;
    private javax.swing.JLabel cid;
    private javax.swing.JLabel cidd;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel noofdaays;
    private javax.swing.JLabel noofdays;
    private javax.swing.JLabel noofpeople;
    private javax.swing.JLabel noofpeoplee;
    private javax.swing.JLabel price;
    private javax.swing.JLabel roomno;
    private javax.swing.JLabel taddress;
    private javax.swing.JLabel tcontact;
    private javax.swing.JLabel tname;
    private javax.swing.JLabel total;
    private javax.swing.JLabel typeofmeal;
    private javax.swing.JLabel typeofmeall;
    // End of variables declaration//GEN-END:variables
}
