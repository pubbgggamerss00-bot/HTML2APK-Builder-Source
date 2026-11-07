package k1;

import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final AutofillManager f15938a;

    public p(AutofillManager autofillManager) {
        this.f15938a = autofillManager;
    }

    public final void a(View view, int i10, boolean z10) {
        this.f15938a.notifyViewVisibilityChanged(view, i10, z10);
    }
}
