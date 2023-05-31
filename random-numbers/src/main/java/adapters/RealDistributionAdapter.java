package adapters;

import org.apache.commons.math3.distribution.NormalDistribution;

public class RealDistributionAdapter implements RandomNumber {
    NormalDistribution random = new NormalDistribution();
    @Override
    public double generateRandom() {
        return random.sample();
    }

    @Override
    public double[] generateRandoms(int size) {
        return random.sample(size);
    }

    @Override
    public void reseedGenerator(long seed) {
        random.reseedRandomGenerator(seed);
    }
}
