package org.example.kiosk;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MenuTest {

    @Test
    @DisplayName("메뉴이름에 해당하는 메뉴를 반환한다.")
    void chooseTest() {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000),
                new MenuItem("냉면", 7000)));

        MenuItem menuItem = menu.choose("돈까스");

        Assertions.assertThat(menuItem).isEqualTo(new MenuItem("돈까스", 5000));
    }

    @Test
    @DisplayName("메뉴판에 없는 메뉴를 주문할 시 예외를 반환한다.")
    void chooseTest2() {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000),
                new MenuItem("냉면", 7000)));

        Assertions.assertThatCode(() -> menu.choose("통닭"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("잘못된 메뉴 이름입니다.");
    }
}
