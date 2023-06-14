package probation_1;

public class Password {
    public static void main(String[] args) {

        String password = "12F555$@";
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))) {
                count++;
            }
        }
        System.out.println((count<2)?"invalid password":"OK");
    }
}
