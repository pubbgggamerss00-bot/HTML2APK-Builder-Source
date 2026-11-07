package t1;

import android.graphics.Canvas;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p.m0;
import p.y0;
import q1.j0;
import q1.l0;
import q1.p1;
import q1.s1;
import q1.u1;
import q1.w0;
import s1.a;

/* loaded from: classes.dex */
public final class f {
    public static final void a(s1.e eVar, d dVar) {
        boolean z10;
        boolean z11;
        Canvas canvas;
        boolean z12;
        float f10;
        w0 w0VarA = eVar.Q0().a();
        d dVar2 = eVar.Q0().f24181b;
        e eVar2 = dVar.f27634a;
        if (dVar.f27652s) {
            return;
        }
        dVar.a();
        if (!eVar2.t()) {
            try {
                dVar.f27634a.u(dVar.f27635b, dVar.f27636c, dVar, dVar.f27638e);
            } catch (Throwable unused) {
            }
        }
        boolean z13 = eVar2.J() > CropImageView.DEFAULT_ASPECT_RATIO;
        if (z13) {
            w0VarA.s();
        }
        Canvas canvasA = q1.c0.a(w0VarA);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j10 = dVar.f27653t;
            float f11 = (int) (j10 >> 32);
            float f12 = (int) (j10 & BodyPartID.bodyIdMax);
            long j11 = dVar.f27654u;
            float f13 = ((int) (j11 >> 32)) + f11;
            float f14 = ((int) (j11 & BodyPartID.bodyIdMax)) + f12;
            float fI = eVar2.i();
            int iL = eVar2.L();
            if (fI < 1.0f || iL != 3 || eVar2.q() == 1) {
                q1.h0 h0VarA = dVar.f27649p;
                if (h0VarA == null) {
                    h0VarA = q1.i0.a();
                    dVar.f27649p = h0VarA;
                }
                h0VarA.g(fI);
                h0VarA.h(iL);
                h0VarA.j(null);
                canvasA = canvasA;
                f10 = f11;
                canvasA.saveLayer(f10, f12, f13, f14, h0VarA.f21694a);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f10 = f11;
            }
            canvasA.translate(f10, f12);
            canvasA.concat(eVar2.I());
        }
        boolean z14 = !zIsHardwareAccelerated && dVar.f27656w;
        if (z14) {
            w0VarA.d();
            s1 s1VarD = dVar.d();
            if (s1VarD instanceof s1.b) {
                w0VarA.h(((s1.b) s1VarD).f21734a);
            } else if (s1VarD instanceof s1.c) {
                j0 j0VarA = dVar.f27646m;
                if (j0VarA != null) {
                    j0VarA.n();
                } else {
                    j0VarA = l0.a();
                    dVar.f27646m = j0VarA;
                }
                u1.f(j0VarA, ((s1.c) s1VarD).f21735a);
                w0VarA.i(j0VarA);
            } else if (s1VarD instanceof s1.a) {
                w0VarA.i(((s1.a) s1VarD).f21733a);
            }
        }
        if (dVar2 != null) {
            a aVar = dVar2.f27651r;
            if (!aVar.f27628e) {
                p1.a("Only add dependencies during a tracking");
            }
            m0<d> m0Var = aVar.f27626c;
            if (m0Var != null) {
                m0Var.d(dVar);
            } else if (aVar.f27624a != null) {
                m0<d> m0VarA = y0.a();
                d dVar3 = aVar.f27624a;
                kotlin.jvm.internal.r.b(dVar3);
                m0VarA.d(dVar3);
                m0VarA.d(dVar);
                aVar.f27626c = m0VarA;
                aVar.f27624a = null;
            } else {
                aVar.f27624a = dVar;
            }
            m0<d> m0Var2 = aVar.f27627d;
            if (m0Var2 != null) {
                z12 = !m0Var2.l(dVar);
            } else if (aVar.f27625b != dVar) {
                z12 = true;
            } else {
                aVar.f27625b = null;
                z12 = false;
            }
            if (z12) {
                dVar.f27650q++;
            }
        }
        if (q1.c0.a(w0VarA).isHardwareAccelerated()) {
            z10 = z13;
            z11 = z14;
            canvas = canvasA;
            eVar2.v(w0VarA);
        } else {
            s1.a aVar2 = dVar.f27648o;
            if (aVar2 == null) {
                aVar2 = new s1.a();
                dVar.f27648o = aVar2;
            }
            a.b bVar = aVar2.f24173b;
            f3.d dVar4 = dVar.f27635b;
            f3.r rVar = dVar.f27636c;
            long jE = f3.q.e(dVar.f27654u);
            f3.d dVarB = bVar.b();
            f3.r rVarC = bVar.c();
            w0 w0VarA2 = bVar.a();
            z11 = z14;
            canvas = canvasA;
            long jD = bVar.d();
            z10 = z13;
            d dVar5 = bVar.f24181b;
            bVar.f(dVar4);
            bVar.g(rVar);
            bVar.e(w0VarA);
            bVar.h(jE);
            bVar.f24181b = dVar;
            w0VarA.d();
            try {
                dVar.c(aVar2);
            } finally {
                w0VarA.o();
                bVar.f(dVarB);
                bVar.g(rVarC);
                bVar.e(w0VarA2);
                bVar.h(jD);
                bVar.f24181b = dVar5;
            }
        }
        if (z11) {
            w0VarA.o();
        }
        if (z10) {
            w0VarA.f();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }
}
