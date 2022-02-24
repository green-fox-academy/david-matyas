import com.testing.Anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
    private Anagram te;

    @BeforeEach
    public void setup() {
        te = new Anagram();
    }


    @Test
    public void isAnagramOK() {
        // Arrange
        var word1 = "Listen";
        var word2 = "siLent";

        // Act & assert
        assertTrue(te.isAnagram(word1,word2));
    }

    @Test
    public void isAnagramCaseSensitivity() {
        // Arrange
        var word1 = "Listen";
        var word2 = "Silent";

        // Act & assert
        assertTrue(te.isAnagram(word1,word2));
    }

    @Test
    public void isAnagramNOK() {
        // Arrange
        var word1 = "L";
        var word2 = "S";

        // Act & assert
        assertFalse(te.isAnagram(word1,word2));
    }
    @Test
    public void isAnagramNull() {
        // Arrange
        var word1 = null;
        var word2 = null;

        // Act & assert
        assertFalse(te.isAnagram(word1,word2));
    }

}
