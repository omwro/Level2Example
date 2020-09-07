package nl.omererdem.madlevel2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nl.omererdem.madlevel2example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val reminders = arrayListOf<Reminder>()
    private val reminderAdapter = ReminderAdapter(reminders)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        
    }
}