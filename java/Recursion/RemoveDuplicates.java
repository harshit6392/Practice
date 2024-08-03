package Recursion;

public class RemoveDuplicates {
    public static void removeDuplicate(String string, int index, StringBuilder newstr, boolean[] map) {
        // Base condition
        if (index == string.length()) {
            System.out.println(newstr);
            return;
        }

        // Recursive work
        char currentchar = string.charAt(index);
        
        // Check whether the character is already in the map or not
        if (map[currentchar - 'a']) {
            // Character is a duplicate, so skip it
            removeDuplicate(string, index + 1, new StringBuilder(newstr), map);
        } else {
            // Character is not a duplicate, include it and mark it in the map
            map[currentchar - 'a'] = true;
            removeDuplicate(string, index + 1, new StringBuilder(newstr).append(currentchar), map);
        }
    }

    public static void main(String[] args) {
        String string = "strinn";
        removeDuplicate(string, 0, new StringBuilder(), new boolean[26]);
    }
}
