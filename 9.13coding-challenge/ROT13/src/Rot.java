
public class Rot {
    public static String rot(String input ){
        //ASCII table: 65(A), 90(Z), 97(a), 122(z)
        char[] charArray = input.toCharArray();
        char[] newCharArray = new char[charArray.length];
        for(int i = 0; i < charArray.length; i++){
            char letter = charArray[i];
            if(letter >= 'A' && letter <= 'M'){
                letter += 13;
            }
            else if(letter > 'M' && letter <= 'Z'){
                letter -= 13;
            }
            else if(letter >= 'a' && letter <= 'm'){
                letter += 13;
            }
            else if(letter > 'm' && letter <= 'z'){
                letter -= 13;
            }
            newCharArray[i] = letter;
        }
        return String.valueOf(newCharArray);

    }

    public static void main(String[] args) {
        // char b= 'a' + 1;
        System.out.println("encrypt a message using the ROT13 technique");
        String input = "Hello World! abcdefghijklmnopqrstuvwxyz";
        System.out.println("Original  message: " + input );
        System.out.println("Encrypted message: " + rot(input));
    }

}
