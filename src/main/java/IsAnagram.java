public class IsAnagram {

    public boolean isAnag(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
            int[] counts = new int[26];

            for (int i = 0; i < s.length(); i++) {
                counts[s.charAt(i) - 'a']++;
                counts[t.charAt(i) - 'a']--;
            }

            for (int i : counts) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args){

        IsAnagram obj = new IsAnagram();

        String s="anagram";
        String t="nagaram";

        System.out.println(obj.isAnag(s,t));

        }
    }
