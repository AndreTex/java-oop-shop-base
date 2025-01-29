public class Prodotto {
    public int codice;
    public String nomeProdotto;
    public String descrizione;
    public int prezzo;
    public int iva;

    public Prodotto(){

    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    //completare ultimo metodo: ottenere nome completo
    public String getNomeProdottoCompleto(){
        return  "-" + this.nomeProdotto;
    }

    public int setCodice(){
        return (int) (Math.random() * 100);
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getPrezzoConIva(){
        return this.prezzo + (this.prezzo / this.iva);
    }
    /*
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- il prodotto esponga un metodo per avere il prezzo base
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
    */
}
