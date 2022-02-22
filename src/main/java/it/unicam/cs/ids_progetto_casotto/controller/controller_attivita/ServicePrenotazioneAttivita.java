package it.unicam.cs.ids_progetto_casotto.controller.controller_attivita;

import it.unicam.cs.ids_progetto_casotto.model.attivita.Attivita;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicePrenotazioneAttivita {

    private RepositoryPrenotazioneAttivita repositoryPrenotazioneAttivita;
    private RepositoryAttivita repositoryAttivita;

    public ServicePrenotazioneAttivita(RepositoryPrenotazioneAttivita repositoryPrenotazioneAttivita, RepositoryAttivita repositoryAttivita){
        this.repositoryPrenotazioneAttivita= repositoryPrenotazioneAttivita;
        this.repositoryAttivita= repositoryAttivita;

    }

    public Optional<PrenotazioneAttivitaCliente> creaPrenotazioneAttivita(Integer idCliente, Integer id) {

        Optional<Attivita> attivitaSelezionata = this.repositoryAttivita.findById(id);
        PrenotazioneAttivitaCliente nuovaPrenotazione = new PrenotazioneAttivitaCliente();
        nuovaPrenotazione.setAttivitaPrenotata(attivitaSelezionata.get());
        nuovaPrenotazione.setIdCliente(idCliente);
        nuovaPrenotazione.setOrarioPrenotazione();
        nuovaPrenotazione.setIdPrenotazione(id);


        return Optional.of(this.repositoryPrenotazioneAttivita.save(nuovaPrenotazione));

    }

    public Optional<PrenotazioneAttivitaCliente> eliminaPrenotazioneAttivitaCliente(Integer idPrenotazione) {
     Optional <PrenotazioneAttivitaCliente> toDelete = this.repositoryPrenotazioneAttivita.findById(idPrenotazione);
        if(toDelete.isEmpty()){
            return Optional.empty();
        }
        this.repositoryPrenotazioneAttivita.deleteById(idPrenotazione);
       return toDelete;

    }
}
