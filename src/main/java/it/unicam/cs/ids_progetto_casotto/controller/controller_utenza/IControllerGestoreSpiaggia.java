package it.unicam.cs.ids_progetto_casotto.controller.controller_utenza;

import it.unicam.cs.ids_progetto_casotto.model.utenza.Periodo;
import it.unicam.cs.ids_progetto_casotto.model.utenza.Tariffa;
import it.unicam.cs.ids_progetto_casotto.model.utenza.Utenza;

import java.util.HashMap;
import java.util.List;

/**
 * Interfaccia che definisce dei metodi generici di un gestore Spiaggia
 */
public class IControllerGestoreSpiaggia {
    private final List<Utenza>utenze;
    private final List<Tariffa> tariffe;
    private final HashMap<Periodo,List<Utenza>> listaUtenzeByPeriodo;

    public IControllerGestoreSpiaggia(List<Utenza> utenze, List<Tariffa> tariffe, HashMap<Periodo, List<Utenza>> listaUtenzeByPeriodo) {
        this.utenze = utenze;
        this.tariffe = tariffe;
        this.listaUtenzeByPeriodo = listaUtenzeByPeriodo;
    }

    /**
     * restituisce la lista delle utenze del Casotto
     *
     * @return la lisat delle utenze del Casotto
     */
   public List<Utenza> getUtenze(){
        return this.utenze;
    }

    /**
     * metodo che aggiunge un'utenza
     * @param utenza l'utenza da aggiungere
     * @return true o false se l'operazione ha avuto successo
     */
    public boolean aggiungiUtenza(Utenza utenza){
        if (this.getUtenze().contains(utenza)) {
            System.out.println("L'utenza che si vuole aggiungere è già presente");
            return false;
        }
        System.out.println("Utenza aggiunta correttamente");
        this.utenze.add(utenza);
        return true;
    }

    /**
     * metodo che elimina un'utenza
     * @param utenza l'utenza da eliminare
     * @return true o false se l'operazione ha avuto successo
     */
    public boolean eliminaUtenza(Utenza utenza){
        if (!this.getUtenze().contains(utenza)) {
            System.out.println("L'utenza che si vuole rimuovere non è presente");
        }
        System.out.println("Utenza rimossa correttamente");
        this.utenze.remove(utenza);
        return true;
    }
}
