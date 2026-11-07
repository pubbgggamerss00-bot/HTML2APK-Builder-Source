package t2;

import android.graphics.RectF;
import android.text.Layout;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmc.BodyPartID;
import r.e2;
import r.z1;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f27819a;

    /* renamed from: b, reason: collision with root package name */
    public final l f27820b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27821c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27822d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27823e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f27824f;

    public h0(g0 g0Var, l lVar, long j10) {
        this.f27819a = g0Var;
        this.f27820b = lVar;
        this.f27821c = j10;
        ArrayList arrayList = lVar.f27850h;
        boolean zIsEmpty = arrayList.isEmpty();
        float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f27822d = zIsEmpty ? 0.0f : ((o) arrayList.get(0)).f27864a.c();
        if (!arrayList.isEmpty()) {
            o oVar = (o) qg.x.J(arrayList);
            f10 = oVar.f27864a.f() + oVar.f27869f;
        }
        this.f27823e = f10;
        this.f27824f = lVar.f27849g;
    }

    public final e3.g a(int i10) {
        l lVar = this.f27820b;
        ArrayList arrayList = lVar.f27850h;
        lVar.l(i10);
        o oVar = (o) arrayList.get(i10 == lVar.f27843a.f27855a.f27761b.length() ? qg.p.i(arrayList) : n.a(i10, arrayList));
        return oVar.f27864a.b(oVar.d(i10));
    }

    public final p1.e b(int i10) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        l lVar = this.f27820b;
        lVar.k(i10);
        ArrayList arrayList = lVar.f27850h;
        o oVar = (o) arrayList.get(n.a(i10, arrayList));
        a aVar = oVar.f27864a;
        int iD = oVar.d(i10);
        CharSequence charSequence = aVar.f27748e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbB = p.i0.b(iD, "offset(", ") is out of bounds [0,");
            sbB.append(charSequence.length());
            sbB.append(')');
            z2.a.a(sbB.toString());
        }
        u2.j0 j0Var = aVar.f27747d;
        Layout layout = j0Var.f29206f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = j0Var.g(lineForOffset);
        float fE = j0Var.e(lineForOffset);
        boolean z10 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fH = j0Var.i(iD, false);
                fH2 = j0Var.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = j0Var.h(iD, false);
                fH2 = j0Var.h(iD + 1, true);
            } else {
                fI = j0Var.i(iD, false);
                fI2 = j0Var.i(iD + 1, true);
            }
            float f10 = fH;
            fI = fH2;
            fI2 = f10;
        } else {
            fI = j0Var.h(iD, false);
            fI2 = j0Var.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return oVar.a(new p1.e(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final p1.e c(int i10) {
        l lVar = this.f27820b;
        ArrayList arrayList = lVar.f27850h;
        lVar.l(i10);
        o oVar = (o) arrayList.get(i10 == lVar.f27843a.f27855a.f27761b.length() ? qg.p.i(arrayList) : n.a(i10, arrayList));
        a aVar = oVar.f27864a;
        int iD = oVar.d(i10);
        CharSequence charSequence = aVar.f27748e;
        u2.j0 j0Var = aVar.f27747d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbB = p.i0.b(iD, "offset(", ") is out of bounds [0,");
            sbB.append(charSequence.length());
            sbB.append(']');
            z2.a.a(sbB.toString());
        }
        float fH = j0Var.h(iD, false);
        int lineForOffset = j0Var.f29206f.getLineForOffset(iD);
        return oVar.a(new p1.e(fH, j0Var.g(lineForOffset), fH, j0Var.e(lineForOffset)));
    }

    public final boolean d() {
        long j10 = this.f27821c;
        float f10 = (int) (j10 >> 32);
        l lVar = this.f27820b;
        return f10 < lVar.f27846d || lVar.f27845c || ((float) ((int) (j10 & BodyPartID.bodyIdMax))) < lVar.f27847e;
    }

    public final float e(int i10) {
        l lVar = this.f27820b;
        lVar.m(i10);
        ArrayList arrayList = lVar.f27850h;
        o oVar = (o) arrayList.get(n.b(i10, arrayList));
        a aVar = oVar.f27864a;
        int i11 = i10 - oVar.f27867d;
        u2.j0 j0Var = aVar.f27747d;
        return j0Var.f29206f.getLineLeft(i11) + (i11 == j0Var.f29207g + (-1) ? j0Var.f29210j : CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.r.a(this.f27819a, h0Var.f27819a) && this.f27820b.equals(h0Var.f27820b) && f3.p.b(this.f27821c, h0Var.f27821c) && this.f27822d == h0Var.f27822d && this.f27823e == h0Var.f27823e && kotlin.jvm.internal.r.a(this.f27824f, h0Var.f27824f);
    }

    public final float f(int i10) {
        l lVar = this.f27820b;
        lVar.m(i10);
        ArrayList arrayList = lVar.f27850h;
        o oVar = (o) arrayList.get(n.b(i10, arrayList));
        a aVar = oVar.f27864a;
        int i11 = i10 - oVar.f27867d;
        u2.j0 j0Var = aVar.f27747d;
        return j0Var.f29206f.getLineRight(i11) + (i11 == j0Var.f29207g + (-1) ? j0Var.f29211k : CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final int g(int i10) {
        l lVar = this.f27820b;
        lVar.m(i10);
        ArrayList arrayList = lVar.f27850h;
        o oVar = (o) arrayList.get(n.b(i10, arrayList));
        a aVar = oVar.f27864a;
        return aVar.f27747d.f29206f.getLineStart(i10 - oVar.f27867d) + oVar.f27865b;
    }

    public final e3.g h(int i10) {
        l lVar = this.f27820b;
        ArrayList arrayList = lVar.f27850h;
        lVar.l(i10);
        o oVar = (o) arrayList.get(i10 == lVar.f27843a.f27855a.f27761b.length() ? qg.p.i(arrayList) : n.a(i10, arrayList));
        a aVar = oVar.f27864a;
        int iD = oVar.d(i10);
        u2.j0 j0Var = aVar.f27747d;
        return j0Var.f29206f.getParagraphDirection(j0Var.f29206f.getLineForOffset(iD)) == 1 ? e3.g.f8360a : e3.g.f8361b;
    }

    public final int hashCode() {
        return this.f27824f.hashCode() + z1.a(this.f27823e, z1.a(this.f27822d, e2.a((this.f27820b.hashCode() + (this.f27819a.hashCode() * 31)) * 31, 31, this.f27821c), 31), 31);
    }

    public final q1.j0 i(int i10, int i11) {
        l lVar = this.f27820b;
        b bVar = lVar.f27843a.f27855a;
        if (i10 < 0 || i10 > i11 || i11 > bVar.f27761b.length()) {
            StringBuilder sbA = p.g0.a(i10, i11, "Start(", ") or End(", ") is out of range [0..");
            sbA.append(bVar.f27761b.length());
            sbA.append("), or start > end!");
            z2.a.a(sbA.toString());
        }
        if (i10 == i11) {
            return q1.l0.a();
        }
        q1.j0 j0VarA = q1.l0.a();
        n.d(lVar.f27850h, k0.a(i10, i11), new k(j0VarA, i10, i11));
        return j0VarA;
    }

    public final long j(int i10) {
        int i11;
        int iH;
        int iH2;
        l lVar = this.f27820b;
        ArrayList arrayList = lVar.f27850h;
        lVar.l(i10);
        o oVar = (o) arrayList.get(i10 == lVar.f27843a.f27855a.f27761b.length() ? qg.p.i(arrayList) : n.a(i10, arrayList));
        a aVar = oVar.f27864a;
        int iD = oVar.d(i10);
        v2.g gVarJ = aVar.f27747d.j();
        if (gVarJ.g(gVarJ.i(iD))) {
            gVarJ.a(iD);
            i11 = iD;
            while (i11 != -1 && (!gVarJ.g(i11) || gVarJ.c(i11))) {
                i11 = gVarJ.i(i11);
            }
        } else {
            gVarJ.a(iD);
            i11 = gVarJ.f(iD) ? (!gVarJ.d(iD) || gVarJ.b(iD)) ? gVarJ.i(iD) : iD : gVarJ.b(iD) ? gVarJ.i(iD) : -1;
        }
        if (i11 == -1) {
            i11 = iD;
        }
        if (gVarJ.c(gVarJ.h(iD))) {
            gVarJ.a(iD);
            iH = iD;
            while (iH != -1 && (gVarJ.g(iH) || !gVarJ.c(iH))) {
                iH = gVarJ.h(iH);
            }
        } else {
            gVarJ.a(iD);
            if (gVarJ.b(iD)) {
                if (!gVarJ.d(iD) || gVarJ.f(iD)) {
                    iH2 = gVarJ.h(iD);
                    iH = iH2;
                } else {
                    iH = iD;
                }
            } else if (gVarJ.f(iD)) {
                iH2 = gVarJ.h(iD);
                iH = iH2;
            } else {
                iH = -1;
            }
        }
        if (iH != -1) {
            iD = iH;
        }
        return oVar.b(k0.a(i11, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f27819a + ", multiParagraph=" + this.f27820b + ", size=" + ((Object) f3.p.c(this.f27821c)) + ", firstBaseline=" + this.f27822d + ", lastBaseline=" + this.f27823e + ", placeholderRects=" + this.f27824f + ')';
    }
}
