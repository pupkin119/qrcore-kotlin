package com.example.qrcore.models.repositories

import com.example.qrcore.models.entites.User
import org.springframework.data.repository.CrudRepository


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
interface UserRepository : CrudRepository<User?, Int?>