package it.unicam.cs.ids_progetto_casotto.model.utenza;

import it.unicam.cs.ids_progetto_casotto.controller.controller_utenza.IControllerGestoreSpiaggia;

import java.util.List;

/**
 * Interfaccia che permette ad un gestore Utenze di gestire le utenze
 */
public class IHandlerUtenze {

    /**
     * Metodo che permette di aggiungere un'utenza al Casotto
     *
     * @param controllerSpiaggia    le utenze del casotto
     * @param id                    l'identificativo dell'utenza da aggiungere
     * @param numeroPostiOccupabili numero delle persone che posso occupare l'utenza
     * @return true o false se l'operazione ha avuto successo
     */
    public boolean aggiungiUtenza(IControllerGestoreSpiaggia controllerSpiaggia, int id, int numeroPostiOccupabili){
        return false;
    }

    /**
     * Metodo che permette di eliminare un'utenza dal Casotto
     * @param controllerSpiaggia le utenze del casotto
     * @param utenza l'utenza da eliminare
     * @return true o false se l'operazione ha avuto successo
     */
   public boolean eliminaUtenza(IControllerGestoreSpiaggia controllerSpiaggia, Utenza utenza){
       return controllerSpiaggia.eliminaUtenza(utenza);
   }

    /**
     * Metodo che restituisce una lista di Utenze del Casotto
     * @param controllerSpiaggia le utenze del casotto
     * @return la lista di Utenze del Casotto
     */
  public List<Utenza> getUtenze(IControllerGestoreSpiaggia controllerSpiaggia){
      return controllerSpiaggia.getUtenze();
  }

}
