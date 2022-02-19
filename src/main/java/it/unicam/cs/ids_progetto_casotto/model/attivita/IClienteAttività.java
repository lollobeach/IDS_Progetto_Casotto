package it.unicam.cs.ids_progetto_casotto.model.attivita;

import it.unicam.cs.ids_progetto_casotto.controller.controller_attivita.IControllerClienteAttivita;
import it.unicam.cs.ids_progetto_casotto.model.newsletter.Messaggio;
import it.unicam.cs.ids_progetto_casotto.model.utenza.PrenotazioneUtenza;

import java.util.ArrayList;
import java.util.List;

/**
 * Interfaccia che permette al cliente di gestire le
 * varie attivit&agrave; proposte dal casotto
 */
public class IClienteAttività {

    private final List<PrenotazioneUtenza> utenzePrenotate;
    private final List<PrenotazioneAttivita> attivitaPrenotate;
    private final List<Messaggio> listaMessaggi;

    public IClienteAttività(List<PrenotazioneUtenza> utenzePrenotate, List<PrenotazioneAttivita> attivitaPrenotate, List<Messaggio> listaMessaggi) {
        this.utenzePrenotate =new ArrayList<>();
        this.attivitaPrenotate = new ArrayList<>();
        this.listaMessaggi = new ArrayList<>();
    }

    /**
     * Metodo che permette al cliente di visualizzare
     * le attivit&agrave;, proposte dal casotto,
     * tramite il {@link IControllerClienteAttivita}
     *
     * @param controllerAttivita controller che permette
     *                           di accedere alle attivit&agrave;
     * @return lista di attivit&agrave; visualizzate
     */
   public List<Attivita> visualizzaAttivita(IControllerClienteAttivita controllerAttivita){
       return null;
   }

    /**
     * Metodo che permette al cliente di selezionare
     * un'attivit&agrave;
     *
     * @param controllerAttivita controller che permette
     *                           di accedere all'attivit&agrave;
     *                           selezionata
     * @param attivita attivit&agrave; da selezionare
     */
    public Attivita selezionaAttivita(IControllerClienteAttivita controllerAttivita, Attivita attivita){
        return null;
    }

    /**
     * Metodo che permette al cliente di prenotare
     * un'attivit&agrave;
     *
     * @param controllerAttivita controller che permette
     *                           di accedere all'attivit&agrave;
     *                           selezionata
     * @param attivita attivit&agrave; da prenotare
     * @return true se l'attivit&agrave; risulta prenotata,
     * false altrimenti
     */
   public boolean prenotaAttivita(IControllerClienteAttivita controllerAttivita, Attivita attivita){
        return false;
    }

    /**
     * Metodo che ritorna tutte le attivit&agrave;
     * prenotate dal cliente
     *
     * @return lista delle attivit&agrave; prenotate
     */
   public List<Attivita> getAttivitaPrenotate(){
        return null;
    }

    /**
     * Metodo che permette di selezionare un'attivit&agrave;
     * prenotata dal cliente
     *
     * @param attivita attivit&agrave; selezionata
     *                 dal cliente
     * @return l'attivit&agrave; selezionata
     */
    public Attivita selezionaAttivitaPrenotata(Attivita attivita){
        return null;
    }

    /**
     * Metodo che permette di eliminare un'attivit&agrave;
     * prenotata dal cliente
     *
     * @param controllerAttivita controller che permette
     *                           di eliminare l'attivit&agrave;
     *                           selezionata
     * @param attivita attivit&agrave; prenotata da eliminare
     */
    public void eliminaAttivitaPrenotata(IControllerClienteAttivita controllerAttivita, Attivita attivita){

    }
}
