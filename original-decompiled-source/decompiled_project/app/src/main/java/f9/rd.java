package f9;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import b9.e3;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectFile;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.domain.model.WebViewSettings;
import com.basitce.htmltoapk.domain.model.WebViewSettingsKt;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import com.yalantis.ucrop.view.CropImageView;
import f9.fg;
import f9.rd;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l9.f0;
import l9.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;
import s8.e2;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class rd implements eh.q<z.i, x0.j, Integer, pg.f0> {
    public final /* synthetic */ eh.l<Uri, pg.f0> A;
    public final /* synthetic */ x0.r3<Boolean> A0;
    public final /* synthetic */ c.k<String, Uri> B;
    public final /* synthetic */ x0.r3<Boolean> B0;
    public final /* synthetic */ x0.r3<String> C;
    public final /* synthetic */ x0.r3<String> C0;
    public final /* synthetic */ x0.r3<Boolean> D;
    public final /* synthetic */ x0.r3<Boolean> D0;
    public final /* synthetic */ x0.r3<String> E;
    public final /* synthetic */ x0.r3<String> E0;
    public final /* synthetic */ x0.r3<String> F;
    public final /* synthetic */ x0.r3<String> F0;
    public final /* synthetic */ x0.r3<String> G;
    public final /* synthetic */ x0.r3<Boolean> G0;
    public final /* synthetic */ x0.r3<Boolean> H;
    public final /* synthetic */ x0.r3<String> H0;
    public final /* synthetic */ x0.r3<String> I;
    public final /* synthetic */ x0.r3<Boolean> I0;
    public final /* synthetic */ x0.n1<Boolean> J0;
    public final /* synthetic */ x0.r3<String> K;
    public final /* synthetic */ x0.r3<Long> K0;
    public final /* synthetic */ x0.r3<String> L;
    public final /* synthetic */ x0.r3<List<KeystoreEntity>> L0;
    public final /* synthetic */ x0.r3<String> M;
    public final /* synthetic */ x0.r3<Boolean> N;
    public final /* synthetic */ x0.r3<List<ProjectFile>> O;
    public final /* synthetic */ x0.r3<p0.b> P;
    public final /* synthetic */ x0.r3<Boolean> Q;
    public final /* synthetic */ x0.r3<f0.b> R;
    public final /* synthetic */ x0.r3<String> S;
    public final /* synthetic */ x0.r3<Boolean> T;
    public final /* synthetic */ x0.r3<Boolean> U;
    public final /* synthetic */ x0.r3<Boolean> V;
    public final /* synthetic */ x0.r3<Boolean> W;
    public final /* synthetic */ x0.r3<Boolean> X;
    public final /* synthetic */ x0.r3<Boolean> Y;
    public final /* synthetic */ x0.r3<Uri> Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f1 f10383a;

    /* renamed from: a0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10384a0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<String> f10385b;

    /* renamed from: b0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f10386b0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f10387c;

    /* renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f10388c0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg f10389d;

    /* renamed from: d0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10390d0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10391e;

    /* renamed from: e0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Uri> f10392e0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c.k<String, Uri> f10393f;

    /* renamed from: f0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10394f0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f10395g;

    /* renamed from: g0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f10396g0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c.k<String, Uri> f10397h;

    /* renamed from: h0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10398h0;

    /* renamed from: i0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Integer> f10399i0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f10400j;

    /* renamed from: j0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Integer> f10401j0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p5.x f10402k;

    /* renamed from: k0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Integer> f10403k0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10404l;

    /* renamed from: l0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Integer> f10405l0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Uri> f10406m;

    /* renamed from: m0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Integer> f10407m0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10408n;

    /* renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Integer> f10409n0;

    /* renamed from: o0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Integer> f10410o0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10411p;

    /* renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10412p0;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x0.r3<WebViewSettings> f10413q;

    /* renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f10414q0;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10415r;

    /* renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f10416r0;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10417s;

    /* renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f10418s0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Uri> f10419t;

    /* renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f10420t0;

    /* renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f10421u0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10422v;

    /* renamed from: v0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10423v0;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c.k<Uri, Uri> f10424w;

    /* renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10425w0;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x0.r3<List<String>> f10426x;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f10427x0;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c.k<String, Uri> f10428y;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10429y0;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f10430z;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f10431z0;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorScreenKt$ProjectEditorScreen$4$1$1$1$34$1", f = "ProjectEditorScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fg f10432a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.r3<String> f10433b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fg fgVar, x0.r3<String> r3Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f10432a = fgVar;
            this.f10433b = r3Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f10432a, this.f10433b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            if (!kotlin.jvm.internal.r.a(this.f10433b.getValue(), "url")) {
                fg fgVar = this.f10432a;
                ph.l2 l2Var = fgVar.f9567h0;
                if (l2Var != null) {
                    l2Var.cancel((CancellationException) null);
                }
                l5.a aVarA = androidx.lifecycle.x0.a(fgVar);
                wh.c cVar = ph.z0.f21632a;
                fgVar.f9567h0 = ph.h.c(aVarA, wh.b.f31563c, null, new jh(fgVar, null), 2);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorScreenKt$ProjectEditorScreen$4$1$1$1$38$1$1$1", f = "ProjectEditorScreen.kt", l = {568}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10434a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<Uri, pg.f0> f10435b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f10436c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f10437d;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorScreenKt$ProjectEditorScreen$4$1$1$1$38$1$1$1$cover$1", f = "ProjectEditorScreen.kt", l = {}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super File>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f10438a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f10439b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f10440c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, String str, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f10439b = context;
                this.f10440c = str;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                a aVar = new a(this.f10439b, this.f10440c, eVar);
                aVar.f10438a = obj;
                return aVar;
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super File> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                Object objA;
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                try {
                    objA = l9.e0.b(this.f10439b, new File(this.f10440c));
                } catch (Throwable th2) {
                    objA = pg.q.a(th2);
                }
                if (objA instanceof p.a) {
                    return null;
                }
                return objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(eh.l<? super Uri, pg.f0> lVar, Context context, String str, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f10435b = lVar;
            this.f10436c = context;
            this.f10437d = str;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f10435b, this.f10436c, this.f10437d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f10434a;
            Context context = this.f10436c;
            if (i10 == 0) {
                pg.q.b(obj);
                wh.c cVar = ph.z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                a aVar2 = new a(context, this.f10437d, null);
                this.f10434a = 1;
                obj = ph.h.e(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            File file = (File) obj;
            if (file != null) {
                Uri uriFromFile = Uri.fromFile(file);
                kotlin.jvm.internal.r.d(uriFromFile, "fromFile(...)");
                this.f10435b.invoke(uriFromFile);
            } else {
                Toast.makeText(context, R.string.pdf_cover_failed, 0).show();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fg f10441a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.r3<WebViewSettings> f10442b;

        public c(fg fgVar, x0.r3<WebViewSettings> r3Var) {
            this.f10441a = fgVar;
            this.f10442b = r3Var;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r EditorCard = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(EditorCard, "$this$EditorCard");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                WebViewSettings value = this.f10442b.getValue();
                jVar2.L(-261530696);
                fg fgVar = this.f10441a;
                boolean zL = jVar2.l(fgVar);
                Object objG = jVar2.g();
                if (zL || objG == j.a.f31715a) {
                    objG = new sd(fgVar, 0);
                    jVar2.C(objG);
                }
                jVar2.B();
                h5.b(value, (eh.l) objG, jVar2, 0);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fg f10443a;

        public d(fg fgVar) {
            this.f10443a = fgVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                b8.c(this.f10443a, jVar2, 0);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorScreenKt$ProjectEditorScreen$4$1$1$1$80$1$1", f = "ProjectEditorScreen.kt", l = {720}, m = "invokeSuspend")
    public static final class e extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10444a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fg f10445b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p5.x f10446c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f10447d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(fg fgVar, p5.x xVar, Context context, tg.e<? super e> eVar) {
            super(2, eVar);
            this.f10445b = fgVar;
            this.f10446c = xVar;
            this.f10447d = context;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new e(this.f10445b, this.f10446c, this.f10447d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws IOException {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f10444a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f10444a = 1;
                obj = this.f10445b.D(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            long jLongValue = ((Number) obj).longValue();
            if (jLongValue != 0) {
                e2.e.f24635c.getClass();
                p5.x.c("build_progress/" + jLongValue, this.f10446c);
            } else {
                Context context = this.f10447d;
                org.bouncycastle.crypto.engines.a.b(context, R.string.editor_save_failed, context, 0);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rd(z.f1 f1Var, List<String> list, x0.l1 l1Var, fg fgVar, x0.r3<String> r3Var, c.k<String, Uri> kVar, Context context, c.k<String, Uri> kVar2, long j10, p5.x xVar, x0.r3<String> r3Var2, x0.r3<? extends Uri> r3Var3, x0.r3<String> r3Var4, x0.r3<String> r3Var5, x0.r3<WebViewSettings> r3Var6, x0.r3<String> r3Var7, x0.r3<String> r3Var8, x0.r3<? extends Uri> r3Var9, x0.r3<String> r3Var10, c.k<Uri, Uri> kVar3, x0.r3<? extends List<String>> r3Var11, c.k<String, Uri> kVar4, ph.i0 i0Var, eh.l<? super Uri, pg.f0> lVar, c.k<String, Uri> kVar5, x0.r3<String> r3Var12, x0.r3<Boolean> r3Var13, x0.r3<String> r3Var14, x0.r3<String> r3Var15, x0.r3<String> r3Var16, x0.r3<Boolean> r3Var17, x0.r3<String> r3Var18, x0.r3<String> r3Var19, x0.r3<String> r3Var20, x0.r3<String> r3Var21, x0.r3<Boolean> r3Var22, x0.r3<? extends List<ProjectFile>> r3Var23, x0.r3<p0.b> r3Var24, x0.r3<Boolean> r3Var25, x0.r3<f0.b> r3Var26, x0.r3<String> r3Var27, x0.r3<Boolean> r3Var28, x0.r3<Boolean> r3Var29, x0.r3<Boolean> r3Var30, x0.r3<Boolean> r3Var31, x0.r3<Boolean> r3Var32, x0.r3<Boolean> r3Var33, x0.r3<? extends Uri> r3Var34, x0.r3<String> r3Var35, x0.r3<Boolean> r3Var36, x0.r3<Boolean> r3Var37, x0.r3<String> r3Var38, x0.r3<? extends Uri> r3Var39, x0.r3<String> r3Var40, x0.r3<Boolean> r3Var41, x0.r3<String> r3Var42, x0.r3<Integer> r3Var43, x0.r3<Integer> r3Var44, x0.r3<Integer> r3Var45, x0.r3<Integer> r3Var46, x0.r3<Integer> r3Var47, x0.r3<Integer> r3Var48, x0.r3<Integer> r3Var49, x0.r3<String> r3Var50, x0.r3<Boolean> r3Var51, x0.r3<Boolean> r3Var52, x0.r3<Boolean> r3Var53, x0.r3<Boolean> r3Var54, x0.r3<Boolean> r3Var55, x0.r3<String> r3Var56, x0.r3<String> r3Var57, x0.r3<Boolean> r3Var58, x0.r3<String> r3Var59, x0.r3<String> r3Var60, x0.r3<Boolean> r3Var61, x0.r3<Boolean> r3Var62, x0.r3<String> r3Var63, x0.r3<Boolean> r3Var64, x0.r3<String> r3Var65, x0.r3<String> r3Var66, x0.r3<Boolean> r3Var67, x0.r3<String> r3Var68, x0.r3<Boolean> r3Var69, x0.n1<Boolean> n1Var, x0.r3<Long> r3Var70, x0.r3<? extends List<KeystoreEntity>> r3Var71) {
        this.f10383a = f1Var;
        this.f10385b = list;
        this.f10387c = l1Var;
        this.f10389d = fgVar;
        this.f10391e = r3Var;
        this.f10393f = kVar;
        this.f10395g = context;
        this.f10397h = kVar2;
        this.f10400j = j10;
        this.f10402k = xVar;
        this.f10404l = r3Var2;
        this.f10406m = r3Var3;
        this.f10408n = r3Var4;
        this.f10411p = r3Var5;
        this.f10413q = r3Var6;
        this.f10415r = r3Var7;
        this.f10417s = r3Var8;
        this.f10419t = r3Var9;
        this.f10422v = r3Var10;
        this.f10424w = kVar3;
        this.f10426x = r3Var11;
        this.f10428y = kVar4;
        this.f10430z = i0Var;
        this.A = lVar;
        this.B = kVar5;
        this.C = r3Var12;
        this.D = r3Var13;
        this.E = r3Var14;
        this.F = r3Var15;
        this.G = r3Var16;
        this.H = r3Var17;
        this.I = r3Var18;
        this.K = r3Var19;
        this.L = r3Var20;
        this.M = r3Var21;
        this.N = r3Var22;
        this.O = r3Var23;
        this.P = r3Var24;
        this.Q = r3Var25;
        this.R = r3Var26;
        this.S = r3Var27;
        this.T = r3Var28;
        this.U = r3Var29;
        this.V = r3Var30;
        this.W = r3Var31;
        this.X = r3Var32;
        this.Y = r3Var33;
        this.Z = r3Var34;
        this.f10384a0 = r3Var35;
        this.f10386b0 = r3Var36;
        this.f10388c0 = r3Var37;
        this.f10390d0 = r3Var38;
        this.f10392e0 = r3Var39;
        this.f10394f0 = r3Var40;
        this.f10396g0 = r3Var41;
        this.f10398h0 = r3Var42;
        this.f10399i0 = r3Var43;
        this.f10401j0 = r3Var44;
        this.f10403k0 = r3Var45;
        this.f10405l0 = r3Var46;
        this.f10407m0 = r3Var47;
        this.f10409n0 = r3Var48;
        this.f10410o0 = r3Var49;
        this.f10412p0 = r3Var50;
        this.f10414q0 = r3Var51;
        this.f10416r0 = r3Var52;
        this.f10418s0 = r3Var53;
        this.f10420t0 = r3Var54;
        this.f10421u0 = r3Var55;
        this.f10423v0 = r3Var56;
        this.f10425w0 = r3Var57;
        this.f10427x0 = r3Var58;
        this.f10429y0 = r3Var59;
        this.f10431z0 = r3Var60;
        this.A0 = r3Var61;
        this.B0 = r3Var62;
        this.C0 = r3Var63;
        this.D0 = r3Var64;
        this.E0 = r3Var65;
        this.F0 = r3Var66;
        this.G0 = r3Var67;
        this.H0 = r3Var68;
        this.I0 = r3Var69;
        this.J0 = n1Var;
        this.K0 = r3Var70;
        this.L0 = r3Var71;
    }

    public static final Map c(x0.n1 n1Var) {
        return (Map) n1Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0dbc  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x1189  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x11a9  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x11d1  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x11f0  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x11f9  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x120a  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x1213  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x124c  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x1278  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x129b  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x131b  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x136a  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x138c  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x13ad  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x13e0  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x1477  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x1490  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x14a0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0447  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(z.i BackgroundBox, x0.j jVar, int i10) throws Throwable {
        x0.l1 l1Var;
        x0.n1<Boolean> n1Var;
        Context context;
        float f10;
        List<String> list;
        d.a aVar;
        Throwable th2;
        Object obj;
        boolean zL;
        Object objG;
        eh.l lVar;
        String str;
        String str2;
        fg fgVar;
        Object obj2;
        boolean z10;
        x0.j jVar2;
        Object obj3;
        boolean zL2;
        Object objG2;
        boolean zL3;
        Object objG3;
        boolean zL4;
        Object objG4;
        final x0.r3<Uri> r3Var;
        final c.k<String, Uri> kVar;
        final c.k<String, Uri> kVar2;
        boolean zL5;
        Object objG5;
        final long j10;
        boolean zJ;
        Object objG6;
        boolean zL6;
        Object objG7;
        final fg fgVar2;
        Context context2;
        Object obj4;
        boolean zL7;
        Object objG8;
        boolean zL8;
        Object objG9;
        boolean zL9;
        Object objG10;
        boolean zL10;
        Object objG11;
        boolean z11;
        boolean z12;
        String str3;
        Throwable th3;
        Object obj5;
        eh.a aVar2;
        boolean z13;
        int i11;
        int i12;
        int i13;
        int i14;
        Context context3;
        Context context4;
        Object obj6;
        eh.l lVar2;
        String str4;
        boolean z14;
        boolean z15;
        String str5;
        String str6;
        String str7;
        String strD;
        int size;
        String strB;
        int iEnabledCount;
        int i15;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i16;
        boolean z16;
        boolean zK;
        Object objG12;
        final Context context5;
        p5.x xVar;
        fg fgVar3;
        boolean z17;
        x0.l1 l1Var2;
        x0.j jVar3;
        float f11;
        kotlin.jvm.internal.r.e(BackgroundBox, "$this$BackgroundBox");
        if ((i10 & 17) == 16 && jVar.s()) {
            jVar.v();
            return;
        }
        d.a aVar3 = d.a.f1143b;
        androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.f.g(androidx.compose.foundation.layout.g.c(aVar3), this.f10383a), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
        b.k kVar3 = z.b.f34446c;
        f.a aVar4 = d.a.f14614m;
        z.q qVarA = z.o.a(kVar3, aVar4, jVar, 0);
        int iC = c9.u1.c(jVar);
        x0.a2 a2VarY = jVar.y();
        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar);
        i2.g.f13861o.getClass();
        e0.a aVarA = g.a.a();
        if (jVar.t() == null) {
            c9.u1.d();
            throw null;
        }
        jVar.r();
        if (jVar.m()) {
            jVar.w(aVarA);
        } else {
            jVar.z();
        }
        ph.v1.j(g.a.c(), qVarA, jVar);
        ph.v1.j(g.a.e(), a2VarY, jVar);
        g.a.C0128a c0128aB = g.a.b();
        if (jVar.m() || !kotlin.jvm.internal.r.a(jVar.g(), Integer.valueOf(iC))) {
            l9.i.a(iC, jVar, iC, c0128aB);
        }
        ph.v1.j(g.a.d(), dVarC, jVar);
        final x0.l1 l1Var3 = this.f10387c;
        int iX = b8.X(l1Var3);
        List<String> list2 = this.f10385b;
        b8.C(list2, iX, jVar, 0);
        float f12 = 12;
        p1.d.b(androidx.compose.foundation.layout.g.f(aVar3, f12), jVar);
        androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar3, 1.0f);
        if (1.0f <= 0.0d) {
            a0.a.a("invalid weight; must be greater than zero");
        }
        androidx.compose.ui.d dVarC2 = d0.h.c(d0.h.e(ph.m0.g(dVarD.h(new LayoutWeightElement(1.0f, true)), ph.m0.c(jVar))));
        z.q qVarA2 = z.o.a(z.b.h(f12), aVar4, jVar, 6);
        int iC2 = c9.u1.c(jVar);
        x0.a2 a2VarY2 = jVar.y();
        androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarC2, jVar);
        e0.a aVarA2 = g.a.a();
        if (jVar.t() == null) {
            c9.u1.d();
            throw null;
        }
        jVar.r();
        if (jVar.m()) {
            jVar.w(aVarA2);
        } else {
            jVar.z();
        }
        ph.v1.j(g.a.c(), qVarA2, jVar);
        ph.v1.j(g.a.e(), a2VarY2, jVar);
        g.a.C0128a c0128aB2 = g.a.b();
        if (jVar.m() || !kotlin.jvm.internal.r.a(jVar.g(), Integer.valueOf(iC2))) {
            l9.i.a(iC2, jVar, iC2, c0128aB2);
        }
        ph.v1.j(g.a.d(), dVarC3, jVar);
        int iX2 = b8.X(l1Var3);
        Object obj7 = j.a.f31715a;
        final fg fgVar4 = this.f10389d;
        final x0.r3<String> r3Var2 = this.f10391e;
        final Context context6 = this.f10395g;
        final p5.x xVar2 = this.f10402k;
        final x0.r3<String> r3Var3 = this.f10404l;
        final x0.r3<Uri> r3Var4 = this.f10406m;
        final x0.r3<String> r3Var5 = this.f10408n;
        final x0.r3<String> r3Var6 = this.f10411p;
        final x0.r3<WebViewSettings> r3Var7 = this.f10413q;
        final x0.r3<String> r3Var8 = this.f10415r;
        final x0.r3<String> r3Var9 = this.f10417s;
        final x0.r3<String> r3Var10 = this.f10422v;
        final x0.r3<List<String>> r3Var11 = this.f10426x;
        final ph.i0 i0Var = this.f10430z;
        final x0.r3<Boolean> r3Var12 = this.D;
        x0.r3<String> r3Var13 = this.E;
        x0.r3<String> r3Var14 = this.F;
        x0.r3<String> r3Var15 = this.G;
        x0.r3<String> r3Var16 = this.S;
        x0.r3<Boolean> r3Var17 = this.T;
        x0.r3<Boolean> r3Var18 = this.U;
        x0.r3<Boolean> r3Var19 = this.V;
        x0.r3<Uri> r3Var20 = this.Z;
        x0.r3<String> r3Var21 = this.f10384a0;
        x0.r3<String> r3Var22 = this.f10390d0;
        x0.r3<Boolean> r3Var23 = this.f10420t0;
        x0.r3<Boolean> r3Var24 = this.f10421u0;
        x0.r3<String> r3Var25 = this.f10423v0;
        x0.r3<Boolean> r3Var26 = this.f10427x0;
        x0.r3<String> r3Var27 = this.f10429y0;
        x0.r3<Boolean> r3Var28 = this.B0;
        x0.r3<String> r3Var29 = this.C0;
        x0.r3<Boolean> r3Var30 = this.G0;
        x0.r3<String> r3Var31 = this.H0;
        x0.n1<Boolean> n1Var2 = this.J0;
        switch (iX2) {
            case 0:
                l1Var = l1Var3;
                n1Var = n1Var2;
                context = context6;
                f10 = f12;
                list = list2;
                aVar = aVar3;
                th2 = null;
                jVar.L(-1207960996);
                String value = r3Var3.getValue();
                jVar.L(-1207959823);
                boolean zL11 = jVar.l(fgVar4);
                Object objG13 = jVar.g();
                if (zL11) {
                    obj = obj7;
                } else {
                    obj = obj7;
                    if (objG13 == obj) {
                    }
                    eh.l lVar3 = (eh.l) objG13;
                    jVar.B();
                    String value2 = r3Var13.getValue();
                    jVar.L(-1207956267);
                    zL = jVar.l(fgVar4);
                    objG = jVar.g();
                    if (!zL || objG == obj) {
                        objG = new eh.l() { // from class: f9.mb
                            @Override // eh.l
                            public final Object invoke(Object obj8) {
                                String it = (String) obj8;
                                kotlin.jvm.internal.r.e(it, "it");
                                sh.z0 z0Var = fgVar4.f9588s;
                                z0Var.getClass();
                                z0Var.j(null, it);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar.C(objG);
                    }
                    eh.l lVar4 = (eh.l) objG;
                    jVar.B();
                    if (mh.x.A(r3Var13.getValue())) {
                        mh.k kVar4 = fg.X0;
                        boolean z18 = !fg.f.b(r3Var13.getValue());
                        String value3 = r3Var14.getValue();
                        jVar.L(-1207948299);
                        boolean zL12 = jVar.l(fgVar4);
                        Object objG14 = jVar.g();
                        if (zL12 || objG14 == obj) {
                            objG14 = new vb(fgVar4, 0);
                            jVar.C(objG14);
                        }
                        eh.l lVar5 = (eh.l) objG14;
                        jVar.B();
                        String value4 = r3Var15.getValue();
                        jVar.L(-1207944619);
                        boolean zL13 = jVar.l(fgVar4);
                        Object objG15 = jVar.g();
                        if (zL13 || objG15 == obj) {
                            objG15 = new dc(fgVar4, 0);
                            jVar.C(objG15);
                        }
                        eh.l lVar6 = (eh.l) objG15;
                        jVar.B();
                        boolean zW0 = b8.w0(this.H);
                        jVar.L(-1207938782);
                        boolean zL14 = jVar.l(fgVar4);
                        Object objG16 = jVar.g();
                        if (zL14 || objG16 == obj) {
                            objG16 = new a9.g(fgVar4, 1);
                            jVar.C(objG16);
                        }
                        eh.l lVar7 = (eh.l) objG16;
                        jVar.B();
                        String strR = b8.R(this.I);
                        jVar.L(-1207935184);
                        boolean zL15 = jVar.l(fgVar4);
                        Object objG17 = jVar.g();
                        if (zL15 || objG17 == obj) {
                            lVar = lVar3;
                            objG17 = new wc(fgVar4, 0);
                            jVar.C(objG17);
                        } else {
                            lVar = lVar3;
                        }
                        eh.l lVar8 = (eh.l) objG17;
                        jVar.B();
                        String strS = b8.S(this.K);
                        jVar.L(-1207931853);
                        boolean zL16 = jVar.l(fgVar4);
                        Object objG18 = jVar.g();
                        if (zL16 || objG18 == obj) {
                            str = strS;
                            objG18 = new fd(fgVar4, 0);
                            jVar.C(objG18);
                        } else {
                            str = strS;
                        }
                        eh.l lVar9 = (eh.l) objG18;
                        jVar.B();
                        String strT = b8.T(this.L);
                        jVar.L(-1207928720);
                        boolean zL17 = jVar.l(fgVar4);
                        Object objG19 = jVar.g();
                        if (zL17 || objG19 == obj) {
                            str2 = strT;
                            objG19 = new c9.k1(fgVar4, 1);
                            jVar.C(objG19);
                        } else {
                            str2 = strT;
                        }
                        eh.l lVar10 = (eh.l) objG19;
                        jVar.B();
                        String strX0 = b8.x0(this.M);
                        jVar.L(-1207924008);
                        boolean zL18 = jVar.l(fgVar4);
                        Object objG20 = jVar.g();
                        if (zL18 || objG20 == obj) {
                            objG20 = new eh.l() { // from class: f9.nd
                                @Override // eh.l
                                public final Object invoke(Object obj8) {
                                    String it = (String) obj8;
                                    kotlin.jvm.internal.r.e(it, "it");
                                    sh.z0 z0Var = fgVar4.f9601y0;
                                    z0Var.getClass();
                                    z0Var.j(null, it);
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar.C(objG20);
                        }
                        jVar.B();
                        fgVar = fgVar4;
                        obj2 = obj;
                        z10 = false;
                        b8.n(value, lVar, value2, lVar4, z18, value3, lVar5, value4, lVar6, zW0, lVar7, strR, lVar8, str, lVar9, str2, lVar10, strX0, (eh.l) objG20, jVar, 0);
                        jVar2 = jVar;
                        jVar2.B();
                        pg.f0 f0Var = pg.f0.f21461a;
                        break;
                    }
                }
                objG13 = new lb(fgVar4, 0);
                jVar.C(objG13);
                eh.l lVar32 = (eh.l) objG13;
                jVar.B();
                String value22 = r3Var13.getValue();
                jVar.L(-1207956267);
                zL = jVar.l(fgVar4);
                objG = jVar.g();
                if (!zL) {
                    objG = new eh.l() { // from class: f9.mb
                        @Override // eh.l
                        public final Object invoke(Object obj8) {
                            String it = (String) obj8;
                            kotlin.jvm.internal.r.e(it, "it");
                            sh.z0 z0Var = fgVar4.f9588s;
                            z0Var.getClass();
                            z0Var.j(null, it);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG);
                    eh.l lVar42 = (eh.l) objG;
                    jVar.B();
                    if (mh.x.A(r3Var13.getValue())) {
                    }
                }
            case 1:
                l1Var = l1Var3;
                n1Var = n1Var2;
                f10 = f12;
                list = list2;
                aVar = aVar3;
                th2 = null;
                jVar.L(-1207913492);
                String strU = b8.U(r3Var2);
                jVar.L(-1207916376);
                boolean zL19 = jVar.l(fgVar4);
                Object objG21 = jVar.g();
                if (!zL19) {
                    obj3 = obj7;
                    if (objG21 == obj3) {
                    }
                    eh.l lVar11 = (eh.l) objG21;
                    jVar.B();
                    String value5 = r3Var9.getValue();
                    jVar.L(-1207900493);
                    zL2 = jVar.l(fgVar4);
                    objG2 = jVar.g();
                    if (!zL2 || objG2 == obj3) {
                        objG2 = new androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.t(fgVar4, 1);
                        jVar.C(objG2);
                    }
                    eh.l lVar12 = (eh.l) objG2;
                    jVar.B();
                    jVar.L(-1207897409);
                    zL3 = jVar.l(fgVar4);
                    objG3 = jVar.g();
                    if (!zL3 || objG3 == obj3) {
                        objG3 = new c9.h(fgVar4, 1);
                        jVar.C(objG3);
                    }
                    eh.l lVar13 = (eh.l) objG3;
                    jVar.B();
                    String value6 = r3Var8.getValue();
                    jVar.L(-1207886958);
                    zL4 = jVar.l(fgVar4);
                    objG4 = jVar.g();
                    if (!zL4 || objG4 == obj3) {
                        objG4 = new eh.l() { // from class: f9.jc
                            @Override // eh.l
                            public final Object invoke(Object obj8) {
                                String it = (String) obj8;
                                kotlin.jvm.internal.r.e(it, "it");
                                if (mh.t.p(it, "```", false) || mh.t.p(it, "'''", false) || mh.t.p(it, "\"\"\"", false)) {
                                    Set<String> set = l9.w.f16906a;
                                    it = l9.w.a(it);
                                }
                                fg fgVar5 = fgVar4;
                                fgVar5.B.setValue(it);
                                ph.l2 l2Var = fgVar5.f9569i0;
                                if (l2Var != null) {
                                    l2Var.cancel((CancellationException) null);
                                }
                                if (kotlin.jvm.internal.r.a(fgVar5.f9600y.getValue(), "paste")) {
                                    fgVar5.f9569i0 = ph.h.c(androidx.lifecycle.x0.a(fgVar5), null, null, new pg(fgVar5, it, null), 3);
                                }
                                return pg.f0.f21461a;
                            }
                        };
                        jVar.C(objG4);
                    }
                    eh.l lVar14 = (eh.l) objG4;
                    jVar.B();
                    boolean zA = kotlin.jvm.internal.r.a(b8.U(r3Var2), ProjectKind.PDF);
                    r3Var = this.f10419t;
                    Uri value7 = !zA ? r3Var4.getValue() : r3Var.getValue();
                    String value8 = !kotlin.jvm.internal.r.a(b8.U(r3Var2), ProjectKind.PDF) ? r3Var6.getValue() : r3Var10.getValue();
                    jVar.L(-1207877550);
                    boolean zK2 = jVar.K(r3Var2);
                    kVar = this.f10393f;
                    boolean zL20 = zK2 | jVar.l(kVar) | jVar.l(context6);
                    kVar2 = this.f10397h;
                    zL5 = zL20 | jVar.l(kVar2);
                    objG5 = jVar.g();
                    if (!zL5 || objG5 == obj3) {
                        objG5 = new eh.a() { // from class: f9.sc
                            @Override // eh.a
                            public final Object invoke() {
                                String str13;
                                c.k kVar5;
                                boolean zA2 = kotlin.jvm.internal.r.a((String) r3Var2.getValue(), ProjectKind.PDF);
                                Context context7 = context6;
                                if (zA2) {
                                    str13 = "application/pdf";
                                    kVar5 = kVar;
                                } else {
                                    str13 = "*/*";
                                    kVar5 = kVar2;
                                }
                                hf.a.a(kVar5, context7, str13, R.string.launch_no_app);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar.C(objG5);
                    }
                    eh.a aVar5 = (eh.a) objG5;
                    jVar.B();
                    boolean z19 = kotlin.jvm.internal.r.a(b8.U(r3Var2), ProjectKind.PDF) && (r3Var.getValue() != null || kotlin.jvm.internal.r.a(b8.U(r3Var2), "paste"));
                    jVar.L(-1207865776);
                    boolean zL21 = jVar.l(fgVar4);
                    j10 = this.f10400j;
                    zJ = zL21 | jVar.j(j10) | jVar.l(xVar2);
                    boolean z20 = z19;
                    objG6 = jVar.g();
                    if (!zJ || objG6 == obj3) {
                        objG6 = new eh.a() { // from class: f9.ad
                            @Override // eh.a
                            public final Object invoke() throws IOException {
                                fg fgVar5 = fgVar4;
                                fgVar5.v();
                                ProjectEntity projectEntity = (ProjectEntity) fgVar5.f9568i.getValue();
                                p5.x.c(e2.l.f24642c.a(projectEntity != null ? projectEntity.getId() : j10), xVar2);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar.C(objG6);
                    }
                    eh.a aVar6 = (eh.a) objG6;
                    jVar.B();
                    jVar.L(-1207848884);
                    zL6 = jVar.l(fgVar4) | jVar.j(j10) | jVar.K(r3Var3) | jVar.l(context6) | jVar.K(r3Var2) | jVar.K(r3Var4) | jVar.K(r3Var5) | jVar.K(r3Var6) | jVar.K(r3Var7) | jVar.K(r3Var8) | jVar.l(xVar2) | jVar.K(r3Var9) | jVar.K(r3Var) | jVar.K(r3Var10);
                    objG7 = jVar.g();
                    if (!zL6 || objG7 == obj3) {
                        objG7 = new eh.a() { // from class: f9.id
                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                            @Override // eh.a
                            public final Object invoke() {
                                Uri uri;
                                Object objA;
                                Uri uri2;
                                x0.r3 r3Var32 = r3Var5;
                                fg fgVar5 = fgVar4;
                                ProjectEntity projectEntity = (ProjectEntity) fgVar5.f9568i.getValue();
                                long id2 = projectEntity != null ? projectEntity.getId() : j10;
                                x0.r3 r3Var33 = r3Var3;
                                String string = (String) r3Var33.getValue();
                                boolean zA2 = mh.x.A(string);
                                Context context7 = context6;
                                if (zA2) {
                                    string = context7.getString(R.string.preview_title);
                                    kotlin.jvm.internal.r.d(string, "getString(...)");
                                }
                                String str13 = string;
                                String str14 = (String) r3Var2.getValue();
                                int iHashCode = str14.hashCode();
                                p5.x xVar3 = xVar2;
                                x0.r3 r3Var34 = r3Var7;
                                x0.r3 r3Var35 = r3Var;
                                switch (iHashCode) {
                                    case -1268966290:
                                        if (str14.equals("folder")) {
                                            b9.e3.f3796a = new e3.a(str13, e3.b.f3814d, null, null, (Uri) r3Var35.getValue(), new File(fgVar5.w(id2), "content"), null, null, ((WebViewSettings) r3Var34.getValue()).getColorMode(), WebViewSettingsKt.webViewMixedContentMode((WebViewSettings) r3Var34.getValue()), false, null, 13260);
                                            p5.x.c(e2.t.f24650c.f24627a, xVar3);
                                            break;
                                        }
                                        break;
                                    case 110834:
                                        if (str14.equals(ProjectKind.PDF) && (uri = (Uri) r3Var4.getValue()) != null) {
                                            try {
                                                objA = Integer.valueOf(Color.parseColor((String) r3Var32.getValue()));
                                            } catch (Throwable th4) {
                                                objA = pg.q.a(th4);
                                            }
                                            if (objA instanceof p.a) {
                                                objA = -14575885;
                                            }
                                            int iIntValue = ((Number) objA).intValue();
                                            int i17 = PdfPreviewActivity.f5788v;
                                            String str15 = (String) r3Var33.getValue();
                                            if (mh.x.A(str15)) {
                                                str15 = (String) r3Var6.getValue();
                                                if (mh.x.A(str15)) {
                                                    str15 = str13;
                                                }
                                            }
                                            WebViewSettings webViewSettings = (WebViewSettings) r3Var34.getValue();
                                            String str16 = (String) r3Var33.getValue();
                                            if (!mh.x.A(str16)) {
                                                str13 = str16;
                                            }
                                            PdfPreviewActivity.a.a(context7, uri, str15, WebViewSettingsKt.pdfReaderOptions(webViewSettings, iIntValue, str13));
                                            break;
                                        }
                                        break;
                                    case 116079:
                                        if (str14.equals("url")) {
                                            x0.r3 r3Var36 = r3Var9;
                                            b9.e3.f3796a = new e3.a(str13, e3.b.f3812b, null, (mh.t.p((String) r3Var36.getValue(), "http://", false) || mh.t.p((String) r3Var36.getValue(), "https://", false)) ? (String) r3Var36.getValue() : m3.a.a("https://", (String) r3Var36.getValue()), null, null, null, null, ((WebViewSettings) r3Var34.getValue()).getColorMode(), WebViewSettingsKt.webViewMixedContentMode((WebViewSettings) r3Var34.getValue()), false, null, 13300);
                                            p5.x.c(e2.t.f24650c.f24627a, xVar3);
                                            break;
                                        }
                                        break;
                                    case 103145323:
                                        if (str14.equals("local") && (uri2 = (Uri) r3Var35.getValue()) != null) {
                                            String str17 = (String) r3Var10.getValue();
                                            b9.e3.f3796a = new e3.a(mh.x.A(str17) ? str13 : str17, e3.b.f3813c, null, null, uri2, null, null, null, ((WebViewSettings) r3Var34.getValue()).getColorMode(), WebViewSettingsKt.webViewMixedContentMode((WebViewSettings) r3Var34.getValue()), false, null, 13292);
                                            p5.x.c(e2.t.f24650c.f24627a, xVar3);
                                            break;
                                        }
                                        break;
                                    case 106438291:
                                        if (str14.equals("paste")) {
                                            String colorMode = ((WebViewSettings) r3Var34.getValue()).getColorMode();
                                            String htmlContent = (String) r3Var8.getValue();
                                            int iWebViewMixedContentMode = WebViewSettingsKt.webViewMixedContentMode((WebViewSettings) r3Var34.getValue());
                                            kotlin.jvm.internal.r.e(htmlContent, "htmlContent");
                                            kotlin.jvm.internal.r.e(colorMode, "colorMode");
                                            b9.e3.f3796a = new e3.a(str13, e3.b.f3811a, htmlContent, null, null, null, null, null, colorMode, iWebViewMixedContentMode, true, null, 9208);
                                            p5.x.c(e2.t.f24650c.f24627a, xVar3);
                                            break;
                                        }
                                        break;
                                }
                                return pg.f0.f21461a;
                            }
                        };
                        fgVar2 = fgVar4;
                        context2 = context6;
                        jVar.C(objG7);
                    } else {
                        context2 = context6;
                        fgVar2 = fgVar4;
                    }
                    eh.a aVar7 = (eh.a) objG7;
                    jVar.B();
                    boolean zI0 = b8.I0(this.N);
                    List listV = b8.V(this.O);
                    jVar.L(-1207699095);
                    obj4 = this.f10424w;
                    zL7 = jVar.l(obj4) | jVar.l(context2);
                    objG8 = jVar.g();
                    if (!zL7 || objG8 == obj3) {
                        objG8 = new b9.v2(1, obj4, context2);
                        jVar.C(objG8);
                    }
                    eh.a aVar8 = (eh.a) objG8;
                    jVar.B();
                    jVar.L(-1207694724);
                    zL8 = jVar.l(fgVar2);
                    objG9 = jVar.g();
                    if (!zL8 || objG9 == obj3) {
                        objG9 = new eh.l() { // from class: f9.pd
                            @Override // eh.l
                            public final Object invoke(Object obj8) {
                                ProjectFile it = (ProjectFile) obj8;
                                kotlin.jvm.internal.r.e(it, "it");
                                sh.z0 z0Var = fgVar2.f9553a0;
                                z0Var.getClass();
                                z0Var.j(null, it);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar.C(objG9);
                    }
                    eh.l lVar15 = (eh.l) objG9;
                    jVar.B();
                    jVar.L(-1207691692);
                    zL9 = jVar.l(fgVar2);
                    objG10 = jVar.g();
                    if (!zL9 || objG10 == obj3) {
                        objG10 = new eh.l() { // from class: f9.qd
                            @Override // eh.l
                            public final Object invoke(Object obj8) {
                                ProjectFile it = (ProjectFile) obj8;
                                kotlin.jvm.internal.r.e(it, "it");
                                fg fgVar5 = fgVar2;
                                sh.z0 z0Var = fgVar5.Z;
                                Iterable iterable = (Iterable) z0Var.getValue();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj9 : iterable) {
                                    if (!kotlin.jvm.internal.r.a(((ProjectFile) obj9).getUri(), it.getUri())) {
                                        arrayList.add(obj9);
                                    }
                                }
                                z0Var.j(null, arrayList);
                                l5.a aVarA3 = androidx.lifecycle.x0.a(fgVar5);
                                wh.c cVar = ph.z0.f21632a;
                                ph.h.c(aVarA3, wh.b.f31563c, null, new ah(fgVar5, it, null), 2);
                                fgVar5.C();
                                return pg.f0.f21461a;
                            }
                        };
                        jVar.C(objG10);
                    }
                    eh.l lVar16 = (eh.l) objG10;
                    jVar.B();
                    p0.b bVarW = b8.W(this.P);
                    boolean zY = b8.Y(this.Q);
                    f0.b bVarZ = b8.Z(this.R);
                    jVar.L(-1207682413);
                    zL10 = jVar.l(fgVar2);
                    objG11 = jVar.g();
                    if (!zL10 || objG11 == obj3) {
                        objG11 = new b9.p(fgVar2, 1);
                        jVar.C(objG11);
                    }
                    jVar.B();
                    context = context2;
                    fg fgVar5 = fgVar2;
                    b8.g(strU, lVar11, value5, lVar12, lVar13, value6, lVar14, value7, value8, aVar5, z20, aVar6, aVar7, zI0, listV, aVar8, lVar15, lVar16, bVarW, zY, bVarZ, (eh.a) objG11, jVar, 0);
                    jVar.B();
                    pg.f0 f0Var2 = pg.f0.f21461a;
                    fgVar = fgVar5;
                    jVar2 = jVar;
                    obj2 = obj3;
                    z10 = false;
                    break;
                } else {
                    obj3 = obj7;
                }
                objG21 = new eh.l() { // from class: f9.od
                    @Override // eh.l
                    public final Object invoke(Object obj8) {
                        String it = (String) obj8;
                        kotlin.jvm.internal.r.e(it, "it");
                        fg fgVar6 = fgVar4;
                        ph.l2 l2Var = fgVar6.f9569i0;
                        if (l2Var != null) {
                            l2Var.cancel((CancellationException) null);
                        }
                        fgVar6.f9569i0 = null;
                        sh.z0 z0Var = fgVar6.f9582p;
                        Boolean bool = Boolean.FALSE;
                        z0Var.getClass();
                        z0Var.j(null, bool);
                        sh.z0 z0Var2 = fgVar6.f9600y;
                        z0Var2.getClass();
                        z0Var2.j(null, it);
                        if (!it.equals("folder")) {
                            sh.z0 z0Var3 = fgVar6.Z;
                            z0Var3.getClass();
                            z0Var3.j(null, qg.z.f22752a);
                            fgVar6.f9555b0.setValue(null);
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar.C(objG21);
                eh.l lVar112 = (eh.l) objG21;
                jVar.B();
                String value52 = r3Var9.getValue();
                jVar.L(-1207900493);
                zL2 = jVar.l(fgVar4);
                objG2 = jVar.g();
                if (!zL2) {
                    objG2 = new androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.t(fgVar4, 1);
                    jVar.C(objG2);
                    eh.l lVar122 = (eh.l) objG2;
                    jVar.B();
                    jVar.L(-1207897409);
                    zL3 = jVar.l(fgVar4);
                    objG3 = jVar.g();
                    if (!zL3) {
                        objG3 = new c9.h(fgVar4, 1);
                        jVar.C(objG3);
                        eh.l lVar132 = (eh.l) objG3;
                        jVar.B();
                        String value62 = r3Var8.getValue();
                        jVar.L(-1207886958);
                        zL4 = jVar.l(fgVar4);
                        objG4 = jVar.g();
                        if (!zL4) {
                            objG4 = new eh.l() { // from class: f9.jc
                                @Override // eh.l
                                public final Object invoke(Object obj8) {
                                    String it = (String) obj8;
                                    kotlin.jvm.internal.r.e(it, "it");
                                    if (mh.t.p(it, "```", false) || mh.t.p(it, "'''", false) || mh.t.p(it, "\"\"\"", false)) {
                                        Set<String> set = l9.w.f16906a;
                                        it = l9.w.a(it);
                                    }
                                    fg fgVar52 = fgVar4;
                                    fgVar52.B.setValue(it);
                                    ph.l2 l2Var = fgVar52.f9569i0;
                                    if (l2Var != null) {
                                        l2Var.cancel((CancellationException) null);
                                    }
                                    if (kotlin.jvm.internal.r.a(fgVar52.f9600y.getValue(), "paste")) {
                                        fgVar52.f9569i0 = ph.h.c(androidx.lifecycle.x0.a(fgVar52), null, null, new pg(fgVar52, it, null), 3);
                                    }
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar.C(objG4);
                            eh.l lVar142 = (eh.l) objG4;
                            jVar.B();
                            boolean zA2 = kotlin.jvm.internal.r.a(b8.U(r3Var2), ProjectKind.PDF);
                            r3Var = this.f10419t;
                            if (!zA2) {
                            }
                            String value82 = !kotlin.jvm.internal.r.a(b8.U(r3Var2), ProjectKind.PDF) ? r3Var6.getValue() : r3Var10.getValue();
                            jVar.L(-1207877550);
                            boolean zK22 = jVar.K(r3Var2);
                            kVar = this.f10393f;
                            boolean zL202 = zK22 | jVar.l(kVar) | jVar.l(context6);
                            kVar2 = this.f10397h;
                            zL5 = zL202 | jVar.l(kVar2);
                            objG5 = jVar.g();
                            if (!zL5) {
                                objG5 = new eh.a() { // from class: f9.sc
                                    @Override // eh.a
                                    public final Object invoke() {
                                        String str13;
                                        c.k kVar5;
                                        boolean zA22 = kotlin.jvm.internal.r.a((String) r3Var2.getValue(), ProjectKind.PDF);
                                        Context context7 = context6;
                                        if (zA22) {
                                            str13 = "application/pdf";
                                            kVar5 = kVar;
                                        } else {
                                            str13 = "*/*";
                                            kVar5 = kVar2;
                                        }
                                        hf.a.a(kVar5, context7, str13, R.string.launch_no_app);
                                        return pg.f0.f21461a;
                                    }
                                };
                                jVar.C(objG5);
                                eh.a aVar52 = (eh.a) objG5;
                                jVar.B();
                                if (kotlin.jvm.internal.r.a(b8.U(r3Var2), ProjectKind.PDF)) {
                                    jVar.L(-1207865776);
                                    boolean zL212 = jVar.l(fgVar4);
                                    j10 = this.f10400j;
                                    zJ = zL212 | jVar.j(j10) | jVar.l(xVar2);
                                    boolean z202 = z19;
                                    objG6 = jVar.g();
                                    if (!zJ) {
                                        objG6 = new eh.a() { // from class: f9.ad
                                            @Override // eh.a
                                            public final Object invoke() throws IOException {
                                                fg fgVar52 = fgVar4;
                                                fgVar52.v();
                                                ProjectEntity projectEntity = (ProjectEntity) fgVar52.f9568i.getValue();
                                                p5.x.c(e2.l.f24642c.a(projectEntity != null ? projectEntity.getId() : j10), xVar2);
                                                return pg.f0.f21461a;
                                            }
                                        };
                                        jVar.C(objG6);
                                        eh.a aVar62 = (eh.a) objG6;
                                        jVar.B();
                                        jVar.L(-1207848884);
                                        zL6 = jVar.l(fgVar4) | jVar.j(j10) | jVar.K(r3Var3) | jVar.l(context6) | jVar.K(r3Var2) | jVar.K(r3Var4) | jVar.K(r3Var5) | jVar.K(r3Var6) | jVar.K(r3Var7) | jVar.K(r3Var8) | jVar.l(xVar2) | jVar.K(r3Var9) | jVar.K(r3Var) | jVar.K(r3Var10);
                                        objG7 = jVar.g();
                                        if (zL6) {
                                            objG7 = new eh.a() { // from class: f9.id
                                                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                                @Override // eh.a
                                                public final Object invoke() {
                                                    Uri uri;
                                                    Object objA;
                                                    Uri uri2;
                                                    x0.r3 r3Var32 = r3Var5;
                                                    fg fgVar52 = fgVar4;
                                                    ProjectEntity projectEntity = (ProjectEntity) fgVar52.f9568i.getValue();
                                                    long id2 = projectEntity != null ? projectEntity.getId() : j10;
                                                    x0.r3 r3Var33 = r3Var3;
                                                    String string = (String) r3Var33.getValue();
                                                    boolean zA22 = mh.x.A(string);
                                                    Context context7 = context6;
                                                    if (zA22) {
                                                        string = context7.getString(R.string.preview_title);
                                                        kotlin.jvm.internal.r.d(string, "getString(...)");
                                                    }
                                                    String str13 = string;
                                                    String str14 = (String) r3Var2.getValue();
                                                    int iHashCode = str14.hashCode();
                                                    p5.x xVar3 = xVar2;
                                                    x0.r3 r3Var34 = r3Var7;
                                                    x0.r3 r3Var35 = r3Var;
                                                    switch (iHashCode) {
                                                        case -1268966290:
                                                            if (str14.equals("folder")) {
                                                                b9.e3.f3796a = new e3.a(str13, e3.b.f3814d, null, null, (Uri) r3Var35.getValue(), new File(fgVar52.w(id2), "content"), null, null, ((WebViewSettings) r3Var34.getValue()).getColorMode(), WebViewSettingsKt.webViewMixedContentMode((WebViewSettings) r3Var34.getValue()), false, null, 13260);
                                                                p5.x.c(e2.t.f24650c.f24627a, xVar3);
                                                                break;
                                                            }
                                                            break;
                                                        case 110834:
                                                            if (str14.equals(ProjectKind.PDF) && (uri = (Uri) r3Var4.getValue()) != null) {
                                                                try {
                                                                    objA = Integer.valueOf(Color.parseColor((String) r3Var32.getValue()));
                                                                } catch (Throwable th4) {
                                                                    objA = pg.q.a(th4);
                                                                }
                                                                if (objA instanceof p.a) {
                                                                    objA = -14575885;
                                                                }
                                                                int iIntValue = ((Number) objA).intValue();
                                                                int i17 = PdfPreviewActivity.f5788v;
                                                                String str15 = (String) r3Var33.getValue();
                                                                if (mh.x.A(str15)) {
                                                                    str15 = (String) r3Var6.getValue();
                                                                    if (mh.x.A(str15)) {
                                                                        str15 = str13;
                                                                    }
                                                                }
                                                                WebViewSettings webViewSettings = (WebViewSettings) r3Var34.getValue();
                                                                String str16 = (String) r3Var33.getValue();
                                                                if (!mh.x.A(str16)) {
                                                                    str13 = str16;
                                                                }
                                                                PdfPreviewActivity.a.a(context7, uri, str15, WebViewSettingsKt.pdfReaderOptions(webViewSettings, iIntValue, str13));
                                                                break;
                                                            }
                                                            break;
                                                        case 116079:
                                                            if (str14.equals("url")) {
                                                                x0.r3 r3Var36 = r3Var9;
                                                                b9.e3.f3796a = new e3.a(str13, e3.b.f3812b, null, (mh.t.p((String) r3Var36.getValue(), "http://", false) || mh.t.p((String) r3Var36.getValue(), "https://", false)) ? (String) r3Var36.getValue() : m3.a.a("https://", (String) r3Var36.getValue()), null, null, null, null, ((WebViewSettings) r3Var34.getValue()).getColorMode(), WebViewSettingsKt.webViewMixedContentMode((WebViewSettings) r3Var34.getValue()), false, null, 13300);
                                                                p5.x.c(e2.t.f24650c.f24627a, xVar3);
                                                                break;
                                                            }
                                                            break;
                                                        case 103145323:
                                                            if (str14.equals("local") && (uri2 = (Uri) r3Var35.getValue()) != null) {
                                                                String str17 = (String) r3Var10.getValue();
                                                                b9.e3.f3796a = new e3.a(mh.x.A(str17) ? str13 : str17, e3.b.f3813c, null, null, uri2, null, null, null, ((WebViewSettings) r3Var34.getValue()).getColorMode(), WebViewSettingsKt.webViewMixedContentMode((WebViewSettings) r3Var34.getValue()), false, null, 13292);
                                                                p5.x.c(e2.t.f24650c.f24627a, xVar3);
                                                                break;
                                                            }
                                                            break;
                                                        case 106438291:
                                                            if (str14.equals("paste")) {
                                                                String colorMode = ((WebViewSettings) r3Var34.getValue()).getColorMode();
                                                                String htmlContent = (String) r3Var8.getValue();
                                                                int iWebViewMixedContentMode = WebViewSettingsKt.webViewMixedContentMode((WebViewSettings) r3Var34.getValue());
                                                                kotlin.jvm.internal.r.e(htmlContent, "htmlContent");
                                                                kotlin.jvm.internal.r.e(colorMode, "colorMode");
                                                                b9.e3.f3796a = new e3.a(str13, e3.b.f3811a, htmlContent, null, null, null, null, null, colorMode, iWebViewMixedContentMode, true, null, 9208);
                                                                p5.x.c(e2.t.f24650c.f24627a, xVar3);
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                    return pg.f0.f21461a;
                                                }
                                            };
                                            fgVar2 = fgVar4;
                                            context2 = context6;
                                            jVar.C(objG7);
                                            eh.a aVar72 = (eh.a) objG7;
                                            jVar.B();
                                            boolean zI02 = b8.I0(this.N);
                                            List listV2 = b8.V(this.O);
                                            jVar.L(-1207699095);
                                            obj4 = this.f10424w;
                                            zL7 = jVar.l(obj4) | jVar.l(context2);
                                            objG8 = jVar.g();
                                            if (!zL7) {
                                                objG8 = new b9.v2(1, obj4, context2);
                                                jVar.C(objG8);
                                                eh.a aVar82 = (eh.a) objG8;
                                                jVar.B();
                                                jVar.L(-1207694724);
                                                zL8 = jVar.l(fgVar2);
                                                objG9 = jVar.g();
                                                if (!zL8) {
                                                    objG9 = new eh.l() { // from class: f9.pd
                                                        @Override // eh.l
                                                        public final Object invoke(Object obj8) {
                                                            ProjectFile it = (ProjectFile) obj8;
                                                            kotlin.jvm.internal.r.e(it, "it");
                                                            sh.z0 z0Var = fgVar2.f9553a0;
                                                            z0Var.getClass();
                                                            z0Var.j(null, it);
                                                            return pg.f0.f21461a;
                                                        }
                                                    };
                                                    jVar.C(objG9);
                                                    eh.l lVar152 = (eh.l) objG9;
                                                    jVar.B();
                                                    jVar.L(-1207691692);
                                                    zL9 = jVar.l(fgVar2);
                                                    objG10 = jVar.g();
                                                    if (!zL9) {
                                                        objG10 = new eh.l() { // from class: f9.qd
                                                            @Override // eh.l
                                                            public final Object invoke(Object obj8) {
                                                                ProjectFile it = (ProjectFile) obj8;
                                                                kotlin.jvm.internal.r.e(it, "it");
                                                                fg fgVar52 = fgVar2;
                                                                sh.z0 z0Var = fgVar52.Z;
                                                                Iterable iterable = (Iterable) z0Var.getValue();
                                                                ArrayList arrayList = new ArrayList();
                                                                for (Object obj9 : iterable) {
                                                                    if (!kotlin.jvm.internal.r.a(((ProjectFile) obj9).getUri(), it.getUri())) {
                                                                        arrayList.add(obj9);
                                                                    }
                                                                }
                                                                z0Var.j(null, arrayList);
                                                                l5.a aVarA3 = androidx.lifecycle.x0.a(fgVar52);
                                                                wh.c cVar = ph.z0.f21632a;
                                                                ph.h.c(aVarA3, wh.b.f31563c, null, new ah(fgVar52, it, null), 2);
                                                                fgVar52.C();
                                                                return pg.f0.f21461a;
                                                            }
                                                        };
                                                        jVar.C(objG10);
                                                        eh.l lVar162 = (eh.l) objG10;
                                                        jVar.B();
                                                        p0.b bVarW2 = b8.W(this.P);
                                                        boolean zY2 = b8.Y(this.Q);
                                                        f0.b bVarZ2 = b8.Z(this.R);
                                                        jVar.L(-1207682413);
                                                        zL10 = jVar.l(fgVar2);
                                                        objG11 = jVar.g();
                                                        if (!zL10) {
                                                            objG11 = new b9.p(fgVar2, 1);
                                                            jVar.C(objG11);
                                                            jVar.B();
                                                            context = context2;
                                                            fg fgVar52 = fgVar2;
                                                            b8.g(strU, lVar112, value52, lVar122, lVar132, value62, lVar142, value7, value82, aVar52, z202, aVar62, aVar72, zI02, listV2, aVar82, lVar152, lVar162, bVarW2, zY2, bVarZ2, (eh.a) objG11, jVar, 0);
                                                            jVar.B();
                                                            pg.f0 f0Var22 = pg.f0.f21461a;
                                                            fgVar = fgVar52;
                                                            jVar2 = jVar;
                                                            obj2 = obj3;
                                                            z10 = false;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            case 2:
                l1Var = l1Var3;
                n1Var = n1Var2;
                f10 = f12;
                list = list2;
                aVar = aVar3;
                jVar.L(-1207677763);
                String value9 = r3Var16.getValue();
                jVar.L(-1207676651);
                boolean zL22 = jVar.l(fgVar4);
                Object objG22 = jVar.g();
                if (zL22 || objG22 == obj7) {
                    objG22 = new nb(fgVar4, 0);
                    jVar.C(objG22);
                }
                eh.l lVar17 = (eh.l) objG22;
                jVar.B();
                boolean zBooleanValue = r3Var17.getValue().booleanValue();
                jVar.L(-1207673068);
                boolean zL23 = jVar.l(fgVar4);
                Object objG23 = jVar.g();
                if (zL23 || objG23 == obj7) {
                    objG23 = new ob(fgVar4, 0);
                    jVar.C(objG23);
                }
                eh.l lVar18 = (eh.l) objG23;
                jVar.B();
                boolean zBooleanValue2 = r3Var18.getValue().booleanValue();
                jVar.L(-1207669225);
                boolean zL24 = jVar.l(fgVar4);
                Object objG24 = jVar.g();
                if (zL24 || objG24 == obj7) {
                    objG24 = new eh.l() { // from class: f9.pb
                        @Override // eh.l
                        public final Object invoke(Object obj8) {
                            Boolean bool = (Boolean) obj8;
                            bool.getClass();
                            sh.z0 z0Var = fgVar4.f9589s0;
                            z0Var.getClass();
                            z0Var.j(null, bool);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG24);
                }
                eh.l lVar19 = (eh.l) objG24;
                jVar.B();
                boolean zBooleanValue3 = r3Var19.getValue().booleanValue();
                jVar.L(-1207665386);
                boolean zL25 = jVar.l(fgVar4);
                Object objG25 = jVar.g();
                if (zL25 || objG25 == obj7) {
                    objG25 = new eh.l() { // from class: f9.qb
                        @Override // eh.l
                        public final Object invoke(Object obj8) {
                            Boolean bool = (Boolean) obj8;
                            bool.getClass();
                            sh.z0 z0Var = fgVar4.f9591t0;
                            z0Var.getClass();
                            z0Var.j(null, bool);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG25);
                }
                eh.l lVar20 = (eh.l) objG25;
                jVar.B();
                boolean zS0 = b8.s0(this.W);
                jVar.L(-1207661190);
                boolean zL26 = jVar.l(fgVar4);
                Object objG26 = jVar.g();
                if (zL26 || objG26 == obj7) {
                    z11 = zBooleanValue;
                    objG26 = new b9.u(fgVar4, 1);
                    jVar.C(objG26);
                } else {
                    z11 = zBooleanValue;
                }
                eh.l lVar21 = (eh.l) objG26;
                jVar.B();
                boolean zT0 = b8.t0(this.X);
                jVar.L(-1207657355);
                boolean zL27 = jVar.l(fgVar4);
                Object objG27 = jVar.g();
                if (zL27 || objG27 == obj7) {
                    objG27 = new eh.l() { // from class: f9.rb
                        @Override // eh.l
                        public final Object invoke(Object obj8) {
                            Boolean bool = (Boolean) obj8;
                            bool.getClass();
                            sh.z0 z0Var = fgVar4.f9595v0;
                            z0Var.getClass();
                            z0Var.j(null, bool);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG27);
                }
                eh.l lVar22 = (eh.l) objG27;
                jVar.B();
                boolean zV0 = b8.v0(this.Y);
                jVar.L(-1207653481);
                boolean zL28 = jVar.l(fgVar4);
                Object objG28 = jVar.g();
                if (zL28 || objG28 == obj7) {
                    objG28 = new eh.l() { // from class: f9.sb
                        @Override // eh.l
                        public final Object invoke(Object obj8) {
                            Boolean bool = (Boolean) obj8;
                            bool.getClass();
                            sh.z0 z0Var = fgVar4.f9599x0;
                            z0Var.getClass();
                            z0Var.j(null, bool);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG28);
                }
                eh.l lVar23 = (eh.l) objG28;
                jVar.B();
                boolean zBooleanValue4 = r3Var12.getValue().booleanValue();
                jVar.L(-1207649279);
                boolean zL29 = jVar.l(xVar2);
                Object objG29 = jVar.g();
                if (zL29 || objG29 == obj7) {
                    z12 = zT0;
                    objG29 = new tb(xVar2, 0);
                    jVar.C(objG29);
                } else {
                    z12 = zT0;
                }
                eh.a aVar9 = (eh.a) objG29;
                jVar.B();
                String value10 = r3Var5.getValue();
                jVar.L(-1207645130);
                boolean zL30 = jVar.l(fgVar4);
                Object objG30 = jVar.g();
                if (zL30 || objG30 == obj7) {
                    objG30 = new ub(fgVar4, 0);
                    jVar.C(objG30);
                }
                eh.l lVar24 = (eh.l) objG30;
                jVar.B();
                String colorMode = r3Var7.getValue().getColorMode();
                jVar.L(-1207640165);
                boolean zL31 = jVar.l(fgVar4) | jVar.K(r3Var7);
                Object objG31 = jVar.g();
                if (zL31 || objG31 == obj7) {
                    str3 = value10;
                    objG31 = new b9.a0(1, fgVar4, r3Var7);
                    jVar.C(objG31);
                } else {
                    str3 = value10;
                }
                eh.l lVar25 = (eh.l) objG31;
                jVar.B();
                String webBackgroundColor = r3Var7.getValue().getWebBackgroundColor();
                jVar.L(-1207633221);
                boolean zL32 = jVar.l(fgVar4);
                Object objG32 = jVar.g();
                if (zL32 || objG32 == obj7) {
                    objG32 = new eh.l() { // from class: f9.wb
                        @Override // eh.l
                        public final Object invoke(Object obj8) {
                            String it = (String) obj8;
                            kotlin.jvm.internal.r.e(it, "it");
                            sh.z0 z0Var = fgVar4.W0;
                            WebViewSettings webViewSettings = (WebViewSettings) z0Var.getValue();
                            z0Var.setValue(webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : it, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG32);
                }
                eh.l lVar26 = (eh.l) objG32;
                jVar.B();
                String statusBarColor = r3Var7.getValue().getStatusBarColor();
                if (mh.x.A(statusBarColor)) {
                    statusBarColor = r3Var18.getValue().booleanValue() ? r3Var5.getValue() : "#000000";
                }
                jVar.L(-1207623849);
                boolean zL33 = jVar.l(fgVar4);
                Object objG33 = jVar.g();
                if (zL33 || objG33 == obj7) {
                    objG33 = new eh.l() { // from class: f9.xb
                        @Override // eh.l
                        public final Object invoke(Object obj8) {
                            String it = (String) obj8;
                            kotlin.jvm.internal.r.e(it, "it");
                            sh.z0 z0Var = fgVar4.W0;
                            WebViewSettings webViewSettings = (WebViewSettings) z0Var.getValue();
                            z0Var.setValue(webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : it, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 100, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : "auto", (4194303 & 512) != 0 ? webViewSettings.navBarColor : it, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 100, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : "auto", (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG33);
                }
                jVar.B();
                th2 = null;
                b8.h(value9, lVar17, z11, lVar18, zBooleanValue2, lVar19, zBooleanValue3, lVar20, zS0, lVar21, z12, lVar22, zV0, lVar23, zBooleanValue4, aVar9, str3, lVar24, colorMode, lVar25, webBackgroundColor, lVar26, statusBarColor, (eh.l) objG33, jVar, 0);
                jVar.B();
                pg.f0 f0Var3 = pg.f0.f21461a;
                fgVar = fgVar4;
                jVar2 = jVar;
                obj2 = obj7;
                context = context6;
                z10 = false;
                break;
            case 3:
                l1Var = l1Var3;
                n1Var = n1Var2;
                f10 = f12;
                list = list2;
                aVar = aVar3;
                jVar.L(1218485511);
                x0.n1 n1VarB = bg.b.b(fgVar4.m(), jVar);
                pg.f0 f0Var4 = pg.f0.f21461a;
                jVar.L(-1207615912);
                boolean zK3 = jVar.K(r3Var2) | jVar.l(fgVar4);
                Object objG34 = jVar.g();
                if (zK3 || objG34 == obj7) {
                    th3 = null;
                    objG34 = new a(fgVar4, r3Var2, null);
                    jVar.C(objG34);
                } else {
                    th3 = null;
                }
                jVar.B();
                x0.o0.d((eh.p) objG34, f0Var4, jVar);
                List<String> value11 = r3Var11.getValue();
                boolean zA3 = kotlin.jvm.internal.r.a(b8.U(r3Var2), "url");
                Map mapC = kotlin.jvm.internal.r.a(b8.U(r3Var2), "url") ? qg.a0.f22708a : c(n1VarB);
                jVar.L(-1207602889);
                boolean zL34 = jVar.l(fgVar4);
                Object objG35 = jVar.g();
                if (zL34 || objG35 == obj7) {
                    objG35 = new c3(fgVar4, 1);
                    jVar.C(objG35);
                }
                eh.a aVar10 = (eh.a) objG35;
                jVar.B();
                jVar.L(-1207600097);
                boolean zL35 = jVar.l(fgVar4) | jVar.K(r3Var11);
                Object objG36 = jVar.g();
                if (zL35 || objG36 == obj7) {
                    objG36 = new eh.p() { // from class: f9.yb
                        @Override // eh.p
                        public final Object invoke(Object obj8, Object obj9) {
                            String perm = (String) obj8;
                            boolean zBooleanValue5 = ((Boolean) obj9).booleanValue();
                            kotlin.jvm.internal.r.e(perm, "perm");
                            sh.z0 z0Var = fgVar4.f9563f0;
                            x0.r3 r3Var32 = r3Var11;
                            ArrayList arrayListP = zBooleanValue5 ? qg.x.P(perm, (List) r3Var32.getValue()) : qg.x.N((List) r3Var32.getValue(), perm);
                            z0Var.getClass();
                            z0Var.j(null, arrayListP);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG36);
                }
                jVar.B();
                b8.q(value11, zA3, mapC, aVar10, (eh.p) objG36, jVar, 0);
                jVar.B();
                jVar2 = jVar;
                fgVar = fgVar4;
                obj2 = obj7;
                context = context6;
                th2 = th3;
                z10 = false;
                break;
            case 4:
                l1Var = l1Var3;
                n1Var = n1Var2;
                f10 = f12;
                list = list2;
                aVar = aVar3;
                jVar.L(-1207590735);
                Uri value12 = r3Var20.getValue();
                String value13 = r3Var21.getValue();
                jVar.L(-1207586687);
                Object obj8 = this.f10428y;
                boolean zL36 = jVar.l(obj8) | jVar.l(context6);
                Object objG37 = jVar.g();
                if (!zL36) {
                    obj5 = obj7;
                    if (objG37 == obj5) {
                    }
                    eh.a aVar11 = (eh.a) objG37;
                    jVar.B();
                    boolean zG0 = b8.G0(this.f10386b0);
                    jVar.L(-1207581089);
                    if (kotlin.jvm.internal.r.a(b8.U(r3Var2), ProjectKind.PDF) || r3Var4.getValue() == null) {
                        aVar2 = null;
                    } else {
                        jVar.L(-1207578401);
                        boolean zK4 = jVar.K(r3Var4) | jVar.l(i0Var) | jVar.l(context6);
                        final eh.l<Uri, pg.f0> lVar27 = this.A;
                        boolean zK5 = zK4 | jVar.K(lVar27);
                        Object objG38 = jVar.g();
                        if (zK5 || objG38 == obj5) {
                            objG38 = new eh.a() { // from class: f9.zb
                                @Override // eh.a
                                public final Object invoke() {
                                    String path;
                                    Uri uri = (Uri) r3Var4.getValue();
                                    if (uri != null && (path = uri.getPath()) != null) {
                                        ph.h.c(i0Var, null, null, new rd.b(lVar27, context6, path, null), 3);
                                    }
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar.C(objG38);
                        }
                        aVar2 = (eh.a) objG38;
                        jVar.B();
                    }
                    jVar.B();
                    b8.m(value12, value13, aVar11, zG0, aVar2, jVar, 0);
                    jVar.B();
                    pg.f0 f0Var5 = pg.f0.f21461a;
                    jVar2 = jVar;
                    obj2 = obj5;
                    context = context6;
                    fgVar = fgVar4;
                    z10 = false;
                    th2 = null;
                    break;
                } else {
                    obj5 = obj7;
                }
                objG37 = new androidx.credentials.playservices.controllers.identityauth.getsigninintent.e(2, obj8, context6);
                jVar.C(objG37);
                eh.a aVar112 = (eh.a) objG37;
                jVar.B();
                boolean zG02 = b8.G0(this.f10386b0);
                jVar.L(-1207581089);
                if (kotlin.jvm.internal.r.a(b8.U(r3Var2), ProjectKind.PDF)) {
                    aVar2 = null;
                    jVar.B();
                    b8.m(value12, value13, aVar112, zG02, aVar2, jVar, 0);
                    jVar.B();
                    pg.f0 f0Var52 = pg.f0.f21461a;
                    jVar2 = jVar;
                    obj2 = obj5;
                    context = context6;
                    fgVar = fgVar4;
                    z10 = false;
                    th2 = null;
                }
            case 5:
                l1Var = l1Var3;
                n1Var = n1Var2;
                f10 = f12;
                list = list2;
                aVar = aVar3;
                jVar.L(-1207549262);
                boolean zA0 = b8.a0(this.f10388c0);
                jVar.L(-1207548106);
                boolean zL37 = jVar.l(fgVar4);
                Object objG39 = jVar.g();
                if (zL37 || objG39 == obj7) {
                    objG39 = new eh.l() { // from class: f9.ac
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            Boolean bool = (Boolean) obj9;
                            boolean zBooleanValue5 = bool.booleanValue();
                            fg fgVar6 = fgVar4;
                            sh.z0 z0Var = fgVar6.J;
                            z0Var.getClass();
                            z0Var.j(null, bool);
                            sh.z0 z0Var2 = fgVar6.W0;
                            WebViewSettings webViewSettings = (WebViewSettings) z0Var2.getValue();
                            z0Var2.setValue(webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : zBooleanValue5, ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG39);
                }
                eh.l lVar28 = (eh.l) objG39;
                jVar.B();
                String value14 = r3Var22.getValue();
                Uri uriB0 = b8.b0(this.f10392e0);
                Uri value15 = r3Var20.getValue();
                String strC0 = b8.c0(this.f10394f0);
                jVar.L(-1207537706);
                boolean zL38 = jVar.l(fgVar4);
                Object objG40 = jVar.g();
                if (zL38 || objG40 == obj7) {
                    objG40 = new eh.l() { // from class: f9.bc
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            String it = (String) obj9;
                            kotlin.jvm.internal.r.e(it, "it");
                            fg fgVar6 = fgVar4;
                            sh.z0 z0Var = fgVar6.M;
                            z0Var.getClass();
                            z0Var.j(null, it);
                            sh.z0 z0Var2 = fgVar6.W0;
                            WebViewSettings webViewSettings = (WebViewSettings) z0Var2.getValue();
                            z0Var2.setValue(webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : it, ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG40);
                }
                eh.l lVar29 = (eh.l) objG40;
                jVar.B();
                boolean zD0 = b8.d0(this.f10396g0);
                jVar.L(-1207532906);
                boolean zL39 = jVar.l(fgVar4);
                Object objG41 = jVar.g();
                if (zL39 || objG41 == obj7) {
                    objG41 = new b9.p0(fgVar4, 1);
                    jVar.C(objG41);
                }
                eh.l lVar30 = (eh.l) objG41;
                jVar.B();
                String strE0 = b8.e0(this.f10398h0);
                jVar.L(-1207527718);
                boolean zL40 = jVar.l(fgVar4);
                Object objG42 = jVar.g();
                if (zL40 || objG42 == obj7) {
                    objG42 = new eh.l() { // from class: f9.cc
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            String it = (String) obj9;
                            kotlin.jvm.internal.r.e(it, "it");
                            fg fgVar6 = fgVar4;
                            sh.z0 z0Var = fgVar6.O;
                            z0Var.getClass();
                            z0Var.j(null, it);
                            sh.z0 z0Var2 = fgVar6.W0;
                            WebViewSettings webViewSettings = (WebViewSettings) z0Var2.getValue();
                            z0Var2.setValue(webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : it, ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG42);
                }
                eh.l lVar31 = (eh.l) objG42;
                jVar.B();
                int iF0 = b8.f0(this.f10399i0);
                jVar.L(-1207522697);
                boolean zL41 = jVar.l(fgVar4);
                Object objG43 = jVar.g();
                if (zL41 || objG43 == obj7) {
                    z13 = zA0;
                    objG43 = new ec(fgVar4, 0);
                    jVar.C(objG43);
                } else {
                    z13 = zA0;
                }
                eh.l lVar33 = (eh.l) objG43;
                jVar.B();
                int iG0 = b8.g0(this.f10401j0);
                jVar.L(-1207517575);
                boolean zL42 = jVar.l(fgVar4);
                Object objG44 = jVar.g();
                if (zL42 || objG44 == obj7) {
                    i11 = iG0;
                    objG44 = new n3(fgVar4, 1);
                    jVar.C(objG44);
                } else {
                    i11 = iG0;
                }
                eh.l lVar34 = (eh.l) objG44;
                jVar.B();
                int iH0 = b8.h0(this.f10403k0);
                jVar.L(-1207512391);
                boolean zL43 = jVar.l(fgVar4);
                Object objG45 = jVar.g();
                if (zL43 || objG45 == obj7) {
                    objG45 = new eh.l() { // from class: f9.fc
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            Integer num = (Integer) obj9;
                            int iIntValue = num.intValue();
                            fg fgVar6 = fgVar4;
                            sh.z0 z0Var = fgVar6.R;
                            z0Var.getClass();
                            z0Var.j(null, num);
                            sh.z0 z0Var2 = fgVar6.W0;
                            WebViewSettings webViewSettings = (WebViewSettings) z0Var2.getValue();
                            z0Var2.setValue(webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : iIntValue, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG45);
                }
                eh.l lVar35 = (eh.l) objG45;
                jVar.B();
                int iI0 = b8.i0(this.f10405l0);
                jVar.L(-1207507498);
                boolean zL44 = jVar.l(fgVar4);
                Object objG46 = jVar.g();
                if (zL44 || objG46 == obj7) {
                    objG46 = new eh.l() { // from class: f9.gc
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            Integer num = (Integer) obj9;
                            int iIntValue = num.intValue();
                            fg fgVar6 = fgVar4;
                            sh.z0 z0Var = fgVar6.S;
                            z0Var.getClass();
                            z0Var.j(null, num);
                            sh.z0 z0Var2 = fgVar6.W0;
                            WebViewSettings webViewSettings = (WebViewSettings) z0Var2.getValue();
                            z0Var2.setValue(webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : iIntValue, ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG46);
                }
                eh.l lVar36 = (eh.l) objG46;
                jVar.B();
                int iJ0 = b8.j0(this.f10407m0);
                jVar.L(-1207502601);
                boolean zL45 = jVar.l(fgVar4);
                Object objG47 = jVar.g();
                if (zL45 || objG47 == obj7) {
                    i12 = iH0;
                    objG47 = new hc(fgVar4, 0);
                    jVar.C(objG47);
                } else {
                    i12 = iH0;
                }
                eh.l lVar37 = (eh.l) objG47;
                jVar.B();
                int iK0 = b8.k0(this.f10409n0);
                jVar.L(-1207496994);
                boolean zL46 = jVar.l(fgVar4);
                Object objG48 = jVar.g();
                if (zL46 || objG48 == obj7) {
                    i13 = iK0;
                    objG48 = new ic(fgVar4, 0);
                    jVar.C(objG48);
                } else {
                    i13 = iK0;
                }
                eh.l lVar38 = (eh.l) objG48;
                jVar.B();
                int iL0 = b8.l0(this.f10410o0);
                jVar.L(-1207491461);
                boolean zL47 = jVar.l(fgVar4);
                Object objG49 = jVar.g();
                if (zL47 || objG49 == obj7) {
                    i14 = iL0;
                    objG49 = new kc(fgVar4, 0);
                    jVar.C(objG49);
                } else {
                    i14 = iL0;
                }
                eh.l lVar39 = (eh.l) objG49;
                jVar.B();
                String strM0 = b8.m0(this.f10412p0);
                jVar.L(-1207486118);
                boolean zL48 = jVar.l(fgVar4);
                Object objG50 = jVar.g();
                if (zL48 || objG50 == obj7) {
                    objG50 = new eh.l() { // from class: f9.lc
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            String it = (String) obj9;
                            kotlin.jvm.internal.r.e(it, "it");
                            fg fgVar6 = fgVar4;
                            sh.z0 z0Var = fgVar6.W;
                            z0Var.getClass();
                            z0Var.j(null, it);
                            sh.z0 z0Var2 = fgVar6.W0;
                            WebViewSettings webViewSettings = (WebViewSettings) z0Var2.getValue();
                            z0Var2.setValue(webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : it, (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG50);
                }
                eh.l lVar40 = (eh.l) objG50;
                jVar.B();
                boolean zN0 = b8.n0(this.f10414q0);
                jVar.L(-1207480903);
                boolean zL49 = jVar.l(fgVar4);
                Object objG51 = jVar.g();
                if (zL49 || objG51 == obj7) {
                    objG51 = new eh.l() { // from class: f9.mc
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            Boolean bool = (Boolean) obj9;
                            boolean zBooleanValue5 = bool.booleanValue();
                            fg fgVar6 = fgVar4;
                            sh.z0 z0Var = fgVar6.X;
                            z0Var.getClass();
                            z0Var.j(null, bool);
                            sh.z0 z0Var2 = fgVar6.W0;
                            WebViewSettings webViewSettings = (WebViewSettings) z0Var2.getValue();
                            z0Var2.setValue(webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : zBooleanValue5, (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG51);
                }
                eh.l lVar41 = (eh.l) objG51;
                jVar.B();
                boolean zO0 = b8.o0(this.f10416r0);
                jVar.L(-1207475719);
                boolean zL50 = jVar.l(fgVar4);
                Object objG52 = jVar.g();
                if (zL50 || objG52 == obj7) {
                    objG52 = new eh.l() { // from class: f9.nc
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            Boolean bool = (Boolean) obj9;
                            boolean zBooleanValue5 = bool.booleanValue();
                            fg fgVar6 = fgVar4;
                            sh.z0 z0Var = fgVar6.Y;
                            z0Var.getClass();
                            z0Var.j(null, bool);
                            sh.z0 z0Var2 = fgVar6.W0;
                            WebViewSettings webViewSettings = (WebViewSettings) z0Var2.getValue();
                            z0Var2.setValue(webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : zBooleanValue5, (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG52);
                }
                eh.l lVar43 = (eh.l) objG52;
                jVar.B();
                jVar.L(-1207472989);
                final c.k<String, Uri> kVar5 = this.B;
                boolean zL51 = jVar.l(kVar5) | jVar.l(context6);
                Object objG53 = jVar.g();
                if (zL51 || objG53 == obj7) {
                    objG53 = new eh.a() { // from class: f9.oc
                        @Override // eh.a
                        public final Object invoke() {
                            hf.a.a(kVar5, context6, "image/*", R.string.launch_no_app);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG53);
                }
                eh.a aVar12 = (eh.a) objG53;
                jVar.B();
                jVar.L(-1207469940);
                boolean zL52 = jVar.l(fgVar4);
                Object objG54 = jVar.g();
                if (zL52 || objG54 == obj7) {
                    context3 = context6;
                    objG54 = new a9.i(fgVar4, 2);
                    jVar.C(objG54);
                } else {
                    context3 = context6;
                }
                eh.a aVar13 = (eh.a) objG54;
                jVar.B();
                boolean zH0 = b8.H0(this.f10418s0);
                boolean zBooleanValue5 = r3Var12.getValue().booleanValue();
                jVar.L(-1207464255);
                boolean zL53 = jVar.l(xVar2);
                Object objG55 = jVar.g();
                if (zL53 || objG55 == obj7) {
                    objG55 = new eh.a() { // from class: f9.pc
                        @Override // eh.a
                        public final Object invoke() {
                            p5.x.c(e2.r.f24648c.f24627a, xVar2);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG55);
                }
                jVar.B();
                b8.B(z13, lVar28, value14, uriB0, value15, strC0, lVar29, zD0, lVar30, strE0, lVar31, iF0, lVar33, i11, lVar34, i12, lVar35, iI0, lVar36, iJ0, lVar37, i13, lVar38, i14, lVar39, strM0, lVar40, zN0, lVar41, zO0, lVar43, aVar12, aVar13, zH0, zBooleanValue5, (eh.a) objG55, jVar, 0);
                jVar.B();
                pg.f0 f0Var6 = pg.f0.f21461a;
                jVar2 = jVar;
                fgVar = fgVar4;
                obj2 = obj7;
                context = context3;
                z10 = false;
                th2 = null;
                break;
            case 6:
                l1Var = l1Var3;
                n1Var = n1Var2;
                context4 = context6;
                f10 = f12;
                list = list2;
                aVar = aVar3;
                jVar.L(-1207460194);
                if (kotlin.jvm.internal.r.a(b8.U(r3Var2), ProjectKind.PDF)) {
                    jVar.L(1223458035);
                    b8.i(f1.c.b(802220665, new c(fgVar4, r3Var7), jVar), jVar, 6);
                    jVar.B();
                    obj6 = obj7;
                } else {
                    jVar.L(-1207448166);
                    WebViewSettings value16 = r3Var7.getValue();
                    jVar.L(-1207444807);
                    boolean zL54 = jVar.l(fgVar4);
                    Object objG56 = jVar.g();
                    obj6 = obj7;
                    if (zL54 || objG56 == obj6) {
                        objG56 = new qc(fgVar4, 0);
                        jVar.C(objG56);
                    }
                    eh.l lVar44 = (eh.l) objG56;
                    jVar.B();
                    boolean zA4 = kotlin.jvm.internal.r.a(b8.U(r3Var2), "url");
                    boolean zBooleanValue6 = r3Var12.getValue().booleanValue();
                    jVar.L(-1207438303);
                    boolean zL55 = jVar.l(xVar2);
                    Object objG57 = jVar.g();
                    if (zL55 || objG57 == obj6) {
                        objG57 = new eh.a() { // from class: f9.rc
                            @Override // eh.a
                            public final Object invoke() {
                                p5.x.c(e2.r.f24648c.f24627a, xVar2);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar.C(objG57);
                    }
                    jVar.B();
                    b8.H(value16, lVar44, zA4, zBooleanValue6, (eh.a) objG57, jVar, 0);
                    jVar.B();
                }
                jVar.B();
                pg.f0 f0Var7 = pg.f0.f21461a;
                fgVar = fgVar4;
                jVar2 = jVar;
                obj2 = obj6;
                context = context4;
                z10 = false;
                th2 = null;
                break;
            case 7:
                l1Var = l1Var3;
                context4 = context6;
                f10 = f12;
                list = list2;
                jVar.L(-1207432148);
                boolean zBooleanValue7 = r3Var23.getValue().booleanValue();
                jVar.L(-1207431566);
                boolean zL56 = jVar.l(fgVar4);
                Object objG58 = jVar.g();
                if (zL56 || objG58 == obj7) {
                    objG58 = new c9.f0(fgVar4, 1);
                    jVar.C(objG58);
                }
                eh.l lVar45 = (eh.l) objG58;
                jVar.B();
                boolean zD02 = b8.D0(r3Var24);
                jVar.L(-1207427015);
                boolean zL57 = jVar.l(fgVar4);
                Object objG59 = jVar.g();
                if (zL57 || objG59 == obj7) {
                    objG59 = new androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.m(fgVar4, 1);
                    jVar.C(objG59);
                }
                eh.l lVar46 = (eh.l) objG59;
                jVar.B();
                String value17 = r3Var25.getValue();
                jVar.L(-1207422732);
                boolean zL58 = jVar.l(fgVar4);
                Object objG60 = jVar.g();
                if (zL58 || objG60 == obj7) {
                    objG60 = new eh.l() { // from class: f9.tc
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            String it = (String) obj9;
                            kotlin.jvm.internal.r.e(it, "it");
                            sh.z0 z0Var = fgVar4.A0;
                            z0Var.getClass();
                            z0Var.j(null, it);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG60);
                }
                eh.l lVar47 = (eh.l) objG60;
                jVar.B();
                String strB0 = b8.B0(this.f10425w0);
                jVar.L(-1207417828);
                boolean zL59 = jVar.l(fgVar4);
                Object objG61 = jVar.g();
                if (zL59 || objG61 == obj7) {
                    objG61 = new eh.l() { // from class: f9.uc
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            String it = (String) obj9;
                            kotlin.jvm.internal.r.e(it, "it");
                            sh.z0 z0Var = fgVar4.G0;
                            z0Var.getClass();
                            z0Var.j(null, it);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG61);
                }
                eh.l lVar48 = (eh.l) objG61;
                jVar.B();
                boolean zBooleanValue8 = r3Var26.getValue().booleanValue();
                jVar.L(-1207412676);
                boolean zL60 = jVar.l(fgVar4);
                Object objG62 = jVar.g();
                if (zL60 || objG62 == obj7) {
                    objG62 = new eh.l() { // from class: f9.vc
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            Boolean bool = (Boolean) obj9;
                            bool.getClass();
                            sh.z0 z0Var = fgVar4.K0;
                            z0Var.getClass();
                            z0Var.j(null, bool);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG62);
                }
                eh.l lVar49 = (eh.l) objG62;
                jVar.B();
                String value18 = r3Var27.getValue();
                jVar.L(-1207407621);
                boolean zL61 = jVar.l(fgVar4);
                Object objG63 = jVar.g();
                if (zL61 || objG63 == obj7) {
                    lVar2 = lVar45;
                    objG63 = new xc(fgVar4, 0);
                    jVar.C(objG63);
                } else {
                    lVar2 = lVar45;
                }
                eh.l lVar50 = (eh.l) objG63;
                jVar.B();
                String strZ0 = b8.z0(this.f10431z0);
                jVar.L(-1207402403);
                boolean zL62 = jVar.l(fgVar4);
                Object objG64 = jVar.g();
                if (zL62 || objG64 == obj7) {
                    str4 = strZ0;
                    objG64 = new b9.q1(fgVar4, 1);
                    jVar.C(objG64);
                } else {
                    str4 = strZ0;
                }
                eh.l lVar51 = (eh.l) objG64;
                jVar.B();
                boolean zA02 = b8.A0(this.A0);
                jVar.L(-1207396832);
                boolean zL63 = jVar.l(fgVar4);
                Object objG65 = jVar.g();
                if (zL63 || objG65 == obj7) {
                    z14 = zA02;
                    objG65 = new yc(fgVar4, 0);
                    jVar.C(objG65);
                } else {
                    z14 = zA02;
                }
                eh.l lVar52 = (eh.l) objG65;
                jVar.B();
                boolean zBooleanValue9 = r3Var28.getValue().booleanValue();
                jVar.L(-1207390974);
                boolean zL64 = jVar.l(fgVar4);
                Object objG66 = jVar.g();
                if (zL64 || objG66 == obj7) {
                    z15 = zBooleanValue9;
                    objG66 = new zc(fgVar4, 0);
                    jVar.C(objG66);
                } else {
                    z15 = zBooleanValue9;
                }
                eh.l lVar53 = (eh.l) objG66;
                jVar.B();
                String value19 = r3Var29.getValue();
                jVar.L(-1207385151);
                boolean zL65 = jVar.l(fgVar4);
                Object objG67 = jVar.g();
                if (zL65 || objG67 == obj7) {
                    objG67 = new eh.l() { // from class: f9.bd
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            String it = (String) obj9;
                            kotlin.jvm.internal.r.e(it, "it");
                            sh.z0 z0Var = fgVar4.C0;
                            z0Var.getClass();
                            z0Var.j(null, it);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG67);
                }
                eh.l lVar54 = (eh.l) objG67;
                jVar.B();
                boolean zC0 = b8.C0(this.D0);
                jVar.L(-1207379165);
                boolean zL66 = jVar.l(fgVar4);
                Object objG68 = jVar.g();
                if (zL66 || objG68 == obj7) {
                    str5 = value19;
                    objG68 = new cd(fgVar4, 0);
                    jVar.C(objG68);
                } else {
                    str5 = value19;
                }
                eh.l lVar55 = (eh.l) objG68;
                jVar.B();
                String strE02 = b8.E0(this.E0);
                jVar.L(-1207372438);
                boolean zL67 = jVar.l(fgVar4);
                Object objG69 = jVar.g();
                if (zL67 || objG69 == obj7) {
                    str6 = strE02;
                    objG69 = new androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.m(fgVar4, 2);
                    jVar.C(objG69);
                } else {
                    str6 = strE02;
                }
                eh.l lVar56 = (eh.l) objG69;
                jVar.B();
                String strF0 = b8.F0(this.F0);
                jVar.L(-1207366076);
                boolean zL68 = jVar.l(fgVar4);
                Object objG70 = jVar.g();
                if (zL68 || objG70 == obj7) {
                    str7 = strF0;
                    objG70 = new c9.u0(fgVar4, 1);
                    jVar.C(objG70);
                } else {
                    str7 = strF0;
                }
                eh.l lVar57 = (eh.l) objG70;
                jVar.B();
                boolean zBooleanValue10 = r3Var30.getValue().booleanValue();
                jVar.L(-1207360482);
                boolean zL69 = jVar.l(fgVar4);
                Object objG71 = jVar.g();
                if (zL69 || objG71 == obj7) {
                    objG71 = new dd(fgVar4, 0);
                    jVar.C(objG71);
                }
                eh.l lVar58 = (eh.l) objG71;
                jVar.B();
                String value20 = r3Var31.getValue();
                jVar.L(-1207355171);
                boolean zL70 = jVar.l(fgVar4);
                Object objG72 = jVar.g();
                if (zL70 || objG72 == obj7) {
                    objG72 = new eh.l() { // from class: f9.ed
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            String it = (String) obj9;
                            kotlin.jvm.internal.r.e(it, "it");
                            sh.z0 z0Var = fgVar4.D0;
                            z0Var.getClass();
                            z0Var.j(null, it);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG72);
                }
                eh.l lVar59 = (eh.l) objG72;
                jVar.B();
                boolean zY0 = b8.y0(this.I0);
                jVar.L(-1207349697);
                boolean zL71 = jVar.l(fgVar4);
                Object objG73 = jVar.g();
                if (zL71 || objG73 == obj7) {
                    objG73 = new eh.l() { // from class: f9.gd
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            Boolean bool = (Boolean) obj9;
                            bool.getClass();
                            sh.z0 z0Var = fgVar4.I0;
                            z0Var.getClass();
                            z0Var.j(null, bool);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG73);
                }
                jVar.B();
                n1Var = n1Var2;
                aVar = aVar3;
                b8.d(zBooleanValue7, lVar2, zD02, lVar46, value17, lVar47, strB0, lVar48, zBooleanValue8, lVar49, value18, lVar50, str4, lVar51, z14, lVar52, z15, lVar53, str5, lVar54, zC0, lVar55, str6, lVar56, str7, lVar57, zBooleanValue10, lVar58, value20, lVar59, zY0, (eh.l) objG73, f1.c.b(-1563878339, new d(fgVar4), jVar), b8.u0(n1Var2), jVar, 0);
                jVar.B();
                pg.f0 f0Var8 = pg.f0.f21461a;
                fgVar = fgVar4;
                jVar2 = jVar;
                obj2 = obj7;
                context = context4;
                z10 = false;
                th2 = null;
                break;
            case 8:
                context4 = context6;
                f10 = f12;
                jVar.L(-1207338882);
                String value21 = r3Var3.getValue();
                String value23 = r3Var13.getValue();
                String str13 = r3Var15.getValue() + " (" + r3Var14.getValue() + ")";
                String strU2 = b8.U(r3Var2);
                int iHashCode = strU2.hashCode();
                if (iHashCode == 110834) {
                    if (strU2.equals(ProjectKind.PDF)) {
                        jVar.L(-1207333621);
                        strD = f3.q.d(R.string.editor_selected_file, new Object[]{r3Var6.getValue()}, jVar);
                        jVar.B();
                    }
                    String value24 = r3Var16.getValue();
                    String strD2 = f3.q.d(R.string.editor_summary_display, new Object[]{f3.q.c(kotlin.jvm.internal.r.a(value24, "landscape") ? R.string.editor_orientation_landscape : kotlin.jvm.internal.r.a(value24, "auto") ? R.string.editor_orientation_auto : R.string.editor_orientation_portrait, jVar), r3Var17.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207293356, R.string.common_yes, jVar) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207292045, R.string.common_no, jVar), r3Var18.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207289260, R.string.common_yes, jVar) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207287949, R.string.common_no, jVar), r3Var19.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207285196, R.string.common_yes, jVar) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207283885, R.string.common_no, jVar), r3Var5.getValue()}, jVar);
                    size = r3Var11.getValue().size();
                    if (!mh.x.A(r3Var21.getValue())) {
                    }
                    if (!mh.x.A(r3Var22.getValue())) {
                    }
                    iEnabledCount = WebViewSettingsKt.enabledCount(r3Var7.getValue());
                    if (r3Var23.getValue().booleanValue()) {
                    }
                } else if (iHashCode != 116079) {
                    if (iHashCode == 106438291 && strU2.equals("paste")) {
                        jVar.L(-1207327530);
                        strD = f3.q.d(R.string.editor_pasted_html, new Object[]{Integer.valueOf(r3Var8.getValue().length())}, jVar);
                        jVar.B();
                    } else {
                        jVar.L(-1207320875);
                        jVar.L(-1207316817);
                        String value25 = r3Var10.getValue();
                        if (mh.x.A(value25)) {
                            value25 = f3.q.c(R.string.editor_button_select_html, jVar);
                        }
                        jVar.B();
                        strD = f3.q.d(R.string.editor_selected_file, new Object[]{value25}, jVar);
                        jVar.B();
                    }
                    String value242 = r3Var16.getValue();
                    String strD22 = f3.q.d(R.string.editor_summary_display, new Object[]{f3.q.c(kotlin.jvm.internal.r.a(value242, "landscape") ? R.string.editor_orientation_landscape : kotlin.jvm.internal.r.a(value242, "auto") ? R.string.editor_orientation_auto : R.string.editor_orientation_portrait, jVar), r3Var17.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207293356, R.string.common_yes, jVar) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207292045, R.string.common_no, jVar), r3Var18.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207289260, R.string.common_yes, jVar) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207287949, R.string.common_no, jVar), r3Var19.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207285196, R.string.common_yes, jVar) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207283885, R.string.common_no, jVar), r3Var5.getValue()}, jVar);
                    size = r3Var11.getValue().size();
                    String strB2 = !mh.x.A(r3Var21.getValue()) ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207275898, R.string.editor_summary_icon_selected, jVar) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207273115, R.string.editor_summary_icon_default, jVar);
                    strB = !mh.x.A(r3Var22.getValue()) ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207268952, R.string.editor_summary_splash_selected, jVar) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207266105, R.string.editor_summary_splash_default, jVar);
                    iEnabledCount = WebViewSettingsKt.enabledCount(r3Var7.getValue());
                    if (!r3Var23.getValue().booleanValue() || ((!b8.D0(r3Var24) && mh.x.A(r3Var25.getValue())) || (!b8.D0(r3Var24) && ((!r3Var26.getValue().booleanValue() || (!b8.D0(r3Var24) && mh.x.A(r3Var27.getValue()))) && ((!r3Var28.getValue().booleanValue() || (!b8.D0(r3Var24) && mh.x.A(r3Var29.getValue()))) && (!r3Var30.getValue().booleanValue() || (!b8.D0(r3Var24) && mh.x.A(r3Var31.getValue())))))))) {
                        i15 = size;
                        str8 = str13;
                        str9 = value21;
                        str10 = strD;
                        str11 = value23;
                        str12 = strB;
                        i16 = iEnabledCount;
                        z16 = false;
                    } else {
                        i15 = size;
                        str8 = str13;
                        str9 = value21;
                        str10 = strD;
                        str11 = value23;
                        str12 = strB;
                        i16 = iEnabledCount;
                        z16 = true;
                    }
                    jVar.L(-1207241723);
                    zK = jVar.K(l1Var3);
                    String str14 = str9;
                    objG12 = jVar.g();
                    if (!zK || objG12 == obj7) {
                        objG12 = new eh.l() { // from class: f9.hd
                            @Override // eh.l
                            public final Object invoke(Object obj9) {
                                l1Var3.f(((Integer) obj9).intValue());
                                return pg.f0.f21461a;
                            }
                        };
                        jVar.C(objG12);
                    }
                    jVar.B();
                    int i17 = i15;
                    jVar2 = jVar;
                    l1Var = l1Var3;
                    list = list2;
                    b8.E(str14, str11, str8, str10, strD22, i17, strB2, str12, i16, z16, (eh.l) objG12, jVar2, 0);
                    jVar2.B();
                    pg.f0 f0Var9 = pg.f0.f21461a;
                    obj2 = obj7;
                    fgVar = fgVar4;
                    n1Var = n1Var2;
                    aVar = aVar3;
                    context = context4;
                    z10 = false;
                    th2 = null;
                    break;
                } else {
                    if (strU2.equals("url")) {
                        jVar.L(-1207330436);
                        jVar.B();
                        strD = m3.a.a("URL: ", fg.p(r3Var9.getValue()));
                    }
                    String value2422 = r3Var16.getValue();
                    String strD222 = f3.q.d(R.string.editor_summary_display, new Object[]{f3.q.c(kotlin.jvm.internal.r.a(value2422, "landscape") ? R.string.editor_orientation_landscape : kotlin.jvm.internal.r.a(value2422, "auto") ? R.string.editor_orientation_auto : R.string.editor_orientation_portrait, jVar), r3Var17.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207293356, R.string.common_yes, jVar) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207292045, R.string.common_no, jVar), r3Var18.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207289260, R.string.common_yes, jVar) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207287949, R.string.common_no, jVar), r3Var19.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207285196, R.string.common_yes, jVar) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -1207283885, R.string.common_no, jVar), r3Var5.getValue()}, jVar);
                    size = r3Var11.getValue().size();
                    if (!mh.x.A(r3Var21.getValue())) {
                    }
                    if (!mh.x.A(r3Var22.getValue())) {
                    }
                    iEnabledCount = WebViewSettingsKt.enabledCount(r3Var7.getValue());
                    if (r3Var23.getValue().booleanValue()) {
                        i15 = size;
                        str8 = str13;
                        str9 = value21;
                        str10 = strD;
                        str11 = value23;
                        str12 = strB;
                        i16 = iEnabledCount;
                        z16 = false;
                        jVar.L(-1207241723);
                        zK = jVar.K(l1Var3);
                        String str142 = str9;
                        objG12 = jVar.g();
                        if (!zK) {
                            objG12 = new eh.l() { // from class: f9.hd
                                @Override // eh.l
                                public final Object invoke(Object obj9) {
                                    l1Var3.f(((Integer) obj9).intValue());
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar.C(objG12);
                            jVar.B();
                            int i172 = i15;
                            jVar2 = jVar;
                            l1Var = l1Var3;
                            list = list2;
                            b8.E(str142, str11, str8, str10, strD222, i172, strB2, str12, i16, z16, (eh.l) objG12, jVar2, 0);
                            jVar2.B();
                            pg.f0 f0Var92 = pg.f0.f21461a;
                            obj2 = obj7;
                            fgVar = fgVar4;
                            n1Var = n1Var2;
                            aVar = aVar3;
                            context = context4;
                            z10 = false;
                            th2 = null;
                        }
                    }
                }
                break;
            case 9:
                jVar.L(-1207237668);
                final x0.r3<String> r3Var32 = this.C;
                String strP0 = b8.p0(r3Var32);
                jVar.L(-1207236522);
                boolean zL72 = jVar.l(fgVar4);
                Object objG74 = jVar.g();
                if (zL72 || objG74 == obj7) {
                    objG74 = new a9.n0(fgVar4, 2);
                    jVar.C(objG74);
                }
                eh.l lVar60 = (eh.l) objG74;
                jVar.B();
                Long lQ0 = b8.q0(this.K0);
                jVar.L(-1207232452);
                boolean zL73 = jVar.l(fgVar4);
                Object objG75 = jVar.g();
                if (zL73 || objG75 == obj7) {
                    objG75 = new eh.l() { // from class: f9.jd
                        @Override // eh.l
                        public final Object invoke(Object obj9) {
                            fgVar4.f9583p0.setValue((Long) obj9);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar.C(objG75);
                }
                eh.l lVar61 = (eh.l) objG75;
                jVar.B();
                List listR0 = b8.r0(this.L0);
                boolean zBooleanValue11 = r3Var12.getValue().booleanValue();
                jVar.L(-1207225551);
                boolean zK6 = jVar.K(r3Var32) | jVar.K(r3Var12) | jVar.l(xVar2) | jVar.l(i0Var) | jVar.l(fgVar4) | jVar.l(context6);
                Object objG76 = jVar.g();
                if (zK6 || objG76 == obj7) {
                    context5 = context6;
                    objG76 = new eh.a() { // from class: f9.kd
                        @Override // eh.a
                        public final Object invoke() {
                            boolean zA5 = kotlin.jvm.internal.r.a((String) r3Var32.getValue(), "aab");
                            p5.x xVar3 = xVar2;
                            if (!zA5 || ((Boolean) r3Var12.getValue()).booleanValue()) {
                                ph.h.c(i0Var, null, null, new rd.e(fgVar4, xVar3, context5, null), 3);
                            } else {
                                p5.x.c(e2.r.f24648c.f24627a, xVar3);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    xVar = xVar2;
                    fgVar3 = fgVar4;
                    jVar.C(objG76);
                } else {
                    xVar = xVar2;
                    context5 = context6;
                    fgVar3 = fgVar4;
                }
                eh.a aVar14 = (eh.a) objG76;
                jVar.B();
                jVar.L(-1207192415);
                boolean zL74 = jVar.l(xVar);
                Object objG77 = jVar.g();
                if (zL74 || objG77 == obj7) {
                    z17 = true;
                    objG77 = new e9.e0(xVar, 1);
                    jVar.C(objG77);
                } else {
                    z17 = true;
                }
                eh.a aVar15 = (eh.a) objG77;
                jVar.B();
                jVar.L(-1207189303);
                boolean zL75 = jVar.l(xVar);
                Object objG78 = jVar.g();
                if (zL75 || objG78 == obj7) {
                    objG78 = new ld(xVar, 0);
                    jVar.C(objG78);
                }
                jVar.B();
                context4 = context5;
                f10 = f12;
                b8.p(strP0, lVar60, lQ0, lVar61, listR0, zBooleanValue11, aVar14, aVar15, (eh.a) objG78, jVar, 0);
                jVar.B();
                pg.f0 f0Var10 = pg.f0.f21461a;
                jVar2 = jVar;
                l1Var = l1Var3;
                obj2 = obj7;
                fgVar = fgVar3;
                n1Var = n1Var2;
                list = list2;
                aVar = aVar3;
                context = context4;
                z10 = false;
                th2 = null;
                break;
            default:
                jVar.L(1231938705);
                jVar.B();
                pg.f0 f0Var11 = pg.f0.f21461a;
                jVar2 = jVar;
                fgVar = fgVar4;
                obj2 = obj7;
                l1Var = l1Var3;
                n1Var = n1Var2;
                context = context6;
                f10 = f12;
                list = list2;
                aVar = aVar3;
                z10 = false;
                th2 = null;
                break;
        }
        jVar2.H();
        d.a aVar16 = aVar;
        p1.d.b(androidx.compose.foundation.layout.g.f(aVar16, 8), jVar2);
        androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(d0.h.f(androidx.compose.foundation.layout.g.d(aVar16, 1.0f)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, 7);
        z.m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14611j, jVar2, 6);
        int iC3 = c9.u1.c(jVar2);
        x0.a2 a2VarY3 = jVar2.y();
        androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarL, jVar2);
        e0.a aVarA3 = g.a.a();
        if (jVar2.t() == null) {
            c9.u1.d();
            throw th2;
        }
        jVar2.r();
        if (jVar2.m()) {
            jVar2.w(aVarA3);
        } else {
            jVar2.z();
        }
        ph.v1.j(g.a.c(), m1VarA, jVar2);
        ph.v1.j(g.a.e(), a2VarY3, jVar2);
        g.a.C0128a c0128aB3 = g.a.b();
        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC3))) {
            l9.i.a(iC3, jVar2, iC3, c0128aB3);
        }
        ph.v1.j(g.a.d(), dVarC4, jVar2);
        jVar2.L(-1207173251);
        int iX3 = b8.X(l1Var);
        z.o1 o1Var = z.o1.f34600a;
        if (iX3 > 0) {
            jVar2.L(-1207170334);
            l1Var2 = l1Var;
            boolean zK7 = jVar2.K(l1Var2);
            Object objG79 = jVar2.g();
            if (zK7 || objG79 == obj2) {
                objG79 = new c9.i1(l1Var2, 1);
                jVar2.C(objG79);
            }
            jVar2.B();
            x0.j jVar4 = jVar2;
            f11 = 1.0f;
            t0.x0.c((eh.a) objG79, o1Var.a(aVar16, 1.0f), false, null, null, null, null, f9.e.f9340b, jVar4, 805306368, 508);
            jVar3 = jVar4;
        } else {
            l1Var2 = l1Var;
            jVar3 = jVar2;
            f11 = 1.0f;
        }
        jVar3.B();
        jVar3.L(-1207161032);
        if (b8.X(l1Var2) < list.size() - 1) {
            final boolean zQ = b8.Q(fgVar, b8.X(l1Var2));
            final boolean z21 = (b8.X(l1Var2) != 7 || zQ) ? z10 : true;
            jVar3.L(-1207152726);
            final Context context7 = context;
            boolean zC = jVar3.c(zQ) | jVar3.K(l1Var2) | jVar3.c(z21) | jVar3.l(context7);
            Object objG80 = jVar3.g();
            if (zC || objG80 == obj2) {
                final x0.l1 l1Var4 = l1Var2;
                final x0.n1<Boolean> n1Var3 = n1Var;
                Object obj9 = new eh.a() { // from class: f9.md
                    @Override // eh.a
                    public final Object invoke() {
                        if (zQ) {
                            x0.l1 l1Var5 = l1Var4;
                            l1Var5.f(l1Var5.g() + 1);
                        } else if (z21) {
                            n1Var3.setValue(Boolean.TRUE);
                            Toast.makeText(context7, R.string.editor_error_admob_id_required_toast, 0).show();
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar3.C(obj9);
                objG80 = obj9;
            }
            eh.a aVar17 = (eh.a) objG80;
            jVar3.B();
            t0.x0.a(aVar17, o1Var.a(aVar16, f11), (zQ || z21) ? true : z10, null, null, null, null, null, f9.e.f9342c, jVar3, 805306368, 504);
        }
        jVar.B();
        jVar.H();
        jVar.H();
    }

    @Override // eh.q
    public final /* bridge */ /* synthetic */ pg.f0 b(z.i iVar, x0.j jVar, Integer num) throws Throwable {
        a(iVar, jVar, num.intValue());
        return pg.f0.f21461a;
    }
}
