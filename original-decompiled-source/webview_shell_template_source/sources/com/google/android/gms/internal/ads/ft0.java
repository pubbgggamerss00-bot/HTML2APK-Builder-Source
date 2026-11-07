package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.zzau;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ft0 extends FrameLayout {
    public final zzau s;

    public ft0(Context context, View view, zzau zzauVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.s = zzauVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.s.zzm(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            KeyEvent.Callback childAt = getChildAt(i6);
            if (childAt != null && (childAt instanceof xa0)) {
                arrayList.add((xa0) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((xa0) arrayList.get(i7)).destroy();
        }
    }
}
