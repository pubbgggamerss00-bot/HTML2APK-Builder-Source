package i3;

import i2.e0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14139a = new a();

    public static final class a implements b2.a {
    }

    public static final void a(l lVar, e0 e0Var) {
        long jY = e0Var.I.f13790b.Y(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jY >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jY & BodyPartID.bodyIdMax)));
        lVar.layout(iRound, iRound2, lVar.getMeasuredWidth() + iRound, lVar.getMeasuredHeight() + iRound2);
    }
}
