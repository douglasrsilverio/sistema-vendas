package sistemavendasgenerico;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean(name = "helloWorld")
@SessionScoped
public class HelloWorld {
	private String firstName = "John";
	private String lastName = "Doe";

	public HelloWorld() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String showGreeting() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		// provavelmente isso deveria estar na classe caminhão como um set e get
		// Insert

		Caminhao caminhao = new Caminhao(null, "ZBX-143", "SCANIA");

		em.getTransaction().begin();
		em.persist(caminhao);
		em.getTransaction().commit();

		// select

		List caminhoes = em.createQuery("FROM " + Caminhao.class.getName()).getResultList();
		System.out.println("teste");
		
		return "Hello " + firstName + " " + lastName + "!";
	}
}
