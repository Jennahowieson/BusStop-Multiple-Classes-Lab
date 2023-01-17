import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class BusTest {

        private Bus bus;
        private Person person;

        @Before
        public void before(){
            bus = new Bus("Oxgangs",5);
            person = new Person();
        }

        @Test
        public void busHasPassengers(){
            bus.addPassenger(person);
            assertEquals(1,bus.countPassengers());
        }

        @Test
        public void busTakesPassengerIfCapacity(){
            bus.addPassenger(person);
            assertEquals(1,bus.countPassengers());
        }


        @Test
        public void busRefusesPassengerIfNoCapacity(){
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            bus.addPassenger(person);
            assertEquals(5, bus.countPassengers());
        }

        @Test
        public void busRemovesPassenger (){
            bus.addPassenger(person);
            bus.removePassenger();
            assertEquals(0, bus.countPassengers());
        }

        @Test
        public void canPickUpPassenger (){
            BusStop busStop = new BusStop("Craiglockhart");
            busStop.addToQueue(person);
            busStop.addToQueue(person);
            bus.pickUpPassenger(busStop);
            assertEquals(1, bus.countPassengers());
        }

        @Test
        public void pickingUpPassengerChangesQueue (){
            BusStop busStop = new BusStop("Craiglockhart");
            busStop.addToQueue(person);
            busStop.addToQueue(person);
            bus.pickUpPassenger(busStop);
            assertEquals(1, busStop.countQueue());
        }
    }


