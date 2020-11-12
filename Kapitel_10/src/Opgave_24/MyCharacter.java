package Opgave_24;

public class MyCharacter {

    // DataFields;
    private char value;


    // Constructor;
    public MyCharacter(char ch){
        this.value = ch;
    }


    // Methods

    public int compare(MyCharacter diffChar){
        return value - diffChar.value;
    }

    // Getters && Setters

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
}
