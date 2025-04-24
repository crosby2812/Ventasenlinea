package com.ventaslinea.vista;

import com.ventaslinea.dao.productoDAO;
import com.ventaslinea.modelo.producto;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        productoDAO dao = new productoDAO();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Insertar producto ===");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        producto producto = new producto(0, nombre, precio);
        if (dao.insertarProducto(producto)) {
            System.out.println("Producto insertado.");
        } else {
            System.out.println("Error.");
        }
    }
}
