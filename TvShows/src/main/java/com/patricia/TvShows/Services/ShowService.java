package com.patricia.TvShows.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patricia.TvShows.Models.Show;
import com.patricia.TvShows.Models.User;
import com.patricia.TvShows.Repositories.ShowRepository;

@Service
public class ShowService {
	private final ShowRepository showRepo;
	
		public ShowService(ShowRepository showRepo) {
			this.showRepo = showRepo;
		}
		
		public List<Show> getAllShows(){
			return this.showRepo.findAll();
		}
		
		public Show getOneShow(Long id) {
			return this.showRepo.findById(id).orElse(null);
		}
		
		public Show createShow(Show show) {
			return this.showRepo.save(show);
		}
		
		public Show editShow(Show show) {
			return this.showRepo.save(show);
		}
		
		public String deleteShow(Long id) {
			this.showRepo.deleteById(id);
			return "show has been deleted";
		}
		
		public void addUserToShow(User user, Show show) {
			show.setUser(user);
			this.showRepo.save(show);
		}
		
		public List<Show> findBY(Long id){
			return this.showRepo.findByUser_id(id);
		}
}
