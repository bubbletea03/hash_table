/*
-- 메모장 --

해쉬 테이블 원리를 조사해보니 충돌 처리법으로
    1. 분리 연결법 (연결 리스트를 갖다넣기)
    2. 개방 주소법 (빈 공간 사용하기)
이런게 있는데
'분리 연결법'을 쓰면 <조건3> 만족시킬 수 있다!


 */

public class HashTable {
    private Bucket[] buckets = new Bucket[2000];

    // 키 값 조회
    public int get(String key) {
        int index = hash(key);
        int value = buckets[index].get(key);

        return value;
    }

    // 키 값 삭제
    public void remove(String key) {
        int index = hash(key);
        buckets[index].remove(key);
    }

    // 키 값 삽입
    public void insert(String key, int value) {
        int index = hash(key);

        if (buckets[index] == null) {
            buckets[index] = new Bucket();
        }

        buckets[index].add(key, value);
    }

    // 해시 함수 - 각각의 알파벳 아스키코드를 합하는 방식
    private int hash(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sum += (int)ch;
        }

        return sum % 2000;
    }
}