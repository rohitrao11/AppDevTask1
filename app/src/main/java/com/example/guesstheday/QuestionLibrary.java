package com.example.guesstheday;

public class QuestionLibrary {
    private String mQuestions [] = {
      "Which Day is 12/03/2002?",
      "Which Day is 13/12/2017?",
      "Which Day is 18/09/2006?",
      "Which Day is 06/06/1944?",
      "Which Day is 18/08/1227?",
      "Which Day is 02/04/1982?",
      "Which Day is 11/09/2001?",
      "Which Day is 27/10/1605?",
      "Which Day is 19/01/1597?",
      "Which Day is 09/05/1540?",
      "Which Day is 02/09/1945?",
      "Which Day is 11/11/1918?",
      "Which Day is 07/05/1945?",
      "Which Day is 26/12/1991?",
      "Which Day is 18/09/1931?",
      "Which Day is 01/09/1939?",
      "Which Day is 28/07/1914?",
      "Which Day is 23/04/1564?",
      "Which Day is 02/12/1993?",
      "Which Day is 05/10/2011?",
      "Which Day is 13/05/1950?",
      "Which Day is 12/06/2011?",
      "Which Day is 15/11/2020?",
      "Which Day is 11/09/1968?",
      "Which Day is 23/10/2020?",
      "Which Day is 24/07/1927",
      "Which Day is 15/03/1189",
      "Which Day is 05/09/1785",
      "Which Day is 29/02/1956",
      "Which Day is 17/12/1879",
      "Which Day is 18/09/1305",
      "Which Day is 31/05/1654",
      "Which Day is 10/04/2015",
      "Which Day is 27/03/1734",
      "Which Day is 10/09/2009",
      "Which Day is 12/10/2012",
      "Which Day is 17/04/1896",
      "Which Day is 10/08/1823",
      "Which Day is 13/02/2902",
      "Which Day is 19/08/1033",
      "Which Day is 19/12/2736",
      "Which Day is 27/07/3821",
      "Which Day is 19/11/1925",
      "Which Day is 23/02/1859",
      "Which Day is 12/10/291",
      "Which Day is 26/07/597",
      "Which Day is 18/08/3749",
      "Which Day is 31/08/127",
      "Which Day is 12/08/1723",
      "Which Day is 11/06/2002"
    };
    private String mChoices [][] = {
            {"Thursday","Tuesday","Saturday","Sunday"},
            {"Friday","Monday","Wednesday","Tuesday"},
            {"Thursday","Monday","Friday","Sunday"},
            {"Saturday","Sunday","Tuesday","Friday"},
            {"Friday","Wednesday","Tuesday","Monday"},
            {"Sunday","Thursday","Tuesday","Friday"},
            {"Saturday","Thursday","Tuesday","Friday"},
            {"Friday","Sunday","Thursday","Wednesday"},
            {"Tuesday","Wednesday","Thursday","Sunday"},
            {"Sunday","Saturday","Wednesday","Friday"},
            {"Tuesday","Sunday","Friday","Thursday"},
            {"Sunday","Wednesday","Friday","Monday"},
            {"Tuesday","Monday","Sunday","Saturday"},
            {"Sunday","Thursday","Wednesday","Friday"},
            {"Saturday","Thursday","Friday","Tuesday"},
            {"Sunday","Wednesday","Thursday","Friday"},
            {"Thursday","Saturday","Wednesday","Tuesday"},
            {"Saturday","Sunday","Thursday","Tuesday"},
            {"Tuesday","Thursday","Friday","Wednesday"},
            {"Sunday","Thursday","Wednesday","Friday"},
            {"Wednesday","Saturday","Tuesday","Thursday"},
            {"Friday","Sunday","Thursday","Tuesday"},
            {"Thursday","Saturday","Tuesday","Sunday"},
            {"Tuesday","Saturday","Wednesday","Friday"},
            {"Wednesday","Tuesday","Friday","Saturday"},
            {"Sunday","Friday","Saturday","Wednesday"},
            {"Saturday","Friday","Thursday","Wednesday"},
            {"Friday","Thursday","Monday","Sunday"},
            {"Sunday","Wednesday","Friday","Tuesday"},
            {"Friday","Tuesday","Wednesday","Saturday"},
            {"Friday","Thursday","Sunday","Saturday"},
            {"Thursday","Friday","Sunday","Wednesday"},
            {"Sunday","Saturday","Thursday","Friday"},
            {"Wednesday","Thursday","Sunday","Tuesday"},
            {"Tuesday","Wednesday","Friday","Thursday"},
            {"Friday","Saturday","Thursday","Sunday"},
            {"Tuesday","Thursday","Friday","Saturday"},
            {"Thursday","Sunday","Tuesday","Wednesday"},
            {"Sunday","Friday","Tuesday","Monday"},
            {"Wednesday","Sunday","Thursday","Tuesday"},
            {"Thursday","Friday","Tuesday","Saturday"},
            {"Friday","Thursday","Saturday","Sunday"},
            {"Wednesday","Tuesday","Sunday","Thursday"},
            {"Wednesday","Thursday","Saturday","Friday"},
            {"Saturday","Thursday","Sunday","Monday"},
            {"Sunday","Tuesday","Friday","Saturday"},
            {"Wednesday","Monday","Thursday","Sunday"},
            {"Tuesday","Thursday","Sunday","Saturday"},
            {"Saturday","Wednesday","Monday","Thursday"},
            {"Thursday","Tuesday","Sunday","Friday"}
    };
    private String mCorrectAnswers [] = {"Tuesday","Wednesday","Monday","Tuesday","Wednesday",
            "Friday","Tuesday","Sunday","Wednesday","Sunday",
            "Sunday","Monday","Monday","Thursday","Friday",
            "Friday","Tuesday","Sunday","Thursday","Wednesday",
            "Saturday","Sunday","Sunday","Wednesday","Friday",
            "Sunday","Wednesday","Monday","Wednesday","Wednesday",
            "Saturday","Wednesday","Friday","Wednesday","Thursday",
            "Friday","Friday","Sunday","Monday","Sunday",
            "Saturday","Friday","Thursday","Wednesday","Monday",
            "Friday","Monday","Saturday","Monday","Tuesday"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
