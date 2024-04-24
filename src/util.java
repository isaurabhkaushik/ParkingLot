import java.util.Random;

public class util {
    public static String generateRandomString(int length) {
        // Define the characters allowed in the random string
        String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // Create a StringBuilder to store the random string
        StringBuilder sb = new StringBuilder(length);

        // Create a Random object
        Random random = new Random();

        // Generate random characters and append them to the StringBuilder
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allowedChars.length());
            char randomChar = allowedChars.charAt(randomIndex);
            sb.append(randomChar);
        }

        // Convert the StringBuilder to a string and return
        return sb.toString();
    }
}
