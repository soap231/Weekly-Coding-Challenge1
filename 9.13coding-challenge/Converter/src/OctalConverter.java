public class OctalConverter{
    public static StringBuffer decimalToOctal(int input){
        StringBuffer octalString = new StringBuffer();
        int remainder = input;
        int i = 0;
        while(remainder != 0 ){
            int x = remainder % 8;
            octalString.append(x);
            remainder = remainder / 8;
            i = i+1;
        }
        return octalString.reverse();
    }
    public static void main(String[] args) {
        int input = 123;
        System.out.println("convert " + input + "(decimal) to its octal equivalent: " + decimalToOctal(input));
    }
}
