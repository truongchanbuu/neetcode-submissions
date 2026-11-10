class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; ++row) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; ++i) {
                if (board[row][i] == '.') continue;
                boolean isValid = seen.add(board[row][i]);
                if (!isValid) return false;
            }
        }

        for (int col = 0; col < 9; ++col) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; ++i) {
                if (board[i][col] == '.') continue;
                boolean isValid = seen.add(board[i][col]);
                if (!isValid) return false;
            }
        }

        for (int square = 0; square < 9; ++square) {
            Set<Character> seen = new HashSet<>();
            int row = (square / 3) * 3;
            int col = (square % 3) * 3;
            for (int r = 0; r < 3; ++r) {
                for (int c = 0; c < 3; ++c) {
                    char cur = board[row + r][col + c];
                    if (cur == '.') continue;
                    boolean isValid = seen.add(cur);
                    if (!isValid) return false;
                }
            }
        }

        return true;
    }
}
