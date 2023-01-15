package Controls;

import Classes.Presentation;

public class DemoPresentationWriter extends Writer {
    @Override
    public void saveFile(Presentation presentation, String unusedFilename) {
        throw new IllegalStateException("Save As->Demo! called");
    }
}
