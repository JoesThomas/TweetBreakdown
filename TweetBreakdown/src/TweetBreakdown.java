public class TweetBreakdown {
    private static String string = "Ellie and Lily had been longer at this school than May; so when she entered it, she became very anxious to deserve the medal. Two or three [Pg 5]times she almost gained it, and then, by necessary absence, lost it again. Finally, four days of the week had passed, and May had not once missed in her lessons or conduct. Very perfectly did she study her task for Friday, and went to sleep to dream of the medal.\n" +
            "\n" +
            "Alas! when she woke the next morning, she found the ground covered with snow, and the streets looking quite impassable. Still she hoped she might get to school, when a man who lived in the neighbourhood of the school-house, came to Mrs. Stuart on an errand, and he told May's grandmamma, that no child could get past a crossing a few streets off, on the way to school. So May, who was rather a delicate child, had to stay at home. Bitter was her disappointment, and still worse did she feel, when, a few moments after, Ellie and Lily came running in—their cheeks as red as roses—to see if May was ready for school. They, too, felt very badly when they heard she had to stay at home, for they, like [Pg 6]generous children, were very anxious that she should receive the medal.";

    private static void tweet() {
        if (string.length() > 280) {
            System.out.println(string.length());
            Integer loopValue = (string.length() / 280) + 1;
            Integer space;
            Integer fullStop;
            String fractionValues;
            Integer fraction;
            String sub;
            for (int i = 0; i < loopValue; i++) {
                fractionValues = "(" + (i + 1) + "/" + loopValue + ") " ;
                fraction = fractionValues.length() + 1;
                if (string.length() > 280 - fraction) {
                    sub = string.substring(0, (280 - fraction));
                    space = sub.lastIndexOf(" ");
                    fullStop = sub.lastIndexOf(".") + 1;
                    if (space > fullStop) {
                        sub = fractionValues + " " ;
                        sub = sub + string.substring(0, space);
                        System.out.println(sub);
                        System.out.println(sub.length());
                        string = string.substring(space, string.length());
                    } else if (fullStop > space && !fullStop.equals(280 - fraction)) {
                        sub = fractionValues + " " ;
                        sub = sub + string.substring(0, fullStop);
                        System.out.println(sub);
                        System.out.println(sub.length());
                        string = string.substring(fullStop, string.length());
                    }
                } else {
                    sub = string;
                    space = sub.lastIndexOf(" ");
                    fullStop = sub.lastIndexOf(".") + 1;
                    if (space > fullStop) {
                        sub = fractionValues + " " ;
                        sub = sub + string.substring(0, space);
                        System.out.println(sub);
                        System.out.println(sub.length());
                        string = string.substring(space, string.length());
                    } else if (fullStop > space && !fullStop.equals(280 - fraction)) {
                        sub = fractionValues + " " ;
                        sub = sub + string.substring(0, fullStop);
                        System.out.println(sub);
                        System.out.println(sub.length());
                        string = string.substring(fullStop, string.length());
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        tweet();
    }
}