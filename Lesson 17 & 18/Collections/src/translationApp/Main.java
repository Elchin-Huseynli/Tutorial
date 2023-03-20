package translationApp;

import translationApp.service.ManagementService;

public class Main {
    public static void main(String[] args) {
        ManagementService managementService = new ManagementService();
        managementService.get();
    }
}
