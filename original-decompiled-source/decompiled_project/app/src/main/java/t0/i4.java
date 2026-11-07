package t0;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;
import com.yalantis.ucrop.view.CropImageView;
import j1.d;
import j1.f;
import org.bouncycastle.asn1.x509.DisplayText;
import x0.j;

/* loaded from: classes.dex */
public final class i4 {
    static {
        s.w wVar = v0.t.f30479b;
        r.x1 x1VarD = r.w0.d(s.m.d(100, 0, wVar, 2), 2);
        s.w wVar2 = v0.t.f30478a;
        s.m2 m2VarD = s.m.d(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, 0, wVar2, 2);
        f.a aVar = d.a.f14614m;
        boolean zA = kotlin.jvm.internal.r.a(aVar, aVar);
        j1.f fVar = d.a.f14606e;
        j1.f fVar2 = d.a.f14607f;
        f.a aVar2 = d.a.f14616o;
        j1.f fVar3 = d.a.f14605d;
        x1VarD.b(r.w0.f(new r.l1(r.k1.f22870a), zA ? fVar3 : kotlin.jvm.internal.r.a(aVar, aVar2) ? fVar2 : fVar, m2VarD));
        r.v1 v1VarC = r.w0.c(new s.m2(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 100, wVar), 2);
        s.m2 m2VarD2 = s.m.d(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, 0, wVar2, 2);
        if (kotlin.jvm.internal.r.a(aVar, aVar)) {
            fVar = fVar3;
        } else if (kotlin.jvm.internal.r.a(aVar, aVar2)) {
            fVar = fVar2;
        }
        v1VarC.b(r.w0.a(new r.h1(r.g1.f22830a), fVar, m2VarD2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(eh.a aVar, androidx.compose.ui.d dVar, q1.f2 f2Var, long j10, long j11, a4 a4Var, f1.b bVar, x0.j jVar, int i10) {
        int i11;
        androidx.compose.ui.d dVar2;
        long j12;
        long j13;
        q1.f2 f2Var2;
        a4 a4Var2;
        int i12;
        q1.f2 f2Var3;
        long j14;
        long j15;
        a4 a4Var3;
        x0.k kVarP = jVar.p(-731723913);
        int i13 = i10 | (kVarP.l(aVar) ? 4 : 2) | 1647792;
        if ((4793491 & i13) == 4793490 && kVarP.s()) {
            kVarP.v();
            f2Var3 = f2Var;
            j14 = j10;
            j15 = j11;
            a4Var3 = a4Var;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                int i14 = w3.f27280a;
                q1.f2 f2VarA = ab.a(v0.j.f30314c, kVarP);
                long jE = f2.e(v0.d.f30249n, kVarP);
                long jB = f2.b(jE, kVarP);
                a4 a4Var4 = new a4(v0.j.f30312a, v0.j.f30318g, v0.j.f30316e, v0.j.f30317f);
                i11 = i13 & (-524161);
                dVar2 = d.a.f1143b;
                j12 = jB;
                j13 = jE;
                f2Var2 = f2VarA;
                a4Var2 = a4Var4;
            } else {
                kVarP.v();
                f2Var2 = f2Var;
                j13 = j10;
                j12 = j11;
                a4Var2 = a4Var;
                i11 = i13 & (-524161);
                dVar2 = dVar;
            }
            kVarP.U();
            kVarP.L(519755085);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new x.n();
                kVarP.C(objG);
            }
            x.m mVar = (x.m) objG;
            kVarP.T(false);
            androidx.compose.ui.d dVarA = q2.q.a(dVar2, false, e4.f25793a);
            float f10 = a4Var2.f25450a;
            boolean zK = kVarP.K(mVar);
            Object objG2 = kVarP.g();
            if (zK || objG2 == obj) {
                dVar = dVar2;
                i12 = i11;
                objG2 = new d4(a4Var2.f25450a, a4Var2.f25451b, a4Var2.f25453d, a4Var2.f25452c);
                kVarP.C(objG2);
            } else {
                dVar = dVar2;
                i12 = i11;
            }
            d4 d4Var = (d4) objG2;
            boolean zL = kVarP.l(d4Var) | kVarP.K(a4Var2);
            Object objG3 = kVarP.g();
            if (zL || objG3 == obj) {
                objG3 = new x3(d4Var, a4Var2, null);
                kVarP.C(objG3);
            }
            x0.o0.d((eh.p) objG3, a4Var2, kVarP);
            boolean zK2 = kVarP.K(mVar) | kVarP.l(d4Var);
            Object objG4 = kVarP.g();
            if (zK2 || objG4 == obj) {
                objG4 = new z3(mVar, d4Var, null);
                kVarP.C(objG4);
            }
            x0.o0.d((eh.p) objG4, mVar, kVarP);
            md.b(aVar, dVarA, false, f2Var2, j13, j12, f10, ((f3.h) d4Var.f25645e.f23654c.f23843b.getValue()).f8817a, null, mVar, f1.c.b(1249316354, new g4(j12, bVar), kVarP), kVarP, i12 & 14, BinaryXmlFormat.RES_XML_CDATA_TYPE);
            f2Var3 = f2Var2;
            j14 = j13;
            j15 = j12;
            a4Var3 = a4Var2;
        }
        androidx.compose.ui.d dVar3 = dVar;
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new h4(aVar, dVar3, f2Var3, j14, j15, a4Var3, bVar, i10);
        }
    }
}
