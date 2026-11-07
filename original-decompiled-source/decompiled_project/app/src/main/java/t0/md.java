package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class md {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.m0 f26474a = new x0.m0(a.f26475a);

    public static final class a extends kotlin.jvm.internal.s implements eh.a<f3.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26475a = new a(0);

        @Override // eh.a
        public final f3.h invoke() {
            return new f3.h(0);
        }
    }

    public static final void a(androidx.compose.ui.d dVar, q1.f2 f2Var, long j10, long j11, float f10, float f11, t.v vVar, f1.b bVar, x0.j jVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            dVar = d.a.f1143b;
        }
        if ((i11 & 2) != 0) {
            f2Var = q1.y1.f21750a;
        }
        if ((i11 & 8) != 0) {
            j11 = f2.b(j10, jVar);
        }
        if ((i11 & 16) != 0) {
            f10 = 0;
        }
        if ((i11 & 32) != 0) {
            f11 = 0;
        }
        if ((i11 & 64) != 0) {
            vVar = null;
        }
        x0.m0 m0Var = f26474a;
        float f12 = f10 + ((f3.h) jVar.f(m0Var)).f8817a;
        x0.y.b(new x0.f2[]{com.android.aapt.a.b(j11, p2.f26666a), m0Var.a(new f3.h(f12))}, f1.c.b(-70914509, new pd(dVar, f2Var, j10, f12, vVar, f11, bVar), jVar), jVar, 56);
    }

    public static final void b(eh.a aVar, androidx.compose.ui.d dVar, boolean z10, q1.f2 f2Var, long j10, long j11, float f10, float f11, t.v vVar, x.m mVar, f1.b bVar, x0.j jVar, int i10, int i11) {
        androidx.compose.ui.d dVar2 = (i11 & 2) != 0 ? d.a.f1143b : dVar;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        long jB = (i11 & 32) != 0 ? f2.b(j10, jVar) : j11;
        float f12 = (i11 & 64) != 0 ? 0 : f10;
        float f13 = (i11 & 128) != 0 ? 0 : f11;
        t.v vVar2 = (i11 & 256) != 0 ? null : vVar;
        x.m mVar2 = (i11 & 512) != 0 ? null : mVar;
        x0.m0 m0Var = f26474a;
        float f14 = ((f3.h) jVar.f(m0Var)).f8817a + f12;
        x0.y.b(new x0.f2[]{com.android.aapt.a.b(jB, p2.f26666a), m0Var.a(new f3.h(f14))}, f1.c.b(1279702876, new qd(dVar2, f2Var, j10, f14, vVar2, mVar2, z11, aVar, f13, bVar), jVar), jVar, 56);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, q1.f2 f2Var, long j10, t.v vVar, float f10) {
        q1.f2 f2Var2;
        androidx.compose.ui.d dVarB;
        androidx.compose.ui.d dVarB2 = d.a.f1143b;
        if (f10 > CropImageView.DEFAULT_ASPECT_RATIO) {
            f2Var2 = f2Var;
            dVarB = androidx.compose.ui.graphics.a.b(dVarB2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, f2Var2, false, 124895);
        } else {
            f2Var2 = f2Var;
            dVarB = dVarB2;
        }
        androidx.compose.ui.d dVarH = dVar.h(dVarB);
        if (vVar != null) {
            dVarB2 = t.o.b(dVarB2, vVar.f25389a, vVar.f25390b, f2Var2);
        }
        return e1.d.d(androidx.compose.foundation.a.b(dVarH.h(dVarB2), j10, f2Var2), f2Var2);
    }

    public static final long d(long j10, float f10, x0.j jVar) {
        e2 e2Var = (e2) jVar.f(f2.f25858a);
        boolean zBooleanValue = ((Boolean) jVar.f(f2.f25859b)).booleanValue();
        long j11 = e2Var.f25770p;
        return (q1.b1.d(j10, j11) && zBooleanValue) ? f3.h.a(f10, (float) 0) ? j11 : c2.n0.f(q1.b1.c(((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, e2Var.f25774t), j11) : j10;
    }
}
