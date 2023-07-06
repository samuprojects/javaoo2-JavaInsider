package generator;

@SuppressWarnings("ALL")
public class SequenceGenerator implements Generator {

    private int current;


    @Override
    public int next() {
        return ++current;
    }
}
