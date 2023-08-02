
package za.ac.tut.ui;

import java.awt.*;
import javax.swing.*;

/**
 * @author  Olama
 */
public class GymMembershipFrame extends JFrame {

    private JPanel headingPnl, clientsPnl, namePnl, btnsPnl;
    private JPanel surnamePnl, idPnl, genderPnl, headingClientComboPnl;
    private JPanel contractsPnl, personalTrainerOptPnl, membershipPnl;
    private JPanel commentsPnl, membershipCommentsComboPnl, mainPnl;
    private JLabel nameLbl, surnameLbl, idLbl, genderLbl;
    private JLabel contractTypLbl, personalTrainerOptionLbl, headingLbl;
    private JButton applyBtn;
    private ButtonGroup groupBtn;
    private JComboBox genderBox;
    private JRadioButton monthToMonth, sixMonths, Annual;
    private JCheckBox personalTrainerChckBx;
    private JScrollPane scrollableTxtArea;
    private JTextField nameTxtFld, surnameTxtFld, idTxtFld;
    private JTextArea commentsArea;
    
    
    
    
    
    public GymMembershipFrame(){
        
        setTitle("Gym Membership");
        setSize(500,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER)); 
//        headingPnl.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        
        clientsPnl = new JPanel(new GridLayout(4,1,1,1));
        clientsPnl.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black, 1), "Client details"));
        
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        headingClientComboPnl = new JPanel(new BorderLayout());
        membershipCommentsComboPnl = new JPanel(new BorderLayout());
        btnsPnl =  new JPanel(new FlowLayout(FlowLayout.LEFT));
        mainPnl = new JPanel(new BorderLayout());
        
        contractsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerOptPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        membershipPnl =  new JPanel(new GridLayout(2,1,1,1));
        membershipPnl.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black, 1), "Contract options"));
                
        commentsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        
        headingLbl = new JLabel("Membership Form");
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD, 20));
        headingLbl.setForeground(Color.BLUE);
        headingLbl.setBorder(BorderFactory.createRaisedBevelBorder());
        
        nameLbl = new JLabel("Name: ");
        nameTxtFld = new JTextField(10);
        
        surnameLbl = new JLabel("Surname: ");
        surnameTxtFld = new JTextField(10);
        
        idLbl = new JLabel("Id no: ");
        idTxtFld = new JTextField(10);
        
        genderLbl = new JLabel("Gender: ");
        genderBox = new JComboBox();
        genderBox.addItem("Male");
        genderBox.addItem("Female");
        
        monthToMonth = new JRadioButton("Month-to-month ");
        sixMonths = new JRadioButton("Six Months ");
        Annual = new JRadioButton("Annual ");
        
        groupBtn = new ButtonGroup();
        groupBtn.add(monthToMonth);
        groupBtn.add(sixMonths);
        groupBtn.add(Annual);
        
        personalTrainerChckBx = new JCheckBox();
        
        commentsArea = new JTextArea(20,40);
        commentsArea.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black, 1), "Comments"));
        scrollableTxtArea = new JScrollPane(commentsArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        contractTypLbl = new JLabel("Type of Contract: ");
        personalTrainerOptionLbl = new JLabel("Select the checkbox if you need a personal trainer ");
        
        applyBtn = new JButton("APPLY");
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        idPnl.add(idLbl);
        idPnl.add(idTxtFld);
        
        genderPnl.add(genderLbl);
        genderPnl.add(genderBox);
        
        headingPnl.add(headingLbl);
        
        clientsPnl.add(namePnl);
        clientsPnl.add(surnamePnl);
        clientsPnl.add(idPnl); 
        clientsPnl.add(genderPnl);
        
        headingClientComboPnl.add(headingPnl, BorderLayout.NORTH);
        headingClientComboPnl.add(clientsPnl, BorderLayout.CENTER);
        
        contractsPnl.add(contractTypLbl);
        contractsPnl.add(monthToMonth);
        contractsPnl.add(sixMonths);
        contractsPnl.add(Annual);
        
        personalTrainerOptPnl.add(personalTrainerOptionLbl);
        personalTrainerOptPnl.add(personalTrainerChckBx);
        
        membershipPnl.add( contractsPnl);
        membershipPnl.add(personalTrainerOptPnl);
        
        commentsPnl.add(scrollableTxtArea);
        
        membershipCommentsComboPnl.add(membershipPnl, BorderLayout.NORTH);
        membershipCommentsComboPnl.add(commentsPnl, BorderLayout.CENTER);
                
        btnsPnl.add( applyBtn);
        
        mainPnl.add(headingClientComboPnl, BorderLayout.NORTH);
        mainPnl.add(membershipCommentsComboPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        setVisible(true);
        
       
    }
    
    
    
    
    
    
    
    
    
    
}
