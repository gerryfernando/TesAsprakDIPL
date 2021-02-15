/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

/**
 *
 * @author ASUS
 */
public class Kost {
    private String nama;
    private String alamat;
    private String kodekost;
    private int numOfPenyewa = 0;
    private Pemilik pemilik;
    private Penyewa[] penyewa;
    
    public Kost(String nama, String alamat,int JumlahKamar) {
        this.nama = nama;
        this.alamat = alamat;
        this.penyewa = new Penyewa[JumlahKamar];
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Pemilik getPemilik() {
        return pemilik;
    }

    public void setPemilik(Pemilik pemilik) {
        this.pemilik = pemilik;
    }

    public Penyewa[] getPenyewa() {
        return penyewa;
    }
    
    public void addPenyewa(Penyewa p){
        if(numOfPenyewa < penyewa.length){
            penyewa[numOfPenyewa++]=p; 
        }
        
    }

    
    
}
