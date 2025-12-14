package com.apurva.InventoryMgtSystem.services;

import com.apurva.InventoryMgtSystem.dtos.LoginRequest;
import com.apurva.InventoryMgtSystem.dtos.RegisterRequest;
import com.apurva.InventoryMgtSystem.dtos.Response;
import com.apurva.InventoryMgtSystem.dtos.UserDTO;
import com.apurva.InventoryMgtSystem.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
