package type;
public class dmo<a, b> {
    public static void main(String[] args) {
        byte a = 20;
        int b = a; //发生了自动类型转换
        System.out.println(a);
        System.out.println(b);

        int age = 23;
        double c = age;//自动类型转换
        System.out.println(c);

        char ch = 'a'; //0001100
        int code = ch;//00000000 00000000 00000000 00001100
        System.out.println(code);//37
    }
}
