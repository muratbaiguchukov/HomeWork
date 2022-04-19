package kg.itacademy.springpractice.service;

import kg.itacademy.springpractice.entity.Booking;
import kg.itacademy.springpractice.model.BookingNorm;

public interface BookingService {
    void toBookNewTicket(BookingNorm bookingNorm);
    Booking getBooking(Long id);
}
