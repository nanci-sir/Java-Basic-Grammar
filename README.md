# Java-Basic-Grammar
Javaj基础语法
# 类型转换

## 1.自动类型转换

```
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
```

类型转换转换的原因：存在不同类型的变量赋值给其他类型的变量 

自动类型转换是：类型范围小的变量，可以直接赋值给类型范围大的变量

## 2.表达式的自动类型转换

表达式的自动类型转换是什么样的？

  小范围的类型会自动转换成大范围的类型运算。

表达式的最终结果类型是由谁决定的？

  最终类型由表达式中的最高类型决定。 

表达式的有哪些类型转换是需要注意的？ 

   byte short char是直接转换成int类型参与运算的

```
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
```

## 3.强制类型转换

   类型范围大的数据或者变量，不能直接**赋值**给**类型范围小**的变量，会报错，把一个表示数据范围大的数值或者变量赋值给另一个表示数据范围小的变量必须进行强制类型转换。

强制类型转换格式：目标数据类型 变量名 = (目标数据类型)值或者变量;

整数默认是int类型，byte、short和char类型数据参与运算均会自动转换为int类型；

boolean类型不能与其他基本数据类型相互转；

强制类型转换有哪些需要注意的？ 

可能出现数据丢失。 小数强制转换成整数是直接截断小数保留整数。

```
package type;
public class TypeDemo3 {
    public static void main(String[] args) {
        //理解强制类型转换
        int a = 20;
        byte b= (byte) a;
        System.out.println(a);//20
        System.out.println(b);//20

        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);//-36

        double score = 99.5;
        int it = (int) score;
        System.out.println(it);//99
    }
}
```
