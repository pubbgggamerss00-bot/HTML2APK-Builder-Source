package androidx.compose.foundation;

import androidx.compose.ui.d;
import c2.u0;
import i2.a1;
import kotlin.jvm.internal.r;
import pg.f0;
import r.o2;
import t.e0;
import x.m;

/* loaded from: classes.dex */
final class CombinedClickableElement extends a1<e0> {

    /* renamed from: b, reason: collision with root package name */
    public final m f784b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f785c;

    /* renamed from: d, reason: collision with root package name */
    public final eh.a<f0> f786d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f787e;

    public CombinedClickableElement() {
        throw null;
    }

    public CombinedClickableElement(m mVar, eh.a aVar) {
        this.f784b = mVar;
        this.f785c = true;
        this.f786d = aVar;
        this.f787e = true;
    }

    @Override // i2.a1
    public final d.c a() {
        return new e0(this.f786d, this.f787e, this.f784b, this.f785c);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        u0 u0Var;
        e0 e0Var = (e0) cVar;
        e0Var.getClass();
        boolean z10 = e0Var.f25146x;
        boolean z11 = this.f785c;
        boolean z12 = z10 != z11;
        e0Var.d2(this.f784b, null, z11, null, null, this.f786d);
        if (!z12 || (u0Var = e0Var.A) == null) {
            return;
        }
        u0Var.F1();
        f0 f0Var = f0.f21461a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return r.a(this.f784b, combinedClickableElement.f784b) && this.f785c == combinedClickableElement.f785c && this.f786d == combinedClickableElement.f786d && this.f787e == combinedClickableElement.f787e;
    }

    public final int hashCode() {
        m mVar = this.f784b;
        return Boolean.hashCode(this.f787e) + ((this.f786d.hashCode() + o2.a((mVar != null ? mVar.hashCode() : 0) * 961, 29791, this.f785c)) * 923521);
    }
}
