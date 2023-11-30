package api_stream.classes;

import java.util.ArrayList;
import java.util.List;

public class CarList {

    public List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Corolla", "2020", "Red", "V6", 25000.0,
                new Salesman(102, "Emma", "Johnson", "emma@example.com", "2345678901", 32000.0,
                "SocialMedia", 28, "456 Elm St", false, 80),
                new BankEmployee(202, "Alice", "Johnson", "alice@example.com", "8765432109", 95000.0,
                "Banking", false, "Investment", true, "Office B", 7, new String[]{"English", "French"},
                "Finance Degree", true, "Branch ABC")));
        cars.add(new Car(2, "Honda", "Civic R-type", "2019", "Blue", "Inline-6", 62000.0,
                new Salesman(103, "James", "Williams", "james@example.com", "3456789012", 51000.0,
                "Marketing", 32, "789 Oak St", true, 120),
                new BankEmployee(203, "Bob", "Williams", "bob@example.com", "7654321098", 162000.0,
                "Accounts", true, "Accounting", true, "Office C", 4, new String[]{"English", "German"},
                "Accounting Degree", true, "Branch PQR")));
        cars.add(new Car(3, "Ford", "Mustang", "2021", "Yellow", "V8", 35000.0,
                new Salesman(104, "Sophia", "Brown", "sophia@example.com", "4567890123", 49000.0,
                "Hiring", 27, "890 Pine St", false, 90),
                new BankEmployee(204, "Eva", "Martinez", "eva@example.com", "6543210987", 29000.0,
                "Customer Service", false, "Customer Relations", true, "Office D", 6, new String[]{"English", "Spanish"},
                "Business Administration", true, "Branch DEF")));
        cars.add(new Car(4, "Chevrolet", "Camaro", "2018", "Black", "V6", 30000.0,
                new Salesman(105, "Liam", "Garcia", "liam@example.com", "5678901234", 53000.0,
                "Marketing", 29, "567 Cedar St", true, 110),
                new BankEmployee(205, "David", "Anderson", "david@example.com", "5432109876", 61000.0,
                "Banking", true, "Mortgages", false, "Office E", 8, new String[]{"English", "Chinese"},
                "Economics", true, "Branch GHI")));
        cars.add(new Car(5, "BMW", "3 Series", "2022", "White", "Inline-6", 40000.0,
                new Salesman(106, "Olivia", "Martinez", "olivia@example.com", "6789012345", 48000.0,
                "Sales", 31, "678 Maple St", false, 85),
                new BankEmployee(206, "Sophia", "Lee", "sophia@example.com", "4321098765", 13000.0,
                "Banking", true, "Investment", true, "Office F", 5, new String[]{"English", "Korean"},
                "Finance Degree", true, "Branch JKL")));
        cars.add(new Car(6, "Mercedes-Benz", "C-Class", "2017", "Silver", "V6", 32000.0,
                new Salesman(107, "Noah", "Lopez", "noah@example.com", "7890123456", 54000.0,
                "Marketing", 26, "789 Birch St", true, 105),
                new BankEmployee(207, "William", "Garcia", "william@example.com", "3210987654", 20000.0,
                "Accounts", false, "Accounting", true, "Office G", 3, new String[]{"English", "Spanish"},
                "Accounting Degree", true, "Branch MNO")));
        cars.add(new Car(7, "Audi", "S6", "2020", "Gray", "Inline-6", 95000.0,
                new Salesman(108, "Ava", "Lee", "ava@example.com", "8901234567", 52000.0,
                "SocialMedia", 30, "890 Ash St", false, 95),
                new BankEmployee(208, "Olivia", "Lopez", "olivia@example.com", "2109876543", 58000.0,
                "Customer Service", true, "Customer Relations", true, "Office H", 7, new String[]{"English", "French"},
                "Business Administration", true, "Branch STU")));
        cars.add(new Car(9, "Hyundai", "Elantra", "2019", "Red", "Inline-4", 20000.0,
                new Salesman(109, "William", "Taylor", "william@example.com", "9012345678", 30000.0,
                "Sales", 33, "901 Walnut St", true, 115),
                new BankEmployee(210, "Emily", "Brown", "emily@example.com", "0987654321", 59000.0,
                "Banking", false, "Investment", true, "Office J", 6, new String[]{"English", "German"},
                "Finance Degree", true, "Branch YZA")));
        cars.add(new Car(10, "Kia", "Sorento", "2021", "Blue", "V6", 28000.0,
                new Salesman(110, "Isabella", "Wilson", "isabella@example.com", "0123456789", 49000.0,
                "SocialMedia", 28, "012 Pineapple St", false, 88),
                new BankEmployee(210, "Emily", "Brown", "emily@example.com", "0987654321", 29000.0,
                "Banking", false, "Investment", true, "Office J", 6, new String[]{"English", "German"},
                "Finance Degree", true, "Branch YZA")));
        cars.add(new Car(11, "Toyota", "Camry", "2022", "Silver", "V4", 32000.0,
                new Salesman(111, "Ethan", "Rodriguez", "ethan@example.com", "9876543210", 31000.0,
                        "Design", 32, "987 Orange St", true, 125),
                new BankEmployee(211, "Daniel", "Taylor", "daniel@example.com", "9876543210", 60000.0,
                        "Accounts", true, "Accounting", false, "Office K", 4, new String[]{"English", "Spanish"},
                        "Accounting Degree", true, "Branch BCD")));

        cars.add(new Car(12, "Honda", "CR-V", "2020", "White", "Hybrid", 30000.0,
                new Salesman(112, "Mia", "Jones", "mia@example.com", "2345678901", 55000.0,
                        "Sales", 29, "345 Oak St", true, 95),
                new BankEmployee(212, "Andrew", "Clark", "andrew@example.com", "9876543210", 82000.0,
                        "Banking", true, "Finance", true, "Office K", 7, new String[]{"English", "Spanish"},
                        "MBA", true, "Branch ZZA")));

        cars.add(new Car(13, "Chevrolet", "Camaro", "2023", "Black", "V8", 38000.0,
                new Salesman(113, "Liam", "Garcia", "liam@example.com", "5678901234", 53000.0,
                        "Hiring", 29, "567 Cedar St", true, 110),
                new BankEmployee(213, "Sophia", "Lee", "sophia@example.com", "4321098765", 33500.0,
                        "Banking", true, "Investment", true, "Office F", 5, new String[]{"English", "Korean"},
                        "Finance Degree", true, "Branch JKL")));

        cars.add(new Car(14, "Ford", "Escape", "2022", "Red", "V6", 33000.0,
                new Salesman(114, "Marga", "Lopez", "marglo@example.com", "6783012345", 40000.0,
                        "Design", 40, "555 Maple St", false, 85),
                new BankEmployee(214, "William", "Garcia", "william@example.com", "3210987654", 10000.0,
                        "Accounts", false, "Accounting", true, "Office G", 3, new String[]{"English", "Spanish"},
                        "Accounting Degree", true, "Branch MNO")));

        cars.add(new Car(15, "Honda", "Accord", "2023", "Silver", "V4", 32000.0,
                new Salesman(115, "Sophia", "Brown", "sophia@example.com", "4567890123", 249000.0,
                        "Design", 27, "890 Pine St", false, 90),
                new BankEmployee(215, "David", "Anderson", "david@example.com", "5432109876", 61000.0,
                        "Banking", true, "Mortgages", false, "Office E", 8, new String[]{"English", "Chinese"},
                        "Economics", true, "Branch GHI")));

        cars.add(new Car(16, "Chevrolet", "Equinox", "2023", "White", "V6", 38000.0,
                new Salesman(117, "Noah", "Lopez", "noah@example.com", "7890123456", 54000.0,
                        "SocialMedia", 26, "789 Birch St", true, 105),
                new BankEmployee(217, "Emma", "Johnson", "emma@example.com", "8765432109", 65000.0,
                        "Banking", false, "Investment", true, "Office B", 7, new String[]{"English", "French"},
                        "Finance Degree", true, "Branch ABC")));

        cars.add(new Car(17, "Ford", "Explorer", "2022", "Blue", "V6", 36000.0,
                new Salesman(118, "James", "Williams", "james@example.com", "3456789012", 51000.0,
                        "Sales", 32, "789 Oak St", true, 120),
                new BankEmployee(218, "Alice", "Johnson", "alice@example.com", "8765432109", 65000.0,
                        "Banking", false, "Investment", true, "Office B", 7, new String[]{"English", "French"},
                        "Finance Degree", true, "Branch ABC")));

        cars.add(new Car(18, "Audi", "Q5", "2023", "Gray", "V6", 42000.0,
                new Salesman(119, "William", "Garcia", "william@example.com", "9012345678", 40000.0,
                        "RRHH", 33, "901 Walnut St", true, 115),
                new BankEmployee(219, "Sophia", "Martinez", "sophia@example.com", "6543210987", 59000.0,
                        "Customer Service", false, "Customer Relations", true, "Office D", 6, new String[]{"English", "Spanish"},
                        "Business Administration", true, "Branch DEF")));
        cars.add(new Car(19, "BMW", "X3", "2022", "White", "V6", 45000.0,
                new Salesman(120, "Olivia", "Martinez", "olivia@example.com", "6789012345", 38000.0,
                        "Hiring", 31, "678 Maple St", false, 85),
                new BankEmployee(220, "Daniel", "Taylor", "daniel@example.com", "9876543210", 20000.0,
                        "Accounts", true, "Accounting", false, "Office K", 4, new String[]{"English", "Spanish"},
                        "Accounting Degree", true, "Branch BCD")));

        cars.add(new Car(20, "Mercedes", "GLC", "2023", "Black", "V6", 48000.0,
                new Salesman(121, "Isabella", "Wilson", "isabella@example.com", "0123456789", 49000.0,
                        "RRHH", 28, "012 Pineapple St", false, 88),
                new BankEmployee(221, "Emily", "Brown", "emily@example.com", "0987654321", 39000.0,
                        "Banking", false, "Investment", true, "Office J", 6, new String[]{"English", "German"},
                        "Finance Degree", true, "Branch YZA")));
        return cars;
    }
}
