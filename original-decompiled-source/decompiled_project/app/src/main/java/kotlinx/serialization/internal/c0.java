package kotlinx.serialization.internal;

import bi.m;
import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class c0 implements bi.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f16355a;

    /* renamed from: b, reason: collision with root package name */
    public final bi.f f16356b;

    /* renamed from: c, reason: collision with root package name */
    public final bi.f f16357c;

    public c0(String str, bi.f fVar, bi.f fVar2) {
        this.f16355a = str;
        this.f16356b = fVar;
        this.f16357c = fVar2;
    }

    @Override // bi.f
    public final String a() {
        return this.f16355a;
    }

    @Override // bi.f
    public final int d(String name) {
        kotlin.jvm.internal.r.e(name, "name");
        Integer numG = mh.s.g(name);
        if (numG != null) {
            return numG.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // bi.f
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.r.a(this.f16355a, c0Var.f16355a) && kotlin.jvm.internal.r.a(this.f16356b, c0Var.f16356b) && kotlin.jvm.internal.r.a(this.f16357c, c0Var.f16357c);
    }

    @Override // bi.f
    public final String f(int i10) {
        return String.valueOf(i10);
    }

    @Override // bi.f
    public final List<Annotation> g(int i10) {
        if (i10 >= 0) {
            return qg.z.f22752a;
        }
        throw new IllegalArgumentException(b.o.a(p.i0.b(i10, "Illegal index ", ", "), this.f16355a, " expects only non-negative indices").toString());
    }

    @Override // bi.f
    public final bi.l getKind() {
        return m.c.f4280a;
    }

    @Override // bi.f
    public final bi.f h(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b.o.a(p.i0.b(i10, "Illegal index ", ", "), this.f16355a, " expects only non-negative indices").toString());
        }
        int i11 = i10 % 2;
        if (i11 == 0) {
            return this.f16356b;
        }
        if (i11 == 1) {
            return this.f16357c;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.f16357c.hashCode() + ((this.f16356b.hashCode() + (this.f16355a.hashCode() * 31)) * 31);
    }

    @Override // bi.f
    public final boolean i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(b.o.a(p.i0.b(i10, "Illegal index ", ", "), this.f16355a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f16355a + '(' + this.f16356b + ", " + this.f16357c + ')';
    }
}
