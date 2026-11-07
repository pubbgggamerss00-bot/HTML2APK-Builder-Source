package t2;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.d2;
import q1.e2;
import q1.i2;
import q1.u0;
import q1.v0;
import q1.w0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final m f27843a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27844b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27845c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27846d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27847e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27848f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f27849g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f27850h;

    public l(m mVar, long j10, int i10, int i11) {
        boolean z10;
        int i12;
        int iH;
        int i13;
        this.f27843a = mVar;
        this.f27844b = i10;
        if (f3.b.k(j10) != 0 || f3.b.j(j10) != 0) {
            z2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = mVar.f27859e;
        int size = arrayList2.size();
        float f10 = 0.0f;
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            p pVar = (p) arrayList2.get(i14);
            b3.c cVar = pVar.f27872a;
            int i16 = f3.b.i(j10);
            if (f3.b.d(j10)) {
                i12 = i14;
                iH = f3.b.h(j10) - ((int) Math.ceil(f10));
                if (iH < 0) {
                    iH = 0;
                }
            } else {
                i12 = i14;
                iH = f3.b.h(j10);
            }
            a aVar = new a(cVar, this.f27844b - i15, i11, f3.c.b(i16, iH, 5));
            float fD = aVar.d() + f10;
            u2.j0 j0Var = aVar.f27747d;
            int i17 = i15 + j0Var.f29207g;
            arrayList.add(new o(aVar, pVar.f27873b, pVar.f27874c, i15, i17, f10, fD));
            if (!j0Var.f29204d) {
                if (i17 == this.f27844b) {
                    i13 = i12;
                    if (i13 != qg.p.i(this.f27843a.f27859e)) {
                    }
                } else {
                    i13 = i12;
                }
                i14 = i13 + 1;
                i15 = i17;
                f10 = fD;
            }
            z10 = true;
            i15 = i17;
            f10 = fD;
            break;
        }
        z10 = false;
        this.f27847e = f10;
        this.f27848f = i15;
        this.f27845c = z10;
        this.f27850h = arrayList;
        this.f27846d = f3.b.i(j10);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i18 = 0; i18 < size2; i18++) {
            o oVar = (o) arrayList.get(i18);
            List<p1.e> listG = oVar.f27864a.g();
            ArrayList arrayList4 = new ArrayList(listG.size());
            int size3 = listG.size();
            for (int i19 = 0; i19 < size3; i19++) {
                p1.e eVar = listG.get(i19);
                arrayList4.add(eVar != null ? oVar.a(eVar) : null);
            }
            qg.t.p(arrayList4, arrayList3);
        }
        if (arrayList3.size() < this.f27843a.f27856b.size()) {
            int size4 = this.f27843a.f27856b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i20 = 0; i20 < size4; i20++) {
                arrayList5.add(null);
            }
            arrayList3 = qg.x.O(arrayList5, arrayList3);
        }
        this.f27849g = arrayList3;
    }

    public static void i(l lVar, w0 w0Var, long j10, e2 e2Var, e3.i iVar, s1.f fVar) {
        w0Var.d();
        ArrayList arrayList = lVar.f27850h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            oVar.f27864a.k(w0Var, j10, e2Var, iVar, fVar);
            w0Var.n(CropImageView.DEFAULT_ASPECT_RATIO, oVar.f27864a.d());
        }
        w0Var.o();
    }

    public static void j(l lVar, w0 w0Var, u0 u0Var, float f10, e2 e2Var, e3.i iVar, s1.f fVar) {
        w0Var.d();
        ArrayList arrayList = lVar.f27850h;
        if (arrayList.size() <= 1 || (u0Var instanceof i2)) {
            b3.a.a(lVar, w0Var, u0Var, f10, e2Var, iVar, fVar);
        } else if (u0Var instanceof d2) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float fD = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList.get(i10);
                fD += oVar.f27864a.d();
                fMax = Math.max(fMax, oVar.f27864a.i());
            }
            Shader shaderB = ((d2) u0Var).b((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fD) & BodyPartID.bodyIdMax));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                a aVar = ((o) arrayList.get(i11)).f27864a;
                aVar.l(w0Var, new v0(shaderB), f10, e2Var, iVar, fVar);
                w0Var.n(CropImageView.DEFAULT_ASPECT_RATIO, aVar.d());
                matrix.setTranslate(CropImageView.DEFAULT_ASPECT_RATIO, -aVar.d());
                shaderB.setLocalMatrix(matrix);
            }
        }
        w0Var.o();
    }

    public final void a(float[] fArr, long j10) {
        k(j0.e(j10));
        l(j0.d(j10));
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        e0Var.f16324a = 0;
        n.d(this.f27850h, j10, new j(j10, fArr, e0Var, new kotlin.jvm.internal.d0()));
    }

    public final float b(int i10) {
        m(i10);
        ArrayList arrayList = this.f27850h;
        o oVar = (o) arrayList.get(n.b(i10, arrayList));
        a aVar = oVar.f27864a;
        return aVar.f27747d.e(i10 - oVar.f27867d) + oVar.f27869f;
    }

    public final int c(int i10, boolean z10) {
        int iF;
        m(i10);
        ArrayList arrayList = this.f27850h;
        o oVar = (o) arrayList.get(n.b(i10, arrayList));
        a aVar = oVar.f27864a;
        int i11 = i10 - oVar.f27867d;
        u2.j0 j0Var = aVar.f27747d;
        if (z10) {
            Layout layout = j0Var.f29206f;
            u2.i0 i0Var = u2.l0.f29218a;
            if (layout.getEllipsisCount(i11) <= 0 || j0Var.f29202b != TextUtils.TruncateAt.END) {
                u2.t tVarC = j0Var.c();
                Layout layout2 = tVarC.f29227a;
                iF = tVarC.f(layout2.getLineEnd(i11), layout2.getLineStart(i11));
            } else {
                iF = layout.getEllipsisStart(i11) + layout.getLineStart(i11);
            }
        } else {
            iF = j0Var.f(i11);
        }
        return iF + oVar.f27865b;
    }

    public final int d(int i10) {
        int length = this.f27843a.f27855a.f27761b.length();
        ArrayList arrayList = this.f27850h;
        o oVar = (o) arrayList.get(i10 >= length ? qg.p.i(arrayList) : i10 < 0 ? 0 : n.a(i10, arrayList));
        return oVar.f27864a.f27747d.f29206f.getLineForOffset(oVar.d(i10)) + oVar.f27867d;
    }

    public final int e(float f10) {
        ArrayList arrayList = this.f27850h;
        o oVar = (o) arrayList.get(n.c(arrayList, f10));
        int i10 = oVar.f27866c - oVar.f27865b;
        int i11 = oVar.f27867d;
        if (i10 == 0) {
            return i11;
        }
        a aVar = oVar.f27864a;
        float f11 = f10 - oVar.f27869f;
        u2.j0 j0Var = aVar.f27747d;
        return j0Var.f29206f.getLineForVertical(((int) f11) - j0Var.f29208h) + i11;
    }

    public final float f(int i10) {
        m(i10);
        ArrayList arrayList = this.f27850h;
        o oVar = (o) arrayList.get(n.b(i10, arrayList));
        a aVar = oVar.f27864a;
        return aVar.f27747d.g(i10 - oVar.f27867d) + oVar.f27869f;
    }

    public final int g(long j10) {
        int i10 = (int) (j10 & BodyPartID.bodyIdMax);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        ArrayList arrayList = this.f27850h;
        o oVar = (o) arrayList.get(n.c(arrayList, fIntBitsToFloat));
        int i11 = oVar.f27866c;
        int i12 = oVar.f27865b;
        if (i11 - i12 == 0) {
            return i12;
        }
        a aVar = oVar.f27864a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i10) - oVar.f27869f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat3) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        u2.j0 j0Var = aVar.f27747d;
        int lineForVertical = j0Var.f29206f.getLineForVertical(((int) Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & jFloatToRawIntBits))) - j0Var.f29208h);
        return j0Var.f29206f.getOffsetForHorizontal(lineForVertical, (j0Var.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i12;
    }

    public final long h(p1.e eVar, int i10, f0 f0Var) {
        long jB;
        long j10;
        float f10 = eVar.f21132b;
        ArrayList arrayList = this.f27850h;
        int iC = n.c(arrayList, f10);
        float f11 = ((o) arrayList.get(iC)).f27870g;
        float f12 = eVar.f21134d;
        if (f11 >= f12 || iC == qg.p.i(arrayList)) {
            o oVar = (o) arrayList.get(iC);
            return oVar.b(oVar.f27864a.h(oVar.c(eVar), i10, f0Var), true);
        }
        int iC2 = n.c(arrayList, f12);
        long jB2 = j0.f27837b;
        while (true) {
            jB = j0.f27837b;
            if (!j0.a(jB2, jB) || iC > iC2) {
                break;
            }
            o oVar2 = (o) arrayList.get(iC);
            jB2 = oVar2.b(oVar2.f27864a.h(oVar2.c(eVar), i10, f0Var), true);
            iC++;
        }
        if (j0.a(jB2, jB)) {
            return jB;
        }
        while (true) {
            j10 = j0.f27837b;
            if (!j0.a(jB, j10) || iC > iC2) {
                break;
            }
            o oVar3 = (o) arrayList.get(iC2);
            jB = oVar3.b(oVar3.f27864a.h(oVar3.c(eVar), i10, f0Var), true);
            iC2--;
        }
        return j0.a(jB, j10) ? jB2 : k0.a((int) (jB2 >> 32), (int) (BodyPartID.bodyIdMax & jB));
    }

    public final void k(int i10) {
        boolean z10 = false;
        m mVar = this.f27843a;
        if (i10 >= 0 && i10 < mVar.f27855a.f27761b.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbB = p.i0.b(i10, "offset(", ") is out of bounds [0, ");
        sbB.append(mVar.f27855a.f27761b.length());
        sbB.append(')');
        z2.a.a(sbB.toString());
    }

    public final void l(int i10) {
        boolean z10 = false;
        m mVar = this.f27843a;
        if (i10 >= 0 && i10 <= mVar.f27855a.f27761b.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbB = p.i0.b(i10, "offset(", ") is out of bounds [0, ");
        sbB.append(mVar.f27855a.f27761b.length());
        sbB.append(']');
        z2.a.a(sbB.toString());
    }

    public final void m(int i10) {
        boolean z10 = false;
        int i11 = this.f27848f;
        if (i10 >= 0 && i10 < i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        z2.a.a("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')');
    }
}
