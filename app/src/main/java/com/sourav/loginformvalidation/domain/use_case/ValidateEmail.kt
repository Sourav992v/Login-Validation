package com.sourav.loginformvalidation.domain.use_case

import android.util.Patterns

/*Use case is a very integral part of the clean architecture.
It is kind of a middle layer between your view model and data layer.
It's an excellent way to follow the single responsibility principle,
which just states each class and function should really do one thing
or should have just single responsibility.*/

class ValidateEmail {

    fun execute(email: String): ValidationResult{
        if(email.isBlank()){
            return ValidationResult(
                successful = false,
                errorMessage = "The email can't be blank"
            )
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return ValidationResult(
                successful = false,
                errorMessage = "That's not a valid email"
            )
        }
        return ValidationResult(
            successful = true,

        )
    }


}