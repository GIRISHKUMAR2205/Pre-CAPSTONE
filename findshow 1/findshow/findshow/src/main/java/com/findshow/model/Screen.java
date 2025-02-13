package com.findshow.model;

import jakarta.persistence.*;
import java.util.List;

// Screens POJO class
@Entity
@Table(name = "screens")
public class Screen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "screen_id")
    private int screenId;

    @Column(name = "screen_number", nullable = false)
    private int screenNumber;
    @Column(name ="screen_capacity", nullable = false)
    private int screenCapacity;
    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private Theatre theatre;

    @OneToMany(mappedBy = "screen")
    private List<Seat> seats;

    @OneToMany(mappedBy = "screen")
    private List<Show> shows;

    // Getters and Setters
    public int getTheatreId() {
        return theatre != null ? theatre.getTheatreId() : 0; 
    }

    public void setTheatreId(int theatreId) {
        if (this.theatre != null) {
            this.theatre.setTheatreId(theatreId); 
        }
    }
    
    
    
    
    
    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(int screenNumber) {
        this.screenNumber = screenNumber;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

	public int getScreenCapacity() {
		return screenCapacity;
	}

	public void setScreenCapacity(int screenCapacity) {
		this.screenCapacity = screenCapacity;
	}
}
