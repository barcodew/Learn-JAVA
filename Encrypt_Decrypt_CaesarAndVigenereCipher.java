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

// Algoritma Caesar Cipher
// 
// Langkah Manual:
// 1. Tentukan kunci yang akan digunakan untuk mengenkripsi pesan.
// 2. Cari posisi huruf dalam alfabet.
// 3. Tambahkan kunci ke posisi huruf untuk menghasilkan posisi baru.
// 4. Ganti huruf dengan posisi baru yang telah ditentukan.
// 
// Encrypt:
// 1. Masukkan pesan teks yang akan dienkripsi.
// 2. Masukkan kunci untuk Shift.
// 3. Untuk setiap karakter dalam pesan teks, cari posisi dalam alfabet.
// 4. Tambahkan kunci Shift ke posisi alfabet untuk menghasilkan posisi baru.
// 5. Ganti karakter dengan posisi baru yang telah ditentukan.
// 6. Tampilkan hasil enkripsi.
// 
// Decrypt:
// 1. Masukkan pesan teks yang akan didekripsi.
// 2. Masukkan kunci untuk Shift.
// 3. Untuk setiap karakter dalam pesan teks, cari posisi dalam alfabet.
// 4. Kurangi kunci Shift dari posisi alfabet untuk menghasilkan posisi baru.
// 5. Ganti karakter dengan posisi baru yang telah ditentukan.
// 6. Tampilkan hasil dekripsi.
// 
// Algoritma Vigenere Cipher
// 
// Langkah Manual:
// 1. Tentukan kunci untuk enkripsi.
// 2. Cari posisi dari karakter dalam kunci.
// 3. Cari posisi dari karakter dalam pesan teks.
// 4. Tambahkan posisi dari karakter dalam kunci dengan posisi karakter dalam pesan teks.
// 5. Ganti karakter dengan posisi baru yang telah ditentukan.
// 
// Encrypt:
// 1. Masukkan pesan teks yang akan dienkripsi.
// 2. Masukkan kunci untuk enkripsi.
// 3. Untuk setiap karakter dalam pesan teks, cari posisi dalam alfabet.
// 4. Cari posisi dari karakter dalam kunci.
// 5. Tambahkan posisi dari karakter dalam kunci dengan posisi karakter dalam pesan teks.
// 6. Ganti karakter dengan posisi baru yang telah ditentukan.
// 7. Tampilkan hasil enkripsi.
// 
// Decrypt:
// 1. Masukkan pesan teks yang akan didekripsi.
// 2. Masukkan kunci untuk dekripsi.
// 3. Untuk setiap karakter dalam pesan teks, cari posisi dalam alfabet.
// 4. Cari posisi dari karakter dalam kunci.
// 5. Kurangi posisi dari karakter dalam kunci dari posisi karakter dalam pesan teks.
// 6. Ganti karakter dengan posisi baru yang telah ditentukan.
// 7. Tampilkan hasil dekripsi.
