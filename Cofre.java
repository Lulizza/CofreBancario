import java.text.DecimalFormat;
import java.util.ArrayList;
import java.lang.Override;

public class Cofre{

    private ArrayList<Moeda> moedas;

    public Cofre(){
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda){
        System.out.printf("--> Adicionando R$ %.2f no cofrinho...\n",moeda.getValor());
        moedas.add(moeda);
    }

    public void excluirMoeda(Moeda moeda){
        if(this.calcularTotal() < moeda.getValor()){
            System.out.printf("Não é possível excluir a moeda\n");
        }else{
            System.out.printf("--> Removendo R$ %.2f no cofrinho...\n",moeda.getValor());
            moedas.remove(moeda);
        }
    }

    public int getQuantidadeMoeda(){
        return moedas.size();
    }

    public Moeda getMoeda(int indice){
        return moedas.get(indice);
    }

    public double calcularTotal(){
        return moedas.stream().mapToDouble(Moeda::getValor).sum();
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return "Total: R$ " + df.format(calcularTotal());
    }
}
