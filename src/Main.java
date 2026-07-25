import java.io.Reader;

void main() {
    Reader reader = new StringReader("123\nabc\n-45\n");

    for (Integer x : new SolutionIter(reader)) {
        System.out.println(x);
    }
}
