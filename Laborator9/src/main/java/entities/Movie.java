package entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Table(name="movies", schema="laborator8")
@Entity
@NamedQueries({
        @NamedQuery(name = "Movie.findByName",
                query = "SELECT m FROM Movie m WHERE m.title=:title")})

public class Movie implements Serializable {
    @Id

    @Column(name = "id")
    private int id;


    private String title;


    private String release_date;

    private int duration;

    private int score;

    public Movie(int id, String title, String release_date, int duration, int score) {
        this.id = id;
        this.title = title;
        this.release_date = release_date;
        this.duration = duration;
        this.score = score;
    }

    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", release_date='" + release_date + '\'' +
                ", duration=" + duration +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id && duration == movie.duration && score == movie.score && Objects.equals(title, movie.title) && Objects.equals(release_date, movie.release_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, release_date, duration, score);
    }
}
