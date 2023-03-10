
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shilpi Mazumdar
 */
public class GuestBookTickets extends javax.swing.JFrame {

    /**
     * Creates new form GuestBookTickets
     */
    
    Connection connection;
    PreparedStatement prestate;
    
    public GuestBookTickets() {
        initComponents();
        try {
            try {
                // To establish connection with the SQL DB and server (link/stream)
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BookTickets.class.getName()).log(Level.SEVERE, null, ex);
            }
            // To establish connection with database
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/airlinemavendatabase", "root", "Lakshmi@06");
        } catch (SQLException ex) {
            Logger.getLogger(GuestBookTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TO create the BookingID automatically for the Ticket
        autoID();
    }
    
    // MOST IMPORTANT FUNCTION FOR CONNECTION WITH SQL DB
    public void autoID() {
        try {
            //The above established connection helps to create statement
            java.sql.Statement statement = connection.createStatement();
            
            // Obtaining and storing the result of the statement and executing query indirectly on MYsql software
            ResultSet res = statement.executeQuery("Select MAX(idbooking) from flighttickets");
            
            // Next pointer/record
            res.next();
        
            //Handling the obtained result
            if(res.getString("MAX(idbooking)") == null) {
                //Setting default customerID when res null
                bookingid.setText("BOOKPS0001");
            } else {
                // Get the MAX result and extract subtring (Last 3 Numbers) and increment
                long iD = Long.parseLong(res.getString("MAX(idbooking)").substring(6,res.getString("MAX(idbooking)").length()));
                iD++;

                bookingid.setText("BOOKPS" + String.format("%03d", iD));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewFlights.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Arrival = new javax.swing.JLabel();
        Departure = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        passengerID = new javax.swing.JTextField();
        CustomerID = new javax.swing.JLabel();
        dot = new com.toedter.calendar.JDateChooser();
        departure1 = new javax.swing.JComboBox<>();
        dateoftravel = new javax.swing.JLabel();
        PassportNo = new javax.swing.JLabel();
        passportno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Autofill = new javax.swing.JButton();
        bookingid = new javax.swing.JTextField();
        BookingID = new javax.swing.JLabel();
        arrival = new javax.swing.JComboBox<>();
        fetch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Adults1 = new javax.swing.JLabel();
        CancelBooking1 = new javax.swing.JButton();
        BookTickets1 = new javax.swing.JButton();
        faretotal = new javax.swing.JTextField();
        fare = new javax.swing.JTextField();
        adults = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightsTable = new javax.swing.JTable();
        Fare = new javax.swing.JLabel();
        Adults = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Arrival.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Arrival.setForeground(new java.awt.Color(255, 255, 255));
        Arrival.setText("Arrival");
        getContentPane().add(Arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        Departure.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Departure.setForeground(new java.awt.Color(255, 255, 255));
        Departure.setText("Departure ");
        getContentPane().add(Departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        Name.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name");
        Name.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 90, -1));

        passengerID.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(passengerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 121, 195, -1));

        CustomerID.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        CustomerID.setForeground(new java.awt.Color(255, 255, 255));
        CustomerID.setText("Passenger ID");
        CustomerID.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(CustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 124, 90, -1));
        getContentPane().add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 129, -1));

        departure1.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        departure1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ", "IGI, New Delhi", "T1, New Delhi", "T2, New Delhi", "Kempegowda, Banglore", "Kormangla, Banglore", "Chattrapati Shivaji, Mumbai", "Navi Mumbai, Mumbai", "Dabolim, Goa", "Panjim, Goa", "Heathrow, London", "Gatwick, London", "Oxford, London", "Changi, Singapore", "Chek Lap Kok, Hong Kong", "Incheon International, South Korea", "Daegu International, South Korea", "Vancouver International, Canada", "Calgary International, Canada", "Toronto Pearson International, Canada", "Denver International, US", "Dallas/Fort Worth International, US", "JFK, US", "Paris Charles de Gaulle, France", "Lyon-Saint Exupery, France", "Frankfurt, Germany", "Hamburg, Germany", "Munich International, Germany", "Abu Dhabi International, UAE", "Dubai International, UAE" }));
        getContentPane().add(departure1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        dateoftravel.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        dateoftravel.setForeground(new java.awt.Color(255, 255, 255));
        dateoftravel.setText("Date of Travel");
        dateoftravel.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(dateoftravel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 90, -1));

