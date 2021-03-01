public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        if (board[row][col]){
            System.out.println("There was a hit!");
            return true;
        }
        System.out.println("You missed a boat!");
        return false;
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        if(direction == "down"){
            for (int i = row; i < row + boatLength; i++){
                board[i][col] = true;
            }
        }
        else{
            for (int i = col; i < col + boatLength; i++){
                board[row][i] = true;
            }
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        int rowNum = words.length;
        int colNum = words[0].length;

        for (int i = 0; i < rowNum; i++){

            for (int j = 0; j < colNum-1; j++){

                String firstWord = words[i][j];
                String secondWord = words[i][j+1];

                if (firstWord.length() > secondWord.length()){
                    return false;
                }

                if (firstWord.compareTo(secondWord) >= 0){
                    return false;
                }

            }

        }

        return true;
    }

    public static void main(String[] args) {
        
    }
}
