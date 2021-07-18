public class PushAway {

    public static char[] pushAway(char[] value, char token) {
        int numberTokenFound = 0;
        char[] result = new char[value.length];

        for (int i = 0; i < value.length; i++) {
            if (value[i] == token) {
                numberTokenFound++;
                result[value.length - numberTokenFound] = token;
            } else {
                result[i - numberTokenFound] = value[i];
            }
        }

        return result;
    }

}
