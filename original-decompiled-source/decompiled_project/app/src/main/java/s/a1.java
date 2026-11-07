package s;

import s.z0;

/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0<Object> f23650a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(z0<Object> z0Var) {
        super(1);
        this.f23650a = z0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(Long l10) {
        long jLongValue = l10.longValue();
        z0<Object> z0Var = this.f23650a;
        long j10 = jLongValue - z0Var.f24058m;
        z0Var.f24058m = jLongValue;
        long jC = gh.a.c(j10 / z0Var.f24062r);
        p.h0<z0.a> h0Var = z0Var.f24059n;
        if (h0Var.e()) {
            Object[] objArr = h0Var.f20706a;
            int i10 = h0Var.f20707b;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                z0.a aVar = (z0.a) objArr[i12];
                z0.d0(z0Var, aVar, jC);
                aVar.f24066c = true;
            }
            y1<Object> y1Var = z0Var.f24051e;
            if (y1Var != null) {
                y1Var.o();
            }
            int i13 = h0Var.f20707b;
            Object[] objArr2 = h0Var.f20706a;
            jh.g gVarQ = jh.j.q(0, i13);
            int i14 = gVarQ.f15744a;
            int i15 = gVarQ.f15745b;
            if (i14 <= i15) {
                while (true) {
                    objArr2[i14 - i11] = objArr2[i14];
                    if (((z0.a) objArr2[i14]).f24066c) {
                        i11++;
                    }
                    if (i14 == i15) {
                        break;
                    }
                    i14++;
                }
            }
            qg.m.m(objArr2, i13 - i11, i13, null);
            h0Var.f20707b -= i11;
        }
        z0.a aVar2 = z0Var.f24060p;
        if (aVar2 != null) {
            aVar2.f24070g = z0Var.f24052f;
            z0.d0(z0Var, aVar2, jC);
            z0Var.l0(aVar2.f24067d);
            if (aVar2.f24067d == 1.0f) {
                z0Var.f24060p = null;
            }
            z0Var.k0();
        }
        return pg.f0.f21461a;
    }
}
