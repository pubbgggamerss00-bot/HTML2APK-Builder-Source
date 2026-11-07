package s;

import i0.e4;
import s.s;

/* loaded from: classes.dex */
public final class x1<T, V extends s> implements h<T, V> {

    /* renamed from: a, reason: collision with root package name */
    public final q2<V> f23985a;

    /* renamed from: b, reason: collision with root package name */
    public final n2<T, V> f23986b;

    /* renamed from: c, reason: collision with root package name */
    public T f23987c;

    /* renamed from: d, reason: collision with root package name */
    public T f23988d;

    /* renamed from: e, reason: collision with root package name */
    public V f23989e;

    /* renamed from: f, reason: collision with root package name */
    public V f23990f;

    /* renamed from: g, reason: collision with root package name */
    public final V f23991g;

    /* renamed from: h, reason: collision with root package name */
    public long f23992h;

    /* renamed from: i, reason: collision with root package name */
    public V f23993i;

    public x1() {
        throw null;
    }

    public x1(l<T> lVar, n2<T, V> n2Var, T t3, T t10, V v10) {
        this.f23985a = lVar.a(n2Var);
        this.f23986b = n2Var;
        this.f23987c = t10;
        this.f23988d = t3;
        this.f23989e = n2Var.a().invoke(t3);
        this.f23990f = n2Var.a().invoke(t10);
        this.f23991g = v10 != null ? (V) e4.b(v10) : (V) n2Var.a().invoke(t3).c();
        this.f23992h = -1L;
    }

    @Override // s.h
    public final boolean a() {
        return this.f23985a.a();
    }

    @Override // s.h
    public final long b() {
        if (this.f23992h < 0) {
            this.f23992h = this.f23985a.b(this.f23989e, this.f23990f, this.f23991g);
        }
        return this.f23992h;
    }

    @Override // s.h
    public final n2<T, V> c() {
        return this.f23986b;
    }

    @Override // s.h
    public final V d(long j10) {
        if (!e(j10)) {
            return (V) this.f23985a.c(j10, this.f23989e, this.f23990f, this.f23991g);
        }
        V v10 = this.f23993i;
        if (v10 != null) {
            return v10;
        }
        V v11 = (V) this.f23985a.g(this.f23989e, this.f23990f, this.f23991g);
        this.f23993i = v11;
        return v11;
    }

    @Override // s.h
    public final T f(long j10) {
        if (e(j10)) {
            return this.f23987c;
        }
        s sVarD = this.f23985a.d(j10, this.f23989e, this.f23990f, this.f23991g);
        int iB = sVarD.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(sVarD.a(i10))) {
                x0.b("AnimationVector cannot contain a NaN. " + sVarD + ". Animation: " + this + ", playTimeNanos: " + j10);
            }
        }
        return (T) this.f23986b.b().invoke(sVarD);
    }

    @Override // s.h
    public final T g() {
        return this.f23987c;
    }

    public final void h(T t3) {
        if (kotlin.jvm.internal.r.a(t3, this.f23988d)) {
            return;
        }
        this.f23988d = t3;
        this.f23989e = this.f23986b.a().invoke(t3);
        this.f23993i = null;
        this.f23992h = -1L;
    }

    public final void i(T t3) {
        if (kotlin.jvm.internal.r.a(this.f23987c, t3)) {
            return;
        }
        this.f23987c = t3;
        this.f23990f = this.f23986b.a().invoke(t3);
        this.f23993i = null;
        this.f23992h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f23988d + " -> " + this.f23987c + ",initial velocity: " + this.f23991g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f23985a;
    }
}
