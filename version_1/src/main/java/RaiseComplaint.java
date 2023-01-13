
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class RaiseComplaint extends javax.swing.JInternalFrame {

    /**
     * Creates new form RaiseComplaint
     */
    
    Connection connection;
    PreparedStatement prestatement;
    
    public RaiseComplaint() {
        initComponents();
        try {
            try {
                // To establish connection with the SQL DB and server (link/stream)
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RaiseComplaint.class.getName()).log(Level.SEVERE, null, ex);
            }
            // To establish connection with database
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/airlinemavendatabase", "root", "Lakshmi@06");
        } catch (SQLException ex) {
            Logger.getLogger(RaiseComplaint.class.getName()).log(Level.SEVERE, null, ex);
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

        SelectDept = new javax.swing.JLabel();
        adminiD = new javax.swing.JTextField();
        generalstaff = new javax.swing.JRadioButton();
        generatecomplaint = new javax.swing.JButton();
        officialGovtID = new javax.swing.JTextField();
        banner = new javax.swing.JLabel();
        banner1 = new javax.swing.JLabel();
        itadministrator = new javax.swing.JRadioButton();
        terminaloperations = new javax.swing.JRadioButton();
        passengerhelpdesk = new javax.swing.JRadioButton();
        baggageoperations = new javax.swing.JRadioButton();
        adminid = new javax.swing.JLabel();
        officialgovtid = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descr = new javax.swing.JTextArea();
        urgency = new javax.swing.JLabel();
        relaxed = new javax.swing.JRadioButton();
        moderate = new javax.swing.JRadioButton();
        emergency = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(713, 383));
        setMinimumSize(new java.awt.Dimension(713, 383));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SelectDept.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        SelectDept.setForeground(new java.awt.Color(255, 255, 255));
        SelectDept.setText("Select Department");
        SelectDept.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(SelectDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 89, 120, -1));

        adminiD.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(adminiD, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 153, 163, -1));

        generalstaff.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        generalstaff.setForeground(new java.awt.Color(255, 255, 255));
        generalstaff.setText("General Staff");
        getContentPane().add(generalstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 87, 108, -1));

        generatecomplaint.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        generatecomplaint.setText("Generate Complaint");
        generatecomplaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatecomplaintActionPerformed(evt);
            }
        });
        getContentPane().add(generatecomplaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 267, -1, -1));

        officialGovtID.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        getContentPane().add(officialGovtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 181, 163, -1));

        banner.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        banner.setForeground(new java.awt.Color(255, 255, 255));
        banner.setText("We are concerned when you are concerned");
        getContentPane().add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 16, 360, -1));

        banner1.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        banner1.setForeground(new java.awt.Color(255, 255, 255));
        banner1.setText("Please provide us with your helpful suggestions :) We will expedite to resolve them !");
        getContentPane().add(banner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 44, 575, -1));

        itadministrator.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        itadministrator.setForeground(new java.awt.Color(255, 255, 255));
        itadministrator.setText("IT Administrator");
        getContentPane().add(itadministrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 87, 131, -1));

        terminaloperations.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        terminaloperations.setForeground(new java.awt.Color(255, 255, 255));
        terminaloperations.setText("Terminal Opertaions");
        getContentPane().add(terminaloperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 87, 154, -1));

        passengerhelpdesk.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        passengerhelpdesk.setForeground(new java.awt.Color(255, 255, 255));
        passengerhelpdesk.setText("Passenger HelpDesk");
        getContentPane().add(passengerhelpdesk, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 114, 148, -1));

        baggageoperations.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        baggageoperations.setForeground(new java.awt.Color(255, 255, 255));
        baggageoperations.setText("Baggage Operations");
        getContentPane().add(baggageoperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 114, 148, -1));

        adminid.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        adminid.setForeground(new java.awt.Color(255, 255, 255));
        adminid.setText("Admin ID");
        adminid.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(adminid, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 156, 120, -1));

        officialgovtid.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        officialgovtid.setForeground(new java.awt.Color(255, 255, 255));
        officialgovtid.setText("Official Govt. ID");
        officialgovtid.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(officialgovtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 184, 120, -1));

        description.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        description.setForeground(new java.awt.Color(255, 255, 255));
        description.setText("Description");
        description.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 209, 120, -1));

        descr.setColumns(20);
        descr.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        descr.setRows(5);
        jScrollPane2.setViewportView(descr);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 209, -1, -1));

        urgency.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        urgency.setForeground(new java.awt.Color(255, 255, 255));
        urgency.setText("Urgency");
        urgency.setPreferredSize(new java.awt.Dimension(68, 17));
        getContentPane().add(urgency, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 156, 60, -1));

        relaxed.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        relaxed.setForeground(new java.awt.Color(255, 255, 255));
        relaxed.setText("Relaxed");
        getContentPane().add(relaxed, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 154, 108, -1));

        moderate.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        moderate.setForeground(new java.awt.Color(255, 255, 255));
        moderate.setText("Moderate");
        getContentPane().add(moderate, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 182, 108, -1));

        emergency.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        emergency.setForeground(new java.awt.Color(255, 255, 255));
        emergency.setText("Emergency");
        getContentPane().add(emergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 209, 108, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shilpi Mazumdar\\Desktop\\Acciojob Projects\\Airline Mgmt\\wallpaperflare.com_wallpaper4 (1).jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generatecomplaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatecomplaintActionPerformed
        // To retireve complaint data inputted by the administrator :
        try {
            /* To store the complaint raised in a separate database that can be accessed 
            by the management : */
            String dept = "";
            if(generalstaff.isSelected())
                dept = "General Staff";
            else if(passengerhelpdesk.isSelected())
                dept = "Passenger Helpdesk";
            else if(itadministrator.isSelected())
                dept = "IT Administrator";
            else if(baggageoperations.isSelected())
                dept = "Baggage Operations";
            else if(terminaloperations.isSelected())
                dept = "Terminal Operations";
            
            String adminID = adminiD.getText();
            String decsc = descr.getText();
            
            String urgency = "";
            if(relaxed.isSelected())
                urgency = "Relaxed";
            else if(moderate.isSelected())
                urgency = "Moderate";
            else if(emergency.isSelected())
                urgency = "Emergency";
            
            /* To retrieve the contactno of the passenger from the passenger table and 
            automatically storing it into the current window database */
            // Can I rephrase it into "select idadministrator from administrator" ?
            prestatement = connection.prepareStatement("select * from administrator where idadministrator = ?");
            prestatement.setString(1, adminID);
            
            ResultSet res = prestatement.executeQuery();
            res.next();
            
            /* This is important to store the result of the obtained query into a variable so that we can 
            inject it into the database subsequently */
            String contactno = res.getString("contactNo"); 
            String officialID = res.getString("PassportNo"); 
            officialGovtID.setText(officialID);
            
            // Preparing a statement to run a query in SQL
            prestatement = connection.prepareStatement("insert into raisecomplaint(adminid, department, officialgovtid, description, urgency, contactNo)values(?,?,?,?,?,?)");
            // Set String of every field of raisecomplaint table - Similar to the Strings created above
            prestatement.setString(1, adminID);
            prestatement.setString(2, dept);
            prestatement.setString(3, officialID);
            prestatement.setString(4, decsc);
            prestatement.setString(5, urgency);
            prestatement.setString(6, contactno);
            
            //Executing the query
            prestatement.executeUpdate();
            
            //Showing a message after successful addition of new passenger data to the passengers table
            JOptionPane.showMessageDialog(null, "Your complaint/concern has been raised !");
            
        } catch (SQLException ex) {
            Logger.getLogger(RaiseComplaint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generatecomplaintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SelectDept;
    private javax.swing.JTextField adminiD;
    private javax.swing.JLabel adminid;
    private javax.swing.JRadioButton baggageoperations;
    private javax.swing.JLabel banner;
    private javax.swing.JLabel banner1;
    private javax.swing.JTextArea descr;
    private javax.swing.JLabel description;
    private javax.swing.JRadioButton emergency;
    private javax.swing.JRadioButton generalstaff;
    private javax.swing.JButton generatecomplaint;
    private javax.swing.JRadioButton itadministrator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton moderate;
    private javax.swing.JTextField officialGovtID;
    private javax.swing.JLabel officialgovtid;
    private javax.swing.JRadioButton passengerhelpdesk;
    private javax.swing.JRadioButton relaxed;
    private javax.swing.JRadioButton terminaloperations;
    private javax.swing.JLabel urgency;
    // End of variables declaration//GEN-END:variables
}
