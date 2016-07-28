import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MagicBoxWithFrame extends JFrame{
	private JButton number[];
	private JPanel numberPanel;
	private JButton playButton;
	
	MagicBoxWithFrame(){
		super("Magic Box");
		setDefaultCloseOperation(3);
		setSize(200,200);
		setLocationRelativeTo(null);
		number = new JButton[9];
		numberPanel = new JPanel(new GridLayout(3,3,3,3));
		for(int i=0;i<9;i++){
			number[i] = new JButton("0");
			numberPanel.add(number[i]);
		}
		playButton = new JButton("Play");
		playButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int x[]=getValues();
				for(int i=0;i<9;i++){
					number[i].setText(x[i] + "");
				}
			}
		});
		add(numberPanel);
		add("South",playButton);
	}
	
	private int[] getValues(){
		Random r=new Random();
		int x[]=new int[9];
		boolean got=false;
		while(!got){
			x = new int[9];
			L1:for(int i=0;i<9;i++){
				int y = r.nextInt(9)+1;
				for(int j=0;j<i;j++){
					if(x[j]==y){
						i--;
						continue L1;
					}
				}
				x[i]=y;
			}
			if(isPossible(x)) got=true;
		}
		return x;
	}
	public static void main(String args[]){
		new MagicBoxWithFrame().setVisible(true);
	}
	private boolean isPossible(int []x){
		if(x[0]+x[1]+x[2]!=15) return false;
		if(x[3]+x[4]+x[5]!=15) return false;
		if(x[6]+x[7]+x[8]!=15) return false;
		if(x[0]+x[3]+x[6]!=15) return false;
		if(x[1]+x[4]+x[7]!=15) return false;
		if(x[2]+x[5]+x[8]!=15) return false;
		if(x[0]+x[4]+x[8]!=15) return false;
		if(x[2]+x[4]+x[6]!=15) return false;
		return true;
	}
}
