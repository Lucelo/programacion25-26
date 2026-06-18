package main.Prueba.controller;

import main.Prueba.Clases.ConexionDB;
import main.Prueba.Clases.Monstruo;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    public void insertar(Monstruo m) {
        String sql = "INSERT INTO monstruos (nombre, nivel, tipo) VALUES (?, ?, ?)";

        try (Connection con = ConexionDB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getNivel());
            ps.setString(3, m.getTipo());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Monstruo> obtenerTodos() {

        List<Monstruo> lista = new ArrayList<>();
        String sql = "SELECT * FROM monstruos";

        try (Connection con =  ConexionDB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Monstruo(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("nivel"),
                        rs.getString("tipo")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    public List<Monstruo> buscarPorNombre(String nombre) {

        List<Monstruo> lista = new ArrayList<>();
        String sql = "SELECT * FROM monstruos WHERE nombre LIKE ?";

        try (Connection con = ConexionDB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + nombre + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Monstruo(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("nivel"),
                        rs.getString("tipo")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void actualizar(Monstruo m) {

        String sql = "UPDATE monstruos SET nombre=?, nivel=?, tipo=? WHERE id=?";

        try (Connection con =  ConexionDB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getNivel());
            ps.setString(3, m.getTipo());
            ps.setInt(4, m.getId());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {

        String sql = "DELETE FROM monstruos WHERE id=?";

        try (Connection con = ConexionDB.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
