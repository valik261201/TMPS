package cars;

public class Car {

        private static Car car;
        public static String manufacturer = new String();

        private Car(){}

        public static Car getCar() {
            if (car == null) {
                car = new Car();
            }
            return car;
        }

        public void addCarToList(String car){
            manufacturer = car;
        }

        public String getManufacturers(){
            return manufacturer;
        }
}