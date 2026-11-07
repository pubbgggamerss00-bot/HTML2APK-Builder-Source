package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedHashSet;
import m3.b;

@Deprecated
/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b.AbstractC0173b<V> {
    public HideBottomViewOnScrollBehavior() {
        new LinkedHashSet();
    }

    @Override // m3.b.AbstractC0173b
    public boolean h(b bVar, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashSet();
    }
}
