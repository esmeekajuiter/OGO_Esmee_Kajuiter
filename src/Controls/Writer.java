package Controls;

import Classes.Presentation;

import java.io.IOException;

public abstract class Writer {
    public abstract void saveFile(Presentation p, String fn) throws IOException;
}
