package e9;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import b9.o2;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.BuildState;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.util.List;
import ph.v1;
import q1.b1;
import q1.y1;
import q8.t2;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;
import t0.z9;
import x0.a2;
import x0.j;
import x0.l1;
import x0.n1;
import x0.r3;
import x0.s3;
import z.b;
import z.f1;
import z.g1;
import z.k1;
import z.m1;

/* loaded from: classes.dex */
public final class n0 implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f8470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f8472c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f8473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s0 f8474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f8475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f8476g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r3<ProjectEntity> f8477h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r3<List<String>> f8478j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f8479k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p5.x f8480l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f8481m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n1 f8482n;

    public n0(f1 f1Var, String str, n1 n1Var, l1 l1Var, s0 s0Var, long j10, Context context, r3 r3Var, r3 r3Var2, n1 n1Var2, p5.x xVar, b0.m0 m0Var, n1 n1Var3) {
        this.f8470a = f1Var;
        this.f8471b = str;
        this.f8472c = n1Var;
        this.f8473d = l1Var;
        this.f8474e = s0Var;
        this.f8475f = j10;
        this.f8476g = context;
        this.f8477h = r3Var;
        this.f8478j = r3Var2;
        this.f8479k = n1Var2;
        this.f8480l = xVar;
        this.f8481m = m0Var;
        this.f8482n = n1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x09a5  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        y1.a aVar;
        FillElement fillElement;
        float f10;
        float f11;
        n1 n1Var;
        d.a aVar2;
        e0.a aVar3;
        g.a.C0128a c0128a;
        e0.a aVar4;
        g.a.c cVar;
        g.a.b bVar;
        f.b bVar2;
        g.a.C0128a c0128a2;
        int i10;
        g.a.d dVar;
        x0.j jVar2;
        e0.a aVar5;
        g.a.C0128a c0128a3;
        String strB;
        String str;
        Object obj;
        String str2;
        s0 s0Var;
        long j10;
        Context context;
        r3<ProjectEntity> r3Var;
        r3<List<String>> r3Var2;
        g.a.b bVar3;
        g.a.d dVar2;
        g.a.C0128a c0128a4;
        g.a.c cVar2;
        char c10;
        Object obj2;
        boolean z10;
        e0.a aVar6;
        g.a.C0128a c0128a5;
        Object obj3;
        p5.x xVar;
        boolean zL;
        Object objG;
        e0.a aVar7;
        g.a.C0128a c0128a6;
        Object obj4;
        boolean zL2;
        Object objG2;
        z.i BackgroundBox = iVar;
        x0.j jVar3 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(BackgroundBox, "$this$BackgroundBox");
        if ((iIntValue & 17) == 16 && jVar3.s()) {
            jVar3.v();
        } else {
            FillElement fillElement2 = androidx.compose.foundation.layout.g.f976c;
            float f12 = 20;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(d0.h.f(androidx.compose.foundation.layout.f.g(fillElement2, this.f8470a)), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar3, 48);
            int iD = jVar3.D();
            a2 a2VarY = jVar3.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar3);
            i2.g.f13861o.getClass();
            e0.a aVar8 = g.a.f13863b;
            if (jVar3.t() == null) {
                u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar8);
            } else {
                jVar3.z();
            }
            g.a.b bVar4 = g.a.f13867f;
            v1.j(bVar4, qVarA, jVar3);
            g.a.d dVar3 = g.a.f13866e;
            v1.j(dVar3, a2VarY, jVar3);
            g.a.C0128a c0128a7 = g.a.f13868g;
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar3, iD, c0128a7);
            }
            g.a.c cVar3 = g.a.f13865d;
            v1.j(cVar3, dVarC, jVar3);
            float f13 = 24;
            d.a aVar9 = d.a.f1143b;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar9, f13), jVar3);
            androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.b(aVar9, 180, CropImageView.DEFAULT_ASPECT_RATIO, 2), 82), h0.f.a(f13));
            long jC = c2.n0.c(4280623664L);
            y1.a aVar10 = y1.f21750a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD, jC, aVar10);
            float f14 = 22;
            androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.f.j(dVarB, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int iD2 = jVar3.D();
            a2 a2VarY2 = jVar3.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ2, jVar3);
            if (jVar3.t() == null) {
                u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar8);
            } else {
                jVar3.z();
            }
            v1.j(bVar4, l0VarD, jVar3);
            v1.j(dVar3, a2VarY2, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar3, iD2, c0128a7);
            }
            v1.j(cVar3, dVarC2, jVar3);
            n1 n1Var2 = this.f8472c;
            BuildState buildState = (BuildState) n1Var2.getValue();
            boolean z11 = buildState instanceof BuildState.Success;
            f.b bVar5 = d.a.f14612k;
            if (z11) {
                jVar3.L(1285482147);
                m1 m1VarA = k1.a(z.b.f34448e, bVar5, jVar3, 54);
                int iD3 = jVar3.D();
                a2 a2VarY3 = jVar3.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar9, jVar3);
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar8);
                } else {
                    jVar3.z();
                }
                v1.j(bVar4, m1VarA, jVar3);
                v1.j(dVar3, a2VarY3, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar3, iD3, c0128a7);
                }
                v1.j(cVar3, dVarC3, jVar3);
                f10 = f14;
                t4.b(p0.m1.a(), null, androidx.compose.foundation.layout.g.n(aVar9, 38), c2.n0.c(4285132974L), jVar3, 3504, 0);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar9, 16), jVar3);
                aVar4 = aVar8;
                f11 = f12;
                n1Var = n1Var2;
                aVar = aVar10;
                fillElement = fillElement2;
                ff.b("%100", null, c2.n0.c(4285132974L), 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(of.f26647a)).f26544g, jVar3, 196998, 0, 65498);
                jVar2 = jVar3;
                jVar2.H();
                jVar2.B();
                bVar2 = bVar5;
                bVar = bVar4;
                dVar = dVar3;
                c0128a2 = c0128a7;
                cVar = cVar3;
                aVar2 = aVar9;
                i10 = 14;
            } else {
                aVar = aVar10;
                fillElement = fillElement2;
                f10 = f14;
                f11 = f12;
                n1Var = n1Var2;
                boolean z12 = buildState instanceof BuildState.Error;
                l1 l1Var = this.f8473d;
                if (z12) {
                    jVar3.L(1286539092);
                    m1 m1VarA2 = k1.a(z.b.f34448e, bVar5, jVar3, 54);
                    int iD4 = jVar3.D();
                    a2 a2VarY4 = jVar3.y();
                    androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar9, jVar3);
                    if (jVar3.t() == null) {
                        u1.d();
                        throw null;
                    }
                    jVar3.r();
                    if (jVar3.m()) {
                        aVar5 = aVar8;
                        jVar3.w(aVar5);
                    } else {
                        aVar5 = aVar8;
                        jVar3.z();
                    }
                    v1.j(bVar4, m1VarA2, jVar3);
                    v1.j(dVar3, a2VarY4, jVar3);
                    if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD4))) {
                        c0128a3 = c0128a7;
                        l9.i.a(iD4, jVar3, iD4, c0128a3);
                    } else {
                        c0128a3 = c0128a7;
                    }
                    v1.j(cVar3, dVarC4, jVar3);
                    long jC2 = c2.n0.c(4294922834L);
                    s3 s3Var = of.f26647a;
                    aVar4 = aVar5;
                    aVar2 = aVar9;
                    ff.b("✕", null, jC2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(s3Var)).f26542e, jVar3, 390, 0, 65530);
                    p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, 14), jVar3);
                    ff.b(j2.y.a(l1Var.g(), "%"), null, c2.n0.c(4294922834L), 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(s3Var)).f26544g, jVar3, 196992, 0, 65498);
                    jVar2 = jVar3;
                    jVar2.H();
                    jVar2.B();
                    bVar2 = bVar5;
                    i10 = 14;
                    bVar = bVar4;
                    dVar = dVar3;
                    c0128a2 = c0128a3;
                    cVar = cVar3;
                } else {
                    aVar2 = aVar9;
                    jVar3.L(1287385206);
                    m1 m1VarA3 = k1.a(z.b.f34448e, bVar5, jVar3, 54);
                    int iD5 = jVar3.D();
                    a2 a2VarY5 = jVar3.y();
                    androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(aVar2, jVar3);
                    if (jVar3.t() == null) {
                        u1.d();
                        throw null;
                    }
                    jVar3.r();
                    if (jVar3.m()) {
                        aVar3 = aVar8;
                        jVar3.w(aVar3);
                    } else {
                        aVar3 = aVar8;
                        jVar3.z();
                    }
                    v1.j(bVar4, m1VarA3, jVar3);
                    v1.j(dVar3, a2VarY5, jVar3);
                    if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD5))) {
                        c0128a = c0128a7;
                        l9.i.a(iD5, jVar3, iD5, c0128a);
                    } else {
                        c0128a = c0128a7;
                    }
                    v1.j(cVar3, dVarC5, jVar3);
                    aVar4 = aVar3;
                    z9.a((float) 3.5d, 0, 438, 24, c2.n0.c(4278248908L), 0L, androidx.compose.foundation.layout.g.n(aVar2, 38), jVar3);
                    p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, 16), jVar3);
                    cVar = cVar3;
                    bVar = bVar4;
                    bVar2 = bVar5;
                    c0128a2 = c0128a;
                    i10 = 14;
                    dVar = dVar3;
                    ff.b(j2.y.a(l1Var.g(), "%"), null, b1.f21650d, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(of.f26647a)).f26544g, jVar3, 196992, 0, 65498);
                    jVar2 = jVar3;
                    jVar2.H();
                    jVar2.B();
                }
            }
            jVar2.H();
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, i10), jVar2);
            BuildState buildState2 = (BuildState) n1Var.getValue();
            jVar2.L(627178887);
            if (kotlin.jvm.internal.r.a(buildState2, BuildState.Idle.INSTANCE)) {
                strB = com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -974339976, R.string.build_status_ready, jVar2);
            } else if (kotlin.jvm.internal.r.a(buildState2, BuildState.Extracting.INSTANCE)) {
                strB = com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -974337507, R.string.build_status_extracting, jVar2);
            } else if (kotlin.jvm.internal.r.a(buildState2, BuildState.ModifyingManifest.INSTANCE)) {
                strB = com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -974334651, R.string.build_status_modifying_manifest, jVar2);
            } else if (kotlin.jvm.internal.r.a(buildState2, BuildState.InjectingAssets.INSTANCE)) {
                strB = com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -974331613, R.string.build_status_injecting_assets, jVar2);
            } else if (kotlin.jvm.internal.r.a(buildState2, BuildState.Repacking.INSTANCE)) {
                strB = com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -974328836, R.string.build_status_repacking, jVar2);
            } else if (kotlin.jvm.internal.r.a(buildState2, BuildState.Signing.INSTANCE)) {
                strB = com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -974326342, R.string.build_status_signing, jVar2);
            } else if (buildState2 instanceof BuildState.Success) {
                strB = com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -974323814, R.string.build_status_success, jVar2);
            } else {
                if (!(buildState2 instanceof BuildState.Error)) {
                    jVar2.L(-974340689);
                    jVar2.B();
                    throw new pg.l();
                }
                strB = com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -974321351, R.string.build_status_failed, jVar2);
            }
            String str3 = strB;
            jVar2.B();
            s3 s3Var2 = of.f26647a;
            t2.l0 l0Var = ((nf) jVar2.f(s3Var2)).f26545h;
            x2.p pVar = x2.p.f32033f;
            s3 s3Var3 = f2.f25858a;
            x0.j jVar4 = jVar2;
            ff.b(str3, null, ((e2) jVar2.f(s3Var3)).f25769o, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar4, 196608, 0, 65498);
            x0.j jVar5 = jVar4;
            jVar5.L(2080803109);
            boolean z13 = ((BuildState) n1Var.getValue()) instanceof BuildState.Error;
            Object obj5 = j.a.f31715a;
            final String str4 = this.f8471b;
            final s0 s0Var2 = this.f8474e;
            final long j11 = this.f8475f;
            final Context context2 = this.f8476g;
            final r3<ProjectEntity> r3Var3 = this.f8477h;
            final r3<List<String>> r3Var4 = this.f8478j;
            if (z13) {
                BuildState buildState3 = (BuildState) n1Var.getValue();
                kotlin.jvm.internal.r.c(buildState3, "null cannot be cast to non-null type com.basitce.htmltoapk.domain.model.BuildState.Error");
                final String message = ((BuildState.Error) buildState3).getMessage();
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 8), jVar5);
                str = "null cannot be cast to non-null type com.basitce.htmltoapk.domain.model.BuildState.Error";
                ff.b(message, null, ((e2) jVar5.f(s3Var3)).f25777w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar5.f(s3Var2)).f26548k, jVar5, 0, 0, 65530);
                jVar5 = jVar5;
                c10 = 16;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 16), jVar5);
                m1 m1VarA4 = k1.a(z.b.h(10), bVar2, jVar5, 54);
                int iD6 = jVar5.D();
                a2 a2VarY6 = jVar5.y();
                androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(aVar2, jVar5);
                if (jVar5.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar5.r();
                if (jVar5.m()) {
                    aVar7 = aVar4;
                    jVar5.w(aVar7);
                } else {
                    aVar7 = aVar4;
                    jVar5.z();
                }
                g.a.b bVar6 = bVar;
                v1.j(bVar6, m1VarA4, jVar5);
                g.a.d dVar4 = dVar;
                v1.j(dVar4, a2VarY6, jVar5);
                if (jVar5.m() || !kotlin.jvm.internal.r.a(jVar5.g(), Integer.valueOf(iD6))) {
                    c0128a6 = c0128a2;
                    l9.i.a(iD6, jVar5, iD6, c0128a6);
                } else {
                    c0128a6 = c0128a2;
                }
                g.a.c cVar4 = cVar;
                v1.j(cVar4, dVarC6, jVar5);
                jVar5.L(1149975271);
                boolean zL3 = jVar5.l(s0Var2) | jVar5.j(j11);
                Object objG3 = jVar5.g();
                if (zL3) {
                    obj4 = obj5;
                } else {
                    obj4 = obj5;
                    if (objG3 == obj4) {
                    }
                    eh.a aVar11 = (eh.a) objG3;
                    jVar5.B();
                    float f15 = 12;
                    h0.e eVarA = h0.f.a(f15);
                    g1 g1Var = t0.m0.f26400a;
                    j10 = j11;
                    aVar4 = aVar7;
                    s0Var = s0Var2;
                    cVar2 = cVar4;
                    obj = obj4;
                    c0128a4 = c0128a6;
                    dVar2 = dVar4;
                    bVar3 = bVar6;
                    t0.x0.a(aVar11, null, false, eVarA, t0.m0.a(c2.n0.c(4294947584L), 0L, 0L, jVar5, 14), null, null, null, z0.f8618b, jVar5, 805306368, 486);
                    jVar5.L(1150004701);
                    zL2 = jVar5.l(context2) | jVar5.K(r3Var3) | jVar5.K(str4) | jVar5.K(message) | jVar5.K(r3Var4);
                    objG2 = jVar5.g();
                    if (!zL2 || objG2 == obj) {
                        eh.a aVar12 = new eh.a() { // from class: e9.c0
                            @Override // eh.a
                            public final Object invoke() {
                                String packageName;
                                String name;
                                r3 r3Var5 = r3Var3;
                                ProjectEntity projectEntity = (ProjectEntity) r3Var5.getValue();
                                String str5 = (projectEntity == null || (name = projectEntity.getName()) == null) ? "" : name;
                                ProjectEntity projectEntity2 = (ProjectEntity) r3Var5.getValue();
                                q0.b(context2, str5, (projectEntity2 == null || (packageName = projectEntity2.getPackageName()) == null) ? "" : packageName, str4, message, (List) r3Var4.getValue());
                                return pg.f0.f21461a;
                            }
                        };
                        context = context2;
                        str2 = str4;
                        r3Var = r3Var3;
                        r3Var2 = r3Var4;
                        jVar5.C(aVar12);
                        objG2 = aVar12;
                    } else {
                        str2 = str4;
                        r3Var = r3Var3;
                        r3Var2 = r3Var4;
                        context = context2;
                    }
                    jVar5.B();
                    t0.x0.a((eh.a) objG2, null, false, h0.f.a(f15), t0.m0.a(c2.n0.c(4282606062L), 0L, 0L, jVar5, 14), null, null, null, z0.f8619c, jVar5, 805306368, 486);
                    jVar5.H();
                }
                objG3 = new eh.a() { // from class: e9.b0
                    @Override // eh.a
                    public final Object invoke() {
                        s0Var2.f(j11);
                        return pg.f0.f21461a;
                    }
                };
                jVar5.C(objG3);
                eh.a aVar112 = (eh.a) objG3;
                jVar5.B();
                float f152 = 12;
                h0.e eVarA2 = h0.f.a(f152);
                g1 g1Var2 = t0.m0.f26400a;
                j10 = j11;
                aVar4 = aVar7;
                s0Var = s0Var2;
                cVar2 = cVar4;
                obj = obj4;
                c0128a4 = c0128a6;
                dVar2 = dVar4;
                bVar3 = bVar6;
                t0.x0.a(aVar112, null, false, eVarA2, t0.m0.a(c2.n0.c(4294947584L), 0L, 0L, jVar5, 14), null, null, null, z0.f8618b, jVar5, 805306368, 486);
                jVar5.L(1150004701);
                zL2 = jVar5.l(context2) | jVar5.K(r3Var3) | jVar5.K(str4) | jVar5.K(message) | jVar5.K(r3Var4);
                objG2 = jVar5.g();
                if (zL2) {
                    eh.a aVar122 = new eh.a() { // from class: e9.c0
                        @Override // eh.a
                        public final Object invoke() {
                            String packageName;
                            String name;
                            r3 r3Var5 = r3Var3;
                            ProjectEntity projectEntity = (ProjectEntity) r3Var5.getValue();
                            String str5 = (projectEntity == null || (name = projectEntity.getName()) == null) ? "" : name;
                            ProjectEntity projectEntity2 = (ProjectEntity) r3Var5.getValue();
                            q0.b(context2, str5, (projectEntity2 == null || (packageName = projectEntity2.getPackageName()) == null) ? "" : packageName, str4, message, (List) r3Var4.getValue());
                            return pg.f0.f21461a;
                        }
                    };
                    context = context2;
                    str2 = str4;
                    r3Var = r3Var3;
                    r3Var2 = r3Var4;
                    jVar5.C(aVar122);
                    objG2 = aVar122;
                    jVar5.B();
                    t0.x0.a((eh.a) objG2, null, false, h0.f.a(f152), t0.m0.a(c2.n0.c(4282606062L), 0L, 0L, jVar5, 14), null, null, null, z0.f8619c, jVar5, 805306368, 486);
                    jVar5.H();
                }
            } else {
                str = "null cannot be cast to non-null type com.basitce.htmltoapk.domain.model.BuildState.Error";
                obj = obj5;
                str2 = str4;
                s0Var = s0Var2;
                j10 = j11;
                context = context2;
                r3Var = r3Var3;
                r3Var2 = r3Var4;
                bVar3 = bVar;
                dVar2 = dVar;
                c0128a4 = c0128a2;
                cVar2 = cVar;
                c10 = 16;
            }
            jVar5.B();
            jVar5.L(2080902327);
            n1<Boolean> n1Var3 = this.f8479k;
            if (n1Var3.getValue().booleanValue() && (((BuildState) n1Var.getValue()) instanceof BuildState.Error)) {
                BuildState buildState4 = (BuildState) n1Var.getValue();
                kotlin.jvm.internal.r.c(buildState4, str);
                String message2 = ((BuildState.Error) buildState4).getMessage();
                h0.e eVarA3 = h0.f.a(f11);
                long jC3 = c2.n0.c(4280162857L);
                long j12 = b1.f21650d;
                long jC4 = c2.n0.c(4291939035L);
                jVar5.L(2080900827);
                Object objG4 = jVar5.g();
                if (objG4 == obj) {
                    objG4 = new o2(n1Var3, 1);
                    jVar5.C(objG4);
                }
                jVar5.B();
                Context context3 = context;
                x0.j jVar6 = jVar5;
                obj2 = obj;
                z10 = true;
                t0.r.a((eh.a) objG4, f1.c.b(-1205733793, new i0(context3, r3Var, str2, message2, r3Var2, s0Var, j10, n1Var3), jVar5), null, null, null, z0.f8623g, f1.c.b(-1568947804, new j0(message2), jVar5), eVarA3, jC3, 0L, j12, jC4, CropImageView.DEFAULT_ASPECT_RATIO, null, jVar6, 102435894, 54, 12820);
                jVar5 = jVar6;
            } else {
                obj2 = obj;
                z10 = true;
            }
            jVar5.B();
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 18), jVar5);
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            androidx.compose.ui.d dVarH = dVarD2.h(new LayoutWeightElement(1.0f, z10));
            j1.f fVar = d.a.f14602a;
            g2.l0 l0VarD2 = z.g.d(fVar, false);
            int iD7 = jVar5.D();
            a2 a2VarY7 = jVar5.y();
            androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(dVarH, jVar5);
            if (jVar5.t() == null) {
                u1.d();
                throw null;
            }
            jVar5.r();
            if (jVar5.m()) {
                aVar6 = aVar4;
                jVar5.w(aVar6);
            } else {
                aVar6 = aVar4;
                jVar5.z();
            }
            g.a.b bVar7 = bVar3;
            v1.j(bVar7, l0VarD2, jVar5);
            g.a.d dVar5 = dVar2;
            v1.j(dVar5, a2VarY7, jVar5);
            if (jVar5.m() || !kotlin.jvm.internal.r.a(jVar5.g(), Integer.valueOf(iD7))) {
                c0128a5 = c0128a4;
                l9.i.a(iD7, jVar5, iD7, c0128a5);
            } else {
                c0128a5 = c0128a4;
            }
            g.a.c cVar5 = cVar2;
            v1.j(cVar5, dVarC7, jVar5);
            FillElement fillElement3 = fillElement;
            float f16 = 16;
            androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.f.l(fillElement3, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), h0.f.a(f16)), c2.n0.c(4278847504L), aVar), f16);
            g2.l0 l0VarD3 = z.g.d(fVar, false);
            int iD8 = jVar5.D();
            a2 a2VarY8 = jVar5.y();
            androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(dVarH2, jVar5);
            if (jVar5.t() == null) {
                u1.d();
                throw null;
            }
            jVar5.r();
            if (jVar5.m()) {
                jVar5.w(aVar6);
            } else {
                jVar5.z();
            }
            v1.j(bVar7, l0VarD3, jVar5);
            v1.j(dVar5, a2VarY8, jVar5);
            if (jVar5.m() || !kotlin.jvm.internal.r.a(jVar5.g(), Integer.valueOf(iD8))) {
                l9.i.a(iD8, jVar5, iD8, c0128a5);
            }
            v1.j(cVar5, dVarC8, jVar5);
            b.i iVarH = z.b.h(2);
            jVar5.L(-1592842273);
            final n1 n1Var4 = this.f8482n;
            boolean zK = jVar5.K(n1Var4);
            Object objG5 = jVar5.g();
            if (zK) {
                obj3 = obj2;
            } else {
                obj3 = obj2;
                if (objG5 == obj3) {
                }
                jVar5.B();
                Object obj6 = obj3;
                b0.d.a(fillElement3, this.f8481m, null, iVarH, null, null, false, null, (eh.l) objG5, jVar5, 24582, 492);
                jVar5.H();
                androidx.compose.ui.d dVarC9 = androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.b.f961a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 52), fVar), CropImageView.DEFAULT_ASPECT_RATIO, -25, 1);
                boolean z14 = ((BuildState) n1Var.getValue()) instanceof BuildState.Success;
                jVar5.L(1150378127);
                xVar = this.f8480l;
                zL = jVar5.l(xVar);
                objG = jVar5.g();
                if (!zL || objG == obj6) {
                    objG = new e0(xVar, 0);
                    jVar5.C(objG);
                }
                jVar5.B();
                t2.b(dVarC9, z14, (eh.a) objG, jVar5, 0, 12);
                jVar5.H();
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f16), jVar5);
                jVar5.H();
            }
            objG5 = new eh.l() { // from class: e9.d0
                @Override // eh.l
                public final Object invoke(Object obj7) {
                    b0.j0 LazyColumn = (b0.j0) obj7;
                    kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                    List list = (List) n1Var4.getValue();
                    LazyColumn.d(list.size(), null, new l0(k0.f8456a, list, 0), new f1.b(-632812321, true, new m0(list)));
                    return pg.f0.f21461a;
                }
            };
            jVar5.C(objG5);
            jVar5.B();
            Object obj62 = obj3;
            b0.d.a(fillElement3, this.f8481m, null, iVarH, null, null, false, null, (eh.l) objG5, jVar5, 24582, 492);
            jVar5.H();
            androidx.compose.ui.d dVarC92 = androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.b.f961a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 52), fVar), CropImageView.DEFAULT_ASPECT_RATIO, -25, 1);
            boolean z142 = ((BuildState) n1Var.getValue()) instanceof BuildState.Success;
            jVar5.L(1150378127);
            xVar = this.f8480l;
            zL = jVar5.l(xVar);
            objG = jVar5.g();
            if (!zL) {
                objG = new e0(xVar, 0);
                jVar5.C(objG);
                jVar5.B();
                t2.b(dVarC92, z142, (eh.a) objG, jVar5, 0, 12);
                jVar5.H();
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f16), jVar5);
                jVar5.H();
            }
        }
        return pg.f0.f21461a;
    }
}
