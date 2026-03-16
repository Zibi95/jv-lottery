package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Colors randomColor = colorSupplier.getRandomColor();
        Random randomizer = new Random();
        int maxNumber = 100;
        int randomNumber = randomizer.nextInt(maxNumber + 1);

        return new Ball(randomColor, randomNumber);
    }
}
