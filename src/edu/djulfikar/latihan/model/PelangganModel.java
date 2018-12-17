/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.djulfikar.latihan.model;

import edu.djulfikar.latihan.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 * Nama  : RD Muhammad Djulfikar BU
 * NIM   : 10117086
 * KELAS : IF 3
 */
public class PelangganModel {
    private String nama;
    private String email;
    private String noTlpn;
    
    private PelangganListener  pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTlpn() {
        return noTlpn;
    }

    public void setNoTlpn(String noTlpn) {
        this.noTlpn = noTlpn;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelangganListener!=null){
            pelangganListener.onChange(this);
        
        }
    
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTlpn("");
    
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        resetForm();
    
    }
    
    
}
