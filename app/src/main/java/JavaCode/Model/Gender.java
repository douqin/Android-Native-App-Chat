package JavaCode.Model;

public enum Gender {
    FEMALE(1),
    MALE(0);

    private final int value;

    Gender(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }
}
