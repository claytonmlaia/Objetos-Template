package br.com.versatil.objeto.bean;
import br.com.versatil.objeto.modelo.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name="carroBean")
@SessionScoped
public class CarroBean {
    // VARIAVEIS E ATRIBUTOS DA CLASSE CARRO CRIADA ANTERIORMENTE
    private Carro carro = new Carro();
    private List<Carro> carros = new ArrayList<Carro>();
    // CRIAR O METODO ADICIONAR CARRO
    public void adicionar(){
        carros.add(carro);
        carro = new Carro();
    }
    //METODOS GETTER E SETTER
    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    public List<Carro> getCarros() {
        return carros;
    }
    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
