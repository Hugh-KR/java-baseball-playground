package study;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class SetTest {

    private final Set<Integer> numbers = new HashSet<>();

    @BeforeEach
    void setUp() {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
    }

    @Test
    @DisplayName("Set.size() 메서드는 포함한 원소의 개수를 반환한다.")
    void sizeTest() {
        assertThat(numbers.size()).isEqualTo(4);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    @DisplayName("Set.contains() 메서드는 기댓값이 포함된 경우 참을 반환한다.")
    void containsTest(final int expected) {
        assertThat(numbers.contains(expected)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true" , "2:true", "3:true", "4:true", "5:false", "6:false", "7:false"},
            delimiter = ':')
    @DisplayName("Set.contains() 메서드는 기댓값이 포함된 경우 참을 반환하고 아닌 경우 거짓을 반환한다.")
    void valuesContainsTest(final int actual, final boolean expected) {
        assertThat(numbers.contains(actual)).isEqualTo(expected);
    }

    @AfterEach
    void clearSet() {
        numbers.clear();
    }
}
