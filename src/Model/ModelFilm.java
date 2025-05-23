/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author altashfir
 */
public class ModelFilm {
    private int idFilm;
    private String judul;
    private double alur;
    private double penokohan;
    private double akting;
    
    public ModelFilm(String judul, double alur, double penokohan, double akting){
        this.judul = judul;
        this.alur = alur;
        this.penokohan = penokohan;
        this.akting = akting;
    }
   
    public ModelFilm(int idFilm, String judul, double alur, double penokohan, double akting){
        this(judul, alur, penokohan, akting);
        this.idFilm = idFilm;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public double getAlur() {
        return alur;
    }

    public void setAlur(double alur) {
        this.alur = alur;
    }

    public double getPenokohan() {
        return penokohan;
    }

    public void setPenokohan(double penokohan) {
        this.penokohan = penokohan;
    }

    public double getAkting() {
        return akting;
    }

    public void setAkting(double akting) {
        this.akting = akting;
    }
    
    public double getNilai(){
        return (alur + penokohan + akting) / 3;
    }
}  
