
package hotelreservation;
import static hotelreservation.AddRoom.aaaa;
import javax.swing.JOptionPane;
public class home extends javax.swing.JFrame {
    
    public home() {
        initComponents();
    }
    public static delete d = new delete();
    public static account a = new account();
    public static change c = new change();
    public static myreservation mr = new myreservation();
    public static updateuser up = new updateuser();
    public static reservenow rn = new reservenow();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        image = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        detail = new javax.swing.JMenuItem();
        change = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        res = new javax.swing.JMenu();
        myreservation = new javax.swing.JMenuItem();
        reservenow = new javax.swing.JMenuItem();
        update = new javax.swing.JMenu();
        addroom = new javax.swing.JMenuItem();
        updateroom = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Reservation System");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        img.setIcon(new javax.swing.ImageIcon("E:\\html data\\Bim5\\logo.jpg")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel1.setText("             IMPERIAL HOTEL RESERVATION ");
        jLabel1.setAlignmentX(10.0F);

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel2.setText("SYSTEM");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel3.setText("Khapaudi, Pokhara-23, Kaski, Nepal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(img)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(223, 223, 223))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 110));

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));
        desktopPane.setOpaque(false);

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelreservation/hotel.jpg"))); // NOI18N
        jDesktopPane1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 751, -1));

        desktopPane.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 750, 520));

        menubar.setBackground(new java.awt.Color(204, 204, 255));
        menubar.setBorder(null);
        menubar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        menubar.setOpaque(true);

        jMenu1.setText("Account");
        jMenu1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.add(jSeparator1);

        detail.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        detail.setText("Your Detail");
        detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailMouseClicked(evt);
            }
        });
        detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailActionPerformed(evt);
            }
        });
        jMenu1.add(detail);

        change.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        change.setText("Change Password");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        jMenu1.add(change);

        delete.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        delete.setText("Delete Account");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jMenu1.add(delete);

        menubar.add(jMenu1);

        res.setText("Reservation");
        res.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        myreservation.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        myreservation.setText("My Reservation");
        myreservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myreservationActionPerformed(evt);
            }
        });
        res.add(myreservation);

        reservenow.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        reservenow.setText("Reserve Now");
        reservenow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservenowActionPerformed(evt);
            }
        });
        res.add(reservenow);

        menubar.add(res);

        update.setText("Update");
        update.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        addroom.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        addroom.setText("Add Room");
        addroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addroomActionPerformed(evt);
            }
        });
        update.add(addroom);

        updateroom.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        updateroom.setText("Update Room");
        updateroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateroomActionPerformed(evt);
            }
        });
        update.add(updateroom);

        menubar.add(update);

        logout.setText("Log Out");
        logout.setBorderPainted(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logout.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        logout.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                logoutMenuSelected(evt);
            }
        });
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        menubar.add(logout);

        setJMenuBar(menubar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
       
    }//GEN-LAST:event_jMenu1MenuSelected

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

    }//GEN-LAST:event_logoutActionPerformed

    private void logoutMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_logoutMenuSelected
        
    }//GEN-LAST:event_logoutMenuSelected

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int b = JOptionPane.showConfirmDialog(rootPane, "Are you sure want to log out? ");
        if(b==0)
        {
          login l = new login();
        l.setVisible(true);
        this.setVisible(false);  
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void detailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailMouseClicked
        
    }//GEN-LAST:event_detailMouseClicked

    private void detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailActionPerformed
           mr.setVisible(false);
           d.setVisible(false);
           c.setVisible(false);
           rn.setVisible(false);
           a.setVisible(false);
        try{ 
           
        desktopPane.add(a).setVisible(true);}
       catch(Exception e){
           
       }
        
    }//GEN-LAST:event_detailActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
           a.setVisible(false);
           d.setVisible(false);
           mr.setVisible(false);
           rn.setVisible(false);
           c.setVisible(false);
        try{
           
       desktopPane.add(c).setVisible(true);
        }
        catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_changeActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
           a.setVisible(false);
           mr.setVisible(false);
           c.setVisible(false);
           rn.setVisible(false);
           d.setVisible(false);
        try{
         
        desktopPane.add(d).setVisible(true);
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void reservenowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservenowActionPerformed
           a.setVisible(false);
           d.setVisible(false);
           c.setVisible(false);
           mr.setVisible(false);
        try{
          
           desktopPane.add(rn).setVisible(true);
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);  
        }
        
       
    }//GEN-LAST:event_reservenowActionPerformed

    private void myreservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myreservationActionPerformed
       
           a.setVisible(false);
           d.setVisible(false);
           c.setVisible(false);
           rn.setVisible(false);
        try{
            desktopPane.add(mr).setVisible(true);
        } 
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }   
        
       
    }//GEN-LAST:event_myreservationActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(login.priorit == 1)
        {
            //JOptionPane.showMessageDialog(null,xyz);
            menubar.remove(res);
        }
        
        else
        {
            menubar.remove(update);
            //JOptionPane.showMessageDialog(null,xyz);

        }
    }//GEN-LAST:event_formWindowActivated

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
           //
    }//GEN-LAST:event_updateActionPerformed

    private void updateroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateroomActionPerformed
           a.setVisible(false);
           d.setVisible(false);
           c.setVisible(false);
           rn.setVisible(false);
           mr.setVisible(false);
           aaaa.setVisible(false);
           try
           {
            desktopPane.add(up).setVisible(true);
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,e);
           }
    }//GEN-LAST:event_updateroomActionPerformed

    private void addroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addroomActionPerformed
           a.setVisible(false);
           d.setVisible(false);
           c.setVisible(false);
           rn.setVisible(false);
           mr.setVisible(false);
           up.setVisible(false);
           try
           {
            desktopPane.add(aaaa).setVisible(true);
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,e);
           }
    }//GEN-LAST:event_addroomActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new home().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addroom;
    private javax.swing.JMenuItem change;
    private javax.swing.JMenuItem delete;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem detail;
    private javax.swing.JLabel image;
    private javax.swing.JLabel img;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu logout;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem myreservation;
    private javax.swing.JMenu res;
    private javax.swing.JMenuItem reservenow;
    private javax.swing.JMenu update;
    private javax.swing.JMenuItem updateroom;
    // End of variables declaration//GEN-END:variables

}
