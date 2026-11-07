package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.htmltoapk.template.R;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f12237a;

    /* renamed from: b, reason: collision with root package name */
    public final b f12238b;

    /* renamed from: c, reason: collision with root package name */
    public final b f12239c;

    /* renamed from: d, reason: collision with root package name */
    public final b f12240d;

    /* renamed from: e, reason: collision with root package name */
    public final b f12241e;

    /* renamed from: f, reason: collision with root package name */
    public final b f12242f;

    /* renamed from: g, reason: collision with root package name */
    public final b f12243g;
    public final Paint h;

    public c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(q4.b.c(context, j.class.getCanonicalName(), R.attr.materialCalendarStyle).data, w3.a.f15075p);
        this.f12237a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.f12243g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f12238b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f12239c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListA = q4.c.a(context, typedArrayObtainStyledAttributes, 7);
        this.f12240d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f12241e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f12242f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
