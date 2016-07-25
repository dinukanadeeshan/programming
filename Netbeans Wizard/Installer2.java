package com.netbeans;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Installer2 extends Installer{
	private JTextArea textArea;
	private JCheckBox checkBox;
	public Installer2(Installer previousInstaller){
		setPreviousInstaller(previousInstaller);
		setTitleLabelText("License Agreement","Please read the following license agreement carefully.");
		setNextButtonEnable(false);
		
		textArea = new JTextArea(getLicenseContent(), 16, 68);
		textArea.setEditable(false);
		textArea.setFont(new Font("",Font.PLAIN,11));
		JScrollPane textAreaScrollPane = new JScrollPane(textArea);
		JPanel textAreaPanel = new JPanel();
		textAreaPanel.add(textAreaScrollPane);
		
		checkBox = new JCheckBox("I accept the terms in the license agreement");
		JPanel checkBoxPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		checkBoxPanel.add(checkBox);
		JPanel panel = new JPanel(new BorderLayout());
		panel.add("Center",textAreaPanel);
		panel.add("South",checkBoxPanel);
		
		getContainerPanel().add(panel);
		
		checkBox.setMnemonic(KeyEvent.VK_A);
		checkBox.setDisplayedMnemonicIndex(2);
		
		checkBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				setNextButtonEnable(checkBox.isSelected());
			}
		});
		
	}
	private String getLicenseContent(){
		return "NETBEANS IDE 7.2.1 (\"Product\") LICENSE AGREEMENT\n\n"

		+"PLEASE READ THE FOLLOWING LICENSE AGREEMENT TERMS AND\n"
		+"CONDITIONS CAREFULLY, INCLUDING WITHOUT LIMITATION THOSE\n"
		+"DISPLAYED ELSEWHERE (AS INDICATED BY LINKS LISTED BELOW),\n"
		+"BEFORE USING THE SOFTWARE.  THESE TERMS AND CONDITIONS\n"
		+"CONSTITUTE A LEGAL AGREEMENT BETWEEN YOU, OR THE ENTITY FOR\n"
		+"WHICH YOU ARE AN AUTHORIZED REPRESENTATIVE WITH FULL\n"
		+"AUTHORITY TO ENTER INTO THIS AGREEMENT, AND ORACLE.  BY\n"
		+"CLICKING \"ACCEPT\" OR THE EQUIVALENT YOU AGREE TO ALL OF\n"
		+"THE TERMS AND CONDITIONS OF THIS LICENSE AGREEMENT.  IF YOU\n"
		+"DO NOT AGREE TO THIS LICENSE DO NOT CLICK \"ACCEPT\" OR\n"
		+"THE EQUIVALENT AND DO NOT INSTALL OR USE THIS SOFTWARE.\n\n"

		+"Copyright (c) 1997, 2012, Oracle and/or its affiliates. All\n"
		+"rights reserved.\n\n"

		+"Oracle and Java are registered trademarks of Oracle and/or\n"
		+"its affiliates. Other names may be trademarks of their\n"
		+"respective owners.\n\n"

		+"The Product contains NetBeans IDE, the Glassfish runtime,\n"
		+"and other components. Review the Product carefully to\n"
		+"determine which license governs the code you are using.\n"

		+"Oracle separately licenses NetBeans IDE and the Glassfish\n"
		+"runtime under the CDDL v 1.0 (CDDL) or GNU General Public\n"
		+"License version 2 with Classpath  Exception (\"GPLv2 with\n"
		+"Classpath Exception\"), both of which are identified below.\n"
		+"You may choose either license to govern your use of NetBeans\n"
		+"IDE or the Glassfish runtime only upon the condition that\n"
		+"you accept all of the terms of either the CDDL or GPLv2 with\n"
		+"Classpath Exception. In addition, the Product also contains\n"
		+"components which are governed exclusively by the terms of\n"
		+"the GPLv2 with Classpath Exception (e.g. components from\n"
		+"OpenJDK) or by the terms of one of the licenses listed below\n"
		+"(i.e. Java ME SDK 3.2, Oracle JDBC Drivers, and Java Card\n"
		+"Development Kit 3.0.2).\n\n"

		+"Third party technology that may be necessary for use with\n"
		+"the Product is specified in THIRDPARTYLICENSE.txt. Such\n"
		+"third party technology is licensed to you under the terms of\n"
		+"the third party technology license agreement specified and\n"
		+"not under either the CDDL or GPLv2 with Classpath Exception.\n"
		+"Please review the list of libraries and licenses provided\n"
		+"for use.\n\n"

		+"If you redistribute NetBeans IDE, add the following below\n"
		+"the License Header, with the fields enclosed by brackets []\n"
		+"replaced by your own identifying information: \"Portions\n"
		+"Copyrighted [year] [name of copyright  owner]\"\n\n"

		+"Contributor(s):\n\n"

		+"The original software is NetBeans. The initial developer of\n"
		+"the original software is Oracle Corporation; portions\n"
		+"Copyright (c) 1997, 2012 Oracle and/or its affiliates. All\n"
		+"rights reserved.\n\n"

		+"LICENSES AND OTHER TERMS AND CONDITIONS\n\n"

		+"LICENSE #1: GPLv2 with Classpath Exception.\n\n"

		+"LICENSE #2: CDDL.\n\n"

		+"OTHER TERMS AND CONDITIONS INCORPORATED IN THIS AGREEMENT:\n\n"

		+"UNDER NO CIRCUMSTANCES AND UNDER NO LEGAL THEORY, WHETHER\n"
		+"TORT (INCLUDING NEGLIGENCE), CONTRACT, OR OTHERWISE, SHALL\n"
		+"YOU, THE INITIAL DEVELOPER, ANY OTHER CONTRIBUTOR, OR ANY\n"
		+"DISTRIBUTOR OF COVERED SOFTWARE, OR ANY SUPPLIER OF ANY \n"
		+"SUCH PARTIES, BE LIABLE TO ANY PERSON FOR ANY INDIRECT,\n"
		+"SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES OF ANY\n"
		+"CHARACTER INCLUDING, WITHOUT LIMITATION, DAMAGES FOR LOST\n"
		+"PROFITS, LOSS OF GOODWILL, WORK STOPPAGE, COMPUTER FAILURE\n"
		+"OR MALFUNCTION, OR ANY AND ALL OTHER COMMERCIAL DAMAGES OR\n"
		+"LOSSES, EVEN IF SUCH PARTY SHALL HAVE BEEN INFORMED OF THE\n"
		+"POSSIBILITY OF SUCH DAMAGES. THIS LIMITATION OF LIABILITY\n"
		+"SHALL NOT APPLY TO LIABILITY FOR DEATH OR PERSONAL INJURY\n"
		+"RESULTING FROM SUCH PARTY'S NEGLIGENCE TO THE EXTENT\n"
		+"APPLICABLE LAW PROHIBITS SUCH LIMITATION. SOME JURISDICTIONS\n"
		+"DO NOT ALLOW THE EXCLUSION OR LIMITATION OF INCIDENTAL OR\n"
		+"CONSEQUENTIAL DAMAGES, SO THIS EXCLUSION AND LIMITATION MAY\n"
		+"NOT APPLY TO YOU.\n"

		+"8. U.S. GOVERNMENT END USERS.\n"

		+"The Covered Software is a \"commercial item,\" as that term is\n"
		+"defined in 48 C.F.R. 2.101 (Oct. 1995), consisting of\n"
		+"\"commercial computer software\" (as that term is defined at\n"
		+"48 C.F.R. 252.227-7014(a)(1)) and \"commercial computer\n"
		+"software documentation\" as such terms are used in 48 C.F.R.\n"
		+"12.212 (Sept. 1995). Consistent with 48 C.F.R. 12.212 and 48\n"
		+"C.F.R. 227.7202-1 through 227.7202-4 (June 1995), all U.S.\n"
		+"Government End Users acquire Covered Software with only\n"
		+"those rights set forth herein. This U.S. Government Rights\n"
		+"clause is in lieu of, and supersedes, any other FAR, DFAR,\n"
		+"or other clause or provision that addresses Government\n"
		+"rights in computer software under this License.\n";


	}
}
