package Classes;

import static Classes.Constants.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class SlideView {

    private SlideViewerComponent slideViewComponent;
    private Presentation presentation;

    public SlideView(Presentation presentation) {
        presentation.clear();
        this.presentation = presentation;
    }

    public void SetPresentation(Presentation presentation) {
        this.presentation = presentation;
    }

    public void setShowView(SlideViewerComponent slideViewerComponent) {
        this.slideViewComponent = slideViewerComponent;
    }

    //Change the current slide number and report it to the window
    public void setSlideNumber(int number) {
        presentation.setSlideNumber(number);
        if (slideViewComponent != null) {
            slideViewComponent.update(presentation, presentation.getCurrentSlide());
        }
    }

    //Navigate to the previous slide unless we are at the first slide
    public void prevSlide() {
        if (presentation.getSlideNumber() > 0) {
            setSlideNumber(presentation.getSlideNumber() - 1);
        }
    }

    //Navigate to the next slide unless we are at the last slide
    public void nextSlide() {
        if (presentation.getSlideNumber() < (presentation.getSize()-1)) {
            setSlideNumber(presentation.getSlideNumber() + 1);
        }
    }

}
