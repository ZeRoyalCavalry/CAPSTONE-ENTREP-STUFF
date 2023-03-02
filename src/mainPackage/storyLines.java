package mainPackage;

public class storyLines implements java.io.Serializable{
	
	public static String subInGender;

	public class dialogues {
		static String diaText[] = {
				
//Introduction Lines
"Could you tell us your name?",//0
		
"A world opens anew.", //1

"The sounds of birds chirping. . .  The winds, so strong. The lush flora danced to it " 
+ "and made little soft thuds on nearby glass panes. "
+ "The breeze that caved into the room felt cold, yet soothing.", //2

"Different sensations, different moods. . .  How wonderful it was.",//3

"You opened your eyes, greeted by your dimly lit room.  "
+ "The warm blanket wrapped around you "
+ "made this icy atmosphere comfortable, "
+ "reminding you of familiar and familial hugs.",//4

"A new day, a new start, a new life it was. "
+ "You sat up on your bed, crawled to the nearby window "
+ "that was blocked by curtains, and opened them.",//5

"The city skyline, the plethora of buildings, "
+ "bustling streets and avenues, and the livelihood of "
+ "folks starting their day, it made you feel light and happy.",//6

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Result for each of the four options

"You exit the bedroom. . .",//7
"It's the first day of classes... Nothing is there to review...",//8
"Wow... The world is absolutely just gorgeous...",//9
"I'm still tired, I'm gonna sleep again...",//10

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Picked Good
" Good morning to you, dear!",//11

"I hope you had a swell sleep. "
+ "You need everything for your first day at Starlight!",//12

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Picked bad
"GET OUT OF THAT ROOM!!! \nRIGHT THIS MOMENT!!!",//13

"What are you doing dozing off in your room?!"
+ " I already heard the alarm and you aren't up yet?!", //14

"Because of that, you also lost some CP or Chance Points!",//15

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Explanation
"Wait, deary, remember to check your CP... Do you know what those are? They determine how many"
+ " times you can make mistakes left before you have to restart.",//16

"And I assume you know what XP is?",//17

"You don't? My, oh my, that's your experience points. It shows "
+ "how much you've progressed with all the right and good you've done.",//18

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Transition to First Lesson

"Anyway, I heard that you're going to be heavy on Chemistry for a few weeks. "
+ "Having heard that, I took the liberty to review some old school notes of mine to get you ready!",//19

"So then, let's have a bit of a lesson then, shall we?",//20

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//First Lesson Result

//Right
"Good job! It's all about studying matter when it undergoes CHANGES, specifically chemical changes.",//21

//Wrong
"Oh! I'm so sorry, dear, it studies matter when it undergoes CHANGES, "
+ "specifically CHEMICAL CHANGES, hence why it is called CHEMISTRY.",//22

"Most especially, it focuses on the PROPERTIES and ATOMIC OR MOLECULAR STRUCTURE "
+ "the matter possesses before and after such changes occurs!",//23

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Transition to Second Lesson

"Now that we've defined it in a way, let's go further with our understanding of it.", //24

"The substances talked about in Chemistry is made out of Atomic and Moleculular "
+ "particles, and those may interact and react with one another.", //25

"Let's now talk about these particles starting with the SUBATOMIC PARTICLES.", //26

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Second Lesson Part 1 Results

//Right
"Correct! You observed well! P for the Positive PROTON!", //27

//Wrong
"Oh, you missed it a bit. The positively charged subatomic particle is the PROTON.", // 28

//Notes
"The PROTON was discovered in 1886 by Scientist Eugene Goldstein, might need to take note of that!", // 29

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Second Lesson Part 2 Results

//Right
"Nice one! It is the ELECTR-ON or simply put, ELECTRON!", //30

//Wrong
"Oh, that was big hint though. Well, the negatively charged subatomic particle is the ELECTRON.", //31

//Notes
"Remember this piece of information that it was Joseph John Thompson, or J.J. Thompson, "
+ "that discovered it in 1897.", //32

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Second Lesson Part 3 Results

//Right
"Nice one! It is the NEUTR-ON or simply put, NEUTRON!", //33

//Wrong
"Oh, not quite there, deary. The neutral subatomic particle, meaning it is neither " 
+ "positively or negatively charged, is the NEUTRON.", //34

//Notes
"Keep in mind that this was discovered by James Chadwick in 1932, it was the latest found among the three. "
+ "Additionally, the Neutron is binded with the Proton in the Nucleus of the Atom while the Electron orbits this nucleus!", //35

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Second Lesson Review

"Okay, so we managed to have a swift lesson about SUBATOMIC PARTICLES. "
+ "And to be honest, it was a lot, so let's have a review if you managed to grasp it, okay?", //36

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Second Lesson Review Results

"Good job!", // 37

"Oh, you can try again.", // 38

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Transition to Third Lesson

"Let's end this talk with the last basic information I can impart to you, dear.", //38

"The Protons, Electrons, and Neutrons can actually help you bits of information "
+ " such as the element's Atomic Number and Mass Number. "
+ "Additionally, the number of PROTONS is equal to the number of ELECTRONS/", //39

"Let's dive right in to figuring out how to determine those!", //40

"First of all, the Atomic Number of an Element is actually equal to the number of protons it has!", //41

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Third Lesson Part 1 Results

//Right
"Well done! It has 65 Protons, meaning it would have an Atomic Number of 65.", // 42

//Wrong
"Oh, not really, dear. The Atomic Number is the same as the NUMBER OF PROTONS, meaning it's 65.", // 43

//Reminder
"Always remember, ATOMIC NUMBER IS EQUAL TO NUMBER OF PROTONS!", // 44

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Third Lesson Part 2 Results

//Right
"Correcto mundo! An Element with an ATOMIC NUMBER of 118 has 118 PROTONS!", // 45

//Wrong
"Aw. . . Dear, it is simply 118 PROTONS because its ATOMIC NUMBER is 118.", // 46

//Reminder
"PLEASE REMEMBER! ATOMIC NUMBER IS EQUAL TO NUMBER OF PROTONS!", // 47

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Transition to Fourth Lesson

"Now then, let's go discuss the Mass Number, which requires a bit of Math that I know you can do!", //48

"To calculate the Mass Number of an Element, you would need to add the TOTAL NUMBER OF PROTONS "
+ "AND THE TOTAL NUMBER OF NEUTRONS.", //49

"Sometimes, it may get confusing as some elements would be positively or negatively charged which "
+ "would CHANGE the number of Protons and Electrons. You should use the number of electrons instead!", //50

"To simplify it, MASS NUMBER = NO. OF PROTONS + NO. OF NEUTRONS or NO. OF ELECTRONS + NO OF NEUTRONS!", //51

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Fourth Lesson Part 1 Results

//Right
"Sugoi! The right answer is indeed 207! Good job, dear!", // 52

//Wrong
"Uhm... not quite, honey. The answer is 207 because of (82 + 125 = Mass Number).", // 53

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Fourth Lesson Part 2 Results

//Right
"Great insight and detective work! You got the right Mass Number of 195!", // 54

//Wrong
"I see, it kind of got confusing a bit, no? I'll explain it to you then.", // 55

//Explanation of how to solve
"First of all, it is positively charged by 4, meaning you would have to reduce the number of electrons by 4.", // 56

"And, remember that ATOMIC NUMBER is EQUAL to the NUMBER OF PROTONS, and the NUMBER OF PROTONS is equal to NUMBER OF ELECTRONS!", // 57

"With that logic, an Element with the Atomic Number of 78 has 78 PROTONS, which means it would also have 78 ELECTRONS! "
+ "But because it is positively charged by 4, it would then only have 74 ELECTRONS.", // 58

"So, the equation becomes MASS NUMBER = (78 - 4) + 121 = 74 + 121 = 195 for the Mass Number!", //59

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Transition to the near the End of Scene One

//Continuation of Main Lines
"Anyway, you go on and and do your morning routine! Don't forget to use some"
+ " SODIUM FLUOROPHOSPHATE (Na2PFO3) product so that you won't get cavities... Oh!"
+ " And some SODIUM HYDROXIDE (NaOH) based product too to clean up your body.", //60

"Oh... What did mom say about that?"
+ " SODIUM FLUOROPHOSPHATE (Na2PFO3) and SODIUM HYDROXIDE (NaOH) BASED product...", //61

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Toothpaste Question Results

//Right
"Yes! We still have some by the sink! It's the one labeled MaxWhite!", //62

//Wrong
"Excuse me? So simple! It's toothpaste! It's over there!", //63

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Bar Soap Question Results

//Right
"It's quite odd that you are asking all of these, but yes, it is that. ", // 64

//Wrong
"How many times must I correct you in a single morning? It's BAR SOAP! The SODIUM HYDROXIDE " 
+ "based product is BAR SOAP!", //65

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//End of Scene One

"You start brushing your teeth... then followed by a bath.",//66

"Now you're ready. The world awaits for you, deary. "
+ "Go on and have fun learning at STARLIGHT HIGHSCHOOL! "
+ "Bye bye now! Sending some love from me to you!", //67

"Finally, you're ready. You best be going now, you are "
+ "in serious need of learning after all of that. "
+ "I'm saying this not to hurt you, but to make you realize that there's a lot to learn. "
+ "Bye bye now.",//68

"You exit your house...",//69
				
		};
	}
	

