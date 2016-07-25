package com.netbeans;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public abstract class Installer extends JFrame{
	private JButton nextButton;
	private JButton cancelButton;
	private JButton backButton;
	private JSeparator seperator;
	private Installer nextInstaller;
	private Installer previousInstaller;
	private JLabel titleLabel1;
	private JLabel titleLabel2;
	private JPanel mainContainerPanel;
	public Installer(){
		setSize(600,450);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("NetBeans IDE Installer");
		setIconImage(Toolkit.getDefaultToolkit().getImage("./netbeans.png"));
		setMinimumSize(new Dimension(600,450));
		nextButton = new JButton("Next >");
		cancelButton = new JButton("Cancel");
		backButton = new JButton("< Back");
		
		JPanel southButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		southButtonPanel.add(backButton);
		southButtonPanel.add(nextButton);
		southButtonPanel.add(cancelButton);
		
		titleLabel1 = new JLabel("Dinuka");
		titleLabel1.setBorder(BorderFactory.createMatteBorder(10, 10, 0, 0, Color.WHITE));
		titleLabel1.setFont(new Font("Times New Romans",Font.BOLD,11));
		
		titleLabel2 = new JLabel("Dinuka");
		titleLabel2.setBorder(BorderFactory.createMatteBorder(0, 20, 5, 0, Color.WHITE));
		
		JPanel titlePanel = new JPanel(new BorderLayout());
		titlePanel.setBackground(Color.WHITE);
		JLabel headImageLabel = new JLabel();
		headImageLabel.setIcon(new ImageIcon("./7.png"));
		titlePanel.add("East",headImageLabel);
		
		JPanel labelPanel = new JPanel(new GridLayout(2,1));
		labelPanel.add(titleLabel1);
		labelPanel.add(titleLabel2);
		labelPanel.setBackground(Color.WHITE);
		titlePanel.add("West",labelPanel);
		
		
		
		
		add("North", titlePanel);
		
		
		mainContainerPanel = new JPanel();
		
		mainContainerPanel.setBorder(BorderFactory.createEtchedBorder());
		add("Center",mainContainerPanel);
		
		
		
		
		JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		southPanel.add(southButtonPanel);
		
		add("South",southPanel);
		
		nextButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if (nextInstaller != null)	{
					nextInstaller.setVisible(true);
				}
			}
		});
		backButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				if (previousInstaller != null)	{
					previousInstaller.setVisible(true);
				}
			}
		});
		
		cancelButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				//~ int res = JOptionPane.showConfirmDialog(null,"Are you sure want to cancel?","Cancel", JOptionPane.YES_NO_OPTION);
				//~ if (res == JOptionPane.YES_OPTION) {
					System.exit(0);
				//~ }
			}
		});
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				//~ int res = JOptionPane.showConfirmDialog(null,"Are you sure want to cancel?","Cancel", JOptionPane.YES_NO_OPTION);
				//~ if (res == JOptionPane.YES_OPTION) {
					System.exit(0);
				//~ }
			}
		});
		pack();
		
	}
	protected void setBackButtonVisible(boolean b){
		backButton.setVisible(b);
	}
	protected void setNextButtonEnable(boolean b){
		nextButton.setEnabled(b);
	}
	protected void setNextButtonText(String text){
		nextButton.setText(text);
	}
	protected void setTitleLabelText(String text1,String text2){
		titleLabel1.setText(text1);
		titleLabel2.setText(text2);
	}
	protected JPanel getContainerPanel(){
		return mainContainerPanel;
	}
	protected void setNextInstaller(Installer nextInstaller){
		this.nextInstaller = nextInstaller;
	}

	protected void setPreviousInstaller(Installer previousInstaller){
		this.previousInstaller = previousInstaller;
	}
}
