package kotlinx.serialization.internal;

import java.util.List;

/* loaded from: classes2.dex */
public final class x implements kh.j {

    /* renamed from: a, reason: collision with root package name */
    public final kh.j f16420a;

    public x(kh.j origin) {
        kotlin.jvm.internal.r.e(origin, "origin");
        this.f16420a = origin;
    }

    @Override // kh.j
    public final boolean c() {
        return this.f16420a.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        x xVar = obj instanceof x ? (x) obj : null;
        kh.j jVar = xVar != null ? xVar.f16420a : null;
        kh.j jVar2 = this.f16420a;
        if (!kotlin.jvm.internal.r.a(jVar2, jVar)) {
            return false;
        }
        kh.c cVarH = jVar2.h();
        if (cVarH instanceof kh.c) {
            kh.j jVar3 = obj instanceof kh.j ? (kh.j) obj : null;
            kh.c cVarH2 = jVar3 != null ? jVar3.h() : null;
            if (cVarH2 != null && (cVarH2 instanceof kh.c)) {
                return b3.e.c(cVarH).equals(b3.e.c(cVarH2));
            }
        }
        return false;
    }

    @Override // kh.j
    public final List<kh.k> g() {
        return this.f16420a.g();
    }

    @Override // kh.j
    public final kh.c h() {
        return this.f16420a.h();
    }

    public final int hashCode() {
        return this.f16420a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f16420a;
    }
}
