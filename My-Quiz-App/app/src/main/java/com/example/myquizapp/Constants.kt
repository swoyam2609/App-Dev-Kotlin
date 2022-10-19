package com.example.myquizapp

object Constants {

    fun getQuestion():ArrayList<Question>{

        val listOfQuestion : ArrayList<Question>  = ArrayList<Question>()

        //Que 1
        val que1=Question(
            1,
            "What is the stack of the mentioned person",
            R.drawable.dp_designer,
            "Designer",
            "App Developer",
            "Web Developer",
            "Manager",
            1
        )

        listOfQuestion.add(que1)

        //Que 2
        val que2=Question(
            2,
            "What position does the above mention hold",
            R.drawable.dp_gdsclead,
            "E-Cell Head",
            "GDSC Lead",
            "Web Developer",
            "Machine Learning Engineer",
            2
        )

        listOfQuestion.add(que2)

        //Que 3
        val que3=Question(
            3,
            "What is the name of the above mentioned person",
            R.drawable.dp_manager,
            "Prince Pious Omm Prakash",
            "Swoyam Siddharth Nayak",
            "Sidharth Suvanakar Nayak",
            "Roshan Dash",
            3
        )

        listOfQuestion.add(que3)

        //Que 4
        val que4=Question(
            4,
            "What language is used by the above person for App Developement",
            R.drawable.dp_psoccolead,
            "Dart",
            "Java",
            "Kotlin",
            "No Code",
            1
        )

        listOfQuestion.add(que4)

        //Que 5
        val que5=Question(
            5,
            "What position does the above person hold in institute",
            R.drawable.dp_psoclead,
            "Professor",
            "GFG Lead",
            "PSOC Lead",
            "GDSC Lead",
            3
        )

        listOfQuestion.add(que5)

        //Que 6
        val que6=Question(
            6,
            "What is the tech stack of the above person",
            R.drawable.dp_techjointsec,
            "App Developement",
            "Machine Learning",
            "Web Developement",
            "Blockchain Developer",
            2
        )

        listOfQuestion.add(que6)

        //Que 7
        val que7=Question(
            7,
            "What is the stack of the mentioned person",
            R.drawable.dp_techsec,
            "App Developement",
            "Machine Learning",
            "Web Developement",
            "Blockchain Developer",
            1
        )

        listOfQuestion.add(que7)

        return listOfQuestion
    }
}