package za.ac.cput.gui.doctor;

import za.ac.cput.gui.main.MainGUI;
import za.ac.cput.util.GenericHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddingDoctorGui implements ActionListener {

    JFrame doctorFrame;
    JPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    JLabel lblHeading;
    JLabel lblFirstName, lblLastName, lblEmailAddress, lblContactNumber, lblId;
    JTextField txtFirstName, txtLastName,txtEmailAddress, txtContactNumber, txtIID;
    JButton btnSave, btnExit, btnClose;
    JLabel Filler1, Filler2, Filler3, Filler4, Filler5;
    Font headingFont;


    public AddingDoctorGui(){
        //Font
        headingFont = new Font("Arial", Font.BOLD, 18);

        doctorFrame = new JFrame("Doctor Details: ");
        panelNorth = new JPanel();
        panelSouth = new JPanel();
        panelEast = new JPanel();
        panelWest = new JPanel();
        panelCenter = new JPanel();
        panelNorth.setBackground(Color.LIGHT_GRAY);
        panelEast.setBackground(Color.LIGHT_GRAY);
        panelSouth.setBackground(Color.LIGHT_GRAY);
        panelWest.setBackground(Color.LIGHT_GRAY);
        panelCenter.setBackground(Color.LIGHT_GRAY);

        //Heading
        lblHeading = new JLabel("1. Add New Doctor",JLabel.CENTER);

        //Labels
        lblFirstName = new JLabel("First Name: ");
        lblLastName = new JLabel("Last Name: ");
        lblEmailAddress = new JLabel("Email Address: ");
        lblContactNumber = new JLabel("Contact Number: ");

        //TextFields
        txtFirstName = new JTextField();
        txtLastName = new JTextField();
        txtEmailAddress = new JTextField();
        txtContactNumber = new JTextField();

        //Fillers:
        Filler1 = new JLabel("");
        Filler1.setForeground(Color.LIGHT_GRAY);
        Filler2 = new JLabel("");
        Filler2.setForeground(Color.LIGHT_GRAY);
        Filler3 = new JLabel("");
        Filler3.setForeground(Color.LIGHT_GRAY);
        Filler4 = new JLabel("");
        Filler4.setForeground(Color.LIGHT_GRAY);
        Filler5 = new JLabel("");
        Filler5.setForeground(Color.LIGHT_GRAY);

        //Buttons:
        btnSave = new JButton("Save");
        btnClose = new JButton("Close");
        btnExit = new JButton("Exit");
    }

    public void setGUI() {
        panelNorth.setLayout(new GridLayout(2, 1));
        panelEast.setLayout(new GridLayout(8, 1));
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(8, 1));
        panelCenter.setLayout(new GridLayout(9, 1));
        panelEast.setLayout(new GridLayout(8, 1));

        //Adding the components to the panels:
        //Panel North:
        panelNorth.add(Filler5);
        panelNorth.add(lblHeading);

        //Panel West:
        panelWest.add(Filler1);

        //Panel Center:
        panelCenter.add(lblFirstName);
        panelCenter.add(txtFirstName);
        panelCenter.add(lblLastName);
        panelCenter.add(txtLastName);
        panelCenter.add(lblEmailAddress);
        panelCenter.add(txtEmailAddress);
        panelCenter.add(lblContactNumber);
        panelCenter.add(txtContactNumber);
        panelCenter.add(Filler4);

        //Panel East
        panelEast.add(Filler2);

        //Panel South:
        panelSouth.add(btnSave);
        panelSouth.add(btnClose);
        panelSouth.add(btnExit);

        //Heading
        lblHeading.setFont(headingFont);

        //Adding panels to Customer Frame:
        doctorFrame.add(panelNorth, BorderLayout.NORTH);
        doctorFrame.add(panelSouth, BorderLayout.SOUTH);
        doctorFrame.add(panelEast, BorderLayout.EAST);
        doctorFrame.add(panelCenter, BorderLayout.CENTER);
        doctorFrame.add(panelWest, BorderLayout.WEST);

        // listen for actions when the buttons are clicked or performed
        btnSave.addActionListener(this);
        btnClose.addActionListener(this);
        btnExit.addActionListener(this);

        //Set GUI:
        doctorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        doctorFrame.pack();
        doctorFrame.setSize(500, 500);
        doctorFrame.setLocationRelativeTo(null);
        doctorFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Save")){

            String firstName = txtFirstName.getText();
            String lastName = txtLastName.getText();
            String emailAddress = txtEmailAddress.getText();
            String contactNumber = txtContactNumber.getText();

            boolean firstNameCheck, lastNameCheck, emailAddressCheck, contactCheck;

            if(firstName==null || !firstName.matches("[a-zA-Z]+")){
                firstNameCheck = false;
                txtFirstName.setText("Invalid Input");
            }
            else{
                firstNameCheck = true;
            }


            if(lastName==null || !lastName.matches("[a-zA-Z]+")){
                txtLastName.setText("Invalid Input");
            }
            else{
                lastNameCheck = true;
            }


            if(emailAddress==null || !emailAddress.matches("[a-zA-Z]+")){
                emailAddressCheck = false;
                txtEmailAddress.setText("Invalid Input");
            }
            else{
                emailAddressCheck = true;
            }


            if(contactNumber==null || !contactNumber.matches("[a-zA-Z]+")){
                contactCheck = false;
                txtFirstName.setText("Invalid Input");
            }
            else{
                contactCheck = true;
            }

        }

        if(e.getActionCommand().equals("Clear")){
            txtFirstName.setText("");
            txtLastName.setText("");
            txtEmailAddress.setText("");
            txtContactNumber.setText("");
        }

        if(e.getActionCommand().equals("Exit")){
            doctorFrame.dispose();
        }
    }
//    public static void main (String[] args) {
//        new AddingDoctorGui().setGUI();
//    }
    }
