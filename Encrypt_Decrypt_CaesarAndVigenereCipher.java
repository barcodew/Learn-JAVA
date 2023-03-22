package TugasPraktikum_1;

public class TugasNomer5 {

     // Caesar Cipher
  public static String encryptCaesarCipher(String pesan, int kunci) {
    String result = "";
    for (int i = 0; i < pesan.length(); i++) {
      char currentChar = pesan.charAt(i);
      int currentCharPos = (int) currentChar;
      int newCharPos = currentCharPos + kunci;
      char newChar = (char) newCharPos;
      result += newChar;
    }
    return result;
  }

  public static String decryptCaesarCipher(String pesan, int kunci) {
    String result = "";
    for (int i = 0; i < pesan.length(); i++) {
      char currentChar = pesan.charAt(i);
      int currentCharPos = (int) currentChar;
      int newCharPos = currentCharPos - kunci;
      char newChar = (char) newCharPos;
      result += newChar;
    }
    return result;
  }

  // Vigenere Cipher
  public static String encryptVigenereCipher(String pesan, String kunci) {
    String result = "";
    int kunciIndex = 0;
    for (int i = 0; i < pesan.length(); i++) {
      char currentChar = pesan.charAt(i);
      int currentCharPos = (int) currentChar;
      char currentKunciChar = kunci.charAt(kunciIndex);
      int currentKunciCharPos = (int) currentKunciChar;
      int newCharPos = currentCharPos + currentKunciCharPos;
      char newChar = (char) newCharPos;
      result += newChar;
      kunciIndex++;
      if (kunciIndex == kunci.length()) {
        kunciIndex = 0;
      }
    }
    return result;
  }

  public static String decryptVigenereCipher(String pesan, String kunci) {
    String result = "";
    int kunciIndex = 0;
    for (int i = 0; i < pesan.length(); i++) {
      char currentChar = pesan.charAt(i);
      int currentCharPos = (int) currentChar;
      char currentKunciChar = kunci.charAt(kunciIndex);
      int currentKunciCharPos = (int) currentKunciChar;
      int newCharPos = currentCharPos - currentKunciCharPos;
      char newChar = (char) newCharPos;
      result += newChar;
      kunciIndex++;
      if (kunciIndex == kunci.length()) {
        kunciIndex = 0;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    String pesan = "Sedang berusaha menjadi lebih baik lagi bekerja keras dan pantang menyerah bertanggungjawab percaya diri!";
    int kunci = 5;
    String kunciVigenere = "abc";

    String encryptedCaesarCipher = encryptCaesarCipher(pesan, kunci);
    System.out.println("Encrypted Caesar Cipher: " + encryptedCaesarCipher);
    String decryptedCaesarCipher = decryptCaesarCipher(encryptedCaesarCipher, kunci);
    System.out.println("Decrypted Caesar Cipher: " + decryptedCaesarCipher);

    String encryptedVigenereCipher = encryptVigenereCipher(pesan, kunciVigenere);
    System.out.println("Encrypted Vigenere Cipher: " + encryptedVigenereCipher);
    String decryptedVigenereCipher = decryptVigenereCipher(encryptedVigenereCipher, kunciVigenere);
    System.out.println("Decrypted Vigenere Cipher: " + decryptedVigenereCipher);
  }   
}
