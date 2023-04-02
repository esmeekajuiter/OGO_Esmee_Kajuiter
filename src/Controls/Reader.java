package Controls;

import Classes.Presentation;

import java.io.IOException;

interface Reader {
     void loadFile(Presentation p, String fn) throws IOException;
}
