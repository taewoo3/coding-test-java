* Prob1 : id 061
  * 번역 오류로 짜증나서 공부 안함
* Prob2 : id 062
  * https://atcoder.jp/contests/math-and-algorithm/tasks/abc167_d
  * N번의 이동 횟수 이내에 cycle이 생긴다는 아이디어는 생각해냄
  * 근데 cycle의 시작점이 0이 아닌 경우를 간과해서 한번 틀림
  * long % int를 지저분하게 짠게 거슬림
    * 아예 결과 타입을 long으로 하면 캐스팅 필요없음
  * startIdx, endIdx 대신 firstSeenAt 을 기록하면 깔끔하게 짤 수 있음
  * cycleLen, cycleStart를 알면 답을 구할 수 있음