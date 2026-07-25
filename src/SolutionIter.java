import java.io.BufferedReader;
import java.io.Reader;
import java.util.Iterator;

public class SolutionIter implements Iterator<Integer> {
    private final BufferedReader reader;

    public SolutionIter(Reader inp) {
        this.reader = new BufferedReader(inp);
    }

    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return 0;
    }
}
