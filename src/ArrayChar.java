public class ArrayChar {
    public static void main(String[] args) {
        char[] charArray = {'E', 'N', 'D', 'I', 'N', 'G'};
        // search for and find input 'A'
        int index = 0;
        while (index < charArray.length) {
            if (charArray[index] == 'A') {
                break;
            } else index++;
        }
        System.out.println(index == charArray.length && charArray[index-1] != 'A' ? "'A' symbol is not find." : "'A' symbol index is " + index);
    }
}
