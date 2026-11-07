package l0;

import b.b0;
import g2.v;
import i0.b3;
import m0.e0;
import m0.j2;
import m0.n2;

/* loaded from: classes.dex */
public final class h implements b3 {

    /* renamed from: a, reason: collision with root package name */
    public long f16617a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f16618b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f16619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j2 f16620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f16621e;

    public h(b0 b0Var, j2 j2Var, long j10) {
        this.f16619c = b0Var;
        this.f16620d = j2Var;
        this.f16621e = j10;
    }

    @Override // i0.b3
    public final void a(long j10) {
        v vVar = (v) this.f16619c.invoke();
        j2 j2Var = this.f16620d;
        if (vVar != null) {
            if (!vVar.m()) {
                return;
            }
            j2Var.d(vVar, j10, e0.a.f17303b, true);
            this.f16617a = j10;
        }
        if (n2.a(j2Var, this.f16621e)) {
            this.f16618b = 0L;
        }
    }

    @Override // i0.b3
    public final void b() {
        long j10 = this.f16621e;
        j2 j2Var = this.f16620d;
        if (n2.a(j2Var, j10)) {
            j2Var.e();
        }
    }

    @Override // i0.b3
    public final void c() {
    }

    @Override // i0.b3
    public final void d() {
    }

    @Override // i0.b3
    public final void e(long j10) {
        v vVar = (v) this.f16619c.invoke();
        if (vVar == null || !vVar.m()) {
            return;
        }
        j2 j2Var = this.f16620d;
        if (n2.a(j2Var, this.f16621e)) {
            long jG = p1.c.g(this.f16618b, j10);
            this.f16618b = jG;
            long jG2 = p1.c.g(this.f16617a, jG);
            if (j2Var.c(vVar, jG2, this.f16617a, e0.a.f17303b, true)) {
                this.f16617a = jG2;
                this.f16618b = 0L;
            }
        }
    }

    @Override // i0.b3
    public final void onCancel() {
        long j10 = this.f16621e;
        j2 j2Var = this.f16620d;
        if (n2.a(j2Var, j10)) {
            j2Var.e();
        }
    }
}
