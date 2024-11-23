package UppgiftDel3;

public class UserInputLogicDel3 {
    int lineCount = 0;
    int charCount = 0;
    int wordCount=0;
    String longestWord="";

    public void userInput(String inputText) {
        if (!(inputText.equalsIgnoreCase("stop") ||
                inputText.contains(" stop") ||
                inputText.contains("stop ") ||
                inputText.contains(" stop "))) {
            charCount = inputText.length() + charCount;
            lineCount = lineCount + 1;
            String[] words=inputText.split("\\s");
            wordCount+=words.length;
            for(String word : words){
                if(word.length()>longestWord.length()){
                    longestWord=word;
                }

            }
        }
    }
    public int getLineCount() {

        return lineCount;
    }
    public int getCharCount() {
        return charCount;
    }
    public int getWordCount() {
        return wordCount;
    }
    public String getLongestWord() {

        return longestWord;
    }
}
