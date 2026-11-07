package androidx.compose.ui.layout;

import androidx.compose.ui.d;
import eh.l;
import f3.p;
import g2.b1;
import i2.a1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;

/* loaded from: classes.dex */
final class OnSizeChangedModifier extends a1<b1> {

    /* renamed from: b, reason: collision with root package name */
    public final l<p, f0> f1212b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(l<? super p, f0> lVar) {
        this.f1212b = lVar;
    }

    @Override // i2.a1
    public final d.c a() {
        return new b1(this.f1212b);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        b1 b1Var = (b1) cVar;
        b1Var.f11318q = this.f1212b;
        long j10 = PKIFailureInfo.systemUnavail;
        b1Var.f11320s = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f1212b == ((OnSizeChangedModifier) obj).f1212b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1212b.hashCode();
    }
}
