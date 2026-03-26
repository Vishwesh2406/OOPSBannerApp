import java.util.*;

class BannerPattern {
    private Map<Character, String[]> patterns;

    // Constructor
    public BannerPattern() {
        patterns = new HashMap<>();
        initializePatterns();
    }

    // Initialize patterns for characters
    private void initializePatterns() {
        patterns.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patterns.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patterns.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Get pattern of a character
    public String[] getPattern(char ch) {
        return patterns.getOrDefault(ch, new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });
    }
}

public class OOPSusingstring {

    // Function to display banner
    public static void printBanner(String text, BannerPattern bp) {

        int height = 5; // each character has 5 lines

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = bp.getPattern(ch);
                line.append(pattern[i]).append("  "); // spacing between letters
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        BannerPattern bp = new BannerPattern();

        String text = "OOPS";

        printBanner(text, bp);
    }
}