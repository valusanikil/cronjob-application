package org.example.ws.service;

import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import org.example.ws.model.Greeting;
import org.example.ws.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

@Service
public class GreetingServiceBean implements GreetingService{

	@Autowired
	private GreetingRepository greetingRepository;
	
	@Override
	public Collection<Greeting> findAll() {
		Collection<Greeting> greetings=greetingRepository.findAll();
		return greetings;
	}

	@Override
	@Cacheable(value="greetings", key="#id")
	public Greeting findOne(Long id) {
		Optional<Greeting> greeting=greetingRepository.findById(id);
		return null;
	}

	@Override
	@CachePut(value="greetings", key="#result.id")
	public Greeting create(Greeting greeting) {
		
		Greeting savedGreeting=greetingRepository.save(greeting);
		return savedGreeting;
	}

	@Override
	@CachePut(value="greetings", key="#greeting.id")
	public Greeting update(Greeting greeting) {
		Greeting greetingPersisted=greetingRepository.save(greeting);
		if(greetingPersisted==null) {
			//Cannot update greeting that hasn't been persisted
			return null;
		}
		Greeting updatedGreeting=greetingRepository.save(greeting);
		return updatedGreeting;
	}

	@Override
	@CacheEvict(value="greetings",key="#id")
	public void delete(Long id) {
		greetingRepository.deleteById(id);
	}
	
	@Override
	@CacheEvict(value="greetings",allEntries=true)
	public void evictCache() {
		
	}

}
