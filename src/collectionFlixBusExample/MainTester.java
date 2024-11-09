package collectionFlixBusExample;

import java.util.*;


/* Задача: засетать билети, сопоставить обьекти нашей колекции и коллекции flix bus. И вернуть билет для пасажира коректно.
Свободная расскадка мест.
 */

public class MainTester {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("F1", "L1", "22", "71278787", null);
        Passenger passenger2 = new Passenger("F2", "L2", "24", "57845547", null);
        Passenger passenger3 = new Passenger("F3", "L3", "18", "17874587", null);

        FlixBusPassenger flixBusPassenger1 = new FlixBusPassenger("F1", "L1", "22", "71278787", "11");
        FlixBusPassenger flixBusPassenger2 = new FlixBusPassenger("F2", "L2", "24", "71278787", "12");
        FlixBusPassenger flixBusPassenger3 = new FlixBusPassenger("F3", "L3", "18", "71278787", "19");

        List<Passenger> passengersList = new ArrayList<>();
        passengersList.add(passenger1);
        passengersList.add(passenger2);
        passengersList.add(passenger3);

        List<FlixBusPassenger> flixBusPassengerList = new ArrayList<>();
        flixBusPassengerList.add(flixBusPassenger1);
        flixBusPassengerList.add(flixBusPassenger2);
        flixBusPassengerList.add(flixBusPassenger3);

        // 1 способ засетать билет пасажирам
        /* for (Passenger passenger : passengersList) {
            for (FlixBusPassenger flixBusPassenger : flixBusPassengerList) {
                if (flixBusPassenger.getFirstName().equals(passenger.getFirstName()) &&
                        flixBusPassenger.getLastName().equals(passenger.getLastName())) {
                    passenger.setNumberTicket(flixBusPassenger.getTicketNumber());
                }
            }
        }
        System.out.println(passengersList);
         */

//2 способ перебрать пасажиров с помощью итератора, так как ми можем только с ним
// удалять пасажиров с коллекции, в случае если на фамилию пасажира билет уже продан, нужно удалить из колекции пасажира с билетом
// чтоб не допустить дубля


        /* for (Passenger passenger : passengersList) {
            Iterator<FlixBusPassenger> iter = flixBusPassengerList.iterator();
            while (iter.hasNext()) {
                FlixBusPassenger flixBusPassenger = iter.next();
                if (flixBusPassenger.getFirstName().equals(passenger.getFirstName()) &&
                        flixBusPassenger.getLastName().equals(passenger.getLastName())) {

                    passenger.setNumberTicket(flixBusPassenger.getTicketNumber());
                    iter.remove();
                    break;
                }
            }
        }
         */

        //Вариант: Найти пассажира по номеру билета, key - номер билета. 1 раз перебрали, создали мапу,
        // и по ключу достаем нужний обьект, и пересечиваем из него значения.

        Map<String, FlixBusPassenger> flixBusPassengerMap = new HashMap<>();
        for (FlixBusPassenger flixBusPassenger : flixBusPassengerList) {
            flixBusPassengerMap.put(flixBusPassenger.getTicketNumber(), flixBusPassenger);
        }
        System.out.println(passengersList);
    }
}
