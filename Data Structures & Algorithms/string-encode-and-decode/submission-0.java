class Solution {
    private static final char PREFIX = '#';
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append(PREFIX).append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int index = 0;
        int len = str.length();

        List<String> res = new ArrayList();
        
        while (index < len) {
            int count = index;
            while (str.charAt(count) != Solution.PREFIX) {
                count++;
            }

            int strLen = Integer.parseInt(str.substring(index, count));
            int wordStart = count + 1;
            int wordEnd = wordStart + strLen;

            res.add(str.substring(wordStart, wordEnd));
            index = wordEnd;
        }

        return res;
    }
}
