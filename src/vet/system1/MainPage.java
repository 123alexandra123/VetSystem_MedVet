package vet.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame implements ActionListener {
    JButton addPatientBtn, searchPatientBtn, viewAllPatientsBtn, viewMyPatientsBtn;
    int idDoctor;

    public MainPage(int idDoctor) {
        this.idDoctor = idDoctor;

        JLabel titleLabel = new JLabel("MedVet System Management - Main Page");
        titleLabel.setBounds(80, 10, 1000, 40);
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        titleLabel.setForeground(Color.BLACK);
        add(titleLabel);

        addPatientBtn = new JButton("Add Patient");
        addPatientBtn.setBounds(90, 100, 200, 40);
        addPatientBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
        addPatientBtn.addActionListener(this);
        add(addPatientBtn);

        searchPatientBtn = new JButton("Search Patient");
        searchPatientBtn.setBounds(90, 180, 200, 40);
        searchPatientBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
        searchPatientBtn.addActionListener(this);
        add(searchPatientBtn);

        viewAllPatientsBtn = new JButton("View All Patients");
        viewAllPatientsBtn.setBounds(90, 260, 200, 40);
        viewAllPatientsBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
        viewAllPatientsBtn.addActionListener(this);
        add(viewAllPatientsBtn);

        viewMyPatientsBtn = new JButton("View My Patients");
        viewMyPatientsBtn.setBounds(90, 340, 200, 40);
        viewMyPatientsBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
        viewMyPatientsBtn.addActionListener(this);
        add(viewMyPatientsBtn);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("vet/system1/icons/clinica.png"));
        Image i1 = icon.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon icon1 = new ImageIcon(i1);
        JLabel iconLabel = new JLabel(icon1);
        iconLabel.setBounds(450, 90, 400, 300);
        add(iconLabel);

        getContentPane().setBackground(new Color(216, 193, 232));
        setSize(1000, 500);
        setLocation(370, 200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addPatientBtn) {
            JOptionPane.showMessageDialog(this, "Opening Add Patient Page");
            new AddPatientPage(idDoctor);
        } else if (e.getSource() == searchPatientBtn) {
            JOptionPane.showMessageDialog(this, "Opening Search Patient Page");
            new SearchPatientPage();
        } else if (e.getSource() == viewAllPatientsBtn) {
            JOptionPane.showMessageDialog(this, "Opening View All Patients Page");
            new ViewAllPatientsPage();
        } else if (e.getSource() == viewMyPatientsBtn) {
            JOptionPane.showMessageDialog(this, "Opening View My Patients Page");
            new ViewMyPatientsPage(idDoctor);
        }
    }

    public static void openMainPage(int idDoctor) {
        MainPage mainPage = new MainPage(idDoctor);
        mainPage.setVisible(true);
    }
}
