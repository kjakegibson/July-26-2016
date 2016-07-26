package com.tiy.chooseyourown;

import java.util.Scanner;

public class ChooseYourOwn {

	public static Scanner sc = new Scanner(System.in);
	private static boolean stillPlaying = true;

	public static void main(String[] args) {

		while (stillPlaying) {

			System.out.println("What a horrible night to have a curse... " + "\n"
					+ "\nYou have found yourself far from the loving embrace of the mouldering shed"
					+ "\nyou somehow refer to as home on this particular evening."
					+ "\nGorfus, your inexplicably sentient Chevy Vega lazily pulls to the left in"
					+ "\norder to miss an oncoming pothole while thoughts of fear and love, and the relationships"
					+ "\nbetween them, flutter through your mind like a wish coasting along a nascent breeze." + "\n"
					+ "\n\"LET US PLAY RADIO\" subtely yells Gorfus.");

			myFirstMethod();
		}
	}

	private static void myFirstMethod() {
		// TODO Auto-generated method stub

		System.out.println("\nIn Russia, Radio Station Chooses You... so...yeah, go ahead... pick one.\n"
				+ "\tA.) WBARF1063\n" + "\tB.) PretentiousHipsterRadioXM\n" + "\tC.) NewsWeMadeUpAM");

		String whichToPick = sc.nextLine();
		whichPicked(whichToPick);
	}

	public static void whichPicked(String theRadioStationPicked) {
		switch (theRadioStationPicked.toLowerCase()) {
		case "a":
			whatWBARF1063plays();
			break;

		case "b":
			whatPretentiousHipsterRadioXMplays();
			break;

		case "c":
			whatNewsWeMadeUpAMplays();
			break;
		default:
			System.out.println("Sorry, brah, you done went and goofed it. Start over.");
			stillPlaying = false;
		}
		return;
	}

	public static void whatWBARF1063plays() {
		System.out.println("Static flashes and muffled voices pop in and out while you spin the tuning knob."
				+ "\nYou land on 1063 in one fluid motion only to hear what obviously sounds like extended"
				+ "\nblasts of corrupted scrap code." + "\n\"CHANGE STATION CHANGE STATION\" calmly screams Gorfus");

		System.out.println(
				"Whatever Shall you do?\n" + "\n" + "\tA.) Leave the station alone, you like screeching code blasts\n"
						+ "\tB.) Change the station, Gorfus clearly isn't a fan");

		String whichToDecideA = sc.nextLine();
		whichWBARF(whichToDecideA);

	}

	public static void whatPretentiousHipsterRadioXMplays() {
		System.out.println("It's been a while since you've heard the dulcet tones of hipsters telling you"
				+ "\nthat everything you like sucks, so you flip over to your favorite station for such. The broadcast"
				+ "\nis immediately interrupted by the President of the United States, addressing the entire country."
				+ "\n\"You guys, seriously, there are ghosts, like, everywhere, you guys. We figured it was time"
				+ "\nwe told you.\" he says, before giving the peace sign to the camera which you can't see because"
				+ "\nyou're listening to it on the radio so forget I added that.");

		System.out.println("What do you decide?\n" + "\n"
				+ "\tA.) Drive Gorfus into the ocean, and live there forever, because ghosts are no joke\n"
				+ "\tB.) Become a Ghostbuster");

		String whichToDecideB = sc.nextLine();
		whichHipster(whichToDecideB);

	}

	public static void whatNewsWeMadeUpAMplays() {
		System.out.println("News is pretty cool, I guess. So you go ahead and decide to listen to it against your"
				+ "\n against your better judgement. Unfortunately, when you attempt to tune in, Gorfus chooses that"
				+ "\nvery moment to encounter a catastrophic engine failure which causes his hood to blast directly upwards"
				+ "\nand obscure your vision");

		System.out.println("How do we get out of this mess?\n" + "\n"
				+ "\tA.) Apply the brake, there's no-one else on the highway so it's not really that big of a deal\n"
				+ "\tB.) For no logical reason whatsoever, Gun it");

		String whichToDecideC = sc.nextLine();
		whichNews(whichToDecideC);
	}

	public static void whichWBARF(String BARF) {
		switch (BARF.toLowerCase()) {
		case "a":
			whatLeaveItPlays();
			break;

		case "b":
			whatChangeItPlays();
			break;
		default:
			System.out.println("Sorry, brah, you done went and goofed it. Start over.");
			stillPlaying = false;
		}
		return;
	}

