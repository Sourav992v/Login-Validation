package com.sourav.loginformvalidation.domain.use_case

import android.util.Patterns

/*Use case is a very integral part of the clean architecture.
It is kind of a middle layer between your view model and data layer.
It's an excellent way to follow the single responsibility principle,
which just states each class and function should really do one thing
or should have just single responsibility.*/

class ValidatePassword {

    fun execute(password: String): ValidationResult{
        if(password.length < 8){
            return ValidationResult(
                successful = false,
                errorMessage = "The password needs to consists at least a characters."
            )
        }
        val containsLettersAndDigits = password.any{ it.isDigit() }&&
        password.any { it.isLetter() }
        if(!containsLettersAndDigits){
            return ValidationResult(
                successful = false,
                errorMessage = "The password needs to contain at least one letter and digit"
            )
        }
        return ValidationResult(
            successful = true,
            
        )
    }


}