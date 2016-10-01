import javax.sql.rowset.CachedRowSet;

/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaInterface {
    public static void main(String[] args) {
        Caminhonete caminhonete = new Caminhonete();
        caminhonete.setCor("Branca");
        caminhonete.setModelo("Estrada");
        caminhonete.setVelocidadeMaxima(120);
        caminhonete.setCapacidadeCarga(500);

        Jipe jipe = new Jipe();
        jipe.setCor("Preta");
        jipe.setModelo("RAV4");
        jipe.setVelocidadeMaxima(120);
        jipe.setEh4x4(true);

        Posto postoShell = new Posto();

        double valorJipe = postoShell.colocarCombustivel(jipe, 100);

        System.out.println("Valor Gasto Jipe: " + valorJipe);

        double valorCaminhonete = postoShell.colocarCombustivel(caminhonete, 100);

        System.out.println("Valor Gasto Caminhonete: " + valorCaminhonete);
    }
}
