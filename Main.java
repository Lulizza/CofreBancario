public class Main {
    public static void main(String[] args) {

        Cofre cofrinho = new Cofre();

        Moeda umCentavo = new Moeda("umCentavo", 0.01d);
        Moeda cincoCentavos = new Moeda("cincoCentavos", 0.05d);
        Moeda dezCentavos = new Moeda("dezCentavos", 0.10d);
        Moeda vinteECincoCentavos = new Moeda("vinteECincoCentavos", 0.25d);
        Moeda cinquentaCentavos = new Moeda("cinquentaCentavos", 0.50d);
        Moeda umReal = new Moeda("umReal", 1.00d);

        cofrinho.adicionarMoeda(umReal);
        System.out.println(cofrinho);

        cofrinho.adicionarMoeda(cincoCentavos);
        System.out.println(cofrinho);

        cofrinho.adicionarMoeda(dezCentavos);
        System.out.println(cofrinho);

        cofrinho.adicionarMoeda(umReal);
        System.out.println(cofrinho);

        cofrinho.adicionarMoeda(umCentavo);
        System.out.println(cofrinho);

        cofrinho.excluirMoeda(cincoCentavos);
        System.out.println(cofrinho);

        cofrinho.adicionarMoeda(vinteECincoCentavos);
        System.out.println(cofrinho);

        cofrinho.adicionarMoeda(cincoCentavos);
        System.out.println(cofrinho);

        cofrinho.adicionarMoeda(cinquentaCentavos);
        System.out.println(cofrinho);

        cofrinho.excluirMoeda(dezCentavos);
        System.out.println(cofrinho);
    }
}
