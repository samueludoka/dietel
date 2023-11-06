package chapter7Assignment;

public class Decrypt {
        public static String encrypt(String plaintext, int shift) {
            StringBuilder encryptedText = new StringBuilder();

            for (int i = 0; i < plaintext.length(); i++) {
                char c = plaintext.charAt(i);

                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    c = (char) ((c - base + shift) % 26 + base);
                }

                encryptedText.append(c);
            }
            System.out.println();
            return encryptedText.toString();
        }

        public static void main(String[] args) {
            String plaintext = "Hello, World!";
            int shift = 3;

            String encryptedText = encrypt(plaintext, shift);
            System.out.println("Encrypted Text: " + encryptedText);
        }
    }


