package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Colors[] colors = Colors.values();

    public Colors getRandomColor() {
        Random randomGenerator = new Random();
        int randomIndex = randomGenerator.nextInt(this.colors.length);

        return this.colors[randomIndex];
    }
}
