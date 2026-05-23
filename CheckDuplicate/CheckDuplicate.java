import java.util.HashSet;
import java.util.Set;

public class CheckDuplicate {

    public boolean checkDuplicates(int[] nums) {
        Set<Integer> nonDuplicate = new HashSet<>();

        for (int i : nums) {
            if (!nonDuplicate.add(i)) {
                return true;
            }
        }
        return false;
    }
}