package algorithms.ReplaceSpaces;

/**
 * Created by nikhilthakur on 7/6/17.
 */
public class ReplaceSpacesInString {

    /**
     * Replace Spaces in a String with %20
     * @param initialString String that needs to be modified
     * @return null if the String is empty, or else the modified version.
     */
    static String replaceSpaces(String initialString){
        if (initialString == null || initialString.isEmpty())
            return null;

        char[] chars = initialString.toCharArray();

        int trueLength = findTrueLength(chars);

        return String.valueOf(replaceSpaces(chars,trueLength));
    }

    private static int findTrueLength(char[] chars) {
        int counter = chars.length-1;
        while (chars[counter] == ' ')
            counter--;
        return counter +1;
    }

    /**
     * Converts all ' ' (space) element of an char array to %20
     * @param chars The char array that needs to be modified
     * @param trueLength the actual length of the String, without trailing spaces
     * @return Same string if no spaces are found. Else modified string with '%20' instead to spaces
     */
    static char[] replaceSpaces(char[] chars, int trueLength){
        int totalNumberOfSpaces = 0;
        int lengthRequired;

        // Counting the total number of spaces
        for (int counter = 0 ; counter < trueLength; counter++){
            if (chars[counter] == ' '){
                totalNumberOfSpaces++;
            }
        }

        if (totalNumberOfSpaces == 0)
            return chars;

        lengthRequired = (trueLength - totalNumberOfSpaces) + totalNumberOfSpaces*3;

        char[] replacedSpacesArray = new char[lengthRequired];

        for (int counter = trueLength-1; counter >= 0; counter -- ){
            if (chars[counter] == ' '){
                replacedSpacesArray[lengthRequired -1] = '0';
                replacedSpacesArray[lengthRequired -2] = '2';
                replacedSpacesArray[lengthRequired -3] = '%';
                lengthRequired = lengthRequired - 3;
            }
            else {
                replacedSpacesArray[lengthRequired-1] = chars[counter];
                lengthRequired --;
            }
        }
        return replacedSpacesArray;
    }
}
