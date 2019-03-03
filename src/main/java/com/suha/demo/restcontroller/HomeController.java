package com.suha.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suha.demo.entities.Person;
import com.suha.demo.service.PersonService;

@RestController
public class HomeController {
	
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/persons")
	public List<Person> getAllPerson()
	{
		return 	personService.getAllPersons();
				
	}
	
	@RequestMapping("/persons/{lastName}")
	public Person getPerson(@PathVariable String lastName)
	{
		return personService.getPerson(lastName);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/persons")
	public void addPerson(@RequestBody Person person)
	{
		 personService.addPerson(person);
	}
	
	/*public void updatePerson(String lastName, Person person)
	{
		for(int i=0; i<person.size(); i++)
		{
			
		}
	}
*/}
