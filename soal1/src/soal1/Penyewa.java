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
public class Penyewa {
  
    private String nama;
    private String nohp;

    public Penyewa( String nama, String nohp){
     this.nama = nama;
    this.nohp = nohp;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
    
    

}
