
package hotelreservation;

import static hotelreservation.login.con;
import java.awt.HeadlessException;
import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class registeration extends javax.swing.JFrame {

    public int checkinYear,checkinMonth, checkinDay, checkoutYear, checkoutMonth, checkoutDay;
    public int x,as,prices,noofpeople,food_price,finalprice;
    String checkins, checkouts;
    int flag =0;
    
    PreparedStatement ps,ps1,ps2;
    
    public registeration() {
        initComponents();
    }

    PreparedStatement p;
    Statement st;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        tfirst = new javax.swing.JTextField();
        tlast = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        citizenship = new javax.swing.JTextField();
        province = new javax.swing.JTextField();
        street = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nationality = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        people = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        female = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        roomtype = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        bedtype = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        checkin = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        checkout = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        noofdays = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        roomno = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        food = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        result1 = new javax.swing.JLabel();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfirst.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(tfirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 170, -1));

        tlast.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        getContentPane().add(tlast, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 170, -1));

        bg.add(male);
        male.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        male.setText("Male");
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setText("Contact No:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Reservation's Information");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 688, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel9.setText("Nationality:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Customer's Information");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 324, 27));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel10.setText("CitizenShip Number:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel11.setText("Province:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        citizenship.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel1.add(citizenship, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 288, 170, -1));

        province.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel1.add(province, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 170, -1));

        street.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel1.add(street, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 170, -1));

        city.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 170, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel13.setText("Customer ID:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel12.setText("Street:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("City:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 26));

        id.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 170, 25));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel8.setText("Email address:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        nationality.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        nationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nepal", "India", "U.S.A", "U.K", "U.A.E", "Japan", "Bangladesh", "Australia", "China", "Pakistan", "Afganistan", "Bhutan", "Brazil", "Russia", "South Africa" }));
        jPanel1.add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 170, -1));

        email.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setToolTipText("");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 170, -1));

        contact.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 170, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setText("First Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("Last Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("Age:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        age.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80" }));
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Gender:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel19.setText("No of People:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        people.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        people.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        people.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                peopleItemStateChanged(evt);
            }
        });
        people.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peopleMouseClicked(evt);
            }
        });
        jPanel1.add(people, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 180, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, 324, 4));

        bg.add(female);
        female.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        female.setText("Female");
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 350, 500));

        jPanel2.setBackground(new java.awt.Color(217, 206, 175));

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Room's Detail");

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel16.setText("Room No:");

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel17.setText("Room Type:");

        roomtype.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A/C", "Non A/C" }));

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel18.setText("Bed Type:");

        bedtype.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        bedtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deluxe", "King size", "Queen size" }));

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel20.setText("Per DayPrice:");

        price.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 153, 0));
        jLabel21.setText("Check -In Date:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        checkin.setForeground(new java.awt.Color(51, 153, 0));
        checkin.setDateFormatString("yyyy/MM/dd");
        checkin.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel3.add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 150, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 102, 0));
        jLabel22.setText("Check -Out Date:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        checkout.setDateFormatString("yyyy/MM/dd");
        checkout.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jPanel3.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 150, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel23.setText("No of days :");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        noofdays.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        noofdays.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noofdaysMouseClicked(evt);
            }
        });
        jPanel3.add(noofdays, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 150, -1));

        submit.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        submit.setForeground(new java.awt.Color(51, 51, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 51, 51));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        roomno.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel24.setText("Type of Food:");

        food.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        food.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veg", "Non-Veg", "Vegan" }));
        food.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                foodItemStateChanged(evt);
            }
        });
        food.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                foodMouseEntered(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel25.setText("Total Cost:");

        total.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalMouseClicked(evt);
            }
        });

        result1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        result1.setForeground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(food, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel16)
                        .addGap(73, 73, 73)
                        .addComponent(roomno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel17)
                        .addGap(62, 62, 62)
                        .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18)
                        .addGap(75, 75, 75)
                        .addComponent(bedtype, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel20)
                        .addGap(54, 54, 54)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submit))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel25)
                                .addGap(79, 79, 79)
                                .addComponent(total)))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(result1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel15)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel16))
                    .addComponent(roomno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel17))
                    .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(bedtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(food, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(submit)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 330, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try{
            login.connectDatabase();
            roomno.setText(reservenow.room_id);
            roomtype.setSelectedItem(reservenow.room_type);
            roomtype.setEnabled(false);
            price.setText(reservenow.prices);
            price.setEditable(false);
            bedtype.setSelectedItem(reservenow.bed_type);
            bedtype.setEnabled(false);
            checkReservation();
            fromSignup();
            con.close();
        }
        catch(ClassNotFoundException | SQLException ee)
        {
          JOptionPane.showMessageDialog(null,ee);  
        }
    }//GEN-LAST:event_formWindowActivated

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

     public void checkReservation()
     {
         String sql = "select C_Id from reservedetail";
         try{
            st =  con.createStatement();
            ResultSet rss = st.executeQuery(sql);
            while(rss.next())
            {
                if(id.getText().equals(rss.getString("C_Id")))
                {
                    this.setVisible(false);
                    //JOptionPane.showMessageDialog(null,"You already have reservation");
                }
               
            }
         }
          catch(Exception e)
          {
              
          }
     }
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try{
           if(as>=0)
        {
            if(tfirst.getText().equals("")||tlast.getText().equals("")||contact.getText().equals("")||email.getText().equals("")||citizenship.getText().equals("")||province.getText().equals("")||city.getText().equals("")||street.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Enter the details properly");
            }
            else
            {
                if(!male.isSelected()||!female.isSelected())
                {
                   if(finalprice!=0) 
                   {
                       int xy = JOptionPane.showConfirmDialog(null,"Are you sure want to reserve");
                       if(xy==0)
                       {
                     login.connectDatabase();
                     retrieveReservation();

                     con.close();
                       }
                   }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please select your gender.");
                }
            }
        } 
           else{
               JOptionPane.showMessageDialog(null,"Please Select date");
           }
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_submitActionPerformed
     
    public void retrieveReservation()
    {
        String sql = "select room_no from reservedetail";
        try{
            ps1 = con.prepareStatement(sql);
           ResultSet rs= ps1.executeQuery();
           while(rs.next())
           {
               String roomno1 = rs.getString("room_no");
               String xy = roomno.getText();
              
               if(roomno1.equals((String)xy))
               {
                   flag = 1;
               }
               else
               {
                   flag = 0;
               }
               
           }
           if(flag == 0)
           {
               insertReservation();
               setAvailibility();
               JOptionPane.showMessageDialog(null,"Success");
               resetdata();
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Room is already Occupied");
                                                    
           }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void setAvailibility()
    {
        String sql = "update reservation set availability = 'Not available' where room_no = ?";
        try
        {
            ps2 = con.prepareStatement(sql);
            ps2.setString(1, String.valueOf(roomno.getText()));
            ps2.executeUpdate();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void insertReservation()
{
    String sql ="insert into reservedetail(room_type , bed_type , price , first_name , last_name , age , contact , email , nationality , province , city  , street , C_Id , no_people , checkout_date , checkin_date , noofdays , typeoffood , total_cost , gender , citizen_no , room_no ) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    try
    {
       ps = con.prepareCall(sql);
       ps.setString(1, roomtype.getSelectedItem().toString());
       ps.setString(2,bedtype.getSelectedItem().toString());
       ps.setString(3,price.getText());
       ps.setString(4,tfirst.getText());
       ps.setString(5,tlast.getText());
       ps.setString(6,age.getSelectedItem().toString());
       ps.setString(7,contact.getText());
       ps.setString(8,email.getText());
       ps.setString(9,nationality.getSelectedItem().toString());
       ps.setString(10,province.getText());
       ps.setString(11,city.getText());
       ps.setString(12,street.getText());
       ps.setString(13,id.getText());
       ps.setString(14,people.getSelectedItem().toString());
       ps.setString(15,checkouts);
       ps.setString(16,checkins);
       ps.setString(17,noofdays.getText());
       ps.setString(18,food.getSelectedItem().toString());
       ps.setString(19,String.valueOf(finalprice));
       ps.setString(21,citizenship.getText());
       ps.setString(22,roomno.getText());
       if(male.isSelected())
       {
           ps.setString(20,"male");
       }
       else if(female.isSelected())
       {
           ps.setString(20,"female");
       }
       else
       {
           
       }
       
       
       
       ps.executeUpdate();
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
}

    private void noofdaysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noofdaysMouseClicked
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            checkins = sdf.format(checkin.getDate());
            checkouts = sdf.format(checkout.getDate());
            checkinYear = parseInt(checkins.substring(0, 4));
            checkinMonth = parseInt(checkins.substring(5,7));
            checkinDay = parseInt(checkins.substring(8));

            checkoutYear = parseInt(checkouts.substring(0, 4));
            checkoutMonth = parseInt(checkouts.substring(5,7));
            checkoutDay = parseInt(checkouts.substring(8));
            noofdays.setEditable(false);
            if(!checkins.isEmpty() && !checkouts.isEmpty())
            {
            DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate d1 = LocalDate.parse(checkins,d);
            LocalDate d2 = LocalDate.parse(checkouts,d);
            x = (int)ChronoUnit.DAYS.between(d1,d2);

          
           LocalDate current = LocalDate.now();
           as = (int)ChronoUnit.DAYS.between(current,d1);


                  if(as>=0)
           {
             if(x>0)
            {

                noofdays.setText(String.valueOf(x));
            }
            else
            {
                noofdays.setText("");
                JOptionPane.showMessageDialog(null, "No of days must be atleast 1 day or checkout date cannot come before check in date");                    
            } 
           }
           else
           {
               JOptionPane.showMessageDialog(rootPane, "Checkin date mustnot be past date");
           }
           
        

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Date field cannot be empty");
            }
       

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "please check your detail properly");
        }

    }//GEN-LAST:event_noofdaysMouseClicked

    private void totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalMouseClicked

        {
            if(food.getSelectedItem().equals("Veg"))
            {
                food_price = 500;
            }
            else if(food.getSelectedItem().equals("Non-Veg"))
            {
                food_price = 1000;
            }
            else
            {
                food_price = 400;
            }
        }
        prices = parseInt(price.getText());
        finalprice = prices * x + food_price * x * noofpeople;
        total.setText(String.valueOf(finalprice));
    }//GEN-LAST:event_totalMouseClicked

    public void resetdata()
    {
         try{
               tfirst.setText("");
               tlast.setText("");
               age.setSelectedItem("");
               contact.setText("");
               email.setText("");
               id.setText("");
               male.setSelected(false);
               female.setSelected(false);
               citizenship.setText("");
               province.setText("");
               street.setText("");
               city.setText("");
               people.setSelectedItem("1");
               age.setSelectedItem("16");
               noofdays.setText("");
               result1.setText("");
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"Error detected while reseting");
    }
    }
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        try{
               tfirst.setText("");
               tlast.setText("");
               age.setSelectedItem("");
               contact.setText("");
               email.setText("");
               id.setText("");
               male.setSelected(false);
               female.setSelected(false);
               citizenship.setText("");
               province.setText("");
               street.setText("");
               city.setText("");
               people.setSelectedItem("1");
               age.setSelectedItem("16");
               noofdays.setText("");
               result1.setText("");
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"Error detected while reseting");
    }
    }//GEN-LAST:event_resetActionPerformed

    private void peopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peopleMouseClicked
        
    }//GEN-LAST:event_peopleMouseClicked

    private void peopleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_peopleItemStateChanged
        String no = (String) people.getSelectedItem();
        noofpeople = parseInt(no);
        
        if(roomtype.getSelectedItem().equals("A/C"))
        {
           if(bedtype.getSelectedItem().equals("Deluxe")&&noofpeople>4) 
           { 
                   JOptionPane.showMessageDialog(null,"Maximum capacity is 4 people");
                   people.setSelectedItem("4");
           }
           else if(bedtype.getSelectedItem().equals("King size")&&noofpeople>5)
           {
               JOptionPane.showMessageDialog(null, "Maximum capacity is 5 people");
               people.setSelectedItem("5");
           }
           else
           {
               if(noofpeople>6)
               {
               JOptionPane.showMessageDialog(null,"Maximum capacity is 6 people");
               people.setSelectedItem("6");
               }
              
           }
        }
        else
        {
          if(bedtype.getSelectedItem().equals("Deluxe")&&noofpeople>6) 
           { 
                   JOptionPane.showMessageDialog(null,"Maximum capacity is 6 people");
                   people.setSelectedItem("6");
           }
           else if(bedtype.getSelectedItem().equals("King size")&&noofpeople>8)
           {
               JOptionPane.showMessageDialog(null, "Maximum capacity is 8");
               people.setSelectedItem("8");
           }
           else
           {
               if(noofpeople>9)
               {
               JOptionPane.showMessageDialog(null,"Maximum capacity is 9");
               people.setSelectedItem("9");
               }
              
           }  
        }
        total.setText("Click Me");
    }//GEN-LAST:event_peopleItemStateChanged

    private void foodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodMouseEntered
   
    }//GEN-LAST:event_foodMouseEntered

    private void foodItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_foodItemStateChanged
        if(food.getSelectedItem().equals("Veg"))
        {
            result1.setText("*500 Per Person");
        }
        else if(food.getSelectedItem().equals("Non-Veg"))
        {
         result1.setText("*1000 Per Person");
        }
        else
        {
            result1.setText("*400 Per Person");
        }
        
        total.setText("Click Me");
    }//GEN-LAST:event_foodItemStateChanged

    public void fromSignup()
    {
        {
         if(food.getSelectedItem().equals("Veg"))
        {
            result1.setText("*500 Per Person");
        }
        else if(food.getSelectedItem().equals("Non-Veg"))
        {
         result1.setText("*1000 Per Person");
        }
        else
        {
            result1.setText("*400 Per Person");
        }
        }
         String no = (String) people.getSelectedItem();
         noofpeople = parseInt(no);
         total.setText("Click Here..");
         total.setEditable(false);
        String st = "select * from info where email = (select email from login where username = ?)";
        try{
            p = con.prepareStatement(st);
            p.setString(1, login.s);
            ResultSet rs = p.executeQuery();
            if(rs.next())
            {
               tfirst.setText(rs.getString("fName"));
               tlast.setText(rs.getString("lName"));
               age.setSelectedItem(rs.getString("age"));
               contact.setText(rs.getString("contact"));
               email.setText(rs.getString("email"));
               id.setText(rs.getString("id"));
               if(rs.getString("gender").equals("male"))
               {
                  male.setSelected(true); 
               }
               else{
                   female.setSelected(true);
               }
            }
        }
        catch(SQLException eee)
        {
            JOptionPane.showMessageDialog(null,eee);
        }
        
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registeration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registeration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> age;
    private javax.swing.JComboBox<String> bedtype;
    private javax.swing.ButtonGroup bg;
    private com.toedter.calendar.JDateChooser checkin;
    private com.toedter.calendar.JDateChooser checkout;
    private javax.swing.JTextField citizenship;
    private javax.swing.JTextField city;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JComboBox<String> food;
    private javax.swing.JLabel id;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton male;
    private javax.swing.JComboBox<String> nationality;
    private javax.swing.JTextField noofdays;
    private javax.swing.JComboBox<String> people;
    private javax.swing.JTextField price;
    private javax.swing.JTextField province;
    private javax.swing.JButton reset;
    private javax.swing.JLabel result1;
    private javax.swing.JLabel roomno;
    private javax.swing.JComboBox<String> roomtype;
    private javax.swing.JTextField street;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tfirst;
    private javax.swing.JTextField tlast;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
