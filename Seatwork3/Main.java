package Seatwork3;
import java.util.List;
import Seatwork3.SchoolManagementApp;

public class Main {
    public static void main(String[] args) {
        List<SchoolManagementApp> integratedSystems = List.of(
                new AttendanceSystemAdapter(new AttendanceSystem()),
                new GradingSystemAdapter(new GradingSystem()),
                new LibrarySystemAdapter(new LibrarySystem())
        );

        for (SchoolManagementApp system : integratedSystems) {
            system.integrateSystem();
        }
    }
}