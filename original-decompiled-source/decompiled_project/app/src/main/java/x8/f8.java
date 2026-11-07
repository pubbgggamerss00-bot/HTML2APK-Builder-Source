package x8;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p0.m9;
import t0.ff;
import t0.md;
import t0.nf;
import t0.of;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class f8 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f32618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f32619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f32620c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SimpleDateFormat f32621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f32622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c.k<Intent, e.a> f32623f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<File> f32624g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<File> f32625h;

    public f8(boolean z10, boolean z11, File file, SimpleDateFormat simpleDateFormat, Context context, c.k<Intent, e.a> kVar, x0.n1<File> n1Var, x0.n1<File> n1Var2) {
        this.f32618a = z10;
        this.f32619b = z11;
        this.f32620c = file;
        this.f32621d = simpleDateFormat;
        this.f32622e = context;
        this.f32623f = kVar;
        this.f32624g = n1Var;
        this.f32625h = n1Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0297  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        long j10;
        long jC;
        g.a.d dVar;
        long j11;
        long jC2;
        g.a.c cVar;
        String upperCase;
        e0.a aVar;
        g.a.C0128a c0128a;
        Context context;
        float f10;
        File file;
        z.o1 o1Var;
        z.r OutlinedCard = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(OutlinedCard, "$this$OutlinedCard");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar2, 14);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar3);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, jVar2);
            g.a.d dVar2 = g.a.f13866e;
            ph.v1.j(dVar2, a2VarY, jVar2);
            g.a.C0128a c0128a2 = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a2);
            }
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, jVar2);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            b.j jVar3 = z.b.f34444a;
            f.b bVar2 = d.a.f14612k;
            z.m1 m1VarA = z.k1.a(jVar3, bVar2, jVar2, 48);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar2);
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar3);
            } else {
                jVar2.z();
            }
            ph.v1.j(bVar, m1VarA, jVar2);
            ph.v1.j(dVar2, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a2);
            }
            ph.v1.j(cVar2, dVarC2, jVar2);
            jVar2.L(-415380528);
            boolean z10 = this.f32618a;
            boolean z11 = this.f32619b;
            if (z10) {
                j10 = 4279592384L;
                jC = q1.b1.c(0.15f, c2.n0.c(4281236786L));
            } else {
                j10 = 4279592384L;
                jC = z11 ? q1.b1.c(0.15f, c2.n0.c(4279592384L)) : ((t0.e2) jVar2.f(t0.f2.f25858a)).f25762h;
            }
            jVar2.B();
            jVar2.L(-415368662);
            if (z10) {
                jC2 = c2.n0.c(4281236786L);
            } else if (z11) {
                jC2 = c2.n0.c(j10);
            } else {
                dVar = dVar2;
                j11 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25763i;
                jVar2.B();
                File file2 = this.f32620c;
                if (!z10) {
                    upperCase = "APK";
                } else if (z11) {
                    upperCase = "AAB";
                } else {
                    cVar = cVar2;
                    upperCase = ah.l.g(file2).toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.r.d(upperCase, "toUpperCase(...)");
                    float f11 = 8;
                    g.a.d dVar3 = dVar;
                    g.a.c cVar3 = cVar;
                    md.a(null, h0.f.a(f11), jC, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(2114203284, new a8(j11, upperCase, z10), jVar2), jVar2, 12582912, 121);
                    float f12 = 10;
                    p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f12), jVar2);
                    String name = file2.getName();
                    kotlin.jvm.internal.r.d(name, "getName(...)");
                    x0.s3 s3Var = of.f26647a;
                    t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26548k;
                    x2.p pVar = x2.p.f32033f;
                    x0.s3 s3Var2 = t0.f2.f25858a;
                    long j12 = ((t0.e2) jVar2.f(s3Var2)).f25771q;
                    z.o1 o1Var2 = z.o1.f34600a;
                    ff.b(name, o1Var2.a(aVar2, 1.0f), j12, 0L, pVar, null, 0L, null, 0L, 2, false, 1, 0, l0Var, jVar2, 196608, 3120, 55256);
                    p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f11), jVar2);
                    ff.b(k8.c(file2.length()), null, ((t0.e2) jVar2.f(s3Var2)).f25751a, 0L, x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26551n, jVar2, 196608, 0, 65498);
                    jVar2.H();
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f11), jVar2);
                    z.m1 m1VarA2 = z.k1.a(jVar3, bVar2, jVar2, 48);
                    int iD3 = jVar2.D();
                    x0.a2 a2VarY3 = jVar2.y();
                    androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar2, jVar2);
                    if (jVar2.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        aVar = aVar3;
                        jVar2.w(aVar);
                    } else {
                        aVar = aVar3;
                        jVar2.z();
                    }
                    ph.v1.j(bVar, m1VarA2, jVar2);
                    ph.v1.j(dVar3, a2VarY3, jVar2);
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                        c0128a = c0128a2;
                        l9.i.a(iD3, jVar2, iD3, c0128a);
                    } else {
                        c0128a = c0128a2;
                    }
                    ph.v1.j(cVar3, dVarC3, jVar2);
                    t0.t4.b(m9.a(), null, androidx.compose.foundation.layout.g.n(aVar2, 13), q1.b1.c(0.7f, ((t0.e2) jVar2.f(s3Var2)).f25773s), jVar2, 432, 0);
                    p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, 4), jVar2);
                    String str = this.f32621d.format(new Date(file2.lastModified()));
                    kotlin.jvm.internal.r.d(str, "format(...)");
                    e0.a aVar4 = aVar;
                    g.a.C0128a c0128a3 = c0128a;
                    ff.b(str, null, ((t0.e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26552o, jVar2, 0, 0, 65530);
                    x0.j jVar4 = jVar2;
                    jVar4.H();
                    float f13 = 12;
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f13), jVar4);
                    b.i iVarH = z.b.h(f11);
                    androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                    z.m1 m1VarA3 = z.k1.a(iVarH, bVar2, jVar4, 54);
                    int iD4 = jVar4.D();
                    x0.a2 a2VarY4 = jVar4.y();
                    androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarD2, jVar4);
                    if (jVar4.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar4.r();
                    if (jVar4.m()) {
                        jVar4.w(aVar4);
                    } else {
                        jVar4.z();
                    }
                    ph.v1.j(bVar, m1VarA3, jVar4);
                    ph.v1.j(dVar3, a2VarY4, jVar4);
                    if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD4))) {
                        l9.i.a(iD4, jVar4, iD4, c0128a3);
                    }
                    ph.v1.j(cVar3, dVarC4, jVar4);
                    jVar4.L(-415207353);
                    Object obj = j.a.f31715a;
                    Context context2 = this.f32622e;
                    if (z10) {
                        jVar4.L(-415204627);
                        boolean zL = jVar4.l(context2) | jVar4.l(file2);
                        c.k<Intent, e.a> kVar = this.f32623f;
                        boolean zL2 = zL | jVar4.l(kVar);
                        Object objG = jVar4.g();
                        if (zL2 || objG == obj) {
                            objG = new b8(context2, file2, kVar, this.f32624g);
                            jVar4.C(objG);
                        }
                        jVar4.B();
                        float f14 = 6;
                        f10 = f13;
                        o1Var = o1Var2;
                        context = context2;
                        file = file2;
                        t0.x0.b((eh.a) objG, o1Var2.a(aVar2, 1.0f), false, h0.f.a(f12), null, null, new z.g1(f13, f14, f13, f14), d.f32462f, jVar4, 817889280, 372);
                        jVar4 = jVar4;
                    } else {
                        context = context2;
                        f10 = f13;
                        file = file2;
                        o1Var = o1Var2;
                    }
                    jVar4.B();
                    jVar4.L(-415136116);
                    boolean zL3 = jVar4.l(context) | jVar4.l(file);
                    Object objG2 = jVar4.g();
                    if (zL3 || objG2 == obj) {
                        objG2 = new c8(context, file);
                        jVar4.C(objG2);
                    }
                    eh.a aVar5 = (eh.a) objG2;
                    jVar4.B();
                    float f15 = 6;
                    float f16 = f10;
                    x0.j jVar5 = jVar4;
                    t0.x0.c(aVar5, !z10 ? o1Var.a(aVar2, 1.0f) : aVar2, false, h0.f.a(f12), null, null, new z.g1(f16, f15, f16, f15), d.f32463g, jVar5, 817889280, 372);
                    jVar5.L(-415097141);
                    boolean zL4 = jVar5.l(context) | jVar5.l(file);
                    Object objG3 = jVar5.g();
                    if (zL4 || objG3 == obj) {
                        objG3 = new d8(context, file);
                        jVar5.C(objG3);
                    }
                    jVar5.B();
                    float f17 = 36;
                    t0.s4.c((eh.a) objG3, androidx.compose.foundation.layout.g.n(aVar2, f17), false, null, d.f32464h, jVar5, 196656, 28);
                    jVar5.L(-415074064);
                    boolean zL5 = jVar5.l(file);
                    Object objG4 = jVar5.g();
                    if (zL5 || objG4 == obj) {
                        objG4 = new e8(file, this.f32625h);
                        jVar5.C(objG4);
                    }
                    jVar5.B();
                    t0.s4.c((eh.a) objG4, androidx.compose.foundation.layout.g.n(aVar2, f17), false, null, d.f32465i, jVar5, 196656, 28);
                    jVar5.H();
                    jVar5.H();
                }
                cVar = cVar2;
                float f112 = 8;
                g.a.d dVar32 = dVar;
                g.a.c cVar32 = cVar;
                md.a(null, h0.f.a(f112), jC, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(2114203284, new a8(j11, upperCase, z10), jVar2), jVar2, 12582912, 121);
                float f122 = 10;
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f122), jVar2);
                String name2 = file2.getName();
                kotlin.jvm.internal.r.d(name2, "getName(...)");
                x0.s3 s3Var3 = of.f26647a;
                t2.l0 l0Var2 = ((nf) jVar2.f(s3Var3)).f26548k;
                x2.p pVar2 = x2.p.f32033f;
                x0.s3 s3Var22 = t0.f2.f25858a;
                long j122 = ((t0.e2) jVar2.f(s3Var22)).f25771q;
                z.o1 o1Var22 = z.o1.f34600a;
                ff.b(name2, o1Var22.a(aVar2, 1.0f), j122, 0L, pVar2, null, 0L, null, 0L, 2, false, 1, 0, l0Var2, jVar2, 196608, 3120, 55256);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f112), jVar2);
                ff.b(k8.c(file2.length()), null, ((t0.e2) jVar2.f(s3Var22)).f25751a, 0L, x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var3)).f26551n, jVar2, 196608, 0, 65498);
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f112), jVar2);
                z.m1 m1VarA22 = z.k1.a(jVar3, bVar2, jVar2, 48);
                int iD32 = jVar2.D();
                x0.a2 a2VarY32 = jVar2.y();
                androidx.compose.ui.d dVarC32 = androidx.compose.ui.c.c(aVar2, jVar2);
                if (jVar2.t() == null) {
                }
            }
            dVar = dVar2;
            j11 = jC2;
            jVar2.B();
            File file22 = this.f32620c;
            if (!z10) {
            }
            cVar = cVar2;
            float f1122 = 8;
            g.a.d dVar322 = dVar;
            g.a.c cVar322 = cVar;
            md.a(null, h0.f.a(f1122), jC, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(2114203284, new a8(j11, upperCase, z10), jVar2), jVar2, 12582912, 121);
            float f1222 = 10;
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f1222), jVar2);
            String name22 = file22.getName();
            kotlin.jvm.internal.r.d(name22, "getName(...)");
            x0.s3 s3Var32 = of.f26647a;
            t2.l0 l0Var22 = ((nf) jVar2.f(s3Var32)).f26548k;
            x2.p pVar22 = x2.p.f32033f;
            x0.s3 s3Var222 = t0.f2.f25858a;
            long j1222 = ((t0.e2) jVar2.f(s3Var222)).f25771q;
            z.o1 o1Var222 = z.o1.f34600a;
            ff.b(name22, o1Var222.a(aVar2, 1.0f), j1222, 0L, pVar22, null, 0L, null, 0L, 2, false, 1, 0, l0Var22, jVar2, 196608, 3120, 55256);
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f1122), jVar2);
            ff.b(k8.c(file22.length()), null, ((t0.e2) jVar2.f(s3Var222)).f25751a, 0L, x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var32)).f26551n, jVar2, 196608, 0, 65498);
            jVar2.H();
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f1122), jVar2);
            z.m1 m1VarA222 = z.k1.a(jVar3, bVar2, jVar2, 48);
            int iD322 = jVar2.D();
            x0.a2 a2VarY322 = jVar2.y();
            androidx.compose.ui.d dVarC322 = androidx.compose.ui.c.c(aVar2, jVar2);
            if (jVar2.t() == null) {
            }
        }
        return pg.f0.f21461a;
    }
}
