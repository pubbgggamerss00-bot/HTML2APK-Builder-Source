package v0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final b f14726t;

    /* renamed from: u, reason: collision with root package name */
    public final int f14727u;

    public a(int i6, b bVar, int i7) {
        this.s = i6;
        this.f14726t = bVar;
        this.f14727u = i7;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.s);
        this.f14726t.f14729a.performAction(this.f14727u, bundle);
    }
}
