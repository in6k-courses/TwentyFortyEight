package twentyfortyeight;

import twentyfortyeight.model.Field;

/**
 * Created by employee on 7/19/16.
 */
public class Game {

    public Field startGame() {
        Field field = new Field();
        field.setEmptyField();
        field.setDigitToRandomCell();
        field.setDigitToRandomCell();
        return field;
    }
}
