package academy.tochkavhoda.base;

public class StringOperations {
    public static int getSummaryLength(String[] strings) {
        int summaryLength = 0;
        for (String string : strings) {
            summaryLength += string.length();
        }
        return summaryLength;
    }

    public static String getFirstAndLastLetterString(String string) {
        return string.substring(0, 1) + string.substring(string.length() - 1);
    }

    public static boolean isSameCharAtPosition(String string1, String string2, int index) {
        return string1.charAt(index) == string2.charAt(index);
    }

    public static boolean isSameFirstCharPosition(String string1, String string2, char character) {
        return string1.indexOf(character) == string2.indexOf(character);
    }

    public static boolean isSameLastCharPosition(String string1, String string2, char character) {
        return string1.lastIndexOf(character) == string2.lastIndexOf(character);
    }

    public static boolean isSameFirstStringPosition(String string1, String string2, String str) {
        return string1.indexOf(str) == string2.indexOf(str);
    }

    public static boolean isSameLastStringPosition(String string1, String string2, String str) {
        return string1.lastIndexOf(str) == string2.lastIndexOf(str);
    }

    public static boolean isEqual(String string1, String string2) {
        return string1.equals(string2);
    }

    public static boolean isEqualIgnoreCase(String string1, String string2) {
        return string1.equalsIgnoreCase(string2);
    }

    public static boolean isLess(String string1, String string2) {
        return string1.compareTo(string2) < 0;
    }

    public static boolean isLessIgnoreCase(String string1, String string2) {
        return string1.compareToIgnoreCase(string2) < 0;
    }

    public static String concat(String string1, String string2) {
        return string1 + string2;
    }

    public static boolean isSamePrefix(String string1, String string2, String prefix) {
        return string1.startsWith(prefix) && string2.startsWith(prefix);
    }

    public static boolean isSameSuffix(String string1, String string2, String suffix) {
        return string1.endsWith(suffix) && string2.endsWith(suffix);
    }

    public static String getCommonPrefix(String string1, String string2) {
        int minLength = Math.min(string1.length(), string2.length());
        for (int i = 0; i < minLength; i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return string1.substring(0, i);
            }
        }
        return string1.substring(0, minLength);
    }

    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static boolean isPalindrome(String string) {
        return string.equals(reverse(string));
    }

    public static boolean isPalindromeIgnoreCase(String string) {
        return string.equalsIgnoreCase(reverse(string));
    }

    public static String getLongestPalindromeIgnoreCase(String[] strings) {
        String longestPalindrome = "";
        for (String string : strings) {
            if (isPalindromeIgnoreCase(string) && string.length() > longestPalindrome.length()) {
                longestPalindrome = string;
            }
        }
        return longestPalindrome;
    }

    public static boolean hasSameSubstring(String string1, String string2, int index, int length) {
        if (string1.length() < index + length || string2.length() < index + length) {
            return false;
        }

        String substring = string1.substring(index, index + length);
        String substring2 = string2.substring(index, index + length);
        return substring.equals(substring2);
    }

    public static boolean isEqualAfterReplaceCharacters(String string1, char replaceInStr1, char replaceByInStr1, String string2, char replaceInStr2, char replaceByInStr2) {
        return string1.replace(replaceInStr1, replaceByInStr1).equals(string2.replace(replaceInStr2, replaceByInStr2));
    }

    public static boolean isEqualAfterReplaceStrings(String string1, String replaceInStr1, String replaceByInStr1, String string2, String replaceInStr2, String replaceByInStr2) {
        return string1.replace(replaceInStr1, replaceByInStr1).equals(string2.replace(replaceInStr2, replaceByInStr2));
    }

    public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string) {
        return string.replaceAll("\\s", "").equalsIgnoreCase(reverse(string).replaceAll("\\s", ""));
    }

    public static boolean isEqualAfterTrimming(String string1, String string2) {
        return string1.trim().equals(string2.trim());
    }

    public static String makeCsvStringFromInts(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (i != array.length - 1) {
                stringBuilder.append(",");
            }
        }
        return stringBuilder.toString();
    }

    public static String makeCsvStringFromDoubles(double[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(String.format("%.2f", array[i]));
            if (i != array.length - 1) {
                stringBuilder.append(",");
            }
        }
        return stringBuilder.toString();
    }

    public static StringBuilder makeCsvStringBuilderFromInts(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (i != array.length - 1) {
                stringBuilder.append(",");
            }
        }
        return stringBuilder;
    }

    public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(String.format("%.2f", array[i]));
            if (i != array.length - 1) {
                stringBuilder.append(",");
            }
        }
        return stringBuilder;
    }

    public static StringBuilder removeCharacters(String string, int[] positions) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = positions.length - 1; i >= 0; i--) {
            stringBuilder.deleteCharAt(positions[i]);
        }
        return stringBuilder;
    }

    public static StringBuilder insertCharacters(String string, int[] positions, char[] characters) {
        StringBuilder stringBuilder = new StringBuilder(string);
        int j = 0;

        for (int i = 0; i < positions.length; i++) {
           if (positions[i] <= i) {
               stringBuilder.insert(positions[i] + j, characters[i]);
               j++;
           }
        }

        return stringBuilder;
    }
}
