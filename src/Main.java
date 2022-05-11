public class Main {

    public static void main(String[] args) {

        boolean isGreenLight = false;

        int speedPlayer1 = 2;
        int speedPlayer2 = 4;
        int speedPlayer3 = 5;
        int NumberOfEliminatedPlayers = 0;
        {
            if (isGreenLight == false) {
            }
            if (speedPlayer1 > 0) {
                NumberOfEliminatedPlayers += 1;
            }
        }
        {
            if (speedPlayer2 > 0)
                NumberOfEliminatedPlayers += 1;
        }
        {
            if (speedPlayer3 > 0)
                NumberOfEliminatedPlayers += 1;
        }

        System.out.println("Количество выбывших игроков = " + NumberOfEliminatedPlayers);
    }
    {
        System.out.println("Good job");
    }
}

