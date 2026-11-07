package qh;

import ph.b1;
import ph.g0;
import ph.m0;
import ph.o0;
import ph.r0;
import ph.z0;
import uh.i;
import uh.o;

/* loaded from: classes2.dex */
public abstract class g extends g0 implements r0 {
    @Override // ph.g0
    public g0 G0(int i10) {
        i.a(i10);
        return this;
    }

    public abstract g H0();

    @Override // ph.g0
    public String toString() {
        g gVarH0;
        String str;
        wh.c cVar = z0.f21632a;
        g gVar = o.f29764a;
        if (this == gVar) {
            str = "Dispatchers.Main";
        } else {
            try {
                gVarH0 = gVar.H0();
            } catch (UnsupportedOperationException unused) {
                gVarH0 = null;
            }
            str = this == gVarH0 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + m0.a(this);
    }

    public b1 z(long j10, Runnable runnable, tg.h hVar) {
        return o0.f21572a.z(j10, runnable, hVar);
    }
}
