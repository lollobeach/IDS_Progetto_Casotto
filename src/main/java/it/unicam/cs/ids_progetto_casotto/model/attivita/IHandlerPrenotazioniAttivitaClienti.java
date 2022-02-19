package it.unicam.cs.ids_progetto_casotto.model.attivita;

import it.unicam.cs.ids_progetto_casotto.controller.controller_attivita.PrenotazioneAttivitaCliente;
import it.unicam.cs.ids_progetto_casotto.controller.controller_utenza.PrenotazioneUtenzaCliente;
import it.unicam.cs.ids_progetto_casotto.model.Receptionist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interfaccia che definsice le azioni,
 * eseguibili dal {@link Receptionist}, per gestire
 * le attivit&agrave; prenotate dal cliente
 */
public class IHandlerPrenotazioniAttivitaClienti {

    private final List<PrenotazioneUtenzaCliente> prenotazioniUtenzaClienti;
    private final List<PrenotazioneAttivitaCliente> prenotazioniAttivitaClienti;

    public IHandlerPrenotazioniAttivitaClienti(List<PrenotazioneUtenzaCliente> prenotazioniUtenzaClienti, List<PrenotazioneAttivitaCliente> prenotazioniAttivitaClienti) {
        this.prenotazioniUtenzaClienti =new ArrayList<>();
        this.prenotazioniAttivitaClienti = new ArrayList<>();
    }

    /**
     * Metodo che ritora la lista delle
     * prenotazioni delle attivit&agrave; effettuate
     * dai clienti
     *
     * @return lista delle prenotazioni effettuate
     */
    public List<PrenotazioneAttivitaCliente> getPrenotazioniAttivitaClienti(){
        return this.prenotazioniAttivitaClienti;
    }

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
   public List<PrenotazioneAttivitaCliente> getPrenotazioniAttivitaCliente(int idCliente){
       return this.getPrenotazioniAttivitaClienti().stream()
               .filter(x -> x.getIdCliente() == idCliente).collect(Collectors.toList());
   }

    /**
     * Metodo che permette di aggiungere una
     * prenotazione di un'attivit&agrave;, effettuata
     * dal cliente, nella lista delle prenotazioni gestite
     * dal {@link Receptionist}
     *
     * @param prenotazione da aggiungere nella lista
     * @return true se viene aggiunta correttamente,
     * false altrimenti
     */
    public boolean aggiungiPrenotazioneAttivita(PrenotazioneAttivitaCliente prenotazione){
        if (this.getPrenotazioniAttivitaClienti().contains(prenotazione)) {
            return false;
        }
        this.getPrenotazioniAttivitaClienti().add(prenotazione);
        return true;
    }

    /**
     * Metodo che permette di eliminare una
     * prenotazione di un'attivit&agrave;, effettuata
     * dal cliente, dalla lista delle prenotazioni gestite
     * dal {@link Receptionist}
     *
     * @param prenotazione da eliminare
     * @return true se la rimozione prevede il rimborso,
     * false altrimenti
     */
   public boolean eliminaPrenotazioneAttivita(PrenotazioneAttivitaCliente prenotazione){
       if (!this.getPrenotazioniAttivitaClienti().contains(prenotazione)) {
           return false;
       }
       this.getPrenotazioniAttivitaClienti().remove(prenotazione);
       return true;
   }
}
