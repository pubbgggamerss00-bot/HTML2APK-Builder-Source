package s;

import com.yalantis.ucrop.view.CropImageView;
import x0.j;
import x0.r3;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final l1<Float> f23749a = m.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);

    static {
        Object obj = d3.f23710a;
        new f3.h(0.1f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final r3 a(float f10, l lVar, x0.j jVar, int i10) {
        return c(new f3.h(f10), p2.f23870c, lVar, null, "DpAnimation", jVar, (i10 << 3) & 896, 8);
    }

    public static final r3 b(float f10, e0 e0Var, String str, x0.j jVar, int i10, int i11) {
        int i12 = i11 & 2;
        l1<Float> l1Var = f23749a;
        if (i12 != 0) {
            e0Var = l1Var;
        }
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (e0Var == l1Var) {
            jVar.L(1125558999);
            boolean zH = jVar.h(0.01f);
            Object objG = jVar.g();
            if (zH || objG == j.a.f31715a) {
                objG = m.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, Float.valueOf(0.01f), 3);
                jVar.C(objG);
            }
            e0Var = (l1) objG;
            jVar.B();
        } else {
            jVar.L(1125668925);
            jVar.B();
        }
        return c(Float.valueOf(f10), p2.f23868a, e0Var, Float.valueOf(0.01f), str2, jVar, (i10 << 3) & 57344, 0);
    }

    public static final r3 c(Object obj, n2 n2Var, l lVar, Float f10, String str, x0.j jVar, int i10, int i11) {
        if ((i11 & 8) != 0) {
            f10 = null;
        }
        Object objG = jVar.g();
        Object obj2 = j.a.f31715a;
        if (objG == obj2) {
            objG = bg.b.h(null);
            jVar.C(objG);
        }
        x0.n1 n1Var = (x0.n1) objG;
        Object objG2 = jVar.g();
        if (objG2 == obj2) {
            objG2 = new b(obj, n2Var, f10);
            jVar.C(objG2);
        }
        b bVar = (b) objG2;
        x0.n1 n1VarK = bg.b.k(null, jVar);
        if (f10 != null && (lVar instanceof l1)) {
            l1 l1Var = (l1) lVar;
            if (!kotlin.jvm.internal.r.a(l1Var.f23831c, f10)) {
                lVar = new l1(l1Var.f23829a, l1Var.f23830b, f10);
            }
        }
        x0.n1 n1VarK2 = bg.b.k(lVar, jVar);
        Object objG3 = jVar.g();
        if (objG3 == obj2) {
            objG3 = rh.k.a(-1, 6, null);
            jVar.C(objG3);
        }
        rh.h hVar = (rh.h) objG3;
        boolean zL = jVar.l(hVar) | jVar.l(obj);
        Object objG4 = jVar.g();
        if (zL || objG4 == obj2) {
            objG4 = new e(0, hVar, obj);
            jVar.C(objG4);
        }
        x0.l0 l0Var = x0.o0.f31834a;
        jVar.u((eh.a) objG4);
        boolean zL2 = jVar.l(hVar) | jVar.l(bVar) | jVar.K(n1VarK2) | jVar.K(n1VarK);
        Object objG5 = jVar.g();
        if (zL2 || objG5 == obj2) {
            Object fVar = new f(hVar, bVar, n1VarK2, n1VarK, null);
            jVar.C(fVar);
            objG5 = fVar;
        }
        x0.o0.d((eh.p) objG5, hVar, jVar);
        r3 r3Var = (r3) n1Var.getValue();
        return r3Var == null ? bVar.f23654c : r3Var;
    }
}
