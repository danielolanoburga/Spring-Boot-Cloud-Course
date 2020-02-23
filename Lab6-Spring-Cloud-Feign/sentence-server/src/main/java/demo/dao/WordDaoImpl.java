package demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.client.RestTemplate;

import demo.domain.Word;

public abstract class WordDaoImpl implements WordDao {

	@Autowired
	LoadBalancerClient loadBalancer;

	public abstract String getPartOfSpeech();

	public Word getWord() {
		String serviceId = getPartOfSpeech();
		System.out.println("[WordDaoImpl][getWord] serviceId: " + serviceId);
		ServiceInstance instance = loadBalancer.choose(serviceId);
		return (new RestTemplate()).getForObject(instance.getUri(), Word.class);
	}

}
