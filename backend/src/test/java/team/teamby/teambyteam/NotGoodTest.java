package team.teamby.teambyteam;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NotGoodTest {

    @Test
    @DisplayName("not good test")
    void test() {
        // given
        final int numberOne = 1;

        // when

        //then
        assertThat(numberOne).isEqualTo(2);
    }
}
