package com.billwiz.admin.billwiz.util;

import android.graphics.Color;

import com.billwiz.admin.billwiz.activity.BillWizApplication;
import com.github.johnpersano.supertoasts.SuperToast;

/**
 * Created by Weiping on 2015/11/30.
 */
public class CoCoinToast {
    private static CoCoinToast ourInstance = new CoCoinToast();

    public static CoCoinToast getInstance() {
        return ourInstance;
    }

    private CoCoinToast() {
    }

    public void showToast(int text, int color) {
        SuperToast.cancelAllSuperToasts();
        SuperToast superToast = new SuperToast(BillWizApplication.getAppContext());
        superToast.setAnimations(CoCoinUtil.TOAST_ANIMATION);
        superToast.setDuration(SuperToast.Duration.SHORT);
        superToast.setTextColor(Color.parseColor("#ffffff"));
        superToast.setTextSize(SuperToast.TextSize.SMALL);
        superToast.setText(BillWizApplication.getAppContext().getResources().getString(text));
        superToast.setBackground(color);
        superToast.getTextView().setTypeface(CoCoinUtil.typefaceLatoLight);
        superToast.show();
    }

    public void showToast(String text, int color) {
        SuperToast.cancelAllSuperToasts();
        SuperToast superToast = new SuperToast(BillWizApplication.getAppContext());
        superToast.setAnimations(CoCoinUtil.TOAST_ANIMATION);
        superToast.setDuration(SuperToast.Duration.SHORT);
        superToast.setTextColor(Color.parseColor("#ffffff"));
        superToast.setTextSize(SuperToast.TextSize.SMALL);
        superToast.setText(text);
        superToast.setBackground(color);
        superToast.getTextView().setTypeface(CoCoinUtil.typefaceLatoLight);
        superToast.show();
    }
}
