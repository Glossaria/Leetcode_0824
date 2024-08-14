//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //for 1768
        System.out.println(new Solutions_1768().mergeAlternately("abcde","fghijk"));

        //for 1431
        int[] candies = {2,3,5,1,3};
        new Solution_1431().kidsWithCandies(candies, 3);

        //for 605
        int[] flowerbed = {1,0,1,0,1,0,0,0,0,1};
        new Solution_605().canPlaceFlowers(flowerbed, 3);

        //for 345
        System.out.println(new Solution_345().reverseVowels("HelloLeetcode"));

    }
}