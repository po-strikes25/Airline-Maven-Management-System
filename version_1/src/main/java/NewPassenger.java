
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
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
public class NewPassenger extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewPassenger
     */
    Connection connection;
    PreparedStatement prestatement;
    
    public NewPassenger() {
        initComponents();
        try {
            try {
                // To establish connection with the SQL DB and server (link/stream)
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NewPassenger.class.getName()).log(Level.SEVERE, null, ex);
            }
            // To establish connection with database
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/airlinemavendatabase", "root", "Lakshmi@06");
        } catch (SQLException ex) {
            Logger.getLogger(NewPassenger.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TO create the PassengerID automatically for the Passenger
        autoID();
    }
    
    // MOST IMPORTANT FUNCTION FOR CONNECTION WITH SQL DB
    public void autoID() {
        try {
            //The above established connection helps to create statement
            java.sql.Statement statement = connection.createStatement();
            
            // Obtaining and storing the result of the statement and executing query indirectly on MYsql software
            ResultSet res = statement.executeQuery("Select MAX(idpassengers) from passengers");
            
            // Next pointer/record
            res.next();
        
            //Handling the obtained result
            if(res.getString("MAX(idpassengers)") == null) {
                //Setting default customerID when res null
                passengerID.setText("PSGR660001");
            } else {
                // Get the MAX result and extract subtring (Last 3 Numbers) and increment
                long iD = Long.parseLong(res.getString("MAX(idpassengers)").substring(6,res.getString("MAX(idpassengers)").length()));
                iD++;

                passengerID.setText("PSGR66" + String.format("%03d", iD));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewPassenger.class.getName()).log(Level.SEVERE, null, ex);
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

        banner = new javax.swing.JLabel();
        PassengerID = new javax.swing.JLabel();
        passengerID = new javax.swing.JTextField();
        FirstName = new javax.swing.JLabel();
        DOB = new javax.swing.JLabel();
        PassportNo = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Contactno = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        passportno = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        address = new javax.swing.JScrollPane();
        addresss = new javax.swing.JTextArea();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        finishregistration = new javax.swing.JButton();
        cancelregistration = new javax.swing.JButton();
        resetdata = new javax.swing.JButton();
        backgroundpic = new javax.swing.JLabel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(786, 489));
        setMinimumSize(new java.awt.Dimension(786, 489));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banner.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        banner.setForeground(new java.awt.Color(255, 255, 255));
        banner.setText("New Passenger Registration Portal");
        getContentPane().add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 14, 297, 29));

        PassengerID.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        PassengerID.setForeground(new java.awt.Color(255, 255, 255));
        PassengerID.setText("Passenger ID");
        getContentPane().add(PassengerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 63, 89, -1));

        passengerID.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(passengerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 61, 160, -1));

        FirstName.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("First Name");
        getContentPane().add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 103, 89, -1));

        DOB.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        DOB.setForeground(new java.awt.Color(255, 255, 255));
        DOB.setText("Date of Birth");
        getContentPane().add(DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 141, 89, -1));

        PassportNo.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        PassportNo.setForeground(new java.awt.Color(255, 255, 255));
        PassportNo.setText("Passport No.");
        getContentPane().add(PassportNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 183, 89, -1));

        Email.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email ");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 223, 89, -1));

        Address.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setText("Address");
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 261, 89, -1));

        Gender.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender");
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 182, 89, -1));

        Contactno.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        Contactno.setForeground(new java.awt.Color(255, 255, 255));
        Contactno.setText("Contact No.");
        getContentPane().add(Contactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 222, 89, -1));

        Password.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 63, 89, -1));

        LastName.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("Last Name");
        getContentPane().add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 103, 89, -1));

        Age.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        Age.setForeground(new java.awt.Color(255, 255, 255));
        Age.setText("Age");
        getContentPane().add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 143, 89, -1));

        firstname.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 101, 160, -1));

        passportno.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(passportno, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 181, 160, -1));

        email.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 221, 160, -1));

        contactno.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(contactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 220, 160, -1));

        lastname.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 101, 174, -1));

        age.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 141, 50, -1));

        password.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        password.setText("Please create a password");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 61, 174, -1));
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 141, 160, -1));

        addresss.setColumns(20);
        addresss.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        addresss.setRows(5);
        address.setViewportView(addresss);

        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 261, -1, -1));

        male.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 181, -1, -1));

        female.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 90, -1));

        finishregistration.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        finishregistration.setText("Finish Registration");
        finishregistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishregistrationActionPerformed(evt);
            }
        });
        getContentPane().add(finishregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 388, 150, -1));

        cancelregistration.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        cancelregistration.setText("Cancel Registration");
        cancelregistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelregistrationActionPerformed(evt);
            }
        });
        getContentPane().add(cancelregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 388, 150, -1));

        resetdata.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        resetdata.setText("Reset Data");
        resetdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetdataActionPerformed(evt);
            }
        });
        getContentPane().add(resetdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 100, -1));

        backgroundpic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shilpi Mazumdar\\Desktop\\Acciojob Projects\\Airline Mgmt\\aviation.jpg")); // NOI18N
        backgroundpic.setText("jLabel3");
        getContentPane().add(backgroundpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 780, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetdataActionPerformed
        // To reset data : 
        firstname.setText("");
        lastname.setText("");
        email.setText("");
        passportno.setText("");
        addresss.setText("");
        contactno.setText("");
        password.setText("Please create a password");
        age.setText("");
        // To remove radioButton(gender) selection
        male.setSelected(false);
        female.setSelected(false);
        // To remove dateChooser(dob) selection
        dob. setCalendar(null);
    }//GEN-LAST:event_resetdataActionPerformed

    private void finishregistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishregistrationActionPerformed
        // Retrieveing data input by the passenger and storing in the passengers table
        String passengerid = passengerID.getText();
        String passworD = password.getText();
        String firstName = firstname.getText();
        String lastName = lastname.getText();
        
        // Date Format
        Date date = dob.getDate();
        String agE = age.getText();
        String gender = "";
        if(male.isSelected()) 
            gender = "Male";
        else if(female.isSelected())
            gender = "Female";
       
        String Passport = passportno.getText();
        String emailaddress = email.getText();
        String addreSS = addresss.getText();
        String contact = contactno.getText();
        
        // Converting date into a string VARCHAR
        DateFormat dateformat = new SimpleDateFormat("yy-mm-dd");
        String dateofBirth = dateformat.format(date);
        
        try {
            // Preparing a statement to run a query in SQL
            prestatement = connection.prepareStatement("insert into passengers(idpassengers, firstName, lastName, age, dob, address, passportNo, gender, contactNo, password, email)values(?,?,?,?,?,?,?,?,?,?,?)");
            // Set String of every field of passengers table - Similar to the Strings created above
            prestatement.setString(1, passengerid);
            prestatement.setString(2, firstName);
            prestatement.setString(3, lastName);
            prestatement.setString(4, agE);
            prestatement.setString(5, dateofBirth);
            prestatement.setString(6, addreSS);
            prestatement.setString(7, Passport);
            prestatement.setString(8, gender);
            prestatement.setString(9, contact);
            prestatement.setString(10, passworD);
            prestatement.setString(11, emailaddress);
            
            //Executing the query
            prestatement.executeUpdate();
            
            
            if(male.isSelected() && female.isSelected()){
                //Showing a message to select one option from male and female(gender)
                JOptionPane.showMessageDialog(null, "Please select one Gender Type");
            } else
                //Showing a message after successful addition of new passenger data to the passengers table
                JOptionPane.showMessageDialog(null, "Passenger registration successful !");
        
        } catch (SQLException ex) {
                Logger.getLogger(NewPassenger.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_finishregistrationActionPerformed

    private void cancelregistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelregistrationActionPerformed
        // To cancel the registration window
        this.hide();
    }//GEN-LAST:event_cancelregistrationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Age;
    private javax.swing.JLabel Contactno;
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel PassengerID;
    private javax.swing.JLabel PassportNo;
    private javax.swing.JLabel Password;
    private javax.swing.JScrollPane address;
    private javax.swing.JTextArea addresss;
    private javax.swing.JTextField age;
    private javax.swing.JLabel backgroundpic;
    private javax.swing.JLabel banner;
    private javax.swing.JButton cancelregistration;
    private javax.swing.JTextField contactno;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton finishregistration;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField lastname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField passengerID;
    private javax.swing.JTextField passportno;
    private javax.swing.JTextField password;
    private javax.swing.JButton resetdata;
    // End of variables declaration//GEN-END:variables
}
