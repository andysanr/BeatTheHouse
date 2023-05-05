package utilz;
import main.Game;
public class Constants {
    public static class UI {
        public static class Buttons {
            public static final int B_WIDTH_DEFAULT = 140;
            public static final int B_HEIGHT_DEFAULT = 56;
            public static final int B_WIDTH = (int) (B_WIDTH_DEFAULT * Game.SCALE);
            public static final int B_HEIGHT = (int) (B_HEIGHT_DEFAULT * Game.SCALE);
        }
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
