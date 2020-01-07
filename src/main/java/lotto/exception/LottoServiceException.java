package lotto.exception;

import lotto.domain.LottoError;

public class LottoServiceException extends RuntimeException {

    private final String code;

    public LottoServiceException(LottoError lottoError) {
        super(lottoError.getDescription());
        this.code = lottoError.getCode();
    }
}
