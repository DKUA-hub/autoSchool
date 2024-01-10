package module2;

public class Casting {
    public static void main(String[] args) {
        int q = 21;
        int w = 8;
        divideWithReminder(q, w);
        sumDigits(q);
        sumDigits(w);
        float x = 33.5000001f;
        roundNum(x);
        changeNums(0, 2,5);


    }

    static void divideWithReminder(int a, int b){
        int result = a/b;
        int reminder = a%b;
        System.out.printf("%d / %d = %d and %d is reminder%n", a, b, result, reminder);
    }

    static void sumDigits(int a){
        if (9<a && a<100) {
            int b = a/10;
            int c = a%10;
            System.out.printf("for %d sum %d and %d => %d%n", a, b, c, b+c);
        } else {
            System.out.println(a + " is not a two digit number.\n");
        }
    }

    static void roundNum(float a){
        int i = (int)a;
        float x = a - (float)i;
        if ((float)1-x <= 0.5) i++;
        System.out.printf("For input %f the fractional part is %f and nearest int is %d%n", a, x, i);
    }

    static void changeNums(int a, int b, int c){
        System.out.printf("For old values a=%d, b=%d, c=%d%n", a, b, c);
        int abSum = a + b;
        int caDif = c - a;
        c = a + b + c;
        a = abSum;
        b = caDif;
        System.out.printf("Changed values a=%d, b=%d, c=%d%n", a, b, c);
    }
}
