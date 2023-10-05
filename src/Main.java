public class Main {
    public static void main(String[] args) {
        String unicodeHex1 = "1F600";
        String unicodeHex2 = "1F603";
        String unicodeHex3 = "1F604";

        int codePoint1 = Integer.parseInt(unicodeHex1, 16);
        int codePoint2 = Integer.parseInt(unicodeHex2, 16);
        int codePoint3 = Integer.parseInt(unicodeHex3, 16);

        String emoji1 = new String(Character.toChars(codePoint1));
        String emoji2 = new String(Character.toChars(codePoint2));
        String emoji3 = new String(Character.toChars(codePoint3));

        System.out.println(emoji1);
        System.out.println(emoji2);
        System.out.println(emoji3);

        String text = "Java це краща мова для програмування";
        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println(reversedText);
    }
}