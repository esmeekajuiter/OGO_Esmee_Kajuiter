package Controls;

import Classes.Presentation;
import Classes.TxtScanner;

public class DemoPresentationWriter extends TxtScanner implements Writer {
    @Override
    public void saveFile(Presentation presentation, String unusedFilename) {
        throw new IllegalStateException(textsDemoPresentationReader.get(26));
    }
}