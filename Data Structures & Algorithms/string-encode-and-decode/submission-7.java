class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length())
                .append("#")
                .append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int index = 0;

        while (index < str.length()) {
            int specialCharIndex = index;
            while (str.charAt(specialCharIndex) != '#') {
                specialCharIndex++;
            }
            int len = Integer.parseInt(str.substring(index, specialCharIndex));
            int start = specialCharIndex + 1;
            int end = start + len;
            String word = str.substring(start, end);
            strs.add(word);
            index = end;            
        }
        return strs;
    }
}
