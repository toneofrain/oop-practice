package org.example.kiosk;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * 1. 음식점에서 음식 주문하는 과정 구현
 * ㄴ 손님, 메뉴판, 메뉴, 요리사 ,요리
 * 2. 객체들 간의 관계 고민
 * 3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
 * 4. 협력을 설계
 * 5. 객체들을 포괄하는 타입에 적절한 책임을 할당
 * 6. 구현하기
 */
public class CustomerTest {

    @Test
    @DisplayName("메뉴이름에 해당하는 요리를 주문한다.")
    void orderTest() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 5000),
                new MenuItem("냉면", 7000)));

        Cooking cooking = new Cooking();

        assertThatCode(() -> customer.order("돈까스", menu, cooking))
                .doesNotThrowAnyException();
    }
}
