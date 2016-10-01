/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class Posto {

    private double precoGasolina = 4.0;

    private double precoAlcool = 3.0;

    public double colocarCombustivel(Gasolina gasolina, double quantidade) {
        gasolina.abastecer(quantidade);

        return quantidade * precoGasolina;
    }

    public double colocarCombustivel(Alcool alcool, double quantidade) {
        alcool.abastecer(quantidade);

        return quantidade * precoAlcool;
    }
}
