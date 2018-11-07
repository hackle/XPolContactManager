//package com.spreys.contactmanager
//
//
//import java.util.ArrayList
//import java.util.Random
//
//object MockDataGenerator {
//    private val firstNames = arrayOf("Hermila", "Brynn", "Christeen", "Maren", "Clifton", "Madelyn", "Yan", "Tia", "Zulema", "Casey", "Sonia", "Timmy", "Lynn", "Hae", "Thaddeus", "Flossie", "Cleveland", "Zona", "Wm", "Nathanial", "Shane", "Chanell", "Fredia", "Wayne", "Carin", "Darren", "Valentina", "Mahalia", "Donn", "Beverley", "Zachery", "Araceli", "Joel", "Hellen", "Ema", "Ivan", "Elisa", "Lina", "Bernice", "Marinda", "Leanora", "Rochell", "Nelia", "Jimmie", "Carolynn", "Shantelle", "Emile", "Zenia", "Juan", "Kandi")
//    private val lastNames = arrayOf("Stephen", "Granier", "Guild", "Frazer", "Jacobs", "Bassi", "Thies", "Gracey", "Kicklighter", "Klingman", "Spade", "Podesta", "Gatz", "Mineo", "Magda", "Coronado", "Hanks", "Ellington", "Barone", "Leibowitz", "Hileman", "Box", "Soileau", "Ament", "Bracken", "Gholston", "Eagles", "Roop", "Huber", "Carollo", "Seidl", "Rohrer", "Peach", "Monarrez", "Markey", "Sidwell", "Stoneham", "Pinkerton", "Westervelt", "Despres", "Belair", "Derksen", "Suzuki", "Distefano", "Montalto", "Jung", "Bratt", "Obrien", "Figueredo", "Keim")
//
//    private val mockContact: Contact
//        get() = Contact(
//                randomFirstName,
//                randomLastName,
//                randomMobile,
//                randomLandline
//        )
//
//    private val randomFirstName: String
//        get() = firstNames[Random().nextInt(firstNames.size)]
//
//    private val randomLastName: String
//        get() = lastNames[Random().nextInt(lastNames.size)]
//
//    private val randomMobile: String
//        get() = getRandomNumber(11)
//
//    private val randomLandline: String
//        get() = getRandomNumber(9)
//
//    fun getMockContacts(length: Int): ArrayList<Contact> {
//        val mockContacts = ArrayList<Contact>()
//        for (i in 0 until length) {
//            mockContacts.add(mockContact)
//        }
//        return mockContacts
//    }
//
//    private fun getRandomNumber(length: Int): String {
//        var number = ""
//        for (i in 0 until length) {
//            number += Random().nextInt(10).toString()
//        }
//        return number
//    }
//}