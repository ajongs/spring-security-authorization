package nextstep.security.authentication;

public class ForbiddenException  extends RuntimeException {
    public ForbiddenException() {
        super("인가에 실패하였습니다.");
    }

    public ForbiddenException(String message) {
        super(message);
    }
}
