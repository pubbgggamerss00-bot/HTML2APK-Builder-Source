package s;

import i0.e4;
import r.a2;
import s.s;

/* loaded from: classes.dex */
public final class x<T, V extends s> implements h<T, V> {

    /* renamed from: a, reason: collision with root package name */
    public final w2 f23977a;

    /* renamed from: b, reason: collision with root package name */
    public final n2<T, V> f23978b;

    /* renamed from: c, reason: collision with root package name */
    public final T f23979c;

    /* renamed from: d, reason: collision with root package name */
    public final V f23980d;

    /* renamed from: e, reason: collision with root package name */
    public final V f23981e;

    /* renamed from: f, reason: collision with root package name */
    public final V f23982f;

    /* renamed from: g, reason: collision with root package name */
    public final T f23983g;

    /* renamed from: h, reason: collision with root package name */
    public final long f23984h;

    public x(y<T> yVar, n2<T, V> n2Var, T t3, V v10) {
        w2 w2VarA = yVar.a();
        this.f23977a = w2VarA;
        this.f23978b = n2Var;
        this.f23979c = t3;
        V vInvoke = n2Var.a().invoke(t3);
        this.f23980d = vInvoke;
        this.f23981e = (V) e4.b(v10);
        this.f23983g = (T) n2Var.b().invoke(w2VarA.b(vInvoke, v10));
        if (w2VarA.f23974c == null) {
            w2VarA.f23974c = (V) vInvoke.c();
        }
        V v11 = w2VarA.f23974c;
        if (v11 == null) {
            kotlin.jvm.internal.r.h("velocityVector");
            throw null;
        }
        int iB = v11.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            r.m2 m2Var = w2VarA.f23972a;
            vInvoke.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(m2Var.f22887a.b(v10.a(i10)) / (r.b2.f22787a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f23984h = jMax;
        V v12 = (V) e4.b(w2VarA.c(jMax, vInvoke, v10));
        this.f23982f = v12;
        int iB2 = v12.b();
        for (int i11 = 0; i11 < iB2; i11++) {
            V v13 = this.f23982f;
            v13.e(jh.j.l(v13.a(i11), -this.f23977a.a(), this.f23977a.a()), i11);
        }
    }

    @Override // s.h
    public final boolean a() {
        return false;
    }

    @Override // s.h
    public final long b() {
        return this.f23984h;
    }

    @Override // s.h
    public final n2<T, V> c() {
        return this.f23978b;
    }

    @Override // s.h
    public final V d(long j10) {
        if (e(j10)) {
            return this.f23982f;
        }
        return (V) this.f23977a.c(j10, this.f23980d, this.f23981e);
    }

    @Override // s.h
    public final T f(long j10) {
        if (e(j10)) {
            return this.f23983g;
        }
        eh.l<V, T> lVarB = this.f23978b.b();
        w2 w2Var = this.f23977a;
        V v10 = w2Var.f23973b;
        V v11 = this.f23980d;
        if (v10 == null) {
            w2Var.f23973b = (V) v11.c();
        }
        V v12 = w2Var.f23973b;
        if (v12 == null) {
            kotlin.jvm.internal.r.h("valueVector");
            throw null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = w2Var.f23973b;
            if (v13 == null) {
                kotlin.jvm.internal.r.h("valueVector");
                throw null;
            }
            r.m2 m2Var = w2Var.f23972a;
            float fA = v11.a(i10);
            long j11 = j10 / 1000000;
            a2.a aVarA = m2Var.f22887a.a(this.f23981e.a(i10));
            long j12 = aVarA.f22782c;
            v13.e((Math.signum(aVarA.f22780a) * aVarA.f22781b * r.a.a(j12 > 0 ? j11 / j12 : 1.0f).f22765a) + fA, i10);
        }
        V v14 = w2Var.f23973b;
        if (v14 != null) {
            return lVarB.invoke(v14);
        }
        kotlin.jvm.internal.r.h("valueVector");
        throw null;
    }

    @Override // s.h
    public final T g() {
        return this.f23983g;
    }
}
