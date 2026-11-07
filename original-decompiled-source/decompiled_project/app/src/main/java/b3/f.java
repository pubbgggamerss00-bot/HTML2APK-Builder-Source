package b3;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class f extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final t2.i f3560a;

    public f(t2.i iVar) {
        this.f3560a = iVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f3560a.getClass();
    }
}
