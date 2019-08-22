import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;

public class Carro{
//atributos
private double velocidade;
private String marca;

//metodos

public void acelerar(double incremento){
    this.velocidade = this.velocidade + incremento;
}

public void frear(double decremento){
    this.velocidade = this.velocidade - decremento;
}

public void setMarca(String nome){
    this.marca = nome;
}
public String getMarca(){
    return this.marca;
}

public void setVelocidade(double vel){
    this.velocidade = vel;
}

public double getVelocidade(){
    return this.velocidade;
}
}