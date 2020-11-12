package Opgave_22;

import java.util.Arrays;

public class MyString1 {

    // DataField
    private char[] chars;

    public MyString1(char[] chars){

        this.chars = new char[chars.length];
        System.arraycopy(chars,0,this.chars,0,chars.length);

    }
    public int length(){

        return chars.length;
    }
    public char charAt(int index){
        return chars[index];
    }
    public MyString1 subString(int begin, int end){
    int length = end-begin;

    char[] temp = new char[length];

        for (int i = begin; i <end; i++) {
            temp[i-begin] = chars[i];
        }
     MyString1 return1 = new MyString1(temp);
        return return1;
    }
    public MyString1 toLowerCase(){
        char[] lowerCaseArray = new char[this.length()];

        for (int i = 0; i < this.length(); i++) {
            lowerCaseArray[i] =  Character.toLowerCase(this.charAt(i));
        }
        MyString1 return1 = new MyString1(lowerCaseArray);
        return return1;
    }
    public boolean equals(MyString1 s){

        char[] testTemp = new char[s.length()];
        for (int i = 0; i <s.length(); i++) {
            testTemp[i] = s.charAt(i);
        }

        if (Arrays.equals(testTemp, this.chars)){
            return true;
        }return false;

    }

}
