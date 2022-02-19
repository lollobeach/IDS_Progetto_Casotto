package it.unicam.cs.ids_progetto_casotto.controller.controller_utenza;

import it.unicam.cs.ids_progetto_casotto.model.utenza.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;

/**
 * Interfaccia che permette di gestire le prenotazioni di un cliente
 */
public class IControllerClienteSpiaggia {
    private final List<Utenza>utenze;
    private final List<Tariffa> tariffe;
    private final HashMap<Periodo,List<Utenza>> listaUtenzeByPeriodo;

    public IControllerClienteSpiaggia(List<Utenza> utenze, List<Tariffa> tariffe, HashMap<Periodo, List<Utenza>> listaUtenzeByPeriodo) {
        this.utenze = utenze;
        this.tariffe = tariffe;
        this.listaUtenzeByPeriodo = listaUtenzeByPeriodo;
    }

    /**
     * Metodo che restituisce una lista di utenze prenotate in un determinato periodo di tempo
     *
     * @param periodi i periodi presi in considerazione
     * @return una lista di utenze prenotate in un determinato periodo di tempo
     */
   public List<Utenza> getUtenze(Periodo periodi){
        if (periodi.checkGiorni()) {
        }
        return this.listaUtenzeByPeriodo.get(periodi);
    }



    /**
     * Metodo che restituisce una lista di di utenze prenotate in un determinato periodo di tempo, controllando anche la fascia oraria
     * di prenotazione
     *
     * @param periodi i periodi presi in considerazione
     * @param fasciaOraria la fascia oraria presa in considerazione
     * @return una lista di di utenze prenotate in un determinato periodo di tempo, controllando anche la fascia oraria
     *       di prenotazione
     */
   public List<Utenza> getUtenze(Periodo periodi, FasciaOraria fasciaOraria){
        return null;
    }

    /**
     * metodo che resituisce le tariffe del Casotto
     *
     * @return la lista contente le tariffe del Casotto
     */
   public List<Tariffa> getTariffe(){
        return this.tariffe;
    }

    /**
     * metodo che permette di creare la prenotazione effettuata dal cliente, al receptionist
     *
     * @param receptionist colui che riceve la notifica
     * @param idCliente l'identificativo dell'utente
     * @param permanenzaUtenza il periodo di permanenza del cliente
     * @param utenza utenza da prenotare
     * @param tariffa la tariffa selezionata dall'utente
     * @return true o false se la creazione ha avuto successo o meno
     */
    public boolean creaPrenotazioneCliente(IHandlerPrenotazioniUtenzeClienti receptionist, int idCliente, Periodo permanenzaUtenza, Utenza utenza, Tariffa tariffa){
        LocalDate t1 = LocalDate.now();
        String str = t1.toString();
        PrenotazioneUtenzaCliente prenotazioneUtenzaCliente = new PrenotazioneUtenzaCliente(idCliente, permanenzaUtenza, utenza, tariffa, str);
        if (!receptionist.aggiungiPrenotazioneUtenza(prenotazioneUtenzaCliente)) {
            System.out.println("Prenotazione di: " + prenotazioneUtenzaCliente + " non effettuata!");
            return false;
        }
        receptionist.aggiungiPrenotazioneUtenza(prenotazioneUtenzaCliente);
        System.out.println("Prenotazione di: " + prenotazioneUtenzaCliente + " effettuata");
        return false;
    }

    /**
     * metodo che permette di far eliminare la prenotazione dell'utenza effettuata dal cliente, al receptionist
     *
     * @param receptionist colui che riceve la notifica
     * @param prenotazione la prenotazione da cancellare
     * @return true o false se l'operazione ha avuto successo
     */
    public boolean eliminaPrenotazione(IHandlerPrenotazioniUtenzeClienti receptionist, PrenotazioneUtenzaCliente prenotazione) {

        receptionist.eliminaPrenotazioneUtenza(prenotazione);
        if (checkRimborso(prenotazione)) {
            System.out.println("Rimborso consentito!");
            return true;
        }
        System.out.println("Rimborso negato!");
        return false;
    }
    private boolean checkRimborso(PrenotazioneUtenzaCliente prenotazioneUtenzaCliente) {
        LocalDate dataCheckIn = prenotazioneUtenzaCliente.getPeriodoPermanenza().getCheckIn();
        LocalDate now = LocalDate.now();
        Period difference = Period.between(now,dataCheckIn);
        if (difference.getYears() == 0 || difference.getMonths() == 0 || difference.getDays() >= 2) {
            return true;
        }
        return false;
    }
}
