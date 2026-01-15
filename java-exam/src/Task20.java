public class Task20 {
    public static void main(String[] args) {
        int x = 46464646;
        System.out.println(sum(x));
    }

    public static int sum(int n) {
        return n>0 ? n%10 + sum(n/10) : 0;
    }
}
