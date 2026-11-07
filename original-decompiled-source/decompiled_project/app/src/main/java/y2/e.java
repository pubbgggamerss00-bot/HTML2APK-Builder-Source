package y2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import q1.r1;
import q1.x1;

@pg.d
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f33686a;

    /* renamed from: b, reason: collision with root package name */
    public final p f33687b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33689d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33690e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33691f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33692g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33693h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f33694i;

    /* renamed from: j, reason: collision with root package name */
    public c0 f33695j;

    /* renamed from: k, reason: collision with root package name */
    public t2.h0 f33696k;

    /* renamed from: l, reason: collision with root package name */
    public v f33697l;

    /* renamed from: n, reason: collision with root package name */
    public p1.e f33699n;

    /* renamed from: o, reason: collision with root package name */
    public p1.e f33700o;

    /* renamed from: c, reason: collision with root package name */
    public final Object f33688c = new Object();

    /* renamed from: m, reason: collision with root package name */
    public eh.l<? super r1, pg.f0> f33698m = d.f33685a;

    /* renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f33701p = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name */
    public final float[] f33702q = r1.a();

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f33703r = new Matrix();

    public e(AndroidComposeView androidComposeView, p pVar) {
        this.f33686a = androidComposeView;
        this.f33687b = pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pg.j] */
    public final void a() {
        View view;
        CursorAnchorInfo.Builder builder;
        int iE;
        int iE2;
        p pVar = this.f33687b;
        ?? r22 = pVar.f33762b;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view2 = pVar.f33761a;
        if (inputMethodManager.isActive(view2)) {
            eh.l<? super r1, pg.f0> lVar = this.f33698m;
            float[] fArr = this.f33702q;
            lVar.invoke(new r1(fArr));
            this.f33686a.s(fArr);
            Matrix matrix = this.f33703r;
            q1.g0.b(matrix, fArr);
            c0 c0Var = this.f33695j;
            kotlin.jvm.internal.r.b(c0Var);
            long j10 = c0Var.f33683b;
            v vVar = this.f33697l;
            kotlin.jvm.internal.r.b(vVar);
            t2.h0 h0Var = this.f33696k;
            kotlin.jvm.internal.r.b(h0Var);
            t2.l lVar2 = h0Var.f27820b;
            p1.e eVar = this.f33699n;
            kotlin.jvm.internal.r.b(eVar);
            float f10 = eVar.f21134d;
            float f11 = eVar.f21132b;
            p1.e eVar2 = this.f33700o;
            kotlin.jvm.internal.r.b(eVar2);
            boolean z10 = this.f33691f;
            boolean z11 = this.f33692g;
            boolean z12 = this.f33693h;
            boolean z13 = this.f33694i;
            CursorAnchorInfo.Builder builder2 = this.f33701p;
            builder2.reset();
            builder2.setMatrix(matrix);
            t2.j0 j0Var = c0Var.f33684c;
            int iE3 = t2.j0.e(j10);
            builder2.setSelectionRange(iE3, t2.j0.d(j10));
            if (!z10 || iE3 < 0) {
                view = view2;
                builder = builder2;
            } else {
                int iB = vVar.b(iE3);
                p1.e eVarC = h0Var.c(iB);
                view = view2;
                float fL = jh.j.l(eVarC.f21131a, CropImageView.DEFAULT_ASPECT_RATIO, (int) (h0Var.f27821c >> 32));
                boolean zA = b.a(eVar, fL, eVarC.f21132b);
                boolean zA2 = b.a(eVar, fL, eVarC.f21134d);
                boolean z14 = h0Var.a(iB) == e3.g.f8361b;
                int i10 = (zA || zA2) ? 1 : 0;
                if (!zA || !zA2) {
                    i10 |= 2;
                }
                if (z14) {
                    i10 |= 4;
                }
                float f12 = eVarC.f21132b;
                float f13 = eVarC.f21134d;
                builder2.setInsertionMarkerLocation(fL, f12, f13, f13, i10);
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
                    lVar2.a(fArr2, t2.k0.a(iB2, iB3));
                    while (iE4 < iD) {
                        int iB4 = vVar.b(iE4);
                        int i11 = (iB4 - iB2) * 4;
                        float f14 = fArr2[i11];
                        float f15 = fArr2[i11 + 1];
                        CursorAnchorInfo.Builder builder3 = builder;
                        float f16 = fArr2[i11 + 2];
                        float f17 = fArr2[i11 + 3];
                        int i12 = iD;
                        int i13 = (eVar.f21131a < f16 ? 1 : 0) & (f14 < eVar.f21133c ? 1 : 0) & (f11 < f17 ? 1 : 0) & (f15 < f10 ? 1 : 0);
                        if (!b.a(eVar, f14, f15) || !b.a(eVar, f16, f17)) {
                            i13 |= 2;
                        }
                        if (h0Var.a(iB4) == e3.g.f8361b) {
                            i13 |= 4;
                        }
                        int i14 = iE4;
                        builder3.addCharacterBounds(i14, f14, f15, f16, f17, i13);
                        builder = builder3;
                        iE4 = i14 + 1;
                        iD = i12;
                    }
                }
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 33 && z12) {
                builder.setEditorBoundsInfo(k0.i.a().setEditorBounds(x1.c(eVar2)).setHandwritingBounds(x1.c(eVar2)).build());
            }
            if (i15 >= 34 && z13 && !eVar.g() && (iE = lVar2.e(f11)) <= (iE2 = lVar2.e(f10))) {
                while (true) {
                    builder.addVisibleLineBounds(h0Var.e(iE), lVar2.f(iE), h0Var.f(iE), lVar2.b(iE));
                    if (iE == iE2) {
                        break;
                    } else {
                        iE++;
                    }
                }
            }
            ((InputMethodManager) r22.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f33690e = false;
        }
    }
}
