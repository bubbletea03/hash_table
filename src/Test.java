public class Test {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();

        bucket.add("asdf", 1234);
        bucket.add("zxcv", 5678);

        bucket.remove("asdf");

        int v = bucket.get("asdf");
        int v2 = bucket.get("zxcv");

        System.out.println(v);
        System.out.println(v2);
    }
}
