package com.myapp.mehrnaz.appapp;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class Game extends Activity {
    // textviews for game
    TextView txt_item1;
    TextView txt_item2;
    TextView txt_item3;
    TextView txt_item4;
    TextView txt_item5;
    TextView txt_item6;
    TextView txt_item7;
    TextView txt_item8;
    TextView txt_item9;
    Typeface font;
	
    	//H>T added start
        private static int ROW_COUNT = -1;
	private static int COL_COUNT = -1;
	private Context context;
	private Drawable backImage;
	private int [] [] cards;
	private  int winCard;
	private int size;
	private Card firstCard;
	private Card seconedCard;
	private ButtonListener buttonListener;
	public int[][] rtrn;
	private static Object lock = new Object();
	private int turns;
	private TableLayout mainTable;
	private UpdateCardsHandler handler;
	//H>T added End
	
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_layout);
        font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
         /*
         
         //HT added
        int levelNo = getIntent().getIntExtra("levelNo", 0);
        mainTable = (TableLayout)findViewById(R.id.TableLayout);
        context  = mainTable.getContext();
        
        newGame(levelNo);
          */
  
        txt_item1 = (TextView) findViewById(R.id.txt_item1);
        txt_item2 = (TextView) findViewById(R.id.txt_item2);
        txt_item3 = (TextView) findViewById(R.id.txt_item3);
        txt_item4 = (TextView) findViewById(R.id.txt_item4);
        txt_item5 = (TextView) findViewById(R.id.txt_item5);
        txt_item6 = (TextView) findViewById(R.id.txt_item6);
        txt_item7 = (TextView) findViewById(R.id.txt_item7);
        txt_item8 = (TextView) findViewById(R.id.txt_item8);
        txt_item9 = (TextView) findViewById(R.id.txt_item9);

        //get value from Lev activity
     
        String item = getIntent().getExtras().getString("item");
        txt_item1.setText(item);
        txt_item1.setTypeface(font);
        txt_item2.setText(item);
        txt_item2.setTypeface(font);
        txt_item3.setText(item);
        txt_item3.setTypeface(font);
        txt_item4.setText(item);
        txt_item4.setTypeface(font);
        txt_item5.setText(item);
        txt_item5.setTypeface(font);
        txt_item6.setText(item);
        txt_item6.setTypeface(font);
        txt_item7.setText(item);
        txt_item7.setTypeface(font);
        txt_item8.setText(item);
        txt_item8.setTypeface(font);
        txt_item9.setText(item);
        txt_item9.setTypeface(font);
      

    }
    /*
        private void newGame(int levelNo) {
            
    	ROW_COUNT = r;
    	COL_COUNT = c;
		int CCount = (r*c) ;

		final int[] checkPaper = new int[CCount];
		ClassRandom rndm = new ClassRandom();
		rtrn = rndm.Fisher3(CCount);
    	
    	cards = new int [COL_COUNT] [ROW_COUNT];
    	
    	

    	
    	TableRow tr = ((TableRow)findViewById(R.id.TableRow03));
    	tr.removeAllViews();
    	
    	mainTable = new TableLayout(context);
    	tr.addView(mainTable);
    	
    	 for (int y = 0; y < ROW_COUNT; y++) {
    		 mainTable.addView(createRow(y));
          }
    	 
    	 firstCard=null;
    	 loadCards();
    	 
    	 turns=0;
    	 ((TextView)findViewById(R.id.tv1)).setText("Tries: "+turns);
    	 
			
	}
    private int getRowAndCol(int i)
    {
        int a ,b ;
          if (i%2==0 && i<12)
          {
            a=2;   
            b= i/a;
           
           
          }
           if (i%3==0 && i<30)
          {
            a=3;   
            b= i/a;
            
            
          }
          if (i%4==0 && i<40)
          {
             a=4;   
            b= i/a;
          }
          if (i%5==0 && i<50)
          {
            a=5;   
            b= i/a;
          }
          if (i%6==0 && i<50)
          {
            a=6;   
            b= i/a;
          }
          if (i%7==0 && i<50)
          {
            a=7;   
            b= i/a;
          }
           if (i%8==0 && i<50)
          {
            a=8;   
            b= i/a;
          }
        
        return b;
    }
    */
}
