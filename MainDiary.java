// Tyasastri Hning Kurniasih - L0325034
// PPBO05

package Praktikum5.Tugas;

public class MainDiary {
    public static void main(String[] args) {
        // Instansiasi objek BukuHarian
        BukuHarian diary = new BukuHarian("Tyas");

        // Menulis catatan harian
        diary.tulisCatatan("01-10-2026", "ABCDEFG HIJKLMNOP QRS TUV WXYZ (abjad kalau b. Inggris)");
        diary.tulisCatatan("02-10-2026", "ABCDEFG HIJKLMN OPQRSTU VWXYZ (abjad kalau b. Indonesia)");
        diary.tulisCatatan("03-10-2026","HANACARAKA DATASAWALA PADHAJAYANYA MAGABATHANGA");

        // Membaca catatan harian
        diary.bacaCatatan();

    }
}
