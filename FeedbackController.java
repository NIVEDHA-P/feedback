
package com.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.model.Feedback;
import com.feedback.service.FeedbackService;
@RestController
public class FeedbackController  {

	@Autowired
	private FeedbackService service;
	
	@PostMapping("/feedback")
	public Feedback createFeedback(@RequestBody Feedback feedback) {
		
		return service.createFeedback(feedback);
	}

	@PutMapping("/feedback")
	public Feedback updateFeedback(@RequestBody Feedback feedback) {
		
		return service.updateFeedback(feedback);
	}

	@GetMapping("/feedback/{userId}")
	public Feedback getFeedbackById(@PathVariable("userId")  int userId) {
		
		return service.getFeedbackById(userId);
	}
	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedbacks() {
		
		return service.getAllFeedbacks();
	}

	@GetMapping("/feedbacks/userName/{userName}")
	public List<Feedback> getFeedbacksByName(@PathVariable("userName") String userName) {
		
		return service.getFeedbacksByName(userName);
	}

	@DeleteMapping("/feedback/{userId}")
	public void deleteFeedbackById(@PathVariable("userId") int userId) {
		service.deleteFeedbackById(userId);
		
	}

}