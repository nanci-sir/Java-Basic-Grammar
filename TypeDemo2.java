package type;
public class TypeDemo2 {
    public static void main(String[] args) {
        byte a = 20;
        int b = 10;
        double c = 1.0;
        double rs = a + b + c;
        System.out.println(rs); // 31.0

        double rs2 = a + b - 2.3;
        System.out.println(rs2);  // 27.7

        //面试题
        byte i = 100;
        byte j = 100;
        int k = i+ j;
        System.out.println(k);//为了结果保真性 200
    }
}

