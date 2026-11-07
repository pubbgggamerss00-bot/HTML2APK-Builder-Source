package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedHashSet;
import m3.b;

/* loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends b.AbstractC0173b<V> {
    public HideViewOnScrollBehavior() {
        new LinkedHashSet();
    }

    @Override // m3.b.AbstractC0173b
    public final boolean h(b bVar, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashSet();
    }
}
