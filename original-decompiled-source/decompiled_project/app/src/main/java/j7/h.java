package j7;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x7.a;

/* loaded from: classes.dex */
public final class h {
    public static final long a(int i10, int i11, x7.h hVar, x7.f fVar, x7.h hVar2) {
        int i12;
        int i13;
        if (!kotlin.jvm.internal.r.a(hVar, x7.h.f32198c)) {
            i10 = c(hVar.f32199a, fVar);
            i11 = c(hVar.f32200b, fVar);
        }
        x7.a aVar = hVar2.f32199a;
        x7.a aVar2 = hVar2.f32200b;
        if ((aVar instanceof a.C0326a) && i10 != Integer.MIN_VALUE && i10 != Integer.MAX_VALUE && i10 > (i13 = ((a.C0326a) aVar).f32183a)) {
            i10 = i13;
        }
        if ((aVar2 instanceof a.C0326a) && i11 != Integer.MIN_VALUE && i11 != Integer.MAX_VALUE && i11 > (i12 = ((a.C0326a) aVar2).f32183a)) {
            i11 = i12;
        }
        return (i11 & BodyPartID.bodyIdMax) | (i10 << 32);
    }

    public static final double b(int i10, int i11, int i12, int i13, x7.f fVar) {
        double d10 = i12 / i10;
        double d11 = i13 / i11;
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d10, d11);
        }
        if (iOrdinal == 1) {
            return Math.min(d10, d11);
        }
        throw new pg.l();
    }

    public static int c(x7.a aVar, x7.f fVar) {
        if (aVar instanceof a.C0326a) {
            return ((a.C0326a) aVar).f32183a;
        }
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            return PKIFailureInfo.systemUnavail;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new pg.l();
    }
}
