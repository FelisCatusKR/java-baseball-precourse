package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 야구 게임에서 각 자리의 숫자를 도맡는 클래스
public class BaseballNumbers {

    // 최대 투구 횟수를 저장할 변수
    // 이번 숫자 야구게임에서는 세 개의 투구만을 하므로, 이 값은 3이다
    public static final int MAX_PITCH = 3;

    // 각 투구에 해당하는 숫자를 저장해 둘 배열
    private final List<Integer> numberList;

    public BaseballNumbers(List<Integer> numberList) {
        validateSize(numberList);
        validateDuplicate(numberList);
        this.numberList = numberList;
    }

    // 입력받은 배열의 크기가 MAX_PITCH 값과 같은지 확인하는 메소드
    private void validateSize(List<Integer> baseballNumbers) {
        if (baseballNumbers.size() != MAX_PITCH) {
            String exceptionMessage = "숫자는 " + MAX_PITCH + "개만 입력해야 합니다";
            throw new IllegalArgumentException(exceptionMessage);
        }
    }

    // 입력받은 배열 내에 중복된 값이 있는지 확인하는 메소드
    private void validateDuplicate(List<Integer> baseballNumbers) {
        Set<Integer> baseballNumberSet = new HashSet<>(baseballNumbers);
        // 중복된 수가 입력받은 배열에 있을 경우, 배열과 셋의 길이가 다른 것을 이용
        if (baseballNumbers.size() != baseballNumberSet.size()) {
            throw new IllegalArgumentException("배열 내에 중복된 숫자가 있으면 안 됩니다");
        }
    }
}