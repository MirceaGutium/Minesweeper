public class Board {
    private Space[][] board = new Space[Game.Y][Game.X];

    public Board() {
        int remainder = Game.BOMB_COUNT;

        double probability = (double) Game.BOMB_COUNT / (Game.X * Game.Y);

        try {
            for (int i = 0; i < Game.Y; i++) {
                for (int k = 0; k < Game.X; k++) {
                    if (Math.random() < probability && remainder > 0) {
                        board[i][k] = new Space(true);
                        remainder--;
                    } else {
                        board[i][k] = new Space(false);
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        calculate();
    }

    private void calculate() {
        for (int y = 0; y < Game.Y; y++) {
            for (int x = 0; x < Game.X; x++) {
                if (!board[x] [y].hasBomb()) {
                    int count = 0;
                    if(y > 0 && board[y-1][x].has.Bomb())
                        count++;
                    if(y < Game.Y-1 && board[y+1][x].hasBomb())
                        count++;
                    if(x > 0 && board[y][x-1].hasBomb())
                        count++;
                    if(x < Game.X-1 && board[y][x+1].hasBomb())
                        count++;
                    if(x > 0 && y > 0 && board [y-1][x-1].hasBomb())
                        count++;
                    if(x < Game.X-1 && y > 0 && board[y-1][x+1].hasBomb())
                        count++;
                    if(x > 0 && y < Game.Y-1 && board[y+1][x-1].hasBomb())
                        count++;
                    if(x < Game.X-1 && y < Game.Y-1 && board[y+1][x+1].hasBomb())
                        count++;
                    board[y][x].setBombNearby(count);
                }
            }
        }
    }
    public Space[][] getBoard(){
        return board;
    }
}
