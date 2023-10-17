package hw2.main;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// проверка тоого, что объект Car является экземпляром базового класа Vehicle
class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Ford", "Maverick", 2005);
        assertTrue(car instanceof Vehicle);
    }

    // проверка того, что объект Car создается с 4-мя колесами
    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Ford", "Maverick", 2005);
        assertEquals(car.getNumWheels(), 4);
    }

    // проверка того, что объект Motorcycle создается с 2-мя колесами
    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Chopper", 2007);
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    // проверка того, что объект Car развивает скорость 60 в режиме тестового вождения
    @Test
    public void testCarSpeed() {
        Car car = new Car("Ford", "Maverick", 2005);
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    // проверка того, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Chopper", 2007);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    // проверка того, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается
    @Test
    public void testCarPark() {
        Car car = new Car("Ford", "Maverick", 2005);
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    // проверка того, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается
    @Test
    public void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Chopper", 2007);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}