package it.unicam.cs.ids_progetto_casotto.model.attivita;

import it.unicam.cs.ids_progetto_casotto.controller.controller_attivita.PrenotazioneAttivitaCliente;

import java.util.List;

/**
 * Interfaccia che definsice le azioni,
 * eseguibili dal {@link }, per gestire
 * le attivit&agrave; prenotate dal cliente
 */
public interface IHandlerPrenotazioniAttivitaClienti {

    /**
     * Metodo che ritora la lista delle
     * prenotazioni delle attivit&agrave; effettuate
     * dai clienti
     *
     * @return lista delle prenotazioni effettuate
     */
    List<PrenotazioneAttivitaCliente> getPrenotazioniAttivitaClienti();

    /**
     * Metodo che ritora le prenotazioni effettuate
     * da un cliente in particolare
     *
     * @param idCliente identificativo del cliente
     *                  di cui si vuole conoscere le
     *                  sue prenotazioni
     * @return lista delle prenotazioni effettuate dal
     * cliente effettuato
     */
    List<PrenotazioneAttivitaCliente> getPrenotazioniAttivitaCliente(int idCliente);

    /**
     * Metodo che permette di aggiungere una
     * prenotazione di un'attivit&agrave;, effettuata
     * dal cliente, nella lista delle prenotazioni gestite
     * dal {@link }
     *
     * @param prenotazione da aggiungere nella lista
     * @return true se viene aggiunta correttamente,
     * false altrimenti
     */
    boolean aggiungiPrenotazioneAttivita(PrenotazioneAttivitaCliente prenotazione);

    /**
     * Metodo che permette di eliminare una
     * prenotazione di un'attivit&agrave;, effettuata
     * dal cliente, dalla lista delle prenotazioni gestite
     * dal {@link }
     *
     * @param prenotazione da eliminare
     * @return true se la rimozione prevede il rimborso,
     * false altrimenti
     */
    boolean eliminaPrenotazioneAttivita(PrenotazioneAttivitaCliente prenotazione);
}
