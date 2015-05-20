package ctec.cardgame.controller;

import java.util.ArrayList;



import ctec.cardgame.model.MakeTheDeck;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity
{

	public ArrayList<String> Deck;
	public TextView textView1;
	public Button button1;
	public Button button2;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Deck = new ArrayList<String>();
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		textView1 = (TextView) findViewById(R.id.textView1);
		setupListeners();
		BuildTheDeck();

		
	}
	public void BuildTheDeck()
	{
		String cardSuit = "S";
		int cardNumber = 1;
		int suitMake = 0;
		for(int loop=0; loop<52; loop++)
		{
			suitMake = 0;
			for(int suitLoop=0; suitLoop<4; suitLoop++)
			{
				
				if(suitMake == 0)
				{
					cardSuit = "S";
					Deck.add(""  +cardNumber+ "" +cardSuit+ ".png");
				}
				else
				if(suitMake == 1)
				{
					cardSuit = "H";
					Deck.add(""  +cardNumber+ "" +cardSuit+ ".png");
				}
				else
				if(suitMake == 2)
				{
					cardSuit = "D";
					Deck.add(""  +cardNumber+ "" +cardSuit+ ".png");
				}
				else
				{
					cardSuit = "C";
					Deck.add(""  +cardNumber+ "" +cardSuit+ ".png");
				}
				suitMake++;
			}
			cardNumber++;
		}
	}
		private void setupListeners() 
		{
			button1.setOnClickListener(new View.OnClickListener() 
			{

				@Override
				public void onClick(View currentView)
				{
					

					int randomCard = (int) (Math.random() * 52);
					
					textView1.setText(Deck.get(randomCard));
					
				}
			});
			button2.setOnClickListener(new View.OnClickListener() 
			{

				@Override
				public void onClick(View currentView)
				{
					
				}
			});
		}
		
}
