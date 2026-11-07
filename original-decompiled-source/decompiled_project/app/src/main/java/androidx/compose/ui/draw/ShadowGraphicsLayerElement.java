package androidx.compose.ui.draw;

import ad.f;
import androidx.compose.ui.d;
import f3.h;
import h0.e;
import i2.a1;
import i2.g1;
import i2.k;
import kotlin.jvm.internal.r;
import n1.p;
import q1.b1;
import q1.s0;
import r.e2;
import r.o2;

/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends a1<s0> {

    /* renamed from: b, reason: collision with root package name */
    public final float f1168b;

    /* renamed from: c, reason: collision with root package name */
    public final e f1169c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1170d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1171e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1172f;

    public ShadowGraphicsLayerElement(float f10, e eVar, boolean z10, long j10, long j11) {
        this.f1168b = f10;
        this.f1169c = eVar;
        this.f1170d = z10;
        this.f1171e = j10;
        this.f1172f = j11;
    }

    @Override // i2.a1
    public final d.c a() {
        return new s0(new p(this));
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        s0 s0Var = (s0) cVar;
        s0Var.f21730q = new p(this);
        g1 g1Var = k.d(s0Var, 2).f13877r;
        if (g1Var != null) {
            g1Var.T1(s0Var.f21730q, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return h.a(this.f1168b, shadowGraphicsLayerElement.f1168b) && r.a(this.f1169c, shadowGraphicsLayerElement.f1169c) && this.f1170d == shadowGraphicsLayerElement.f1170d && b1.d(this.f1171e, shadowGraphicsLayerElement.f1171e) && b1.d(this.f1172f, shadowGraphicsLayerElement.f1172f);
    }

    public final int hashCode() {
        int iA = o2.a((this.f1169c.hashCode() + (Float.hashCode(this.f1168b) * 31)) * 31, 31, this.f1170d);
        int i10 = b1.f21655i;
        return Long.hashCode(this.f1172f) + e2.a(iA, 31, this.f1171e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) h.b(this.f1168b));
        sb.append(", shape=");
        sb.append(this.f1169c);
        sb.append(", clip=");
        sb.append(this.f1170d);
        sb.append(", ambientColor=");
        f.c(this.f1171e, ", spotColor=", sb);
        sb.append((Object) b1.j(this.f1172f));
        sb.append(')');
        return sb.toString();
    }
}
