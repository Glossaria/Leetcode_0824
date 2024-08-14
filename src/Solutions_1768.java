public class Solutions_1768 {

    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        // check null
        if (l1 == 0)
            return word2;
        if (l2 == 0)
            return word1;

        // if both are not null
        char[] res = new char[l1 + l2];
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        int i = 0;
        int j = 0;

        while (i < l1 || i < l2) {
            if (i < l1 && i < l2) {
                res[j++] = c1[i];
                res[j++] = c2[i];
            } else if (i < l1) {
                res[j++] = c1[i];
            } else {
                res[j++] = c2[i];
            }
            i++;
        }
        return String.valueOf(res);

    }
}
