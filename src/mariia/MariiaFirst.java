package mariia;

public class MariiaFirst {

    public static void main(String[] args) {

        //revers the String

        String str = "Hello World";
        String newStr = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            newStr += "" + str.charAt(i);
        }

        System.out.println(newStr);
    }
}
