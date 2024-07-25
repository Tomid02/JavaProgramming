package chapter8TiposDatos;

import java.util.Scanner;

//ejercicio independiente
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username:");
        String username = scanner.next();
        System.out.println("Ingrese la contraseña antigua:");
        String oldPassword = scanner.next();
        System.out.println("Ingrese la nueva contraseña");
        String newPassword = scanner.next();

        while(!passwordValid(newPassword, username, oldPassword)){
            System.out.println("Contraseña invalida, ingrese una nueva contraseña:");
            newPassword = scanner.next();
            passwordValid(newPassword, username, oldPassword);

        }

        System.out.println("Contraseña cambiada");
        System.out.println(username);
        System.out.println(oldPassword);
        System.out.println(newPassword);
        scanner.close();
    }

    public static boolean passwordValid(String password, String user, String oldpassword){
        var modifiedPassword = new StringBuilder(password);

        //contraseña valida
        if(password.length() >= 8 && !password.toUpperCase().contains(user.toUpperCase()) &&  !password.equalsIgnoreCase(oldpassword)){
            boolean mayus = false;
            boolean especial = false;
            //recorro la contraseña
            for(int i=0; i<password.length(); i++){
                //si tiene mayuscula
                if(Character.isUpperCase(modifiedPassword.charAt(i))){
                    mayus = true;
                }
                //si contiene un caracter especial
                if (Character.isLetterOrDigit(modifiedPassword.charAt(i))) {
                    especial = true;
                }
            }
            return mayus && especial;
        }else{
            return false;
        }

    }
}
