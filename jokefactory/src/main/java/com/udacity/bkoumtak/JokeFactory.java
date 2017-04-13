package com.udacity.bkoumtak;

import java.util.Random;

public class JokeFactory {
    public static final String jokes[] = {
            "A computer lets you make more mistakes faster than any invention in human history - " +
                    "with the possible exceptions of handguns and tequila.",
            "If it weren't for C, we'd all be programming in BASI and OBOL.",
            "There are 10 types of people in the world: those who understand binary, and those who don't.",
            "In a world without fences and walls, who needs Gates and Windows?",
            "Programming today is a race between software engineers striving to build bigger and " +
                    "better idiot-proof programs, and the Universe trying to produce bigger and better " +
                    "idiots. So far, the Universe is winning.",
            "Computers make very fast, very accurate mistakes.",
            "Never underestimate the bandwidth of a station wagon full of tapes hurling down the highway.",
            "An SQL statement walks into a bar and sees two tables. It approaches, and asks \"may I join you?\"",
            "Q: Why is it that programmers always confuse Halloween with Christmas?\n" +
                    "A: Because 31 OCT = 25 DEC.",
            "Man is the best computer we can put aboard a spacecraft... and the only one that can be " +
                    "mass produced with unskilled labor",
            "Q: How many programmers does it take to change a light bulb?\n" +
                    "A: None. It's a hardware problem.",
            "Two strings walk into a bar and sit down. The bartender says, \"So what'll it be?\"\n" +
                    "The first string says, \"I think I'll have a beer quag fulk boorg jdk^CjfdLk jk3s " +
                    "d#f67howe%^U r89nvy~~owmc63^Dz x.xvcu\"\n" +
                    "\"Please excuse my friend,\" the second string says. \"He isn't null-terminated.\"",
            "\"I'm not interrupting you, I'm putting our conversation in full-duplex mode.\"\n" +
                    "- Antone Roundy",
            "A doctor, a civil engineer and a programmer are discussing whose profession is the oldest.\n" +
                    "\"Surely medicine is the oldest profession,\" says the doctor. \"God took a rib from Adam and " +
                    "created Eve and if this isn't medicine I'll be...\"\n" +
                    "The civil engineer breaks in:\n" +
                    "\"But before that He created the heavens and the earth from chaos. Now that's civil engineering to me.\"\n" +
                    "The programmer thinks a bit and then says:\n" +
                    "\"And who do you think created chaos?\"",
            "A logician tells a colleague his wife just had a baby.\n" +
            "- Is it a boy or a girl?\n" +
            "- Yes.",
            "A cop pulls over Werner Heisenberg and says, \"Sir, do you know how fast you were going?\"\n" +
                    "Heisenberg responds, \"NO, but I know EXACTLY where I am.\"",
            "Lotteries are a tax on people who suck at math."
    };


    public String getJoke(){
        Random rand = new Random();
        int randInt = rand.nextInt(jokes.length);
        return jokes[randInt];
    }

}
