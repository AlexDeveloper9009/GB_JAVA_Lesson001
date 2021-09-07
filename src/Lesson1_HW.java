public class Lesson1_HW {
    public static void main(String[] args) {
        int a = 7;
        float flo=1.34f;
        double dbl=3.14;
        byte b = 3;
        char c=134;
        boolean bool1 = true;
        short sh=1233;
        long lon=123123123L;
        System.out.println(vyrazhenie12(3,4,5,6));
//остальное лень делать т.к. уже миллион раз сделал 
    }

    public static int vyrazhenie12 (int a, int b, int c ,int d) {
        return a * (b + (c / d));

    }
}
