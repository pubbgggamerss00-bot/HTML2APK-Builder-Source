package l0;

import b.b0;
import g2.v;
import m0.e0;
import m0.j2;
import m0.n2;
import m0.q;

/* loaded from: classes.dex */
public final class i implements q {

    /* renamed from: a, reason: collision with root package name */
    public long f16622a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f16623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2 f16624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f16625d;

    public i(b0 b0Var, j2 j2Var, long j10) {
        this.f16623b = b0Var;
        this.f16624c = j2Var;
        this.f16625d = j10;
    }

    @Override // m0.q
    public final boolean a(long j10, e0 e0Var) {
        v vVar = (v) this.f16623b.invoke();
        if (vVar == null) {
            return true;
        }
        if (!vVar.m()) {
            return false;
        }
        j2 j2Var = this.f16624c;
        if (!n2.a(j2Var, this.f16625d)) {
            return false;
        }
        if (!j2Var.c(vVar, j10, this.f16622a, e0Var, false)) {
            return true;
        }
        this.f16622a = j10;
        return true;
    }

    @Override // m0.q
    public final boolean b(long j10, e0 e0Var) {
        v vVar = (v) this.f16623b.invoke();
        if (vVar == null || !vVar.m()) {
            return false;
        }
        j2 j2Var = this.f16624c;
        j2Var.d(vVar, j10, e0Var, false);
        this.f16622a = j10;
        return n2.a(j2Var, this.f16625d);
    }

    @Override // m0.q
    public final void c() {
        this.f16624c.e();
    }
}
