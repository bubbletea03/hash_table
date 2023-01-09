public class Test {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.insert("asdf", 1234);
        table.insert("zxcv", 5678);
        table.insert("abcdefghijklnmop", 9);
        table.insert("helloworld", 777);

        int v1 = table.get("asdf");
        System.out.println(v1);

        int v2 = table.get("zxcv");
        System.out.println(v2);


        int v3 = table.get("abcdefghijklnmop");
        System.out.println(v3);

        table.remove("helloworld");
        int v4 = table.get("helloworld");
        System.out.println(v4);
    }
}
