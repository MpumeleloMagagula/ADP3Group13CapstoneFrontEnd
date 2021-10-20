package za.ac.cput.gui.doctor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoctorMenuGUI extends JPanel implements ActionListener {
    private JFrame MenuFrame;
    private JButton btnCheckDoctor;
    private JButton btnUpdateDoctor;
    private JButton btnAddDoctor;
    private JButton btnGetAllDoctors;
    private JButton btnExit;

    public DoctorMenuGUI() {
        //construct components
        btnCheckDoctor = new JButton ("Check Doctor Details");
        btnUpdateDoctor = new JButton ("Update Doctor");
        btnAddDoctor = new JButton ("Add New Doctor");
        btnGetAllDoctors = new JButton ("Display All Doctors");
        btnExit = new JButton ("Exit");


        //adjust size and set layout
        setPreferredSize (new Dimension (433, 396));
        setLayout (null);

        //add components
        add (btnCheckDoctor);
        add (btnUpdateDoctor);
        add (btnAddDoctor);
        add (btnGetAllDoctors);
        add (btnExit);

        //set component bounds (only needed by Absolute Positioning)
        btnCheckDoctor.setBounds (75, 105, 260, 25);
        btnUpdateDoctor.setBounds (75, 145, 260, 25);
        btnAddDoctor.setBounds (75, 70, 260, 25);
        btnGetAllDoctors.setBounds (75, 185, 260, 25);
        btnExit.setBounds (110, 290, 200, 30);

        //do something when the buttons are clicked
        btnAddDoctor.addActionListener(this);
        btnCheckDoctor.addActionListener(this);
        btnUpdateDoctor.addActionListener(this);
        btnGetAllDoctors.addActionListener(this);
        btnExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add New Doctor")){
            AddingDoctorGui addingDoctorGui= new AddingDoctorGui();
            addingDoctorGui.setGUI();
        }
        if (e.getActionCommand().equals("Close")){
            MenuFrame.dispose();
        }
    }
    public static void main (String[] args) {
        JFrame frame = new JFrame ("Doctor Menu");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new DoctorMenuGUI());
        frame.pack();
        frame.setVisible (true);
    }


}
