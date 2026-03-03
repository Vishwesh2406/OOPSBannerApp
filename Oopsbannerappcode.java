import java.util.HashMap;
import java.util.Map;

class CharacterPattern {

    private String[] pattern;

    public CharacterPattern(String[] pattern) {
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class Oopsbannerappcode {

    static Map<Character, CharacterPattern> patternMap = new HashMap<>();

    public static void initializePatterns() {

        patternMap.put('O', new CharacterPattern(new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('P', new CharacterPattern(new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPattern(new String[]{
                " *****",
                "*     ",
                " **** ",
                "     *",
                "***** "
        }));
    }

    public static void printBanner(String text) {

        int height = 5;

        for (int i = 0; i < height; i++) {
            for (char ch : text.toCharArray()) {

                CharacterPattern cp = patternMap.get(ch);
                if (cp != null) {
                    System.out.print(cp.getPattern()[i] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        initializePatterns();
        printBanner("OOPS");
    }
}