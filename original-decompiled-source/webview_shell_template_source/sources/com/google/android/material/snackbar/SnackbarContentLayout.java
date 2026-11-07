package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.htmltoapk.template.R;
import o4.b;
import x3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView s;

    /* renamed from: t, reason: collision with root package name */
    public Button f12446t;

    /* renamed from: u, reason: collision with root package name */
    public Button f12447u;

    /* renamed from: v, reason: collision with root package name */
    public int f12448v;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b.d(context, R.attr.motionEasingEmphasizedInterpolator, a.f15145b);
    }

    public final boolean a(int i6, int i7, int i8) {
        boolean z6;
        if (i6 != getOrientation()) {
            setOrientation(i6);
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.s.getPaddingTop() == i7 && this.s.getPaddingBottom() == i8) {
            return z6;
        }
        TextView textView = this.s;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i7, textView.getPaddingEnd(), i8);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i7, textView.getPaddingRight(), i8);
        return true;
    }

    public Button getActionView() {
        return this.f12446t;
    }

    public Button getCloseView() {
        return this.f12447u;
    }

    public TextView getMessageView() {
        return this.s;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.s = (TextView) findViewById(R.id.snackbar_text);
        this.f12446t = (Button) findViewById(R.id.snackbar_action);
        this.f12447u = (Button) findViewById(R.id.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) throws Resources.NotFoundException {
        super.onMeasure(i6, i7);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.s.getLayout();
        boolean z6 = layout != null && layout.getLineCount() > 1;
        if (!z6 || this.f12448v <= 0 || this.f12446t.getMeasuredWidth() <= this.f12448v) {
            if (!z6) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i6, i7);
    }

    public void setMaxInlineActionWidth(int i6) {
        this.f12448v = i6;
    }
}
