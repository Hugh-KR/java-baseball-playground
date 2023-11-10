package study;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class CollectionTest {

    private final List<String> input = new ArrayList<>();

    @Test
    void arrayList() {
        input.add("first");
        input.add("second");
        assertThat(input.add("third")).isTrue();
        assertThat(input).hasSize(3);
        assertThat(input.get(0)).isEqualTo("first");
        assertThat(input).contains("first");
        assertThat(input.remove(0)).isEqualTo("first");
        assertThat(input).hasSize(2);
    }
}
