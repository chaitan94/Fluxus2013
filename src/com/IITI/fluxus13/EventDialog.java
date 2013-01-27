package com.IITI.fluxus13;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class EventDialog extends Activity implements OnClickListener{

	TextView title;
	TextView description;
	String name, detail;
	Button remind, close;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.event);
		Bundle gotBasket = getIntent().getExtras();
		title = (TextView) findViewById(R.id.tvTitle);
		description = (TextView) findViewById(R.id.tvDescription);
		remind = (Button) findViewById(R.id.bSetRem);
		close = (Button) findViewById(R.id.bCloseEventDialog);
		remind.setOnClickListener(this);
		close.setOnClickListener(this);
		name = gotBasket.getString("naam");
		switch ((gotBasket.getInt("typeEvent"))) {
		case 0:
			switch ((gotBasket.getInt("key"))) {
			case 0:
				detail = "Get ready to clutch your sides and tear up at a night of wit, humour and jest as the one and only, ________ forces you to forget all your pains and worries and double up with laughter. A night of giggles and guffaws beckons you...!!!";
				break;
			case 1:
				detail = "All the guys and girls in the crowd let your hair loose and head-bang to the rhythm of the beats as the music builds you up to a crescendo of fun and joy.";
				break;
			case 2:
				detail = "It's gonna be a night of Salsa and Jive, Bhangda and Kathak. Watch as the Sridevis, Rekhas and Hrithiks of Indore dazzle you with their moves to the tune of your heartbeats. Dance Indore Dance!!!";
				break;
			}
			break;
		case 1:
			switch ((gotBasket.getInt("key"))) {
			case 0:
				detail = "Model United Nations is an academic simulation of the United Nations bringing it down to the level of our own city, Indore with the aim of educating participants about current events, topics in civil relations, diplomacy etc. So we invite all aspiring politicians, civil servants and everyone else to take advantage of this platform to hone your skills as well as have some fun.";
				break;
			case 1:
				detail = "This event will test your trading skills and ability to deduce the effects of news and events on stock market and share prices. Compete against other people, buying and selling virtual stocks, invest wisely, Analyze, strategize and gamble to finish up with the highest net worth of stocks and take away the prize.";
				break;
			case 2:
				detail = "Kkkkkiran... Think you can act...??? Let's see. Act yourself out on a theme provided. Fair warning - Its not gonna be that easy...";
				break;
			case 3:
				detail = "Let's get your adrenaline pumped up. Hold your breath for the most spectacular and dangerous stunts that will surpass your imagination";
				break;
			case 4:
				detail = "A marvelous opportunity to stir people up by stirring your feet. You choose the number of feet and we judge the rhythm. Welcome to a night of fun and frolic where the best dance groups will be pitted against each other, constantly trying to prove their mettle by making you sway in rhythm to their groovy, enthralling dance moves. The only question is: Can you handle the thrill and exhilaration???";
					break;
			case 5:
				detail = "Charge up your nerve cells, sharpen up your brain and slay the questions put forth by our quizmaster... Or get slayed... This is your chance to show us that you are well-versed on any topic under the sun... And we literally mean ANY!!! So all the brains around, come defeat light itself!!!";
				break;
			}
			break;
		case 2:
			switch ((gotBasket.getInt("key"))) {
			case 0:
				detail = "Get ready to clutch your sides and tear up at a night of wit, humour and jest as the one and only, ________ forces you to forget all your pains and worries and double up with laughter. A night of giggles and guffaws beckons you...!!!";
				break;
			case 1:
				detail = "Design a circuit to achieve a given output using minimum number of components.";
				break;
			case 2:
				detail = "An international coding contest in which participants has to design and code an efficient algorithm for the given problem.";
				break;
			case 3:
				detail = "Design a machine to get out of a pit.";
				break;
			case 4:
				detail = "Build a chuck glider to traverses farthest distance. In this a simple plane has to be designed which launched from certain height traverses largest distance.";
				break;
			case 5:
				detail = "A unique event in which autonomous bots will race witheach other on parallel tracks.";
				break;
			case 6:
				detail = "Radio controlled boat that has to traverse a given path in the water and take the ball from one place to another.";
				break;
			case 7:
				detail = "You have to design a machine to shoot the given ball as far as possible. Accuracy will also be tested.";
				break;
			case 8:
				detail = "Fighting out an opponent robot out of the arena. In this two two robots have to push each other. The bot that goes out of the ring first loses.";
				break;
			case 9:
				detail = "Cool event based on image processing where autonomous robots play golf.";
				break;
			case 10:
				detail = "If you think that all those hours you spent gaming were a waste of time, think again! This is your chance to prove just how good a gamer you are!!";
				break;
			}
			break;
		case 3:
			switch ((gotBasket.getInt("key"))) {
			case 0:
				detail = "Put aside your books and start zooming into the world with your camera lens. Hurry before time runs out: start now - Click! Click! Click!";
				break;
			case 1:
				detail = "Go back to your childhood, grab a kite and soar high. Innovate your kite show your might and thrill up the fight!!!";
				break;
			case 2:
				detail = "The JEE just got interesting with a mix of exciting questions and even more interesting options this JEE will assure you loads of fun.";
				break;
			case 3:
				detail = "'Order in chaos'\nis the new mantra. So power up your brain cells, unleash the creative side in you and literally find SENSE in the RANdom.";
				break;
			case 4:
				detail = "'Sense and Sensibility'\nIs toying with words your passion? Do you constantly crave for a chance to bring out the Sherlock hidden in you? Then dig into your Cache of common sense and sensible deductions and reach the final answer leaving no stone, clue or hint unturned. Elementary, did you say???";
				break;
			case 5:
				detail = "'Cast a Spell'\nHere comes the good, old Spell Bee, a scintillating game with a fresh new flavor. With 3 thrilling rounds, this contest will leave you brimming with fun and excitement. In this fast-paced competition, blink and you will miss it. So let the bee sting you...";
				break;
			}
			break;
		case 4:
			switch ((gotBasket.getInt("key"))) {
			case 0:
				detail = "In a society that claims to be advancing rapidly on all counts right from planning missions to the Mars to the development of nuclear energy, incidents like brutal rapes, molestation of women bring us back to square one. Have we just progressed materially? Haven't we achieved anything morally? This is the time when we must make the people realize that a woman is not a toy but the mother of all the creations. It is with this goal in mind that we are organizing the marathon themed on 'Respect for Women'. Being on the highest level of intelligence it is our moral and humane responsibly to stand up for the causes of women and exhibit our whole-hearted support by participating in the marathon.";
//				detail = "A marathon, with the message \"Education for all\" has been organized by the college in the upcoming Fluxus. Education is a matter of national concern in India, owing to the relatively low literary rates in the country among the economically backward people, and the marathon carries a strong message of complete education and awareness among everyone, regardless of their financial background.";
				break;
			}
			break;
		}

		title.setText(name);
		description.setText("Description: " + detail);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bSetRem:
			
			break;
		case R.id.bCloseEventDialog:
			finish();
			break;
		}
	}
}