	public class questions{
		static String questionText[] = { 

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//To Do After Wakeup

"Hmmm... What should I do now?",//0

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//First Lesson Question

"CHEMISTRY is a branch of Science that studies matter when?", //1

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Second Lesson Part 1 Question

"There are three known SUBATOMIC PARTICLES, could you tell me which one of them is positively charged? " +
"A bit of a hint, the first letter of its name is the same as the first letter of Positively. . .", // 2

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Second Lesson Part 2 Question

"Let's go for another one, this one is the negative subatomic particle. Could you tell me what it is? " +
"I'll give you another hint, this is sort of related to ELECTRICITY, especially to the first six (6) " 
+ "letters of that word!", //3

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Second Lesson Part 3 Question

"What about the subatomic particle that is considered to be NEUTRAL? " +
"Hint! The name of it is just replacing the last two (2) letters of the word NEUTRAL!", //4

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Second Lesson Review Questions

"What is the subatomic particle that is neither Positive nor Negative?", //5, 1

"What would be the name of the particle that is (+)?" , //6, 2

"A negatively charged particle is called?", //7, 3

"The latest of three that James Chadwick discovered in 1932!", //8, 4

"It was discovered by J.J. Thompson, in 1897, what is it?", //9, 5

"What was discovered in 1886 by Eugene Goldstein?", //10, 6

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Third Lesson Part 1 Question

"With that, what is the ATOMIC NUMBER of an element with 65 PROTONS?", // 11

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Third Lesson Part 2 Question

"If an element has an ATOMIC NUMBER of 118, how many PROTONS does it have?", // 12

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Fourth Lesson Part 1 Question

"Now then, if an Element has 82 PROTONS and 125 NEUTRONS, what would be its MASS NUMBER?", // 13

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Fourth Lesson Part 2 Question

"Let's try an Element(+4) or is POSITIVELY CHARGED by 4 with an ATOMIC NUMBER of 78 and 121 NEUTRONS, what is the MASS NUMBER?", // 14

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Toothpaste Question

"What is SODIUM FLUOROPHOSPHATE?"
+ " She said something about cavities... What could it be?", //15

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Bar Soap Question Results

"What about SODIUM HYDROXIDE? Isn't that just...", //16

		};
	}
}
