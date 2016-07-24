//package din.nad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class About{
	public About(){
		JOptionPane.showMessageDialog(null,"Creates By Dinuka \n\n\nThank You!!","Credits...",JOptionPane.INFORMATION_MESSAGE);
	}
}
class Cal extends JFrame{
	
	JLabel num1Label=new JLabel("Input Number 1");
	JLabel num2Label=new JLabel("Input Number 2");
	JLabel totalLabel=new JLabel("Total");
	
	JButton calButton=new JButton("Calculate");
	JButton cancelButton=new JButton("Cancel");
	
	JTextField num1Text=new JTextField(5);
	JTextField num2Text=new JTextField(5);
	JTextField totalText=new JTextField(5);
	
	private JMenuBar menuBar;
	Cal(String title){
		initializeCom(title);
	}
	public void initializeCom(String title){
		setTitle(title);
		setSize(300,300);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		
		JLabel titleLabel=new JLabel("Calculator - Version 1.0");
		
		titleLabel.setFont(new Font("",Font.ITALIC,24));
		JPanel titlePane=new JPanel();
		titlePane.add(titleLabel);
		
		
		
		JPanel labelPanel=new JPanel(new GridLayout(3,1));
		labelPanel.add(num1Label);
		labelPanel.add(num2Label);
		labelPanel.add(totalLabel);
		add("West",labelPanel);
		
		JPanel buttonPane=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		buttonPane.add(calButton);
		buttonPane.add(cancelButton);
		add("South",buttonPane);
		
		JPanel textPane=new JPanel(new GridLayout(3,1));
		JPanel num1TextPane=new JPanel();
		num1TextPane.add(num1Text);
		textPane.add(num1TextPane);
		
		JPanel num2TextPane=new JPanel();
		num2TextPane.add(num2Text);
		textPane.add(num2TextPane);
		
		JPanel totalTextPane=new JPanel();
		totalTextPane.add(totalText);
		textPane.add(totalTextPane);
		
		
		add("Center",textPane);
		num1Text.setToolTipText("Input Only Digits");
		num2Text.setToolTipText("Input Only Digits");
		totalText.setToolTipText("Show Total");
		
		calButton.setToolTipText("Add the numbers");
		calButton.setEnabled(false);
		calButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				calButtonActionPerformed(evt);
			}
		});
		cancelButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				cancelButtonActionPerformed(evt);
			}
		});
		JMenu fileMenu=new JMenu("File");
		menuBar=new JMenuBar();
		menuBar.add(fileMenu);
		
		JMenuItem newMenuItem=new JMenuItem("New");
		
		JMenu dinMenu=new JMenu("Dinuka");
		//fileMenuPanel.add(dinMenu);
		fileMenu.add(dinMenu);
		newMenuItem.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e){
				newMenuItemActionPerformed(e);
			}
		});
		JPanel menuBarPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		menuBarPanel.add(menuBar); 
		JPanel titleMenu=new JPanel();
		//titleMenu.add(menuBarPanel);
		titleMenu.add(titlePane);
		add("North",titleMenu);
		//setFocus();
		setJMenuBar(menuBar);
		dinMenu.add(newMenuItem);
		
		num1Text.addKeyListener(new java.awt.event.KeyAdapter(){
			public void keyReleased(java.awt.event.KeyEvent e){
				num1TextKeyReleased(e);
			}
		});
		num1Text.addFocusListener(new java.awt.event.FocusAdapter(){
			public void setFocus(java.awt.event.FocusEvent e){
				num1TextSetFocus(e);
			}
		});
		num2Text.addKeyListener(new java.awt.event.KeyAdapter(){
			public void keyReleased(java.awt.event.KeyEvent e){
				num2TextKeyReleased(e);
			}
		});
		pack();	
	}
	void calButtonActionPerformed(ActionEvent e){
		try{
			totalText.setText(String.valueOf(Integer.parseInt(num1Text.getText())+Integer.parseInt(num2Text.getText())));
		}catch(Exception ee){
			JOptionPane.showMessageDialog(null,"Error : "+ee,"Run Time Exception",JOptionPane.ERROR_MESSAGE);
			//setFocus();
			num1Text.setText("");
			num2Text.setText("");
			totalText.setText("");
			calButton.setEnabled(false);
		}
	}
	void cancelButtonActionPerformed(ActionEvent evt){
		new About();
		System.exit(0);
	}
	void num1TextSetFocus(FocusEvent e){
		num1Text.setFocusable(true);
	}
	void newMenuItemActionPerformed(ActionEvent e){
		JOptionPane.showMessageDialog(null,"newMenuItemActionPerformed");
	}
	void num1TextKeyReleased(KeyEvent e){
		if(num1Text.getText().equals("") || num2Text.getText().equals("")){
			calButton.setEnabled(false);
		}else{
			calButton.setEnabled(true);
		}
	}
	void num2TextKeyReleased(KeyEvent e){
		if(num1Text.getText().equals("") || num2Text.getText().equals("")){
			calButton.setEnabled(false);
		}else{
			calButton.setEnabled(true);
		}
	}
}

public class Demo{
	public static void main(String args[]){
		final Cal cc=new Cal("Calculator");
		cc.setVisible(true);
	}
}
