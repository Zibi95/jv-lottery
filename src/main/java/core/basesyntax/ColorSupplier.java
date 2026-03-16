package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Colors[] colors = Colors.values();
    private final Random randomizer = new Random();

    public Colors getRandomColor() {
        int randomIndex = this.randomizer.nextInt(this.colors.length);

        return this.colors[randomIndex];
    }
}
