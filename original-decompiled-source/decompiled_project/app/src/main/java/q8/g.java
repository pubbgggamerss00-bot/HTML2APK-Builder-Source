package q8;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import x0.s3;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final h0.e f22215a = h0.f.a(22);

    /* renamed from: b, reason: collision with root package name */
    public static final h0.e f22216b = h0.f.a(14);

    public static final void a(final boolean z10, final eh.a onDismissRequest, final f1.b bVar, x0.j jVar, final int i10) {
        kotlin.jvm.internal.r.e(onDismissRequest, "onDismissRequest");
        x0.k kVarP = jVar.p(-537487658);
        int i11 = i10 | (kVarP.c(z10) ? 4 : 2);
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(onDismissRequest) ? 32 : 16;
        }
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            androidx.compose.ui.d dVarS = androidx.compose.foundation.layout.g.s(d.a.f1143b, 208, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            s3 s3Var = t0.f2.f25858a;
            t0.w.a(z10, onDismissRequest, dVarS, 0L, null, null, f22215a, ((t0.e2) kVarP.f(s3Var)).I, 0, 8, a9.d2.a((float) 0.75d, q1.b1.c(0.08f, ((t0.e2) kVarP.f(s3Var)).f25771q)), bVar, kVarP, (i11 & 14) | 907542912 | (i11 & 112), 48, 56);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: q8.f
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(i10 | 1);
                    g.a(z10, onDismissRequest, bVar, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final eh.p<? super x0.j, ? super Integer, pg.f0> text, final eh.a<pg.f0> onClick, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, x0.j jVar, final int i10, final int i11) {
        final eh.p<? super x0.j, ? super Integer, pg.f0> pVar2;
        kotlin.jvm.internal.r.e(text, "text");
        kotlin.jvm.internal.r.e(onClick, "onClick");
        x0.k kVarP = jVar.p(-913857557);
        int i12 = (kVarP.l(onClick) ? 32 : 16) | i10;
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= kVarP.l(pVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            pVar2 = pVar;
        } else {
            pVar2 = i13 != 0 ? null : pVar;
            t0.w.b(text, onClick, e1.d.d(androidx.compose.foundation.layout.f.j(d.a.f1143b, 6, CropImageView.DEFAULT_ASPECT_RATIO, 2), f22216b), pVar2, null, false, null, null, kVarP, (i12 & 112) | 390 | ((i12 << 3) & V4Signature.MAX_SIGNING_INFOS_SIZE), 496);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: q8.d
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g.b(text, onClick, pVar2, (x0.j) obj, f3.i.n(i10 | 1), i11);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void c(final t0.a3 a3Var, final boolean z10, final eh.a onDismissRequest, final f1.b bVar, x0.j jVar, final int i10) {
        int i11;
        kotlin.jvm.internal.r.e(a3Var, "<this>");
        kotlin.jvm.internal.r.e(onDismissRequest, "onDismissRequest");
        x0.k kVarP = jVar.p(755803013);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? kVarP.K(a3Var) : kVarP.l(a3Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(onDismissRequest) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.l(bVar) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            s3 s3Var = t0.f2.f25858a;
            long j10 = ((t0.e2) kVarP.f(s3Var)).I;
            t.v vVarA = a9.d2.a((float) 0.75d, q1.b1.c(0.08f, ((t0.e2) kVarP.f(s3Var)).f25771q));
            int i12 = i11 >> 3;
            a3Var.a(z10, onDismissRequest, null, null, false, f22215a, j10, 0, 8, vVarA, bVar, kVarP, (i12 & 14) | 113442816 | (i12 & 112), ((i11 >> 9) & 14) | ((i11 << 3) & 112));
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: q8.e
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g.c(a3Var, z10, onDismissRequest, bVar, (x0.j) obj, f3.i.n(i10 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
