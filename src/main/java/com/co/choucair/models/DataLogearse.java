package com.co.choucair.models;

public class DataLogearse {
    private  static String nombreUsuario;

    public static String getNombreUsuario() {
        return nombreUsuario;
    }

    public static void setNombreUsuario(String nombreUsuario) {
        DataLogearse.nombreUsuario = nombreUsuario;
    }
}
