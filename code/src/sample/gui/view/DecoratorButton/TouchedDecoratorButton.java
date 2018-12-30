package sample.gui.view.DecoratorButton;

import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class TouchedDecoratorButton extends DecoratorButton {
    public TouchedDecoratorButton(CaseButton button) {
        super(button);
    }

    @Override
    protected void addIcon() {
        // create the red circle representing a boat
        Rectangle orangeRect = new Rectangle(ICON_SIZE, ICON_SIZE);
        orangeRect.setFill(Color.ORANGE);

        icons.getChildren().add(orangeRect);

    }
}
