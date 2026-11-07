package z3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f34722a;

    /* renamed from: b, reason: collision with root package name */
    public final j f34723b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34724c;

    public a(int i10, j jVar, int i11) {
        this.f34722a = i10;
        this.f34723b = jVar;
        this.f34724c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f34722a);
        this.f34723b.f34725a.performAction(this.f34724c, bundle);
    }
}
