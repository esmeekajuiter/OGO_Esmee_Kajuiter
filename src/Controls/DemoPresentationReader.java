package Controls;

import Classes.BitmapItem;
import Classes.Presentation;
import Classes.Slide;
import Classes.TxtScanner;

public class DemoPresentationReader extends TxtScanner implements Reader{
    @Override
    public void loadFile(Presentation presentation, String unusedFilename) {
        presentation.setTitle(textsDemoPresentationReader.get(0));
        Slide slide;
        slide = new Slide();
        slide.setTitle(textsDemoPresentationReader.get(1));
        slide.append(1, textsDemoPresentationReader.get(2));
        slide.append(2, textsDemoPresentationReader.get(3));
        slide.append(2, textsDemoPresentationReader.get(4));
        slide.append(2, textsDemoPresentationReader.get(5));
        slide.append(4, textsDemoPresentationReader.get(6));
        slide.append(4, textsDemoPresentationReader.get(7));
        slide.append(1, textsDemoPresentationReader.get(8));
        slide.append(3, textsDemoPresentationReader.get(9));
        slide.append(3, textsDemoPresentationReader.get(10));
        slide.append(3, textsDemoPresentationReader.get(11));
        presentation.append(slide);

        slide = new Slide();
        slide.setTitle(textsDemoPresentationReader.get(12));
        slide.append(1, textsDemoPresentationReader.get(13));
        slide.append(2, textsDemoPresentationReader.get(14));
        slide.append(1, textsDemoPresentationReader.get(15));
        slide.append(1, textsDemoPresentationReader.get(16));
        slide.append(2, textsDemoPresentationReader.get(17));
        slide.append(3, textsDemoPresentationReader.get(18));
        slide.append(4, textsDemoPresentationReader.get(19));
        presentation.append(slide);

        slide = new Slide();
        slide.setTitle(textsDemoPresentationReader.get(20));
        slide.append(1, textsDemoPresentationReader.get(21));
        slide.append(2, textsDemoPresentationReader.get(22));
        slide.append(1, textsDemoPresentationReader.get(23));
        slide.append(1, textsDemoPresentationReader.get(24));
        slide.append(new BitmapItem(1, textsDemoPresentationReader.get(25)));
        presentation.append(slide);
    }
}
