import com.netbeans.Installer1;
import com.netbeans.Installer2;

import javax.swing.*;
public class NetbeansDemo{
	public static void main(String a[]){
		
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		}catch(Exception e){e.printStackTrace();}
		new Installer2(new Installer1()).setVisible(true);
		
	}
}
