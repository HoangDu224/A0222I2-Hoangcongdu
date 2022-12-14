package codegym.vn.repository;

import codegym.vn.bean.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void create(User user){
        entityManager.persist(user);
    }

    public List findAll(){
        return entityManager.createQuery("select u from User u").getResultList();
    }

    public void updateLove(User user){
        entityManager.merge(user);
    }

    public User findById(int Id){
        return entityManager.find(User.class, Id);
    }
}
