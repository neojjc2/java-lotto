package lotto.domain;

import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.assertThat;

class LottoMachineTest {

    @RepeatedTest(20)
    void 로또_번호가_잘_나오는지_테스트한다() {
        assertThat(LottoMachine.generate())
                .hasSize(6)
                .allMatch(number -> number.getValue() >= LottoPolicy.LOTTO_MINIMUM_NUMBER && number.getValue() <= LottoPolicy.LOTTO_MAXIMUM_NUMBER);
    }
}
