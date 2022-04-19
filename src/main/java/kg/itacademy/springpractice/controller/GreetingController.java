package kg.itacademy.springpractice.controller;

import kg.itacademy.springpractice.model.BookingNorm;
import kg.itacademy.springpractice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public String getGreeting() {

        return "greeting";
    }

    @GetMapping("/ticket/to-book")
    public String toBookTicket() {
        return "booking";
    }

    @PostMapping("/ticket/to-book/post")
    public String toBookNewTicket(@ModelAttribute(name = "booking") BookingNorm bookingNorm) {
        bookingService.toBookNewTicket(bookingNorm);
        bookingService.getBooking(1L);
        return "greeting";
    }

}
