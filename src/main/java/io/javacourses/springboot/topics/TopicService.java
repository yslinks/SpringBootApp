package io.javacourses.springboot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import ch.qos.logback.core.net.SyslogOutputStream;

@Service
public class TopicService {
	
	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic ("FSD", "Full stack developer","fullstack developer with html css"),
			new Topic ("Java", "Core Java","Jav developer with html css"),
			new Topic ("Spring", "Spring boot developer","fullstack developer with SpringBoot")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}

	public  Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		//return new Topic("Jas","as","as");
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updatTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		//System.out.println("update method");
		topics.stream().filter(x -> x.getId().equals(id)).findFirst().ifPresent(x -> topics.set(id.indexOf(id), topic));;
		
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		//System.out.println("Delete method");
		topics.removeIf(x -> x.getId().equals(id));
		//topics.stream().filter(x -> x.getId().equals(id)).findFirst().ifPresent(x -> topics.remove(id.indexOf(id)));
		
	}
	
	
}
