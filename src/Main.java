import java.util.Random;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        String emailAddress = "john.doe.mis2016@ie.edu";
        String formattedEmailAddress = emailAddress.replaceAll("\\.", "/");

        Random random = new Random();
        StringBuffer word = null;

        switch (random.nextInt(2)) {
            case 0:
                word = new StringBuffer('Y');
            case 1:
                word = new StringBuffer('F');
            case 2:
                word = new StringBuffer('T');
        }

        word.append('o');
        word.append('u');
        word.append('r');

        System.out.println(word + " " + formattedEmailAddress);
    }
}
