package s0;

import android.view.ViewGroup;
import i2.h0;
import java.util.LinkedHashMap;
import q1.b1;
import q1.c0;
import q1.w0;
import x.o;
import x0.n1;
import x0.u2;
import x0.x1;

@pg.d
/* loaded from: classes.dex */
public final class b extends p implements u2, k {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24092c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24093d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f24094e;

    /* renamed from: f, reason: collision with root package name */
    public final n1 f24095f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f24096g;

    /* renamed from: h, reason: collision with root package name */
    public j f24097h;

    /* renamed from: j, reason: collision with root package name */
    public final x1 f24098j;

    /* renamed from: k, reason: collision with root package name */
    public final x1 f24099k;

    /* renamed from: l, reason: collision with root package name */
    public long f24100l;

    /* renamed from: m, reason: collision with root package name */
    public int f24101m;

    /* renamed from: n, reason: collision with root package name */
    public final a f24102n;

    public b() {
        throw null;
    }

    public b(boolean z10, float f10, n1 n1Var, n1 n1Var2, ViewGroup viewGroup) {
        super(n1Var2, z10);
        this.f24092c = z10;
        this.f24093d = f10;
        this.f24094e = n1Var;
        this.f24095f = n1Var2;
        this.f24096g = viewGroup;
        this.f24098j = bg.b.h(null);
        this.f24099k = bg.b.h(Boolean.TRUE);
        this.f24100l = 0L;
        this.f24101m = -1;
        this.f24102n = new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t.v0
    public final void a(h0 h0Var) {
        s1.a aVar = h0Var.f13901a;
        this.f24100l = aVar.i();
        float f10 = this.f24093d;
        this.f24101m = Float.isNaN(f10) ? gh.a.b(i.a(h0Var, this.f24092c, aVar.i())) : aVar.b1(f10);
        long j10 = ((b1) this.f24094e.getValue()).f21656a;
        float f11 = ((h) this.f24095f.getValue()).f24117d;
        h0Var.z1();
        this.f24136b.a(h0Var, Float.isNaN(f10) ? i.a(h0Var, this.f24135a, aVar.i()) : h0Var.N0(f10), j10);
        w0 w0VarA = aVar.f24173b.a();
        ((Boolean) this.f24099k.getValue()).booleanValue();
        n nVar = (n) this.f24098j.getValue();
        if (nVar != null) {
            nVar.e(aVar.i(), this.f24101m, j10, f11);
            nVar.draw(c0.a(w0VarA));
        }
    }

    @Override // x0.u2
    public final void b() {
        j jVar = this.f24097h;
        if (jVar != null) {
            u0();
            l lVar = jVar.f24122d;
            n nVar = (n) lVar.f24124a.get(this);
            if (nVar != null) {
                nVar.c();
                LinkedHashMap linkedHashMap = lVar.f24124a;
                n nVar2 = (n) linkedHashMap.get(this);
                if (nVar2 != null) {
                }
                linkedHashMap.remove(this);
                jVar.f24121c.add(nVar);
            }
        }
    }

    @Override // x0.u2
    public final void c() {
        j jVar = this.f24097h;
        if (jVar != null) {
            u0();
            l lVar = jVar.f24122d;
            n nVar = (n) lVar.f24124a.get(this);
            if (nVar != null) {
                nVar.c();
                LinkedHashMap linkedHashMap = lVar.f24124a;
                n nVar2 = (n) linkedHashMap.get(this);
                if (nVar2 != null) {
                }
                linkedHashMap.remove(this);
                jVar.f24121c.add(nVar);
            }
        }
    }

    @Override // x0.u2
    public final void d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s0.p
    public final void e(o.b bVar) {
        j jVarB = this.f24097h;
        if (jVarB == null) {
            jVarB = ah.l.b(this.f24096g);
            this.f24097h = jVarB;
        }
        n nVarA = jVarB.a(this);
        nVarA.b(bVar, this.f24092c, this.f24100l, this.f24101m, ((b1) this.f24094e.getValue()).f21656a, ((h) this.f24095f.getValue()).f24117d, this.f24102n);
        this.f24098j.setValue(nVarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s0.p
    public final void f() {
        n nVar = (n) this.f24098j.getValue();
        if (nVar != null) {
            nVar.d();
        }
    }

    @Override // s0.k
    public final void u0() {
        this.f24098j.setValue(null);
    }
}
