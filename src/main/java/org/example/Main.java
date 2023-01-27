package org.example;

public class Main {
    public static void main(String[] args) {

        /// EN EL MAIN LLAMO A MIS CLASES
        /// EN EL MAIN CREO LOS OBJECTOS DE MIS CLASES
        /// EN EL MAIN CREO UNA INSTANCIA DE MI CLASE
        /// EN EL MAIN SACO COPIA A MIS CLASES Y CREO OBJECTOS
        int numeroHijos=10;
        int numeroHijosConlaotra=1;

        Invitado objectoDeClaseInvitado=new Invitado();
        Invitado objecto2= new Invitado(25,true,"David",10000);
        Invitado objecto3 = new Invitado();

        // obtener el valor de los atributos
        System.out.println(objectoDeClaseInvitado.nombre);
        System.out.println(objecto2.nombre);

    }
}