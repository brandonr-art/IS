
package unam.fes.is;


public class Tenis {
    private int puntajeUno;
    private int puntajeDos;
    private String NomJugadorUno;
    private String NombreJugadorDos;

    public Tenis() {
    }

    public Tenis(int puntajeUno, int puntajeDos, String NomJugadorUno, String NombreJugadorDos) {
        this.puntajeUno = puntajeUno;
        this.puntajeDos = puntajeDos;
        this.NomJugadorUno = NomJugadorUno;
        this.NombreJugadorDos = NombreJugadorDos;
    }

    public int getPuntajeUno() {
        return puntajeUno;
    }

    public void setPuntajeUno(int puntajeUno) {
        this.puntajeUno = puntajeUno;
    }

    public int getPuntajeDos() {
        return puntajeDos;
    }

    public void setPuntajeDos(int puntajeDos) {
        this.puntajeDos = puntajeDos;
    }

    public String getNomJugadorUno() {
        return NomJugadorUno;
    }

    public void setNomJugadorUno(String NomJugadorUno) {
        this.NomJugadorUno = NomJugadorUno;
    }

    public String getNombreJugadorDos() {
        return NombreJugadorDos;
    }

    public void setNombreJugadorDos(String NombreJugadorDos) {
        this.NombreJugadorDos = NombreJugadorDos;
    }
    
    public void puntajeUno(){
        puntajeUno++;
    }
    public void puntajeDos(){
        puntajeDos++;
    }
    public String pintarPuntaje(int puntaje ){
        String puntajeTenis = "";
        if (puntaje == 0){
            puntajeTenis = "Cero";
        }
        if (puntaje == 1){
            puntajeTenis = "Quince";
        }
        if (puntaje == 2){
            puntajeTenis = "Treinta";
        }
        if (puntaje == 3){
            puntajeTenis = "Cuarenta";
        }
        return puntajeTenis;
    }
    public boolean ganador(){
        if (puntajeUno >= 4 && puntajeUno >= puntajeDos + 2){
            return true;
        }
        if (puntajeDos >= 4 && puntajeDos >= puntajeUno + 2){
            return true;
        }
        return false;
    }
    
    public String ventaja(){
        if (puntajeUno > puntajeDos){
            return NomJugadorUno;
        }else{
            return NombreJugadorDos;
        }
    }
    
    public boolean empate(){
        return puntajeUno >= 3 && puntajeDos == puntajeUno;
            
    }
    
    public String juego(){
        if (ganador()){
            return ventaja() + " Ganador";
        }
        if (empate()){
            return "Deuce";
        }
        return pintarPuntaje(puntajeUno) + ',' + pintarPuntaje(puntajeDos);
    }
}

