package e9;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.ui.d;
import androidx.core.content.FileProvider;
import b9.t1;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.IconGenerator;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.yalantis.ucrop.view.CropImageView;
import g2.j;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.io.File;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import ph.v1;
import q1.b1;
import q1.y1;
import q8.t2;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.t4;
import x0.a2;
import x0.j;
import x0.n1;
import x0.r3;
import z.b;
import z.f1;
import z.g1;

/* loaded from: classes.dex */
public final class p implements eh.q<f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8497c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f8499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ File f8500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f8501g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f8502h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f8503j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p5.x f8504k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r3<ProjectEntity> f8505l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f8506m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c.k<Intent, e.a> f8507n;

    public p(String str, boolean z10, boolean z11, boolean z12, Uri uri, File file, Context context, String str2, String str3, p5.x xVar, n1 n1Var, String str4, c.k kVar) {
        this.f8495a = str;
        this.f8496b = z10;
        this.f8497c = z11;
        this.f8498d = z12;
        this.f8499e = uri;
        this.f8500f = file;
        this.f8501g = context;
        this.f8502h = str2;
        this.f8503j = str3;
        this.f8504k = xVar;
        this.f8505l = n1Var;
        this.f8506m = str4;
        this.f8507n = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0220  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 b(f1 f1Var, x0.j jVar, Integer num) {
        String iconPath;
        String strSubstring;
        boolean zK;
        Object objG;
        Object obj;
        boolean zK2;
        Object objG2;
        long jC;
        Object obj2;
        ProjectEntity value;
        String str;
        String str2;
        float f10;
        long j10;
        int i10;
        y1.a aVar;
        String str3;
        e0.a aVar2;
        float f11;
        float f12;
        String str4;
        g.a.d dVar;
        g.a.c cVar;
        g.a.b bVar;
        j1.f fVar;
        g.a.C0128a c0128a;
        f.a aVar3;
        Object obj3;
        x0.j jVar2;
        e0.a aVar4;
        g.a.C0128a c0128a2;
        e0.a aVar5;
        p pVar;
        String str5;
        g.a.d dVar2;
        g.a.b bVar2;
        g.a.C0128a c0128a3;
        g.a.c cVar2;
        boolean z10;
        Uri uri;
        File file;
        Context context;
        p5.x xVar;
        x0.j jVar3;
        j1.f fVar2;
        boolean z11;
        String str6;
        e0.a aVar6;
        Object obj4;
        androidx.compose.foundation.layout.b bVar3;
        g.a.b bVar4;
        g.a.d dVar3;
        g.a.C0128a c0128a4;
        g.a.c cVar3;
        boolean z12;
        float f13;
        boolean z13;
        boolean z14;
        Object obj5;
        final Uri uri2;
        d.a aVar7;
        p5.x xVar2;
        final File file2;
        final Context context2;
        x0.j jVar4;
        p5.x xVar3;
        j1.f fVar3;
        g.a.C0128a c0128a5;
        Object obj6;
        Object obj7;
        boolean z15;
        g.a.C0128a c0128a6;
        f1 padding = f1Var;
        x0.j jVar5 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(padding, "padding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar5.K(padding) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar5.s()) {
            jVar5.v();
        } else {
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(d0.h.f(androidx.compose.foundation.layout.f.g(androidx.compose.foundation.layout.g.f976c, padding)), 24, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j1.f fVar4 = d.a.f14606e;
            g2.l0 l0VarD = z.g.d(fVar4, false);
            int iD = jVar5.D();
            a2 a2VarY = jVar5.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar5);
            i2.g.f13861o.getClass();
            e0.a aVar8 = g.a.f13863b;
            if (jVar5.t() == null) {
                u1.d();
                throw null;
            }
            jVar5.r();
            if (jVar5.m()) {
                jVar5.w(aVar8);
            } else {
                jVar5.z();
            }
            g.a.b bVar5 = g.a.f13867f;
            v1.j(bVar5, l0VarD, jVar5);
            g.a.d dVar4 = g.a.f13866e;
            v1.j(dVar4, a2VarY, jVar5);
            g.a.C0128a c0128a7 = g.a.f13868g;
            if (jVar5.m() || !kotlin.jvm.internal.r.a(jVar5.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar5, iD, c0128a7);
            }
            g.a.c cVar4 = g.a.f13865d;
            v1.j(cVar4, dVarC, jVar5);
            d.a aVar9 = d.a.f1143b;
            float f14 = 16;
            androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.f.j(ph.m0.e(androidx.compose.foundation.layout.g.d(aVar9, 1.0f), ph.m0.c(jVar5), true), CropImageView.DEFAULT_ASPECT_RATIO, f14, 1);
            float f15 = 20;
            b.i iVarH = z.b.h(f15);
            f.a aVar10 = d.a.f14615n;
            z.q qVarA = z.o.a(iVarH, aVar10, jVar5, 54);
            int iD2 = jVar5.D();
            a2 a2VarY2 = jVar5.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ2, jVar5);
            if (jVar5.t() == null) {
                u1.d();
                throw null;
            }
            jVar5.r();
            if (jVar5.m()) {
                jVar5.w(aVar8);
            } else {
                jVar5.z();
            }
            v1.j(bVar5, qVarA, jVar5);
            v1.j(dVar4, a2VarY2, jVar5);
            if (jVar5.m() || !kotlin.jvm.internal.r.a(jVar5.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar5, iD2, c0128a7);
            }
            v1.j(cVar4, dVarC2, jVar5);
            r3<ProjectEntity> r3Var = this.f8505l;
            ProjectEntity value2 = r3Var.getValue();
            if (value2 == null || (iconPath = value2.getIconPath()) == null || mh.x.A(iconPath) || !new File(iconPath).exists()) {
                iconPath = null;
            }
            ProjectEntity value3 = r3Var.getValue();
            String str7 = this.f8495a;
            if (value3 == null || (strSubstring = value3.getAppName()) == null) {
                ProjectEntity value4 = r3Var.getValue();
                if (value4 == null || (strSubstring = value4.getName()) == null || mh.x.A(strSubstring)) {
                    strSubstring = null;
                }
                if (strSubstring == null) {
                    int iB = mh.x.B(6, str7, ".");
                    if (iB == -1) {
                        strSubstring = str7;
                    } else {
                        strSubstring = str7.substring(0, iB);
                        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                    }
                }
                jVar5.L(-417723616);
                zK = jVar5.K(strSubstring);
                objG = jVar5.g();
                obj = j.a.f31715a;
                if (!zK || objG == obj) {
                    objG = IconGenerator.INSTANCE.extractDisplayGlyph(strSubstring);
                    jVar5.C(objG);
                }
                String str8 = (String) objG;
                jVar5.B();
                ProjectEntity value5 = r3Var.getValue();
                String primaryColor = value5 == null ? value5.getPrimaryColor() : null;
                jVar5.L(-417718847);
                zK2 = jVar5.K(primaryColor);
                objG2 = jVar5.g();
                if (!zK2 || objG2 == obj) {
                    try {
                        value = r3Var.getValue();
                        if (value != null || (primaryColor = value.getPrimaryColor()) == null) {
                            String primaryColor2 = "#2196F3";
                        }
                        jC = c2.n0.b(Color.parseColor(primaryColor2));
                    } catch (Exception unused) {
                        jC = c2.n0.c(4280391411L);
                    }
                    obj2 = obj;
                    objG2 = new b1(jC);
                    jVar5.C(objG2);
                } else {
                    obj2 = obj;
                }
                long j11 = ((b1) objG2).f21656a;
                jVar5.B();
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar9, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET);
                g2.l0 l0VarD2 = z.g.d(fVar4, false);
                int iD3 = jVar5.D();
                a2 a2VarY3 = jVar5.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarN, jVar5);
                i2.g.f13861o.getClass();
                e0.a aVar11 = g.a.f13863b;
                if (jVar5.t() != null) {
                    u1.d();
                    throw null;
                }
                jVar5.r();
                if (jVar5.m()) {
                    jVar5.w(aVar11);
                } else {
                    jVar5.z();
                }
                g.a.b bVar6 = g.a.f13867f;
                v1.j(bVar6, l0VarD2, jVar5);
                g.a.d dVar5 = g.a.f13866e;
                v1.j(dVar5, a2VarY3, jVar5);
                g.a.C0128a c0128a8 = g.a.f13868g;
                if (jVar5.m()) {
                    str = iconPath;
                } else {
                    str = iconPath;
                    if (!kotlin.jvm.internal.r.a(jVar5.g(), Integer.valueOf(iD3))) {
                    }
                    g.a.c cVar5 = g.a.f13865d;
                    v1.j(cVar5, dVarC3, jVar5);
                    float f16 = 26;
                    androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.n(aVar9, HeaderItem.DATA_START_OFFSET), h0.f.a(f16));
                    jVar5.L(15761480);
                    if (str == null) {
                        str2 = strSubstring;
                        f10 = f16;
                        j10 = ((e2) jVar5.f(f2.f25858a)).G;
                    } else {
                        str2 = strSubstring;
                        f10 = f16;
                        j10 = j11;
                    }
                    jVar5.B();
                    y1.a aVar12 = y1.f21750a;
                    androidx.compose.ui.d dVarA = t.o.a(androidx.compose.foundation.a.b(dVarD, j10, aVar12), 1, b1.c(0.5f, b3.l.a(jVar5).B), h0.f.a(f10));
                    g2.l0 l0VarD3 = z.g.d(fVar4, false);
                    int iD4 = jVar5.D();
                    a2 a2VarY4 = jVar5.y();
                    androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarA, jVar5);
                    if (jVar5.t() != null) {
                        u1.d();
                        throw null;
                    }
                    jVar5.r();
                    if (jVar5.m()) {
                        jVar5.w(aVar11);
                    } else {
                        jVar5.z();
                    }
                    v1.j(bVar6, l0VarD3, jVar5);
                    v1.j(dVar5, a2VarY4, jVar5);
                    if (jVar5.m() || !kotlin.jvm.internal.r.a(jVar5.g(), Integer.valueOf(iD4))) {
                        l9.i.a(iD4, jVar5, iD4, c0128a8);
                    }
                    v1.j(cVar5, dVarC4, jVar5);
                    if (str != null) {
                        jVar5.L(-1000738515);
                        i10 = 48;
                        aVar = aVar12;
                        String str9 = str2;
                        h7.r.a(str, str9, e1.d.d(androidx.compose.foundation.layout.g.f976c, h0.f.a(f10)), j.a.f11397a, jVar5, 1572864);
                        str3 = str9;
                        jVar5.B();
                        cVar = cVar5;
                        aVar2 = aVar11;
                        fVar = fVar4;
                        bVar = bVar6;
                        dVar = dVar5;
                        aVar3 = aVar10;
                        c0128a = c0128a8;
                        f11 = f15;
                        f12 = f14;
                        str4 = str7;
                        obj3 = obj2;
                        jVar2 = jVar5;
                    } else {
                        i10 = 48;
                        aVar = aVar12;
                        str3 = str2;
                        jVar5.L(-1000287682);
                        aVar2 = aVar11;
                        f11 = f15;
                        f12 = f14;
                        str4 = str7;
                        dVar = dVar5;
                        cVar = cVar5;
                        bVar = bVar6;
                        fVar = fVar4;
                        c0128a = c0128a8;
                        aVar3 = aVar10;
                        obj3 = obj2;
                        ff.b(str8, null, b1.f21650d, f3.u.c(48), x2.p.f32033f, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, null, jVar5, 200064, 0, 130514);
                        jVar2 = jVar5;
                        jVar2.B();
                    }
                    jVar2.H();
                    j1.f fVar5 = d.a.f14610i;
                    androidx.compose.foundation.layout.b bVar7 = androidx.compose.foundation.layout.b.f961a;
                    androidx.compose.ui.d dVarN2 = androidx.compose.foundation.layout.g.n(bVar7.b(aVar9, fVar5), 34);
                    h0.e eVar = h0.f.f12083a;
                    androidx.compose.ui.d dVarA2 = t.o.a(androidx.compose.foundation.a.b(e1.d.d(dVarN2, eVar), c2.n0.c(4280468830L), aVar), (float) 2.5d, b3.l.a(jVar2).f25770p, eVar);
                    g2.l0 l0VarD4 = z.g.d(fVar, false);
                    int iD5 = jVar2.D();
                    a2 a2VarY5 = jVar2.y();
                    androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarA2, jVar2);
                    if (jVar2.t() == null) {
                        u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        aVar4 = aVar2;
                        jVar2.w(aVar4);
                    } else {
                        aVar4 = aVar2;
                        jVar2.z();
                    }
                    g.a.b bVar8 = bVar;
                    v1.j(bVar8, l0VarD4, jVar2);
                    g.a.d dVar6 = dVar;
                    v1.j(dVar6, a2VarY5, jVar2);
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD5))) {
                        c0128a2 = c0128a;
                        l9.i.a(iD5, jVar2, iD5, c0128a2);
                    } else {
                        c0128a2 = c0128a;
                    }
                    g.a.c cVar6 = cVar;
                    v1.j(cVar6, dVarC5, jVar2);
                    x0.j jVar6 = jVar2;
                    t4.b(p0.n1.a(), null, androidx.compose.foundation.layout.g.n(aVar9, f11), b1.f21650d, jVar6, 3504, 0);
                    jVar6.H();
                    jVar6.H();
                    e0.a aVar13 = aVar4;
                    g.a.C0128a c0128a9 = c0128a2;
                    ff.b(str3, null, b3.l.a(jVar6).f25769o, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar6).f26543f, jVar6, 196608, 0, 65498);
                    ff.b(f3.q.c(R.string.build_success, jVar6), null, b3.l.a(jVar6).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar6).f26547j, jVar6, 0, 0, 65530);
                    x0.j jVar7 = jVar6;
                    jVar7.L(-417602380);
                    boolean z16 = this.f8496b;
                    String str10 = this.f8503j;
                    if (z16) {
                        z.q qVarA2 = z.o.a(z.b.f34446c, aVar3, jVar7, i10);
                        int iD6 = jVar7.D();
                        a2 a2VarY6 = jVar7.y();
                        androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(aVar9, jVar7);
                        if (jVar7.t() == null) {
                            u1.d();
                            throw null;
                        }
                        jVar7.r();
                        if (jVar7.m()) {
                            jVar7.w(aVar13);
                        } else {
                            jVar7.z();
                        }
                        v1.j(bVar8, qVarA2, jVar7);
                        v1.j(dVar6, a2VarY6, jVar7);
                        if (jVar7.m() || !kotlin.jvm.internal.r.a(jVar7.g(), Integer.valueOf(iD6))) {
                            c0128a6 = c0128a9;
                            l9.i.a(iD6, jVar7, iD6, c0128a6);
                        } else {
                            c0128a6 = c0128a9;
                        }
                        v1.j(cVar6, dVarC6, jVar7);
                        aVar5 = aVar13;
                        pVar = this;
                        dVar2 = dVar6;
                        cVar2 = cVar6;
                        bVar2 = bVar8;
                        c0128a3 = c0128a6;
                        ff.b(str4, null, b3.l.a(jVar7).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar7).f26549l, jVar7, 0, 0, 65530);
                        ff.b(pVar.f8506m, null, b3.l.a(jVar7).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar7).f26552o, jVar7, 0, 0, 65530);
                        ff.b(str10, null, b3.l.a(jVar7).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar7).f26552o, jVar7, 0, 0, 65530);
                        str5 = str10;
                        jVar7 = jVar7;
                        jVar7.H();
                    } else {
                        aVar5 = aVar13;
                        pVar = this;
                        str5 = str10;
                        dVar2 = dVar6;
                        bVar2 = bVar8;
                        c0128a3 = c0128a9;
                        cVar2 = cVar6;
                    }
                    jVar7.B();
                    boolean z17 = pVar.f8497c;
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar9, z17 ? 28 : f12), jVar7);
                    jVar7.L(-417567415);
                    j1.f fVar6 = d.a.f14602a;
                    boolean z18 = pVar.f8498d;
                    final Uri uri3 = pVar.f8499e;
                    final File file3 = pVar.f8500f;
                    final Context context3 = pVar.f8501g;
                    p5.x xVar4 = pVar.f8504k;
                    if (z18) {
                        z10 = z18;
                        uri = uri3;
                        file = file3;
                        context = context3;
                        xVar = xVar4;
                        jVar3 = jVar7;
                        fVar2 = fVar6;
                        z11 = z17;
                        str6 = str5;
                        aVar6 = aVar5;
                        obj4 = obj3;
                        bVar3 = bVar7;
                        bVar4 = bVar2;
                        dVar3 = dVar2;
                        c0128a4 = c0128a3;
                        cVar3 = cVar2;
                        z12 = true;
                        f13 = 1.0f;
                        z13 = false;
                        z14 = false;
                    } else {
                        androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar9, 1.0f);
                        g2.l0 l0VarD5 = z.g.d(fVar6, false);
                        int iD7 = jVar7.D();
                        a2 a2VarY7 = jVar7.y();
                        androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(dVarD2, jVar7);
                        if (jVar7.t() == null) {
                            u1.d();
                            throw null;
                        }
                        jVar7.r();
                        if (jVar7.m()) {
                            fVar3 = fVar6;
                            jVar7.w(aVar5);
                        } else {
                            fVar3 = fVar6;
                            jVar7.z();
                        }
                        g.a.b bVar9 = bVar2;
                        v1.j(bVar9, l0VarD5, jVar7);
                        g.a.d dVar7 = dVar2;
                        v1.j(dVar7, a2VarY7, jVar7);
                        if (jVar7.m() || !kotlin.jvm.internal.r.a(jVar7.g(), Integer.valueOf(iD7))) {
                            c0128a5 = c0128a3;
                            l9.i.a(iD7, jVar7, iD7, c0128a5);
                        } else {
                            c0128a5 = c0128a3;
                        }
                        g.a.c cVar7 = cVar2;
                        v1.j(cVar7, dVarC7, jVar7);
                        jVar7.L(15891867);
                        boolean zL = jVar7.l(uri3) | jVar7.l(file3) | jVar7.l(context3);
                        final c.k<Intent, e.a> kVar = pVar.f8507n;
                        boolean zL2 = zL | jVar7.l(kVar);
                        Object objG3 = jVar7.g();
                        if (zL2) {
                            obj6 = obj3;
                        } else {
                            obj6 = obj3;
                            if (objG3 == obj6) {
                            }
                            jVar7.B();
                            z10 = z18;
                            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar9, 1.0f), 52);
                            h0.e eVarA = h0.f.a(14);
                            g1 g1Var = t0.m0.f26400a;
                            Object obj8 = obj6;
                            context = context3;
                            uri = uri3;
                            file = file3;
                            cVar3 = cVar7;
                            bVar4 = bVar9;
                            x0.j jVar8 = jVar7;
                            dVar3 = dVar7;
                            z11 = z17;
                            str6 = str5;
                            j1.f fVar7 = fVar3;
                            aVar6 = aVar5;
                            c0128a4 = c0128a5;
                            t0.x0.a((eh.a) objG3, dVarF, false, eVarA, t0.m0.a(b3.l.a(jVar7).f25751a, 0L, 0L, jVar7, 14), null, null, null, y0.f8604c, jVar8, 805306416, 484);
                            jVar8.L(15950114);
                            if (z11) {
                                jVar3 = jVar8;
                                bVar3 = bVar7;
                                obj4 = obj8;
                                xVar = xVar4;
                                fVar2 = fVar7;
                                z12 = true;
                                f13 = 1.0f;
                                z13 = false;
                                z14 = false;
                            } else {
                                f13 = 1.0f;
                                bVar3 = bVar7;
                                fVar2 = fVar7;
                                z12 = true;
                                z13 = false;
                                androidx.compose.ui.d dVarC8 = androidx.compose.foundation.layout.e.c(bVar3.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar9, 1.0f), 46), fVar2), CropImageView.DEFAULT_ASPECT_RATIO, -38, 1);
                                jVar8.L(15962179);
                                boolean zL3 = jVar8.l(xVar4);
                                Object objG4 = jVar8.g();
                                if (zL3) {
                                    obj7 = obj8;
                                } else {
                                    obj7 = obj8;
                                    if (objG4 != obj7) {
                                        z15 = false;
                                    }
                                    eh.a aVar14 = (eh.a) objG4;
                                    jVar8.B();
                                    obj4 = obj7;
                                    jVar3 = jVar8;
                                    z14 = z15;
                                    xVar = xVar4;
                                    t2.b(dVarC8, false, aVar14, jVar3, 0, 14);
                                }
                                z15 = false;
                                objG4 = new i(xVar4, 0);
                                jVar8.C(objG4);
                                eh.a aVar142 = (eh.a) objG4;
                                jVar8.B();
                                obj4 = obj7;
                                jVar3 = jVar8;
                                z14 = z15;
                                xVar = xVar4;
                                t2.b(dVarC8, false, aVar142, jVar3, 0, 14);
                            }
                            jVar3.B();
                            jVar3.H();
                        }
                        objG3 = new eh.a() { // from class: e9.h
                            @Override // eh.a
                            public final Object invoke() {
                                Uri uri4 = uri3;
                                File file4 = file3;
                                Context context4 = context3;
                                Uri uriB = q.b(context4, uri4, file4);
                                if (uriB == null) {
                                    org.bouncycastle.crypto.engines.a.b(context4, R.string.output_file_not_found, context4, 1);
                                } else if (context4.getPackageManager().canRequestPackageInstalls()) {
                                    q.c(context4, uriB);
                                } else {
                                    hf.a.a(kVar, context4, new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context4.getPackageName())), R.string.launch_no_app);
                                }
                                return pg.f0.f21461a;
                            }
                        };
                        jVar7.C(objG3);
                        jVar7.B();
                        z10 = z18;
                        androidx.compose.ui.d dVarF2 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar9, 1.0f), 52);
                        h0.e eVarA2 = h0.f.a(14);
                        g1 g1Var2 = t0.m0.f26400a;
                        Object obj82 = obj6;
                        context = context3;
                        uri = uri3;
                        file = file3;
                        cVar3 = cVar7;
                        bVar4 = bVar9;
                        x0.j jVar82 = jVar7;
                        dVar3 = dVar7;
                        z11 = z17;
                        str6 = str5;
                        j1.f fVar72 = fVar3;
                        aVar6 = aVar5;
                        c0128a4 = c0128a5;
                        t0.x0.a((eh.a) objG3, dVarF2, false, eVarA2, t0.m0.a(b3.l.a(jVar7).f25751a, 0L, 0L, jVar7, 14), null, null, null, y0.f8604c, jVar82, 805306416, 484);
                        jVar82.L(15950114);
                        if (z11) {
                        }
                        jVar3.B();
                        jVar3.H();
                    }
                    jVar3.B();
                    final String str11 = pVar.f8502h;
                    if (z10) {
                        jVar3.L(-57118912);
                        androidx.compose.ui.d dVarD3 = androidx.compose.foundation.layout.g.d(aVar9, f13);
                        g2.l0 l0VarD6 = z.g.d(fVar2, z14);
                        int iD8 = jVar3.D();
                        a2 a2VarY8 = jVar3.y();
                        androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(dVarD3, jVar3);
                        if (jVar3.t() == null) {
                            u1.d();
                            throw null;
                        }
                        jVar3.r();
                        if (jVar3.m()) {
                            jVar3.w(aVar6);
                        } else {
                            jVar3.z();
                        }
                        v1.j(bVar4, l0VarD6, jVar3);
                        v1.j(dVar3, a2VarY8, jVar3);
                        if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD8))) {
                            l9.i.a(iD8, jVar3, iD8, c0128a4);
                        }
                        v1.j(cVar3, dVarC9, jVar3);
                        jVar3.L(15974460);
                        uri2 = uri;
                        final File file4 = file;
                        final Context context4 = context;
                        boolean zL4 = jVar3.l(uri2) | jVar3.l(file4) | jVar3.l(context4) | jVar3.K(str11);
                        Object objG5 = jVar3.g();
                        if (zL4 || objG5 == obj4) {
                            objG5 = new eh.a() { // from class: e9.j
                                @Override // eh.a
                                public final Object invoke() {
                                    int i11;
                                    Context context5 = context4;
                                    Uri uriB = q.b(context5, uri2, file4);
                                    if (uriB != null) {
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType(str11);
                                        intent.putExtra("android.intent.extra.STREAM", uriB);
                                        intent.addFlags(1);
                                        Intent intentCreateChooser = Intent.createChooser(intent, context5.getString(R.string.common_share));
                                        kotlin.jvm.internal.r.b(intentCreateChooser);
                                        if (q.d(context5, intentCreateChooser)) {
                                            try {
                                                context5.startActivity(intentCreateChooser);
                                            } catch (Exception e10) {
                                                Toast.makeText(context5, context5.getString(R.string.output_error_share, e10.getMessage()), 1).show();
                                            }
                                            return pg.f0.f21461a;
                                        }
                                        i11 = R.string.output_error_not_found;
                                    } else {
                                        i11 = R.string.output_file_not_found;
                                    }
                                    org.bouncycastle.crypto.engines.a.b(context5, i11, context5, 1);
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar3.C(objG5);
                        }
                        eh.a aVar15 = (eh.a) objG5;
                        jVar3.B();
                        androidx.compose.ui.d dVarF3 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar9, f13), 52);
                        h0.e eVarA3 = h0.f.a(14);
                        g1 g1Var3 = t0.m0.f26400a;
                        Object obj9 = obj4;
                        x0.j jVar9 = jVar3;
                        obj5 = obj9;
                        float f17 = f13;
                        androidx.compose.foundation.layout.b bVar10 = bVar3;
                        j1.f fVar8 = fVar2;
                        t0.x0.a(aVar15, dVarF3, false, eVarA3, t0.m0.a(b3.l.a(jVar3).f25751a, 0L, 0L, jVar9, 14), null, null, null, y0.f8605d, jVar9, 805306416, 484);
                        jVar4 = jVar9;
                        jVar4.L(16044674);
                        if (z11) {
                            androidx.compose.ui.d dVarC10 = androidx.compose.foundation.layout.e.c(bVar10.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar9, f17), 46), fVar8), CropImageView.DEFAULT_ASPECT_RATIO, -38, 1);
                            jVar4.L(16056739);
                            xVar3 = xVar;
                            boolean zL5 = jVar4.l(xVar3);
                            Object objG6 = jVar4.g();
                            if (zL5 || objG6 == obj5) {
                                objG6 = new k(xVar3, 0);
                                jVar4.C(objG6);
                            }
                            jVar4.B();
                            t2.b(dVarC10, false, (eh.a) objG6, jVar4, 0, 14);
                        } else {
                            xVar3 = xVar;
                        }
                        jVar4.B();
                        jVar4.H();
                        jVar4.B();
                        aVar7 = aVar9;
                        xVar2 = xVar3;
                        file2 = file4;
                        context2 = context4;
                    } else {
                        obj5 = obj4;
                        float f18 = f13;
                        uri2 = uri;
                        final File file5 = file;
                        final Context context5 = context;
                        p5.x xVar5 = xVar;
                        x0.j jVar10 = jVar3;
                        jVar10.L(-54264556);
                        jVar10.L(-417391191);
                        boolean zL6 = jVar10.l(uri2) | jVar10.l(file5) | jVar10.l(context5) | jVar10.K(str11);
                        Object objG7 = jVar10.g();
                        if (zL6 || objG7 == obj5) {
                            objG7 = new eh.a() { // from class: e9.l
                                @Override // eh.a
                                public final Object invoke() {
                                    int i11;
                                    Context context6 = context5;
                                    Uri uriB = q.b(context6, uri2, file5);
                                    if (uriB != null) {
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType(str11);
                                        intent.putExtra("android.intent.extra.STREAM", uriB);
                                        intent.addFlags(1);
                                        Intent intentCreateChooser = Intent.createChooser(intent, context6.getString(R.string.common_share));
                                        kotlin.jvm.internal.r.b(intentCreateChooser);
                                        if (q.d(context6, intentCreateChooser)) {
                                            try {
                                                context6.startActivity(intentCreateChooser);
                                            } catch (Exception e10) {
                                                Toast.makeText(context6, context6.getString(R.string.output_error_share, e10.getMessage()), 1).show();
                                            }
                                            return pg.f0.f21461a;
                                        }
                                        i11 = R.string.output_error_not_found;
                                    } else {
                                        i11 = R.string.output_file_not_found;
                                    }
                                    org.bouncycastle.crypto.engines.a.b(context6, i11, context6, 1);
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar10.C(objG7);
                        }
                        eh.a aVar16 = (eh.a) objG7;
                        jVar10.B();
                        androidx.compose.ui.d dVarF4 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar9, f18), 52);
                        h0.e eVarA4 = h0.f.a(14);
                        g1 g1Var4 = t0.m0.f26400a;
                        aVar7 = aVar9;
                        xVar2 = xVar5;
                        file2 = file5;
                        context2 = context5;
                        t0.x0.a(aVar16, dVarF4, false, eVarA4, t0.m0.a(b3.l.a(jVar10).G, 0L, 0L, jVar10, 14), null, null, null, y0.f8606e, jVar10, 805306416, 484);
                        jVar4 = jVar10;
                        jVar4.B();
                    }
                    jVar4.L(-417319782);
                    final String str12 = str6;
                    boolean zL7 = jVar4.l(uri2) | jVar4.l(context2) | jVar4.K(str12) | jVar4.l(file2);
                    Object objG8 = jVar4.g();
                    if (zL7 || objG8 == obj5) {
                        objG8 = new eh.a() { // from class: e9.m
                            @Override // eh.a
                            public final Object invoke() {
                                Uri uri4 = uri2;
                                Context context6 = context2;
                                if (uri4 != null) {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setDataAndType(uri4, "resource/folder");
                                    intent.addFlags(1);
                                    try {
                                        context6.startActivity(intent);
                                    } catch (Exception unused2) {
                                        Toast.makeText(context6, context6.getString(R.string.output_saved_to, str12), 1).show();
                                    }
                                } else {
                                    File file6 = file2;
                                    if (file6 == null || !file6.exists()) {
                                        org.bouncycastle.crypto.engines.a.b(context6, R.string.output_file_not_found, context6, 1);
                                    } else {
                                        try {
                                            File parentFile = file6.getParentFile();
                                            if (parentFile != null) {
                                                Uri uriForFile = FileProvider.getUriForFile(context6, context6.getPackageName() + ".fileprovider", parentFile);
                                                Intent intent2 = new Intent("android.intent.action.VIEW");
                                                intent2.setDataAndType(uriForFile, "resource/folder");
                                                intent2.addFlags(1);
                                                if (q.d(context6, intent2)) {
                                                    context6.startActivity(intent2);
                                                } else {
                                                    Toast.makeText(context6, context6.getString(R.string.output_saved_to, file6.getAbsolutePath()), 1).show();
                                                }
                                            }
                                        } catch (Exception unused3) {
                                            Toast.makeText(context6, context6.getString(R.string.output_saved_to, file6.getAbsolutePath()), 1).show();
                                        }
                                    }
                                }
                                return pg.f0.f21461a;
                            }
                        };
                        jVar4.C(objG8);
                    }
                    jVar4.B();
                    d.a aVar17 = aVar7;
                    float f19 = 52;
                    float f20 = 14;
                    x0.j jVar11 = jVar4;
                    t0.x0.a((eh.a) objG8, androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar17, 1.0f), f19), false, h0.f.a(f20), t0.m0.a(b3.l.a(jVar4).G, 0L, 0L, jVar4, 14), null, null, null, y0.f8607f, jVar11, 805306416, 484);
                    jVar11.L(-417224763);
                    p5.x xVar6 = xVar2;
                    boolean zL8 = jVar11.l(xVar6);
                    Object objG9 = jVar11.g();
                    if (zL8 || objG9 == obj5) {
                        objG9 = new t1(xVar6, 1);
                        jVar11.C(objG9);
                    }
                    jVar11.B();
                    t0.x0.c((eh.a) objG9, androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar17, 1.0f), f19), false, h0.f.a(f20), null, null, null, y0.f8608g, jVar11, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                    jVar11.H();
                    jVar11.H();
                }
                l9.i.a(iD3, jVar5, iD3, c0128a8);
                g.a.c cVar52 = g.a.f13865d;
                v1.j(cVar52, dVarC3, jVar5);
                float f162 = 26;
                androidx.compose.ui.d dVarD4 = e1.d.d(androidx.compose.foundation.layout.g.n(aVar9, HeaderItem.DATA_START_OFFSET), h0.f.a(f162));
                jVar5.L(15761480);
                if (str == null) {
                }
                jVar5.B();
                y1.a aVar122 = y1.f21750a;
                androidx.compose.ui.d dVarA3 = t.o.a(androidx.compose.foundation.a.b(dVarD4, j10, aVar122), 1, b1.c(0.5f, b3.l.a(jVar5).B), h0.f.a(f10));
                g2.l0 l0VarD32 = z.g.d(fVar4, false);
                int iD42 = jVar5.D();
                a2 a2VarY42 = jVar5.y();
                androidx.compose.ui.d dVarC42 = androidx.compose.ui.c.c(dVarA3, jVar5);
                if (jVar5.t() != null) {
                }
            } else {
                if (mh.x.A(strSubstring)) {
                    strSubstring = null;
                }
                if (strSubstring == null) {
                }
                jVar5.L(-417723616);
                zK = jVar5.K(strSubstring);
                objG = jVar5.g();
                obj = j.a.f31715a;
                if (!zK) {
                    objG = IconGenerator.INSTANCE.extractDisplayGlyph(strSubstring);
                    jVar5.C(objG);
                    String str82 = (String) objG;
                    jVar5.B();
                    ProjectEntity value52 = r3Var.getValue();
                    if (value52 == null) {
                    }
                    jVar5.L(-417718847);
                    zK2 = jVar5.K(primaryColor);
                    objG2 = jVar5.g();
                    if (zK2) {
                        value = r3Var.getValue();
                        if (value != null) {
                            String primaryColor22 = "#2196F3";
                            jC = c2.n0.b(Color.parseColor(primaryColor22));
                            obj2 = obj;
                            objG2 = new b1(jC);
                            jVar5.C(objG2);
                            long j112 = ((b1) objG2).f21656a;
                            jVar5.B();
                            androidx.compose.ui.d dVarN3 = androidx.compose.foundation.layout.g.n(aVar9, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET);
                            g2.l0 l0VarD22 = z.g.d(fVar4, false);
                            int iD32 = jVar5.D();
                            a2 a2VarY32 = jVar5.y();
                            androidx.compose.ui.d dVarC32 = androidx.compose.ui.c.c(dVarN3, jVar5);
                            i2.g.f13861o.getClass();
                            e0.a aVar112 = g.a.f13863b;
                            if (jVar5.t() != null) {
                            }
                        }
                    }
                }
            }
        }
        return pg.f0.f21461a;
    }
}
