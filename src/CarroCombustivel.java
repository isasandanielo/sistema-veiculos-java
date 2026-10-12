public class CarroCombustivel extends Veiculo{
    private boolean temTurbo;
    private int cilidradas;
    
    public boolean getTemturbo(){
        return temTurbo;
    }
    public void setTemturbo(boolean temTurbo){
        this.temTurbo = temTurbo;
    }
    public int getCilidradas(){
        return cilidradas;
    }
    public void setCilidradas(int cilidradas){
        this.cilidradas = cilidradas;
    }
    public CarroCombustivel(String marca, String modelo, int ano, String placa, int cilidradas, boolean temTurbo){
        super(marca, modelo, ano, placa);
        this.cilidradas = cilidradas;
        this.temTurbo = temTurbo;
    }

    public void exibirFichaTecnica(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Ano: " + getAno());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Cilindradas: " + cilidradas);
        System.out.println("Tem turbo? " + temTurbo);
    }
}
