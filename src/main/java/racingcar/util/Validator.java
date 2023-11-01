package racingcar.util;

public class Validator {
    private final static String SYMBOL = ",";
    private final static int MAXIMUM_NAME_LENGTH = 5;

    private void validateIsBlank(String carsName) {
        if (carsName.isBlank()) {
            throw new IllegalArgumentException("자동차의 이름은 공백일 수 없습니다.");
        }
    }

    private void validateContainSymbol(String carsName) {
        if (!carsName.contains(SYMBOL)) {
            throw new IllegalArgumentException();
        }
    }
}
