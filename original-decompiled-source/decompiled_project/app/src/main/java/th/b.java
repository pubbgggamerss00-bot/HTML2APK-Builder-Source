package th;

import java.util.Arrays;
import pg.f0;
import th.d;

/* loaded from: classes2.dex */
public abstract class b<S extends d<?>> {

    /* renamed from: a, reason: collision with root package name */
    public S[] f28772a;

    /* renamed from: b, reason: collision with root package name */
    public int f28773b;

    /* renamed from: c, reason: collision with root package name */
    public int f28774c;

    /* renamed from: d, reason: collision with root package name */
    public a0 f28775d;

    public final S e() {
        S s10;
        a0 a0Var;
        synchronized (this) {
            try {
                S[] sArr = this.f28772a;
                if (sArr == null) {
                    sArr = (S[]) g();
                    this.f28772a = sArr;
                } else if (this.f28773b >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
                    this.f28772a = (S[]) ((d[]) objArrCopyOf);
                    sArr = (S[]) ((d[]) objArrCopyOf);
                }
                int i10 = this.f28774c;
                do {
                    s10 = sArr[i10];
                    if (s10 == null) {
                        s10 = (S) f();
                        sArr[i10] = s10;
                    }
                    i10++;
                    if (i10 >= sArr.length) {
                        i10 = 0;
                    }
                } while (!s10.a(this));
                this.f28774c = i10;
                this.f28773b++;
                a0Var = this.f28775d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (a0Var != null) {
            a0Var.x(1);
        }
        return s10;
    }

    public abstract S f();

    public abstract d[] g();

    public final void h(S s10) {
        a0 a0Var;
        int i10;
        tg.e[] eVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f28773b - 1;
                this.f28773b = i11;
                a0Var = this.f28775d;
                if (i11 == 0) {
                    this.f28774c = 0;
                }
                kotlin.jvm.internal.r.c(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                eVarArrB = s10.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (tg.e eVar : eVarArrB) {
            if (eVar != null) {
                eVar.resumeWith(f0.f21461a);
            }
        }
        if (a0Var != null) {
            a0Var.x(-1);
        }
    }

    public final a0 i() {
        a0 a0Var;
        synchronized (this) {
            a0Var = this.f28775d;
            if (a0Var == null) {
                int i10 = this.f28773b;
                a0Var = new a0(1, Integer.MAX_VALUE, rh.a.f23577b);
                a0Var.r(Integer.valueOf(i10));
                this.f28775d = a0Var;
            }
        }
        return a0Var;
    }
}
