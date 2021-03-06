package com.roxoft.trainingteamone.daoImpl;

import com.roxoft.trainingteamone.dao.CarDao;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.Car;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Esenin on 15.10.2017.
 */
public class CarDaoImpl implements CarDao{

    final static String namespace = "carMapper";

    public void createCar(Car car) {

        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(namespace + ".createCar", car);
        sqlSession.close();
    }

    public Car getCarById(long id) {

        SqlSession sqlSession = SessionFactory.getSession();
        Car car = sqlSession.selectOne(namespace + ".getCarById", id);
        sqlSession.close();
        return car;
    }

    public List<Car> getAllCars() {

        SqlSession sqlSession = SessionFactory.getSession();
        List<Car> cars = sqlSession.selectList(namespace + ".getAllCars");
        sqlSession.close();
        return cars;
    }

    public void updateCar(Car car) {

        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.update(namespace + ".updateCar", car);
        sqlSession.commit();
        sqlSession.close();
    }

    public void deleteCar(long id) {

        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.delete(namespace + ".deleteCar", id);
        sqlSession.commit();
        sqlSession.close();

    }
}
