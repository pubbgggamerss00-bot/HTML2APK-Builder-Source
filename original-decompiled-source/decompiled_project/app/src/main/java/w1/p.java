package w1;

import j2.j2;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import q1.p0;
import x0.j;

/* loaded from: classes.dex */
public final class p {
    public static final void a(c cVar, l lVar) {
        List<n> list = lVar.f31208k;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = list.get(i10);
            if (nVar instanceof q) {
                f fVar = new f();
                q qVar = (q) nVar;
                fVar.f31103d = qVar.f31220b;
                fVar.f31113n = true;
                fVar.c();
                fVar.f31118s.h(qVar.f31221c);
                fVar.c();
                fVar.c();
                fVar.f31101b = qVar.f31222d;
                fVar.c();
                fVar.f31102c = qVar.f31223e;
                fVar.c();
                fVar.f31106g = qVar.f31224f;
                fVar.c();
                fVar.f31104e = qVar.f31225g;
                fVar.c();
                fVar.f31105f = qVar.f31226h;
                fVar.f31114o = true;
                fVar.c();
                fVar.f31107h = qVar.f31227j;
                fVar.f31114o = true;
                fVar.c();
                fVar.f31108i = qVar.f31228k;
                fVar.f31114o = true;
                fVar.c();
                fVar.f31109j = qVar.f31229l;
                fVar.f31114o = true;
                fVar.c();
                fVar.f31110k = qVar.f31230m;
                fVar.f31115p = true;
                fVar.c();
                fVar.f31111l = qVar.f31231n;
                fVar.f31115p = true;
                fVar.c();
                fVar.f31112m = qVar.f31232p;
                fVar.f31115p = true;
                fVar.c();
                cVar.e(i10, fVar);
            } else if (nVar instanceof l) {
                c cVar2 = new c();
                l lVar2 = (l) nVar;
                cVar2.f31057k = lVar2.f31199a;
                cVar2.c();
                cVar2.f31058l = lVar2.f31200b;
                cVar2.f31065s = true;
                cVar2.c();
                cVar2.f31061o = lVar2.f31203e;
                cVar2.f31065s = true;
                cVar2.c();
                cVar2.f31062p = lVar2.f31204f;
                cVar2.f31065s = true;
                cVar2.c();
                cVar2.f31063q = lVar2.f31205g;
                cVar2.f31065s = true;
                cVar2.c();
                cVar2.f31064r = lVar2.f31206h;
                cVar2.f31065s = true;
                cVar2.c();
                cVar2.f31059m = lVar2.f31201c;
                cVar2.f31065s = true;
                cVar2.c();
                cVar2.f31060n = lVar2.f31202d;
                cVar2.f31065s = true;
                cVar2.c();
                cVar2.f31052f = lVar2.f31207j;
                cVar2.f31053g = true;
                cVar2.c();
                a(cVar2, lVar2);
                cVar.e(i10, cVar2);
            }
        }
    }

    public static final o b(d dVar, x0.j jVar) {
        f3.d dVar2 = (f3.d) jVar.f(j2.f14779h);
        float f10 = dVar.f31078j;
        boolean zJ = jVar.j((Float.floatToRawIntBits(dVar2.getDensity()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32));
        Object objG = jVar.g();
        if (zJ || objG == j.a.f31715a) {
            c cVar = new c();
            a(cVar, dVar.f31074f);
            f0 f0Var = f0.f21461a;
            float f11 = dVar.f31070b;
            float f12 = dVar.f31071c;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(dVar2.N0(f11)) << 32) | (Float.floatToRawIntBits(dVar2.N0(f12)) & BodyPartID.bodyIdMax);
            float fIntBitsToFloat = dVar.f31072d;
            float fIntBitsToFloat2 = dVar.f31073e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax));
            }
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(fIntBitsToFloat2));
            o oVar = new o(cVar);
            String str = dVar.f31069a;
            long j10 = dVar.f31075g;
            p0 p0Var = j10 != 16 ? new p0(dVar.f31076h, j10) : null;
            boolean z10 = dVar.f31077i;
            oVar.f31211f.setValue(new p1.h(jFloatToRawIntBits));
            oVar.f31212g.setValue(Boolean.valueOf(z10));
            k kVar = oVar.f31213h;
            kVar.f31189g.setValue(p0Var);
            kVar.f31191i.setValue(new p1.h(jFloatToRawIntBits2));
            kVar.f31185c = str;
            jVar.C(oVar);
            objG = oVar;
        }
        return (o) objG;
    }
}
