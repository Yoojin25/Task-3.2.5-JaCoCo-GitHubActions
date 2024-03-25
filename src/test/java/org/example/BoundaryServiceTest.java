package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

public class BoundaryServiceTest {

    private BoundaryService boundaryService = new BoundaryService();

    private static Stream<int[]> arrays() {
        return Stream.of(
                new int[] {0});
    }

    @ParameterizedTest(name = "Массив #{index}: {0}")
    @MethodSource("arrays")
    public void testFindMin(int[] input) {
        int expected = IntStream.of(input).min().getAsInt();
        int actual = boundaryService.findMin(input);

        assertEquals(expected, actual);
    }
}
