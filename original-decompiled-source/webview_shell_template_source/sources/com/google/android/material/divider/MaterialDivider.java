package com.google.android.material.divider;

import a5.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.htmltoapk.template.R;
import n4.j;
import q4.c;
import u4.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    public final g s;

    /* renamed from: t, reason: collision with root package name */
    public int f12316t;

    /* renamed from: u, reason: collision with root package name */
    public int f12317u;

    /* renamed from: v, reason: collision with root package name */
    public int f12318v;

    /* renamed from: w, reason: collision with root package name */
    public int f12319w;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.s = new g();
        TypedArray typedArrayD = j.d(context2, attributeSet, w3.a.s, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f12316t = typedArrayD.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f12318v = typedArrayD.getDimensionPixelOffset(2, 0);
        this.f12319w = typedArrayD.getDimensionPixelOffset(1, 0);
        setDividerColor(c.a(context2, typedArrayD, 0).getDefaultColor());
        typedArrayD.recycle();
    }

    public int getDividerColor() {
        return this.f12317u;
    }

    public int getDividerInsetEnd() {
        return this.f12319w;
    }

    public int getDividerInsetStart() {
        return this.f12318v;
    }

    public int getDividerThickness() {
        return this.f12316t;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i6;
        super.onDraw(canvas);
        boolean z6 = getLayoutDirection() == 1;
        int i7 = z6 ? this.f12319w : this.f12318v;
        if (z6) {
            width = getWidth();
            i6 = this.f12318v;
        } else {
            width = getWidth();
            i6 = this.f12319w;
        }
        int i8 = width - i6;
        int bottom = getBottom() - getTop();
        g gVar = this.s;
        gVar.setBounds(i7, 0, i8, bottom);
        gVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        int mode = View.MeasureSpec.getMode(i7);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i8 = this.f12316t;
            if (i8 > 0 && measuredHeight != i8) {
                measuredHeight = i8;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i6) {
        if (this.f12317u != i6) {
            this.f12317u = i6;
            this.s.r(ColorStateList.valueOf(i6));
            invalidate();
        }
    }

    public void setDividerColorResource(int i6) {
        setDividerColor(getContext().getColor(i6));
    }

    public void setDividerInsetEnd(int i6) {
        this.f12319w = i6;
    }

    public void setDividerInsetEndResource(int i6) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i6));
    }

    public void setDividerInsetStart(int i6) {
        this.f12318v = i6;
    }

    public void setDividerInsetStartResource(int i6) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i6));
    }

    public void setDividerThickness(int i6) {
        if (this.f12316t != i6) {
            this.f12316t = i6;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i6) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i6));
    }
}
