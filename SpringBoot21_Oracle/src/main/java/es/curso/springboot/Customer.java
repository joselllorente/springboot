package es.curso.springboot;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Customer {

	// "customer_seq" is Oracle sequence name.
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
    Long id;

    private String name;

    private String email;

    @Column(name = "CREATED_DATE")
    private Date date;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Customer(String name, String email, Date date) {
		super();
		this.name = name;
		this.email = email;
		this.date = date;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", date=" + date + "]";
	}

	
    
}