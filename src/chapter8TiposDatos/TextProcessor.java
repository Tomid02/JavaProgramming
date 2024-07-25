package chapter8TiposDatos;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I Love Test Automation University");
        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMeAngie");
    }

    public static void countWords(String text){
        var words = text.split(" ");
        int numbersOfWords = words.length;

        String message = String.format("Your text contains %d words:", numbersOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void reverseString(String text){
        for(int i=text.length()-1; i>=0; i--){
            System.out.println(text.charAt(i));
        }
    }

    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for(int i=0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
    }
}
