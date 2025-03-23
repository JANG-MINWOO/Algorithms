class Solution {
    public int solution(String myString, String pat) {
        String[] strArr = myString.split("");
        StringBuilder sumStr = new StringBuilder();
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("A")) {
                strArr[i] = "B";
            } else {
                strArr[i] = "A";
            }
            
            sumStr.append(strArr[i]);
        }
        String converted = sumStr.toString();
        if (converted.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}