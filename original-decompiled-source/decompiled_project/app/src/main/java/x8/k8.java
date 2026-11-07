package x8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.FileProvider;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import t0.ff;
import t0.hb;
import t0.md;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class k8 {

    public static final class a implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<List<File>> f32879a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SimpleDateFormat f32880b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f32881c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c.k<Intent, e.a> f32882d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f32883e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f32884f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f32885g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f32886h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ x0.n1<File> f32887j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ x0.n1<File> f32888k;

        public a(x0.n1<List<File>> n1Var, SimpleDateFormat simpleDateFormat, Context context, c.k<Intent, e.a> kVar, eh.a<pg.f0> aVar, String str, long j10, x0.n1<Boolean> n1Var2, x0.n1<File> n1Var3, x0.n1<File> n1Var4) {
            this.f32879a = n1Var;
            this.f32880b = simpleDateFormat;
            this.f32881c = context;
            this.f32882d = kVar;
            this.f32883e = aVar;
            this.f32884f = str;
            this.f32885g = j10;
            this.f32886h = n1Var2;
            this.f32887j = n1Var3;
            this.f32888k = n1Var4;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            e0.a aVar;
            g.a.C0128a c0128a;
            String strB;
            x0.j jVar2;
            x0.j jVar3;
            z.r ModalBottomSheet = rVar;
            x0.j jVar4 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(ModalBottomSheet, "$this$ModalBottomSheet");
            if ((iIntValue & 17) == 16 && jVar4.s()) {
                jVar4.v();
            } else {
                d.a aVar2 = d.a.f1143b;
                float f10 = 16;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(d0.h.f(androidx.compose.foundation.layout.g.d(aVar2, 1.0f)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, 7);
                b.k kVar = z.b.f34446c;
                f.a aVar3 = d.a.f14614m;
                z.q qVarA = z.o.a(kVar, aVar3, jVar4, 0);
                int iD = jVar4.D();
                x0.a2 a2VarY = jVar4.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar4);
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
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, qVarA, jVar4);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar4);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar4, iD, c0128a2);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar4);
                float f11 = 4;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 20, f11);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar4, 48);
                int iD2 = jVar4.D();
                x0.a2 a2VarY2 = jVar4.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarI, jVar4);
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
                ph.v1.j(bVar, m1VarA, jVar4);
                ph.v1.j(dVar, a2VarY2, jVar4);
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar4, iD2, c0128a2);
                }
                ph.v1.j(cVar, dVarC2, jVar4);
                float f12 = 12;
                md.a(androidx.compose.foundation.layout.g.n(aVar2, 44), h0.f.a(f12), b3.l.a(jVar4).f25755c, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, x8.d.f32458b, jVar4, 12582918, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f12), jVar4);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA2 = z.o.a(kVar, aVar3, jVar4, 0);
                int iD3 = jVar4.D();
                x0.a2 a2VarY3 = jVar4.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(layoutWeightElement, jVar4);
                if (jVar4.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    aVar = aVar4;
                    jVar4.w(aVar);
                } else {
                    aVar = aVar4;
                    jVar4.z();
                }
                ph.v1.j(bVar, qVarA2, jVar4);
                ph.v1.j(dVar, a2VarY3, jVar4);
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD3))) {
                    c0128a = c0128a2;
                    l9.i.a(iD3, jVar4, iD3, c0128a);
                } else {
                    c0128a = c0128a2;
                }
                ph.v1.j(cVar, dVarC3, jVar4);
                t2.l0 l0Var = b3.l.b(jVar4).f26545h;
                x2.p pVar = x2.p.f32033f;
                g.a.C0128a c0128a3 = c0128a;
                e0.a aVar5 = aVar;
                ff.b(this.f32884f, null, b3.l.a(jVar4).f25771q, 0L, pVar, null, 0L, null, 0L, 2, false, 1, 0, l0Var, jVar4, 196608, 3120, 55258);
                final x0.n1<List<File>> n1Var = this.f32879a;
                if (n1Var.getValue().isEmpty()) {
                    strB = com.google.crypto.tink.shaded.protobuf.t0.b(jVar4, 775707805, R.string.home_menu_build_outputs, jVar4);
                } else {
                    jVar4.L(775563128);
                    strB = f3.q.d(R.string.output_total_info, new Object[]{Integer.valueOf(n1Var.getValue().size()), k8.c(this.f32885g)}, jVar4);
                    jVar4.B();
                }
                ff.b(strB, null, b3.l.a(jVar4).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar4).f26549l, jVar4, 0, 0, 65530);
                jVar4.H();
                jVar4.L(2035517100);
                int size = n1Var.getValue().size();
                j.a.C0321a c0321a = j.a.f31715a;
                if (size > 1) {
                    jVar4.L(2035519580);
                    Object objG = jVar4.g();
                    if (objG == c0321a) {
                        objG = new f9.l(this.f32886h, 1);
                        jVar4.C(objG);
                    }
                    jVar4.B();
                    t0.x0.d((eh.a) objG, null, false, null, null, null, x8.d.f32459c, jVar4, 805306374, 510);
                    jVar2 = jVar4;
                } else {
                    jVar2 = jVar4;
                }
                jVar2.B();
                t0.s4.c(this.f32883e, null, false, null, x8.d.f32460d, jVar2, 196608, 30);
                jVar2.H();
                float f13 = 10;
                x0.j jVar5 = jVar2;
                t0.v2.a(androidx.compose.foundation.layout.f.l(aVar2, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, f12, 5), CropImageView.DEFAULT_ASPECT_RATIO, q1.b1.c(0.5f, b3.l.a(jVar2).B), jVar5, 6, 2);
                if (n1Var.getValue().isEmpty()) {
                    jVar5.L(-197521443);
                    b.c cVar2 = z.b.f34448e;
                    androidx.compose.ui.d dVarI2 = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 24, 36);
                    z.q qVarA3 = z.o.a(cVar2, d.a.f14615n, jVar5, 54);
                    int iD4 = jVar5.D();
                    x0.a2 a2VarY4 = jVar5.y();
                    androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarI2, jVar5);
                    if (jVar5.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar5.r();
                    if (jVar5.m()) {
                        jVar5.w(aVar5);
                    } else {
                        jVar5.z();
                    }
                    ph.v1.j(bVar, qVarA3, jVar5);
                    ph.v1.j(dVar, a2VarY4, jVar5);
                    if (jVar5.m() || !kotlin.jvm.internal.r.a(jVar5.g(), Integer.valueOf(iD4))) {
                        l9.i.a(iD4, jVar5, iD4, c0128a3);
                    }
                    ph.v1.j(cVar, dVarC4, jVar5);
                    md.a(androidx.compose.foundation.layout.g.n(aVar2, 68), h0.f.f12083a, q1.b1.c(0.5f, b3.l.a(jVar5).f25772r), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, x8.d.f32461e, jVar5, 12582918, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
                    jVar3 = jVar5;
                    ff.b(pd.d.a(aVar2, 14, jVar5, R.string.home_build_outputs_empty, jVar5), null, b3.l.a(jVar5).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar5).f26545h, jVar3, 196608, 0, 65498);
                    ff.b(pd.d.a(aVar2, 6, jVar3, R.string.home_build_outputs_empty_desc, jVar3), null, b3.l.a(jVar3).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, b3.l.b(jVar3).f26549l, jVar3, 0, 0, 65018);
                    jVar3.H();
                    jVar3.B();
                } else {
                    jVar5.L(-195359007);
                    b.i iVarH = z.b.h(f13);
                    z.g1 g1Var = new z.g1(f10, f11, f10, f11);
                    androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.g.h(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 480, 1);
                    jVar5.L(547897827);
                    boolean zK = jVar5.K(n1Var);
                    final SimpleDateFormat simpleDateFormat = this.f32880b;
                    boolean zL = zK | jVar5.l(simpleDateFormat);
                    final Context context = this.f32881c;
                    boolean zL2 = zL | jVar5.l(context);
                    final c.k<Intent, e.a> kVar2 = this.f32882d;
                    boolean zL3 = zL2 | jVar5.l(kVar2);
                    Object objG2 = jVar5.g();
                    if (zL3 || objG2 == c0321a) {
                        final x0.n1<File> n1Var2 = this.f32887j;
                        final x0.n1<File> n1Var3 = this.f32888k;
                        eh.l lVar = new eh.l() { // from class: x8.z7
                            @Override // eh.l
                            public final Object invoke(Object obj) {
                                b0.j0 LazyColumn = (b0.j0) obj;
                                kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                                List list = (List) n1Var.getValue();
                                LazyColumn.d(list.size(), new h8(new s5.j(1), list), new i8(g8.f32695a, list), new f1.b(-632812321, true, new j8(list, simpleDateFormat, context, kVar2, n1Var2, n1Var3)));
                                return pg.f0.f21461a;
                            }
                        };
                        jVar5.C(lVar);
                        objG2 = lVar;
                    }
                    jVar5.B();
                    jVar3 = jVar5;
                    b0.d.a(dVarH, null, g1Var, iVarH, null, null, false, null, (eh.l) objG2, jVar3, 24966, 490);
                    jVar3.B();
                }
                jVar3.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f32889a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1<List<File>> f32890b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f32891c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.n1<File> f32892d;

        public b(Context context, File file, x0.n1 n1Var, x0.n1 n1Var2) {
            this.f32889a = file;
            this.f32890b = n1Var;
            this.f32891c = context;
            this.f32892d = n1Var2;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(548281643);
                final File file = this.f32889a;
                boolean zL = jVar2.l(file);
                final x0.n1<List<File>> n1Var = this.f32890b;
                boolean zK = zL | jVar2.K(n1Var);
                final Context context = this.f32891c;
                boolean zL2 = zK | jVar2.l(context);
                Object objG = jVar2.g();
                if (zL2 || objG == j.a.f31715a) {
                    final x0.n1<File> n1Var2 = this.f32892d;
                    objG = new eh.a() { // from class: x8.l8
                        @Override // eh.a
                        public final Object invoke() {
                            boolean zDelete;
                            int i10;
                            File file2 = file;
                            try {
                                zDelete = file2.delete();
                            } catch (Exception unused) {
                                zDelete = false;
                            }
                            Context context2 = context;
                            if (zDelete) {
                                x0.n1 n1Var3 = n1Var;
                                List list = (List) n1Var3.getValue();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : list) {
                                    if (!kotlin.jvm.internal.r.a(((File) obj).getAbsolutePath(), file2.getAbsolutePath())) {
                                        arrayList.add(obj);
                                    }
                                }
                                n1Var3.setValue(arrayList);
                                i10 = R.string.output_deleted_success;
                            } else {
                                i10 = R.string.output_delete_failed;
                            }
                            org.bouncycastle.crypto.engines.a.b(context2, i10, context2, 0);
                            n1Var2.setValue(null);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, false, null, null, null, x8.d.f32466j, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<File> f32893a;

        public c(x0.n1<File> n1Var) {
            this.f32893a = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(548315318);
                Object objG = jVar2.g();
                if (objG == j.a.f31715a) {
                    objG = new f9.t(this.f32893a, 1);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, false, null, null, null, x8.d.f32467k, jVar2, 805306374, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f32894a;

        public d(File file) {
            this.f32894a = file;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.d(R.string.output_delete_message, new Object[]{this.f32894a.getName()}, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<List<File>> f32895a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f32896b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f32897c;

        public e(Context context, x0.n1 n1Var, x0.n1 n1Var2) {
            this.f32895a = n1Var;
            this.f32896b = context;
            this.f32897c = n1Var2;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(259266634);
                x0.n1<List<File>> n1Var = this.f32895a;
                boolean zK = jVar2.K(n1Var);
                Context context = this.f32896b;
                boolean zL = zK | jVar2.l(context);
                Object objG = jVar2.g();
                if (zL || objG == j.a.f31715a) {
                    objG = new androidx.credentials.playservices.g(context, n1Var, this.f32897c, 1);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, false, null, null, null, x8.d.f32469m, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f32898a;

        public f(x0.n1<Boolean> n1Var) {
            this.f32898a = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(259290463);
                Object objG = jVar2.g();
                if (objG == j.a.f31715a) {
                    objG = new f9.v(this.f32898a, 1);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, false, null, null, null, x8.d.f32470n, jVar2, 805306374, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<List<File>> f32899a;

        public g(x0.n1<List<File>> n1Var) {
            this.f32899a = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.d(R.string.output_delete_all_message, new Object[]{Integer.valueOf(this.f32899a.getValue().size())}, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return i0.x1.b(Long.valueOf(((File) t10).lastModified()), Long.valueOf(((File) t3).lastModified()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i10, final long j10, final eh.a onDismiss, final String projectName, x0.j jVar) {
        Object objU;
        final x0.n1 n1Var;
        x0.n1 n1Var2;
        x0.k kVar;
        x0.n1 n1Var3;
        kotlin.jvm.internal.r.e(projectName, "projectName");
        kotlin.jvm.internal.r.e(onDismiss, "onDismiss");
        x0.k kVarP = jVar.p(-735045923);
        int i11 = i10 | (kVarP.j(j10) ? 4 : 2) | (kVarP.K(projectName) ? 32 : 16) | (kVarP.l(onDismiss) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(833214810);
            boolean z10 = (i11 & 14) == 4;
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (z10 || objG == obj) {
                objG = new File(context.getFilesDir(), c2.u.a("projects/", "/outputs", j10));
                kVarP.C(objG);
            }
            File file = (File) objG;
            kVarP.T(false);
            kVarP.L(833218449);
            boolean zK = kVarP.K(file);
            Object objG2 = kVarP.g();
            if (zK || objG2 == obj) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : fileArrListFiles) {
                        if (file2.isFile()) {
                            arrayList.add(file2);
                        }
                    }
                    objU = qg.x.U(new h(), arrayList);
                } else {
                    objU = qg.z.f22752a;
                }
                objG2 = bg.b.h(objU);
                kVarP.C(objG2);
            }
            x0.n1 n1Var4 = (x0.n1) objG2;
            Object objA = p0.h.a(kVarP, false, 833224777);
            if (objA == obj) {
                objA = bg.b.h(null);
                kVarP.C(objA);
            }
            x0.n1 n1Var5 = (x0.n1) objA;
            Object objA2 = p0.h.a(kVarP, false, 833227075);
            if (objA2 == obj) {
                objA2 = bg.b.h(Boolean.FALSE);
                kVarP.C(objA2);
            }
            x0.n1 n1Var6 = (x0.n1) objA2;
            Object objA3 = p0.h.a(kVarP, false, 833229161);
            if (objA3 == obj) {
                objA3 = bg.b.h(null);
                kVarP.C(objA3);
            }
            x0.n1 n1Var7 = (x0.n1) objA3;
            Object objA4 = p0.h.a(kVarP, false, 833231207);
            if (objA4 == obj) {
                objA4 = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault());
                kVarP.C(objA4);
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objA4;
            kVarP.T(false);
            hb hbVarF = t0.p7.f(6, 2, kVarP);
            f.g gVar = new f.g();
            kVarP.L(833263101);
            boolean zL = kVarP.l(context);
            Object objG3 = kVarP.g();
            if (zL || objG3 == obj) {
                objG3 = new com.basitce.htmltoapk.data.local.dao.b(1, context, n1Var7);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            c.k kVarA = c.d.a(gVar, (eh.l) objG3, kVarP, 0);
            Object obj2 = (List) n1Var4.getValue();
            kVarP.L(833311970);
            boolean zK2 = kVarP.K(obj2);
            Object objG4 = kVarP.g();
            if (zK2 || objG4 == obj) {
                Iterator it = ((List) n1Var4.getValue()).iterator();
                long length = 0;
                while (it.hasNext()) {
                    length = ((File) it.next()).length() + length;
                }
                objG4 = Long.valueOf(length);
                kVarP.C(objG4);
            }
            long jLongValue = ((Number) objG4).longValue();
            kVarP.T(false);
            x0.e2 e2Var = t0.f2.f25858a;
            float f10 = 24;
            t0.p7.a(onDismiss, androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), hbVarF, CropImageView.DEFAULT_ASPECT_RATIO, h0.f.c(f10, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), ((t0.e2) kVarP.f(e2Var)).f25770p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, x8.d.f32457a, null, null, f1.c.b(-901951968, new a(n1Var4, simpleDateFormat, context, kVarA, onDismiss, projectName, jLongValue, n1Var6, n1Var7, n1Var5), kVarP), kVarP, ((i11 >> 6) & 14) | 805306416, 3528);
            x0.k kVar2 = kVarP;
            File file3 = (File) n1Var5.getValue();
            kVar2.L(833870630);
            if (file3 == null) {
                n1Var2 = n1Var4;
            } else {
                long j11 = ((t0.e2) kVar2.f(e2Var)).f25770p;
                kVar2.L(259175383);
                Object objG5 = kVar2.g();
                if (objG5 == obj) {
                    n1Var = n1Var5;
                    objG5 = new eh.a() { // from class: x8.x7
                        @Override // eh.a
                        public final Object invoke() {
                            n1Var.setValue(null);
                            return pg.f0.f21461a;
                        }
                    };
                    kVar2.C(objG5);
                } else {
                    n1Var = n1Var5;
                }
                kVar2.T(false);
                n1Var2 = n1Var4;
                t0.r.a((eh.a) objG5, f1.c.b(-553601272, new b(context, file3, n1Var4, n1Var), kVar2), null, f1.c.b(-66527546, new c(n1Var), kVar2), null, x8.d.f32468l, f1.c.b(664083043, new d(file3), kVar2), null, j11, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar2, 1772598, 0, 16020);
                kVar2 = kVar2;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kVar2.T(false);
            if (((Boolean) n1Var6.getValue()).booleanValue()) {
                long j12 = ((t0.e2) kVar2.f(e2Var)).f25770p;
                kVar2.L(833939264);
                Object objG6 = kVar2.g();
                if (objG6 == obj) {
                    n1Var3 = n1Var6;
                    objG6 = new i9.f(n1Var3, 1);
                    kVar2.C(objG6);
                } else {
                    n1Var3 = n1Var6;
                }
                kVar2.T(false);
                x0.n1 n1Var8 = n1Var2;
                kVar = kVar2;
                t0.r.a((eh.a) objG6, f1.c.b(-1671577686, new e(context, n1Var8, n1Var3), kVar2), null, f1.c.b(-224996820, new f(n1Var3), kVar2), null, x8.d.f32471o, f1.c.b(1944874479, new g(n1Var8), kVar2), null, j12, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, 1772598, 0, 16020);
            } else {
                kVar = kVar2;
            }
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, j10, onDismiss, projectName) { // from class: x8.y7

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f33422a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f33423b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f33424c;

                {
                    this.f33422a = j10;
                    this.f33423b = projectName;
                    this.f33424c = onDismiss;
                }

                @Override // eh.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    k8.a(f3.i.n(1), this.f33422a, this.f33424c, this.f33423b, (x0.j) obj3);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(Context context, File file) {
        try {
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
            kotlin.jvm.internal.r.d(uriForFile, "getUriForFile(...)");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            intent.addFlags(1);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            Toast.makeText(context, context.getString(R.string.output_error_install, message), 1).show();
        }
    }

    public static final String c(long j10) {
        if (j10 >= 1048576) {
            return String.format("%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(j10 / 1048576.0d)}, 1));
        }
        if (j10 >= 1024) {
            return String.format("%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(j10 / 1024.0d)}, 1));
        }
        return j10 + " B";
    }
}
