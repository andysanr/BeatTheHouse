package utilz;

public class Constants {
    public static class Directions {
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;

    }
    public static class PlayerConstants {
        public static final int HEARTS = 0;
        public static final int CLUBS = 1;
        public static final int DIAMONDS = 2;
        public static final int SPADES = 3;

        public static int GetSpriteAmount(int player_action) {
            switch (player_action) {
                case HEARTS:
                case CLUBS:
                case DIAMONDS:
                case SPADES:
                    return 14;
                default:
                    return 1;
            }
        }
    }
}
