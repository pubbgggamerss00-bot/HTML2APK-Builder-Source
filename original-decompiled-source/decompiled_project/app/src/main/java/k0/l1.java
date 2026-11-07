package k0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import com.yalantis.ucrop.view.CropImageView;
import k0.b;
import q1.x1;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final b.a.C0157b f15856a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f15857b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15859d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15860e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15861f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15862g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15863h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15864i;

    /* renamed from: j, reason: collision with root package name */
    public y2.c0 f15865j;

    /* renamed from: k, reason: collision with root package name */
    public t2.h0 f15866k;

    /* renamed from: l, reason: collision with root package name */
    public y2.v f15867l;

    /* renamed from: m, reason: collision with root package name */
    public p1.e f15868m;

    /* renamed from: n, reason: collision with root package name */
    public p1.e f15869n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15858c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f15870o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f15871p = q1.r1.a();

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f15872q = new Matrix();

    public l1(b.a.C0157b c0157b, h1 h1Var) {
        this.f15856a = c0157b;
        this.f15857b = h1Var;
    }

    public final void a() {
        CursorAnchorInfo.Builder builder;
        int iE;
        int iE2;
        h1 h1Var = this.f15857b;
        InputMethodManager inputMethodManagerA = h1Var.a();
        View view = h1Var.f15846a;
        if (!inputMethodManagerA.isActive(view) || this.f15865j == null || this.f15867l == null || this.f15866k == null || this.f15868m == null || this.f15869n == null) {
            return;
        }
        float[] fArr = this.f15871p;
        q1.r1.d(fArr);
        g2.v vVarS = this.f15856a.f15815a.S();
        if (vVarS != null) {
            if (!vVarS.m()) {
                vVarS = null;
            }
            if (vVarS != null) {
                vVarS.I(fArr);
            }
        }
        pg.f0 f0Var = pg.f0.f21461a;
        p1.e eVar = this.f15869n;
        kotlin.jvm.internal.r.b(eVar);
        float f10 = -eVar.f21131a;
        p1.e eVar2 = this.f15869n;
        kotlin.jvm.internal.r.b(eVar2);
        q1.r1.f(fArr, f10, -eVar2.f21132b);
        Matrix matrix = this.f15872q;
        q1.g0.b(matrix, fArr);
        y2.c0 c0Var = this.f15865j;
        kotlin.jvm.internal.r.b(c0Var);
        long j10 = c0Var.f33683b;
        y2.v vVar = this.f15867l;
        kotlin.jvm.internal.r.b(vVar);
        t2.h0 h0Var = this.f15866k;
        kotlin.jvm.internal.r.b(h0Var);
        t2.l lVar = h0Var.f27820b;
        p1.e eVar3 = this.f15868m;
        kotlin.jvm.internal.r.b(eVar3);
        float f11 = eVar3.f21134d;
        float f12 = eVar3.f21132b;
        p1.e eVar4 = this.f15869n;
        kotlin.jvm.internal.r.b(eVar4);
        boolean z10 = this.f15861f;
        boolean z11 = this.f15862g;
        boolean z12 = this.f15863h;
        boolean z13 = this.f15864i;
        CursorAnchorInfo.Builder builder2 = this.f15870o;
        builder2.reset();
        builder2.setMatrix(matrix);
        t2.j0 j0Var = c0Var.f33684c;
        int iE3 = t2.j0.e(j10);
        builder2.setSelectionRange(iE3, t2.j0.d(j10));
        if (!z10 || iE3 < 0) {
            builder = builder2;
        } else {
            int iB = vVar.b(iE3);
            p1.e eVarC = h0Var.c(iB);
            float fL = jh.j.l(eVarC.f21131a, CropImageView.DEFAULT_ASPECT_RATIO, (int) (h0Var.f27821c >> 32));
            boolean zA = k1.a(eVar3, fL, eVarC.f21132b);
            boolean zA2 = k1.a(eVar3, fL, eVarC.f21134d);
            boolean z14 = h0Var.a(iB) == e3.g.f8361b;
            int i10 = (zA || zA2) ? 1 : 0;
            if (!zA || !zA2) {
                i10 |= 2;
            }
            if (z14) {
                i10 |= 4;
            }
            float f13 = eVarC.f21132b;
            float f14 = eVarC.f21134d;
            builder2.setInsertionMarkerLocation(fL, f13, f14, f14, i10);
            builder = builder2;
        }
        if (z11) {
            int iE4 = j0Var != null ? t2.j0.e(j0Var.f27839a) : -1;
            int iD = j0Var != null ? t2.j0.d(j0Var.f27839a) : -1;
            if (iE4 >= 0 && iE4 < iD) {
                builder.setComposingText(iE4, c0Var.f33682a.f27761b.subSequence(iE4, iD));
                int iB2 = vVar.b(iE4);
                int iB3 = vVar.b(iD);
                float[] fArr2 = new float[(iB3 - iB2) * 4];
                lVar.a(fArr2, t2.k0.a(iB2, iB3));
                while (iE4 < iD) {
                    int iB4 = vVar.b(iE4);
                    int i11 = (iB4 - iB2) * 4;
                    float f15 = fArr2[i11];
                    CursorAnchorInfo.Builder builder3 = builder;
                    float f16 = fArr2[i11 + 1];
                    int i12 = iD;
                    float f17 = fArr2[i11 + 2];
                    float f18 = fArr2[i11 + 3];
                    int i13 = iB2;
                    int i14 = (eVar3.f21131a < f17 ? 1 : 0) & (f15 < eVar3.f21133c ? 1 : 0) & (f12 < f18 ? 1 : 0) & (f16 < f11 ? 1 : 0);
                    if (!k1.a(eVar3, f15, f16) || !k1.a(eVar3, f17, f18)) {
                        i14 |= 2;
                    }
                    if (h0Var.a(iB4) == e3.g.f8361b) {
                        i14 |= 4;
                    }
                    int i15 = iE4;
                    builder3.addCharacterBounds(i15, f15, f16, f17, f18, i14);
                    builder = builder3;
                    iE4 = i15 + 1;
                    iD = i12;
                    iB2 = i13;
                }
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 33 && z12) {
            builder.setEditorBoundsInfo(i.a().setEditorBounds(x1.c(eVar4)).setHandwritingBounds(x1.c(eVar4)).build());
        }
        if (i16 >= 34 && z13 && !eVar3.g() && (iE = lVar.e(f12)) <= (iE2 = lVar.e(f11))) {
            while (true) {
                builder.addVisibleLineBounds(h0Var.e(iE), lVar.f(iE), h0Var.f(iE), lVar.b(iE));
                if (iE == iE2) {
                    break;
                } else {
                    iE++;
                }
            }
        }
        h1Var.a().updateCursorAnchorInfo(view, builder.build());
        this.f15860e = false;
    }
}
