package it.unicam.cs.ids_progetto_casotto.controller.controller_attivita;

import it.unicam.cs.ids_progetto_casotto.model.attivita.Attivita;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class PrenotazioneAttivitaCliente {


    private  int idCliente;
    private Integer idPrenotazione;
    private  Attivita attivitaPrenotata;
    private  LocalDateTime orarioPrenotazione;


    public PrenotazioneAttivitaCliente() {
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdPrenotazione(Integer idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }

    public void setAttivitaPrenotata(Attivita attivitaPrenotata) {
        this.attivitaPrenotata = attivitaPrenotata;
    }

    public void setOrarioPrenotazione() {
        LocalDateTime now = LocalDateTime.now();
        this.orarioPrenotazione = now;
    }

    /**
     * Metodo che ritorna
     * l'id del cliente che ha
     * prenotato
     *
     * @return id del cliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Metodo che ritorna
     * l'attivit&agrave; prenotata
     *
     * @return attivit&agrave; prenotata
     */
    public Attivita getAttivitaPrenotata() {
        return attivitaPrenotata;
    }

    /**
     * Metodo che ritorna
     * l'orario in cui viene
     * effettuata la prenotazione
     *
     * @return orario prenotazione
     */
    public LocalDateTime getOrarioPrenotazione() {
        return this.orarioPrenotazione;
    }

    @Override
    public String toString() {
        return "PrenotazioneAttivitaCliente{" +
                "idCliente=" + idCliente +
                ", attivitaPrenotata=" + attivitaPrenotata +
                ", orarioPrenotazione=" + orarioPrenotazione +
                '}';
    }
}
