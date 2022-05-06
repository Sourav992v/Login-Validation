package com.sourav.loginformvalidation.domain.use_case

/*Use case is a very integral part of the clean architecture.
It is kind of a middle layer between your view model and data layer.
It's an excellent way to follow the single responsibility principle,
which just states each class and function should really do one thing
or should have just single responsibility.*/

class ValidateRepeatedPassword {

    fun execute(password: String, repeatedPassword: String): ValidationResult{
        if(password != repeatedPassword){
            return ValidationResult(
                successful = false,
                errorMessage = "The passwords don't match"
            )
        }
        val containsLettersAndDigits = password.any{ it.isDigit() &&
        password.any { it.isLetter() }}
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