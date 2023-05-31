package adapters;

import java.util.Random;

public class RandomAdapter implements RandomNumber{
    private Random random = new Random();
    private Random randomSeed;

    @Override
    public double generateRandom() {
        return random.nextDouble();
    }

    @Override
    public double[] generateRandoms(int size) {
        return random.doubles(size).toArray();
    }

    @Override
    public void reseedGenerator(long seed) {
        randomSeed = new Random(seed);
    }
}
