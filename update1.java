
package hotelreservation;

import static hotelreservation.login.con;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class update1 extends javax.swing.JFrame {

    public update1() {
        initComponents();
    }
    PreparedStatement pstm;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        roomno = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        availability = new javax.swing.JComboBox<>();
        roomtype = new javax.swing.JComboBox<>();
        bedtype = new javax.swing.JComboBox<>();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setText("Room No:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Room Type:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("Price:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Bed Type:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("Availability:");

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        roomno.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        roomno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomnoActionPerformed(evt);
            }
        });

        price.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        availability.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        availability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "available", "Not available" }));

        roomtype.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A/C", "Non A/C" }));

        bedtype.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bedtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "King size", "Queen size", "Deluxe" }));

        cancel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        cancel.setForeground(new java.awt.Color(153, 51, 0));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roomno)
                    .addComponent(price)
                    .addComponent(availability, 0, 125, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roomtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bedtype, 0, 113, Short.MAX_VALUE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(roomno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1)
                    .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roomnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomnoActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        updateuser.countt = 0;
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try{
        roomno.setEditable(false);
        roomno.setText(updateuser.room_no1);
        roomtype.setSelectedItem(updateuser.room_type1);
        bedtype.setSelectedItem(updateuser.bed_type1);
        price.setText(updateuser.pricess1);
        availability.setSelectedItem(updateuser.availability1);  
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            int check = JOptionPane.showConfirmDialog(null,"Are you confirm want to update");
            if(check==0)
            {
            login.connectDatabase();
            updateTable();
            }
            else if(check==1)
            {
                updateuser.countt = 0;
                this.dispose();
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
public void updateTable()
{ 
    String sql = "update reservation set room_type = ?, bed_type = ? , price = ? , availability = ? where room_no = ?";
    try{
        pstm = con.prepareStatement(sql);
        pstm.setString(5,(String)roomno.getText());
        pstm.setString(1,(String)roomtype.getSelectedItem());
        pstm.setString(2,(String)bedtype.getSelectedItem());
        pstm.setString(3,(String)price.getText());
        pstm.setString(4,(String)availability.getSelectedItem());
        pstm.executeUpdate();
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"here error detected "+e);
    }
        updateuser.countt = 0;

    this.dispose();
}


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> availability;
    private javax.swing.JComboBox<String> bedtype;
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField price;
    private javax.swing.JTextField roomno;
    private javax.swing.JComboBox<String> roomtype;
    // End of variables declaration//GEN-END:variables
}
