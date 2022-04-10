import java.util.Arrays;

public class RockPaperScissors {

    public static int[] count(char[] player1, char[] player2) {
        int player1Counter = 0;
        int player2Counter = 0;

        for (int i = 0; i < player1.length; i++) {
            if(player1[i] != player2[i]){
                if((player1[i] == 'R' && player2[i] == 'S') || (player1[i] == 'S' && player2[i] == 'P')){
                    player1Counter++;
                } else {
                    player2Counter++;
                }
            }
        }

        return new int[]{player1Counter, player2Counter};
    }

    public static void main(String[] args) {
        char[] player1 = new char[]{
                'R', 'R', 'S', 'S', 'P'
        };
        char[] player2 = new char[]{
                'P', 'S', 'S', 'R', 'S'
        };
        System.out.println("Result => " + Arrays.toString(count(player1, player2)));
    }
}
