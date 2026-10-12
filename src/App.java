public class App {
    public static void main(String[] args) throws Exception {
        
        CarroCombustivel c1 = new CarroCombustivel("VW", "Polo", 2019, "EVO9B58", 999, true);
        c1.exibirFichaTecnica();
        c1.buzinar();

        CarroEletrico c2 = new CarroEletrico("BYD", "Song Pro", 2026, "ABC1234", 26.6);
        c2.buzinar();
        c2.exibirInfo();
        
        Veiculo[] frota = new Veiculo[3];
        frota[0] = new Veiculo("VW", "Polo", 2019, "EVO9B58");
        frota[1] = new CarroEletrico("BYD", "Song Pro", 2025, "ABC1234", 26.6);
        frota[2] = new CarroCombustivel("Fiat", "Uno", 2010, "XYZ9K88", 1000, false);

        for(Veiculo v : frota){
            v.buzinar();
        }
    }

}
