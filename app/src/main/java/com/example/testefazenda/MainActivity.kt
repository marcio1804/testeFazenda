package com.example.testefazenda

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var notaProdutorEditText: EditText
    private lateinit var dataNascimentoEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var cadastrarButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    
        nameEditText = findViewById(R.id.nameEditText)
        emailEditText = findViewById(R.id.emailEditText)
        notaProdutorEditText = findViewById(R.id.notaProdutorEditText)
        dataNascimentoEditText = findViewById(R.id.dataNascimentoEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        cadastrarButton = findViewById(R.id.cadastrarButton)

        cadastrarButton.setOnClickListener {
            val nome = nameEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()
            val notaProdutor = notaProdutorEditText.text.toString().trim()
            val dataNascimento = dataNascimentoEditText.text.toString().trim()
            val senha = passwordEditText.text.toString().trim()

          
            if (nome.isEmpty() || email.isEmpty() || notaProdutor.isEmpty() ||
                dataNascimento.isEmpty() || senha.isEmpty()
            ) {
                Toast.makeText(
                    this,
                    "Por favor, preencha todos os campos.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                
                Toast.makeText(
                    this,
                    "Cadastro realizado com sucesso!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
