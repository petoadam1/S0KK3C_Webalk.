package hu.iit.webalk.database.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import hu.iit.webalk.database.repository.People;
import hu.iit.webalk.database.repository.PeopleRepository;

@Service
public class PeopleServiceImpl implements PeopleService {

	private final PeopleRepository peopleRepository;

	public PeopleServiceImpl(PeopleRepository peopleRepository) {
		this.peopleRepository = peopleRepository;
	}
	
	public People create(People people) {
		
		hu.iit.webalk.database.repository.People peopleDb = new hu.iit.webalk.database.repository.People();
		peopleDb.setAge(people.getAge());
		peopleDb.setName(people.getName());
		
		
		return peopleRepository.save(new hu.iit.webalk.database.repository.People());
	}


	public Iterable<People> getAllPeople() {

		Iterable<People> rv = new ArrayList<>();

		for (hu.iit.webalk.database.repository.People people : peopleRepository.findAll()) {
			this.rv.add(new People(people));
		}

		return rv;
	}

}
