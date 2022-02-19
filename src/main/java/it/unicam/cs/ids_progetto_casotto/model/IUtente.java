package it.unicam.cs.ids_progetto_casotto.model;

/**
 * Interfaccia che definisce un generico
 * utente del sistema
 */
public class IUtente {
    private int id;
    private final String nome;
    private final String cognome;
    private final String annoNascita;
    private final char sesso;
    private String email;

    public IUtente(int id, String nome, String cognome, String annoNascita, char sesso, String email) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
        this.email = email;
    }

    /**
     * Metodo che ritorna
     * l'identificativo dell'utente
     *
     * @return identificativo
     */
  public   int getId(){
      return this.id;
  }

    /**
     * Metodo che ritorna il nome
     * dell'utente
     *
     * @return nome utente
     */
  public   String getNomeUtente(){
      return this.nome;
  }

    /**
     * Metodo che ritora il cognome
     * dell'utente
     *
     * @return cognome utente
     */
    public String getCognomeUtente(){
        return this.cognome;
    }

    /**
     * Metodo che ritorna l'anno
     * di nascita dell'utente
     *
     * @return anno di nascita
     */
  public  String getAnnoNascita(){
      return this.annoNascita;
  }

    /**
     * Metodo che ritorna il sesso
     * dell'utente
     *
     * @return sesso utente
     */
  public char getSesso(){
      return this.sesso;
  }

    /**
     * Metodo che ritorna l'e-mail
     * dell'utente
     *
     * @return e-mail utente
     */
    public String getEmail(){
        return this.email;
    }
}
