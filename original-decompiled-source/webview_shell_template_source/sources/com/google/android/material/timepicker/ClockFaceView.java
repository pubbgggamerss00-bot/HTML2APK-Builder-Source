package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.dn;
import com.google.android.material.timepicker.ClockHandView;
import com.htmltoapk.template.R;
import java.util.Arrays;
import u0.f0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class ClockFaceView extends f implements ClockHandView.a {
    public final ClockHandView L;
    public final Rect M;
    public final RectF N;
    public final Rect O;
    public final SparseArray<TextView> P;
    public final c Q;
    public final int[] R;
    public final float[] S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;

    /* renamed from: a0, reason: collision with root package name */
    public final String[] f12504a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f12505b0;

    /* renamed from: c0, reason: collision with root package name */
    public final ColorStateList f12506c0;

    /* renamed from: d0, reason: collision with root package name */
    public h f12507d0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.M = new Rect();
        this.N = new RectF();
        this.O = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.P = sparseArray;
        this.S = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.f15065e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListA = q4.c.a(context, typedArrayObtainStyledAttributes, 1);
        this.f12506c0 = colorStateListA;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.L = clockHandView;
        this.T = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListA.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.R = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.f12509u.add(this);
        int defaultColor = k0.a.b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListA2 = q4.c.a(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        typedArrayObtainStyledAttributes.recycle();
        setOutlineProvider(new b());
        setFocusable(true);
        setClipToOutline(true);
        this.Q = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.f12504a0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < Math.max(this.f12504a0.length, size); i6++) {
            TextView textView = sparseArray.get(i6);
            if (i6 >= this.f12504a0.length) {
                removeView(textView);
                sparseArray.remove(i6);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i6, textView);
                    addView(textView);
                }
                textView.setText(this.f12504a0[i6]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i6));
                int i7 = (i6 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i7));
                z6 = i7 > 1 ? true : z6;
                f0.m(textView, this.Q);
                textView.setTextColor(this.f12506c0);
            }
        }
        ClockHandView clockHandView2 = this.L;
        if (clockHandView2.f12508t && !z6) {
            clockHandView2.E = 1;
        }
        clockHandView2.f12508t = z6;
        clockHandView2.invalidate();
        this.U = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.V = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.W = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f6) {
        if (Math.abs(this.f12505b0 - f6) > 0.001f) {
            this.f12505b0 = f6;
            i();
        }
    }

    @Override // com.google.android.material.timepicker.f
    public final void h() {
        super.h();
        int i6 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.P;
            if (i6 >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i6).setVisibility(0);
            i6++;
        }
    }

    public final void i() {
        SparseArray<TextView> sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.L.f12513y;
        float f6 = Float.MAX_VALUE;
        TextView textView = null;
        int i6 = 0;
        while (true) {
            sparseArray = this.P;
            int size = sparseArray.size();
            rect = this.M;
            rectF = this.N;
            if (i6 >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i6);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f6) {
                    textView = textView2;
                    f6 = fHeight;
                }
            }
            i6++;
        }
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            TextView textView3 = sparseArray.get(i7);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.O);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.R, this.S, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f12504a0.length, false, 1));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        int iIntValue;
        int length;
        int i7 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.P;
            if (i7 >= sparseArray.size()) {
                iIntValue = -1;
                break;
            }
            TextView textViewValueAt = sparseArray.valueAt(i7);
            if (textViewValueAt.isSelected()) {
                iIntValue = ((Integer) textViewValueAt.getTag(R.id.material_value_index)).intValue();
                break;
            }
            i7++;
        }
        if (!isShown() || iIntValue == -1) {
            return super.onKeyDown(i6, keyEvent);
        }
        if (i6 != 66) {
            switch (i6) {
                case 19:
                case 22:
                    length = (iIntValue + 1) % this.f12504a0.length;
                    break;
                case 20:
                case dn.zzm /* 21 */:
                    String[] strArr = this.f12504a0;
                    length = ((iIntValue - 1) + strArr.length) % strArr.length;
                    break;
                case 23:
                    break;
                default:
                    return super.onKeyDown(i6, keyEvent);
            }
            if (length == iIntValue) {
                return super.onKeyDown(i6, keyEvent);
            }
            int i8 = (length / 12) + 1;
            ClockHandView clockHandView = this.L;
            if (i8 != clockHandView.E) {
                clockHandView.E = i8;
                clockHandView.invalidate();
            }
            clockHandView.b((length % 12) * 30.0f);
            i();
            return true;
        }
        h hVar = this.f12507d0;
        if (hVar != null) {
            hVar.f12518a.I.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        super.onLayout(z6, i6, i7, i8, i9);
        i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i6, int i7) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.W / Math.max(Math.max(this.U / displayMetrics.heightPixels, this.V / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i6) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i6));
        }
        if (View.MeasureSpec.getMode(i7) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i7));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        ClockHandView clockHandView = this.L;
        int i8 = ((iMax / 2) - clockHandView.f12510v) - this.T;
        int i9 = this.J;
        if (i8 != i9 && i8 != i9) {
            this.J = i8;
            h();
            clockHandView.D = this.J;
            clockHandView.invalidate();
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
