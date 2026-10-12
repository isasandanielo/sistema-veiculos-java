public class Veiculo{
    private String marca;
    private String modelo;
    private int ano;
    private String placa;

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        if(marca == null|| modelo.isEmpty()){
            System.out.println("Invalido");
            return;
        }
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        if(modelo == null || marca.isEmpty()){
            System.out.println("Invalido");
            return;
        }
        this.modelo = modelo;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        if(ano > 0){
            System.out.println("Invalido");
            return;
        }
        this.ano = ano;
    }
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa) {
        if(placa == null || placa.isEmpty()){
            System.out.println("Invalido");
            return;
        }
        this.placa = placa;
    }
 
    public Veiculo(String marca, String modelo, int ano, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }
    public void buzinar(){
        System.out.println("Buzina padão de veículo");
    }
    public void exibirInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
    }
}