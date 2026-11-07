package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.ContextThemeWrapper;
import android.widget.TextView;
import u4.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f12230a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f12231b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f12232c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f12233d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12234e;

    /* renamed from: f, reason: collision with root package name */
    public final u4.k f12235f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i6, u4.k kVar, Rect rect) {
        androidx.work.j.d(rect.left);
        androidx.work.j.d(rect.top);
        androidx.work.j.d(rect.right);
        androidx.work.j.d(rect.bottom);
        this.f12230a = rect;
        this.f12231b = colorStateList2;
        this.f12232c = colorStateList;
        this.f12233d = colorStateList3;
        this.f12234e = i6;
        this.f12235f = kVar;
    }

    public static b a(Context context, int i6) throws Resources.NotFoundException {
        androidx.work.j.a("Cannot create a CalendarItemStyle with a styleResId of 0", i6 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i6, w3.a.f15076q);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListA = q4.c.a(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListA2 = q4.c.a(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListA3 = q4.c.a(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        u4.a aVar = new u4.a(0);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        u4.k kVarA = u4.k.g(contextThemeWrapper.obtainStyledAttributes(w3.a.B), aVar).a();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarA, rect);
    }

    public final void b(TextView textView) {
        u4.g gVar = new u4.g();
        u4.g gVar2 = new u4.g();
        u4.k kVar = this.f12235f;
        gVar.setShapeAppearanceModel(kVar);
        gVar2.setShapeAppearanceModel(kVar);
        gVar.r(this.f12232c);
        gVar.f14610t.f14627j = this.f12234e;
        gVar.invalidateSelf();
        g.c cVar = gVar.f14610t;
        ColorStateList colorStateList = cVar.f14622d;
        ColorStateList colorStateList2 = this.f12233d;
        if (colorStateList != colorStateList2) {
            cVar.f14622d = colorStateList2;
            gVar.onStateChange(gVar.getState());
        }
        ColorStateList colorStateList3 = this.f12231b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), gVar, gVar2);
        Rect rect = this.f12230a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
