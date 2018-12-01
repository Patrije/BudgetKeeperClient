package client.clientt;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class RestClientService {

	private final RestTemplate restTemplate;
	
	private final String GET_ALL_EMPL_URL="http://localhost:808/employees";
	
	@Autowired
	public RestClientService(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	public List<Employee> findAllEmployees(){
		return Arrays.stream(restTemplate.getForObject(GET_ALL_EMPL_URL, Employee[].class)).collect(Collectors.toList());
	}
	
}