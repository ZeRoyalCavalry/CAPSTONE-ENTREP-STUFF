package mainPackage;

public class storyLines implements java.io.Serializable{
	
	public static String gender, gender1, gender2, gender3, SOName;

	public class dialogues {

		public static String diaText[] = {
				
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
"Good morning to you, my dear " + Game.playerName + "!",//11

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
+ "in a nearby covered area. You can hear them complain and stomp on the ground as you stepped.", //92

///--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/// Meeting possible crush

"You opened your umbrella and walked a few paces down the road until you reached the corner. . .", //93, narration

"You took a peek to the side and noticed that at the other covered waiting area, "
+ "you found the source of all these angry comments about life.", //94

"Why?! Why did it just have to rain?!", // 95, crush

"It just really had to be the day I forgot to put my umbrella in my bag!", //96

"As " + gender1 +" continued on rambling about it, " + gender3 + " anger turned to sorrow. "
+ "The groans turned to sobs as " + gender1 + " expects to be stranded without ever getting to where they need to be.", //97, narration

"You slowly approach " + gender3 + "...", //98, narration

"*sobs* *sobs*", //99, crush

"Oh, *wipes tears*, hello there. . .", //100, crush

"You come over to " + gender3 + " and waved a little bit.", //101, narration

"You said that you were passing by and heard a noise. You asked what happened that made " + gender3 + " upset. . .", //102, narration

"Oh, well, if you were hearing my rants... I—I forgot my umbrella and now it's raining hard.", //103, crush

"I don't know what to do, I'd be late on my first day of school and I was so excited to see it for the first time too!", //104, crush

gender + " mentioned about going to school. You were curious so you had to ask which school they were going to. . .", //105, narration

"Oh, it's Starlight Highschool. I got... accepted to it and my parents really wanted me to go there for the hands-on education.", //106 crush

"The odd pause made you suspicious but the problem of getting to school is now a problem for the both of you.", //107, Narration

"You could help " + gender3 + " by sharing the umbrella. . . But the two of you might get wet.", //108, Narration

"Maybe it would be best if you share the umbrella until you find a convenience store so " + gender1 
+ " can possibly buy one.", //109, narration.

"You tell them that you are a student of Starlight Highschool as well, so you would be going there too.", //110, narration

"You then suggest to them that you could share your umbrella and find a convenience store  ", //111, narration

gender + " thought about it, it seems that they'd rather be wet by the rain than late and absent.", //112, narration

"Alright! Thank you! Uhm... I'm sorry for asking this late but, what's your name?", //113, crush

"You tell them your name is " + gameStory.name + ".", //114, narration

"Oh, that's a pretty nice name! Nice to meet you, I'm " + SOName + ".", //115, crush

"\"" + SOName + " also sounds like a nice name\", you thought.", //116, narration

"Let's get going now, then?", //117, crush

"You nod your head, and now you're off like two bonded elements drifting in the cosmos, confused and lost, "
+ "but has a certain destination to reach.", //118, narration

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// On the way to a convenience store

"A couple of droplets here, there, and everywhere. H2O splashing round about the two of you. As annoying as "
+ "the rain could be, it was so serene. The world is—", //119, narration

"Say... Something Please...", //120, crush, Electron Config Song - 1s2 2s2 2p6

"Sounds like " + SOName + " is singing something that you can hear amidst this light storm that's "
+ "brewing around and about. The tune, the melody, and the humming, it sounds... beautiful.", //121, narration

"Something Passionate, Something Dear.", //122, crush, Electron Config Song - ... 3s2 3p6 4s2 3d10

"Plentiful Signs, Downright Polite.", //123, crush, Electron Config Song - ... 4p6 5s2 4d10 5p6

"See Faitful Destiny Partly Suffice.", //124, crush, Electron Config Song - ... 6s2 4f14 5d10 6p6 7s2

"Forever Dedicated. . . to your Pretty Smile.", //125, crush, Electron Config Song - ... 5f14 6d10 7p6 8s2

gender + " kept on repeating that song as the rain slowly starts going away.", //126 narration

"You were curious about it, but you couldn't ask until the rain was gone so that you'd understand her properly.", //127, narration

"Around 5 minutes of walking, you found a convenience store nearby and the both of you entered it.", //128, narration

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// In the convenience Store
"Good morning! Welcome to the High Eleven, ma'am and sir! Please have a look around.", //129, store clerk

"Good morning and thank you!", //130, crush

gender + " said that you could just wait for them near the counter as they try to find the umbrella that they sell at High Eleven.", //131 narration

"As you wait, you can't help but to try and figure out the song. It doesn't sound like a pop song, or any released song you've "
+ "heard on the internet. It sounds unique, but most importantly, it sounds cryptic.", //132, narration

"You begin to write in your notebook the lyrics. . . (Write in your notes tab the following, don't forget to hit SAVE in notes)", //133, narration

"Say Something Please,", //134, narration
"Something Passionate, Something Dear,", //135, narration
"Plentiful Signs, Downright Polite,", //136, narration
"See Faithful Destiny Partly Suffice,", //137, narration
"Forever Dedicated (to your) Pretty Smile", //138, narration

"\"s, s, p, s, p, s, d, p, s, d, p, s, f, d, p, s, f, d, p, s,\" seems like a weird combination of letters.", //139, narration.

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Pre-Lesson Talk

"Oh!", //140, crush

"You heard me singing? How embarassing!", //141, crush

gender + " gave out a chuckle but also seem surprised that you were actually listening.", //142, narration

"Well, uhm, anyway, do you recognize that sequence? You said you are a Starlight Highschool so that must be familiar!", //143, crush

"Now that " + gender1 + " mentions it. . . It does look familiar to you. You just can't recall what it really is exactly.", //144, narration

"Well, I don't really want to pressure you too much, that's the Electron Configuration sequence.", //145, crush

"Do you remember it now?", //146, crush

"You shook your head, although familiar, not crystal clear enough about that topic.", //147, narration

"Oh, well, you see, there's that sequence and each letter represents an orbital and holds a specific number of electrons. "
+ "I think you're quite familiar with like the atomic numbers and stuff?", //148, crush

"You nod your head, explaining to them that you were sort of reviewed by your mother about that topic "
+ "before you left the house.", //149 narration

"Wow, I wish my mom or dad would also do that for me. . . Ah, well, before we get side tracked, I'll explain this to you first. "
+ "I think we still have some time to discuss this.", //150, crush

"You can see a small tear drop from their eye, but it seems too sensitive to talk about, not to mention you aren't that close to "
+ gender3 + " yet. Looks like it's time for a new lesson!", //151, narration

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Lesson Talk

"So let's start by knowing each letter is an orbital, and the orbitals that hold the \'s\' letter can only store up to two(2) electrons. "
+ "This means that you would have to fill up the orbital with two(2) electrons before jumping to the next orbital.", //152, crush

"The orbitals that are represented by the \'p\' letter can store up to six(6) electrons. The ones that are the \'d\' can "
+ "hold at most ten(10) electrons. Lastly, the \'f\' one can hold the most, with a maximum of fourteen(14) electrons!", //153, crush

"Let's summarize that then. \'s\' = 2, \'p\' = 6, \'d\' = 10, and \'f\' = 14. However, you can't just use which letter you want "
+ "in the order that you want to have the total amount of electrons equal to the atomic number.", //154, crush

"\"s, s, p, s, p, s, d, p, s, d, p, s, f, d, p, s, f, d, p, s,\" is the correct letter sequence but let's add the correct "
+ "energy level numbers to those orbital letters.", //155, crush

"There we go! That's more like it! I think I also forgot to mention what an \"orbital\" is but essentially, it is "
+ "like the different places the electron follows when circling around the atomic nucleus.", //156, crush

"(Take note of this) \n1s, 2s, 2p, 3s, 3p, 4s, 3d, 4p, 5s, 4d, 5p, 6s, 4f, 5d, 6p, 7s, 5f, 6d, 7p, 8s"
+ "\n The sequence of letters are also similar to the poem or song. If you want to memorize it, maybe use that as a reference!", //157, narration

"To clarify, the number to the left of the letter represents the energy level of the orbital, the letter is the type "
+ "of orbital it is and how many electrons it can hold, and the letter to its right is the number of electrons it holds.", //158, crush

"I'll give you a simple example first, let's start with my favorite element, Carbon! Carbon has an atomic number of 6. "
+ "\nIts electron configuration would be: 1s2 2s2 2p2. 2 + 2 + 2 = 6, and 6 is our Atomic Number, making it equal and correct!", //159, crush

"Let's have you try now then, shall we?", //160, crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Fifth Lesson Question 1 Results

//Answer Input Processing
"Let's see if you understood what I said. . .", //161, crush

//Right
"Well done! You caught on fast! A total of 8 is certainly equal to the Oxygen's Atomic Number of 6.", //162, crush

//Wrong
"Oh. . . Hm, well, it does seem like a fairly new topic for you so, we'll keep practicing. "
+ "\nThe correct answer is also 1s2 2s2 2p4.", //163, crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Fifth Lesson Question2 Results

//Answer Input Processing
"And the results for the second question is. . .", //164, crush

//Right
"Let's go! You're really a great listener! That definitely totals to 50!", //165, crush

//Wrong
"Oh, well, a bit unfortunate but I have confidence that you'll answer the next one correctly. It was a tough one after all."
+  "\nAlso, the correct answer was, \"1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p2.\"", //166, crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Fifth Lesson Question 3 Results

//Answer Input Processing
"The electron configuration you answered is. . .", //167, crush

//Right
"Correct! Giving you that hard one must have really prepared your mind now!", //168, crush

//Wrong
"Aw, still a bit tricky huh? Let's still try to test your brain, have hope!"
+  "\nOh right, the correct answer is \"1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p2.\"", //169, crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Fifth Lesson Question 4 Results

//Answer Input Processing
"And monsieur's answer is. . .", //170, crush

//Right
"Oui! Oh, my bad, a bit of French came out but I'm just happy that you got to answer that correctly!", //171, crush

//Wrong
"Okay, seems like that was your Kryptonite, Superman. Don't worry, some heroes fall but they rise again!"
+  "\nThe correct sequence is \"1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p2.\"", //172, crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Fifth Lesson Question 5 Results

//Answer Input Processing
"Let's see if you got this really long one right. . .", //173, crush

//Right
"Yay! You got it right, I'm so proud of you! That was the toughest one by far and you still got it right!", //174, crush

//Wrong
"Well, it was the most difficult one. Don't be discouraged, at least you are trying and I'll give you more chances."
+  "\nThe correct answer to that curve ball was \"1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p2.\"", //175, crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Fifth Lesson End

"That was really a lot! Let's take a breather for a bit.", //176, crush

"Dear player, please take a break for about 5 minutes in real life before continuing. "
+ "\nRemember to hydrate and also review your notes!", //177 narration

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Sixth Lesson Start

"Alrighty, let's get back to it. It seems like the rain outside is still heavily pouring, "
+ "and we have 5-10 minutes to spare before we have to really go.", //178 crush

"Let's start expanding your knowledge more then, shall we?", //179 crush

"The next topic would still be Electron Configuration, but what I taught you is like, the long method. "
+ "There's another way to write an element's Electron Configuration and that's by using the Noble Gas Configuration!", //180 crush

"So, technically this is the shortcut and I did make you stress out on remembering that long method. . . I'm sorry "
+ "but, hey! At least now you're gonna know both the Long and Short Method! The more the merrier! *chuckles*", //181, crush

"Let's get to it!", //182, crush

"A while ago, before " + gender1 + " taught you, " + gender1 + " had a memory about their parents that made " 
+ gender3 + " sad. . . But now, " + gender1 + " seem really pumped! Maybe you're helping " + gender3 + " forget by letting them teach!", //183 narration

"Our lesson about Electron Configuration involved writting each and every single energy level, orbital, and electron number "
+ "per element. However, like I said, there is a shortcut method to this! It is called the Noble Gas Configuration.", //184 crush

"It is called the Noble Gas Configuration because we use the available Noble Gas before that element to "
+ "sum up some of the electron configurations before writing the remaining ones.", //185 crush

"It appears that Noble Gases are the best shortcut ones because they are at the end of the Periodic Table, "
+ "and they all end on a \'p6\' orbital.", //186 crush

"You gave a look of disbelief with the fact that such patterns exists on the Periodic Table. "
+ gender + " noticed this and gave side-eyed you with it.", //187 narration

"Oh really now? You don't believe me? I'll show you then!", //188 crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Further Explanation

"Oh wow, it seems as questioning a person's knowledge could really be offensive. Well, at least "
+ "they'll explain more now.", //189 narration

"Helium (He) is the only exception to that pattern! As Helium is just 1s2, but the rest?! You "
+ "better take notes of these!", //190 crush

"Neon (Ne) with an Atomic Number of 10 has this configuration: \n1s2 2s2 2p6. It ends on \'p6.\'", //191 crush

"Argon (Ar) with an Atomic Number of 18 has this configuration: \n1s2 2s2 2p6 3s2 3p6. Ended on a \'p6\' again.", //192 crush

"Krypton (Kr) with an Atomic Number of 36 has this configuration: \n1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6. See? Ends with a \'p6\' again.", //193 crush

"Xenon (Xe) with an Atomic Number of 54 has this configuration: \n1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p6. Need I say more?", //194, crush

"Radon (Rn) with an Atomic Number of 86 has this configuration: \n1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p6 6s2 4f14 5d10 6p6. "
+ "See?! They all end on a \'p6!\'", //195, crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Some Character Reveal

"You see " + gender3 + " have gritted teeth and with this irritation before it fades when this moment "
+ "of realization hits " + gender3 + ".", //196, narration

"I—I'm sorry, I didn't mean to— I lost control of my emotions... I—I'm really sorry.", //197 crush

"You take their hand instictively, tell them that it's alright. You tell " + gender3 + " that you can "
+ "feel a heavy burden that's bothering " + gender3 + ".", //198 narration

"Ah... Yes, I—Ah! I'm sorry again!", //199 crush

"They seem embarrassed with, well, opening up to a person they just met and more so that " + gender1 +
" held on to your hand.", //200 narration

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Lesson Continuation

"Anyway, uhm, sorry again. Let's just pretend that didn't happen. Let's continue with the lesson.", //201 crush

"It might sound a bit difficult to understand but, I'll give you an example first.", //202 crush

"The Element Sodium (Na) has an Atomic Number of 11. It has an electron configuration of "
+ "\"1s2 2s2 2p6 3s1.\" As you can see, it has the Electron Configuration of Neon(Ne).", //203 crush

"So, instead of writing the whole thing as \"1s2 2s2 2p6 3s1,\" we can write it as "
+ "\"[Ne] 3s1\" because [Ne] or Neon substitutes the value of \"1s2 2s2 2p6.\"", //204 crush

"Kind of get it? Well, let's see then. I'll give you some questions and you'll solve them again.", //205, crush

"Compared to when they were asking you about the Long Method for Electron Configuration, "
+ SOName + " seems. . . cold or distant now. You'll just have to check up on " + gender3 + " later.", //206, narration

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Sixth Lesson Question 1 Results : Question 1 - Right answer: [Kr] 5s1 4d10 

//Answer Input Processing
"Let's see what did you put. . .", //207, crush

//Right
"Nice! I'm so thankful that you got the answer of [Kr] 5s1 4d10. Makes me feel like I'm actually teaching someone properly.", //208, crush

//Wrong
"Okay, a bit of problem there but we can always try again. The correct Noble Gas Configuration was also [Kr] 5s1 4d10. . .", //209, crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Sixth Lesson Question 2 Results : Question 2 - Right answer: [Xe] 6s2  

//Answer Input Processing
"O\' what has our monsieur answerd now?", //210 crush

//Right
"Amazing! You got it right, Barium indeed has a Noble Gas Configuration of [Xe] 6s2!", //211, crush

//Wrong
"Ah... Don't lose hope, I'm sure you'll get the next one. The correct answer is [Xe] 6s2, by the way.", //212, crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Sixth Lesson Question 3 Results : Question 3 - Right answer: [Kr] 5s2 4d10 5p6 

//Answer Input Processing
"To be, or not to be, the answer we shall see. . .", //213, crush

//Right
"To be indeed! You got the correct answer of [Kr] 5s2 4d10 5p6!", //214, crush

//Wrong
"To not be, I guess, it's okay. Subsitituting may be hard after all, so let's correct your answer to [Kr] 5s2 4d10 5p6.", //215 crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Sixth Lesson Question 4 Results : Question 4 - Right answer: [Ar] 4s2 3d7 

//Answer Input Processing
"A bit of a low risk for this one, let's see if you got the reward. . .", //216 crush

//Right
"A hook and a sink! You got the catch right there! The correct answer of [Ar] 4s2 3d7!", //217 crush

//Wrong
"Oof, took another hit, huh? You ain't down yet, you can rise up! Let's correct that to [Ar] 4s2 3d7.", //218 crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Sixth Lesson Question 5 Results :  Question 5 - Right answer: [Rn] 7s2 5f4

//Answer Input Processing
"And for the final question. . .", //219 crush

//Right
"We now have a champion! *laughs* I'm just kidding, but that was impressive that you got [Rn] 7s2 5f4.", //220 crush

//Wrong
"I think there's something missing? Well, we'll just have to see then since the correct answer is [Rn] 7s2 5f4.", //221 crush

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Sixth Lesson-Scene Two/Level Two End

"So there's been a lot, and, I think you'd need a lot of time to understand that lesson. "
+ "So let's go have a— Oh wait! We need to go now before we're late for the School Year Opening Ceremony!", //222 Crush

"It seems that you didn't just learn something about Chemistry, but you also learned something about your "
+ "fellow schoolmate. " + gender + " seems interesting. . .", //223 narration

"Maybe you learned a different kind of Chemistry as well, you can't describe it clearly but, it seems "
+ "like the two of you didn't just configure those Chemistry, but your Relationship Chemistry too.", //224 narration

"The two of you run off to school, and it seems like the rain stopped while the two of you were in "
+ "the \"moment.\"", //225 narration

"\"Maybe there really is always a rainbow at the end of every storm,\" you thought as you watched "
+ gender3 + " run out the store.", //226 narration

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Sixth Lesson-Scene Two/Level Two End

"A sprint here, and there. A bag and body inspection of guards at the gate. After all that, you finally see "
+ "the magnificent structure of your new alma mater.", //227 narration

"\"Starlight Highschool, I've heard many curious things about you,\" you thought," //228, narration

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
//Scene Two Questions
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Fifth Lesson - Electron Configuration (Long Method) Questions

"What is the electron configuration of Oxygen if it has an Atomic Number of 8? \n(Do not put commas. Answer Input should look like: 1s2 2s2 2p6 ...)", //23, Question 1

"Let's try something harder. What is the electron configuration of Tin if it has an Atomic Number of 50? \n(Do not put commas. Answer Input should look like: 1s2 2s2 2p6 ...)", //24, Question 2

"Let's tone it back down with Sulfur, what would be its electron configuration if it has an Atomic Number of 16? \n(Do not put commas. Answer Input should look like: 1s2 2s2 2p6 ...)", //25, Question 3

"What about Krypton if its Atomic Number is 36? What could be its electron configuration? \n(Do not put commas. Answer Input should look like: 1s2 2s2 2p6 ...)", //26, Question 4

"Last before we do a review, what would be the electron configuration of Radon if it has an Atomic Number of 86? \n(Do not put commas. Answer Input should look like: 1s2 2s2 2p6 ...)", //27, Question 5

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Sixth Lesson - Noble Gas Configuration Questions

"Silver (Ag) has a Periodic Number of 47, what would be its Noble Gas Configuration?"
+ "\n(Answer Format: [Noble Gas] 1sX 2sX 2pX; Example: [He] 2p1)", //28, Question 1 - Right answer: [Kr] 5s1 4d10 

"Barium (Ba) is the 56th Element, what would be its Noble Gas Configuration?"
+ "\n(Answer Format: [Noble Gas] 1sX 2sX 2pX; Example: [He] 2p1)", //29, Question 2 - Right answer: [Xe] 6s2

"If Xenon (Xe) is a Noble Gas and and an Atomic Number of 54, what is its Noble Gas Configuration?"
+ "\n(Answer Format: [Noble Gas] 1sX 2sX 2pX; Example: [He] 2p1)", //30, Question 3 - Right answer: [Kr] 5s2 4d10 5p6 

"Cobalt (Co) has 27 Protons, having said that, its Noble Gas Configuration would be?"
+ "\n(Answer Format: [Noble Gas] 1sX 2sX 2pX; Example: [He] 2p1)", //31, Question 4 - Right answer: [Ar] 4s2 3d7 

"If Uranium (U) has 92 Electrons, what would be its Noble Gas Configuration?"
+ "\n(Answer Format: [Noble Gas] 1sX 2sX 2pX; Example: [He] 2p1)", //32, Question 5 - Right answer: [Rn] 7s2 5f4

		};
	}

}
