package androidx.compose.foundation;

import android.view.View;
import androidx.compose.ui.d;
import eh.l;
import f3.h;
import i2.a1;
import i2.k;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import q2.c0;
import r.e2;
import r.o2;
import r.z1;
import t.m1;
import t.z0;

/* loaded from: classes.dex */
public final class MagnifierElement extends a1<z0> {

    /* renamed from: b, reason: collision with root package name */
    public final s f792b;

    /* renamed from: c, reason: collision with root package name */
    public final s f793c;

    /* renamed from: d, reason: collision with root package name */
    public final float f794d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f795e = true;

    /* renamed from: f, reason: collision with root package name */
    public final long f796f = 9205357640488583168L;

    /* renamed from: g, reason: collision with root package name */
    public final float f797g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public final float f798h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f799i = true;

    /* renamed from: j, reason: collision with root package name */
    public final m1 f800j;

    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierElement(l lVar, l lVar2, m1 m1Var) {
        this.f792b = (s) lVar;
        this.f793c = (s) lVar2;
        this.f800j = m1Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.l, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r2v0, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // i2.a1
    public final d.c a() {
        return new z0(this.f792b, this.f793c, this.f794d, this.f795e, this.f796f, this.f797g, this.f798h, this.f799i, this.f800j);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [eh.l<? super f3.d, p1.c>, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r12v2, types: [eh.l<? super f3.k, pg.f0>, kotlin.jvm.internal.s] */
    @Override // i2.a1
    public final void b(d.c cVar) {
        z0 z0Var = (z0) cVar;
        float f10 = z0Var.f25415s;
        long j10 = z0Var.f25417v;
        float f11 = z0Var.f25418w;
        boolean z10 = z0Var.f25416t;
        float f12 = z0Var.f25419x;
        boolean z11 = z0Var.f25420y;
        m1 m1Var = z0Var.f25421z;
        View view = z0Var.A;
        f3.d dVar = z0Var.B;
        z0Var.f25413q = this.f792b;
        float f13 = this.f794d;
        z0Var.f25415s = f13;
        boolean z12 = this.f795e;
        z0Var.f25416t = z12;
        long j11 = this.f796f;
        z0Var.f25417v = j11;
        float f14 = this.f797g;
        z0Var.f25418w = f14;
        float f15 = this.f798h;
        z0Var.f25419x = f15;
        boolean z13 = this.f799i;
        z0Var.f25420y = z13;
        z0Var.f25414r = this.f793c;
        m1 m1Var2 = this.f800j;
        z0Var.f25421z = m1Var2;
        View viewA = i2.l.a(z0Var);
        f3.d dVar2 = k.f(z0Var).B;
        if (z0Var.C != null) {
            c0<eh.a<p1.c>> c0Var = t.a1.f25160a;
            if (((!Float.isNaN(f13) || !Float.isNaN(f10)) && f13 != f10 && !m1Var2.a()) || j11 != j10 || !h.a(f14, f11) || !h.a(f15, f12) || z12 != z10 || z13 != z11 || !r.a(m1Var2, m1Var) || !viewA.equals(view) || !r.a(dVar2, dVar)) {
                z0Var.U1();
            }
        }
        z0Var.V1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MagnifierElement) {
            MagnifierElement magnifierElement = (MagnifierElement) obj;
            if (this.f792b == magnifierElement.f792b && this.f794d == magnifierElement.f794d && this.f795e == magnifierElement.f795e && this.f796f == magnifierElement.f796f && h.a(this.f797g, magnifierElement.f797g) && h.a(this.f798h, magnifierElement.f798h) && this.f799i == magnifierElement.f799i && this.f793c == magnifierElement.f793c && r.a(this.f800j, magnifierElement.f800j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = o2.a(z1.a(this.f798h, z1.a(this.f797g, e2.a(o2.a(z1.a(this.f794d, this.f792b.hashCode() * 961, 31), 31, this.f795e), 31, this.f796f), 31), 31), 31, this.f799i);
        s sVar = this.f793c;
        return this.f800j.hashCode() + ((iA + (sVar != null ? sVar.hashCode() : 0)) * 31);
    }
}
