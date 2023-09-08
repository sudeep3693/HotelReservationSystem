package hotelreservation;

import static hotelreservation.login.con;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class reservenow extends javax.swing.JInternalFrame {
    public reservenow() {
        initComponents();
    }

   Statement p;
   ResultSet rs;
   public static String room_id, room_type, bed_type,prices;
   public static int x = 0;
   public DefaultTableModel model;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setClosable(true);
        setTitle("Reserve Now");
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

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setDragEnabled(true);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 340));

        setBounds(50, 50, 523, 375);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        try {
            login.connectDatabase();
            getData();  
            con.close();
        } 
        catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error detected");
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try{
            book();
        }
        catch(Exception eee)
        {
            //JOptionPane.showMessageDialog(null,eee);
        }
    }//GEN-LAST:event_tableMouseClicked
    public void getData()
    {
        try
        { 
            String sql = "select * from reservation";
           p = con.createStatement();
           rs = p.executeQuery(sql);
           model = (DefaultTableModel) table.getModel();
           model.setRowCount(0);
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
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,"Error during Insertion in table"); 
        }
    }
    
    public void book()
    {
        try
        {
            int index = table.getSelectedRow();
            DefaultTableModel model1 = (DefaultTableModel) table.getModel();
            String s = (String) model1.getValueAt(index,4);
            room_type = (String)model1.getValueAt(index,1);
            room_id = (String)model1.getValueAt(index,0);
            bed_type = (String)model1.getValueAt(index, 3);
            prices = (String)model1.getValueAt(index,2);
            if(s.equals("available"))
            {
                registeration r  = new registeration();
                r.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"room not available");
            }
        }
        catch(HeadlessException ee)
        {
           JOptionPane.showMessageDialog(null,ee); 
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
