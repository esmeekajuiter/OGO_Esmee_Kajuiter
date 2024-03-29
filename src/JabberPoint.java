import Classes.*;
import Controls.*;

import javax.swing.JOptionPane;

import java.io.IOException;
import java.util.ArrayList;

/** JabberPoint Main Program
 * <p>This program is distributed under the terms of the accompanying
 * COPYRIGHT.txt file (which is NOT the GNU General Public License).
 * Please read it. Your use of the software constitutes acceptance
 * of the terms in the COPYRIGHT.txt file.</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public class JabberPoint extends TxtScanner{
	protected static final String IOERR = textMain.get(0);
	protected static final String JABERR = textMain.get(1);
	protected static final String JABVERSION = textMain.get(2);

	/** The main program */
	public static void main(String[] argv) {
		Style.createStyles();
		Presentation presentation = new Presentation();
		SlideView slideView = new SlideView(presentation);
		new SlideViewerFrame(JABVERSION, presentation, slideView);
		DemoPresentationReader demoPresentationReader = new DemoPresentationReader();
		try {
			if (argv.length == 0) { //a demo presentation
				demoPresentationReader.loadFile(presentation, "");
			} else {
				new XMLAccessorReader().loadFile(presentation, argv[0]);
			}
			slideView.setSlideNumber(0);
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null,
					IOERR + ex, JABERR,
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
