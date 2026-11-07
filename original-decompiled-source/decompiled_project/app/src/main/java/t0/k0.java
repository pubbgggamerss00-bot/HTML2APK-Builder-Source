package t0;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import x0.j;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f26210a = new k0();

    /* renamed from: b, reason: collision with root package name */
    public static final float f26211b;

    static {
        float f10 = v0.e0.f30270a;
        float f11 = v0.e0.f30272c;
        f26211b = 640;
    }

    public final void a(float f10, float f11, int i10, long j10, androidx.compose.ui.d dVar, q1.f2 f2Var, x0.j jVar) {
        float f12;
        float f13;
        androidx.compose.ui.d dVar2;
        q1.f2 f2Var2;
        long j11;
        x0.k kVar;
        float f14;
        float f15;
        androidx.compose.ui.d dVar3;
        q1.f2 f2Var3;
        long j12;
        x0.k kVarP = jVar.p(-1364277227);
        if (((i10 | 9654) & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
            f14 = f10;
            f15 = f11;
            j12 = j10;
            dVar3 = dVar;
            f2Var3 = f2Var;
            kVar = kVarP;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                f12 = v0.e0.f30271b;
                f13 = v0.e0.f30270a;
                h0.a aVar = ((za) kVarP.f(ab.f25480a)).f27600e;
                long jE = f2.e(v0.d.f30245j, kVarP);
                dVar2 = d.a.f1143b;
                f2Var2 = aVar;
                j11 = jE;
            } else {
                kVarP.v();
                f12 = f10;
                f13 = f11;
                j11 = j10;
                dVar2 = dVar;
                f2Var2 = f2Var;
            }
            kVarP.U();
            String strB = di.a.b(R.string.m3c_bottom_sheet_drag_handle_description, kVarP);
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(dVar2, CropImageView.DEFAULT_ASPECT_RATIO, db.f25688a, 1);
            boolean zK = kVarP.K(strB);
            Object objG = kVarP.g();
            if (zK || objG == j.a.f31715a) {
                objG = new h0(strB);
                kVarP.C(objG);
            }
            kVar = kVarP;
            md.a(q2.q.a(dVarJ, false, (eh.l) objG), f2Var2, j11, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1039573072, new i0(f12, f13), kVarP), kVar, 12582912, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
            f14 = f12;
            f15 = f13;
            dVar3 = dVar2;
            f2Var3 = f2Var2;
            j12 = j11;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new j0(this, dVar3, f14, f15, f2Var3, j12, i10);
        }
    }
}
