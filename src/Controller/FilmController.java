/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.FilmDAO;
import Model.ModelFilm;
import java.util.List;

/**
 *
 * @author altashfir
 */
public class FilmController implements FilmService{
    private final FilmDAO dao = new FilmDAO();

    @Override
    public void insertFilm(ModelFilm film) {
        dao.insert(film);
    }

    @Override
    public List<ModelFilm> getAllFilm() {
        return dao.getAll();
    }

    @Override
    public void updateFilm(ModelFilm film) {
        dao.update(film);
    }

    @Override
    public void deleteFilm(int idFilm) {
        dao.delete(idFilm);
    }
}
