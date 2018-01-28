package com.kjetillorentzen.CoreAnalysisToolbox.dao;

import com.kjetillorentzen.CoreAnalysisToolbox.model.Core;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CoreDaoImpl implements CoreDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<Core> findAll() {
        //Open a session
        Session session = sessionFactory.openSession();

        //Get all Cores with a Hibernate criteria
        /*TODO - KL: Update code from deprecated Hibernate Criteria*/
        List<Core> cores = session.createCriteria(Core.class).list();

        //Close session

        return cores;
    }

    @Override
    public Core findById(Long id) {
        //TODO -KL: Implement findById Dao
        return null;
    }

    @Override
    public void save(Core core) {
        //Open a session
        Session session = sessionFactory.openSession();

        //Begin Transaction
        session.beginTransaction();

        //Save the Core
        session.saveOrUpdate(core);

        //Commit the transaction
        session.getTransaction().commit();

        //Close the session
        session.close();
    }

    @Override
    public void delete(Core core) {
//TODO -KL: Implement Delete DAO
    }
}
