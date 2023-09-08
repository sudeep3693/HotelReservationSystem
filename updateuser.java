
package hotelreservation;

import static hotelreservation.login.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class updateuser extends javax.swing.JInternalFrame {


    public updateuser() {
        initComponents();
    }
PreparedStatement ps , qs;
 //public static int  y = 0;
 static int countt = 0;
public static updateuser u = new updateuser();

public static String room_no1,room_type1,bed_type1,availability1,pricess1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setClosable(true);
        setToolTipText("");
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

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Room Type", "Price", "Bed Type", "Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        update.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Segoe UI Emoji", 1, 16)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(delete)))
        );

        setBounds(150, 80, 567, 254);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        
        try{
                login.connectDatabase();
                 retrievedata();
                 //y=1;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"here " +e);
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(table1.getSelectedRow()<0)
        {
           JOptionPane.showMessageDialog(null,"Please select a row to update"); 
        }
        else
        {
           setData();
               if(countt==0)
               {
                   int xp = JOptionPane.showConfirmDialog(null,"Are you sure want to update");
                   if(xp==0)
                   {
                    new update1().setVisible(true);
                    countt=1;
                    u.setVisible(false);
                   }
                   else
                   {
                       countt=0;
                   }
                    
               } 
        }
     
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            login.connectDatabase();
            deleteData();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_deleteActionPerformed
    public void deleteData()
    {
        if(table1.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(null,"please select row to delete");
        }
        else
        {
        int checkk = JOptionPane.showConfirmDialog(null, "Are You sure want to delete record");
        if(checkk==0)
        {
        String sql = "delete from reservation  where room_no = ?" ; 
        try
        {
          qs = con.prepareStatement(sql);
          qs.setString(1,String.valueOf(room_no1));
          qs.executeUpdate();
          JOptionPane.showMessageDialog(null,"deleted successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        }
    }
    
    public  void retrievedata()
    {
       DefaultTableModel  model = (DefaultTableModel) table1.getModel();
       model.setRowCount(0);
       String st = "select * from reservation";
       try{
           ps = con.prepareStatement(st);
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
                String roomid = String.valueOf(rs.getInt("room_no"));
                String roomtype = rs.getString("room_type");
                String price = String.valueOf(rs.getInt("price"));
                String bedtype = rs.getString("bed_type");
                String available = rs.getString("availability");
                String data[]={roomid,roomtype,price,bedtype,available};
                model.addRow(data);
           }
       }
       catch(Exception e)
       {
          JOptionPane.showMessageDialog(null,"error in retrieving data "+e); 
       }
    }
    
    public void setData()
    {
        try{
             int index = table1.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            availability1 = (String) model.getValueAt(index,4);
            room_type1 = (String)model.getValueAt(index,1);
            room_no1 = (String)model.getValueAt(index,0);
            bed_type1  = (String)model.getValueAt(index, 3);
            pricess1 = (String)model.getValueAt(index,2);
    }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"error here" );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
