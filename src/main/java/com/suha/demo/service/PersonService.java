package com.suha.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.suha.demo.entities.Person;

@Service
public class PersonService {
	
	private List<Person> persons = Arrays.asList(
			new Person("dawood","suhana","Saint Louis","United States"),
			new Person("guraka","haribabu","Saint Louis", "United States")
			);
	
	public List<Person> getAllPersons()
	{
		return persons;
	}
	
	
	public Person getPerson(String lastName)
	{
		return persons.stream().filter(p->p.getFirstName().equals(lastName))
				.findFirst().get();
	}
	
	public void addPerson(Person person)
	{
		persons.add(person);
	}
	
}
