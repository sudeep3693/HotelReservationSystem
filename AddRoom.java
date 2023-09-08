
package hotelreservation;

import static hotelreservation.login.con;
import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class AddRoom extends javax.swing.JInternalFrame {

    public AddRoom() {
        initComponents();
    }
PreparedStatement ps;
  public static AddRoom aaaa = new AddRoom();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        availability = new javax.swing.JComboBox<>();
        bedtype = new javax.swing.JComboBox<>();
        roomtype = new javax.swing.JComboBox<>();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setText("Room Type: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Bed Type:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("Availability:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Price");

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        price.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        availability.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        availability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "available", "Not available" }));

        bedtype.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bedtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "King size", "Queen size", "Deluxe" }));

        roomtype.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A/C", "Non A/C" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(price)
                    .addComponent(availability, 0, 145, Short.MAX_VALUE)
                    .addComponent(bedtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bedtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setBounds(150, 80, 316, 265);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            if(parseInt(price.getText())<1000)
            {
                    JOptionPane.showMessageDialog(null,"Price should not be less than 1000");
                
            }
            else
            {
            login.connectDatabase();
            add(); 
            }
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void add()
    {
        int cd = JOptionPane.showConfirmDialog(null,"Are you sure want to add");
        if(cd==0)
        {
           
                 String sql = "insert into reservation(room_type,bed_type,price,availability) values(?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,(String)roomtype.getSelectedItem());
            ps.setString(2, (String)bedtype.getSelectedItem());
            ps.setString(3, price.getText());
            ps.setString(4,(String)availability.getSelectedItem());
            ps.executeUpdate();
            price.setText("");
            this.dispose();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
            }
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> availability;
    private javax.swing.JComboBox<String> bedtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> roomtype;
    // End of variables declaration//GEN-END:variables
}
