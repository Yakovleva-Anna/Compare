import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {
    @Test
    public void sortTickets() {
        AviaSouls sorting = new AviaSouls();
        Ticket ticket1 = new Ticket("MOW", "LED", 7000, 10, 11);
        Ticket ticket2 = new Ticket("MOW", "LED", 6000, 6, 8);
        Ticket ticket3 = new Ticket("MOW", "LED", 7000, 22, 23);
        Ticket ticket4 = new Ticket("IKT", "UUD", 40000, 15, 20);
        Ticket ticket5 = new Ticket("MOW", "LED", 3000, 2, 5);
        Ticket ticket6 = new Ticket("KGD", "VVO", 27000, 12, 23);
        Ticket ticket7 = new Ticket("IKT", "UUD", 35000, 1, 7);
        Ticket ticket8 = new Ticket("IKT", "UUD", 37000, 11, 16);
        sorting.add(ticket1);
        sorting.add(ticket2);
        sorting.add(ticket3);
        sorting.add(ticket4);
        sorting.add(ticket5);
        sorting.add(ticket6);
        sorting.add(ticket7);
        sorting.add(ticket8);

        Ticket[] expected = {ticket5, ticket2, ticket1, ticket3};
        Ticket[] actual = sorting.search("MOW","LED");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void sortTicketsIfOne() {
        AviaSouls sorting = new AviaSouls();
        Ticket ticket1 = new Ticket("MOW", "LED", 7000, 10, 11);
        Ticket ticket2 = new Ticket("MOW", "LED", 6000, 6, 8);
        Ticket ticket3 = new Ticket("MOW", "LED", 7000, 22, 23);
        Ticket ticket4 = new Ticket("IKT", "UUD", 40000, 15, 20);
        Ticket ticket5 = new Ticket("MOW", "LED", 3000, 2, 5);
        Ticket ticket6 = new Ticket("KGD", "VVO", 27000, 12, 23);
        Ticket ticket7 = new Ticket("IKT", "UUD", 35000, 1, 7);
        Ticket ticket8 = new Ticket("IKT", "UUD", 37000, 11, 16);
        sorting.add(ticket1);
        sorting.add(ticket2);
        sorting.add(ticket3);
        sorting.add(ticket4);
        sorting.add(ticket5);
        sorting.add(ticket6);
        sorting.add(ticket7);
        sorting.add(ticket8);

        Ticket[] expected = {ticket6};
        Ticket[] actual = sorting.search("KGD", "VVO");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void sortTicketsIfNone() {
        AviaSouls sorting = new AviaSouls();
        Ticket ticket1 = new Ticket("MOW", "LED", 7000, 10, 11);
        Ticket ticket2 = new Ticket("MOW", "LED", 6000, 6, 8);
        Ticket ticket3 = new Ticket("MOW", "LED", 7000, 22, 23);
        Ticket ticket4 = new Ticket("IKT", "UUD", 40000, 15, 20);
        Ticket ticket5 = new Ticket("MOW", "LED", 3000, 2, 5);
        Ticket ticket6 = new Ticket("KGD", "VVO", 27000, 12, 23);
        Ticket ticket7 = new Ticket("IKT", "UUD", 35000, 1, 7);
        Ticket ticket8 = new Ticket("IKT", "UUD", 37000, 11, 16);
        sorting.add(ticket1);
        sorting.add(ticket2);
        sorting.add(ticket3);
        sorting.add(ticket4);
        sorting.add(ticket5);
        sorting.add(ticket6);
        sorting.add(ticket7);
        sorting.add(ticket8);

        Ticket[] expected = {};
        Ticket[] actual = sorting.search("LED", "MOW");

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void sortTicketsComparator() {
        AviaSouls sorting = new AviaSouls();
        Ticket ticket1 = new Ticket("MOW", "LED", 7000, 10, 11);
        Ticket ticket2 = new Ticket("MOW", "LED", 6000, 6, 8);
        Ticket ticket3 = new Ticket("MOW", "LED", 7000, 22, 23);
        Ticket ticket4 = new Ticket("IKT", "UUD", 40000, 15, 20);
        Ticket ticket5 = new Ticket("MOW", "LED", 3000, 2, 5);
        Ticket ticket6 = new Ticket("KGD", "VVO", 27000, 12, 23);
        Ticket ticket7 = new Ticket("IKT", "UUD", 35000, 1, 7);
        Ticket ticket8 = new Ticket("IKT", "UUD", 37000, 11, 16);
        sorting.add(ticket1);
        sorting.add(ticket2);
        sorting.add(ticket3);
        sorting.add(ticket4);
        sorting.add(ticket5);
        sorting.add(ticket6);
        sorting.add(ticket7);
        sorting.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket4, ticket8, ticket7};
        Ticket[] actual = sorting.searchAndSortBy("IKT", "UUD", comparator);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void sortTicketsComparatorIfOne() {
        AviaSouls sorting = new AviaSouls();
        Ticket ticket1 = new Ticket("MOW", "LED", 7000, 10, 11);
        Ticket ticket2 = new Ticket("MOW", "LED", 6000, 6, 8);
        Ticket ticket3 = new Ticket("MOW", "LED", 7000, 22, 23);
        Ticket ticket4 = new Ticket("IKT", "UUD", 40000, 15, 20);
        Ticket ticket5 = new Ticket("MOW", "LED", 3000, 2, 5);
        Ticket ticket6 = new Ticket("KGD", "VVO", 27000, 12, 23);
        Ticket ticket7 = new Ticket("IKT", "UUD", 35000, 1, 7);
        Ticket ticket8 = new Ticket("IKT", "UUD", 37000, 11, 16);
        sorting.add(ticket1);
        sorting.add(ticket2);
        sorting.add(ticket3);
        sorting.add(ticket4);
        sorting.add(ticket5);
        sorting.add(ticket6);
        sorting.add(ticket7);
        sorting.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket6};
        Ticket[] actual = sorting.searchAndSortBy("KGD", "VVO", comparator);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void sortTicketsComparatorIfNone() {
        AviaSouls sorting = new AviaSouls();
        Ticket ticket1 = new Ticket("MOW", "LED", 7000, 10, 11);
        Ticket ticket2 = new Ticket("MOW", "LED", 6000, 6, 8);
        Ticket ticket3 = new Ticket("MOW", "LED", 7000, 22, 23);
        Ticket ticket4 = new Ticket("IKT", "UUD", 40000, 15, 20);
        Ticket ticket5 = new Ticket("MOW", "LED", 3000, 2, 5);
        Ticket ticket6 = new Ticket("KGD", "VVO", 27000, 12, 23);
        Ticket ticket7 = new Ticket("IKT", "UUD", 35000, 1, 7);
        Ticket ticket8 = new Ticket("IKT", "UUD", 37000, 11, 16);
        sorting.add(ticket1);
        sorting.add(ticket2);
        sorting.add(ticket3);
        sorting.add(ticket4);
        sorting.add(ticket5);
        sorting.add(ticket6);
        sorting.add(ticket7);
        sorting.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = sorting.searchAndSortBy("UUD", "IKT", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
}
