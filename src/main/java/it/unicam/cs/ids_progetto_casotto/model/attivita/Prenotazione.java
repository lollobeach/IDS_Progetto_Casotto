package it.unicam.cs.ids_progetto_casotto.model.attivita;


import it.unicam.cs.ids_progetto_casotto.controller.controller_attivita.ControllerAttivita;
import it.unicam.cs.ids_progetto_casotto.model.User;
import it.unicam.cs.ids_progetto_casotto.model.utenza.Utenza;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Classe che rappresenta una prenotazione
 * del cliente che viene gestita da
 * {@link ControllerAttivita} e
 */

@Entity
@Getter
@Setter
@Table(name = "prenotazione")
public class Prenotazione {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false,
            targetEntity = User.class,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(targetEntity = Utenza.class,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "utenza_id", referencedColumnName = "id")
    private Event attivita;

    public Prenotazione() {
    }

}
