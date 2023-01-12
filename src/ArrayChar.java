public class ArrayChar {
    public static void main(String[] args) {
        char[] charArray = {'E', 'N', 'D', 'I', 'N', 'G'};
        // search for and find input 'A'
        int index = 0;
        while (index < charArray.length - 1) {
            if (charArray[index] == 'A') {
                break;
            } else index++;
        }
        System.out.println(charArray[index] == 'A' ? "'A' symbol index is " + index : "'A' symbol is not find.");
    }
}
