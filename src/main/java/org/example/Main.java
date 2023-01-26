package org.example;

public class Main {
    public static void main(String[] args) {

        //EN EL MAIN LLAMO A MIS CLASES
        //EN EL MAIN CREO LOS OBJETOS DE MIS CLASES
        //EN EL MAIN CREO UNA INSTANCIA DE MI CLASE
        //EN EL MAIN LE SACO COPIA A MIS CLASES Y CREO OBJETOS
        invitado objetoDeClaseinvitado =new invitado();
        invitado objeto2 = new invitado(33,true,"Jose",10000);

        //Obtener el valor de los atributos
        System.out.println(objetoDeClaseinvitado.nombre);
        System.out.println(objeto2.nombre );



    }
}