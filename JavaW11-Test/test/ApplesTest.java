import com.testing.Apples;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApplesTest {
    private Apples te;

    @BeforeEach
    public void setup() {
        te = new Apples();
    }

    @Test
    public void getAppleOK() {
        // Arrange
        String content = "apple";
        var expected = "apple";
        // Act
        assertEquals(expected,te.getApple());
    }
}
