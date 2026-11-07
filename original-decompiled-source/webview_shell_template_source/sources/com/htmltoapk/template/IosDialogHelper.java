package com.htmltoapk.template;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class IosDialogHelper {
    public static final IosDialogHelper INSTANCE = new IosDialogHelper();

    private IosDialogHelper() {
    }

    private final void applyIosTheme(View view, Activity activity) {
        boolean z6 = (activity.getResources().getConfiguration().uiMode & 48) == 32;
        View viewFindViewById = view.findViewById(R.id.ios_dialog_title);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById);
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ios_dialog_message);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById2);
        TextView textView2 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.ios_divider_horizontal);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.ios_divider_vertical);
        TextView textView3 = (TextView) view.findViewById(R.id.ios_button_cancel);
        TextView textView4 = (TextView) view.findViewById(R.id.ios_button_confirm);
        TextView textView5 = (TextView) view.findViewById(R.id.ios_button_single);
        if (z6) {
            view.setBackgroundResource(R.drawable.bg_ios_dialog_dark);
            textView.setTextColor(-1);
            textView2.setTextColor(Color.parseColor("#D1D1D6"));
            viewFindViewById3.setBackgroundColor(Color.parseColor("#38FFFFFF"));
            if (viewFindViewById4 != null) {
                viewFindViewById4.setBackgroundColor(Color.parseColor("#38FFFFFF"));
            }
            if (textView3 != null) {
                textView3.setTextColor(Color.parseColor("#0A84FF"));
            }
            if (textView4 != null) {
                textView4.setTextColor(Color.parseColor("#FF453A"));
            }
            if (textView5 != null) {
                textView5.setTextColor(Color.parseColor("#0A84FF"));
                return;
            }
            return;
        }
        view.setBackgroundResource(R.drawable.bg_ios_dialog_light);
        textView.setTextColor(-16777216);
        textView2.setTextColor(Color.parseColor("#4A4A4E"));
        viewFindViewById3.setBackgroundColor(Color.parseColor("#28000000"));
        if (viewFindViewById4 != null) {
            viewFindViewById4.setBackgroundColor(Color.parseColor("#28000000"));
        }
        if (textView3 != null) {
            textView3.setTextColor(Color.parseColor("#007AFF"));
        }
        if (textView4 != null) {
            textView4.setTextColor(Color.parseColor("#FF3B30"));
        }
        if (textView5 != null) {
            textView5.setTextColor(Color.parseColor("#007AFF"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showExitConfirmation$lambda$2(Dialog dialog, p5.a aVar, View view) {
        dialog.dismiss();
        aVar.a();
    }

    public final void showExitConfirmation(Activity activity, p5.a<d5.j> aVar) {
        kotlin.jvm.internal.j.e("activity", activity);
        kotlin.jvm.internal.j.e("onConfirmExit", aVar);
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.dialog_ios_alert, (ViewGroup) null);
        kotlin.jvm.internal.j.b(viewInflate);
        applyIosTheme(viewInflate, activity);
        dialog.setContentView(viewInflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.45f);
        }
        View viewFindViewById = viewInflate.findViewById(R.id.ios_dialog_title);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById);
        View viewFindViewById2 = viewInflate.findViewById(R.id.ios_dialog_message);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById2);
        View viewFindViewById3 = viewInflate.findViewById(R.id.ios_two_buttons_container);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById3);
        View viewFindViewById4 = viewInflate.findViewById(R.id.ios_button_single);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById4);
        View viewFindViewById5 = viewInflate.findViewById(R.id.ios_button_cancel);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById5);
        TextView textView = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.ios_button_confirm);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById6);
        TextView textView2 = (TextView) viewFindViewById6;
        ((TextView) viewFindViewById).setText(R.string.ios_dialog_exit_title);
        ((TextView) viewFindViewById2).setText(R.string.ios_dialog_exit_message);
        viewFindViewById3.setVisibility(0);
        viewFindViewById4.setVisibility(8);
        textView.setText(R.string.ios_dialog_cancel);
        textView2.setText(R.string.ios_dialog_exit);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.htmltoapk.template.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.dismiss();
            }
        });
        textView2.setOnClickListener(new s0(dialog, aVar, 0));
        viewInflate.setScaleX(0.88f);
        viewInflate.setScaleY(0.88f);
        viewInflate.setAlpha(0.0f);
        dialog.show();
        viewInflate.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(220L).setInterpolator(new OvershootInterpolator(1.1f)).start();
    }

    public final Dialog showNoInternet(Activity activity, p5.a<d5.j> aVar) {
        kotlin.jvm.internal.j.e("activity", activity);
        kotlin.jvm.internal.j.e("onRetry", aVar);
        if (activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.dialog_ios_alert, (ViewGroup) null);
        kotlin.jvm.internal.j.b(viewInflate);
        applyIosTheme(viewInflate, activity);
        dialog.setContentView(viewInflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setDimAmount(0.45f);
        }
        View viewFindViewById = viewInflate.findViewById(R.id.ios_dialog_title);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById);
        View viewFindViewById2 = viewInflate.findViewById(R.id.ios_dialog_message);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById2);
        View viewFindViewById3 = viewInflate.findViewById(R.id.ios_two_buttons_container);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById3);
        View viewFindViewById4 = viewInflate.findViewById(R.id.ios_button_single);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById4);
        TextView textView = (TextView) viewFindViewById4;
        ((TextView) viewFindViewById).setText(R.string.ios_dialog_no_internet_title);
        ((TextView) viewFindViewById2).setText(R.string.ios_dialog_no_internet_message);
        viewFindViewById3.setVisibility(8);
        textView.setVisibility(0);
        textView.setText(R.string.ios_dialog_retry);
        textView.setOnClickListener(new q0(aVar, 0));
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        viewInflate.setScaleX(0.88f);
        viewInflate.setScaleY(0.88f);
        viewInflate.setAlpha(0.0f);
        dialog.show();
        viewInflate.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(220L).setInterpolator(new OvershootInterpolator(1.1f)).start();
        return dialog;
    }
}
