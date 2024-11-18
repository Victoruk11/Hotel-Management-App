package com.victoruk.HotelManagement.service.interfac;

import com.victoruk.HotelManagement.dto.Response;
import com.victoruk.HotelManagement.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
