package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringTest {

    @Test
    @DisplayName("String.replace() 메서드는 가장 처음 만난 목표값을 기댓값으로 바꾼다.")
    void replaceTest() {
        final String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("String.substring() 메서드는 지정한 범위만큼 문자열을 반환한다.")
    void substringTest() {
        final String input = "(1,2)";
        String result = input.substring(1, input.length() - 1);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("String.split() 메서드는 지정한 값을 기준으로 문자열을 나눈다.")
    void splitTest() {
        String[] input = "(1,2)".split(",");
        assertThat(input).containsExactly("(1","2)");

        input = "1,2".split(",");
        assertThat(input).containsExactly("1","2");

        input = "1".split(",");
        assertThat(input).contains("1");
    }

    @Test
    @DisplayName("String.charAt() 메서드는 전달된 인덱스의 기댓값을 char로 반환한다.")
    void charAtTest() {
        final String input = "abc";
        assertThat(input.charAt(0)).isEqualTo('a');
        assertThat(input.charAt(1)).isEqualTo('b');
        assertThat(input.charAt(2)).isEqualTo('c');
    }

    @Test
    @DisplayName("String.charAt() 메서드는 전달된 인덱스의 범위가 초과하면 예외를 반환한다.")
    void charAtExceptionTest() {
        final String input = "abc";
        assertThatThrownBy(() -> input.charAt(4))
                .isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
