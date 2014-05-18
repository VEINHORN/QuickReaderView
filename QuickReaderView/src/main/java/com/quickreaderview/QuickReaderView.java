package com.quickreaderview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class QuickReaderView extends TextView {
    private long delay = 500; // in ms

    public QuickReaderView(Context context) {
        super(context);
    }

    public QuickReaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public QuickReaderView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public QuickReaderView setDelay(long delay) {
        this.delay = delay;
        return this;
    }

    public void showText(String text) {
        final String words[] = text.split(" ");
        final Activity activity = (Activity)getContext();
        new Thread(new Runnable() {
            @Override
            public void run() {
                sleep(500);
                for(final String word : words) {
                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            setText(word);
                        }
                    });
                    sleep(delay);
                }
            }
        }).start();
    }

    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch(InterruptedException e) {

        }
    }
}