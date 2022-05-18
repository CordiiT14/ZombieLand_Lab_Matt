package items;

public abstract class Loot {

    int value;

    public Loot(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
