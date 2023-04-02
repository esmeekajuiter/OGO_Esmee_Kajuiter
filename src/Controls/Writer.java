package Controls;

import Classes.Presentation;

import java.io.IOException;

interface Writer {
    void saveFile(Presentation p, String fn) throws IOException;
}
