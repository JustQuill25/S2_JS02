public class DragonPunyaBima01 {

    int x, y, width, height;

    public DragonPunyaBima01(int initialX, int initialY, int gameWidth, int gameHeight) {
        x = initialX;
        y = initialY;
        width = gameWidth;
        height = gameHeight;
    }

    void moveLeft() {
        x--;
        if (x < 0) {
            detectCollision();
        }
    }

    void moveRight() {
        x++;
        if (x > width) {
            detectCollision();
        }
    }

    void moveUp() {
        y--;
        if (y < 0) {
            detectCollision();
        }
    }

    void moveDown() {
        y++;
        if (y > height) {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Dragon position: (" + x + ", " + y + ")");
    }

    void detectCollision() {
        System.out.println("Game Over");
    }

    public static void main(String[] args) {
        
        DragonPunyaBima01 dragon = new DragonPunyaBima01(5, 5, 10, 10);

        dragon.printPosition();
        dragon.moveLeft();
        dragon.printPosition();
        dragon.moveUp();
        dragon.printPosition();
        dragon.moveRight();
        dragon.printPosition();
        dragon.moveDown();
        dragon.printPosition();
    }
}
