# java-ladder

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 용어 정의

+ 사다리(ladder) :

```
  |-----|     |-----|
  |     |-----|     |
  |-----|     |     |
  |     |-----|     |
  |-----|     |-----|
```

+ 라인(line) :

```
|-----|     |-----|
```

+ 다리(bridge) : 다리가 존재하면 1, 다리가 존재하지 않으면 0

```
|-----|
```

```
|     |
```

## 기능 구현 목록

### 참여자 등록 기능

- [x] 참여자 이름은 최대 5글자이다
- [x] 참여자 수는 최소 2명이다

### 사다리 생성 기능

- [x] 사다리 높이는 1이상이다
- [x] 사다리는 사다리 높이만큼의 라인을 가진다 (높이: 3 -> 라인: 3개)

### 다리 놓기 기능

- [x] 한 라인에서 다리가 겹치지 않게 랜덤으로 놓는다

### 출력 기능

- [ ] 사다리 폭은 가능한 참여자 이름의 최대 길이와 같게 출력한다
- [ ] 사다리를 출력할 때 사람 이름도 같이 출력한다

### 입력 기능

- [x] 참여자 이름은 쉼표(,)를 기준으로 구분해 입력한다
- [ ] 최대 사다리 높이는 숫자로 입력한다
