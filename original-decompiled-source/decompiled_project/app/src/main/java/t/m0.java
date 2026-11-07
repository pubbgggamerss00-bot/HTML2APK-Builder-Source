package t;

import androidx.compose.foundation.gestures.j;
import androidx.compose.ui.d;
import i2.o2;
import i2.p2;

/* loaded from: classes.dex */
public final class m0 extends d.c implements o2 {

    /* renamed from: s, reason: collision with root package name */
    public static final a f25296s = new a();

    /* renamed from: q, reason: collision with root package name */
    public final j.a f25297q;

    /* renamed from: r, reason: collision with root package name */
    public final a f25298r = f25296s;

    public static final class a {
    }

    public m0(j.a aVar) {
        this.f25297q = aVar;
    }

    @Override // i2.o2
    public final Object L() {
        return this.f25298r;
    }

    public final void T1(g2.v vVar) {
        this.f25297q.invoke(vVar);
        m0 m0Var = (m0) p2.a(this);
        if (m0Var != null) {
            m0Var.T1(vVar);
        }
    }
}
