package androidx.lifecycle;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.cmc.BodyPartID;
import ph.n2;
import tg.h;

/* loaded from: classes.dex */
public final class u implements ce.g {
    public static final o a(b.k kVar) {
        kotlin.jvm.internal.r.e(kVar, "<this>");
        l lifecycle = kVar.getLifecycle();
        kotlin.jvm.internal.r.e(lifecycle, "<this>");
        b<Object> bVar = lifecycle.f2317a;
        while (true) {
            o oVar = (o) bVar.f2250a.get();
            if (oVar != null) {
                return oVar;
            }
            n2 n2VarA = ah.l.a();
            wh.c cVar = ph.z0.f21632a;
            o oVar2 = new o(lifecycle, h.a.C0291a.c(n2VarA, uh.o.f29764a.H0()));
            AtomicReference<Object> atomicReference = bVar.f2250a;
            while (!atomicReference.compareAndSet(null, oVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            wh.c cVar2 = ph.z0.f21632a;
            ph.h.c(oVar2, uh.o.f29764a.H0(), null, new n(oVar2, null), 2);
            return oVar2;
        }
    }

    public static final long b(t2.h0 h0Var, int i10, boolean z10, boolean z11) {
        t2.l lVar = h0Var.f27820b;
        long j10 = h0Var.f27821c;
        if (lVar.d(i10) >= lVar.f27848f) {
            return 9205357640488583168L;
        }
        boolean z12 = h0Var.a(((!z10 || z11) && (z10 || !z11)) ? Math.max(i10 + (-1), 0) : i10) == h0Var.h(i10);
        ArrayList arrayList = lVar.f27850h;
        lVar.l(i10);
        t2.o oVar = (t2.o) arrayList.get(i10 == lVar.f27843a.f27855a.f27761b.length() ? qg.p.i(arrayList) : t2.n.a(i10, arrayList));
        return (Float.floatToRawIntBits(jh.j.l(oVar.f27864a.e(oVar.d(i10), z12), CropImageView.DEFAULT_ASPECT_RATIO, (int) (j10 >> 32))) << 32) | (Float.floatToRawIntBits(jh.j.l(lVar.b(r3), CropImageView.DEFAULT_ASPECT_RATIO, (int) (j10 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
    }
}
