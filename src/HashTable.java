/*
-- 메모장 --

해쉬 테이블 원리를 조사해보니 충돌 처리법으로
    1. 분리 연결법 (연결 리스트를 갖다넣기)
    2. 개방 주소법 (빈 공간 사용하기)
이런게 있는데
'분리 연결법'을 쓰면 <조건3> 만족시킬 수 있다!


 */

public class HashTable {
    private int BUCKET_COUNT = 2000;
    public HashTable() {

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}