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
    
	private void loadCards(){
		try{
			 winCard=0;
	    	 size = ROW_COUNT*COL_COUNT;
	    	
	    	Log.i("loadCards()","size=" + size);
	    	
	    	ArrayList<Integer> list = new ArrayList<Integer>();
	    	
	    	for(int i=0;i<size;i++){
	    		list.add(new Integer(i));
	    	}
	    	
	    	
	    	Random r = new Random();
	    
	    	for(int i=size-1;i>=0;i--){
	    		int t=0;
	    		
	    		if(i>0){
	    			t = r.nextInt(i);
	    		}
	    		
	    		t=list.remove(t).intValue();
	    		cards[rtrn[i][0]%COL_COUNT][rtrn[i][0]/COL_COUNT]=rtrn[i][1];
	    		
	    		Log.i("loadCards()", "card["+(i%COL_COUNT)+
	    				"]["+(i/COL_COUNT)+"]=" + cards[i%COL_COUNT][i/COL_COUNT]);
	    	}
	    }
		catch (Exception e) {
			Log.e("loadCards()", e+"");
		}
		
    }
    
    private TableRow createRow(int y){
    	 TableRow row = new TableRow(context);
    	 row.setHorizontalGravity(Gravity.CENTER);
         
         for (int x = 0; x < COL_COUNT; x++) {
		         row.addView(createImageButton(x,y));
         }
         return row;
    }
    
    private View createImageButton(int x, int y){
    	Button button = new Button(context);
		button.setBackgroundDrawable(null);
		Typeface fontawsome = Typeface.createFromAsset(getAssets(), "fontawesome.ttf");
		button.setTypeface(fontawsome);
		button.setTextColor(Color.GRAY);
		button.setText("\uf04d");
		button.setTextSize(TypedValue.COMPLEX_UNIT_PX, 45);
		button.setId(100*x+y);
    	button.setOnClickListener(buttonListener);

    	return button;
    }
    
    class ButtonListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			
			synchronized (lock) {
				if(firstCard!=null && seconedCard != null){
					return;
				}
				int id = v.getId();
				int x = id/100;
				int y = id%100;
				Log.i("onClick()", "card["+(x)+
						"]["+(y)+"]=" + cards[x][y]);
				turnCard((Button)v,x,y);
			}
			
		}

		private void turnCard(Button button,int x, int y) {
		//	button.setBackgroundDrawable(images.get(cards[x][y]));
			Log.i("turndCards()", "card["+(x)+
					"]["+(y)+"]=" + cards[x][y]);
			Typeface fontawsome = Typeface.createFromAsset(getAssets(), "fontawesome.ttf");
			button.setTypeface(fontawsome);
			button.setTextColor(Color.GREEN);
			String s = Character.toString((char) cards[x][y]);
			button.setText(s);
			button.setTextSize(TypedValue.COMPLEX_UNIT_PX, 45);


			if(firstCard==null){
				firstCard = new Card(button,x,y);
			}
			else{ 
				
				if(firstCard.x == x && firstCard.y == y){
					return; //the user pressed the same card
				}
					
				seconedCard = new Card(button,x,y);
				
				turns++;
				((TextView)findViewById(R.id.tv1)).setText("Tries: "+turns);
				
			
				TimerTask tt = new TimerTask() {
					
					@Override
					public void run() {
						try{
							synchronized (lock) {
							  handler.sendEmptyMessage(0);
							}
						}
						catch (Exception e) {
							Log.e("E1", e.getMessage());
						}
					}
				};
				
				  Timer t = new Timer(false);
			        t.schedule(tt, 1300);
			}
			
				
		   }
			
		}
    
    class UpdateCardsHandler extends Handler{
    	
    	@Override
    	public void handleMessage(Message msg) {
    		synchronized (lock) {
    			checkCards();
    		}
    	}
    	 public void checkCards(){
    	    	if(cards[seconedCard.x][seconedCard.y] == cards[firstCard.x][firstCard.y]){
    				firstCard.button.setVisibility(View.INVISIBLE);
    				seconedCard.button.setVisibility(View.INVISIBLE);
					winCard +=1;

					if (winCard==size/2)
					{
						//gets
						CharSequence text = "You Win " + getStar() + " Star";
						Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
						toast.show();
						onCreate(Bundle.EMPTY);
					}

    			}
    			else {
    				//seconedCard.button.setBackgroundDrawable(null);
    				//firstCard.button.setBackgroundDrawable(null);

					seconedCard.button.setTextColor(Color.GRAY);
					seconedCard.button.setText("\uf04d");
					seconedCard.button.setTextSize(TypedValue.COMPLEX_UNIT_PX, 35);


					firstCard.button.setTextColor(Color.GRAY);
					firstCard.button.setText("\uf04d");
					firstCard.button.setTextSize(TypedValue.COMPLEX_UNIT_PX, 35);
    			}
    	    	
    	    	firstCard=null;
    			seconedCard=null;
    	    }

		public int getStar ()
		{
			int sizeDiv2=size/2;

			if (turns<size)
			{return 3;}
			if (turns>=size && turns< (size*((sizeDiv2)-(sizeDiv2-2))))
			{return 2;}
			if (turns>= (size*(sizeDiv2)) &&turns<= (size*((sizeDiv2)-sizeDiv2-3) ))
			{return 1;}
			else
			return 0;
		}
    }
    
   
    */
}
