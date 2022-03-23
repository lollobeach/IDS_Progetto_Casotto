package it.unicam.cs.ids_progetto_casotto.controller.controller_attivita;

import it.unicam.cs.ids_progetto_casotto.model.attivita.Event;
import it.unicam.cs.ids_progetto_casotto.model.attivita.Prenotazione;

import java.util.List;

/**
 * Interfaccia che definisce un generico
 * controller per gestire le attivit&agrave;
 * che il cliente vuole prenotare
 */
public interface IControllerClienteAttivita {

    /**
     * Metodo che ritorna le attivit&agrave;
     * disponibili
     *
     * @return lista di attivit&agrave;
     */
    List<Event> getAttivita();

    /**
     * Metodo che ritorna una singola attività
     *
     * @param id l'id dell'attività
     * @return l'attività
     */
    Event getSingolaAttivita(Integer id);

    /**
     * Metodo che ritorna il numero di
     * posti disponibili per un'attivit&agrave;
     * in particolare
     *
     * @param id dell'attivita di cui si vuole sapere
     *                 il numero di posti
     *                 disponibili
     * @return numero di posti disponibili per
     * tale attivit&agrave;
     */
    Integer getPostiDisponibili(Integer id);

    /**
     * Metodo che permette al cliente
     * di prenotare un'attivit&agrave;
     *
     * @param idUser id dell'user che vuole
     *               prenotare
     * @param idAttivita id dell'attivit&agrave; che si vuole
     *                   prenotare
     *
     * @return la prenotazione creata
     */
    Prenotazione creaPrenotazioneAttivitaCliente(Integer idUser, Integer idAttivita);


}
