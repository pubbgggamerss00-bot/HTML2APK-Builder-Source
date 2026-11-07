package p2;

import com.yalantis.ucrop.view.CropImageView;
import i2.g1;
import j2.x4;
import java.util.List;
import q2.t;
import q2.w;

/* loaded from: classes.dex */
public final class s {
    /* JADX WARN: Type inference failed for: r3v3, types: [eh.a, kotlin.jvm.internal.s] */
    public static final void a(t tVar, int i10, n nVar) {
        t tVar2;
        z0.b bVar = new z0.b(new t[16]);
        List listG = tVar.g(false, false);
        while (true) {
            bVar.c(bVar.f34702c, listG);
            while (true) {
                int i11 = bVar.f34702c;
                if (i11 == 0) {
                    return;
                }
                tVar2 = (t) bVar.k(i11 - 1);
                boolean zD = x4.d(tVar2);
                q2.l lVar = tVar2.f21811d;
                if (!zD) {
                    if (lVar.f21799a.b(w.f21828i)) {
                        continue;
                    } else {
                        g1 g1VarC = tVar2.c();
                        if (g1VarC == null) {
                            throw k1.a.a("Expected semantics node to have a coordinator.");
                        }
                        f3.n nVarD = f3.o.d(g2.w.b(g1VarC));
                        if (nVarD.f8822a < nVarD.f8824c && nVarD.f8823b < nVarD.f8825d) {
                            eh.p pVar = (eh.p) q2.m.a(lVar, q2.k.f21777e);
                            q2.j jVar = (q2.j) q2.m.a(lVar, w.f21839t);
                            if (pVar == null || jVar == null || ((Number) jVar.f21772b.invoke()).floatValue() <= CropImageView.DEFAULT_ASPECT_RATIO) {
                                break;
                            }
                            int i12 = i10 + 1;
                            nVar.invoke(new r(tVar2, i12, nVarD, g1VarC));
                            a(tVar2, i12, nVar);
                        }
                    }
                }
            }
            listG = tVar2.g(false, false);
        }
    }
}
