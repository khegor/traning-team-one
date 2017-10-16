import com.roxoft.trainingteamone.dao.AutobusDao;
import com.roxoft.trainingteamone.daoImpl.RoadDaoImpl;
import com.roxoft.trainingteamone.models.*;
import com.roxoft.trainingteamone.services.*;
import org.apache.log4j.BasicConfigurator;

import java.util.List;

/**
 * Created by Esenin on 02.09.2017.
 */
public class MainClass {
    public static void main(String args[]){

        BasicConfigurator.configure();

//        AutobusService autobusService = new AutobusService();
//        Autobus autobus = new Autobus();
//        AdditionalInformation additionalInformation = new AdditionalInformation();
//        additionalInformation.setType(Type.PUBLIC);
//        autobus.setModel("MAZ");
//        autobus.setMaxWeight(20);
//        autobus.setPunchType("manual");
//        autobus.setAdditionalInformation(additionalInformation);
//        autobusService.createAutobus(autobus);
//        System.out.println(autobus.getId() + " " + additionalInformation.getId());

//        AutobusService autobusService = new AutobusService();
//        List<Autobus> autobuses= autobusService.getAllAutobuses();
//        for(Autobus a : autobuses){
//            System.out.println(a.getModel() + " " + a.getAdditionalInformation().getType());
//        }

//        AutobusService autobusService = new AutobusService();
//        Autobus autobus = new Autobus();
//        AdditionalInformation additionalInformation = new AdditionalInformation();
//        additionalInformation.setType(Type.PUBLIC);
//        autobus = autobusService.getAutobusById(1);
//        autobus.setModel("Jaguar");
//        autobusService.updateAutobus(autobus);
//        System.out.println(autobus.getModel());

//        AutobusService autobusService = new AutobusService();
//        autobusService.deleteAutobus(1);



//        AdditionalInformationService additionalInformationService = new AdditionalInformationService();
//        AdditionalInformation additionalInformation = additionalInformationService.getAdditionalInformationById(2);
//        System.out.println(additionalInformation.getType());

//       BikeService bikeService = new BikeService();
//       bikeService.deleteBike(2);


        CarService carService = new CarService();
        Car car = carService.getCarById(1);
        System.out.println(car.getModel());

    }
}
