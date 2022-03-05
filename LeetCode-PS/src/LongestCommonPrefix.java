import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefixa(String[] strs) {
        boolean state = false;
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        int i;
        for (int j = 0; j < strs[0].length(); j++) {
            if (strs.length > 1) {

                for (i = 0; i < strs.length - 1; i++) {

                    if (strs[i].charAt(j) == strs[i + 1].charAt(j)&&strs[i + 1].charAt(j)!='\0') {
                        state = true;

                    } else {
                        state = false;
                        return String.valueOf(sb);
                    }

                }
                while (state) {
                    sb.insert(j, strs[i].charAt(j));
                    state = false;
                }

            }
            else{
                state = false;
                System.out.println(strs[0].charAt(j));
                sb.insert(j, strs[0].charAt(j));

            }


        }
        return String.valueOf(sb);
}





}
