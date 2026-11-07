package j2;

import eh.p;
import f3.i;
import j2.h3;
import java.util.Arrays;
import pg.f0;
import x0.j;

/* loaded from: classes.dex */
public final class h3 {
    public static final void a(final boolean z10, final eh.p pVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1818896922);
        int i11 = (kVarP.c(z10) ? 4 : 2) | i10 | (kVarP.l(pVar) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            c.s.a(z10, pVar, kVarP, i11 & 126);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, pVar, i10) { // from class: r5.a

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f23210a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f23211b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = i.n(1);
                    h3.a(this.f23210a, this.f23211b, (j) obj, iN);
                    return f0.f21461a;
                }
            };
        }
    }

    public static final String b(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }
}
