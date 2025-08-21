/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.sena.sky;

import java.util.List;
import java.util.Scanner;

public class Sky {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n---MODIFICAR USUARIOS ---");
            System.out.println("1. Insertar usuario");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Actualizar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String contraseña = sc.nextLine();
                    System.out.print("Rol: ");
                    String rol = sc.nextLine();

                    Usuario nuevo = new Usuario(nombre, correo, contraseña, rol);
                    dao.insertar(nuevo);
                }
                case 2 -> {
                    System.out.println("Lista de usuarios:");
                    List<Usuario> usuarios = dao.listar();
                    for (Usuario u : usuarios) {
                        System.out.println(u);
                    }
                }
                case 3 -> {
                    System.out.print("ID del Usuario a actualizar: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nuevo correo: ");
                    String correo = sc.nextLine();
                    System.out.print("Nueva contraseña: ");
                    String contraseña = sc.nextLine();
                    System.out.print("Nuevo rol: ");
                    String rol = sc.nextLine();

                    Usuario actualizado = new Usuario(id, nombre, correo, contraseña, rol);
                    dao.actualizar(actualizado);
                }
                case 4 -> {
                    System.out.print("ID del Usuario a eliminar: ");
                    int id = sc.nextInt();
                    dao.eliminar(id);
                }
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("❌ Opcion invalida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
