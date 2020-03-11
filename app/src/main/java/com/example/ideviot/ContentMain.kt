package com.example.ideviot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import android.telephony.SmsManager
var phoneNumber = "+84362170650"
var azure = "azure"
var money = "money"
var temp = "temp"
var pressure = "pressure"


class ContentMain : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.content_main, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*view.findViewById<Button>(R.id.button_add1).setOnClickListener {
            findNavController().navigate(R.id.action_addProduct_to_SecondFragment)
        }
        view.findViewById<Button>(R.id.azure).setOnClickListener {
            sendSmsByManager()
            Toast.makeText(context, "sending...", Toast.LENGTH_LONG).show()
        }*/
        view.findViewById<Button>(R.id.azure).setOnClickListener {
            sendAzureByManager()
        }
        view.findViewById<Button>(R.id.money).setOnClickListener {
            sendmoneyByManager()
        }
        view.findViewById<Button>(R.id.temp).setOnClickListener {
            sendtempByManager()
        }
        view.findViewById<Button>(R.id.weather).setOnClickListener {
            sendpressByManager()
        }
    }

    fun sendAzureByManager() {
        // Get the default instance of the SmsManager
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phoneNumber, null, azure, null, null)

    }
    fun sendmoneyByManager() {
        // Get the default instance of the SmsManager
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phoneNumber, null, money, null, null)

    }

    fun sendpressByManager() {
        // Get the default instance of the SmsManager
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phoneNumber, null, pressure, null, null)

    }
    fun sendtempByManager() {
        // Get the default instance of the SmsManager
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phoneNumber, null, temp, null, null)

    }


}