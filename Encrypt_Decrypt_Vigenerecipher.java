package TugasPraktikum_1;

    import java.util.Scanner;
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
public class TugasNomor5ke2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan teks: ");
            String teks = input.nextLine();

            System.out.print("Masukkan kunci: ");
            String kunci = input.nextLine();

            String terenkripsi = encrypt(teks, kunci);
            System.out.println("Teks terenkripsi: " + terenkripsi);

            String terdekripsi = decrypt(terenkripsi, kunci);
            System.out.println("Teks terdekripsi: " + terdekripsi);

            input.close();
        }

        public static String encrypt(String teks, String kunci) {
            StringBuilder hasil = new StringBuilder();

            kunci = kunci.toUpperCase();

            int index = 0;
            for (int i = 0; i < teks.length(); i++) {
                char karakter = teks.charAt(i);

                if (Character.isLetter(karakter)) {
                    int shift = kunci.charAt(index) - 'A';
                    char terenkripsi = encryptChar(karakter, shift);
                    hasil.append(terenkripsi);

                    index++;
                    if (index == kunci.length()) {
                        index = 0;
                    }
                } else {
                    hasil.append(karakter);
                }
            }

            return hasil.toString();
        }

        public static String decrypt(String teks, String kunci) {
            StringBuilder hasil = new StringBuilder();

            kunci = kunci.toUpperCase();

            int index = 0;
            for (int i = 0; i < teks.length(); i++) {
                char karakter = teks.charAt(i);

                if (Character.isLetter(karakter)) {
                    int shift = kunci.charAt(index) - 'A';
                    char terdekripsi = decryptChar(karakter, shift);
                    hasil.append(terdekripsi);

                    index++;
                    if (index == kunci.length()) {
                        index = 0;
                    }
                } else {
                    hasil.append(karakter);
                }
            }

            return hasil.toString();
        }

        public static char encryptChar(char karakter, int shift) {
            if (Character.isLowerCase(karakter)) {
                return (char) ((karakter - 'a' + shift)  + 'a');
            } else {
                return (char) ((karakter - 'A' + shift)  + 'A');
            }
        }

        public static char decryptChar(char karakter, int shift) {
            if (Character.isLowerCase(karakter)) {
                return (char) ((karakter - 'a' - shift )  + 'a');
            } else {
                return (char) ((karakter - 'A' - shift ) + 'A');
            }
        }
    }

