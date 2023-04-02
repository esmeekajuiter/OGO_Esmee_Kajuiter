package Classes;

import java.awt.Frame;
import javax.swing.JOptionPane;

/**The About-box for JabberPoint.
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public class AboutBox extends TxtScanner{
	public static void show(Frame parent) {
		JOptionPane.showMessageDialog(parent,
				textAboutBox.get(0) + "\n" +
						textAboutBox.get(1) + "\n" +
						textAboutBox.get(2) + "\n" +
						textAboutBox.get(3) + "\n" +
						textAboutBox.get(4) +
						textAboutBox.get(5) + "\n" +
						textAboutBox.get(6) + "\n",
				textAboutBox.get(7),
				JOptionPane.INFORMATION_MESSAGE
		);
	}
}
