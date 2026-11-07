package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import m3.b;
import mb.a;

/* loaded from: classes2.dex */
public class FloatingActionButton$BaseBehavior<T> extends b.AbstractC0173b<T> {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // m3.b.AbstractC0173b
    public final void a(b.d dVar) {
        if (dVar.f17641c == 0) {
            dVar.f17641c = 80;
        }
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f18031e);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
