package t;

import android.content.Context;
import r.e2;

/* loaded from: classes.dex */
public final class h implements j1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25243a;

    /* renamed from: b, reason: collision with root package name */
    public final f3.d f25244b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25245c;

    /* renamed from: d, reason: collision with root package name */
    public final z.f1 f25246d;

    public h(Context context, f3.d dVar, long j10, z.f1 f1Var) {
        this.f25243a = context;
        this.f25244b = dVar;
        this.f25245c = j10;
        this.f25246d = f1Var;
    }

    @Override // t.j1
    public final g a() {
        return new g(this.f25243a, this.f25244b, this.f25245c, this.f25246d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        h hVar = (h) obj;
        return kotlin.jvm.internal.r.a(this.f25243a, hVar.f25243a) && kotlin.jvm.internal.r.a(this.f25244b, hVar.f25244b) && q1.b1.d(this.f25245c, hVar.f25245c) && kotlin.jvm.internal.r.a(this.f25246d, hVar.f25246d);
    }

    public final int hashCode() {
        int iHashCode = (this.f25244b.hashCode() + (this.f25243a.hashCode() * 31)) * 31;
        int i10 = q1.b1.f21655i;
        return this.f25246d.hashCode() + e2.a(iHashCode, 31, this.f25245c);
    }
}
