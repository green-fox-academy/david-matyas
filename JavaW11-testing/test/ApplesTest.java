import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {
    @Test
    public void getAppleOK() {
        // Arrange
        String content = "apple";
        var expected = "apple";
        // Act
        assertEquals(expected,content);
    }
//    @Test
//    public void getAppleNOK() {
//        // Arrange
//        String content = "orange";
//        var expected = "apple";
//        // Act
//        assertEquals(expected,content);
//    }

}