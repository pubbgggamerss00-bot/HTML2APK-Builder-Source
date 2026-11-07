package b;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f3270b;

    public /* synthetic */ t(KeyEvent.Callback callback, int i10) {
        this.f3269a = i10;
        this.f3270b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3269a) {
            case 0:
                u.a((u) this.f3270b);
                break;
            default:
                m9.g0 g0Var = (m9.g0) this.f3270b;
                if (!g0Var.f17794v) {
                    g0Var.v();
                    eh.a<pg.f0> aVar = g0Var.T;
                    if (aVar != null) {
                        aVar.invoke();
                        break;
                    }
                }
                break;
        }
    }
}
