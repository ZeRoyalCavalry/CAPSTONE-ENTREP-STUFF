package mainPackage;

import mainPackage.colorText;

public class storyLines implements java.io.Serializable{
	
	public static String subInGender;
	static colorText notes1 = new colorText("PROTON");

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
"Good morning to you, my dear " + gameStory.name + "!",//11

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

"Anyway, I heard that you're going to be heavy on CHEMISTRY for a few weeks.",//19

"So, let's have a bit of a lesson then, shall we?",//20

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//First Lesson Result

//Right
"Good job! It's all about studying matter when it undergoes CHANGES, specifically chemical changes.",//21

//Wrong
"Oh! I'm so sorry, dear, it studies matter when it undergoes CHANGES, "
+ "specifically CHEMICAL CHANGES, hence why it is called CHEMISTRY.",//22

"Most especially, it focuses on the PROPERTIES and ATOMIC OR MOLECULAR STRUCTURE"
+ " the matter possesses before and after such changes occurs!",//23

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

"Let's end this talk with the last basic information I can impart to you, dear.", //39

"The Protons, Electrons, and Neutrons can actually help you bits of information "
+ " such as the element's Atomic Number and Mass Number. "
+ "Additionally, the number of PROTONS is equal to the number of ELECTRONS.", //40

"Let's dive right in to figuring out how to determine those!", //41

"First of all, the Atomic Number of an Element is actually equal to the number of protons it has!", //42

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Third Lesson Part 1 Results

//Answer Input Processing
"And your answer for the Element's Atomic Number is. . .", //43

//Right
"Well done! It has 65 Protons, meaning it would have an Atomic Number of 65.", // 44

//Wrong
"Oh, not really, dear. The Atomic Number is the same as the NUMBER OF PROTONS, meaning it's 65.", // 45

//Reminder
"Always remember, ATOMIC NUMBER IS EQUAL TO NUMBER OF PROTONS!", // 46

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Third Lesson Part 2 Results

//Answer Input Processing
"The Number of Protons you calculated is. . .", //47

//Right
"Correcto mundo! An Element with an ATOMIC NUMBER of 118 has 118 PROTONS!", // 48

//Wrong
"Aw. . . Dear, it is simply 118 PROTONS because its ATOMIC NUMBER is 118.", // 49

//Reminder
"PLEASE REMEMBER! ATOMIC NUMBER IS EQUAL TO NUMBER OF PROTONS!", // 50

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Transition to Fourth Lesson

"Now that that's over, let's proceed to the Mass Number, which requires a bit of Math that I know you can do!", //51

"To calculate the Mass Number of an Element, you would need to add the TOTAL NUMBER OF PROTONS "
+ "and THE TOTAL NUMBER OF NEUTRONS.", //52

"Sometimes, it may get confusing as some elements would be positively or negatively charged which "
+ "would CHANGE the NUMBER OF ELECTRONS, depending if it was (+) or (-).", //53

"To simplify it, MASS NUMBER = NO. OF PROTONS + NO. OF NEUTRONS! \nAlso remember that NO. OF NEUTRONS = " 
+ "MASS NUMBER - NO. OF PROTONS, NO. OF ELECTRONS = ATOMIC NUMBER + (-) ions or ATOMIC NUMBER - (+) ions.", //54

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Fourth Lesson Part 1 Results

//Answer Input Processing
"A little Math training, let's see if you got it . . .", //55

//Right
"Sugoi! The right answer is indeed 207! Good job, dear!", // 56

//Wrong
"Uhm... not quite, honey. The answer is 207 because of (82 + 125 = Mass Number).", // 57

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Fourth Lesson Part 2 Results

//Answer Input Processing
"Let's see if the managed to solve this tricky one. . .", //58

//Right
"Great insight and detective work! You got the right Mass Number of 195!", // 59

//Wrong
"I see, it kind of got confusing a bit, no? I'll explain it to you then.", // 60

//Explanation of how to solve
"Let's discuss that. It is positively charged by 4, meaning you would have to reduce the number of electrons by 4.", // 61

"And, remember that ATOMIC NUMBER is EQUAL to the NUMBER OF PROTONS, and the NUMBER OF PROTONS is equal to NUMBER OF ELECTRONS!", // 62

"With that logic, an Element with the Atomic Number of 78 has 78 PROTONS and also 78 ELECTRONS. "
+ "Additionally, the number of Electrons would be 74 because of its (+4).", // 63

"However, we only need to find the MASS NUMBER, so how we solve it is by (MASS NUMBER = 78 + 117 = 195)! "
+ "I just threw in an ion charge to confuse you a bit.", //64

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Combined Third and Fourth Lesson Review

"Phew! Exercising the brain can really be tiring, but knowledge is power afterall! "
+ "With all that's said and done, let's have another review for what we just discussed, shall we?", //65

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Combined Third and Fourth Lesson Review Questions

//Answer Load/Update Value
"And the result of your answer is...", //66

//Correct
"Good job, you remember!", //67

"Well done, your observation is superb!", //68

"I never doubted you!", //69

//Wrong
"Ah, a miss, you can try again.", //70

"Oh, well, there's always a second chance!", //71

"There's always a next time, you got this!", //72

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Transition to the near the End of Scene One

//Continuation of Main Lines
"Anyway, you go on and and do your morning routine! Don't forget to use some"
+ " SODIUM FLUOROPHOSPHATE (Na2PFO3) product so that you won't get cavities... Oh!"
+ " And some SODIUM HYDROXIDE (NaOH) based product too to clean up your body.", //73

"You enter the bathroom to wash up. . .", //74

"Oh... What did mom say about that?"
+ " SODIUM FLUOROPHOSPHATE (Na2PFO3) and SODIUM HYDROXIDE (NaOH) BASED product...", //75

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Toothpaste Question Results

//Right
"Yes! We still have some by the sink! It's the one labeled MaxWhite!", //76

//Wrong
"Excuse me? It's toothpaste, dear... and it's over there!", //77

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Bar Soap Question Results

//Right
"It's quite odd that you are asking all of these, but yes, it is that. ", // 78

//Wrong
"How many times must I correct you in a single morning? It's BAR SOAP! The SODIUM HYDROXIDE "
+ "based product is BAR SOAP!", //79

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//End of Scene One

"You start brushing your teeth... then followed by a bath.", //80

"Now you're ready. The world awaits for you, deary. "
+ "Go on and have fun learning at STARLIGHT HIGHSCHOOL! "
+ "Bye bye now! Sending some love from me to you!", //81

"Finally, you're ready. You best be going now, you are "
+ "in serious need of learning after all of that. "
+ "I'm saying this not to hurt you, but to make you realize that there's a lot to learn. "
+ "Bye bye now.", //82

"You exit your house...", //83
				
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Start of Scene Two

"As you walk out the door, the blinding golden rays of the sun hits you. . .", //84

"You stagger a bit before you block out the celestial majesty above with your hand.", //85

"The world greets you again, and this time, you answer its call. You feel this surge of "
+ "energy, determination, and sense of adventure.", //86

"A deep inhale and exhale, and then... you're off! You rush to meet up with your "
+ "friends at the church, just as you all planned before going to Starlight Highschool.", //87

"You huff and you puff, racing against the time and the wind. Rightfully so too as "
+ "the vibrant sky drained away, and took its place was this grayscaled atmosphere.", //88

"When you saw the heavens lose its divine look, you also hear its tears fall slowly "
+ "as a light drizzle could be heard coming in to the area you're in.", //89

"You go to the nearest shelter. . .", //90

"The day's mood is now depressed, yet you can't help but feel relaxed from the peaceful "
+ "raindrops surrounding you.", //91

"You take a moment to appreciate this before you noticed that someone seems a bit frustrated "
+ "in a nearby covered area. You can hear them complain and stomp on the ground as you got closer.", //92

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// If chose to inspect

"You opened your umbrella and walked a few paces down the road until you reached the corner. . .", //93, narration

"You took a peak to the side and noticed that at the other covered waiting area, "
+ "you found the source of all these angry comments about life.", //94

"Why?! Why did it just have to rain?!", // 95, crush

"It just really had to be the day I forgot to put my umbrella in my bag!", //96

"As " + Game.gender1 +" continued on rambling about it, " + Game.gender2 + " anger turned to sorrow. "
+ "The groans turned to sobs as " + Game.gender1 + " expects to be stranded without ever getting to where they need to be.", //97, narration

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// If chose to inspect > Approach

"You slowly approach " + Game.gender3 + "...", //98, narration

"*sobs* *sobs*", //99, crush

"Oh, *wipes tears*, hello there. . .", //100

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Approach > Watching

"What?! *steps back* Not to be rude but, doesn't that sound so stalker~ish?", //101, Crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Approach > Passing

"Oh, really? Okay, I'm sorry for this scene I caused.", //102, Crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Approach > Inspecting

"Oh, I caused that much ruckus, huh? I'm sory about that.", //103, Crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Approach > ...

"Are you not gonna say anthing? *Looks away*", //104, Crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Yes to watching > No! It's not what it seems!

"What were you doing then? Why are you here?", //105, Crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Yes to watching > No! It's not what it seems! I was just passing by

"I see... So you were just passing by, huh?", //106, Crush

"Where were you headed to?", //107, Crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Yes to watching > No! It's not what it seems! I was just passing by > To Starlight Highschool

"Oh! Really?! Could I join you then? A bit of a walk to school! You know?", //106, Crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Yes to watching > No! It's not what it seems! I was just passing by > To a friend's house

"Oh, is that so? *frowns* Well, if you have to go. I was just hoping. . . Nevermind, bye bye!", //108, Crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Yes to watching > No! It's not what it seems! I was just passing by > To the Convenience Store

"Oh! Could you help me get over there? I'd just buy an umbrella over there!", //109, Crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Yes to watching > No! It's not what it seems! I was just passing by > I don't know either

"Oh, that's... Weird? Are you okay?", //110, Crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Approach > Yes to watching > What if I was stalking? (END)

"Ew! Get away from me!", //111 Crush

Game.gender + " run away. . .", //112, Narration

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Approach > Yes to watching > I was just admiring your good looks

"What?! *flustered* Thanks, I guess? *Looks away*", 

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Approach > Yes to watching > I was just admiring your good looks > Repeat

"Seriously, what were you doing?", 

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Approach > Yes to watching > ...

"...",

"So you're just not gonna say anything, huh? Okay...",

"Uhm...",

"Where are you headed to?",

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// If chose not to inspect || If chose to inspect > Not approach || If chose to inspect > Approach > ... > Not offer help 

"There are more pressing matters at hand, don't want to be late for school now, do you?", //narration

		};
	}
	

	public class questions{
		static String questionText[] = { 

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//To Do After Wakeup

"Hmmm... What should you do now?",//0

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

"The latest of three that James Chadwick discovered in 1932?", //8, 4

"It was discovered by J.J. Thompson, in 1897, what is it?", //9, 5

"What was discovered in 1886 by Eugene Goldstein?", //10, 6

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Third Lesson Part 1 Question

"With that, what is the ATOMIC NUMBER of an element with 65 PROTONS? (Input the number only)", // 11

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Third Lesson Part 2 Question

"If an element has an ATOMIC NUMBER of 118, how many PROTONS does it have? (Input the number only)", // 12

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Fourth Lesson Part 1 Question

"Now then, if an Element has 82 PROTONS and 125 NEUTRONS, what would be its MASS NUMBER? (Input the number only)", // 13

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Fourth Lesson Part 2 Question 1

"How about an Element(+4) or is POSITIVELY CHARGED by 4 with an ATOMIC NUMBER of 78 and 117 NEUTRONS, what is the MASS NUMBER? (Input the number only)", // 14

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Combined Third and Fourth Lesson Review Questions

"An element has 58 ELECTRONS, what would be its ATOMIC NUMBER then? (Input the number only)", //15,1

"The element Oxygen has a (-2) Charge, its ATOMIC NUMBER is 8 with 8 NEUTRONS, what could be its MASS NUMBER? (Input the number only)", //16,2

"Rubidium is the 37th Element in the Periodic Table. This Alkali Metal has (+1) charge, how many ELECTRONS would it have? (Input the number only)", //17,3

"Nitrogen has a (-3) Charge and has a TOTAL OF 10 ELECTRONS, what would be its NUMBER OF PROTONS and ATOMIC NUMBER? (Input one number only)", //18,4

"If an element has a MASS NUMBER of 127 and an ATOMIC NUMBER of 53, what would be its NUMBER OF NEUTRONS? (Input the number only)", //19,5

"Hypothetical Element X has a MASS NUMBER of 176 and 127 NEUTRONS, what would be its NUMBER OF PROTONS and ATOMIC NUMBER? (Input one number only)", //20,6

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Toothpaste Question

"What is SODIUM FLUOROPHOSPHATE?"
+ " She said something about cavities... What could it be?", //21

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Bar Soap Question Results

"What about the SODIUM HYDROXIDE based product used to scrub on the body?  Isn't that just...", //22

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Inspect or Not

"Would you like to inspect the noise?", //23

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Approach or Not Approach

"Would you approach " + Game.gender3 + "?", //24

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Say what you were doing

"What were you doing?", //25

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// What do you want to admit?

"How do you explain yourself?", //26, narration

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// What do you want to admit? Part2

"What was your motive for going to her then?", //27, narration

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Crush asks where are you going

"Uhm, so, where were you headed off to?", //28

		};
	}
}
