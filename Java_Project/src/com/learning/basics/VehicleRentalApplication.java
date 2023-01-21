package com.learning.basics;


import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class VehicleRentalApplication {



    enum VehicleType{
        CAR, TRUCK, VAN, MOTORCYCLE
    }

    enum ReservationStatus{
        BOOKED, WAITING
    }

    enum VehicleConditon{
        SERVICING, ACCIDENT, OIL_CHANGE, OTHER
    }

    enum PaymentStatus {
        UNPAID, PENDING, PAID, CANCELLED, FAILED
    }

    enum AccountStatus{
        ACTIVE, INACTIVE
    }

    enum RentalInsurance{
        MONTH, WEEK, YEAR
    }

    enum Equipments{
        CHILD_SEAT, NAVIGATION, SKI_RACK
    }



    abstract class Person{
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNo;
        private Address address;
    }

    class Address{
        private String street;
        private String state;
        private String country;
        private int zipcode;
    }

    abstract class Account{
        private int id;
        private String userName;
        private AccountStatus accountStatus;
        private Person person;

        abstract public boolean resetPassword();
    }

    class AdditionalDriver extends Person{
        private String licenseNumber;
        private int driverId;
    }

    class Member extends Account{
        private int totalBookings;
        private VehicleReservation vehicleReservation;
        Search searchTheVehicle;

        public List<VehicleReservation> getAllTheBookings(){return null;}


        public boolean resetPassword() {return false;}
    }

    class Vehicle{
        private String nameOfVehicle;
        private String vehicleNumber;
        private VehicleConditon vehicleStatus;
        private String barCode;
        private VehicleType vehicleType;
    }

    class VehicleLog{
        private Vehicle vehicle;
        private String description;
    }

    class VehicleReservation {
        private int reservationId;
        private Member bookedBy;
        private ReservationStatus reservationStatus;
        private Date dateOfBooking;
        private Date dateOfReturning;
        private Date dueDate;
        private VehicleLocation vehicleBookedLocation;
        private VehicleLocation vehicleReturnedLocation;
        private List<VehicleLog> vehicleCondition;
        private List<RentalInsurance> rentalInsurance;
        private Bill bill;

        private VehicleReservation getTheReservationDetail(int reservationId) {return null;}
        private boolean cancelReservation(int reservationId) {return false;}
        private boolean returnVehicle(int reservationId) {return false;}
        private boolean bookVehicle(Vehicle vehicle) {return false;}
        private List<AdditionalDriver> additionalDrivers;
        private List<Equipments> equipments;

    }

    class Bill{
        private int billNo;
        private VehicleReservation vehicleReservation;
        private Date dateOfGeneration;
        private int totalAmount;
        private PaymentStatus paymentStatus;
    }


    class VehicleLocation {
        private String name;
        private int parkingSlotNo;
        private Address location;
        private Address getLocation(){return null;}
    }


    class System{
        public Bill calculateTheAmount(int reservationId) {return null;}
        public Member vehicleLocator(String vehicleNumber) {return null;}
        public List<Vehicle> numberOfVehicleReservedByMember(Member member){return null;}
        public boolean sendNotification() {return false;}
    }


    interface Search {
        public List<Vehicle> searchByType(VehicleType type);
        public List<Vehicle> searchByModel(String model);
    }

    class VehicleInventory implements Search {
        private HashMap<String, List<Vehicle>> vehicleTypes;
        private HashMap<String, List<Vehicle>> vehicleModels;

        public List<Vehicle> searchByType(VehicleType vehicleType) {
            return vehicleTypes.get(vehicleType);
        }

        public List<Vehicle> searchByModel(String query) {
            return vehicleModels.get(query);
        }
    }
}
