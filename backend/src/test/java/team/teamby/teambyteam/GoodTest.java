package team.teamby.teambyteam;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoodTest {

    @Test
    @DisplayName("Really Good Test")
    void goodTest() {
        // given
        final int numberOne = 1;

        // when

        //then
        assertThat(numberOne).isEqualTo(1);
    }
}
