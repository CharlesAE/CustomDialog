package ltd.leotech.customdialog.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.Button;

import ltd.leotech.customdialog.R;
import ltd.leotech.customdialog.helper.CustomTextView;
import ltd.leotech.customdialog.utils.Constants;

/**
 * Created by CharlesAE on 10/23/17.
 */

public class CustomDialog {

    LayoutInflater inflater;
    Typeface fontTypeFace;

    public void setupDialog(final Context context){
        inflater= LayoutInflater.from(context);

        fontTypeFace = Typeface.createFromAsset(context.getAssets(), Constants.HERO);
        //Typeface will be set to the alertdialog button.

        CustomTextView textView = new CustomTextView(context);
        textView.setText(context.getResources().getText(R.string.string1));
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        textView.setTextSize(22);
        textView.setTextColor(context.getResources().getColor(R.color.primary_orange));

        final AlertDialog alertDialogBuilder = new  AlertDialog.Builder(context)
                .setCustomTitle(inflater.inflate(R.layout.dialog_title, null))
                .setView(textView)
                .setPositiveButton(R.string.close, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {

                    }
                })
                .create();

        //Customizing the alert dialog button, giving it a custom font and a background gradient with different states
        alertDialogBuilder.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                Button b = alertDialogBuilder.getButton(DialogInterface.BUTTON_POSITIVE);
                b.setTextColor(context.getResources().getColor(R.color.primary_teal));
                b.setTextSize(14);
                b.setBackground(context.getResources().getDrawable(R.drawable.button_border));
                b.setTypeface(fontTypeFace);
            }
        });
        alertDialogBuilder.show();

    }
}
