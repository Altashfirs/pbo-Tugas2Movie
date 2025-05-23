/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author altashfir
 */
public class FilmDAO {
    private final Connection conn;
    
    public FilmDAO(){
        this.conn = DBConnection.getConnection();
    }
    
    public void insert(ModelFilm film){
        String query = "INSERT INTO film (judul, alur, penokohan, akting, nilai) VALUES (?, ?, ?, ?, ?);";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, film.getJudul());
            statement.setDouble(2, film.getAlur());
            statement.setDouble(3, film.getPenokohan());
            statement.setDouble(4, film.getAkting());
            statement.setDouble(5, film.getNilai());
            statement.executeUpdate();
        } catch (SQLException e){
            System.out.println("Insert Failed: " + e.getLocalizedMessage());
        }
    }   
    
    public List<ModelFilm> getAll() {
        List<ModelFilm> list = new ArrayList<>();
        String query = "SELECT * FROM film";
        try (Statement statement = conn.createStatement(); ResultSet rs = statement.executeQuery(query)) {
            while (rs.next()) {
                list.add(new ModelFilm(
                        rs.getInt("id_film"),
                        rs.getString("judul"),
                        rs.getDouble("alur"),
                        rs.getDouble("penokohan"),
                        rs.getDouble("akting")
                ));
            }
        } catch (Exception e) {
            System.out.println("Fetch Failed: " + e.getLocalizedMessage());
        }
        return list;
    }
    
    public void update(ModelFilm film) {
        String sql = "UPDATE film SET judul=?, alur=?, penokohan=?, akting=?, nilai=? WHERE id_film=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, film.getJudul());
            ps.setDouble(2, film.getAlur());
            ps.setDouble(3, film.getPenokohan());
            ps.setDouble(4, film.getAkting());
            ps.setDouble(5, film.getNilai());
            ps.setInt(6, film.getIdFilm());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM film WHERE id_film=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Delete error: " + e.getMessage());
        }
    }
}
