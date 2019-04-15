

public class UpperCaseCounter {
    public int getNumberOfUpperCaseCharactersInString(String str) {
        if (str == null) {
            return 0;
        }

        int numberOfUpperCaseChars = 0;
        for (int index=0; index < str.length(); index++) {
            char charAt = str.charAt(index);
            if (charAt >= 'A' && charAt <= 'Z') {
                numberOfUpperCaseChars++;
            }
        }
        return numberOfUpperCaseChars;
    }
}
