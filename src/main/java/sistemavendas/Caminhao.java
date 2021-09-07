package sistemavendas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Caminhao {

	 public Caminhao() {}
	 
	 Caminhao(Integer id, String placa, String marca){
	        this.id = id;
	        this.placa = placa;
	        this.marca = marca;
	 }
	    
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 
	 private String placa;

	 private String marca;
	
}