        PassportNo.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        PassportNo.setForeground(new java.awt.Color(255, 255, 255));
        PassportNo.setText("Passport No");
        PassportNo.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(PassportNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 90, -1));

        passportno.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(passportno, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 129, -1));

        name.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 189, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("We are excited to turn your travel into reality");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 47, -1, -1));

        Autofill.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Autofill.setText("Autofill Customer Details");
        Autofill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutofillActionPerformed(evt);
            }
        });
        getContentPane().add(Autofill, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 186, -1));

        bookingid.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(bookingid, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 78, 195, -1));

        BookingID.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        BookingID.setForeground(new java.awt.Color(255, 255, 255));
        BookingID.setText("Booking ID");
        BookingID.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(BookingID, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 83, 90, -1));

        arrival.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        arrival.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ", "IGI, New Delhi", "T1, New Delhi", "T2, New Delhi", "Kempegowda, Banglore", "Kormangla, Banglore", "Chattrapati Shivaji, Mumbai", "Navi Mumbai, Mumbai", "Dabolim, Goa", "Panjim, Goa", "Heathrow, London", "Gatwick, London", "Oxford, London", "Changi, Singapore", "Chek Lap Kok, Hong Kong", "Incheon International, South Korea", "Daegu International, South Korea", "Vancouver International, Canada", "Calgary International, Canada", "Toronto Pearson International, Canada", "Denver International, US", "Dallas/Fort Worth International, US", "JFK, US", "Paris Charles de Gaulle, France", "Lyon-Saint Exupery, France", "Frankfurt, Germany", "Hamburg, Germany", "Munich International, Germany", "Abu Dhabi International, UAE", "Dubai International, UAE" }));
        getContentPane().add(arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        fetch.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        fetch.setText("Fetch");
        fetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchActionPerformed(evt);
            }
        });
        getContentPane().add(fetch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to the Ticket Booking Portal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 19, 321, -1));

        Adults1.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Adults1.setForeground(new java.awt.Color(255, 255, 255));
        Adults1.setText("Total Fare");
        Adults1.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(Adults1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 90, -1));

        CancelBooking1.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        CancelBooking1.setText("Cancel Booking");
        CancelBooking1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBooking1ActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBooking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 130, -1));

        BookTickets1.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        BookTickets1.setText("Book Tickets");
        BookTickets1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookTickets1ActionPerformed(evt);
            }
        });
        getContentPane().add(BookTickets1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        faretotal.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        getContentPane().add(faretotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 100, -1));

        fare.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        getContentPane().add(fare, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 129, -1));

        adults.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                adultsStateChanged(evt);
            }
        });
        getContentPane().add(adults, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        flightsTable.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        flightsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Flight Name", "Departure", "Arrival", "Dep Time", "Arrv Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        flightsTable.getTableHeader().setReorderingAllowed(false);
        flightsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(flightsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 460, 224));

        Fare.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Fare.setForeground(new java.awt.Color(255, 255, 255));
        Fare.setText("Fare");
        Fare.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(Fare, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 90, 30));

        Adults.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Adults.setForeground(new java.awt.Color(255, 255, 255));
        Adults.setText("Adults");
        Adults.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(Adults, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 90, -1));

        signup.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        signup.setText("SignUp");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shilpi Mazumdar\\Desktop\\Acciojob Projects\\Airline Mgmt\\wallpaperflare.com_wallpaper4.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AutofillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutofillActionPerformed
        try {
            // To autofill passengerID details
            String id = passengerID.getText();

            prestate = connection.prepareStatement("select * from passengers where idpassengers = ?");
            prestate.setString(1, id);

            ResultSet res = prestate.executeQuery();
            res.next();

            // name.setText(res.getString("FirstName"), " ",res.getString("LastName"));
            name.setText(res.getString("firstName") + " " + res.getString("lastName"));
            passportno.setText(res.getString("passportNo"));
        } catch (SQLException ex) {
            Logger.getLogger(GuestBookTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AutofillActionPerformed

    private void fetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchActionPerformed
        try {
            // To fetch Flight Details :
            int columns;
            String departurE = departure1.getSelectedItem().toString();
            String arrivaL = arrival.getSelectedItem().toString();

            //The above established connection helps to create statement
            java.sql.Statement statement = connection.createStatement();

            prestate = connection.prepareStatement("select * from flights where departure = ? && arrival = ?");
            prestate.setString(1, departurE);
            prestate.setString(2, arrivaL);

            //To get result and display on the table
            ResultSet res = prestate.executeQuery();

            // Helps to push flight fetched data on the UI Table
            ResultSetMetaData resMetaData = res.getMetaData();

            //Count of Total columns
            columns = resMetaData.getColumnCount();

            //In which model we want to display the table contents
            DefaultTableModel defTableModel = (DefaultTableModel) flightsTable.getModel();

            //0th row
            defTableModel.setRowCount(0);

            // Writing over the table
            while(res.next()){

                @SuppressWarnings("UseOfObsoleteCollectionType")
                Vector v2 = new Vector();

                for(int i=1 ; i <= columns ; i++){
                    v2.add(res.getString("flightName"));
                    v2.add(res.getString("departure"));
                    v2.add(res.getString("arrival"));
                    v2.add(res.getString("departuretime"));
                    v2.add(res.getString("arrivaltime"));
                }
                defTableModel.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuestBookTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fetchActionPerformed

    private void CancelBooking1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBooking1ActionPerformed
        // TO dispose the window :
        this.dispose();
    }//GEN-LAST:event_CancelBooking1ActionPerformed

    private void BookTickets1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookTickets1ActionPerformed
        try {
            // To book tickets and store data in DB:
            String passengerid = passengerID.getText();
            if(passengerid.isEmpty()){   
                JOptionPane.showMessageDialog(null,"Please SignUp to Book Tickets !");
                return;
            }       
            
            String arriVal = arrival.getSelectedItem().toString();
            String departurE = departure1.getSelectedItem().toString();
            String namE = name.getText();

            //To fetch flightID from the table
            int row = flightsTable.getSelectedRow();
            String flightname = flightsTable.getModel().getValueAt(row, 0).toString();
            String bookingID = bookingid.getText();

            // Conversion to String
            String adultS = adults.getValue().toString();
            row = flightsTable.getSelectedRow();

            // To retrieve date from jDateChooser Field and storing in a String
            Date date = dot.getDate();
            // Converting date into a string VARCHAR
            DateFormat dateformat = new SimpleDateFormat("dd-mm-yy");
            String dotravel = dateformat.format(date);

            String TotalAmount = faretotal.getText();

            prestate = connection.prepareStatement("insert into flighttickets (idbooking, idpassengers, flightName, name, totalfare, departure, arrival, dot, seatsbooked)values(?,?,?,?,?,?,?,?,?)");
            prestate.setString(1, bookingID);
            prestate.setString(2, passengerid);
            prestate.setString(3, flightname);
            prestate.setString(4, namE);
            prestate.setString(5, TotalAmount);
            prestate.setString(6, departurE);
            prestate.setString(7, arriVal);
            prestate.setString(8,dotravel);
            prestate.setString(9, adultS);

            // IMPORTANT EXECUTE FUNCTION
            prestate.executeUpdate();
            JOptionPane.showMessageDialog(null,"Ticket Booked !");
        } catch (SQLException ex) {
            Logger.getLogger(GuestBookTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BookTickets1ActionPerformed

    private void adultsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_adultsStateChanged
        // JSpinner count increment and fare calculation
        int value = Integer.parseInt(adults.getValue().toString());
        int price = Integer.parseInt(fare.getText());

        String total = Integer.toString(value * price);
        faretotal.setText(total);
    }//GEN-LAST:event_adultsStateChanged

    private void flightsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightsTableMouseClicked
        // To select the particular flight:
        try {
            // When a flight record is clicked from the table, the fare is automatically fetched and displayed
            int column = 0;
            int row = flightsTable.getSelectedRow();
            String value = flightsTable.getModel().getValueAt(row, column).toString();

            java.sql.Statement statement = connection.createStatement();

            prestate = connection.prepareStatement("select * from flights where flightName = ?");
            prestate.setString(1, value);

            ResultSet res = prestate.executeQuery();
            res.next();

            fare.setText(res.getString("fareperperson"));
        } catch (SQLException ex) {
            Logger.getLogger(GuestBookTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_flightsTableMouseClicked

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // To open signup window for the passenger :
        SignUpPassenger signuppassenger = new SignUpPassenger();
        signuppassenger.setVisible(true);
        // To make the MandatoryCheck Window vanish
        this.dispose();
    }//GEN-LAST:event_signupActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuestBookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuestBookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuestBookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuestBookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestBookTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adults;
    private javax.swing.JLabel Adults1;
    private javax.swing.JLabel Arrival;
    private javax.swing.JButton Autofill;
    private javax.swing.JButton BookTickets1;
    private javax.swing.JLabel BookingID;
    private javax.swing.JButton CancelBooking1;
    private javax.swing.JLabel CustomerID;
    private javax.swing.JLabel Departure;
    private javax.swing.JLabel Fare;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel PassportNo;
    private javax.swing.JSpinner adults;
    private javax.swing.JComboBox<String> arrival;
    private javax.swing.JTextField bookingid;
    private javax.swing.JLabel dateoftravel;
    private javax.swing.JComboBox<String> departure1;
    private com.toedter.calendar.JDateChooser dot;
    private javax.swing.JTextField fare;
    private javax.swing.JTextField faretotal;
    private javax.swing.JButton fetch;
    private javax.swing.JTable flightsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField passengerID;
    private javax.swing.JTextField passportno;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
