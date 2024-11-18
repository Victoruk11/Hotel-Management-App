package com.victoruk.HotelManagement.service.interfac;

import com.victoruk.HotelManagement.dto.LoginRequest;
import com.victoruk.HotelManagement.dto.Response;
import com.victoruk.HotelManagement.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