	public static void whatLeaveItPlays() {
		System.out.println(
				"Gorfus can't take the unending blasts of screeching scrap code and begins the transformation into his"
						+ "\nfinal form. As Gorfus painfully becomes the crappiest version of Optimus Prime ever seen, you are crushed within his "
						+ "\nmighty, titanic, frame.");

		System.out.println("Do you want to keep going?" + "\ny" + "\nn");

		String a = sc.nextLine();
		finalMethod(a);
	}

	public static void whatChangeItPlays() {
		System.out.println(
				"Gorfus calms down rather immediately and you head to the closest bar to cry into your beer for various reasons"
						+ "over the course of the next seven or eight hours. This is it. This is the best ending. You're never going to do any better than "
						+ "\nthis. This is your life now. Accept it and move out of the rest of society's way.");

		System.out.println("Do you want to keep going?" + "\ny" + "\nn");

		String a = sc.nextLine();
		finalMethod(a);
	}

	public static void whichHipster(String HIPSTER)

	{
		switch (HIPSTER.toLowerCase()) {
		case "a":
			whatOceanPlays();
			break;

		case "b":
			whatGhostbusterPlays();
			break;
		default:
			System.out.println("Sorry, brah, you done went and goofed it. Start over.");
			stillPlaying = false;
		}
		return;
	}

	public static void whatOceanPlays() {
		System.out.println("The good news is that you totally got away from all those ghosts the government just warned"
				+ "\nyou about. The bad news is that people still can't breathe underwater, and Gorfus isn't really aware of"
				+ "\nthat. So yeah, you drowned, and that sucks. Gorfus is pretty happy though, so there's that. He just sort"
				+ "\nof hangs out down there and eventually rusts away to nothing. ");

		System.out.println("Do you want to keep going?" + "\ny" + "\nn");

		String a = sc.nextLine();
		finalMethod(a);
	}

	public static void whatGhostbusterPlays() {
		System.out.println(
				"Didn't you read the other answer? Ghosts are scary, man, and you don't have the tools to handle"
						+ "\nthat kind of thing. You just got spooked right to death by government sanctioned ghosts because you neglected "
						+ "\nyour reading comprehension classes in middle school. You've got nobody to blame but yourself.");

		System.out.println("Do you want to keep going?" + "\ny" + "\nn");

		String a = sc.nextLine();
		finalMethod(a);
	}

	public static void whichNews(String NEWS)

	{
		switch (NEWS.toLowerCase()) {
		case "a":
			whatBrakePlays();
			break;

		case "b":
			whatGunPlays();
			break;
		default:
			System.out.println("Sorry, brah, you done went and goofed it. Start over.");
			stillPlaying = false;
		}
		return;
	}

	public static void whatBrakePlays() {
		System.out.println(
				"Applying the brake slows you down pretty quick. Upon stopping entirely you get out of Gorfus and walk around"
						+ "to the hood to take a look at what the damage might be. But then meteors... I guess. Yeah, a whole bunch of meteors"
						+ "crash into the earth at that exact moment. I've clearly gotten lazy at this point. I apologize for nothing.");

		System.out.println("Do you want to keep going?" + "\ny" + "\nn");

		String a = sc.nextLine();
		finalMethod(a);
	}

	public static void whatGunPlays() {
		System.out.println(
				"You slam that gas pedal to the floor as hard as you can. Fire begins spouting from both the exhaust pipe"
						+ "\nand gas tank. No-one can stop you now. You are the Glorious Pheonix, prepared to rise from the ashes of your own"
						+ "\nmaking. The flames rise higher and higher until they have completely engulfed you and the surrounding countryside."
						+ "\nTurns out self aware vehicles are extremely flammable. Also turns out that The Glorious Pheonix was totally a "
						+ "\nmetaphor all along and not a real literal thing that someone can be. So you've burned to death, but at least you"
						+ "\nrazed most of the landscape within a ten mile radius with you. It's the little things");

		System.out.println("Do you want to keep going?" + "\ny" + "\nn");

		String a = sc.nextLine();
		finalMethod(a);
	}

	private static boolean finalMethod(String a) {
		switch (a) {
		case "y":
			return stillPlaying;


		case "n":
			stillPlaying = false;
			break;
		default:

		}
		return stillPlaying;

	}

}
