package study.Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import study.Dao.ZoomDao;
import study.Pojo.MeetingResponsePojo;
import study.Pojo.ZoomMeetingResponsePojo;
import study.services.TokenServiceImpl;

@Controller
@RequestMapping("/admin")
public class ZoomController {

	@Autowired
	ZoomDao dao;

	@Autowired
	TokenServiceImpl tokenService;

	@GetMapping("/listmeeting")
	public ModelAndView showbyname1() throws JsonMappingException, JsonProcessingException {
		ModelAndView mv = new ModelAndView();

		HashMap<String, String> hmap = tokenService.getToken();
		String status=hmap.get("status");
		String Token=hmap.get("Token");
		
		
		ZoomMeetingResponsePojo meeting=null;
		try {
			meeting= dao.getMettings(Token);
		} catch (JsonMappingException e) {
		
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		
		List<MeetingResponsePojo> list = meeting.getMeetings();
		
		
		if(status.equals("sucess"))
		{
			mv.addObject("status","sucess");
			mv.addObject("meeting_details",list);
		}
		else {
			mv.addObject("status","error");
			mv.addObject("meeting_details","Token expired...refresh token");
		}
		mv.setViewName("meeting");
		return mv;
		
		

	}

}
