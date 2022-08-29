package org.example.kiosk;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CookingTest {

    @Test
    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    void makeCookTest() {

        Cooking cooking = new Cooking();
        MenuItem menuItem = new MenuItem("돈까스", 5000);

        Cook cook = cooking.makeCook(menuItem);

        assertThat(cook)
                .isEqualTo(new Cook("돈까스", 5000));

    }
}
