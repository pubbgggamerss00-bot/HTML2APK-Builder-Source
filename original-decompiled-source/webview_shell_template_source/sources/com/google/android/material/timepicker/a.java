package com.google.android.material.timepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends u0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f12515d;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f12515d = chipTextInputComboView;
    }

    @Override // u0.a
    public final void d(View view, v0.b bVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = bVar.f14729a;
        this.f14446a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        bVar.k(((EditText) view).getText());
        bVar.i(this.f12515d.f12502u.getText());
        accessibilityNodeInfo.setMaxTextLength(2);
    }
}
