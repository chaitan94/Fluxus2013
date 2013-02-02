package com.IITI.fluxus13;

import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
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
		case 5:
			switch ((gotBasket.getInt("key"))) {
			case 0:
				detail = "Ever wondered how 400Kmph speed demons are built? How a slightest configuration change can help you milk another 10-20Kmph from your car and help you set a new record? Well then AutoSPARK is just the thing for you! From aerodynamic design to suspensions, automotive parts will be explained with their contributions towards the ultimate driving machine. If you are an Automotive savvy then this is the place to be!";
				break;
			case 1:
				detail = "Cyber security is of utmost importance in the contemporary world. Sensitive information is often exchanged through the internet, and is prone to theft. Enterprise or Individual, the risk is always large, and HackIN will prevent you from being compromised. From Google database hacking to OS passkey bypassing, Emails to hacking via USB, HackIN is going to make sure that you are aware of how cyber threats arise, so you may always be ready for them. Moreover, bragging rights complement this course, as you may always show off the skills you have honed ;)";
				break;
			case 2:
				detail = "Remember those paper gliders that you made when you were a child? Now it's time to give Wings to your dreams, and Wings has you covered! Nitty-gritties of Aerodynamics, Gliders, and even RC controlled planes, will be dealt with so that you can SWOOOSH past your competition and show who is boss! If you want to hold the current mini aircraft speed record, then this course will give you just what you need, So... CHOCKS AWAY!";
				break;
			case 3:
				detail = "Gentlemen! Start your engines! Racing heritage associated with legendary cars such as the McLaren F1 GTR, The Shelby Daytona Coupe, The Porsche 917 Le Mans, has actually inspired millions to recreate these legends in the contemporary world... and the result was Radio Controlled Racing cars! And that is what Full Throttle is all about. Full Throttle will give you the opportunity to indulge into the RC Racing culture, and will help you build your ultimate race car, and even give you a chance to witness the awesomeness of Nitro RC cars, which are capable of leaving a BIG lot of road cars in the dust!";
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
		//TODO: Unique time slot for each event
		case R.id.bSetRem:
			Calendar beginTime = Calendar.getInstance();
			beginTime.set(2013, 2, 15, 7, 30);
			Calendar endTime = Calendar.getInstance();
			endTime.set(2013, 2, 15, 11, 30);
			Intent intent = new Intent(Intent.ACTION_EDIT);
			intent.setType("vnd.android.cursor.item/event");
			intent.putExtra("beginTime", beginTime.getTimeInMillis());
			intent.putExtra("description", detail);
			intent.putExtra("endTime", endTime.getTimeInMillis());
			intent.putExtra("title", name);
			intent.putExtra("eventLocation", "IIT Indore");
			intent.putExtra("hasAlarm", 1);
			startActivity(intent);

			break;
		case R.id.bCloseEventDialog:
			finish();
			break;
		}
	}
}
