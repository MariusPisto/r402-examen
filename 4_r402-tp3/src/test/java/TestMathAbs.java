import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMathAbs {

    @ParameterizedTest
    @MethodSource("inputTestAbs")
    void testAbs(int x, int y) {
        assertEquals(y, Math.abs(x));
    }

    static Stream<Arguments> inputTestAbs() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(-1, 1),
                Arguments.of(-2, 2)
        );
    }
}
