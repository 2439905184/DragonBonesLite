package org.hh;
import android.view.*;
import android.graphics.*;
import android.content.*;
import org.xml.sax.*;
import android.util.*;

public class TimeLine extends View
{
	public TimeLine(Context c)
	{
		super(c);
	}
	public TimeLine(Context c,AttributeSet set)
	{
		super(c,set);
	}
	@Override
	protected void onDraw ( Canvas canvas ) 
{
	super.onDraw(canvas);
		Paint pen=new Paint();
		pen.setColor(Color.BLACK);
		float x1=10.0f;
		float y1=10.0f;
		float x2=10.0f;
		float y2= 20.0f;
		//canvas.drawLine(x1,x2,y1,y2,pen);
		canvas.drawColor(Color.BLUE);
}
@Override
protected void onMeasure ( int widthMeasureSpec, int heightMeasureSpec )
{
	super.onMeasure ( widthMeasureSpec, heightMeasureSpec );
	
	}
		
}
