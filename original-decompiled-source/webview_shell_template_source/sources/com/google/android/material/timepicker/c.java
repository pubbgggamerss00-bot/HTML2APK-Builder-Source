package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.htmltoapk.template.R;
import v0.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends u0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f12516d;

    public c(ClockFaceView clockFaceView) {
        this.f12516d = clockFaceView;
    }

    @Override // u0.a
    public final void d(View view, v0.b bVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = bVar.f14729a;
        this.f14446a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter(this.f12516d.P.get(iIntValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        bVar.b(b.a.f14731e);
    }

    @Override // u0.a
    public final boolean g(View view, int i6, Bundle bundle) {
        if (i6 != 16) {
            return super.g(view, i6, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f12516d;
        view.getHitRect(clockFaceView.M);
        float fCenterX = clockFaceView.M.centerX();
        float fCenterY = clockFaceView.M.centerY();
        clockFaceView.L.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.L.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
