package baseball;

import baseball.domain.AnswerExceptionTest;
import baseball.domain.NewGameExceptionTest;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static baseball.domain.AnswerExceptionTest.*;
import static baseball.domain.NewGameExceptionTest.*;
import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;

class ApplicationTest extends NsTest {

    @Test
    void 게임종료_후_재시작() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("246", "135", "1", "597", "589", "2");
                    assertThat(output()).contains("낫싱", "3스트라이크", "1볼 1스트라이크", "3스트라이크", "게임 종료");
                },
                1, 3, 5, 5, 8, 9
        );
    }

    @Test
    void 사용자_입력_예외_테스트() {
        ArrayList<AnswerExceptionTest> data = getAnswerExceptionTest();
        for (AnswerExceptionTest test : data) {
            assertSimpleTest(() ->
                assertThatThrownBy(() -> runException(test.answer))
                    .isInstanceOf(IllegalArgumentException.class)
            );
        }
    }

    @Test
    void 재시작_예외_테스트(){
        ArrayList<NewGameExceptionTest> data = getNewGameExceptionTest();
        for (NewGameExceptionTest test : data) {
            assertSimpleTest(() ->
                assertThatThrownBy(() -> runException(test.input))
                    .isInstanceOf(IllegalArgumentException.class)
            );
        }
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
