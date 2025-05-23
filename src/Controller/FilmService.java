/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.ModelFilm;
import java.util.List;


/**
 *
 * @author altashfir
 */
public interface FilmService {
    void insertFilm(ModelFilm film);
    List<ModelFilm> getAllFilm();
    void updateFilm(ModelFilm film);
    void deleteFilm(int idFilm);
}
