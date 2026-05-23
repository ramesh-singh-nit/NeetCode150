public class AppMain {
    public static void main(String[] args) {
        CheckDuplicate duplicateExists= new CheckDuplicate();
        int [] nums = {3,2,6,8,5,4};
        System.out.println(duplicateExists.checkDuplicates(nums));

    }
}