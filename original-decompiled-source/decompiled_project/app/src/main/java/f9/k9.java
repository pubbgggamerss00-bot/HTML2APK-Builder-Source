package f9;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.domain.model.ProjectFile;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l9.f0;
import l9.p0;
import x0.j;

/* loaded from: classes.dex */
public final class k9 implements eh.q<z.r, x0.j, Integer, pg.f0> {
    public final /* synthetic */ eh.l<String, pg.f0> A;
    public final /* synthetic */ Context B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<pg.n<String, String>> f9924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f9926c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f9928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f9929f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f9930g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f9931h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f9932j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f9933k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f9934l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Uri f9935m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f9936n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f9937p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List<ProjectFile> f9938q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f9939r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f0.b f9940s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f9941t;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f9942v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ eh.l<ProjectFile, pg.f0> f9943w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ eh.l<ProjectFile, pg.f0> f9944x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p0.b f9945y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9946z;

    /* JADX WARN: Multi-variable type inference failed */
    public k9(List<pg.n<String, String>> list, String str, eh.l<? super Boolean, pg.f0> lVar, String str2, eh.l<? super String, pg.f0> lVar2, eh.a<pg.f0> aVar, String str3, eh.l<? super String, pg.f0> lVar3, boolean z10, eh.a<pg.f0> aVar2, eh.a<pg.f0> aVar3, Uri uri, boolean z11, String str4, List<ProjectFile> list2, boolean z12, f0.b bVar, eh.a<pg.f0> aVar4, eh.a<pg.f0> aVar5, eh.l<? super ProjectFile, pg.f0> lVar4, eh.l<? super ProjectFile, pg.f0> lVar5, p0.b bVar2, x0.n1<Boolean> n1Var, eh.l<? super String, pg.f0> lVar6, Context context) {
        this.f9924a = list;
        this.f9925b = str;
        this.f9926c = lVar;
        this.f9927d = str2;
        this.f9928e = lVar2;
        this.f9929f = aVar;
        this.f9930g = str3;
        this.f9931h = lVar3;
        this.f9932j = z10;
        this.f9933k = aVar2;
        this.f9934l = aVar3;
        this.f9935m = uri;
        this.f9936n = z11;
        this.f9937p = str4;
        this.f9938q = list2;
        this.f9939r = z12;
        this.f9940s = bVar;
        this.f9941t = aVar4;
        this.f9942v = aVar5;
        this.f9943w = lVar4;
        this.f9944x = lVar5;
        this.f9945y = bVar2;
        this.f9946z = n1Var;
        this.A = lVar6;
        this.B = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0401  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        String str;
        Object next;
        String str2;
        Object obj;
        k9 k9Var;
        Object obj2;
        String str3;
        Object obj3;
        Object obj4;
        String str4;
        k9 k9Var2;
        k9 k9Var3;
        Object obj5;
        String str5;
        Object obj6;
        k9 k9Var4;
        x0.s3 s3Var;
        boolean z10;
        int i10;
        e0.a aVar;
        g.a.C0128a c0128a;
        j.a.C0321a c0321a;
        j.a.C0321a c0321a2;
        x0.j jVar2;
        k9 k9Var5;
        final eh.l<String, pg.f0> lVar;
        j.a.C0321a c0321a3;
        boolean zK;
        Object objG;
        j.a.C0321a c0321a4;
        boolean z11;
        z.r EditorCard = rVar;
        x0.j jVar3 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(EditorCard, "$this$EditorCard");
        if ((iIntValue & 17) != 16 || !jVar3.s()) {
            t0.ff.b(f3.q.c(R.string.editor_section_content_source, jVar3), null, ((t0.e2) jVar3.f(t0.f2.f25858a)).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar3.f(t0.of.f26647a)).f26545h, jVar3, 196608, 0, 65498);
            x0.j jVar4 = jVar3;
            List<pg.n<String, String>> list = this.f9924a;
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                str = this.f9925b;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.r.a(((pg.n) next).f21469a, str)) {
                    break;
                }
            }
            pg.n nVar = (pg.n) next;
            if (nVar == null || (str2 = (String) nVar.f21470b) == null) {
                str2 = str;
            }
            final x0.n1<Boolean> n1Var = this.f9946z;
            boolean zBooleanValue = n1Var.getValue().booleanValue();
            jVar4.L(1987743423);
            Object objG2 = jVar4.g();
            j.a.C0321a c0321a5 = j.a.f31715a;
            if (objG2 == c0321a5) {
                objG2 = new eh.l() { // from class: f9.w8
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj7) {
                        ((Boolean) obj7).getClass();
                        n1Var.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                        return pg.f0.f21461a;
                    }
                };
                jVar4.C(objG2);
            }
            jVar4.B();
            t0.o3.a(zBooleanValue, (eh.l) objG2, null, f1.c.b(1883545868, new g9(this.A, str2, list, n1Var), jVar4), jVar4, 3120);
            int iHashCode = str.hashCode();
            d.a aVar2 = d.a.f1143b;
            boolean z12 = this.f9936n;
            boolean z13 = this.f9932j;
            f.b bVar = d.a.f14612k;
            String str6 = this.f9937p;
            switch (iHashCode) {
                case -1268966290:
                    obj = "local";
                    k9Var = this;
                    obj2 = "folder";
                    str3 = str;
                    obj3 = "paste";
                    if (str3.equals(obj2)) {
                        jVar4.L(1502883883);
                        if (k9Var.f9938q.isEmpty()) {
                            obj4 = obj2;
                            str4 = str3;
                            jVar4.L(1504124100);
                            t0.x0.c(k9Var.f9941t, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, h0.f.a(12), null, null, null, e.G, jVar4, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                            if (k9Var.f9939r) {
                                jVar4.L(1504614334);
                                b8.j(k9Var.f9940s, jVar4, 0);
                                jVar4.B();
                                k9Var2 = k9Var;
                            } else {
                                jVar4.L(1504721284);
                                k9Var2 = this;
                                t0.ff.b(pd.d.a(aVar2, 8, jVar4, R.string.editor_folder_hint, jVar4), null, ((t0.e2) jVar4.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar4.f(t0.of.f26647a)).f26549l, jVar4, 0, 0, 65530);
                                jVar4 = jVar4;
                                jVar4.B();
                            }
                            jVar4.B();
                        } else {
                            jVar4.L(1502898887);
                            float f10 = 12;
                            obj4 = obj2;
                            str4 = str3;
                            t0.x0.c(k9Var.f9929f, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, h0.f.a(f10), null, null, null, e.F, jVar4, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                            b8.w(pd.d.a(aVar2, 10, jVar4, R.string.editor_imported_folder, jVar4), k9Var.f9938q, k9Var.f9939r, k9Var.f9940s, k9Var.f9941t, k9Var.f9942v, k9Var.f9943w, k9Var.f9944x, jVar4, 0);
                            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f10), jVar4);
                            b8.y(k9Var.f9945y, jVar4, 0);
                            jVar4.B();
                            k9Var2 = k9Var;
                        }
                        jVar4.B();
                        pg.f0 f0Var = pg.f0.f21461a;
                    } else {
                        jVar4.L(1505123323);
                        jVar4.B();
                        pg.f0 f0Var2 = pg.f0.f21461a;
                        obj4 = obj2;
                        str4 = str3;
                        k9Var2 = k9Var;
                    }
                    obj6 = obj;
                    if (!str4.equals(obj6) || str4.equals(obj3) || str4.equals(obj4)) {
                        b8.l(k9Var2.f9930g, k9Var2.f9935m, k9Var2.f9925b, k9Var2.f9938q, jVar4, 0, 0);
                        break;
                    }
                    break;
                case 110834:
                    obj = "local";
                    k9Var3 = this;
                    obj5 = "folder";
                    obj3 = "paste";
                    str5 = str;
                    if (str5.equals(ProjectKind.PDF)) {
                        jVar4.L(1499343094);
                        t0.ff.b(f3.q.c(R.string.pdf_hint, jVar4), null, ((t0.e2) jVar4.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar4.f(t0.of.f26647a)).f26549l, jVar4, 0, 0, 65530);
                        t0.x0.a(this.f9934l, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, h0.f.a(12), null, null, null, null, f1.c.b(-1926646234, new j9(str6), jVar4), jVar4, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                        jVar4 = jVar4;
                        jVar4.L(1988041812);
                        if (this.f9935m != null) {
                            t0.x0.c(this.f9929f, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, null, null, null, null, e.B, jVar4, 805306416, 508);
                        }
                        jVar4.B();
                        if (z12) {
                            t0.z9.c(CropImageView.DEFAULT_ASPECT_RATIO, 0, 6, 30, 0L, 0L, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), jVar4);
                            jVar4 = jVar4;
                        }
                        jVar4.B();
                        pg.f0 f0Var3 = pg.f0.f21461a;
                        k9Var2 = this;
                        obj4 = obj5;
                        obj6 = obj;
                        str4 = str5;
                        if (!str4.equals(obj6)) {
                            b8.l(k9Var2.f9930g, k9Var2.f9935m, k9Var2.f9925b, k9Var2.f9938q, jVar4, 0, 0);
                            break;
                        }
                    }
                    k9Var = k9Var3;
                    str3 = str5;
                    obj2 = obj5;
                    jVar4.L(1505123323);
                    jVar4.B();
                    pg.f0 f0Var22 = pg.f0.f21461a;
                    obj4 = obj2;
                    str4 = str3;
                    k9Var2 = k9Var;
                    obj6 = obj;
                    if (!str4.equals(obj6)) {
                    }
                case 116079:
                    obj = "local";
                    k9Var3 = this;
                    obj5 = "folder";
                    obj3 = "paste";
                    str5 = str;
                    if (str5.equals("url")) {
                        jVar4.L(1491491321);
                        i0.h2 h2Var = new i0.h2(5, 0, 123);
                        androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                        jVar4.L(1987790556);
                        eh.l<Boolean, pg.f0> lVar2 = k9Var3.f9926c;
                        boolean zK2 = jVar4.K(lVar2);
                        Object objG3 = jVar4.g();
                        if (zK2 || objG3 == c0321a5) {
                            objG3 = new x8(lVar2, 0);
                            jVar4.C(objG3);
                        }
                        jVar4.B();
                        t0.w9.a(k9Var3.f9927d, k9Var3.f9928e, androidx.compose.ui.focus.a.a(dVarD, (eh.l) objG3), false, false, null, e.f9376t, null, null, null, null, e.f9378u, false, null, h2Var, null, false, 0, 0, null, null, jVar4, 1572864, 196992, 8351672);
                        jVar4 = jVar4;
                        if (!mh.x.A(k9Var3.f9927d)) {
                            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 8), jVar4);
                            t0.x0.c(k9Var3.f9929f, androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, h0.f.a(12), null, null, null, e.f9380v, jVar4, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                        }
                        jVar4.B();
                        pg.f0 f0Var4 = pg.f0.f21461a;
                        k9Var2 = k9Var3;
                        obj4 = obj5;
                        obj6 = obj;
                        str4 = str5;
                        if (!str4.equals(obj6)) {
                        }
                    }
                    k9Var = k9Var3;
                    str3 = str5;
                    obj2 = obj5;
                    jVar4.L(1505123323);
                    jVar4.B();
                    pg.f0 f0Var222 = pg.f0.f21461a;
                    obj4 = obj2;
                    str4 = str3;
                    k9Var2 = k9Var;
                    obj6 = obj;
                    if (!str4.equals(obj6)) {
                    }
                    break;
                case 103145323:
                    obj5 = "folder";
                    str5 = str;
                    obj3 = "paste";
                    if (str5.equals("local")) {
                        jVar4.L(1500312588);
                        androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                        h0.e eVarA = h0.f.a(12);
                        z.g1 g1Var = t0.m0.f26400a;
                        x0.s3 s3Var2 = t0.f2.f25858a;
                        t0.x0.a(this.f9934l, dVarD2, false, eVarA, t0.m0.a(((t0.e2) jVar4.f(s3Var2)).f25755c, 0L, 0L, jVar4, 14), null, null, null, e.C, jVar4, 805306416, 484);
                        jVar4 = jVar4;
                        jVar4.L(1988076553);
                        if (mh.x.A(str6)) {
                            k9Var4 = this;
                            s3Var = s3Var2;
                            z10 = z12;
                        } else {
                            androidx.compose.ui.d dVarD3 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                            z.q qVarA = z.o.a(z.b.h(4), d.a.f14614m, jVar4, 6);
                            int iD = jVar4.D();
                            x0.a2 a2VarY = jVar4.y();
                            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD3, jVar4);
                            i2.g.f13861o.getClass();
                            e0.a aVar3 = g.a.f13863b;
                            if (jVar4.t() == null) {
                                c9.u1.d();
                                throw null;
                            }
                            jVar4.r();
                            if (jVar4.m()) {
                                jVar4.w(aVar3);
                            } else {
                                jVar4.z();
                            }
                            g.a.b bVar2 = g.a.f13867f;
                            ph.v1.j(bVar2, qVarA, jVar4);
                            g.a.d dVar = g.a.f13866e;
                            ph.v1.j(dVar, a2VarY, jVar4);
                            g.a.C0128a c0128a2 = g.a.f13868g;
                            if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD))) {
                                l9.i.a(iD, jVar4, iD, c0128a2);
                            }
                            g.a.c cVar = g.a.f13865d;
                            ph.v1.j(cVar, dVarC, jVar4);
                            z10 = z12;
                            s3Var = s3Var2;
                            t0.ff.b(f3.q.d(R.string.editor_selected_file, new Object[]{str6}, jVar4), null, ((t0.e2) jVar4.f(s3Var2)).f25751a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar4.f(t0.of.f26647a)).f26549l, jVar4, 0, 0, 65530);
                            jVar4 = jVar4;
                            z.m1 m1VarA = z.k1.a(z.b.h(8), bVar, jVar4, 54);
                            int iD2 = jVar4.D();
                            x0.a2 a2VarY2 = jVar4.y();
                            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar2, jVar4);
                            if (jVar4.t() == null) {
                                c9.u1.d();
                                throw null;
                            }
                            jVar4.r();
                            if (jVar4.m()) {
                                jVar4.w(aVar3);
                            } else {
                                jVar4.z();
                            }
                            ph.v1.j(bVar2, m1VarA, jVar4);
                            ph.v1.j(dVar, a2VarY2, jVar4);
                            if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD2))) {
                                l9.i.a(iD2, jVar4, iD2, c0128a2);
                            }
                            ph.v1.j(cVar, dVarC2, jVar4);
                            k9Var4 = this;
                            t0.x0.c(k9Var4.f9929f, null, false, h0.f.a(10), null, null, null, e.D, jVar4, 805306368, 502);
                            jVar4.L(445772955);
                            if (z13) {
                                t0.x0.d(k9Var4.f9933k, null, false, null, null, null, e.E, jVar4, 805306368, 510);
                                jVar4 = jVar4;
                            }
                            jVar4.B();
                            jVar4.H();
                            jVar4.H();
                        }
                        jVar4.B();
                        if (z10) {
                            x0.j jVar5 = jVar4;
                            t0.z9.c(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 28, ((t0.e2) jVar4.f(s3Var)).f25751a, 0L, e1.d.d(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 2), h0.f.a(1)), jVar5);
                            jVar4 = jVar5;
                        }
                        jVar4.B();
                        pg.f0 f0Var5 = pg.f0.f21461a;
                        k9Var2 = k9Var4;
                        obj4 = obj5;
                        obj6 = "local";
                        str4 = str5;
                        if (!str4.equals(obj6)) {
                        }
                    } else {
                        k9Var = this;
                        obj = "local";
                        str3 = str5;
                        obj2 = obj5;
                        jVar4.L(1505123323);
                        jVar4.B();
                        pg.f0 f0Var2222 = pg.f0.f21461a;
                        obj4 = obj2;
                        str4 = str3;
                        k9Var2 = k9Var;
                        obj6 = obj;
                        if (!str4.equals(obj6)) {
                        }
                    }
                    break;
                case 106438291:
                    if (str.equals("paste")) {
                        jVar4.L(1492892118);
                        androidx.compose.ui.d dVarD4 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                        z.m1 m1VarA2 = z.k1.a(z.b.f34450g, bVar, jVar4, 54);
                        int iD3 = jVar4.D();
                        x0.a2 a2VarY3 = jVar4.y();
                        androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarD4, jVar4);
                        i2.g.f13861o.getClass();
                        e0.a aVar4 = g.a.f13863b;
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
                        g.a.b bVar3 = g.a.f13867f;
                        ph.v1.j(bVar3, m1VarA2, jVar4);
                        g.a.d dVar2 = g.a.f13866e;
                        ph.v1.j(dVar2, a2VarY3, jVar4);
                        g.a.C0128a c0128a3 = g.a.f13868g;
                        if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD3))) {
                            l9.i.a(iD3, jVar4, iD3, c0128a3);
                        }
                        g.a.c cVar2 = g.a.f13865d;
                        ph.v1.j(cVar2, dVarC3, jVar4);
                        String strC = f3.q.c(R.string.editor_label_paste_html, jVar4);
                        t2.l0 l0Var = ((t0.nf) jVar4.f(t0.of.f26647a)).f26545h;
                        x2.p pVar = x2.p.f32032e;
                        x0.s3 s3Var3 = t0.f2.f25858a;
                        obj3 = "paste";
                        t0.ff.b(strC, null, ((t0.e2) jVar4.f(s3Var3)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar4, 196608, 0, 65498);
                        x0.j jVar6 = jVar4;
                        jVar6.L(-108532606);
                        String str7 = this.f9930g;
                        if (mh.x.A(str7)) {
                            i10 = 8;
                        } else {
                            i10 = 8;
                            t0.md.a(null, h0.f.a(8), ((t0.e2) jVar6.f(s3Var3)).f25755c, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-191901775, new h9(str7), jVar6), jVar6, 12582912, 121);
                            jVar6 = jVar6;
                        }
                        jVar6.B();
                        jVar6.H();
                        androidx.compose.ui.d dVarD5 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                        float f11 = i10;
                        z.m1 m1VarA3 = z.k1.a(z.b.h(f11), bVar, jVar6, 54);
                        int iD4 = jVar6.D();
                        x0.a2 a2VarY4 = jVar6.y();
                        androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarD5, jVar6);
                        if (jVar6.t() == null) {
                            c9.u1.d();
                            throw null;
                        }
                        jVar6.r();
                        if (jVar6.m()) {
                            aVar = aVar4;
                            jVar6.w(aVar);
                        } else {
                            aVar = aVar4;
                            jVar6.z();
                        }
                        ph.v1.j(bVar3, m1VarA3, jVar6);
                        ph.v1.j(dVar2, a2VarY4, jVar6);
                        if (jVar6.m() || !kotlin.jvm.internal.r.a(jVar6.g(), Integer.valueOf(iD4))) {
                            c0128a = c0128a3;
                            l9.i.a(iD4, jVar6, iD4, c0128a);
                        } else {
                            c0128a = c0128a3;
                        }
                        ph.v1.j(cVar2, dVarC4, jVar6);
                        jVar6.L(-108499318);
                        Context context = this.B;
                        boolean zL = jVar6.l(context);
                        eh.l<String, pg.f0> lVar3 = this.f9931h;
                        boolean zK3 = zL | jVar6.K(lVar3);
                        Object objG4 = jVar6.g();
                        if (zK3) {
                            c0321a = c0321a5;
                        } else {
                            c0321a = c0321a5;
                            if (objG4 != c0321a) {
                                c0321a2 = c0321a;
                            }
                            eh.a aVar5 = (eh.a) objG4;
                            jVar6.B();
                            if (1.0f <= 0.0d) {
                                a0.a.a("invalid weight; must be greater than zero");
                            }
                            float f12 = 10;
                            float f13 = 14;
                            e0.a aVar6 = aVar;
                            jVar2 = jVar6;
                            g.a.C0128a c0128a4 = c0128a;
                            j.a.C0321a c0321a6 = c0321a2;
                            t0.x0.a(aVar5, new LayoutWeightElement(1.0f, true), false, h0.f.a(f12), null, null, null, new z.g1(f13, f11, f13, f11), e.f9382w, jVar2, 817889280, 372);
                            jVar2.H();
                            jVar2.L(1987934813);
                            if (mh.x.A(str7)) {
                                androidx.compose.ui.d dVarD6 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                                z.m1 m1VarA4 = z.k1.a(z.b.h(f11), bVar, jVar2, 54);
                                int iD5 = jVar2.D();
                                x0.a2 a2VarY5 = jVar2.y();
                                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarD6, jVar2);
                                if (jVar2.t() == null) {
                                    c9.u1.d();
                                    throw null;
                                }
                                jVar2.r();
                                if (jVar2.m()) {
                                    jVar2.w(aVar6);
                                } else {
                                    jVar2.z();
                                }
                                ph.v1.j(bVar3, m1VarA4, jVar2);
                                ph.v1.j(dVar2, a2VarY5, jVar2);
                                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD5))) {
                                    l9.i.a(iD5, jVar2, iD5, c0128a4);
                                }
                                ph.v1.j(cVar2, dVarC5, jVar2);
                                float f14 = 12;
                                k9Var5 = this;
                                t0.x0.c(k9Var5.f9929f, null, false, h0.f.a(f12), null, null, new z.g1(f14, f11, f14, f11), e.f9384x, jVar2, 817889280, 374);
                                jVar2.L(-108399267);
                                boolean zK4 = jVar2.K(lVar3);
                                Object objG5 = jVar2.g();
                                if (zK4) {
                                    c0321a4 = c0321a6;
                                } else {
                                    c0321a4 = c0321a6;
                                    if (objG5 != c0321a4) {
                                        z11 = false;
                                    }
                                    jVar2.B();
                                    c0321a3 = c0321a4;
                                    lVar = lVar3;
                                    t0.x0.c((eh.a) objG5, null, false, h0.f.a(f12), null, null, new z.g1(f14, f11, f14, f11), e.f9386y, jVar2, 817889280, 374);
                                    jVar2.H();
                                }
                                z11 = false;
                                objG5 = new y8(lVar3, 0);
                                jVar2.C(objG5);
                                jVar2.B();
                                c0321a3 = c0321a4;
                                lVar = lVar3;
                                t0.x0.c((eh.a) objG5, null, false, h0.f.a(f12), null, null, new z.g1(f14, f11, f14, f11), e.f9386y, jVar2, 817889280, 374);
                                jVar2.H();
                            } else {
                                k9Var5 = this;
                                lVar = lVar3;
                                c0321a3 = c0321a6;
                            }
                            jVar2.B();
                            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 220);
                            jVar2.L(1987990984);
                            zK = jVar2.K(lVar);
                            objG = jVar2.g();
                            if (!zK || objG == c0321a3) {
                                objG = new eh.l() { // from class: f9.z8
                                    @Override // eh.l
                                    public final Object invoke(Object obj7) {
                                        String input = (String) obj7;
                                        kotlin.jvm.internal.r.e(input, "input");
                                        if (mh.t.p(input, "```", false) || mh.t.p(input, "'''", false) || mh.t.p(input, "\"\"\"", false)) {
                                            Set<String> set = l9.w.f16906a;
                                            input = l9.w.a(input);
                                        }
                                        lVar.invoke(input);
                                        return pg.f0.f21461a;
                                    }
                                };
                                jVar2.C(objG);
                            }
                            jVar2.B();
                            q8.k1.b(k9Var5.f9930g, (eh.l) objG, dVarF, e.f9388z, null, f1.c.b(-1848768478, new i9(str7, 0), jVar2), jVar2, 200064, 16);
                            jVar4 = jVar2;
                            if (z13) {
                                t0.x0.d(k9Var5.f9933k, null, false, null, null, null, e.A, jVar4, 805306368, 510);
                                jVar4 = jVar4;
                            }
                            jVar4.B();
                            pg.f0 f0Var6 = pg.f0.f21461a;
                            k9Var2 = k9Var5;
                            obj4 = "folder";
                            obj6 = "local";
                            str4 = str;
                            if (!str4.equals(obj6)) {
                            }
                        }
                        c0321a2 = c0321a;
                        objG4 = new androidx.credentials.playservices.l(1, context, lVar3);
                        jVar6.C(objG4);
                        eh.a aVar52 = (eh.a) objG4;
                        jVar6.B();
                        if (1.0f <= 0.0d) {
                        }
                        float f122 = 10;
                        float f132 = 14;
                        e0.a aVar62 = aVar;
                        jVar2 = jVar6;
                        g.a.C0128a c0128a42 = c0128a;
                        j.a.C0321a c0321a62 = c0321a2;
                        t0.x0.a(aVar52, new LayoutWeightElement(1.0f, true), false, h0.f.a(f122), null, null, null, new z.g1(f132, f11, f132, f11), e.f9382w, jVar2, 817889280, 372);
                        jVar2.H();
                        jVar2.L(1987934813);
                        if (mh.x.A(str7)) {
                        }
                        jVar2.B();
                        androidx.compose.ui.d dVarF2 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 220);
                        jVar2.L(1987990984);
                        zK = jVar2.K(lVar);
                        objG = jVar2.g();
                        if (!zK) {
                            objG = new eh.l() { // from class: f9.z8
                                @Override // eh.l
                                public final Object invoke(Object obj7) {
                                    String input = (String) obj7;
                                    kotlin.jvm.internal.r.e(input, "input");
                                    if (mh.t.p(input, "```", false) || mh.t.p(input, "'''", false) || mh.t.p(input, "\"\"\"", false)) {
                                        Set<String> set = l9.w.f16906a;
                                        input = l9.w.a(input);
                                    }
                                    lVar.invoke(input);
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar2.C(objG);
                            jVar2.B();
                            q8.k1.b(k9Var5.f9930g, (eh.l) objG, dVarF2, e.f9388z, null, f1.c.b(-1848768478, new i9(str7, 0), jVar2), jVar2, 200064, 16);
                            jVar4 = jVar2;
                            if (z13) {
                            }
                            jVar4.B();
                            pg.f0 f0Var62 = pg.f0.f21461a;
                            k9Var2 = k9Var5;
                            obj4 = "folder";
                            obj6 = "local";
                            str4 = str;
                            if (!str4.equals(obj6)) {
                            }
                        }
                    }
                    break;
                default:
                    obj = "local";
                    k9Var = this;
                    obj2 = "folder";
                    str3 = str;
                    obj3 = "paste";
                    jVar4.L(1505123323);
                    jVar4.B();
                    pg.f0 f0Var22222 = pg.f0.f21461a;
                    obj4 = obj2;
                    str4 = str3;
                    k9Var2 = k9Var;
                    obj6 = obj;
                    if (!str4.equals(obj6)) {
                    }
                    break;
            }
        } else {
            jVar3.v();
        }
        return pg.f0.f21461a;
    }
}
