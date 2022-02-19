package it.unicam.cs.ids_progetto_casotto.model.newsletter;

import it.unicam.cs.ids_progetto_casotto.controller.controller_attivita.PrenotazioneAttivitaCliente;
import it.unicam.cs.ids_progetto_casotto.controller.controller_notifiche.IControllerNotificheClienti;
import it.unicam.cs.ids_progetto_casotto.controller.controller_notifiche.ControllerNotifiche;
import it.unicam.cs.ids_progetto_casotto.controller.controller_utenza.PrenotazioneUtenzaCliente;
import it.unicam.cs.ids_progetto_casotto.model.Cliente;
import it.unicam.cs.ids_progetto_casotto.model.Receptionist;
import it.unicam.cs.ids_progetto_casotto.model.attivita.Attivita;

import java.util.ArrayList;
import java.util.List;

/**
 * Interfaccia che definisce le azioni,
 * eseguibili dal {@link Receptionist} per
 * gestire il {@link ControllerNotifiche}
 */
//TODO da sistemare la gestione dei messaggi
public class IHandlerNewsletter {

    private final List<PrenotazioneUtenzaCliente> prenotazioniUtenzaClienti;
    private final List<PrenotazioneAttivitaCliente> prenotazioniAttivitaClienti;

    public IHandlerNewsletter(List<PrenotazioneUtenzaCliente> prenotazioniUtenzaClienti, List<PrenotazioneAttivitaCliente> prenotazioniAttivitaClienti) {
        this.prenotazioniUtenzaClienti = new ArrayList<>();
        this.prenotazioniAttivitaClienti = new ArrayList<>();
    }

    /**
     * Metodo che permette al
     * {@link Receptionist} di inviare dei messaggi
     * ai clienti iscritti alla newsletter
     *
     * @param newsletter controller che permette di
     *                   accedere ai clienti iscritti alla
     *                   newsletter per inviare i messaggi
     * @param oggetto oggetto del messaggio
     * @param body testo del messaggio
     * @return true se il messaggio risulta consegnato correttamente,
     * false altrimenti
     */
   public boolean notificaCliente(IControllerNotificheClienti newsletter, String oggetto, String body){
       return false;
   }

    /**
     * Metodo che permette al
     * {@link Receptionist} di inviare un remindare
     * dell'attivit&agrave; giornaliera
     *
     * @param newsletter controller che permette di
     *                   inviare il reminder
     * @param attivita di cui si vuole inviare il
     *                 reminder
     * @return true se il messaggio viene inviato
     * correttamente, false altrimenti
     */
    public boolean notificaAttivita(IControllerNotificheClienti newsletter, Attivita attivita){
        return false;
    }
}
