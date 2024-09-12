package com.exemplo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDExample {

    // Método para inserir um novo driver
    public void insertDriver(int id, String name, String team) {
        String sql = "INSERT INTO drivers (id, name, team) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, team);
            pstmt.executeUpdate();
            System.out.println("Piloto cadastrado com sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para listar todos os drivers
    public void listDrivers() {
        String sql = "SELECT * FROM drivers ORDER BY team ASC";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Nome: " + rs.getString("name") +
                                   ", Time: " + rs.getString("team"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para atualizar dados
    public void updateDriver(int id, String newName, String newTeam) {
        String sql = "UPDATE drivers SET name = ?, team = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setString(2, newTeam);
            pstmt.setInt(3, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Dados atualizados com sucesso.");
            } else {
                System.out.println("Piloto não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para excluir um driver
    public void deleteDriver(int id) {
        String sql = "DELETE FROM drivers WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Piloto excluído com sucesso.");
            } else {
                System.out.println("Piloto não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
