package i0;

import org.bouncycastle.asn1.cmc.BodyPartID;
import x2.f;

/* loaded from: classes.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13380a = mh.t.l(10, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7022n);

    public static final long a(t2.l0 l0Var, f3.d dVar, f.a aVar, String str, int i10) {
        t2.a aVarA = t2.r.a(str, l0Var, f3.c.b(0, 0, 15), dVar, aVar, i10, 64);
        return (a3.a(aVarA.f27744a.b()) << 32) | (a3.a(aVarA.d()) & BodyPartID.bodyIdMax);
    }
}
