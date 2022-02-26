package study.Dao;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import study.Pojo.ZoomMeetingResponsePojo;

@Service
public class ZoomDao {

	public ZoomMeetingResponsePojo getMettings(String token) throws JsonMappingException, JsonProcessingException {

		String url = "https://api.zoom.us/v2/users/me/meetings";
		RestTemplate restTemplate = new RestTemplate();
		// Use the access token for authentication
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + token);
		HttpEntity<String> entity = new HttpEntity<>(headers);

		ResponseEntity<ZoomMeetingResponsePojo> zoomData = restTemplate.exchange(url, HttpMethod.GET, entity,
				ZoomMeetingResponsePojo.class);
		//System.out.println(zoomData.getBody());

		return zoomData.getBody();

	}

}
