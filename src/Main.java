public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto();

        prodotto1.setNomeProdotto("iPhone");
        prodotto1.setDescrizione("Bel telefono");
        prodotto1.setPrezzo(950);
        prodotto1.setIva(22);

        System.out.println("Prezzo con iva: " + prodotto1.getPrezzoConIva() + " €");
        System.out.println("Prezzo base: " + prodotto1.getPrezzo() + " €");
        System.out.println("Codice Prodotto: " + prodotto1.setCodice());



    }
}