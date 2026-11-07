package u;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n0;
import com.yalantis.ucrop.view.CropImageView;
import i0.i0;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import j3.o0;
import j3.p0;
import ph.m0;
import ph.v1;
import q1.b1;
import q1.y1;
import t2.l0;
import x0.a2;
import x0.h2;
import x0.j;
import z.b;
import z.k1;
import z.m1;
import z.w0;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f28938a = new p0(14);

    /* renamed from: b, reason: collision with root package name */
    public static final g f28939b;

    static {
        long j10 = b1.f21650d;
        long j11 = b1.f21648b;
        f28939b = new g(j10, j11, j11, b1.c(0.38f, j11), b1.c(0.38f, j11));
    }

    public static final void a(g gVar, f1.b bVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(-921259293);
        int i11 = (kVarP.K(gVar) ? 4 : 2) | i10;
        d.a aVar = d.a.f1143b;
        int i12 = i11 | (kVarP.K(aVar) ? 32 : 16);
        if (kVarP.A(i12 & 1, (i12 & 147) != 146)) {
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(n1.q.a(aVar, o.f28905d, h0.f.a(o.f28906e)), gVar.f28883a, y1.f21750a);
            w0 w0Var = w0.f34658a;
            androidx.compose.ui.d dVarE = m0.e(androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.d.b(dVarB), CropImageView.DEFAULT_ASPECT_RATIO, o.f28910i, 1), m0.c(kVarP), true);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i13 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarE, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            v1.j(g.a.f13867f, qVarA, kVarP);
            v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, kVarP);
            bVar.b(z.s.f34624a, kVarP, 54);
            kVarP.T(true);
        } else {
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new r(gVar, bVar, i10);
        }
    }

    public static final void b(String str, g gVar, eh.a aVar, x0.j jVar, int i10) {
        int i11;
        int i12;
        String str2;
        x0.k kVarP = jVar.p(791018367);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i11;
        if ((i10 & 48) == 0) {
            i12 = (kVarP.c(true) ? 32 : 16) | i13;
        } else {
            i12 = i13;
        }
        if ((i10 & 384) == 0) {
            i12 |= kVarP.K(gVar) ? 256 : 128;
        }
        int i14 = i10 & 3072;
        d.a aVar2 = d.a.f1143b;
        if (i14 == 0) {
            i12 |= kVarP.K(aVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= kVarP.l(null) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= kVarP.l(aVar) ? 131072 : 65536;
        }
        int i15 = i12;
        if (kVarP.A(i15 & 1, (74899 & i15) != 74898)) {
            f.b bVar = o.f28907f;
            b.j jVar2 = z.b.f34444a;
            float f10 = o.f28909h;
            b.i iVarH = z.b.h(f10);
            boolean z10 = ((i15 & 112) == 32) | ((458752 & i15) == 131072);
            Object objG = kVarP.g();
            if (z10 || objG == j.a.f31715a) {
                objG = new s(aVar);
                kVarP.C(objG);
            }
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(androidx.compose.foundation.b.c(aVar2, true, str, null, (eh.a) objG, 4), 1.0f);
            float f11 = o.f28902a;
            float f12 = o.f28903b;
            float f13 = o.f28904c;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.p(dVarD, f11, f13, f12, f13), f10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            m1 m1VarA = k1.a(iVarH, bVar, kVarP, 54);
            int i16 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            v1.j(g.a.f13867f, m1VarA, kVarP);
            v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, kVarP);
            kVarP.L(554788141);
            kVarP.T(false);
            l0 l0Var = new l0(gVar.f28884b, o.f28911j, o.f28912k, null, o.f28914m, o.f28908g, o.f28913l, 16613240);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            str2 = str;
            i0.b(str2, new LayoutWeightElement(1.0f, true), l0Var, 0, false, 1, 0, kVarP, (i15 & 14) | 1572864, 952);
            kVarP.T(true);
        } else {
            str2 = str;
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new t(str2, gVar, aVar, i10);
        }
    }

    public static final void c(o0 o0Var, eh.a aVar, eh.l lVar, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(712057293);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(o0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.K(d.a.f1143b) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.l(lVar) ? 2048 : 1024;
        }
        if (kVarP.A(i11 & 1, (i11 & 1171) != 1170)) {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            boolean zK = kVarP.K((Configuration) kVarP.f(AndroidCompositionLocals_androidKt.f1280a)) | kVarP.K(context);
            Object objG = kVarP.g();
            if (zK || objG == j.a.f31715a) {
                g gVar = f28939b;
                long jB = gVar.f28883a;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int iJ = n0.j(jB);
                int color = typedArrayObtainStyledAttributes.getColor(0, iJ);
                typedArrayObtainStyledAttributes.recycle();
                if (color != iJ) {
                    jB = n0.b(color);
                }
                long j10 = jB;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                typedArrayObtainStyledAttributes2.recycle();
                long jB2 = gVar.f28884b;
                int iJ2 = n0.j(jB2);
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iJ2)) : null;
                if (numValueOf != null && numValueOf.intValue() != iJ2) {
                    jB2 = n0.b(numValueOf.intValue());
                }
                long j11 = jB2;
                long jB3 = gVar.f28886d;
                int iJ3 = n0.j(jB3);
                Integer numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iJ3)) : null;
                if (numValueOf2 != null && numValueOf2.intValue() != iJ3) {
                    jB3 = n0.b(numValueOf2.intValue());
                }
                long j12 = jB3;
                g gVar2 = new g(j10, j11, j11, j12, j12);
                kVarP.C(gVar2);
                objG = gVar2;
            }
            d(o0Var, aVar, (g) objG, lVar, kVarP, (i11 & 1022) | ((i11 << 3) & 57344));
        } else {
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new u(o0Var, aVar, lVar, i10);
        }
    }

    public static final void d(o0 o0Var, eh.a aVar, g gVar, eh.l lVar, x0.j jVar, int i10) {
        int i11;
        eh.a aVar2;
        o0 o0Var2;
        x0.k kVarP = jVar.p(1447189339);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(o0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.K(d.a.f1143b) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.K(gVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.l(lVar) ? 16384 : 8192;
        }
        if (kVarP.A(i11 & 1, (i11 & 9363) != 9362)) {
            aVar2 = aVar;
            j3.k.a(o0Var, aVar2, f28938a, f1.c.b(795909757, new w(lVar, gVar), kVarP), kVarP, (i11 & 14) | 3456 | (i11 & 112), 0);
            o0Var2 = o0Var;
        } else {
            aVar2 = aVar;
            o0Var2 = o0Var;
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new x(o0Var2, aVar2, gVar, lVar, i10);
        }
    }
}
