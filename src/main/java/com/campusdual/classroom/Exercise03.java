package com.campusdual.classroom;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor
    public static String greetings(String nombre) {

        return "Hola. Bienvenido " + nombre;
    }

    // Esto es una funcion, ya que devuelve un valor
    public static String error(String name) {

        return "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + name;
    }


    //Esto es un procedimiento, ya que no devuelve un valor
    public static void checkUser(String user, String pass) {
        if (user.equals("Sebas") && pass.equals("sebas01")) {
            System.out.println(Exercise03.greetings(user));
        } else {
            System.out.println(Exercise03.error("Sebas"));
        }
    }

    public static void main(String[] args) {
        Exercise03.checkUser("Sebas","sebas01");
        Exercise03.checkUser("Juan","juan01");

    }
}
