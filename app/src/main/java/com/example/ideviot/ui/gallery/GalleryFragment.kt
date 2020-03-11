package com.example.ideviot.ui.gallery

import android.os.Bundle
import android.telephony.SmsManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.ideviot.R


var phoneNumber = "+84362170650"
var azurem = "azure"
var moneym = "money"
var tempm = "temp"
var pressure = "pressure"
var reset = "reset"



class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?, savedInstanceState: Bundle?): View? {
        galleryViewModel =
            ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*
        view.findViewById<ImageView>(R.id.azure).setOnClickListener {
            sendSmsByManager()
            Toast.makeText(context, "sending...", Toast.LENGTH_LONG).show()
        }
        view.findViewById<Button>(R.id.button_add1).setOnClickListener {
            findNavController().navigate(R.id.action_addProduct_to_SecondFragment)
        }*/
        //val msg = view.findViewById<EditText>(R.id.editText);
        //val sms = msg.text.toString();
        view.findViewById<ImageView>(R.id.reset).setOnClickListener {
            val editText = view.findViewById<EditText>(R.id.editText)
            val text = editText.text.toString()
            if (text == null || text.trim()==""){
                Toast.makeText(context,"please input data, edit text cannot be blank",Toast.LENGTH_LONG).show()
            }else{
                sendAzureByManager(text+" "+reset)
                Toast.makeText(context, "reset in 1 minute...", Toast.LENGTH_LONG).show()
            }

        }
        view.findViewById<ImageView>(R.id.azure).setOnClickListener {
            val editText = view.findViewById<EditText>(R.id.editText)
            val text = editText.text.toString()
            if (text == null || text.trim()==""){
                Toast.makeText(context,"please input data, edit text cannot be blank",Toast.LENGTH_LONG).show()
            }else {
                val editText = view.findViewById<EditText>(R.id.editText)
                val text = editText.text.toString()
                sendAzureByManager(text + " " + azurem)
                Toast.makeText(context, "sending azure...", Toast.LENGTH_LONG).show()
            }
        }
        view.findViewById<ImageView>(R.id.money).setOnClickListener {

            val editText = view.findViewById<EditText>(R.id.editText)
            val text = editText.text.toString()
            if (text == null || text.trim()==""){
                Toast.makeText(context,"please input data, edit text cannot be blank",Toast.LENGTH_LONG).show()
            }else {
                val editText = view.findViewById<EditText>(R.id.editText)
                val text = editText.text.toString()
                sendmoneyByManager(text + " " + moneym)
                Toast.makeText(context, "sending account balance...", Toast.LENGTH_LONG).show()
            }
        }
        view.findViewById<ImageView>(R.id.temp).setOnClickListener {
            val editText = view.findViewById<EditText>(R.id.editText)
            val text = editText.text.toString()
            if (text == null || text.trim()==""){
                Toast.makeText(context,"please input data, edit text cannot be blank",Toast.LENGTH_LONG).show()
            }else {
                val editText = view.findViewById<EditText>(R.id.editText)
                val text = editText.text.toString()
                sendtempByManager(text + " " + tempm)
                Toast.makeText(context, "sending temperature...", Toast.LENGTH_LONG).show()
            }
        }
        view.findViewById<ImageView>(R.id.weather).setOnClickListener {
            val editText = view.findViewById<EditText>(R.id.editText)
            val text = editText.text.toString()
            if (text == null || text.trim()==""){
                Toast.makeText(context,"please input data, edit text cannot be blank",Toast.LENGTH_LONG).show()
            }else {
                val editText = view.findViewById<EditText>(R.id.editText)
                val text = editText.text.toString()
                sendpressByManager(text + " " + pressure)
                Toast.makeText(context, "sending pressure...", Toast.LENGTH_LONG).show()
            }
        }

    }


    /*
    fun sendSmsByManager() {
        // Get the default instance of the SmsManager
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phoneNumber, null, pressure, null, null)

    }*/

    fun concat(s1: String, s2: String):String?{
        var s = s1 + s2
        return s
    }
    fun sendAzureByManager(s : String) {
        // Get the default instance of the SmsManager
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phoneNumber, null, s, null, null)

    }
    fun sendmoneyByManager(s : String) {
        // Get the default instance of the SmsManager
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phoneNumber, null, s, null, null)

    }

    fun sendpressByManager(s : String) {
        // Get the default instance of the SmsManager
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phoneNumber, null, s, null, null)

    }
    fun sendtempByManager(s : String) {
        // Get the default instance of the SmsManager
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phoneNumber, null, s, null, null)

    }




}