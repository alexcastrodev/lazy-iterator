import java.io.StringReader;

void main() {
    Reader reader = new StringReader("123\nabc\n-45\n");
    SolutionIter iter = new SolutionIter(reader);

    for (Integer x : iter) {
        System.out.println(x);
    }
}
