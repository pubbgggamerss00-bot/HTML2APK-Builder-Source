package h1;

import h1.i;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: o, reason: collision with root package name */
    public final c f12106o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12107p;

    public d(long j10, l lVar, eh.l<Object, pg.f0> lVar2, eh.l<Object, pg.f0> lVar3, c cVar) {
        super(j10, lVar, lVar2, lVar3);
        this.f12106o = cVar;
        cVar.k();
    }

    @Override // h1.c, h1.h
    public final void c() {
        if (this.f12123c) {
            return;
        }
        super.c();
        if (this.f12107p) {
            return;
        }
        this.f12107p = true;
        this.f12106o.l();
    }

    @Override // h1.c
    public final i w() throws Throwable {
        d dVar;
        c cVar = this.f12106o;
        if (cVar.f12101m || cVar.f12123c) {
            return new i.a();
        }
        p.m0<i0> m0Var = this.f12096h;
        long j10 = this.f12122b;
        HashMap mapC = m0Var != null ? n.c(cVar.g(), this, this.f12106o.d()) : null;
        Object obj = n.f12160c;
        synchronized (obj) {
            try {
                n.d(this);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (m0Var == null || m0Var.f20755d == 0) {
                    dVar = this;
                    a();
                } else {
                    dVar = this;
                    i iVarZ = dVar.z(this.f12106o.g(), m0Var, mapC, this.f12106o.d());
                    if (!kotlin.jvm.internal.r.a(iVarZ, i.b.f12125a)) {
                        return iVarZ;
                    }
                    p.m0<i0> m0VarX = dVar.f12106o.x();
                    if (m0VarX != null) {
                        m0VarX.k(m0Var);
                    } else {
                        dVar.f12106o.B(m0Var);
                        dVar.f12096h = null;
                    }
                }
                if (dVar.f12106o.g() < j10) {
                    dVar.f12106o.v();
                }
                c cVar2 = dVar.f12106o;
                cVar2.r(cVar2.d().e(j10).c(dVar.f12098j));
                dVar.f12106o.A(j10);
                c cVar3 = dVar.f12106o;
                int i10 = dVar.f12124d;
                dVar.f12124d = -1;
                if (i10 >= 0) {
                    int[] iArr = cVar3.f12099k;
                    kotlin.jvm.internal.r.e(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i10;
                    cVar3.f12099k = iArrCopyOf;
                } else {
                    cVar3.getClass();
                }
                c cVar4 = dVar.f12106o;
                l lVar = dVar.f12098j;
                cVar4.getClass();
                synchronized (obj) {
                    cVar4.f12098j = cVar4.f12098j.g(lVar);
                    pg.f0 f0Var = pg.f0.f21461a;
                    c cVar5 = dVar.f12106o;
                    int[] iArr2 = dVar.f12099k;
                    cVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = cVar5.f12099k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            kotlin.jvm.internal.r.b(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        cVar5.f12099k = iArr2;
                    }
                }
                dVar.f12101m = true;
                if (!dVar.f12107p) {
                    dVar.f12107p = true;
                    dVar.f12106o.l();
                }
                return i.b.f12125a;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }
}
