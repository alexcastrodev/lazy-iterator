import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.regex.Pattern;

public class SolutionIter implements Iterator<Integer> {
    private final BufferedReader reader;
    private Integer nextValue;
    private boolean loaded = false;
    private boolean finished = false;
    private final Pattern pattern = Pattern.compile("[+-]?(0|[1-9][0-9]*)");

    public SolutionIter(Reader inp) {
        this.reader = new BufferedReader(inp);
    }

    public Iterator<Integer> iterator() {
        return new SolutionIter(reader);
    }

    @Override
    public boolean hasNext() {
        if (finished) {
            return false;
        }

        if (loaded) {
            return true;
        }

        try {
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (!pattern.matcher(line).matches()) {
                    continue;
                }
            }
        } catch (IOException e) {
            finished = true;
            return false;
        }
    }

    @Override
    public Integer next() {
        return 0;
    }
}
