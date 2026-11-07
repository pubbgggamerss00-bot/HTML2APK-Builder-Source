package n4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends u0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f13931d;

    public a(CheckableImageButton checkableImageButton) {
        this.f13931d = checkableImageButton;
    }

    @Override // u0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f13931d.f12389v);
    }

    @Override // u0.a
    public final void d(View view, v0.b bVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = bVar.f14729a;
        this.f14446a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.f13931d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f12390w);
        accessibilityNodeInfo.setChecked(checkableImageButton.f12389v);
    }
}
