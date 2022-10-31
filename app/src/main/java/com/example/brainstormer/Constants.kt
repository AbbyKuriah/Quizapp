package com.example.brainstormer

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1,"who is the famous author of the Harry Potter book series?",
            "George R.R.Martin",
            "N.K.Jemisin",
            "J.R.R.Tolkien",
            "J.K.Rolin",
            4,)
        questionList.add(que1)

        val que2 = Question(2,"what was the name of the band that sang F.R.I.E.N.D.S?",
            "The rembrandts",
            "weezer",
            "perl jam",
            "nirvana",
            1,)
        questionList.add(que2)



        val que3 = Question(3,"who is the fictional character shrek marries in this titular film?",
            "princess simona",
            "princess fiona",
            "princess cora",
            "princess nora",
            2,)
        questionList.add(que3)

        val que4 = Question(4,"who was the captain of titanic?",
            "Edward curt",
            "Edward curt",
            "Edwin smith",
            "Edward smith",
            4,)
        questionList.add(que4)

        return questionList

    }

}