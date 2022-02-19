package it.unicam.cs.ids_progetto_casotto.model.utenza;

import it.unicam.cs.ids_progetto_casotto.controller.controller_attivita.PrenotazioneAttivitaCliente;
import it.unicam.cs.ids_progetto_casotto.controller.controller_utenza.PrenotazioneUtenzaCliente;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Interfaccia che gestisce metodi per la gestione delle prenotazioni dei clienti
 */
public class IHandlerPrenotazioniUtenzeClienti {

    private final List<PrenotazioneUtenzaCliente> prenotazioniUtenzaClienti;
    private final List<PrenotazioneAttivitaCliente> prenotazioniAttivitaClienti;

    public IHandlerPrenotazioniUtenzeClienti(List<PrenotazioneUtenzaCliente> prenotazioniUtenzaClienti, List<PrenotazioneAttivitaCliente> prenotazioniAttivitaClienti) {
        this.prenotazioniUtenzaClienti = new ArrayList<>();
        this.prenotazioniAttivitaClienti = new ArrayList<>();
    }

    /**
     * metodo che restituisce una lista delle prenotazioni effettuate dai clienti
     *
     * @return una lista delle prenotazioni effettuate dai clienti
     */
    public List<PrenotazioneUtenzaCliente> getPrenotazioniUtenzeClienti(){
        return this.prenotazioniUtenzaClienti;
    }

    /**
     * metodo che restituisce una prenotazione effettuata da un cliente
     *
     * @param idCliente id del cliente
     * @return lista delle prenotazioni effettuate dal cliente selezionato
     */
    public List<PrenotazioneUtenzaCliente> getPrenotazioneCliente(int idCliente){
        return this.getPrenotazioniUtenzeClienti().stream()
                .filter(x -> x.getIdCliente() == idCliente).collect(Collectors.toList());
    }

    /**
     * metodo che aggiunge una prenotazione effettuata dal cliente
     *
     * @param prenotazione da aggiungere
     * @return la prenotazione aggiunta
     */
   public boolean aggiungiPrenotazioneUtenza(PrenotazioneUtenzaCliente prenotazione){
       if (this.getPrenotazioniUtenzeClienti().contains(prenotazione)) {
           return false;
       }
       this.getPrenotazioniUtenzeClienti().add(prenotazione);
       return true;
   }

    /**
     * metodo che elimina una prenotazione
     *
     * @param prenotazione da eliminare
     * @return true o false se l'operazione ha avuto successo
     */
   public boolean eliminaPrenotazioneUtenza(PrenotazioneUtenzaCliente prenotazione){
       if (!this.getPrenotazioniUtenzeClienti().contains(prenotazione)) {
           return false;
       }
       this.getPrenotazioniUtenzeClienti().remove(prenotazione);
       return false;
   }
}
