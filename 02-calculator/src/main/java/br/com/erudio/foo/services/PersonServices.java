package br.com.erudio.foo.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.foo.model.Person;

@Service
public class PersonServices {

	//gera um id para o banco de dados automaticamente
	private final AtomicLong counter = new AtomicLong();
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	public void delete(String id) {
		// add persistencia
	}
	
	public Person findById(String id) {
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Leandro");
		person.setLastName("Costa");
		person.setAddress("Uberlandia - Minas Gerais - Brasil");
		person.setGender("Male");
		
		return person;
	}
	
	public List<Person> findAll(){
		List<Person> persons = new ArrayList<Person>();
		
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Leandro" + i);
		person.setLastName("Costa" + i);
		person.setAddress("Some adress in Brasil" + i);
		person.setGender("Male");
		
		return person;
	}
}
