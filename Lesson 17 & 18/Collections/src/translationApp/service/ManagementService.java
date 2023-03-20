package translationApp.service;

import static translationApp.util.MenuUtil.*;

public class ManagementService {
    public  void get() {
        MapService mapService = new MapService();
        while (true) {
            byte option = entry();
            switch (option) {
                case 1:
                    mapService.translationAzToEn();
                    break;
                case 2:
                    mapService.translationEnToAz();
                    break;
                case 3:
                    System.out.println("Good bye!");
                    System.exit(-1);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
