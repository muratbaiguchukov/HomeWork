package kg.itacademy.springpractice.service.impl;

import kg.itacademy.springpractice.entity.Booking;
import kg.itacademy.springpractice.model.BookingNorm;
import kg.itacademy.springpractice.repository.BookingRepository;
import kg.itacademy.springpractice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public void toBookNewTicket(BookingNorm bookingNorm) {

        if (bookingNorm != null) {
            if (bookingNorm.getBookRef().equals(bookingNorm.getBookRef())) {
                Booking booking = new Booking();
                booking.setBookRef(booking.getBookRef());
                booking.setBookDate(booking.getBookDate());
                booking.setTotalAmount(booking.getTotalAmount());
                bookingRepository.save(booking);
            }
        }
    }

    @Override
    public Booking getBooking(Long id) {
        return bookingRepository.findById(id).get();
    }
}