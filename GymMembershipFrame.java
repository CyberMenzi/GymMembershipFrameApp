
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import za.ac.tut.membership.Member;

/**
 *
 * @author Menzi 
 */
public class GymMemberShipFrame extends JFrame{

    private JPanel headingPnl;
    private JPanel clientPnl, namePnl, surnamePnl, idNoPnl, genderPnl,
                   clientHeadingPnl;
    private JPanel contractPnl, typeContractPnl, selectTrainerPnl, txtAreaPnl,
                    contractTxtAreaPnl;
    private JPanel btnsPnl, mainPnl;
    private JLabel headingLbl, nameLbl, surnameLbl, idNoLbl, genderLbl,  
                   typeContractLbl, selectTrainerLbl;
    private JTextField nameTxtFld, surnameTxtFld, idNoTxtFld;
    private JComboBox genderBx;
    private JRadioButton month2MonthRadBtn, sixMonthsRadBtn, annualRadBtn;
    private ButtonGroup btnGrp;
    private JCheckBox selectTrainerBx;
    private JTextArea memberTxtArea;         
    private JScrollPane scrollablePane;
    private JButton registerBtn, searchBtn, updateBtn, removeBtn, displayBtn,
                    clearBtn, exitBtn;
    private ArrayList<Member> members;
            
    
    public GymMemberShipFrame() {
        
        setTitle("Gym membership");
        setSize(750, 850);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
                
        members = new ArrayList<>();
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        clientPnl = new JPanel(new GridLayout(4,1,1,1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Client details"));
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        clientHeadingPnl = new JPanel(new BorderLayout());
              
        contractPnl = new JPanel(new GridLayout(2,1,1,1));
        contractPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1),"Contract options"));
        typeContractPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        selectTrainerPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtAreaPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        contractTxtAreaPnl = new JPanel(new BorderLayout());
        
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        mainPnl = new JPanel(new BorderLayout());
     
        headingLbl = new JLabel("Membership Form");
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD,20));
        headingLbl.setForeground(Color.BLUE);
        headingLbl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        nameLbl = new JLabel("Name: ");
        surnameLbl = new JLabel("Surname: ");
        idNoLbl = new JLabel("id no: ");
        genderLbl = new JLabel("Gender: ");
        typeContractLbl = new JLabel("Type of contract: ");
        selectTrainerLbl = new JLabel("Select the checkbox if you need a personal trainer ");
        
        nameTxtFld = new JTextField(10);
        nameTxtFld.setFocusable(true);
        surnameTxtFld = new JTextField(10);
        idNoTxtFld = new JTextField(10);
        
        genderBx = new JComboBox();
        genderBx.addItem("Male");
        genderBx.addItem("Female");
        genderBx.setEditable(false);
        
        month2MonthRadBtn = new JRadioButton("Month-to-month");
        sixMonthsRadBtn = new JRadioButton("Six months");
        annualRadBtn = new JRadioButton("Annual");
        btnGrp = new ButtonGroup();
        btnGrp.add(month2MonthRadBtn);
        btnGrp.add(sixMonthsRadBtn);
        btnGrp.add(annualRadBtn);
        
        selectTrainerBx = new JCheckBox();
        
        memberTxtArea = new JTextArea(15,50);
        memberTxtArea.setEditable(false);
        memberTxtArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1),"Member(s) details"));
        scrollablePane = new JScrollPane(memberTxtArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        registerBtn = new JButton("REGISTER");
        registerBtn.addActionListener(new RegisterButtonListener());
        searchBtn = new JButton("SEARCH");
        updateBtn = new JButton("UPDATE");
        removeBtn = new JButton("REMOVE");
        displayBtn = new JButton("DISPLAY ALL");
        clearBtn = new JButton("CLEAR");
        clearBtn.addActionListener( new ClearButtonListener());
        exitBtn = new JButton("EXIT");
        exitBtn.addActionListener(new ExitButtonListener());
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        idNoPnl.add(idNoLbl);
        idNoPnl.add(idNoTxtFld);
        genderPnl.add(genderLbl);
        genderPnl.add(genderBx);
        
        clientPnl.add(namePnl);
        clientPnl.add(surnamePnl);
        clientPnl.add(idNoPnl);
        clientPnl.add(genderPnl);
        
        clientHeadingPnl.add(headingPnl, BorderLayout.NORTH);
        clientHeadingPnl.add(clientPnl, BorderLayout.CENTER);
        
        typeContractPnl.add(typeContractLbl);
        typeContractPnl.add(month2MonthRadBtn);
        typeContractPnl.add(sixMonthsRadBtn);
        typeContractPnl.add(annualRadBtn);
        selectTrainerPnl.add(selectTrainerLbl);
        selectTrainerPnl.add(selectTrainerBx);
        
        contractPnl.add(typeContractPnl);
        contractPnl.add(selectTrainerPnl);
        
        txtAreaPnl.add(scrollablePane);
        
        contractTxtAreaPnl.add(contractPnl, BorderLayout.NORTH);
        contractTxtAreaPnl.add(txtAreaPnl, BorderLayout.CENTER);
        
        btnsPnl.add(registerBtn);
        btnsPnl.add(searchBtn);
        btnsPnl.add(updateBtn);
        btnsPnl.add(removeBtn);
        btnsPnl.add(displayBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl.add(clientHeadingPnl, BorderLayout.NORTH);
        mainPnl.add(contractTxtAreaPnl, BorderLayout.CENTER);
        mainPnl.add( btnsPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        setVisible(true);
          
    }

    private class ClearButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            nameTxtFld.setText("");
            surnameTxtFld.setText("");
            idNoTxtFld.setText("");
            btnGrp.clearSelection();
            selectTrainerBx.setSelected(false);
            memberTxtArea.setText("");
            
            nameTxtFld.setFocusable(true);
            
        }
    }

    private class ExitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           System.exit(1);
        }
    }

    private class RegisterButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
        String name = nameTxtFld.getText();
        String surname = surnameTxtFld.getText();
        String idNo = idNoTxtFld.getText();
        String gender = (String) genderBx.getSelectedItem();
        String contractType = "Month-month";
          if(sixMonthsRadBtn.isSelected()){
            contractType = "Six months";
            }else{
            contractType = "Annual";
          }
          
        Boolean selectTrainer = selectTrainerBx.isSelected();
            
        Member member = new Member(name, surname, idNo, gender, contractType, selectTrainer);
        members.add(member);
          
        memberTxtArea.setText("The member has been successfully added");
            
        }
    }
    
    
    
    
}

