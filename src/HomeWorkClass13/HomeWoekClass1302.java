package HomeWorkClass13;

public class HomeWoekClass1302 {
    public static void main(String[] args) {
           /*
    How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
     */


        String sentence1="This is sentence i want reverse";
        StringBuilder sentence=new StringBuilder(sentence1);
        StringBuilder sentenceReversed=sentence.reverse();
        System.out.println(sentenceReversed);
    }
}
