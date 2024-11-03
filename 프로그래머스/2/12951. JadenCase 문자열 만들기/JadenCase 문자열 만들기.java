class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.toLowerCase().split(" ", -1);
        
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > 0 && Character.isLetter(words[i].charAt(0))) {
                result.append(Character.toUpperCase(words[i].charAt(0)))
                    .append(words[i].substring(1));
            } else {
                result. append(words[i]);
            }
            if (i < words.length - 1) result.append(" ");
        }
        return result.toString();
    }
}