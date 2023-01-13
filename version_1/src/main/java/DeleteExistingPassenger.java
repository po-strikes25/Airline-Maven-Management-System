
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Shilpi Mazumdar
 */
public class DeleteExistingPassenger extends javax.swing.JInternalFrame {

    /**
     * Creates new form SearchPassenger
     */
    Connection connection;
    PreparedStatement prestate;
    public DeleteExistingPassenger() throws SQLException {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeleteExistingPassenger.class.getName()).log(Level.SEVERE, null, ex);
        }
        connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/airlinemavendatabase", "root", "Lakshmi@06");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContactNo = new javax.swing.JLabel();
        EmailAddress = new javax.swing.JLabel();
        contactNo = new javax.swing.JTextField();
        PassportNo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        passportNo = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        CustomerID = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        passengerid = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        deletepassengeraccount = new javax.swing.JButton();
        dob = new com.toedter.calendar.JDateChooser();
        FirstName = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        firstName = new javax.swing.JTextField();
        Female = new javax.swing.JRadioButton();
        DateOfBirth = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchDatabase = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContactNo.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        ContactNo.setForeground(new java.awt.Color(255, 255, 255));
        ContactNo.setText("Contact No");
        getContentPane().add(ContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 97, -1));

        EmailAddress.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        EmailAddress.setForeground(new java.awt.Color(255, 255, 255));
        EmailAddress.setText("E-mail address");
        getContentPane().add(EmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 97, -1));

        contactNo.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(contactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 160, -1));

        PassportNo.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        PassportNo.setForeground(new java.awt.Color(255, 255, 255));
        PassportNo.setText("Passport No");
        getContentPane().add(PassportNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 97, -1));

        address.setColumns(20);
        address.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 240, 90));

        passportNo.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(passportNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 157, -1));

        LastName.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("Last Name");
        getContentPane().add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 97, -1));

        CustomerID.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        CustomerID.setForeground(new java.awt.Color(255, 255, 255));
        CustomerID.setText("Passenger ID");
        getContentPane().add(CustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 112, 26));

        lastName.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 160, -1));

        passengerid.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        passengerid.setText("Please enter Passenger ID");
        getContentPane().add(passengerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 180, -1));

        Gender.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender");
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 97, -1));

        deletepassengeraccount.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        deletepassengeraccount.setText("Delete Passenger Account ?");
        deletepassengeraccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletepassengeraccountActionPerformed(evt);
            }
        });
        getContentPane().add(deletepassengeraccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 200, -1));
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 157, -1));

        FirstName.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("First Name");
        getContentPane().add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 97, -1));

        Male.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Male.setForeground(new java.awt.Color(255, 255, 255));
        Male.setText("Male");
        getContentPane().add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        firstName.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 157, -1));

        Female.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        Female.setForeground(new java.awt.Color(255, 255, 255));
        Female.setText("Female");
        getContentPane().add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        DateOfBirth.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        DateOfBirth.setForeground(new java.awt.Color(255, 255, 255));
        DateOfBirth.setText("Date of Birth");
        getContentPane().add(DateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 97, -1));

        Address.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setText("Address");
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 97, -1));

        email.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 180, -1));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please provide the below details to search the database");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 370, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Passenger Database");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 180, -1));

        searchDatabase.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        searchDatabase.setText("Search Database");
        searchDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDatabaseActionPerformed(evt);
            }
        });
        getContentPane().add(searchDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 150, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shilpi Mazumdar\\Desktop\\Acciojob Projects\\Airline Mgmt\\wallpaperflare.com_wallpaper4 (1).jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 740, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDatabaseActionPerformed
        // To autofill passengerID details
        String id = passengerid.getText();
        try {
            prestate = connection.prepareStatement("select * from passengers where idpassengers= ?");
            prestate.setString(1, id);

            ResultSet res = prestate.executeQuery();
            res.next();

            // name.setText(res.getString("FirstName"), " ",res.getString("LastName"));
            firstName.setText(res.getString("firstName"));
            lastName.setText(res.getString("lastName"));
            email.setText(res.getString("email"));
            passportNo.setText(res.getString("passPortNo"));
            address.setText(res.getString("address"));
            contactNo.setText(res.getString("contactNo"));

            // Date Format
            String date = res.getString("dob");
            // Converting string VARCHAR into date
            Date dateformat = null;
            try {
                dateformat = new SimpleDateFormat("dd-mmm-yyyy").parse(date);
            } catch (ParseException ex) {
                Logger.getLogger(SearchPassenger.class.getName()).log(Level.SEVERE, null, ex);
            }
            dob.setDate(dateformat);

            // To set Gender
            String str = res.getString("gender");
            if(str.equals("Male"))
            Male.setSelected(true);
            else if(str.equals("Female"))
            Female.setSelected(true);

        } catch (SQLException ex) {
            Logger.getLogger(DeleteExistingPassenger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchDatabaseActionPerformed

    private void deletepassengeraccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletepassengeraccountActionPerformed
        try {
            // To delete entry from the database :
            String passengerID = passengerid.getText();
            prestate = connection.prepareStatement("delete from passengers where idpassengers = ?");
            prestate.setString(1, passengerID);
            
            prestate.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Account Deleted Successfully !");
            
        } catch (SQLException ex) {
            Logger.getLogger(DeleteExistingPassenger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deletepassengeraccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel ContactNo;
    private javax.swing.JLabel CustomerID;
    private javax.swing.JLabel DateOfBirth;
    private javax.swing.JLabel EmailAddress;
    private javax.swing.JRadioButton Female;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel LastName;
    private javax.swing.JRadioButton Male;
    private javax.swing.JLabel PassportNo;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField contactNo;
    private javax.swing.JButton deletepassengeraccount;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField passengerid;
    private javax.swing.JTextField passportNo;
    private javax.swing.JButton searchDatabase;
    // End of variables declaration//GEN-END:variables
}
