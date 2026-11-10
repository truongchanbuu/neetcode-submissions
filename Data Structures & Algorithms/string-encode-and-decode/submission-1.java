class Solution {
    // <len>#str<len>#str...
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
        List<String> strs = new ArrayList();
        int index = 0;
        int len = str.length();

        while (index < len) {
            int separatorIdx = index;
            while (str.charAt(separatorIdx) != '#') {
                separatorIdx++;
            }

            int wordLen = Integer.parseInt(str.substring(index, separatorIdx));
            int start = separatorIdx + 1;
            int end = start + wordLen;
            strs.add(str.substring(start, end));

            index = end;
        }

        return strs;
    }
}


