package capa_logica;

import java.util.ArrayList;

public class CL {

    private ArrayList<Jugador> listaJugador;

    public CL() {
        this.listaJugador = new ArrayList<Jugador>();
    }

    public void registar_jugador(String nombre, String apellido, String username, String rol) {
        Jugador nuevo_jugador = new Jugador(nombre, apellido, username, rol);
        listaJugador.add(nuevo_jugador);
    }

    public ArrayList<Jugador> getListaJugador() {
        return listaJugador;
    }

    public void setListaJugador(ArrayList<Jugador> listaJugador) {
        this.listaJugador = listaJugador;
    }

}
