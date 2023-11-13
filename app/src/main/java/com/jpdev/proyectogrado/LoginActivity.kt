package com.jpdev.proyectogrado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jpdev.proyectogrado.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    private var credentials = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(binding.etUser.text.toString() != ""
            && binding.etUser.text.toString().isNotEmpty()
            && binding.etPassword.text.toString() != ""
            &&binding.etPassword.text.toString().isNotEmpty()){
            //User ID and Password is not empty -> Validate data base
            initListeners()//Initializing listeners
        }


    }

    private fun initListeners(){
        binding.btnLogin.setOnClickListener {
            //Logic to login
            validateCredentials()//Verify if credentials match with inputs
        }
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent) //Go to Activity Register
        }
        binding.btnPassRecord.setOnClickListener {
            //Record Password
        }
    }

    private fun validateCredentials(){
        if(credentials){
            //Log In to app
        }else{
            //Toast(this,"Credenciales no validas",Toast.LENGTH_SHORT).show()
        }
    }

}