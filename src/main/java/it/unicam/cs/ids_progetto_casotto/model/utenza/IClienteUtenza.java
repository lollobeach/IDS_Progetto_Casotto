package it.unicam.cs.ids_progetto_casotto.model.utenza;

import it.unicam.cs.ids_progetto_casotto.controller.controller_utenza.IControllerClienteSpiaggia;
import it.unicam.cs.ids_progetto_casotto.model.attivita.PrenotazioneAttivita;
import it.unicam.cs.ids_progetto_casotto.model.newsletter.Messaggio;

import java.util.ArrayList;
import java.util.List;

/**
 *Interfaccia che definisce azioni che un utente puo&grave; effettuare per quanto riguarda le utenze.
 */
public class IClienteUtenza {

    private final List<PrenotazioneUtenza> utenzePrenotate;
    private final List<PrenotazioneAttivita> attivitaPrenotate;
    private final List<Messaggio> listaMessaggi;

    public IClienteUtenza(List<PrenotazioneUtenza> utenzePrenotate, List<PrenotazioneAttivita> attivitaPrenotate, List<Messaggio> listaMessaggi) {
        this.utenzePrenotate = new ArrayList<>();
        this.attivitaPrenotate = new ArrayList<>();
        this.listaMessaggi = new ArrayList<>();
    }

    /**
     * metodo che permette di visualizzare le utenze disponibili del Casotto in un determinato periodo
     * @param controllerSpiaggia restituisce tutte le utenze del casotto
     * @param periodi il periodo selezionato dall'utente
     * @return la lista delle utenze disponibili
     */
   public List<Utenza>visualizzaUtenze(IControllerClienteSpiaggia controllerSpiaggia, Periodo periodi){
       return null;
   }

    /**
     * Metodo che permette di visualizzare le
     * utenze in base al periodo e alla fascia oraria
     *
     * @param controllerSpiaggia controller che permette di accedere
     *                           alle utenze
     * @param periodo selezionato
     * @param fasciaOraria orari di interesse
     * @return lsita di utenze corrispondenti al periodo e alla
     * fascia oraria selezionati
     */
   public List<Utenza> visualizzaUtenze(IControllerClienteSpiaggia controllerSpiaggia, Periodo periodo, FasciaOraria fasciaOraria){
       return null;
   }

    /**
     * metodo che permette di far selezionare un'utenza da prenotare al cliente
     *
     * @param controllerSpiaggia restituisce tutte le utenze del casotto
     * @param utenza l'utenza da selezionare
     * @return true o false se l'utenza è stata scelta o meno
     */
    public boolean selezionaUtenzadaPrenotare(IControllerClienteSpiaggia controllerSpiaggia, Utenza utenza){
        return false;
    }

    /**
     * Metodo che permette di selezionare
     * la tariffa
     *
     * @param controllerSpiaggia controller che permette di accedere
     *                           alla tariffa
     * @param tariffa tariffa da selezionare
     * @return tariffa selezionata
     */
   public Tariffa selezionaTariffa(IControllerClienteSpiaggia controllerSpiaggia, Tariffa tariffa){
       return null;
   }

    /**
     * metodo che restituisce le utenze prenotate dal cliente
     * @return le utenze prenotate dall'utente
     */
  public List<PrenotazioneUtenza> getPrenotazioniUtenze(){
      return null;
  }

    /**
     * restituisce un'utenza selezionata dal cliente
     *
     * @return un'utenza selezionata da un'utente
     */
   public PrenotazioneUtenza selezionaPrenotazioneUtenza(PrenotazioneUtenza prenotazione){
       return null;
   }

    /**
     * metodo che permette al cliente di cancellare una prenotazione effettuata
     * @param controllerSpiaggia restituisce  le utenze prenotate del cliente
     * @param utenza l'utenza selezionata da cancellare
     */
    void eliminaPrenotazioneUtenza(IControllerClienteSpiaggia controllerSpiaggia, PrenotazioneUtenza utenza){

    }


}

