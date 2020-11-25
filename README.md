# 우아한테크코스 1주차 미션 - 숫자 야구 게임

## 🚀 TODO
- [ ] 랜덤으로 세 개의 숫자를 뽑아 Set으로 반환하는 메소드
    - [ ] `LinkedHashSet<Integer>` 를 이용하여 순서를 유지한 Set 생성
    - [ ] 중복되지 않는 숫자 세 개를 생성한 Set에 넣음 
        1. `RandomUtils.nextInt(1, 9)` 호출을 통해 1~9 사이의 랜덤한 숫자 추출
        2. 해당 숫자가 이미 Set에 있을 경우, Set에 없는 숫자를 얻을 때까지 1을 반복
        3. 해당 숫자가 Set에 없을 경우, Set에 해당 숫자를 삽입
        4. Set의 크기가 3이 될 때까지 a~c를 반복
    - [ ] Set을 반환
- [ ] 사용자의 입력(`String`)의 형태가 제대로 되었는지 확인하는 메소드
    - [ ] 문자열이 다음과 같은 조건들에 해당하는지 확인
        1. 문자열의 길이가 3인지 확인
        2. 문자열의 모든 문자가 `'1'`부터 `'9'` 사이 범위의 문자인지 확인
        3. 문자열의 문자로부터 중복된 숫자가 있는지 확인 
    - [ ] 위의 조건 중 하나라도 해당될 경우, `false` 반환
    - [ ] 위의 조건에 겹치지 않을 경우, `true` 반환
- [ ] 정답 Set과 사용자의 입력 배열을 비교하여 스트라이크/볼 갯수를 반환해주는 메소드
    - [ ] 정답 Set을 배열로 변환
    - [ ] 두 배열의 값을 index가 같은 값끼리 비교하여, 일치하는 숫자(스트라이크)의 갯수를 구함
    - [ ] 스트라이크가 되지 않은 숫자가 있을 경우, 해당 숫자가 정답 Set에 있는지 `.contains()`를 통해 확인(볼)하여 그 갯수를 구함
    - [ ] 스트라이크와 볼의 갯수를 반환
- [ ] 게임 진행 메소드
    - [ ] 랜덤으로 세 개의 숫자를 뽑아 Set으로 반환하는 메소드를 통해 정답 Set 저장
    - [ ] 사용자에게 숫자 입력을 안내하는 메시지 출력
    - [ ] `scanner.nextLine()`을 통해 문자열을 입력을 받음
    - [ ] 입력받은 문자열을 상기한 사용자의 입력을 확인하는 메소드를 통해 입력의 적합성을 검증
    - [ ] 입력이 제대로 되지 않았을 경우, `IllegalArgumentException` 발생
    - [ ] 입력에 문제가 없을 경우, 해당 문자열을 숫자의 배열로 전환하여 저장
    - [ ] 스트라이크/볼 갯수를 메소드를 통해 구하고 이를 출력
    - [ ] 스트라이크가 3개가 될 때까지 위의 절차를 반복
    - [ ] 스트라이크가 3개일 경우 반복 종료
- [ ] `main` 메소드
    - [ ] 게임 진행 메소드 호출
    - [ ] 게임 진행 메소드가 종료된 경우, 게임 종료를 안내하고 게임을 다시 시작할지 질문 
    - [ ] 다시 시작하지 않길 원할 때까지 위의 절차를 반복
    - [ ] 다시 시작하지 않길 원하는 경우 반복 종료

## 📝 License

This project is [MIT](https://github.com/woowacourse/java-baseball-precourse/blob/master/LICENSE) licensed.
