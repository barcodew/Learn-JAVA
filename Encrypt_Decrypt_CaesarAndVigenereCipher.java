package TugasPraktikum_1;

import java.util.*;

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




  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    String pesan = input.nextLine();
    int kunci = 3;
    String kunciVigenere = "abc";

    String encryptedCaesarCipher = encryptCaesarCipher(pesan, kunci);
    System.out.println("Encrypted Caesar Cipher: " + encryptedCaesarCipher);
    String decryptedCaesarCipher = decryptCaesarCipher(encryptedCaesarCipher, kunci);
    System.out.println("Decrypted Caesar Cipher: " + decryptedCaesarCipher);

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

