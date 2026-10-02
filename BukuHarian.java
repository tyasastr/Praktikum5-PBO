// Tyasastri Hning Kurniasih - L0325034
// PPBO05

package Praktikum5.Tugas; 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BukuHarian {
    private String namaPemilik;
    private String namaFile;

    // Constructor
    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        this.namaFile = "diary_" + namaPemilik + ".txt";
    }

    // Method untuk menulis catatan
    public void tulisCatatan(String tanggal, String isi) {
        try (FileWriter fw = new FileWriter(namaFile, true)) {
            fw.write("[" + tanggal + "] - " + isi + "\n");
            System.out.println("Catatan berhasil ditambahkan.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis catatan: " + e.getMessage());
        }
    }

    // Method untuk membaca catatan
    public void bacaCatatan() {
        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            System.out.println("--- Isi Buku Harian " + namaPemilik + " ---");
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Belum ada catatan harian.");
        }
    }
}
