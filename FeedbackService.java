package com.feedback.service;
import java.util.List;
import com.feedback.model.Feedback;


public interface FeedbackService {
	public Feedback createFeedback(Feedback feedback);
	public Feedback updateFeedback(Feedback feedback);
	public Feedback getFeedbackById(int userId);
	public List<Feedback> getAllFeedbacks();
	public List<Feedback> getFeedbacksByName(String userName);
	public void deleteFeedbackById(int userId);
	

}
