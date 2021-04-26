package repositories;

import entities.Assosiation;
import entities.Movie;
import factory.EntityManagerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class MovieRepository {
    private static final EntityManager manager = EntityManagerFactory.getInstance();


    public void create(Movie movie){

        EntityTransaction transaction = null;
        try {

            transaction = manager.getTransaction();
            transaction.begin();
            manager.persist(movie);

            transaction.commit();



        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public Movie findById(int id){
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Movie movie = manager.find(Movie.class,id);
        transaction.commit();

        return movie;
    }
    public List<Movie> findByName(String name){
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        List<Movie> movies = manager.createNamedQuery("Movie.findByName").setParameter("title",name).getResultList();
        transaction.commit();

        return movies;


    }
}


