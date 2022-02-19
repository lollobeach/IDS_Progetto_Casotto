package it.unicam.cs.ids_progetto_casotto.controller.controller_utenza;

import it.unicam.cs.ids_progetto_casotto.model.utenza.Utenza;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSpiaggia {
    private RepositoryUtenze repositoryUtenze;

    public ServiceSpiaggia(RepositoryUtenze repositoryUtenze){
        this.repositoryUtenze=repositoryUtenze;
    }
    public List<Utenza> getAll(){
        return repositoryUtenze.findAll();
    }
    public Utenza creaUtenza(){

    }



}
