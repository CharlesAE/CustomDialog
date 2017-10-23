package ltd.leotech.customdialog.helper;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import ltd.leotech.customdialog.utils.Constants;

/**
 * Created by CharlesAE on 10/23/17.
 */

public class CustomTextView extends android.support.v7.widget.AppCompatTextView {
    public CustomTextView(Context context) {
        super(context);
        setFont();
    }


    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }
    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont();
    }

    private void setFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), Constants.HEROLIGHT);
        setTypeface(font, Typeface.NORMAL);
    }
}
