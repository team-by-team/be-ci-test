package team.teamby.teambyteam.teamplace.domain;

import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    @org.junit.jupiter.api.Test
    @DisplayName("")
    void test() {
        System.out.println("Wow good~~~");
        System.out.println("cool");
        System.out.println("언제 끝ㅈ날까아ㅏ....");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("")
    void wrong() {
        final int num = 1;

        assertThat(num).isEqualTo(2);


    }

    @org.junit.jupiter.api.Test
    @DisplayName("")
    void good() {
        final int num = 1;

        assertThat(num).isEqualTo(1);


    }
}
