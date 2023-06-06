import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class SuggestionEngineTest {

    @Test
    public void loadDictionaryData() {

    }

    @Test
    public void generateSuggestions() {
        SuggestionEngine tester = new SuggestionEngine();
        String word = tester.generateSuggestions("hello");
        Assertions.assertEquals("hello", word);
    }

    @Test
    public void main() {
    }
}