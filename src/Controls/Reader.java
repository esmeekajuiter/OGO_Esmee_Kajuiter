package Controls;

import Classes.Presentation;

import java.io.IOException;

public abstract class Reader {
     public abstract void loadFile(Presentation p, String fn) throws IOException;
}
