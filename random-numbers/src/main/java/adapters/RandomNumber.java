package adapters;

public interface RandomNumber {

    double generateRandom();

    double[] generateRandoms(int size);

    void reseedGenerator(long seed);
}
