import java.util.Random;

public class MyRandom extends Random {

    public MyRandom() {
        super();
    }

    public MyRandom(long seed) {
        super(seed);
    }

    @Override
    public synchronized void setSeed(long seed) {
        super.setSeed(seed);
    }

    @Override
    protected int next(int bits) {
        return super.next(bits);
    }

    @Override
    public int nextInt() {
        return super.nextInt();
    }

    @Override
    public int nextInt(int bound) {
        return super.nextInt(bound);
    }
}
