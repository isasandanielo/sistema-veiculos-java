public class CarroEletrico extends Veiculo{
    private double capacidadeBateriaKwh;

    public double getCapacidadeBateriaKwh(){
        return capacidadeBateriaKwh;
    }
    public void setCapacidadeBateriaKwh(double capacidadeBateriaKwh){
        this.capacidadeBateriaKwh = capacidadeBateriaKwh;
    }
    public CarroEletrico(String marca, String modelo, int ano, String placa,
                     double capacidadeBateriaKwh) {
    super(marca, modelo, ano, placa);
    this.capacidadeBateriaKwh = capacidadeBateriaKwh;
    }
    @Override
    public void buzinar(){
        System.out.println("Buzina silenciosa/alerta sonoro de pedestres");
    }
    @Override 
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Capacidade da bateria: " + capacidadeBateriaKwh);
    }
}
