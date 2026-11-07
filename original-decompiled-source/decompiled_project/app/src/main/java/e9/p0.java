package e9;

import android.view.Window;

/* loaded from: classes.dex */
public final class p0 implements x0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Window f8508a;

    public p0(Window window) {
        this.f8508a = window;
    }

    @Override // x0.k0
    public final void a() {
        Window window = this.f8508a;
        if (window != null) {
            window.clearFlags(128);
        }
    }
}
