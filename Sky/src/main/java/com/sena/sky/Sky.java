/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sena.sky;

import com.sena.sky.Usuario;
import com.sena.sky.UsuarioDAO;

public class Sky {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        // Insertar un usuario
        Usuario nuevo = new Usuario("Rubi Leo", "rubi@email.com", "123456", "admin");
        dao.insertar(nuevo);

        // Listar usuarios
        System.out.println("Lista de usuarios:");
        for (Usuario u : dao.listar()) {
            System.out.println(u);
        }
    }
}
