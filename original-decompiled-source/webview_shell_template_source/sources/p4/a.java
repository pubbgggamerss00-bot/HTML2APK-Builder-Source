package p4;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import l.s;
import n4.j;
import q4.b;
import q4.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends s {

    /* renamed from: y, reason: collision with root package name */
    public static final int[][] f14093y = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f14094w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14095x;

    public a(Context context, AttributeSet attributeSet) {
        super(a5.a.b(context, attributeSet, com.htmltoapk.template.R.attr.radioButtonStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayD = j.d(context2, attributeSet, w3.a.f15078t, com.htmltoapk.template.R.attr.radioButtonStyle, com.htmltoapk.template.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayD.hasValue(0)) {
            setButtonTintList(c.a(context2, typedArrayD, 0));
        }
        if (typedArrayD.hasValue(1)) {
            setRippleColor(c.a(context2, typedArrayD, 1));
        }
        this.f14095x = typedArrayD.getBoolean(2, false);
        typedArrayD.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f14094w == null) {
            int iJ = androidx.work.j.j(getContext(), b.d(this, com.htmltoapk.template.R.attr.colorControlActivated));
            int iJ2 = androidx.work.j.j(getContext(), b.d(this, com.htmltoapk.template.R.attr.colorOnSurface));
            int iJ3 = androidx.work.j.j(getContext(), b.d(this, com.htmltoapk.template.R.attr.colorSurface));
            this.f14094w = new ColorStateList(f14093y, new int[]{androidx.work.j.i(1.0f, iJ3, iJ), androidx.work.j.i(0.54f, iJ3, iJ2), androidx.work.j.i(0.38f, iJ3, iJ2), androidx.work.j.i(0.38f, iJ3, iJ2)});
        }
        return this.f14094w;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f14095x && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f14095x = z6;
        if (z6) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
