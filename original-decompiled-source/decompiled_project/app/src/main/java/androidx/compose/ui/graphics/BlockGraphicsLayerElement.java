package androidx.compose.ui.graphics;

import androidx.compose.ui.d;
import eh.l;
import i2.a1;
import i2.g1;
import i2.k;
import kotlin.jvm.internal.r;
import pg.f0;
import q1.l1;
import q1.s0;

/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends a1<s0> {

    /* renamed from: b, reason: collision with root package name */
    public final l<l1, f0> f1186b;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(l<? super l1, f0> lVar) {
        this.f1186b = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new s0(this.f1186b);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        s0 s0Var = (s0) cVar;
        s0Var.f21730q = this.f1186b;
        g1 g1Var = k.d(s0Var, 2).f13877r;
        if (g1Var != null) {
            g1Var.T1(s0Var.f21730q, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && r.a(this.f1186b, ((BlockGraphicsLayerElement) obj).f1186b);
    }

    public final int hashCode() {
        return this.f1186b.hashCode();
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f1186b + ')';
    }
}
