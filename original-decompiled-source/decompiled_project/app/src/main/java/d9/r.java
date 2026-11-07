package d9;

import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import j9.x1;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f7650b;

    public /* synthetic */ r(w0 w0Var, int i10) {
        this.f7649a = i10;
        this.f7650b = w0Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f7649a) {
            case 0:
                g8.u uVar = (g8.u) this.f7650b;
                ph.h.c(x0.a(uVar), null, null, new g8.v(uVar, null), 3);
                break;
            default:
                ((x1) this.f7650b).h();
                break;
        }
        return f0.f21461a;
    }
}
