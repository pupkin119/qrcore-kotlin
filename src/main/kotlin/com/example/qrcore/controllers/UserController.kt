package com.example.qrcore.controllers

import com.example.qrcore.controllers.params.UserParams
import com.example.qrcore.models.entites.User
import org.springframework.web.bind.annotation.*
import com.example.qrcore.models.repositories.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import java.util.*

@RestController
@RequestMapping(path = ["/user"]) // This means URL's start with /demo (after Application path)
class UserController(
    private val userRepository: UserRepository
) {
    @GetMapping("/{user_id}")
    fun findUser(@PathVariable user_id: Int): Optional<User?> {
        return userRepository.findById(user_id)
    }

    @PostMapping(path = ["/add"]) // Map ONLY POST Requests
    @ResponseBody
    fun addNewUser(params: UserParams
//        @RequestParam name: String?, @RequestParam email: String?
    ): User {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        val user = User()
        user.first_name = params.name
        user.last_name = params.name
        user.email = params.email
        userRepository.save(user)
        return user
    }

    @GetMapping(path = ["/blah"])
    fun test(): String {
        return "true"
    }
}