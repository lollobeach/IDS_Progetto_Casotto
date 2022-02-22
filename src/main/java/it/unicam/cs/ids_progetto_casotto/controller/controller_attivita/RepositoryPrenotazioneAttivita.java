package it.unicam.cs.ids_progetto_casotto.controller.controller_attivita;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPrenotazioneAttivita extends JpaRepository<PrenotazioneAttivitaCliente,Integer> {
}
