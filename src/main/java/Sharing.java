import java.util.ArrayList;
import java.util.List;

public class Sharing {

    public static List<Character> sharing(List<Character> first, List<Character> second){
        final List<Character> subSequence = new ArrayList<>();

        int firstIndex = 0;
        int secondIndex = 0;

        while((firstIndex < first.size()) && (secondIndex < second.size())){
            if(first.get(firstIndex) == second.get(secondIndex)){
                subSequence.add(first.get(firstIndex));
                firstIndex++;
                secondIndex++;
            } else {
                if(first.get(firstIndex) < second.get(secondIndex)){
                    firstIndex++;
                } else {
                    secondIndex++;
                }
            }
        }

        return subSequence;
    }

}
