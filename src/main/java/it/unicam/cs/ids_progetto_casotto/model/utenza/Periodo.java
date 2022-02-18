package it.unicam.cs.ids_progetto_casotto.model.utenza;

import java.time.LocalDate;

/**
 * Classe che descrive un periodo di prenotazione
 */
public class Periodo {

    String checkIn;
    String checkOut;

    public Periodo(String checkIn, String checkOut){
        this.checkIn=checkIn;
        this.checkOut=checkOut;
    }

    /**
     * metodo che controlla se checkIn e checkOut hanno la stessa data
     * @return true se i checkIn e checkOut sono uguali altrimenti false
     */
    public boolean checkGiorni(){
        return this.checkOut.equals(this.checkOut);
    }

    /**
     * Metodo che ritorna la data del check-in
     *
     * @return check-in
     */
    public LocalDate getCheckIn(){
        return LocalDate.parse(this.checkIn);
    }

    public String getCheckOut(){
        return  this.checkOut;
    }

    public void setCheckIn(String newCheckIn){
        this.checkIn=newCheckIn;
    }

    public void setCheckOut(String newCheckOut){
        this.checkOut=newCheckOut;
    }
}
