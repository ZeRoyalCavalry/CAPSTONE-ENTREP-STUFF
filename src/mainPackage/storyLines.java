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
				
				//Result for each of the four options
				"You exit the bedroom. . .",//7
				"It's the first day of classes... Nothing is there to review...",//8
				"Wow... The world is absolutely just gorgeous...",//9
				"I'm still tired, I'm gonna sleep again...",//10
				
				//Picked Good
				" Good morning to you, dear!",//11
				
				"I hope you had a swell sleep. "
				+ "You need everything for your first day at Starlight!",//12
				
				//Picked bad
				"GET OUT OF THAT ROOM!!! \nRIGHT THIS MOMENT!!!",//13
				
				"What are you doing dozing off in your room?!"
				+ " I already heard the alarm and you aren't up yet?!", //14

				"Because of that, you also lost some CP or Chance Points!",//15

				"Wait, deary, remember to check your CP... Do you know what those are? They determine how many"
				+ " times you can make mistakes left before you have to restart.",//16

				"And I assume you know what XP is?",//17

				"You don't? My, oh my, that's your experience points. It shows "
				+ "how much you've progressed with all the right and good you've done.",//18

				"Gosh, if only you didn't have too much MELATONIN in your system!"
				+ " You would have woke up early and also not lost some Chance Points!",//19
				
				//Continuation of Main Lines
				"Anyway, you go on and and do your morning routine! Don't forget to use some"
				+ " SODIUM FLUOROPHOSPHATE (Na2PFO3) product so that you won't get cavities... Oh!"
				+ " And some SODIUM HYDROXIDE (NaOH) based product too to clean up your body.",//20

				//For the Melatonin Question
				"Melatonin is associated with Happiness, right?",//21
				"Melatonin is associated with Pleasure, right?",//22
				"Melatonin is associated with Sleepiness, right?",//23
				"Melatonin is assocaited with Aggressiveness, right?",//24

				//Results for the Choices
				"Why yes, good that you remember.",//25, right answer
				"No!!! How could you forget? Melatonin is associated with Sleepiness! "
				+ "Don't you forget it! Just do your routine now and get ready for school.",//26, wrong answer

				"Oh... What did mom say about that? SODIUM FLUOROPHOSPHATE (Na2PFO3) and SODIUM HYDROXIDE (NaOH) BASED product...",//27

				//For the Toothpaste Question
				"Yes! We still have some by the sink! It's the one labeled MaxWhite!",//28 right 
				"Excuse me? So simple! It's toothpaste! It's over there!",//29 wrong

				//For the Bar Soap Question
				"It's quite odd that you are asking all of these, but yes, it is that. ",// 30 right
				"How many times must I correct you in a single morning? It's BAR SOAP! The SODIUM HYDROXIDE " 
				+ "based product is BAR SOAP!",//31 wrong

				"You start brushing your teeth... then followed by a bath.",//32

				"Now you're ready. The world awaits for you, deary. "
				+ "Go on and have fun learning at STARLIGHT HIGHSCHOOL! "
				+ "Bye bye now! Sending some love from me to you!", //33

				"Finally, you're ready. You best be going now, you are "
				+ "in serious need of learning after all of that. "
				+ "I'm saying this not to hurt you, but to make you realize that there's a lot to learn. "
				+ "Bye bye now.",//34

				"You exit your house...",//35


				//A WALK TO SCHOOL contributiong of CHY and Pablo
				"It's time to rush, your friends are waiting for you. "
				+ "You wanted to meet up with your friends as the church just as you planned. "
				+ "Instead, you went directly to school of meeting up with your friends.", //36

				"It suddenly rained heavily while you were going to school "
				+ "that's why you went to the nearest shelter, "
				+ "so that you won't get wet and you can also have a time to take out your umbrella.",//37
				
				"Now that you have your umbrella it's time to walk straight to school before things gets worse. "
				+ "However, you saw your crush stranded on a small roof sheltering waiting for the rain to stop", //38
				
				//CRUSH SITUATION contributed by CHY and Pablo

				"Hey! Excuse me! We go to the same school, do you think we could share that umbrella? I forgot mine eh...",//crush, 39
				
				//Chose to help
				"Oh thank God, you are exactly what I need at this time.",//crush, 40
				"It was surreal. You couldn't believe you had this moment. . .",//character in his mind, 41, narrationFont
				"Uh hey, let's go now.", // 42
				"Blanking out from its surrealness, " + subInGender + " had to get your attention. . .", //43, right or offered help
				
				//Ignored
				"You felt the guilt of not being to able to help " + subInGender + ", you have regrets in a way.", //44
				
				//At school
				"You finally arrived at the school", //45, narration

				"It's about time, what made you almost late today huh?", //46, friend1
				"You almost forgot that there was school today? Woah, that's something.",//47, friend1
				
				"Enough with those explanations, lets just go in because we're going to be late.", //48, friend2
				
				"Okay!",//49, character and friend1 together
				
				//CAFETERIA
				"It's lunchtime. You and your friends went to the cafeteria to eat", //50, narrationFont
				"Over there! I see a table, hurry before someone gets there before us", //51, Friend 1
				"As the rest brought their meals and drinks, you brought over a "
				+ "Chicken Combo Meal and a bottle of Softdrink", //52, narrationFont

				//For Softdrinks question
				"OH MY GOSH!! Is that really you? didn't expect you to get that" , //53 right
				"NOO! Have you forgotten this already it was in our exams! + It looks like we need to have lessons while eating our meals" ,  //54  wrong

				"And what about the chocolate bar you're having for dessert? What's the chemical name and formula of sugar in it?", //Friend 2 //55

				//For sugar question
				"Alright alright you beat me into it, you're a genius!" , //56 right
				"Are you for real?? Sugar?? We intake this almost everyday. You should know this by now!! + It's just sucrose with the chemical formula of C12H22O11" ,  //48  wrong

				"I'm envious of you, your meals are all delicious!!! All i got is Noodles with spam and water. " 
				+ "I have a question for both of you and if you get it right you can have my spam, now what is the chemical formula of sodium?",  //Friend1 //49

				//For sodium question
				"DARN IT! I shouldn't have promised now my spam is gone T_T" , //50 right
				"Well atleast my spam won't be gone hohoho ^-^ but since you tried the chemical formula for sodium is Na, better luck next time!!" ,  //51  wrong

				"Goodluck with your lunch study sessions, I'm outta here to buy myself a food in the cafeteria" ,  //Friend 2
				"Hey, wait a minute let's wash our hands first we forgot to do this important step before eating.", //Character
				"Yep! It almost slipped my mind, thank God you're here!!" , //Friend 2 //52

				//WASHROOM
				"It's always important to practice good hygiene, especially before eating. "
				+ "We should wash our hands with soap and water for at least 20 seconds to ensure that we're removing "
				+ "any dirt, germs, or bacteria that might be on our hands. Now do you know the chemical name and formula or hand liquid soap?" ,  //Character //53

				//For hand liquid soap question
				"Well done! now apply it properly on your hands so we can safely eat after this" , //50 right
				"Too bad, well its a hard on anway but while applying it let me inform you that it's chemical name is Sodium Hydroxide with the C17H35COONa as its chemical formula" ,  //51  wrong

				"That's so refreshing!! Let's go back now to our table, I'm feeling so hungry right now" ///52

		};
	}
	
	public class questions{
		static String questionText[] = { 
				
				"Hmmm... What should I do now?",//0
				
				"MELATONIN? What is that associated with? "
				+ "She mentioned something about melatonin preventing me from waking up too early... "
				+ "Maybe that has something to do with it?",//1
				
				"What is SODIUM FLUOROPHOSPHATE?"
				+ " She said something about cavities... What could it be?",//2

				"What about SODIUM HYDROXIDE? Isn't that just...",//3

				"Should I help or not?"//4
		};
	}
}
