package f9;

import android.app.Application;
import android.database.Cursor;
import android.net.Uri;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectFile;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.domain.model.WebViewSettings;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import l9.p0;
import l9.w;
import lh.e;
import lh.f;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.math.Primes;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;

/* loaded from: classes.dex */
public final class fg extends androidx.lifecycle.w0 {
    public static final mh.k X0 = new mh.k("^[a-z][a-z0-9_]*(\\.[a-z][a-z0-9_]*)+$");
    public final l9.q A;
    public final sh.z0 A0;
    public final sh.z0 B;
    public final sh.z0 B0;
    public final sh.z0 C;
    public final sh.z0 C0;
    public final sh.z0 D;
    public final sh.z0 D0;
    public final sh.z0 E;
    public final sh.z0 E0;
    public final sh.z0 F;
    public final sh.z0 F0;
    public r4 G;
    public final sh.z0 G0;
    public final sh.z0 H;
    public final sh.z0 H0;
    public final sh.z0 I;
    public final sh.z0 I0;
    public final sh.z0 J;
    public final sh.z0 J0;
    public final sh.z0 K;
    public final sh.z0 K0;
    public final sh.z0 L;
    public final sh.z0 L0;
    public final sh.z0 M;
    public final sh.z0 M0;
    public final sh.z0 N;
    public final sh.z0 N0;
    public final sh.z0 O;
    public final sh.z0 O0;
    public final sh.z0 P;
    public final sh.z0 P0;
    public final sh.z0 Q;
    public final sh.z0 Q0;
    public final sh.z0 R;
    public final sh.z0 R0;
    public final sh.z0 S;
    public final sh.z0 S0;
    public final sh.z0 T;
    public final sh.z0 T0;
    public final sh.z0 U;
    public final sh.z0 U0;
    public final sh.z0 V;
    public final sh.z0 V0;
    public final sh.z0 W;
    public final sh.z0 W0;
    public final sh.z0 X;
    public final sh.z0 Y;
    public final sh.z0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final sh.z0 f9553a0;

    /* renamed from: b, reason: collision with root package name */
    public final n8.s f9554b;

    /* renamed from: b0, reason: collision with root package name */
    public final sh.z0 f9555b0;

    /* renamed from: c, reason: collision with root package name */
    public final n8.l f9556c;

    /* renamed from: c0, reason: collision with root package name */
    public final sh.z0 f9557c0;

    /* renamed from: d, reason: collision with root package name */
    public final n8.m1 f9558d;

    /* renamed from: d0, reason: collision with root package name */
    public final sh.z0 f9559d0;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.l0 f9560e;

    /* renamed from: e0, reason: collision with root package name */
    public ph.l2 f9561e0;

    /* renamed from: f, reason: collision with root package name */
    public final Application f9562f;

    /* renamed from: f0, reason: collision with root package name */
    public final sh.z0 f9563f0;

    /* renamed from: g, reason: collision with root package name */
    public final n8.i f9564g;

    /* renamed from: g0, reason: collision with root package name */
    public final sh.z0 f9565g0;

    /* renamed from: h, reason: collision with root package name */
    public final sh.z0 f9566h;

    /* renamed from: h0, reason: collision with root package name */
    public ph.l2 f9567h0;

    /* renamed from: i, reason: collision with root package name */
    public final sh.z0 f9568i;

    /* renamed from: i0, reason: collision with root package name */
    public ph.l2 f9569i0;

    /* renamed from: j, reason: collision with root package name */
    public final sh.z0 f9570j;

    /* renamed from: j0, reason: collision with root package name */
    public ph.l2 f9571j0;

    /* renamed from: k, reason: collision with root package name */
    public final sh.z0 f9572k;

    /* renamed from: k0, reason: collision with root package name */
    public ph.l2 f9573k0;

    /* renamed from: l, reason: collision with root package name */
    public final sh.z0 f9574l;

    /* renamed from: l0, reason: collision with root package name */
    public ph.l2 f9575l0;

    /* renamed from: m, reason: collision with root package name */
    public final sh.z0 f9576m;

    /* renamed from: m0, reason: collision with root package name */
    public ph.l2 f9577m0;

    /* renamed from: n, reason: collision with root package name */
    public final sh.z0 f9578n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f9579n0;

    /* renamed from: o, reason: collision with root package name */
    public final sh.z0 f9580o;

    /* renamed from: o0, reason: collision with root package name */
    public final sh.z0 f9581o0;

    /* renamed from: p, reason: collision with root package name */
    public final sh.z0 f9582p;

    /* renamed from: p0, reason: collision with root package name */
    public final sh.z0 f9583p0;

    /* renamed from: q, reason: collision with root package name */
    public final sh.z0 f9584q;

    /* renamed from: q0, reason: collision with root package name */
    public final sh.z0 f9585q0;

    /* renamed from: r, reason: collision with root package name */
    public final sh.z0 f9586r;

    /* renamed from: r0, reason: collision with root package name */
    public final sh.z0 f9587r0;

    /* renamed from: s, reason: collision with root package name */
    public final sh.z0 f9588s;

    /* renamed from: s0, reason: collision with root package name */
    public final sh.z0 f9589s0;

    /* renamed from: t, reason: collision with root package name */
    public final sh.z0 f9590t;

    /* renamed from: t0, reason: collision with root package name */
    public final sh.z0 f9591t0;

    /* renamed from: u, reason: collision with root package name */
    public final sh.z0 f9592u;

    /* renamed from: u0, reason: collision with root package name */
    public final sh.z0 f9593u0;

    /* renamed from: v, reason: collision with root package name */
    public final sh.z0 f9594v;

    /* renamed from: v0, reason: collision with root package name */
    public final sh.z0 f9595v0;

    /* renamed from: w, reason: collision with root package name */
    public final sh.z0 f9596w;

    /* renamed from: w0, reason: collision with root package name */
    public final sh.z0 f9597w0;

    /* renamed from: x, reason: collision with root package name */
    public final sh.z0 f9598x;

    /* renamed from: x0, reason: collision with root package name */
    public final sh.z0 f9599x0;

    /* renamed from: y, reason: collision with root package name */
    public final sh.z0 f9600y;

    /* renamed from: y0, reason: collision with root package name */
    public final sh.z0 f9601y0;

    /* renamed from: z, reason: collision with root package name */
    public final sh.z0 f9602z;

    /* renamed from: z0, reason: collision with root package name */
    public final sh.z0 f9603z0;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$1", f = "ProjectEditorViewModel.kt", l = {203}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f9604a;

        /* renamed from: f9.fg$a$a, reason: collision with other inner class name */
        public static final class C0097a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ fg f9606a;

            public C0097a(fg fgVar) {
                this.f9606a = fgVar;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                this.f9606a.f9570j.setValue((List) obj);
                return pg.f0.f21461a;
            }
        }

        public a(tg.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return fg.this.new a(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f9604a;
            if (i10 == 0) {
                pg.q.b(obj);
                fg fgVar = fg.this;
                sh.f<List<KeystoreEntity>> fVarE = fgVar.f9556c.e();
                C0097a c0097a = new C0097a(fgVar);
                this.f9604a = 1;
                if (fVarE.b(c0097a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$2", f = "ProjectEditorViewModel.kt", l = {Primes.SMALL_FACTOR_LIMIT}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f9607a;

        public static final class a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.g0<Boolean> f9609a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fg f9610b;

            public a(kotlin.jvm.internal.g0<Boolean> g0Var, fg fgVar) {
                this.f9609a = g0Var;
                this.f9610b = fgVar;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Boolean] */
            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                ?? r42 = (T) ((Boolean) obj);
                boolean zBooleanValue = r42.booleanValue();
                kotlin.jvm.internal.g0<Boolean> g0Var = this.f9609a;
                Boolean bool = g0Var.f16327a;
                Boolean bool2 = Boolean.FALSE;
                if (kotlin.jvm.internal.r.a(bool, bool2) && zBooleanValue) {
                    sh.z0 z0Var = this.f9610b.f9599x0;
                    z0Var.getClass();
                    z0Var.j(null, bool2);
                }
                g0Var.f16327a = r42;
                return pg.f0.f21461a;
            }
        }

        public b(tg.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return fg.this.new b(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f9607a;
            if (i10 == 0) {
                pg.q.b(obj);
                kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
                fg fgVar = fg.this;
                n8.g1 g1Var = fgVar.f9558d.f18530f;
                a aVar2 = new a(g0Var, fgVar);
                this.f9607a = 1;
                if (g1Var.b(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$3", f = "ProjectEditorViewModel.kt", l = {217}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f9611a;

        public static final class a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ fg f9613a;

            public a(fg fgVar) {
                this.f9613a = fgVar;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                fg fgVar;
                sh.j0 j0Var;
                ProjectEntity projectEntityCopy$default;
                String str = (String) obj;
                fg fgVar2 = this.f9613a;
                sh.z0 z0Var = fgVar2.f9588s;
                String str2 = (String) z0Var.getValue();
                if (mh.x.A(str2) || mh.t.p(str2, "com.htmltoapk.", false)) {
                    mh.k kVar = fg.X0;
                    z0Var.setValue(f.a(str));
                }
                sh.z0 z0Var2 = fgVar2.f9566h;
                ProjectEntity projectEntity = (ProjectEntity) z0Var2.getValue();
                if (projectEntity != null) {
                    fgVar = fgVar2;
                    j0Var = z0Var2;
                    projectEntityCopy$default = ProjectEntity.copy$default(projectEntity, 0L, str, str, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -7, -1, 15, null);
                } else {
                    fgVar = fgVar2;
                    j0Var = z0Var2;
                    projectEntityCopy$default = null;
                }
                j0Var.setValue(projectEntityCopy$default);
                fg.h(fgVar);
                return pg.f0.f21461a;
            }
        }

        public c(tg.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return fg.this.new c(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f9611a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                throw new pg.g();
            }
            pg.q.b(obj);
            fg fgVar = fg.this;
            sh.z0 z0Var = fgVar.f9586r;
            a aVar2 = new a(fgVar);
            this.f9611a = 1;
            z0Var.b(aVar2, this);
            return aVar;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$4", f = "ProjectEditorViewModel.kt", l = {228}, m = "invokeSuspend")
    public static final class d extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f9614a;

        public static final class a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ fg f9616a;

            public a(fg fgVar) {
                this.f9616a = fgVar;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                fg fgVar;
                sh.j0 j0Var;
                ProjectEntity projectEntityCopy$default;
                String str = (String) obj;
                fg fgVar2 = this.f9616a;
                sh.z0 z0Var = fgVar2.f9566h;
                ProjectEntity projectEntity = (ProjectEntity) z0Var.getValue();
                if (projectEntity != null) {
                    fgVar = fgVar2;
                    j0Var = z0Var;
                    projectEntityCopy$default = ProjectEntity.copy$default(projectEntity, 0L, null, null, str, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -9, -1, 15, null);
                } else {
                    fgVar = fgVar2;
                    j0Var = z0Var;
                    projectEntityCopy$default = null;
                }
                j0Var.setValue(projectEntityCopy$default);
                fg.h(fgVar);
                return pg.f0.f21461a;
            }
        }

        public d(tg.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return fg.this.new d(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            ((d) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f9614a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                throw new pg.g();
            }
            pg.q.b(obj);
            fg fgVar = fg.this;
            sh.z0 z0Var = fgVar.f9588s;
            a aVar2 = new a(fgVar);
            this.f9614a = 1;
            z0Var.b(aVar2, this);
            return aVar;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$5", f = "ProjectEditorViewModel.kt", l = {234}, m = "invokeSuspend")
    public static final class e extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f9617a;

        public static final class a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ fg f9619a;

            public a(fg fgVar) {
                this.f9619a = fgVar;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                fg fgVar = this.f9619a;
                fgVar.f9560e.c(fg.E((WebViewSettings) obj), "webViewSettingsJson");
                fg.h(fgVar);
                return pg.f0.f21461a;
            }
        }

        public e(tg.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return fg.this.new e(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            ((e) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f9617a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                throw new pg.g();
            }
            pg.q.b(obj);
            fg fgVar = fg.this;
            sh.z0 z0Var = fgVar.W0;
            a aVar2 = new a(fgVar);
            this.f9617a = 1;
            z0Var.b(aVar2, this);
            return aVar;
        }
    }

    public static final class f {
        public static String a(String appName) {
            Object next;
            String string;
            kotlin.jvm.internal.r.e(appName, "appName");
            Iterator<String> it = mh.x.D(appName).iterator();
            while (true) {
                mh.f fVar = (mh.f) it;
                if (!fVar.hasNext()) {
                    next = null;
                    break;
                }
                next = fVar.next();
                if (!mh.x.A((String) next)) {
                    break;
                }
            }
            String str = (String) next;
            String strNormalize = Normalizer.normalize(mh.t.m(mh.t.m(mh.t.m(mh.t.m(mh.t.m(mh.t.m(mh.t.m(mh.t.m(mh.t.m(mh.t.m(mh.t.m(mh.t.m(mh.t.m((str == null || (string = mh.x.W(str).toString()) == null) ? "" : mh.y.b0(50, string), (char) 305, 'i'), (char) 304, 'i'), 'I', 'i'), (char) 231, 'c'), (char) 199, 'c'), (char) 287, 'g'), (char) 286, 'g'), (char) 246, 'o'), (char) 214, 'o'), (char) 351, 's'), (char) 350, 's'), (char) 252, 'u'), (char) 220, 'u'), Normalizer.Form.NFD);
            kotlin.jvm.internal.r.d(strNormalize, "normalize(...)");
            Pattern patternCompile = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
            kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(strNormalize).replaceAll("");
            kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
            String lowerCase = strReplaceAll.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
            StringBuilder sb = new StringBuilder();
            int length = lowerCase.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = lowerCase.charAt(i10);
                if (('a' <= cCharAt && cCharAt < '{') || ('0' <= cCharAt && cCharAt < ':')) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            if (mh.x.A(string2)) {
                string2 = "app";
            } else {
                if (string2.length() == 0) {
                    throw new NoSuchElementException("Char sequence is empty.");
                }
                char cCharAt2 = string2.charAt(0);
                if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    string2 = "app".concat(string2);
                }
            }
            return "com.htmltoapk.".concat(mh.y.b0(30, string2));
        }

        public static boolean b(String packageName) {
            int length;
            kotlin.jvm.internal.r.e(packageName, "packageName");
            return !mh.x.A(packageName) && 3 <= (length = packageName.length()) && length < 101 && fg.X0.e(packageName);
        }

        public static pg.n c(String raw, String str) {
            kotlin.jvm.internal.r.e(raw, "raw");
            String string = mh.x.W(raw).toString();
            return mh.x.A(string) ? new pg.n(a(str), null) : b(string) ? new pg.n(string, null) : new pg.n(string, i8.n.d("Invalid package name: ", string, ". Use lowercase letters, digits or underscores with at least two segments (e.g. com.example.app)."));
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$discardProjectIfEmpty$1", f = "ProjectEditorViewModel.kt", l = {1430, 1432}, m = "invokeSuspend")
    public static final class g extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f9620a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ProjectEntity f9622c;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$discardProjectIfEmpty$1$1", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ fg f9623a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProjectEntity f9624b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fg fgVar, ProjectEntity projectEntity, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f9623a = fgVar;
                this.f9624b = projectEntity;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new a(this.f9623a, this.f9624b, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                fg fgVar = this.f9623a;
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                try {
                    ah.l.f(new File(fgVar.f9562f.getFilesDir(), "projects/" + this.f9624b.getId()));
                    ah.l.f(new File(fgVar.f9562f.getFilesDir(), "projects/draft"));
                } catch (Exception unused) {
                }
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ProjectEntity projectEntity, tg.e<? super g> eVar) {
            super(2, eVar);
            this.f9622c = projectEntity;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return fg.this.new g(this.f9622c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (ph.h.e(r7, r1, r6) == r0) goto L15;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f9620a;
            ProjectEntity projectEntity = this.f9622c;
            fg fgVar = fg.this;
            if (i10 == 0) {
                pg.q.b(obj);
                n8.s sVar = fgVar.f9554b;
                this.f9620a = 1;
                if (sVar.a(projectEntity, this) != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            pg.q.b(obj);
            fgVar.f9560e.b("placeholderProjectId");
            wh.c cVar = ph.z0.f21632a;
            wh.b bVar = wh.b.f31563c;
            a aVar2 = new a(fgVar, projectEntity, null);
            this.f9620a = 2;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$persistHtmlFile$2", f = "ProjectEditorViewModel.kt", l = {718, 726}, m = "invokeSuspend")
    public static final class h extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f9625a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9627c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f9628d;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$persistHtmlFile$2$1", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.n<? extends String, ? extends String>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ fg f9629a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Uri f9630b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f9631c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fg fgVar, Uri uri, long j10, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f9629a = fgVar;
                this.f9630b = uri;
                this.f9631c = j10;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new a(this.f9629a, this.f9630b, this.f9631c, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.n<? extends String, ? extends String>> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                String string = mh.x.W(this.f9629a.z(this.f9630b)).toString();
                if (mh.x.A(string)) {
                    string = "index.html";
                }
                String str = string;
                return new pg.n(str, this.f9629a.i(this.f9630b, this.f9631c, "content", str));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(eh.a<pg.f0> aVar, Uri uri, tg.e<? super h> eVar) {
            super(2, eVar);
            this.f9627c = aVar;
            this.f9628d = uri;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return fg.this.new h(this.f9627c, this.f9628d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
        
            if (r1.G(r0, r11) == r7) goto L27;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            fg fgVar = fg.this;
            sh.z0 z0Var = fgVar.f9582p;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f9625a;
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    Boolean bool = Boolean.TRUE;
                    z0Var.getClass();
                    z0Var.j(null, bool);
                    ProjectEntity projectEntity = (ProjectEntity) fgVar.f9566h.getValue();
                    long id2 = projectEntity != null ? projectEntity.getId() : 0L;
                    wh.c cVar = ph.z0.f21632a;
                    wh.b bVar = wh.b.f31563c;
                    a aVar2 = new a(fgVar, this.f9628d, id2, null);
                    this.f9625a = 1;
                    obj = ph.h.e(bVar, aVar2, this);
                    if (obj == aVar) {
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    this.f9627c.invoke();
                    Boolean bool2 = Boolean.FALSE;
                    z0Var.getClass();
                    z0Var.j(null, bool2);
                    return pg.f0.f21461a;
                }
                pg.q.b(obj);
                pg.n nVar = (pg.n) obj;
                String str = (String) nVar.f21469a;
                String str2 = (String) nVar.f21470b;
                int i11 = 0;
                if (str2 == null) {
                    BuildLogger.INSTANCE.error(R.string.build_log_editor_html_copy_failed, new Object[0]);
                    Application application = fgVar.f9562f;
                    Toast.makeText(application, application.getString(R.string.editor_asset_copy_failed), 0).show();
                    Boolean bool22 = Boolean.FALSE;
                    z0Var.getClass();
                    z0Var.j(null, bool22);
                    return pg.f0.f21461a;
                }
                fgVar.F.setValue(Uri.fromFile(new File(str2)));
                fgVar.C.setValue(str);
                qg qgVar = new qg(str2, i11);
                this.f9625a = 2;
            } catch (Throwable th2) {
                Boolean bool3 = Boolean.FALSE;
                z0Var.getClass();
                z0Var.j(null, bool3);
                throw th2;
            }
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$persistIconFile$1", f = "ProjectEditorViewModel.kt", l = {802}, m = "invokeSuspend")
    public static final class i extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f9632a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f9634c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Uri uri, tg.e<? super i> eVar) {
            super(2, eVar);
            this.f9634c = uri;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return fg.this.new i(this.f9634c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            fg fgVar = fg.this;
            sh.z0 z0Var = fgVar.f9574l;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f9632a;
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    Boolean bool = Boolean.TRUE;
                    z0Var.getClass();
                    z0Var.j(null, bool);
                    String string = mh.x.W(fgVar.z(this.f9634c)).toString();
                    if (!mh.t.i(string, ".png", true) && !mh.t.i(string, ".jpg", true) && !mh.t.i(string, ".jpeg", true) && !mh.t.i(string, ".webp", true)) {
                        string = "icon.png";
                    }
                    String str = string;
                    ProjectEntity projectEntity = (ProjectEntity) fgVar.f9566h.getValue();
                    final String strI = fgVar.i(this.f9634c, projectEntity != null ? projectEntity.getId() : 0L, "icons", str);
                    if (strI != null) {
                        fgVar.I.setValue(Uri.fromFile(new File(strI)));
                        sh.z0 z0Var2 = fgVar.H;
                        z0Var2.getClass();
                        z0Var2.j(null, str);
                        eh.l<? super ProjectEntity, ProjectEntity> lVar = new eh.l() { // from class: f9.rg
                            @Override // eh.l
                            public final Object invoke(Object obj2) {
                                return ProjectEntity.copy$default((ProjectEntity) obj2, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, strI, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -8193, -1, 15, null);
                            }
                        };
                        this.f9632a = 1;
                        if (fgVar.G(lVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        BuildLogger.INSTANCE.error(R.string.build_log_editor_icon_copy_failed, new Object[0]);
                        Application application = fgVar.f9562f;
                        Toast.makeText(application, application.getString(R.string.editor_asset_copy_failed), 0).show();
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                Boolean bool2 = Boolean.FALSE;
                z0Var.getClass();
                z0Var.j(null, bool2);
                return pg.f0.f21461a;
            } catch (Throwable th2) {
                Boolean bool3 = Boolean.FALSE;
                z0Var.getClass();
                z0Var.j(null, bool3);
                throw th2;
            }
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$runQualityCheck$1", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class j extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {
        public j(tg.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return fg.this.new j(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            int i10;
            int i11;
            ArrayList arrayList;
            p0.c cVarA;
            p0.c cVarA2;
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            fg fgVar = fg.this;
            List list = (List) fgVar.Z.getValue();
            Set<String> set = l9.o0.f16861a;
            ArrayList arrayList2 = new ArrayList(qg.p.h(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ProjectFile) it.next()).getRelativePath());
            }
            String strA = l9.o0.a(arrayList2);
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (kotlin.jvm.internal.r.a(((ProjectFile) next).getRelativePath(), strA)) {
                    break;
                }
            }
            ProjectFile projectFile = (ProjectFile) next;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((ProjectFile) obj2).getType() == ProjectFile.Type.CSS) {
                    arrayList3.add(obj2);
                }
            }
            String strI = qg.x.I(arrayList3, "\n", null, null, new fh(fgVar, 0), 30);
            if (mh.x.A(strI)) {
                strI = null;
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list) {
                if (((ProjectFile) obj3).getType() == ProjectFile.Type.JS) {
                    arrayList4.add(obj3);
                }
            }
            String strI2 = qg.x.I(arrayList4, "\n", null, null, new e8(fgVar, 1), 30);
            if (mh.x.A(strI2)) {
                strI2 = null;
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : list) {
                if (((ProjectFile) obj4).getType() == ProjectFile.Type.ASSET) {
                    arrayList5.add(obj4);
                }
            }
            sh.z0 z0Var = fgVar.f9555b0;
            String strG = projectFile == null ? "" : fg.g(fgVar, projectFile);
            ArrayList arrayList6 = new ArrayList(qg.p.h(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList6.add(((ProjectFile) it3.next()).getName());
            }
            ArrayList arrayList7 = new ArrayList(qg.p.h(arrayList5, 10));
            int size = arrayList5.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj5 = arrayList5.get(i12);
                i12++;
                arrayList7.add(((ProjectFile) obj5).getName());
            }
            ArrayList arrayList8 = new ArrayList(qg.p.h(arrayList5, 10));
            int i13 = 0;
            for (int size2 = arrayList5.size(); i13 < size2; size2 = size2) {
                Object obj6 = arrayList5.get(i13);
                i13++;
                arrayList8.add(new Long(((ProjectFile) obj6).getSizeBytes()));
            }
            Integer numValueOf = Integer.valueOf(R.string.quality_syntax_unbalanced);
            ArrayList arrayList9 = new ArrayList();
            int i14 = 8;
            if (strG == null) {
                arrayList9.add(new p0.a(p0.a.EnumC0170a.f16867b, "HTML file is too large to inspect automatically.", Integer.valueOf(R.string.quality_html_too_large_to_inspect), i14));
            } else if (mh.x.A(strG)) {
                arrayList9.add(new p0.a(p0.a.EnumC0170a.f16866a, "HTML content is empty.", Integer.valueOf(R.string.quality_html_empty), i14));
            } else {
                w.a aVarC = l9.w.c(strG);
                Iterator<T> it4 = aVarC.f16909a.iterator();
                while (true) {
                    i10 = 12;
                    if (!it4.hasNext()) {
                        break;
                    }
                    arrayList9.add(new p0.a(p0.a.EnumC0170a.f16867b, m3.a.a("HTML: ", (String) it4.next()), (Integer) null, i10));
                }
                Iterator<T> it5 = aVarC.f16910b.iterator();
                while (it5.hasNext()) {
                    arrayList9.add(new p0.a(p0.a.EnumC0170a.f16867b, m3.a.a("HTML: ", (String) it5.next()), (Integer) null, i10));
                }
            }
            if (strI != null && (cVarA2 = l9.p0.a(strI, "CSS")) != null) {
                arrayList9.add(new p0.a(p0.a.EnumC0170a.f16867b, cVarA2.a(), numValueOf, (List<? extends Object>) qg.p.j(cVarA2.f16870a, Integer.valueOf(cVarA2.f16871b), Integer.valueOf(cVarA2.f16872c))));
            }
            if (strI2 != null && (cVarA = l9.p0.a(strI2, "JS")) != null) {
                arrayList9.add(new p0.a(p0.a.EnumC0170a.f16867b, cVarA.a(), numValueOf, (List<? extends Object>) qg.p.j(cVarA.f16870a, Integer.valueOf(cVarA.f16871b), Integer.valueOf(cVarA.f16872c))));
            }
            int size3 = arrayList8.size();
            long j10 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < size3) {
                Object obj7 = arrayList8.get(i16);
                i16++;
                int i17 = i15 + 1;
                if (i15 < 0) {
                    qg.p.o();
                    throw null;
                }
                long jLongValue = ((Number) obj7).longValue();
                j10 += jLongValue;
                if (jLongValue > 10485760) {
                    String str = (String) ((i15 < 0 || i15 >= arrayList7.size()) ? j2.y.a(i15, "#") : arrayList7.get(i15));
                    String strB = l9.p0.b(jLongValue);
                    i11 = size3;
                    arrayList = arrayList7;
                    arrayList9.add(new p0.a(p0.a.EnumC0170a.f16866a, p5.g0.a("'", str, "' exceeds 10 MB limit (", strB, ")."), Integer.valueOf(R.string.quality_file_size_exceeded), (List<? extends Object>) qg.p.j(str, strB)));
                } else {
                    i11 = size3;
                    arrayList = arrayList7;
                }
                i15 = i17;
                size3 = i11;
                arrayList7 = arrayList;
            }
            if (j10 > 52428800) {
                String strB2 = l9.p0.b(j10);
                arrayList9.add(new p0.a(p0.a.EnumC0170a.f16866a, i8.n.d("Total asset size exceeds 50 MB limit (", strB2, ")."), Integer.valueOf(R.string.quality_total_size_exceeded), (List<? extends Object>) c0.g0.c(strB2)));
            }
            if (strG != null && !mh.x.A(strG)) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                mh.n nVar = mh.n.f18276b;
                Iterator it6 = qg.p.j(new mh.k("src=[\"']([^\"']+)[\"']", nVar), new mh.k("href=[\"']([^\"']+)[\"']", nVar), new mh.k("url\\s*\\(([^)]+)\\)", nVar), new mh.k("background-image\\s*:\\s*url\\s*\\(([^)]+)\\)", nVar)).iterator();
                while (it6.hasNext()) {
                    f.a aVar2 = new f.a(mh.k.c((mh.k) it6.next(), strG));
                    while (aVar2.hasNext()) {
                        String strL = mh.x.L(mh.x.K(mh.x.W(((mh.h) aVar2.next()).a().get(1)).toString(), "'"), "\"", "\"");
                        if (!mh.x.A(strL) && !mh.t.p(strL, "http://", true) && !mh.t.p(strL, "https://", true) && !mh.t.p(strL, "data:", true) && !mh.t.p(strL, "blob:", true)) {
                            if (!mh.t.p(strL, "#", false) && !mh.t.p(strL, "javascript:", true)) {
                                String strT = mh.x.T(strL, '/', strL);
                                String strT2 = mh.x.T(strT, '\\', strT);
                                if (!mh.x.A(strT2)) {
                                    linkedHashSet.add(strT2);
                                }
                            }
                        }
                    }
                }
                List listC0 = qg.x.c0(linkedHashSet);
                ArrayList arrayList10 = new ArrayList();
                for (Object obj8 : listC0) {
                    String str2 = (String) obj8;
                    if (!arrayList6.isEmpty()) {
                        int size4 = arrayList6.size();
                        int i18 = 0;
                        while (i18 < size4) {
                            Object obj9 = arrayList6.get(i18);
                            i18++;
                            if (mh.t.j((String) obj9, str2, true)) {
                                break;
                            }
                        }
                    }
                    arrayList10.add(obj8);
                }
                int size5 = arrayList10.size();
                int i19 = 0;
                while (i19 < size5) {
                    Object obj10 = arrayList10.get(i19);
                    i19++;
                    String str3 = (String) obj10;
                    arrayList9.add(new p0.a(p0.a.EnumC0170a.f16867b, i8.n.d("HTML references '", str3, "' but it was not found in project files."), Integer.valueOf(R.string.quality_missing_reference), (List<? extends Object>) c0.g0.c(str3)));
                }
            }
            p0.b bVar = new p0.b(arrayList9);
            z0Var.getClass();
            z0Var.j(null, bVar);
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel", f = "ProjectEditorViewModel.kt", l = {1383}, m = "updateProjectInDb")
    public static final class k extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public fg f9636a;

        /* renamed from: b, reason: collision with root package name */
        public ProjectEntity f9637b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f9638c;

        /* renamed from: e, reason: collision with root package name */
        public int f9640e;

        public k(tg.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f9638c = obj;
            this.f9640e |= PKIFailureInfo.systemUnavail;
            mh.k kVar = fg.X0;
            return fg.this.G(null, this);
        }
    }

    public fg(n8.s projectRepository, n8.l keystoreRepository, n8.m1 settingsRepository, androidx.lifecycle.l0 savedStateHandle, Application application, n8.i folderRepository) {
        kotlin.jvm.internal.r.e(projectRepository, "projectRepository");
        kotlin.jvm.internal.r.e(keystoreRepository, "keystoreRepository");
        kotlin.jvm.internal.r.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.r.e(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.r.e(folderRepository, "folderRepository");
        this.f9554b = projectRepository;
        this.f9556c = keystoreRepository;
        this.f9558d = settingsRepository;
        this.f9560e = savedStateHandle;
        this.f9562f = application;
        this.f9564g = folderRepository;
        sh.z0 z0VarA = sh.a1.a(null);
        this.f9566h = z0VarA;
        this.f9568i = z0VarA;
        qg.z zVar = qg.z.f22752a;
        sh.z0 z0VarA2 = sh.a1.a(zVar);
        this.f9570j = z0VarA2;
        this.f9572k = z0VarA2;
        Boolean bool = Boolean.FALSE;
        sh.z0 z0VarA3 = sh.a1.a(bool);
        this.f9574l = z0VarA3;
        this.f9576m = z0VarA3;
        sh.z0 z0VarA4 = sh.a1.a(bool);
        this.f9578n = z0VarA4;
        this.f9580o = z0VarA4;
        sh.z0 z0VarA5 = sh.a1.a(bool);
        this.f9582p = z0VarA5;
        this.f9584q = z0VarA5;
        this.f9586r = F(savedStateHandle, "appName", "");
        this.f9588s = F(savedStateHandle, "packageName", "");
        this.f9590t = F(savedStateHandle, "versionCode", "1");
        this.f9592u = F(savedStateHandle, "versionName", "1.0");
        this.f9594v = F(savedStateHandle, "minSdk", "24");
        this.f9596w = F(savedStateHandle, "targetSdk", "36");
        this.f9598x = F(savedStateHandle, "maxSdk", "");
        this.f9600y = F(savedStateHandle, "contentSourceType", "local");
        this.f9602z = F(savedStateHandle, "sourceUrl", "");
        l9.q qVarA = c6.f.a(savedStateHandle, "rawHtml", new File(application.getFilesDir(), "html_drafts"), androidx.lifecycle.x0.a(this));
        this.A = qVarA;
        this.B = qVarA.f16873a;
        this.C = F(savedStateHandle, "htmlFileName", "");
        this.D = F(savedStateHandle, "pdfFileUri", null);
        this.E = F(savedStateHandle, "pdfFileName", "");
        this.F = F(savedStateHandle, "htmlFileUri", null);
        this.H = F(savedStateHandle, "iconFileName", "");
        this.I = F(savedStateHandle, "iconFileUri", null);
        this.J = F(savedStateHandle, "splashEnabled", bool);
        this.K = F(savedStateHandle, "splashFileName", "");
        this.L = F(savedStateHandle, "splashFileUri", null);
        this.M = F(savedStateHandle, "splashBgColor", "#0F1318");
        Boolean bool2 = Boolean.TRUE;
        this.N = F(savedStateHandle, "splashFadeOut", bool2);
        this.O = F(savedStateHandle, "splashLoaderStyle", "circle");
        this.P = F(savedStateHandle, "splashIconSize", Integer.valueOf(CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET));
        this.Q = F(savedStateHandle, "splashIconRadius", 16);
        this.R = F(savedStateHandle, "splashLoaderSize", 48);
        this.S = F(savedStateHandle, "splashSpacing", 28);
        this.T = F(savedStateHandle, "splashDuration", 2);
        this.U = F(savedStateHandle, "splashLoaderThickness", 4);
        this.V = F(savedStateHandle, "splashFadeDuration", 400);
        this.W = F(savedStateHandle, "splashLoaderColor", "#00E5CC");
        this.X = F(savedStateHandle, "splashFullScreen", bool);
        this.Y = F(savedStateHandle, "splashHideLoader", bool);
        this.Z = sh.a1.a(zVar);
        this.f9553a0 = sh.a1.a(null);
        this.f9555b0 = sh.a1.a(null);
        this.f9557c0 = sh.a1.a(bool);
        this.f9559d0 = sh.a1.a(null);
        this.f9563f0 = F(savedStateHandle, "permissions", qg.p.j("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.VIBRATE"));
        this.f9565g0 = sh.a1.a(qg.a0.f22708a);
        this.f9581o0 = F(savedStateHandle, "outputFormat", ProjectKind.APK);
        this.f9583p0 = F(savedStateHandle, "selectedKeystoreId", null);
        this.f9585q0 = F(savedStateHandle, "orientation", "portrait");
        this.f9587r0 = F(savedStateHandle, "showHeader", bool2);
        this.f9589s0 = F(savedStateHandle, "showActionBar", bool);
        this.f9591t0 = F(savedStateHandle, "keepScreenOn", bool);
        this.f9593u0 = F(savedStateHandle, "showCameraCutout", bool);
        this.f9595v0 = F(savedStateHandle, "desktopMode", bool);
        this.f9597w0 = F(savedStateHandle, "autoIncrementVersionCode", bool);
        this.f9599x0 = F(savedStateHandle, "showWatermark", bool);
        this.f9601y0 = F(savedStateHandle, "deepLinkScheme", "");
        this.f9603z0 = F(savedStateHandle, "admobEnabled", bool);
        this.A0 = F(savedStateHandle, "admobAppId", "");
        this.B0 = F(savedStateHandle, "admobBannerUnitId", "");
        this.C0 = F(savedStateHandle, "admobInterstitialUnitId", "");
        this.D0 = F(savedStateHandle, "admobRewardedUnitId", "");
        this.E0 = F(savedStateHandle, "admobBannerPosition", "bottom");
        this.F0 = F(savedStateHandle, "admobShowBannerOnStart", bool);
        this.G0 = F(savedStateHandle, "admobTestDeviceIds", "");
        this.H0 = F(savedStateHandle, "admobAutoLoadInterstitial", bool);
        this.I0 = F(savedStateHandle, "admobAutoLoadRewarded", bool);
        this.J0 = F(savedStateHandle, "admobUseTestAds", bool2);
        this.K0 = F(savedStateHandle, "admobBannerEnabled", bool);
        this.L0 = F(savedStateHandle, "admobInterstitialEnabled", bool);
        this.M0 = F(savedStateHandle, "admobRewardedEnabled", bool);
        this.N0 = F(savedStateHandle, "admobInterstitialIntervalSeconds", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.L0);
        this.O0 = F(savedStateHandle, "admobInterstitialPageCount", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.L0);
        this.P0 = F(savedStateHandle, "admobChildDirectedTreatment", -1);
        this.Q0 = F(savedStateHandle, "admobUnderAgeOfConsent", -1);
        this.R0 = F(savedStateHandle, "admobMaxAdContentRating", "");
        this.S0 = F(savedStateHandle, "umpDebugEnabled", bool);
        this.T0 = F(savedStateHandle, "umpDebugGeography", "DISABLED");
        this.U0 = F(savedStateHandle, "umpTestDeviceIds", "");
        this.V0 = F(savedStateHandle, "primaryColor", "#2196F3");
        String str = (String) savedStateHandle.a("webViewSettingsJson");
        this.W0 = sh.a1.a(r(str == null ? "{\"statusBarColor\":\"#000000\",\"navBarColor\":\"#000000\"}" : str));
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new a(null), 3);
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new b(null), 3);
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new c(null), 3);
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new d(null), 3);
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new e(null), 3);
    }

    public static String E(WebViewSettings webViewSettings) {
        try {
            return kotlinx.serialization.json.b.f16435d.c(WebViewSettings.Companion.serializer(), webViewSettings);
        } catch (Exception unused) {
            return "{}";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (r1.G(r2, r6) == r7) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(fg fgVar, String str, vg.c cVar) throws Throwable {
        sg sgVar;
        fg fgVar2;
        if (cVar instanceof sg) {
            sgVar = (sg) cVar;
            int i10 = sgVar.f10516d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                sgVar.f10516d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                sgVar = new sg(fgVar, cVar);
            }
        }
        sg sgVar2 = sgVar;
        Object objE = sgVar2.f10514b;
        ug.a aVar = ug.a.f29706a;
        fg fgVar3 = sgVar2.f10516d;
        try {
            if (fgVar3 == 0) {
                pg.q.b(objE);
                sh.z0 z0Var = fgVar.f9582p;
                Boolean bool = Boolean.TRUE;
                z0Var.getClass();
                z0Var.j(null, bool);
                try {
                    ProjectEntity projectEntity = (ProjectEntity) fgVar.f9566h.getValue();
                    long id2 = projectEntity != null ? projectEntity.getId() : 0L;
                    wh.c cVar2 = ph.z0.f21632a;
                    wh.b bVar = wh.b.f31563c;
                    tg tgVar = new tg(str, fgVar, id2, null);
                    sgVar2.f10513a = fgVar;
                    sgVar2.f10516d = 1;
                    objE = ph.h.e(bVar, tgVar, sgVar2);
                    if (objE != aVar) {
                        fgVar2 = fgVar;
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    fgVar3 = fgVar;
                    sh.z0 z0Var2 = fgVar3.f9582p;
                    Boolean bool2 = Boolean.FALSE;
                    z0Var2.getClass();
                    z0Var2.j(null, bool2);
                    throw th;
                }
            }
            if (fgVar3 != 1) {
                if (fgVar3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fgVar2 = sgVar2.f10513a;
                pg.q.b(objE);
                sh.z0 z0Var3 = fgVar2.f9582p;
                Boolean bool3 = Boolean.FALSE;
                z0Var3.getClass();
                z0Var3.j(null, bool3);
                return pg.f0.f21461a;
            }
            fgVar2 = sgVar2.f10513a;
            pg.q.b(objE);
            pg.n nVar = (pg.n) objE;
            String str2 = (String) nVar.f21469a;
            final File file = (File) nVar.f21470b;
            fgVar2.F.setValue(Uri.fromFile(file));
            fgVar2.C.setValue(file.getName());
            fgVar2.B.setValue(str2);
            eh.l<? super ProjectEntity, ProjectEntity> lVar = new eh.l() { // from class: f9.eg
                @Override // eh.l
                public final Object invoke(Object obj) {
                    ProjectEntity it = (ProjectEntity) obj;
                    mh.k kVar = fg.X0;
                    kotlin.jvm.internal.r.e(it, "it");
                    return ProjectEntity.copy$default(it, 0L, null, null, null, 0, null, 0, 0, null, null, file.getAbsolutePath(), null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -1025, -1, 15, null);
                }
            };
            sgVar2.f10513a = fgVar2;
            sgVar2.f10516d = 2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:6:0x0008, B:8:0x0014, B:10:0x001b, B:15:0x0032, B:17:0x0039, B:19:0x0043, B:24:0x0057, B:26:0x005e, B:28:0x006d, B:32:0x007e, B:34:0x0082, B:36:0x0095, B:39:0x00a1), top: B:43:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:6:0x0008, B:8:0x0014, B:10:0x001b, B:15:0x0032, B:17:0x0039, B:19:0x0043, B:24:0x0057, B:26:0x005e, B:28:0x006d, B:32:0x007e, B:34:0x0082, B:36:0x0095, B:39:0x00a1), top: B:43:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:6:0x0008, B:8:0x0014, B:10:0x001b, B:15:0x0032, B:17:0x0039, B:19:0x0043, B:24:0x0057, B:26:0x005e, B:28:0x006d, B:32:0x007e, B:34:0x0082, B:36:0x0095, B:39:0x00a1), top: B:43:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String g(fg fgVar, ProjectFile projectFile) {
        File file;
        int size;
        int i10;
        Object obj;
        File file2;
        String content = projectFile.getContent();
        if (content != null) {
            return content;
        }
        try {
            ProjectEntity projectEntity = (ProjectEntity) fgVar.f9566h.getValue();
            File file3 = new File(fgVar.w(projectEntity != null ? projectEntity.getId() : 0L), "content");
            String relativePath = projectFile.getRelativePath();
            if (mh.x.A(relativePath)) {
                relativePath = null;
            }
            File file4 = relativePath != null ? new File(file3, relativePath) : null;
            String path = projectFile.getUri().getPath();
            if (path == null) {
                file = null;
                ArrayList arrayListS = qg.o.s(new File[]{file4, file});
                size = arrayListS.size();
                i10 = 0;
                while (true) {
                    if (i10 < size) {
                        obj = null;
                        break;
                    }
                    obj = arrayListS.get(i10);
                    i10++;
                    if (((File) obj).isFile()) {
                        break;
                    }
                }
                file2 = (File) obj;
                if (file2 != null) {
                    return x(fgVar.f9562f.getContentResolver().openInputStream(projectFile.getUri()));
                }
                if (file2.length() <= 4194304) {
                    return x(new FileInputStream(file2));
                }
            } else {
                if (!kotlin.jvm.internal.r.a(projectFile.getUri().getScheme(), "file")) {
                    path = null;
                }
                if (path != null) {
                    file = new File(path);
                }
                ArrayList arrayListS2 = qg.o.s(new File[]{file4, file});
                size = arrayListS2.size();
                i10 = 0;
                while (true) {
                    if (i10 < size) {
                    }
                }
                file2 = (File) obj;
                if (file2 != null) {
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static final void h(fg fgVar) {
        if (fgVar.f9579n0 || fgVar.f9566h.getValue() == null) {
            return;
        }
        ph.l2 l2Var = fgVar.f9577m0;
        if (l2Var != null) {
            l2Var.cancel((CancellationException) null);
        }
        fgVar.f9577m0 = ph.h.c(androidx.lifecycle.x0.a(fgVar), null, null, new kh(fgVar, null), 3);
    }

    public static String p(String url) {
        kotlin.jvm.internal.r.e(url, "url");
        String string = mh.x.W(url).toString();
        return (mh.x.A(string) || mh.t.p(string, "http://", true) || mh.t.p(string, "https://", true)) ? string : "https://".concat(string);
    }

    public static List q(String str) {
        try {
            List listO = mh.x.O(mh.x.L(str, "[", "]"), new String[]{","});
            ArrayList arrayList = new ArrayList(qg.p.h(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(mh.x.K(mh.x.W((String) it.next()).toString(), "\""));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (!mh.x.A((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        } catch (Exception unused) {
            return qg.p.j("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE");
        }
    }

    public static WebViewSettings r(String str) {
        try {
            return (WebViewSettings) kotlinx.serialization.json.b.f16435d.b(WebViewSettings.Companion.serializer(), str);
        } catch (Exception unused) {
            return new WebViewSettings(false, false, false, false, false, false, false, false, false, false, 0, 0, (String) null, 0, false, false, false, false, false, false, false, (Boolean) null, false, (String) null, false, (String) null, 0, 0, 0, 0, 0, 0, 0, (String) null, false, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, 0, -1, 4194303, (kotlin.jvm.internal.j) null);
        }
    }

    public static String s(List list) {
        return i8.n.d("[", qg.x.I(list, ",", null, null, new p7(1), 30), "]");
    }

    public static String x(InputStream inputStream) {
        if (inputStream != null) {
            try {
                try {
                    byte[] bArr = new byte[65536];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    long j10 = 0;
                    while (true) {
                        int i10 = inputStream.read(bArr);
                        if (i10 <= 0) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            inputStream.close();
                            return string;
                        }
                        j10 += i10;
                        if (j10 > 4194304) {
                            inputStream.close();
                            return null;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                } finally {
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(ProjectEntity projectEntity, boolean z10, vg.c cVar) throws Throwable {
        bh bhVar;
        fg fgVar;
        if (cVar instanceof bh) {
            bhVar = (bh) cVar;
            int i10 = bhVar.f9139d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                bhVar.f9139d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                bhVar = new bh(this, cVar);
            }
        }
        Object obj = bhVar.f9137b;
        ug.a aVar = ug.a.f29706a;
        int i11 = bhVar.f9139d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fgVar = bhVar.f9136a;
            try {
                pg.q.b(obj);
                fgVar.f9579n0 = false;
                return pg.f0.f21461a;
            } catch (Throwable th2) {
                th = th2;
                fgVar.f9579n0 = false;
                throw th;
            }
        }
        pg.q.b(obj);
        ph.l2 l2Var = this.f9577m0;
        if (l2Var != null) {
            l2Var.cancel((CancellationException) null);
        }
        this.f9579n0 = true;
        try {
            bhVar.f9136a = this;
            bhVar.f9139d = 1;
            if (B(projectEntity, z10, bhVar) == aVar) {
                return aVar;
            }
            fgVar = this;
            fgVar.f9579n0 = false;
            return pg.f0.f21461a;
        } catch (Throwable th3) {
            th = th3;
            fgVar = this;
            fgVar.f9579n0 = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v69, types: [sh.j0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(ProjectEntity projectEntity, boolean z10, vg.c cVar) throws Throwable {
        ch chVar;
        String string;
        String strT;
        ProjectEntity projectEntity2;
        fg fgVar;
        String sourceUrl;
        sh.z0 z0Var;
        sh.z0 z0Var2;
        fg fgVar2;
        ProjectEntity projectEntity3;
        List listQ;
        String primaryColor;
        File file;
        wh.b bVar;
        eh ehVar;
        File file2;
        fg fgVar3;
        String primaryColor2;
        sh.z0 z0Var3;
        String str;
        File file3;
        File file4;
        Uri uriFromFile;
        String name;
        boolean z11 = z10;
        if (cVar instanceof ch) {
            chVar = (ch) cVar;
            int i10 = chVar.f9260g;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                chVar.f9260g = i10 - PKIFailureInfo.systemUnavail;
            } else {
                chVar = new ch(this, cVar);
            }
        }
        Object objK = chVar.f9258e;
        ug.a aVar = ug.a.f29706a;
        int i11 = chVar.f9260g;
        if (i11 == 0) {
            pg.q.b(objK);
            sh.z0 z0Var4 = this.f9586r;
            if (!z11 || !mh.x.A(projectEntity.getAppName()) || mh.x.A((CharSequence) z0Var4.getValue())) {
                z0Var4.setValue(projectEntity.getAppName());
            }
            String string2 = mh.x.W(projectEntity.getPackageName()).toString();
            String strA = f.a((String) z0Var4.getValue());
            sh.z0 z0Var5 = this.f9588s;
            if (!z11) {
                if (!f.b(string2)) {
                    string2 = strA;
                }
                z0Var5.setValue(string2);
            } else if (!mh.x.A(projectEntity.getPackageName()) && !kotlin.jvm.internal.r.a(projectEntity.getPackageName(), "com.htmltoapk.app")) {
                z0Var5.setValue(projectEntity.getPackageName());
            } else if (mh.x.A((CharSequence) z0Var5.getValue()) || kotlin.jvm.internal.r.a(z0Var5.getValue(), "com.htmltoapk.app")) {
                z0Var5.setValue(strA);
            }
            sh.z0 z0Var6 = this.f9590t;
            if (!z11 || projectEntity.getVersionCode() > 1 || mh.x.A((CharSequence) z0Var6.getValue())) {
                z0Var6.setValue(String.valueOf(projectEntity.getVersionCode()));
            }
            if (!z11 || !mh.x.A(projectEntity.getVersionName())) {
                this.f9592u.setValue(projectEntity.getVersionName());
            }
            sh.z0 z0Var7 = this.f9594v;
            if (!z11 || projectEntity.getMinSdk() != 24 || mh.x.A((CharSequence) z0Var7.getValue())) {
                z0Var7.setValue(String.valueOf(projectEntity.getMinSdk()));
            }
            sh.z0 z0Var8 = this.f9596w;
            if (!z11 || projectEntity.getTargetSdk() != 36 || mh.x.A((CharSequence) z0Var8.getValue())) {
                z0Var8.setValue(String.valueOf(projectEntity.getTargetSdk()));
            }
            if (!z11 || projectEntity.getMaxSdk() != null) {
                Integer maxSdk = projectEntity.getMaxSdk();
                if (maxSdk == null || (string = maxSdk.toString()) == null) {
                    string = "";
                }
                sh.z0 z0Var9 = this.f9598x;
                z0Var9.getClass();
                z0Var9.j(null, string);
            }
            sh.z0 z0Var10 = this.f9600y;
            if (!z11 || projectEntity.getSourcePath() != null || mh.x.A((CharSequence) z0Var10.getValue())) {
                z0Var10.setValue((projectEntity.getSourcePath() == null || !new File(projectEntity.getSourcePath()).isDirectory()) ? projectEntity.getContentSourceType() : "folder");
            }
            if (!z11 || ((sourceUrl = projectEntity.getSourceUrl()) != null && !mh.x.A(sourceUrl))) {
                String sourceUrl2 = projectEntity.getSourceUrl();
                if (sourceUrl2 == null) {
                    sourceUrl2 = "";
                }
                sh.z0 z0Var11 = this.f9602z;
                z0Var11.getClass();
                z0Var11.j(null, sourceUrl2);
            }
            if (!z11 || projectEntity.getSourcePath() != null) {
                if (projectEntity.getSourcePath() == null || !new File(projectEntity.getSourcePath()).isDirectory()) {
                    String sourcePath = projectEntity.getSourcePath();
                    strT = sourcePath != null ? mh.x.T(sourcePath, '/', sourcePath) : "";
                } else {
                    strT = new File(projectEntity.getSourcePath()).getName();
                    kotlin.jvm.internal.r.b(strT);
                }
                sh.z0 z0Var12 = this.C;
                z0Var12.getClass();
                z0Var12.j(null, strT);
            }
            ph.q0 q0Var = this.A.f16874b;
            chVar.f9254a = this;
            projectEntity2 = projectEntity;
            chVar.f9255b = projectEntity2;
            chVar.f9257d = z11;
            chVar.f9260g = 1;
            objK = q0Var.k(chVar);
            if (objK != aVar) {
                fgVar = this;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = chVar.f9257d;
                file2 = (File) chVar.f9256c;
                projectEntity2 = chVar.f9255b;
                fgVar3 = chVar.f9254a;
                pg.q.b(objK);
                fgVar = fgVar3;
                file = file2;
                if (kotlin.jvm.internal.r.a(projectEntity2.getContentSourceType(), ProjectKind.PDF)) {
                    sh.z0 z0Var13 = fgVar.D;
                    if (file == null) {
                        uriFromFile = null;
                        z0Var13.setValue(uriFromFile);
                        sh.z0 z0Var14 = fgVar.E;
                        name = file == null ? file.getName() : null;
                        if (name == null) {
                            name = "";
                        }
                        z0Var14.getClass();
                        z0Var14.j(null, name);
                    } else {
                        File file5 = file.isFile() ? file : null;
                        if (file5 != null) {
                            uriFromFile = Uri.fromFile(file5);
                        }
                        z0Var13.setValue(uriFromFile);
                        sh.z0 z0Var142 = fgVar.E;
                        if (file == null) {
                        }
                        if (name == null) {
                        }
                        z0Var142.getClass();
                        z0Var142.j(null, name);
                    }
                }
                if (file != null && file.exists() && !kotlin.jvm.internal.r.a(projectEntity2.getContentSourceType(), ProjectKind.PDF)) {
                    fgVar.F.setValue(Uri.fromFile(file));
                    if (file.isDirectory()) {
                        fgVar.o(file);
                    }
                } else if (!z11) {
                    fgVar.F.setValue(null);
                    sh.z0 z0Var15 = fgVar.Z;
                    z0Var15.getClass();
                    z0Var15.j(null, qg.z.f22752a);
                }
                String iconPath = projectEntity2.getIconPath();
                file3 = iconPath != null ? new File(iconPath) : null;
                if (file3 != null && file3.exists()) {
                    fgVar.I.setValue(Uri.fromFile(file3));
                } else if (!z11) {
                    fgVar.I.setValue(null);
                }
                String splashPath = projectEntity2.getSplashPath();
                file4 = splashPath != null ? new File(splashPath) : null;
                if (file4 != null && file4.exists()) {
                    fgVar.L.setValue(Uri.fromFile(file4));
                } else if (!z11) {
                    fgVar.L.setValue(null);
                    sh.z0 z0Var16 = fgVar.K;
                    z0Var16.getClass();
                    z0Var16.j(null, "");
                }
                return pg.f0.f21461a;
            }
            z11 = chVar.f9257d;
            ?? r52 = (sh.j0) chVar.f9256c;
            projectEntity3 = chVar.f9255b;
            fgVar2 = chVar.f9254a;
            pg.q.b(objK);
            z0Var2 = r52;
            str = (String) objK;
            z0Var3 = z0Var2;
            if (str == null) {
                z0Var = z0Var2;
                projectEntity2 = projectEntity3;
                fgVar = fgVar2;
                fgVar2 = fgVar;
                projectEntity3 = projectEntity2;
                z0Var3 = z0Var;
                str = "";
            }
            z0Var3.setValue(str);
            projectEntity2 = projectEntity3;
            fgVar = fgVar2;
            if (z11 || projectEntity2.getIconPath() != null) {
                sh.z0 z0Var17 = fgVar.H;
                String iconPath2 = projectEntity2.getIconPath();
                String strT2 = iconPath2 == null ? mh.x.T(iconPath2, '/', iconPath2) : "";
                z0Var17.getClass();
                z0Var17.j(null, strT2);
            }
            if (z11 || projectEntity2.getSplashPath() != null) {
                sh.z0 z0Var18 = fgVar.K;
                String splashPath2 = projectEntity2.getSplashPath();
                String strT3 = splashPath2 == null ? mh.x.T(splashPath2, '/', splashPath2) : "";
                z0Var18.getClass();
                z0Var18.j(null, strT3);
            }
            if (z11 || !kotlin.jvm.internal.r.a(projectEntity2.getPermissionsJson(), "[]")) {
                String permissionsJson = projectEntity2.getPermissionsJson();
                fgVar.getClass();
                listQ = q(permissionsJson);
                if (!listQ.isEmpty()) {
                    sh.z0 z0Var19 = fgVar.f9563f0;
                    z0Var19.getClass();
                    z0Var19.j(null, listQ);
                }
            }
            if (z11 || !mh.x.A(projectEntity2.getOutputFormat())) {
                fgVar.f9581o0.setValue(projectEntity2.getOutputFormat());
            }
            if (z11 || projectEntity2.getKeystoreId() != null) {
                fgVar.f9583p0.setValue(projectEntity2.getKeystoreId());
            }
            if (z11 || !kotlin.jvm.internal.r.a(projectEntity2.getOrientation(), "portrait") || mh.x.A((CharSequence) fgVar.f9585q0.getValue())) {
                fgVar.f9585q0.setValue(projectEntity2.getOrientation());
            }
            if (!z11) {
                sh.z0 z0Var20 = fgVar.f9587r0;
                Boolean boolValueOf = Boolean.valueOf(projectEntity2.getShowHeader());
                z0Var20.getClass();
                z0Var20.j(null, boolValueOf);
                sh.z0 z0Var21 = fgVar.f9589s0;
                Boolean boolValueOf2 = Boolean.valueOf(projectEntity2.getShowActionBar());
                z0Var21.getClass();
                z0Var21.j(null, boolValueOf2);
                sh.z0 z0Var22 = fgVar.f9591t0;
                Boolean boolValueOf3 = Boolean.valueOf(projectEntity2.getKeepScreenOn());
                z0Var22.getClass();
                z0Var22.j(null, boolValueOf3);
                sh.z0 z0Var23 = fgVar.f9593u0;
                Boolean boolValueOf4 = Boolean.valueOf(projectEntity2.getShowCameraCutout());
                z0Var23.getClass();
                z0Var23.j(null, boolValueOf4);
                sh.z0 z0Var24 = fgVar.f9595v0;
                Boolean boolValueOf5 = Boolean.valueOf(projectEntity2.getDesktopMode());
                z0Var24.getClass();
                z0Var24.j(null, boolValueOf5);
                sh.z0 z0Var25 = fgVar.f9597w0;
                Boolean boolValueOf6 = Boolean.valueOf(projectEntity2.getAutoIncrementVersionCode());
                z0Var25.getClass();
                z0Var25.j(null, boolValueOf6);
                sh.z0 z0Var26 = fgVar.f9599x0;
                Boolean boolValueOf7 = Boolean.valueOf(projectEntity2.getShowWatermark());
                z0Var26.getClass();
                z0Var26.j(null, boolValueOf7);
                sh.z0 z0Var27 = fgVar.f9601y0;
                String deepLinkScheme = projectEntity2.getDeepLinkScheme();
                if (deepLinkScheme == null) {
                    deepLinkScheme = "";
                }
                z0Var27.getClass();
                z0Var27.j(null, deepLinkScheme);
                sh.z0 z0Var28 = fgVar.f9603z0;
                Boolean boolValueOf8 = Boolean.valueOf(projectEntity2.getAdmobEnabled());
                z0Var28.getClass();
                z0Var28.j(null, boolValueOf8);
                sh.z0 z0Var29 = fgVar.A0;
                String admobAppId = projectEntity2.getAdmobAppId();
                if (admobAppId == null) {
                    admobAppId = "";
                }
                z0Var29.getClass();
                z0Var29.j(null, admobAppId);
                sh.z0 z0Var30 = fgVar.B0;
                String admobBannerUnitId = projectEntity2.getAdmobBannerUnitId();
                if (admobBannerUnitId == null) {
                    admobBannerUnitId = "";
                }
                z0Var30.getClass();
                z0Var30.j(null, admobBannerUnitId);
                sh.z0 z0Var31 = fgVar.C0;
                String admobInterstitialUnitId = projectEntity2.getAdmobInterstitialUnitId();
                if (admobInterstitialUnitId == null) {
                    admobInterstitialUnitId = "";
                }
                z0Var31.getClass();
                z0Var31.j(null, admobInterstitialUnitId);
                sh.z0 z0Var32 = fgVar.D0;
                String admobRewardedUnitId = projectEntity2.getAdmobRewardedUnitId();
                if (admobRewardedUnitId == null) {
                    admobRewardedUnitId = "";
                }
                z0Var32.getClass();
                z0Var32.j(null, admobRewardedUnitId);
                sh.z0 z0Var33 = fgVar.E0;
                String admobBannerPosition = projectEntity2.getAdmobBannerPosition();
                if (admobBannerPosition == null) {
                    admobBannerPosition = "bottom";
                }
                z0Var33.getClass();
                z0Var33.j(null, admobBannerPosition);
                sh.z0 z0Var34 = fgVar.F0;
                Boolean boolValueOf9 = Boolean.valueOf(projectEntity2.getAdmobShowBannerOnStart());
                z0Var34.getClass();
                z0Var34.j(null, boolValueOf9);
                sh.z0 z0Var35 = fgVar.G0;
                String admobTestDeviceIds = projectEntity2.getAdmobTestDeviceIds();
                if (admobTestDeviceIds == null) {
                    admobTestDeviceIds = "";
                }
                z0Var35.getClass();
                z0Var35.j(null, admobTestDeviceIds);
                sh.z0 z0Var36 = fgVar.H0;
                Boolean boolValueOf10 = Boolean.valueOf(projectEntity2.getAdmobAutoLoadInterstitial());
                z0Var36.getClass();
                z0Var36.j(null, boolValueOf10);
                sh.z0 z0Var37 = fgVar.I0;
                Boolean boolValueOf11 = Boolean.valueOf(projectEntity2.getAdmobAutoLoadRewarded());
                z0Var37.getClass();
                z0Var37.j(null, boolValueOf11);
                sh.z0 z0Var38 = fgVar.J0;
                Boolean boolValueOf12 = Boolean.valueOf(projectEntity2.getAdmobUseTestAds());
                z0Var38.getClass();
                z0Var38.j(null, boolValueOf12);
                sh.z0 z0Var39 = fgVar.K0;
                Boolean boolValueOf13 = Boolean.valueOf(projectEntity2.getAdmobBannerEnabled());
                z0Var39.getClass();
                z0Var39.j(null, boolValueOf13);
                sh.z0 z0Var40 = fgVar.L0;
                Boolean boolValueOf14 = Boolean.valueOf(projectEntity2.getAdmobInterstitialEnabled());
                z0Var40.getClass();
                z0Var40.j(null, boolValueOf14);
                sh.z0 z0Var41 = fgVar.M0;
                Boolean boolValueOf15 = Boolean.valueOf(projectEntity2.getAdmobRewardedEnabled());
                z0Var41.getClass();
                z0Var41.j(null, boolValueOf15);
                fgVar.N0.setValue(String.valueOf(projectEntity2.getAdmobInterstitialIntervalSeconds()));
                fgVar.O0.setValue(String.valueOf(projectEntity2.getAdmobInterstitialPageCount()));
                sh.z0 z0Var42 = fgVar.P0;
                Integer num = new Integer(projectEntity2.getAdmobChildDirectedTreatment());
                z0Var42.getClass();
                z0Var42.j(null, num);
                sh.z0 z0Var43 = fgVar.Q0;
                Integer num2 = new Integer(projectEntity2.getAdmobUnderAgeOfConsent());
                z0Var43.getClass();
                z0Var43.j(null, num2);
                fgVar.R0.setValue(projectEntity2.getAdmobMaxAdContentRating());
                sh.z0 z0Var44 = fgVar.S0;
                Boolean boolValueOf16 = Boolean.valueOf(projectEntity2.getUmpDebugEnabled());
                z0Var44.getClass();
                z0Var44.j(null, boolValueOf16);
                fgVar.T0.setValue(projectEntity2.getUmpDebugGeography());
                sh.z0 z0Var45 = fgVar.U0;
                String umpTestDeviceIds = projectEntity2.getUmpTestDeviceIds();
                if (umpTestDeviceIds == null) {
                    umpTestDeviceIds = "";
                }
                z0Var45.getClass();
                z0Var45.j(null, umpTestDeviceIds);
            }
            if (z11 || ((primaryColor2 = projectEntity2.getPrimaryColor()) != null && !mh.x.A(primaryColor2))) {
                sh.z0 z0Var46 = fgVar.V0;
                primaryColor = projectEntity2.getPrimaryColor();
                if (primaryColor == null) {
                    primaryColor = "#2196F3";
                }
                z0Var46.getClass();
                z0Var46.j(null, primaryColor);
            }
            if (!mh.x.A(projectEntity2.getWebViewSettingsJson()) && !kotlin.jvm.internal.r.a(projectEntity2.getWebViewSettingsJson(), "{}")) {
                String webViewSettingsJson = projectEntity2.getWebViewSettingsJson();
                fgVar.getClass();
                WebViewSettings webViewSettingsR = r(webViewSettingsJson);
                fgVar.W0.setValue(webViewSettingsR);
                sh.z0 z0Var47 = fgVar.J;
                Boolean boolValueOf17 = Boolean.valueOf(webViewSettingsR.getSplashEnabled());
                z0Var47.getClass();
                z0Var47.j(null, boolValueOf17);
                fgVar.M.setValue(webViewSettingsR.getSplashBgColor());
                sh.z0 z0Var48 = fgVar.N;
                Boolean boolValueOf18 = Boolean.valueOf(webViewSettingsR.getSplashFadeOut());
                z0Var48.getClass();
                z0Var48.j(null, boolValueOf18);
                fgVar.O.setValue(webViewSettingsR.getSplashLoaderStyle());
                sh.z0 z0Var49 = fgVar.P;
                Integer num3 = new Integer(webViewSettingsR.getSplashIconSize());
                z0Var49.getClass();
                z0Var49.j(null, num3);
                sh.z0 z0Var50 = fgVar.Q;
                Integer num4 = new Integer(webViewSettingsR.getSplashIconRadius());
                z0Var50.getClass();
                z0Var50.j(null, num4);
                sh.z0 z0Var51 = fgVar.R;
                Integer num5 = new Integer(webViewSettingsR.getSplashLoaderSize());
                z0Var51.getClass();
                z0Var51.j(null, num5);
                sh.z0 z0Var52 = fgVar.S;
                Integer num6 = new Integer(webViewSettingsR.getSplashSpacing());
                z0Var52.getClass();
                z0Var52.j(null, num6);
                sh.z0 z0Var53 = fgVar.T;
                Integer num7 = new Integer(webViewSettingsR.getSplashDuration());
                z0Var53.getClass();
                z0Var53.j(null, num7);
                sh.z0 z0Var54 = fgVar.U;
                Integer num8 = new Integer(webViewSettingsR.getSplashLoaderThickness());
                z0Var54.getClass();
                z0Var54.j(null, num8);
                sh.z0 z0Var55 = fgVar.V;
                Integer num9 = new Integer(webViewSettingsR.getSplashFadeDuration());
                z0Var55.getClass();
                z0Var55.j(null, num9);
                fgVar.W.setValue(webViewSettingsR.getSplashLoaderColor());
                sh.z0 z0Var56 = fgVar.X;
                Boolean boolValueOf19 = Boolean.valueOf(webViewSettingsR.getSplashFullScreen());
                z0Var56.getClass();
                z0Var56.j(null, boolValueOf19);
                sh.z0 z0Var57 = fgVar.Y;
                Boolean boolValueOf20 = Boolean.valueOf(webViewSettingsR.getSplashHideLoader());
                z0Var57.getClass();
                z0Var57.j(null, boolValueOf20);
            }
            String sourcePath2 = projectEntity2.getSourcePath();
            file = sourcePath2 == null ? new File(sourcePath2) : null;
            if (file != null && !kotlin.jvm.internal.r.a(projectEntity2.getContentSourceType(), ProjectKind.PDF) && !file.exists()) {
                wh.c cVar2 = ph.z0.f21632a;
                bVar = wh.b.f31563c;
                ehVar = new eh(file, null);
                chVar.f9254a = fgVar;
                chVar.f9255b = projectEntity2;
                chVar.f9256c = file;
                chVar.f9257d = z11;
                chVar.f9260g = 3;
                if (ph.h.e(bVar, ehVar, chVar) != aVar) {
                    file2 = file;
                    fgVar3 = fgVar;
                    fgVar = fgVar3;
                    file = file2;
                }
                return aVar;
            }
            if (kotlin.jvm.internal.r.a(projectEntity2.getContentSourceType(), ProjectKind.PDF)) {
            }
            if (file != null) {
                if (!z11) {
                }
            }
            String iconPath3 = projectEntity2.getIconPath();
            if (iconPath3 != null) {
            }
            if (file3 != null) {
                if (!z11) {
                }
            }
            String splashPath3 = projectEntity2.getSplashPath();
            if (splashPath3 != null) {
            }
            if (file4 != null) {
                if (!z11) {
                }
            }
            return pg.f0.f21461a;
        }
        z11 = chVar.f9257d;
        projectEntity2 = chVar.f9255b;
        fgVar = chVar.f9254a;
        pg.q.b(objK);
        boolean zBooleanValue = ((Boolean) objK).booleanValue();
        if (kotlin.jvm.internal.r.a(projectEntity2.getContentSourceType(), "paste") && !zBooleanValue) {
            z0Var = fgVar.B;
            String sourcePath3 = projectEntity2.getSourcePath();
            if (sourcePath3 != null) {
                wh.c cVar3 = ph.z0.f21632a;
                wh.b bVar2 = wh.b.f31563c;
                dh dhVar = new dh(sourcePath3, null);
                chVar.f9254a = fgVar;
                chVar.f9255b = projectEntity2;
                chVar.f9256c = z0Var;
                chVar.f9257d = z11;
                chVar.f9260g = 2;
                Object objE = ph.h.e(bVar2, dhVar, chVar);
                if (objE != aVar) {
                    ProjectEntity projectEntity4 = projectEntity2;
                    z0Var2 = z0Var;
                    objK = objE;
                    fgVar2 = fgVar;
                    projectEntity3 = projectEntity4;
                    str = (String) objK;
                    z0Var3 = z0Var2;
                    if (str == null) {
                    }
                    z0Var3.setValue(str);
                    projectEntity2 = projectEntity3;
                    fgVar = fgVar2;
                    if (z11) {
                    }
                    if (kotlin.jvm.internal.r.a(projectEntity2.getContentSourceType(), ProjectKind.PDF)) {
                    }
                    if (file != null) {
                    }
                    String iconPath32 = projectEntity2.getIconPath();
                    if (iconPath32 != null) {
                    }
                    if (file3 != null) {
                    }
                    String splashPath32 = projectEntity2.getSplashPath();
                    if (splashPath32 != null) {
                    }
                    if (file4 != null) {
                    }
                    return pg.f0.f21461a;
                }
                return aVar;
            }
            fgVar2 = fgVar;
            projectEntity3 = projectEntity2;
            z0Var3 = z0Var;
            str = "";
            z0Var3.setValue(str);
            projectEntity2 = projectEntity3;
            fgVar = fgVar2;
            if (z11) {
            }
            if (kotlin.jvm.internal.r.a(projectEntity2.getContentSourceType(), ProjectKind.PDF)) {
            }
            if (file != null) {
            }
            String iconPath322 = projectEntity2.getIconPath();
            if (iconPath322 != null) {
            }
            if (file3 != null) {
            }
            String splashPath322 = projectEntity2.getSplashPath();
            if (splashPath322 != null) {
            }
            if (file4 != null) {
            }
            return pg.f0.f21461a;
        }
        if (!z11 && !zBooleanValue) {
            sh.z0 z0Var58 = fgVar.B;
            z0Var58.getClass();
            z0Var58.j(null, "");
        }
        if (z11) {
            sh.z0 z0Var172 = fgVar.H;
            String iconPath22 = projectEntity2.getIconPath();
            if (iconPath22 == null) {
            }
            z0Var172.getClass();
            z0Var172.j(null, strT2);
            if (z11) {
                sh.z0 z0Var182 = fgVar.K;
                String splashPath22 = projectEntity2.getSplashPath();
                if (splashPath22 == null) {
                }
                z0Var182.getClass();
                z0Var182.j(null, strT3);
                if (z11) {
                    String permissionsJson2 = projectEntity2.getPermissionsJson();
                    fgVar.getClass();
                    listQ = q(permissionsJson2);
                    if (!listQ.isEmpty()) {
                    }
                    if (z11) {
                        fgVar.f9581o0.setValue(projectEntity2.getOutputFormat());
                        if (z11) {
                            fgVar.f9583p0.setValue(projectEntity2.getKeystoreId());
                            if (z11) {
                                fgVar.f9585q0.setValue(projectEntity2.getOrientation());
                                if (!z11) {
                                }
                                if (z11) {
                                    sh.z0 z0Var462 = fgVar.V0;
                                    primaryColor = projectEntity2.getPrimaryColor();
                                    if (primaryColor == null) {
                                    }
                                    z0Var462.getClass();
                                    z0Var462.j(null, primaryColor);
                                    if (!mh.x.A(projectEntity2.getWebViewSettingsJson())) {
                                        String webViewSettingsJson2 = projectEntity2.getWebViewSettingsJson();
                                        fgVar.getClass();
                                        WebViewSettings webViewSettingsR2 = r(webViewSettingsJson2);
                                        fgVar.W0.setValue(webViewSettingsR2);
                                        sh.z0 z0Var472 = fgVar.J;
                                        Boolean boolValueOf172 = Boolean.valueOf(webViewSettingsR2.getSplashEnabled());
                                        z0Var472.getClass();
                                        z0Var472.j(null, boolValueOf172);
                                        fgVar.M.setValue(webViewSettingsR2.getSplashBgColor());
                                        sh.z0 z0Var482 = fgVar.N;
                                        Boolean boolValueOf182 = Boolean.valueOf(webViewSettingsR2.getSplashFadeOut());
                                        z0Var482.getClass();
                                        z0Var482.j(null, boolValueOf182);
                                        fgVar.O.setValue(webViewSettingsR2.getSplashLoaderStyle());
                                        sh.z0 z0Var492 = fgVar.P;
                                        Integer num32 = new Integer(webViewSettingsR2.getSplashIconSize());
                                        z0Var492.getClass();
                                        z0Var492.j(null, num32);
                                        sh.z0 z0Var502 = fgVar.Q;
                                        Integer num42 = new Integer(webViewSettingsR2.getSplashIconRadius());
                                        z0Var502.getClass();
                                        z0Var502.j(null, num42);
                                        sh.z0 z0Var512 = fgVar.R;
                                        Integer num52 = new Integer(webViewSettingsR2.getSplashLoaderSize());
                                        z0Var512.getClass();
                                        z0Var512.j(null, num52);
                                        sh.z0 z0Var522 = fgVar.S;
                                        Integer num62 = new Integer(webViewSettingsR2.getSplashSpacing());
                                        z0Var522.getClass();
                                        z0Var522.j(null, num62);
                                        sh.z0 z0Var532 = fgVar.T;
                                        Integer num72 = new Integer(webViewSettingsR2.getSplashDuration());
                                        z0Var532.getClass();
                                        z0Var532.j(null, num72);
                                        sh.z0 z0Var542 = fgVar.U;
                                        Integer num82 = new Integer(webViewSettingsR2.getSplashLoaderThickness());
                                        z0Var542.getClass();
                                        z0Var542.j(null, num82);
                                        sh.z0 z0Var552 = fgVar.V;
                                        Integer num92 = new Integer(webViewSettingsR2.getSplashFadeDuration());
                                        z0Var552.getClass();
                                        z0Var552.j(null, num92);
                                        fgVar.W.setValue(webViewSettingsR2.getSplashLoaderColor());
                                        sh.z0 z0Var562 = fgVar.X;
                                        Boolean boolValueOf192 = Boolean.valueOf(webViewSettingsR2.getSplashFullScreen());
                                        z0Var562.getClass();
                                        z0Var562.j(null, boolValueOf192);
                                        sh.z0 z0Var572 = fgVar.Y;
                                        Boolean boolValueOf202 = Boolean.valueOf(webViewSettingsR2.getSplashHideLoader());
                                        z0Var572.getClass();
                                        z0Var572.j(null, boolValueOf202);
                                    }
                                    String sourcePath22 = projectEntity2.getSourcePath();
                                    if (sourcePath22 == null) {
                                    }
                                    if (file != null) {
                                        wh.c cVar22 = ph.z0.f21632a;
                                        bVar = wh.b.f31563c;
                                        ehVar = new eh(file, null);
                                        chVar.f9254a = fgVar;
                                        chVar.f9255b = projectEntity2;
                                        chVar.f9256c = file;
                                        chVar.f9257d = z11;
                                        chVar.f9260g = 3;
                                        if (ph.h.e(bVar, ehVar, chVar) != aVar) {
                                        }
                                        return aVar;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (kotlin.jvm.internal.r.a(projectEntity2.getContentSourceType(), ProjectKind.PDF)) {
        }
        if (file != null) {
        }
        String iconPath3222 = projectEntity2.getIconPath();
        if (iconPath3222 != null) {
        }
        if (file3 != null) {
        }
        String splashPath3222 = projectEntity2.getSplashPath();
        if (splashPath3222 != null) {
        }
        if (file4 != null) {
        }
        return pg.f0.f21461a;
    }

    public final void C() {
        l5.a aVarA = androidx.lifecycle.x0.a(this);
        wh.c cVar = ph.z0.f21632a;
        ph.h.c(aVarA, wh.b.f31563c, null, new j(null), 2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0310, code lost:
    
        if (ph.h.e(r1, r8, r2) != r3) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        if (n(0, r2) == r3) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        if (r1.join(r2) == r3) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
    
        if (r1.join(r2) == r3) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        if (r1.join(r2) == r3) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0112, code lost:
    
        if (r1.join(r2) == r3) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0125, code lost:
    
        if (r1.join(r2) == r3) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0218, code lost:
    
        if (new java.io.File(r1).isFile() == false) goto L89;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x034c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0 A[PHI: r4
      0x00e0: PHI (r4v4 f9.fg) = (r4v2 f9.fg), (r4v5 f9.fg) binds: [B:30:0x00d0, B:34:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2 A[PHI: r4
      0x00f2: PHI (r4v7 f9.fg) = (r4v4 f9.fg), (r4v8 f9.fg) binds: [B:36:0x00e2, B:40:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105 A[PHI: r4
      0x0105: PHI (r4v10 f9.fg) = (r4v7 f9.fg), (r4v11 f9.fg) binds: [B:42:0x00f4, B:46:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118 A[PHI: r4
      0x0118: PHI (r4v13 f9.fg) = (r4v10 f9.fg), (r4v14 f9.fg) binds: [B:48:0x0107, B:52:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b A[PHI: r4
      0x012b: PHI (r4v16 f9.fg) = (r4v13 f9.fg), (r4v43 f9.fg) binds: [B:54:0x011a, B:58:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014f A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(vg.c cVar) throws IOException {
        gh ghVar;
        fg fgVar;
        ph.l2 l2Var;
        ph.l2 l2Var2;
        ph.l2 l2Var3;
        ph.l2 l2Var4;
        ph.l2 l2Var5;
        long id2;
        String str;
        fg fgVar2;
        long j10;
        String absolutePath;
        String path;
        fg fgVar3;
        long j11;
        Uri uri;
        File file;
        fg fgVar4;
        sh.z0 z0Var;
        sh.z0 z0Var2;
        Uri uri2;
        fg fgVar5;
        String str2;
        Uri uri3;
        long j12;
        String str3;
        Iterator<String> it;
        mh.f fVar;
        Object next;
        String str4;
        String string;
        String string2;
        ProjectEntity projectEntity;
        ProjectEntity projectEntity2;
        String str5;
        long j13;
        ProjectEntity projectEntity3;
        fg fgVar6;
        ProjectEntity projectEntity4;
        String str6;
        fg fgVar7;
        String str7;
        String string3;
        String strB0;
        File canonicalFile;
        int i10;
        ProjectEntity projectEntityCopy$default;
        n8.s sVar;
        long id3;
        LinkedHashMap linkedHashMap;
        String[] strArr;
        long j14;
        File file2;
        String str8;
        String str9;
        String str10;
        if (cVar instanceof gh) {
            ghVar = (gh) cVar;
            int i11 = ghVar.f9736k;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                ghVar.f9736k = i11 - PKIFailureInfo.systemUnavail;
            } else {
                ghVar = new gh(this, cVar);
            }
        }
        Object obj = ghVar.f9734h;
        ug.a aVar = ug.a.f29706a;
        switch (ghVar.f9736k) {
            case 0:
                pg.q.b(obj);
                if (this.f9566h.getValue() == null) {
                    ghVar.f9727a = this;
                    ghVar.f9736k = 1;
                    break;
                }
                fgVar = this;
                l2Var = fgVar.f9571j0;
                if (l2Var != null) {
                    l2Var2 = fgVar.f9573k0;
                    if (l2Var2 != null) {
                        l2Var3 = fgVar.f9575l0;
                        if (l2Var3 != null) {
                            l2Var4 = fgVar.f9569i0;
                            if (l2Var4 != null) {
                                l2Var5 = fgVar.f9577m0;
                                if (l2Var5 != null) {
                                    fg fgVar8 = fgVar;
                                    sh.z0 z0Var3 = fgVar8.f9566h;
                                    sh.z0 z0Var4 = fgVar8.F;
                                    ProjectEntity projectEntity5 = (ProjectEntity) z0Var3.getValue();
                                    id2 = projectEntity5 == null ? projectEntity5.getId() : 0L;
                                    str = (String) fgVar8.f9600y.getValue();
                                    switch (str.hashCode()) {
                                        case -1268966290:
                                            fgVar2 = fgVar8;
                                            j10 = id2;
                                            if (str.equals("folder")) {
                                                ProjectEntity projectEntity6 = (ProjectEntity) fgVar2.f9566h.getValue();
                                                String sourcePath = projectEntity6 != null ? projectEntity6.getSourcePath() : null;
                                                if (sourcePath == null || !new File(sourcePath).isDirectory()) {
                                                    BuildLogger.INSTANCE.error(R.string.build_log_project_folder_not_saved, new Object[0]);
                                                } else {
                                                    absolutePath = sourcePath;
                                                    fgVar3 = fgVar2;
                                                    j11 = j10;
                                                    z0Var = fgVar3.L;
                                                    z0Var2 = fgVar3.I;
                                                    if (!qg.p.j("local", "folder", ProjectKind.PDF).contains(fgVar3.f9600y.getValue()) && absolutePath == null) {
                                                        BuildLogger.INSTANCE.error(R.string.build_log_content_not_saved, new Object[0]);
                                                        return new Long(0L);
                                                    }
                                                    uri2 = (Uri) z0Var2.getValue();
                                                    if (uri2 != null) {
                                                        CharSequence charSequence = (CharSequence) fgVar3.H.getValue();
                                                        if (mh.x.A(charSequence)) {
                                                            charSequence = "icon.png";
                                                        }
                                                        fg fgVar9 = fgVar3;
                                                        String strI = fgVar9.i(uri2, j11, "icons", (String) charSequence);
                                                        fgVar5 = fgVar9;
                                                        if (strI != null) {
                                                            z0Var2.setValue(Uri.fromFile(new File(strI)));
                                                            str2 = strI;
                                                        }
                                                        uri3 = (Uri) z0Var.getValue();
                                                        if (uri3 == null) {
                                                            CharSequence charSequence2 = (CharSequence) fgVar5.K.getValue();
                                                            if (mh.x.A(charSequence2)) {
                                                                charSequence2 = "splash.png";
                                                            }
                                                            String strI2 = fgVar5.i(uri3, j11, "splash", (String) charSequence2);
                                                            j12 = j11;
                                                            if (strI2 != null) {
                                                                z0Var.setValue(Uri.fromFile(new File(strI2)));
                                                                str3 = strI2;
                                                                String str11 = str2;
                                                                long j15 = j12;
                                                                String str12 = absolutePath;
                                                                sh.z0 z0Var5 = fgVar5.f9586r;
                                                                n8.s sVar2 = fgVar5.f9554b;
                                                                sh.z0 z0Var6 = fgVar5.f9566h;
                                                                sh.z0 z0Var7 = fgVar5.f9563f0;
                                                                sh.z0 z0Var8 = fgVar5.W0;
                                                                sh.z0 z0Var9 = fgVar5.f9588s;
                                                                sh.z0 z0Var10 = fgVar5.f9600y;
                                                                it = mh.x.D((CharSequence) z0Var5.getValue()).iterator();
                                                                while (true) {
                                                                    fVar = (mh.f) it;
                                                                    if (fVar.hasNext()) {
                                                                        next = null;
                                                                    } else {
                                                                        next = fVar.next();
                                                                        if (!mh.x.A((String) next)) {
                                                                        }
                                                                    }
                                                                }
                                                                str4 = (String) next;
                                                                String str13 = "Untitled";
                                                                if (str4 != null && (string3 = mh.x.W(str4).toString()) != null) {
                                                                    strB0 = mh.y.b0(50, string3);
                                                                    if (!mh.x.A(strB0)) {
                                                                        str13 = strB0;
                                                                    }
                                                                }
                                                                String str14 = str13;
                                                                string = mh.x.W((String) z0Var9.getValue()).toString();
                                                                if (!f.b(string)) {
                                                                    string = f.a(str14);
                                                                }
                                                                z0Var9.setValue(string);
                                                                WebViewSettings webViewSettings = (WebViewSettings) z0Var8.getValue();
                                                                WebViewSettings webViewSettingsCopy = webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : ((Boolean) fgVar5.J.getValue()).booleanValue(), ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : (String) fgVar5.M.getValue(), ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : ((Boolean) fgVar5.N.getValue()).booleanValue(), ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : (String) fgVar5.O.getValue(), ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : ((Number) fgVar5.P.getValue()).intValue(), ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : ((Number) fgVar5.Q.getValue()).intValue(), ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : ((Number) fgVar5.R.getValue()).intValue(), ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : ((Number) fgVar5.S.getValue()).intValue(), ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : ((Number) fgVar5.T.getValue()).intValue(), ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : ((Number) fgVar5.U.getValue()).intValue(), (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : ((Number) fgVar5.V.getValue()).intValue(), (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : (String) fgVar5.W.getValue(), (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : ((Boolean) fgVar5.X.getValue()).booleanValue(), (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : ((Boolean) fgVar5.Y.getValue()).booleanValue(), (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0);
                                                                z0Var8.setValue(webViewSettingsCopy);
                                                                String str15 = (String) fgVar5.f9586r.getValue();
                                                                Integer numG = mh.s.g((String) fgVar5.f9590t.getValue());
                                                                int iIntValue = numG == null ? numG.intValue() : 1;
                                                                String str16 = (String) fgVar5.f9592u.getValue();
                                                                Integer numG2 = mh.s.g((String) fgVar5.f9594v.getValue());
                                                                int iIntValue2 = numG2 == null ? numG2.intValue() : 24;
                                                                Integer numG3 = mh.s.g((String) fgVar5.f9596w.getValue());
                                                                int iIntValue3 = numG3 == null ? numG3.intValue() : 36;
                                                                Integer numG4 = mh.s.g((String) fgVar5.f9598x.getValue());
                                                                String str17 = (String) z0Var10.getValue();
                                                                String strP = !kotlin.jvm.internal.r.a(z0Var10.getValue(), "url") ? p((String) fgVar5.f9602z.getValue()) : null;
                                                                String strS = s(!kotlin.jvm.internal.r.a(z0Var10.getValue(), "url") ? qg.x.x(qg.x.O(qg.p.j("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"), (Collection) z0Var7.getValue())) : (List) z0Var7.getValue());
                                                                String str18 = (String) fgVar5.V0.getValue();
                                                                String str19 = (String) fgVar5.f9585q0.getValue();
                                                                boolean zBooleanValue = ((Boolean) fgVar5.f9587r0.getValue()).booleanValue();
                                                                boolean zBooleanValue2 = ((Boolean) fgVar5.f9589s0.getValue()).booleanValue();
                                                                boolean zBooleanValue3 = ((Boolean) fgVar5.f9591t0.getValue()).booleanValue();
                                                                boolean zBooleanValue4 = ((Boolean) fgVar5.f9593u0.getValue()).booleanValue();
                                                                boolean zBooleanValue5 = ((Boolean) fgVar5.f9595v0.getValue()).booleanValue();
                                                                String strE = E(webViewSettingsCopy);
                                                                Long l10 = (Long) fgVar5.f9583p0.getValue();
                                                                String str20 = (String) fgVar5.f9581o0.getValue();
                                                                boolean zBooleanValue6 = ((Boolean) fgVar5.f9599x0.getValue()).booleanValue();
                                                                boolean zBooleanValue7 = ((Boolean) fgVar5.f9597w0.getValue()).booleanValue();
                                                                String string4 = mh.x.W((String) fgVar5.f9601y0.getValue()).toString();
                                                                String str21 = mh.x.A(string4) ? string4 : null;
                                                                boolean zBooleanValue8 = ((Boolean) fgVar5.f9603z0.getValue()).booleanValue();
                                                                String string5 = mh.x.W((String) fgVar5.A0.getValue()).toString();
                                                                String str22 = mh.x.A(string5) ? string5 : null;
                                                                String string6 = mh.x.W((String) fgVar5.B0.getValue()).toString();
                                                                String str23 = mh.x.A(string6) ? string6 : null;
                                                                String string7 = mh.x.W((String) fgVar5.C0.getValue()).toString();
                                                                String str24 = mh.x.A(string7) ? string7 : null;
                                                                String string8 = mh.x.W((String) fgVar5.D0.getValue()).toString();
                                                                String str25 = mh.x.A(string8) ? string8 : null;
                                                                string2 = mh.x.W((String) fgVar5.E0.getValue()).toString();
                                                                if (mh.x.A(string2)) {
                                                                    string2 = null;
                                                                }
                                                                if (string2 == null) {
                                                                    string2 = "bottom";
                                                                }
                                                                String str26 = string2;
                                                                boolean zBooleanValue9 = ((Boolean) fgVar5.F0.getValue()).booleanValue();
                                                                String string9 = mh.x.W((String) fgVar5.G0.getValue()).toString();
                                                                String str27 = mh.x.A(string9) ? string9 : null;
                                                                boolean zBooleanValue10 = ((Boolean) fgVar5.H0.getValue()).booleanValue();
                                                                boolean zBooleanValue11 = ((Boolean) fgVar5.I0.getValue()).booleanValue();
                                                                boolean zBooleanValue12 = ((Boolean) fgVar5.J0.getValue()).booleanValue();
                                                                boolean zBooleanValue13 = ((Boolean) fgVar5.K0.getValue()).booleanValue();
                                                                boolean zBooleanValue14 = ((Boolean) fgVar5.L0.getValue()).booleanValue();
                                                                boolean zBooleanValue15 = ((Boolean) fgVar5.M0.getValue()).booleanValue();
                                                                Integer numG5 = mh.s.g((String) fgVar5.N0.getValue());
                                                                int iIntValue4 = numG5 == null ? numG5.intValue() : 0;
                                                                Integer numG6 = mh.s.g((String) fgVar5.O0.getValue());
                                                                int iIntValue5 = numG6 == null ? numG6.intValue() : 0;
                                                                int iIntValue6 = ((Number) fgVar5.P0.getValue()).intValue();
                                                                int iIntValue7 = ((Number) fgVar5.Q0.getValue()).intValue();
                                                                String str28 = (String) fgVar5.R0.getValue();
                                                                boolean zBooleanValue16 = ((Boolean) fgVar5.S0.getValue()).booleanValue();
                                                                String str29 = (String) fgVar5.T0.getValue();
                                                                String string10 = mh.x.W((String) fgVar5.U0.getValue()).toString();
                                                                String str30 = mh.x.A(string10) ? string10 : null;
                                                                projectEntity = (ProjectEntity) z0Var6.getValue();
                                                                if (projectEntity != null || (kind = projectEntity.getKind()) == null) {
                                                                    String kind = ProjectKind.APK;
                                                                }
                                                                String str31 = kind;
                                                                ProjectEntity projectEntity7 = (ProjectEntity) z0Var6.getValue();
                                                                projectEntity2 = new ProjectEntity(j15, str14, str15, string, iIntValue, str16, iIntValue2, iIntValue3, numG4, str17, str12, strP, strS, str11, str3, str18, str19, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, strE, l10, str20, "advanced", zBooleanValue6, zBooleanValue7, str21, false, null, null, "non_consumable", false, true, true, true, null, 0, null, null, null, zBooleanValue8, str22, str23, str24, str25, str26, zBooleanValue9, str27, zBooleanValue10, zBooleanValue11, zBooleanValue12, zBooleanValue13, zBooleanValue14, zBooleanValue15, iIntValue4, iIntValue5, iIntValue6, iIntValue7, str28, zBooleanValue16, str29, str30, str31, projectEntity7 == null ? projectEntity7.getFolderId() : null, 0L, 0L, 0, 0, 12, null);
                                                                str5 = str3;
                                                                j13 = 0;
                                                                BuildLogger.INSTANCE.detail(R.string.build_log_project_saved_paths, new Long(projectEntity2.getId()), str12 != null ? "none" : str12, str11 != null ? "none" : str11, str5 != null ? "none" : str5);
                                                                if (projectEntity2.getId() != 0) {
                                                                    ghVar.f9727a = fgVar5;
                                                                    ghVar.f9728b = str12;
                                                                    ghVar.f9729c = str11;
                                                                    ghVar.f9730d = str5;
                                                                    ghVar.f9731e = projectEntity2;
                                                                    ghVar.f9736k = 9;
                                                                    Object objInsert = sVar2.f18583a.insert(projectEntity2, ghVar);
                                                                    if (objInsert != aVar) {
                                                                        projectEntity4 = projectEntity2;
                                                                        str6 = str11;
                                                                        fgVar7 = fgVar5;
                                                                        obj = objInsert;
                                                                        str7 = str12;
                                                                        long jLongValue = ((Number) obj).longValue();
                                                                        String[] strArr2 = {str7, str6, str5};
                                                                        canonicalFile = fgVar7.w(j13).getCanonicalFile();
                                                                        File canonicalFile2 = fgVar7.w(jLongValue).getCanonicalFile();
                                                                        if (canonicalFile.exists()) {
                                                                            if (canonicalFile2.exists()) {
                                                                                ah.l.f(canonicalFile2);
                                                                            }
                                                                            canonicalFile.renameTo(canonicalFile2);
                                                                        }
                                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                        i10 = 0;
                                                                        while (i10 < 3) {
                                                                            String str32 = strArr2[i10];
                                                                            if (str32 != null) {
                                                                                String path2 = canonicalFile.getPath();
                                                                                strArr = strArr2;
                                                                                kotlin.jvm.internal.r.d(path2, "getPath(...)");
                                                                                j14 = jLongValue;
                                                                                if (mh.t.p(str32, path2, false)) {
                                                                                    String path3 = canonicalFile.getPath();
                                                                                    kotlin.jvm.internal.r.d(path3, "getPath(...)");
                                                                                    String path4 = canonicalFile2.getPath();
                                                                                    kotlin.jvm.internal.r.d(path4, "getPath(...)");
                                                                                    file2 = canonicalFile;
                                                                                    int iY = mh.x.y(str32, path3, 0, false, 2);
                                                                                    linkedHashMap2.put(str32, iY < 0 ? str32 : mh.x.M(str32, iY, path3.length() + iY, path4).toString());
                                                                                } else {
                                                                                    file2 = canonicalFile;
                                                                                    linkedHashMap2.put(str32, str32);
                                                                                }
                                                                            } else {
                                                                                strArr = strArr2;
                                                                                j14 = jLongValue;
                                                                                file2 = canonicalFile;
                                                                            }
                                                                            i10++;
                                                                            canonicalFile = file2;
                                                                            strArr2 = strArr;
                                                                            jLongValue = j14;
                                                                        }
                                                                        long j16 = jLongValue;
                                                                        projectEntityCopy$default = ProjectEntity.copy$default(projectEntity4, j16, null, null, null, 0, null, 0, 0, null, null, (String) linkedHashMap2.get(str7), null, null, (String) linkedHashMap2.get(str6), (String) linkedHashMap2.get(str5), null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -25602, -1, 15, null);
                                                                        sVar = fgVar7.f9554b;
                                                                        ghVar.f9727a = fgVar7;
                                                                        ghVar.f9728b = str7;
                                                                        ghVar.f9729c = str6;
                                                                        ghVar.f9730d = str5;
                                                                        ghVar.f9731e = projectEntityCopy$default;
                                                                        ghVar.f9732f = linkedHashMap2;
                                                                        ghVar.f9733g = j16;
                                                                        ghVar.f9736k = 10;
                                                                        if (sVar.c(projectEntityCopy$default, ghVar) != aVar) {
                                                                            id3 = j16;
                                                                            linkedHashMap = linkedHashMap2;
                                                                            fgVar6 = fgVar7;
                                                                            str8 = (String) linkedHashMap.get(str7);
                                                                            if (str8 != null) {
                                                                                if (kotlin.jvm.internal.r.a(fgVar6.f9600y.getValue(), ProjectKind.PDF)) {
                                                                                    fgVar6.D.setValue(Uri.fromFile(new File(str8)));
                                                                                } else {
                                                                                    fgVar6.F.setValue(Uri.fromFile(new File(str8)));
                                                                                }
                                                                                pg.f0 f0Var = pg.f0.f21461a;
                                                                            }
                                                                            str9 = (String) linkedHashMap.get(str6);
                                                                            if (str9 != null) {
                                                                                fgVar6.I.setValue(Uri.fromFile(new File(str9)));
                                                                                pg.f0 f0Var2 = pg.f0.f21461a;
                                                                            }
                                                                            str10 = (String) linkedHashMap.get(str5);
                                                                            if (str10 != null) {
                                                                                fgVar6.L.setValue(Uri.fromFile(new File(str10)));
                                                                                pg.f0 f0Var3 = pg.f0.f21461a;
                                                                            }
                                                                            fgVar6.f9566h.setValue(projectEntityCopy$default);
                                                                            fgVar6.f9560e.b("placeholderProjectId");
                                                                            return new Long(id3);
                                                                        }
                                                                    }
                                                                } else {
                                                                    ghVar.f9727a = fgVar5;
                                                                    ghVar.f9728b = projectEntity2;
                                                                    ghVar.f9729c = null;
                                                                    ghVar.f9736k = 11;
                                                                    if (sVar2.c(projectEntity2, ghVar) != aVar) {
                                                                        projectEntity3 = projectEntity2;
                                                                        fgVar6 = fgVar5;
                                                                        fgVar6.f9566h.setValue(projectEntity3);
                                                                        id3 = projectEntity3.getId();
                                                                        fgVar6.f9560e.b("placeholderProjectId");
                                                                        return new Long(id3);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            j12 = j11;
                                                        }
                                                        wh.c cVar2 = ph.z0.f21632a;
                                                        wh.b bVar = wh.b.f31563c;
                                                        ih ihVar = new ih(j12, fgVar5, null);
                                                        ghVar.f9727a = fgVar5;
                                                        ghVar.f9728b = absolutePath;
                                                        ghVar.f9729c = str2;
                                                        ghVar.f9733g = j12;
                                                        ghVar.f9736k = 8;
                                                        break;
                                                    } else {
                                                        fgVar5 = fgVar3;
                                                    }
                                                    str2 = null;
                                                    uri3 = (Uri) z0Var.getValue();
                                                    if (uri3 == null) {
                                                    }
                                                    wh.c cVar22 = ph.z0.f21632a;
                                                    wh.b bVar2 = wh.b.f31563c;
                                                    ih ihVar2 = new ih(j12, fgVar5, null);
                                                    ghVar.f9727a = fgVar5;
                                                    ghVar.f9728b = absolutePath;
                                                    ghVar.f9729c = str2;
                                                    ghVar.f9733g = j12;
                                                    ghVar.f9736k = 8;
                                                }
                                            }
                                            fgVar3 = fgVar2;
                                            j11 = j10;
                                            absolutePath = null;
                                            z0Var = fgVar3.L;
                                            z0Var2 = fgVar3.I;
                                            if (!qg.p.j("local", "folder", ProjectKind.PDF).contains(fgVar3.f9600y.getValue())) {
                                            }
                                            uri2 = (Uri) z0Var2.getValue();
                                            if (uri2 != null) {
                                            }
                                            str2 = null;
                                            uri3 = (Uri) z0Var.getValue();
                                            if (uri3 == null) {
                                            }
                                            wh.c cVar222 = ph.z0.f21632a;
                                            wh.b bVar22 = wh.b.f31563c;
                                            ih ihVar22 = new ih(j12, fgVar5, null);
                                            ghVar.f9727a = fgVar5;
                                            ghVar.f9728b = absolutePath;
                                            ghVar.f9729c = str2;
                                            ghVar.f9733g = j12;
                                            ghVar.f9736k = 8;
                                            break;
                                        case 110834:
                                            fgVar2 = fgVar8;
                                            j10 = id2;
                                            if (str.equals(ProjectKind.PDF)) {
                                                Uri uri4 = (Uri) fgVar2.D.getValue();
                                                if (uri4 != null) {
                                                    path = uri4.getPath();
                                                    if (path != null) {
                                                        break;
                                                    }
                                                }
                                            }
                                            fgVar3 = fgVar2;
                                            j11 = j10;
                                            absolutePath = null;
                                            z0Var = fgVar3.L;
                                            z0Var2 = fgVar3.I;
                                            if (!qg.p.j("local", "folder", ProjectKind.PDF).contains(fgVar3.f9600y.getValue())) {
                                            }
                                            uri2 = (Uri) z0Var2.getValue();
                                            if (uri2 != null) {
                                            }
                                            str2 = null;
                                            uri3 = (Uri) z0Var.getValue();
                                            if (uri3 == null) {
                                            }
                                            wh.c cVar2222 = ph.z0.f21632a;
                                            wh.b bVar222 = wh.b.f31563c;
                                            ih ihVar222 = new ih(j12, fgVar5, null);
                                            ghVar.f9727a = fgVar5;
                                            ghVar.f9728b = absolutePath;
                                            ghVar.f9729c = str2;
                                            ghVar.f9733g = j12;
                                            ghVar.f9736k = 8;
                                            break;
                                        case 103145323:
                                            if (str.equals("local") && (uri = (Uri) z0Var4.getValue()) != null) {
                                                CharSequence charSequence3 = (CharSequence) fgVar8.C.getValue();
                                                j10 = id2;
                                                path = fgVar8.i(uri, j10, "content", (String) (mh.x.A(charSequence3) ? "index.html" : charSequence3));
                                                fgVar2 = fgVar8;
                                                if (path != null) {
                                                    z0Var4.setValue(Uri.fromFile(new File(path)));
                                                    absolutePath = path;
                                                    fgVar3 = fgVar2;
                                                    j11 = j10;
                                                    z0Var = fgVar3.L;
                                                    z0Var2 = fgVar3.I;
                                                    if (!qg.p.j("local", "folder", ProjectKind.PDF).contains(fgVar3.f9600y.getValue())) {
                                                    }
                                                    uri2 = (Uri) z0Var2.getValue();
                                                    if (uri2 != null) {
                                                    }
                                                    str2 = null;
                                                    uri3 = (Uri) z0Var.getValue();
                                                    if (uri3 == null) {
                                                    }
                                                    wh.c cVar22222 = ph.z0.f21632a;
                                                    wh.b bVar2222 = wh.b.f31563c;
                                                    ih ihVar2222 = new ih(j12, fgVar5, null);
                                                    ghVar.f9727a = fgVar5;
                                                    ghVar.f9728b = absolutePath;
                                                    ghVar.f9729c = str2;
                                                    ghVar.f9733g = j12;
                                                    ghVar.f9736k = 8;
                                                    break;
                                                }
                                            } else {
                                                fgVar2 = fgVar8;
                                                j10 = id2;
                                            }
                                            fgVar3 = fgVar2;
                                            j11 = j10;
                                            absolutePath = null;
                                            z0Var = fgVar3.L;
                                            z0Var2 = fgVar3.I;
                                            if (!qg.p.j("local", "folder", ProjectKind.PDF).contains(fgVar3.f9600y.getValue())) {
                                            }
                                            uri2 = (Uri) z0Var2.getValue();
                                            if (uri2 != null) {
                                            }
                                            str2 = null;
                                            uri3 = (Uri) z0Var.getValue();
                                            if (uri3 == null) {
                                            }
                                            wh.c cVar222222 = ph.z0.f21632a;
                                            wh.b bVar22222 = wh.b.f31563c;
                                            ih ihVar22222 = new ih(j12, fgVar5, null);
                                            ghVar.f9727a = fgVar5;
                                            ghVar.f9728b = absolutePath;
                                            ghVar.f9729c = str2;
                                            ghVar.f9733g = j12;
                                            ghVar.f9736k = 8;
                                            break;
                                        case 106438291:
                                            if (str.equals("paste")) {
                                                File file3 = new File(fgVar8.w(id2), "content");
                                                file3.mkdirs();
                                                file = new File(file3, "index.html");
                                                wh.c cVar3 = ph.z0.f21632a;
                                                wh.b bVar3 = wh.b.f31563c;
                                                hh hhVar = new hh(fgVar8, file, null);
                                                ghVar.f9727a = fgVar8;
                                                ghVar.f9728b = file;
                                                ghVar.f9733g = id2;
                                                ghVar.f9736k = 7;
                                                if (ph.h.e(bVar3, hhVar, ghVar) != aVar) {
                                                    fgVar4 = fgVar8;
                                                    fgVar4.F.setValue(Uri.fromFile(file));
                                                    fgVar4.C.setValue(file.getName());
                                                    j11 = id2;
                                                    absolutePath = file.getAbsolutePath();
                                                    fgVar3 = fgVar4;
                                                    z0Var = fgVar3.L;
                                                    z0Var2 = fgVar3.I;
                                                    if (!qg.p.j("local", "folder", ProjectKind.PDF).contains(fgVar3.f9600y.getValue())) {
                                                    }
                                                    uri2 = (Uri) z0Var2.getValue();
                                                    if (uri2 != null) {
                                                    }
                                                    str2 = null;
                                                    uri3 = (Uri) z0Var.getValue();
                                                    if (uri3 == null) {
                                                    }
                                                    wh.c cVar2222222 = ph.z0.f21632a;
                                                    wh.b bVar222222 = wh.b.f31563c;
                                                    ih ihVar222222 = new ih(j12, fgVar5, null);
                                                    ghVar.f9727a = fgVar5;
                                                    ghVar.f9728b = absolutePath;
                                                    ghVar.f9729c = str2;
                                                    ghVar.f9733g = j12;
                                                    ghVar.f9736k = 8;
                                                    break;
                                                }
                                            }
                                            fgVar2 = fgVar8;
                                            j10 = id2;
                                            fgVar3 = fgVar2;
                                            j11 = j10;
                                            absolutePath = null;
                                            z0Var = fgVar3.L;
                                            z0Var2 = fgVar3.I;
                                            if (!qg.p.j("local", "folder", ProjectKind.PDF).contains(fgVar3.f9600y.getValue())) {
                                            }
                                            uri2 = (Uri) z0Var2.getValue();
                                            if (uri2 != null) {
                                            }
                                            str2 = null;
                                            uri3 = (Uri) z0Var.getValue();
                                            if (uri3 == null) {
                                            }
                                            wh.c cVar22222222 = ph.z0.f21632a;
                                            wh.b bVar2222222 = wh.b.f31563c;
                                            ih ihVar2222222 = new ih(j12, fgVar5, null);
                                            ghVar.f9727a = fgVar5;
                                            ghVar.f9728b = absolutePath;
                                            ghVar.f9729c = str2;
                                            ghVar.f9733g = j12;
                                            ghVar.f9736k = 8;
                                            break;
                                        default:
                                            fgVar2 = fgVar8;
                                            j10 = id2;
                                            fgVar3 = fgVar2;
                                            j11 = j10;
                                            absolutePath = null;
                                            z0Var = fgVar3.L;
                                            z0Var2 = fgVar3.I;
                                            if (!qg.p.j("local", "folder", ProjectKind.PDF).contains(fgVar3.f9600y.getValue())) {
                                            }
                                            uri2 = (Uri) z0Var2.getValue();
                                            if (uri2 != null) {
                                            }
                                            str2 = null;
                                            uri3 = (Uri) z0Var.getValue();
                                            if (uri3 == null) {
                                            }
                                            wh.c cVar222222222 = ph.z0.f21632a;
                                            wh.b bVar22222222 = wh.b.f31563c;
                                            ih ihVar22222222 = new ih(j12, fgVar5, null);
                                            ghVar.f9727a = fgVar5;
                                            ghVar.f9728b = absolutePath;
                                            ghVar.f9729c = str2;
                                            ghVar.f9733g = j12;
                                            ghVar.f9736k = 8;
                                            break;
                                    }
                                } else {
                                    ghVar.f9727a = fgVar;
                                    ghVar.f9736k = 6;
                                    break;
                                }
                            } else {
                                ghVar.f9727a = fgVar;
                                ghVar.f9736k = 5;
                                break;
                            }
                        } else {
                            ghVar.f9727a = fgVar;
                            ghVar.f9736k = 4;
                            break;
                        }
                    } else {
                        ghVar.f9727a = fgVar;
                        ghVar.f9736k = 3;
                        break;
                    }
                } else {
                    ghVar.f9727a = fgVar;
                    ghVar.f9736k = 2;
                    break;
                }
                return aVar;
            case 1:
                fgVar = ghVar.f9727a;
                pg.q.b(obj);
                l2Var = fgVar.f9571j0;
                if (l2Var != null) {
                }
                return aVar;
            case 2:
                fgVar = ghVar.f9727a;
                pg.q.b(obj);
                pg.f0 f0Var4 = pg.f0.f21461a;
                l2Var2 = fgVar.f9573k0;
                if (l2Var2 != null) {
                }
                return aVar;
            case 3:
                fgVar = ghVar.f9727a;
                pg.q.b(obj);
                pg.f0 f0Var5 = pg.f0.f21461a;
                l2Var3 = fgVar.f9575l0;
                if (l2Var3 != null) {
                }
                return aVar;
            case 4:
                fgVar = ghVar.f9727a;
                pg.q.b(obj);
                pg.f0 f0Var6 = pg.f0.f21461a;
                l2Var4 = fgVar.f9569i0;
                if (l2Var4 != null) {
                }
                return aVar;
            case 5:
                fgVar = ghVar.f9727a;
                pg.q.b(obj);
                pg.f0 f0Var7 = pg.f0.f21461a;
                l2Var5 = fgVar.f9577m0;
                if (l2Var5 != null) {
                }
                return aVar;
            case 6:
                fgVar = ghVar.f9727a;
                pg.q.b(obj);
                pg.f0 f0Var8 = pg.f0.f21461a;
                fg fgVar82 = fgVar;
                sh.z0 z0Var32 = fgVar82.f9566h;
                sh.z0 z0Var42 = fgVar82.F;
                ProjectEntity projectEntity52 = (ProjectEntity) z0Var32.getValue();
                if (projectEntity52 == null) {
                }
                str = (String) fgVar82.f9600y.getValue();
                switch (str.hashCode()) {
                    case -1268966290:
                        break;
                    case 110834:
                        break;
                    case 103145323:
                        break;
                    case 106438291:
                        break;
                }
            case 7:
                id2 = ghVar.f9733g;
                file = (File) ghVar.f9728b;
                fgVar4 = ghVar.f9727a;
                pg.q.b(obj);
                fgVar4.F.setValue(Uri.fromFile(file));
                fgVar4.C.setValue(file.getName());
                j11 = id2;
                absolutePath = file.getAbsolutePath();
                fgVar3 = fgVar4;
                z0Var = fgVar3.L;
                z0Var2 = fgVar3.I;
                if (!qg.p.j("local", "folder", ProjectKind.PDF).contains(fgVar3.f9600y.getValue())) {
                }
                uri2 = (Uri) z0Var2.getValue();
                if (uri2 != null) {
                }
                str2 = null;
                uri3 = (Uri) z0Var.getValue();
                if (uri3 == null) {
                }
                wh.c cVar2222222222 = ph.z0.f21632a;
                wh.b bVar222222222 = wh.b.f31563c;
                ih ihVar222222222 = new ih(j12, fgVar5, null);
                ghVar.f9727a = fgVar5;
                ghVar.f9728b = absolutePath;
                ghVar.f9729c = str2;
                ghVar.f9733g = j12;
                ghVar.f9736k = 8;
                break;
            case 8:
                long j17 = ghVar.f9733g;
                str2 = ghVar.f9729c;
                absolutePath = (String) ghVar.f9728b;
                fg fgVar10 = ghVar.f9727a;
                pg.q.b(obj);
                fgVar5 = fgVar10;
                j12 = j17;
                str3 = null;
                String str112 = str2;
                long j152 = j12;
                String str122 = absolutePath;
                sh.z0 z0Var52 = fgVar5.f9586r;
                n8.s sVar22 = fgVar5.f9554b;
                sh.z0 z0Var62 = fgVar5.f9566h;
                sh.z0 z0Var72 = fgVar5.f9563f0;
                sh.z0 z0Var82 = fgVar5.W0;
                sh.z0 z0Var92 = fgVar5.f9588s;
                sh.z0 z0Var102 = fgVar5.f9600y;
                it = mh.x.D((CharSequence) z0Var52.getValue()).iterator();
                while (true) {
                    fVar = (mh.f) it;
                    if (fVar.hasNext()) {
                    }
                }
                str4 = (String) next;
                String str132 = "Untitled";
                if (str4 != null) {
                    strB0 = mh.y.b0(50, string3);
                    if (!mh.x.A(strB0)) {
                    }
                    break;
                }
                String str142 = str132;
                string = mh.x.W((String) z0Var92.getValue()).toString();
                if (!f.b(string)) {
                }
                z0Var92.setValue(string);
                WebViewSettings webViewSettings2 = (WebViewSettings) z0Var82.getValue();
                WebViewSettings webViewSettingsCopy2 = webViewSettings2.copy(((-131073) & 1) != 0 ? webViewSettings2.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings2.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings2.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings2.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings2.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings2.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings2.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings2.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings2.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings2.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings2.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings2.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings2.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings2.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings2.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings2.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings2.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings2.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings2.splashEnabled : ((Boolean) fgVar5.J.getValue()).booleanValue(), ((-131073) & 8388608) != 0 ? webViewSettings2.splashBgColor : (String) fgVar5.M.getValue(), ((-131073) & 16777216) != 0 ? webViewSettings2.splashFadeOut : ((Boolean) fgVar5.N.getValue()).booleanValue(), ((-131073) & 33554432) != 0 ? webViewSettings2.splashLoaderStyle : (String) fgVar5.O.getValue(), ((-131073) & 67108864) != 0 ? webViewSettings2.splashIconSize : ((Number) fgVar5.P.getValue()).intValue(), ((-131073) & 134217728) != 0 ? webViewSettings2.splashIconRadius : ((Number) fgVar5.Q.getValue()).intValue(), ((-131073) & 268435456) != 0 ? webViewSettings2.splashLoaderSize : ((Number) fgVar5.R.getValue()).intValue(), ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings2.splashSpacing : ((Number) fgVar5.S.getValue()).intValue(), ((-131073) & 1073741824) != 0 ? webViewSettings2.splashDuration : ((Number) fgVar5.T.getValue()).intValue(), ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings2.splashLoaderThickness : ((Number) fgVar5.U.getValue()).intValue(), (4194303 & 1) != 0 ? webViewSettings2.splashFadeDuration : ((Number) fgVar5.V.getValue()).intValue(), (4194303 & 2) != 0 ? webViewSettings2.splashLoaderColor : (String) fgVar5.W.getValue(), (4194303 & 4) != 0 ? webViewSettings2.splashFullScreen : ((Boolean) fgVar5.X.getValue()).booleanValue(), (4194303 & 8) != 0 ? webViewSettings2.splashHideLoader : ((Boolean) fgVar5.Y.getValue()).booleanValue(), (4194303 & 16) != 0 ? webViewSettings2.colorMode : null, (4194303 & 32) != 0 ? webViewSettings2.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings2.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings2.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings2.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings2.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings2.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings2.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings2.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings2.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings2.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings2.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings2.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings2.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.pdfStartPage : 0);
                z0Var82.setValue(webViewSettingsCopy2);
                String str152 = (String) fgVar5.f9586r.getValue();
                Integer numG7 = mh.s.g((String) fgVar5.f9590t.getValue());
                if (numG7 == null) {
                }
                String str162 = (String) fgVar5.f9592u.getValue();
                Integer numG22 = mh.s.g((String) fgVar5.f9594v.getValue());
                int iIntValue22 = numG22 == null ? numG22.intValue() : 24;
                Integer numG32 = mh.s.g((String) fgVar5.f9596w.getValue());
                int iIntValue32 = numG32 == null ? numG32.intValue() : 36;
                Integer numG42 = mh.s.g((String) fgVar5.f9598x.getValue());
                String str172 = (String) z0Var102.getValue();
                if (!kotlin.jvm.internal.r.a(z0Var102.getValue(), "url")) {
                }
                String strS2 = s(!kotlin.jvm.internal.r.a(z0Var102.getValue(), "url") ? qg.x.x(qg.x.O(qg.p.j("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"), (Collection) z0Var72.getValue())) : (List) z0Var72.getValue());
                String str182 = (String) fgVar5.V0.getValue();
                String str192 = (String) fgVar5.f9585q0.getValue();
                boolean zBooleanValue17 = ((Boolean) fgVar5.f9587r0.getValue()).booleanValue();
                boolean zBooleanValue22 = ((Boolean) fgVar5.f9589s0.getValue()).booleanValue();
                boolean zBooleanValue32 = ((Boolean) fgVar5.f9591t0.getValue()).booleanValue();
                boolean zBooleanValue42 = ((Boolean) fgVar5.f9593u0.getValue()).booleanValue();
                boolean zBooleanValue52 = ((Boolean) fgVar5.f9595v0.getValue()).booleanValue();
                String strE2 = E(webViewSettingsCopy2);
                Long l102 = (Long) fgVar5.f9583p0.getValue();
                String str202 = (String) fgVar5.f9581o0.getValue();
                boolean zBooleanValue62 = ((Boolean) fgVar5.f9599x0.getValue()).booleanValue();
                boolean zBooleanValue72 = ((Boolean) fgVar5.f9597w0.getValue()).booleanValue();
                String string42 = mh.x.W((String) fgVar5.f9601y0.getValue()).toString();
                if (mh.x.A(string42)) {
                }
                boolean zBooleanValue82 = ((Boolean) fgVar5.f9603z0.getValue()).booleanValue();
                String string52 = mh.x.W((String) fgVar5.A0.getValue()).toString();
                if (mh.x.A(string52)) {
                }
                String string62 = mh.x.W((String) fgVar5.B0.getValue()).toString();
                if (mh.x.A(string62)) {
                }
                String string72 = mh.x.W((String) fgVar5.C0.getValue()).toString();
                if (mh.x.A(string72)) {
                }
                String string82 = mh.x.W((String) fgVar5.D0.getValue()).toString();
                if (mh.x.A(string82)) {
                }
                string2 = mh.x.W((String) fgVar5.E0.getValue()).toString();
                if (mh.x.A(string2)) {
                }
                if (string2 == null) {
                }
                String str262 = string2;
                boolean zBooleanValue92 = ((Boolean) fgVar5.F0.getValue()).booleanValue();
                String string92 = mh.x.W((String) fgVar5.G0.getValue()).toString();
                if (mh.x.A(string92)) {
                }
                boolean zBooleanValue102 = ((Boolean) fgVar5.H0.getValue()).booleanValue();
                boolean zBooleanValue112 = ((Boolean) fgVar5.I0.getValue()).booleanValue();
                boolean zBooleanValue122 = ((Boolean) fgVar5.J0.getValue()).booleanValue();
                boolean zBooleanValue132 = ((Boolean) fgVar5.K0.getValue()).booleanValue();
                boolean zBooleanValue142 = ((Boolean) fgVar5.L0.getValue()).booleanValue();
                boolean zBooleanValue152 = ((Boolean) fgVar5.M0.getValue()).booleanValue();
                Integer numG52 = mh.s.g((String) fgVar5.N0.getValue());
                if (numG52 == null) {
                }
                Integer numG62 = mh.s.g((String) fgVar5.O0.getValue());
                if (numG62 == null) {
                }
                int iIntValue62 = ((Number) fgVar5.P0.getValue()).intValue();
                int iIntValue72 = ((Number) fgVar5.Q0.getValue()).intValue();
                String str282 = (String) fgVar5.R0.getValue();
                boolean zBooleanValue162 = ((Boolean) fgVar5.S0.getValue()).booleanValue();
                String str292 = (String) fgVar5.T0.getValue();
                String string102 = mh.x.W((String) fgVar5.U0.getValue()).toString();
                if (mh.x.A(string102)) {
                }
                projectEntity = (ProjectEntity) z0Var62.getValue();
                if (projectEntity != null) {
                    String kind2 = ProjectKind.APK;
                    String str312 = kind2;
                    ProjectEntity projectEntity72 = (ProjectEntity) z0Var62.getValue();
                    projectEntity2 = new ProjectEntity(j152, str142, str152, string, iIntValue, str162, iIntValue22, iIntValue32, numG42, str172, str122, strP, strS2, str112, str3, str182, str192, zBooleanValue17, zBooleanValue22, zBooleanValue32, zBooleanValue42, zBooleanValue52, strE2, l102, str202, "advanced", zBooleanValue62, zBooleanValue72, str21, false, null, null, "non_consumable", false, true, true, true, null, 0, null, null, null, zBooleanValue82, str22, str23, str24, str25, str262, zBooleanValue92, str27, zBooleanValue102, zBooleanValue112, zBooleanValue122, zBooleanValue132, zBooleanValue142, zBooleanValue152, iIntValue4, iIntValue5, iIntValue62, iIntValue72, str282, zBooleanValue162, str292, str30, str312, projectEntity72 == null ? projectEntity72.getFolderId() : null, 0L, 0L, 0, 0, 12, null);
                    str5 = str3;
                    j13 = 0;
                    BuildLogger.INSTANCE.detail(R.string.build_log_project_saved_paths, new Long(projectEntity2.getId()), str122 != null ? "none" : str122, str112 != null ? "none" : str112, str5 != null ? "none" : str5);
                    if (projectEntity2.getId() != 0) {
                    }
                    return aVar;
                }
                fgVar6.f9560e.b("placeholderProjectId");
                return new Long(id3);
            case 9:
                ProjectEntity projectEntity8 = ghVar.f9731e;
                String str33 = ghVar.f9730d;
                String str34 = ghVar.f9729c;
                str7 = (String) ghVar.f9728b;
                fgVar7 = ghVar.f9727a;
                pg.q.b(obj);
                projectEntity4 = projectEntity8;
                str5 = str33;
                str6 = str34;
                j13 = 0;
                long jLongValue2 = ((Number) obj).longValue();
                String[] strArr22 = {str7, str6, str5};
                canonicalFile = fgVar7.w(j13).getCanonicalFile();
                File canonicalFile22 = fgVar7.w(jLongValue2).getCanonicalFile();
                if (canonicalFile.exists()) {
                }
                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                i10 = 0;
                while (i10 < 3) {
                }
                long j162 = jLongValue2;
                projectEntityCopy$default = ProjectEntity.copy$default(projectEntity4, j162, null, null, null, 0, null, 0, 0, null, null, (String) linkedHashMap22.get(str7), null, null, (String) linkedHashMap22.get(str6), (String) linkedHashMap22.get(str5), null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -25602, -1, 15, null);
                sVar = fgVar7.f9554b;
                ghVar.f9727a = fgVar7;
                ghVar.f9728b = str7;
                ghVar.f9729c = str6;
                ghVar.f9730d = str5;
                ghVar.f9731e = projectEntityCopy$default;
                ghVar.f9732f = linkedHashMap22;
                ghVar.f9733g = j162;
                ghVar.f9736k = 10;
                if (sVar.c(projectEntityCopy$default, ghVar) != aVar) {
                }
                return aVar;
            case 10:
                id3 = ghVar.f9733g;
                linkedHashMap = ghVar.f9732f;
                projectEntityCopy$default = ghVar.f9731e;
                str5 = ghVar.f9730d;
                str6 = ghVar.f9729c;
                str7 = (String) ghVar.f9728b;
                fgVar6 = ghVar.f9727a;
                pg.q.b(obj);
                str8 = (String) linkedHashMap.get(str7);
                if (str8 != null) {
                }
                str9 = (String) linkedHashMap.get(str6);
                if (str9 != null) {
                }
                str10 = (String) linkedHashMap.get(str5);
                if (str10 != null) {
                }
                fgVar6.f9566h.setValue(projectEntityCopy$default);
                fgVar6.f9560e.b("placeholderProjectId");
                return new Long(id3);
            case 11:
                projectEntity3 = (ProjectEntity) ghVar.f9728b;
                fgVar6 = ghVar.f9727a;
                pg.q.b(obj);
                fgVar6.f9566h.setValue(projectEntity3);
                id3 = projectEntity3.getId();
                fgVar6.f9560e.b("placeholderProjectId");
                return new Long(id3);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final sh.z0 F(androidx.lifecycle.l0 l0Var, String str, Object obj) {
        Object objA = l0Var.a(str);
        if (objA != null) {
            obj = objA;
        }
        sh.z0 z0VarA = sh.a1.a(obj);
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new lh(z0VarA, l0Var, str, this, null), 3);
        return z0VarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(eh.l<? super ProjectEntity, ProjectEntity> lVar, tg.e<? super pg.f0> eVar) {
        k kVar;
        ProjectEntity projectEntityInvoke;
        fg fgVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i10 = kVar.f9640e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f9640e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        }
        Object obj = kVar.f9638c;
        ug.a aVar = ug.a.f29706a;
        int i11 = kVar.f9640e;
        if (i11 == 0) {
            pg.q.b(obj);
            ProjectEntity projectEntity = (ProjectEntity) this.f9566h.getValue();
            if (projectEntity != null) {
                projectEntityInvoke = lVar.invoke(k(projectEntity));
                kVar.f9636a = this;
                kVar.f9637b = projectEntityInvoke;
                kVar.f9640e = 1;
                if (this.f9554b.c(projectEntityInvoke, kVar) == aVar) {
                    return aVar;
                }
                fgVar = this;
            }
            return pg.f0.f21461a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        projectEntityInvoke = kVar.f9637b;
        fgVar = kVar.f9636a;
        pg.q.b(obj);
        fgVar.f9566h.setValue(projectEntityInvoke);
        return pg.f0.f21461a;
    }

    public final String i(Uri uri, long j10, String str, String input) throws IOException {
        String lowerCase;
        String lowerCase2;
        InputStream inputStreamOpenInputStream;
        try {
            File file = new File(w(j10), str);
            file.mkdirs();
            Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9._-]");
            kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
            kotlin.jvm.internal.r.e(input, "input");
            String strReplaceAll = patternCompile.matcher(input).replaceAll("_");
            kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
            File canonicalFile = new File(file, strReplaceAll).getCanonicalFile();
            File canonicalFile2 = file.getCanonicalFile();
            kotlin.jvm.internal.r.b(canonicalFile);
            kotlin.jvm.internal.r.b(canonicalFile2);
            if (!ah.l.m(canonicalFile, canonicalFile2)) {
                BuildLogger.INSTANCE.error(R.string.build_log_security_violation, strReplaceAll);
                return null;
            }
            String scheme = uri.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (kotlin.jvm.internal.r.a(lowerCase, "file")) {
                String path = uri.getPath();
                File canonicalFile3 = path != null ? new File(path).getCanonicalFile() : null;
                if (canonicalFile3 != null && canonicalFile3.equals(canonicalFile)) {
                    BuildLogger.INSTANCE.detail(R.string.build_log_same_file_skip, canonicalFile.getAbsolutePath());
                    return canonicalFile.getAbsolutePath();
                }
            }
            String scheme2 = uri.getScheme();
            if (scheme2 != null) {
                lowerCase2 = scheme2.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.r.d(lowerCase2, "toLowerCase(...)");
            } else {
                lowerCase2 = null;
            }
            if (kotlin.jvm.internal.r.a(lowerCase2, "file")) {
                String path2 = uri.getPath();
                inputStreamOpenInputStream = path2 != null ? new FileInputStream(new File(path2)) : null;
            } else {
                inputStreamOpenInputStream = this.f9562f.getContentResolver().openInputStream(uri);
            }
            if (inputStreamOpenInputStream == null) {
                BuildLogger.INSTANCE.error(R.string.build_log_uri_open_failed_perm, uri);
                return null;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(canonicalFile);
                try {
                    ah.b.a(inputStreamOpenInputStream, fileOutputStream, 8192);
                    fileOutputStream.close();
                    inputStreamOpenInputStream.close();
                    BuildLogger.INSTANCE.detail(R.string.build_log_file_copied, canonicalFile.getAbsolutePath(), Long.valueOf(canonicalFile.length()));
                    return canonicalFile.getAbsolutePath();
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            BuildLogger buildLogger = BuildLogger.INSTANCE;
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            buildLogger.error(R.string.build_log_file_copy_error, message);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(vg.c cVar) {
        jg jgVar;
        fg fgVar;
        ProjectEntity projectEntity;
        fg fgVar2;
        if (cVar instanceof jg) {
            jgVar = (jg) cVar;
            int i10 = jgVar.f9898e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                jgVar.f9898e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                jgVar = new jg(this, cVar);
            }
        }
        Object objF = jgVar.f9896c;
        ug.a aVar = ug.a.f29706a;
        int i11 = jgVar.f9898e;
        if (i11 == 0) {
            pg.q.b(objF);
            n8.g1 g1Var = this.f9558d.f18530f;
            jgVar.f9894a = this;
            jgVar.f9898e = 1;
            objF = gg.a.f(g1Var, jgVar);
            if (objF != aVar) {
                fgVar = this;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ProjectEntity projectEntity2 = jgVar.f9895b;
                fgVar2 = jgVar.f9894a;
                pg.q.b(objF);
                projectEntity = projectEntity2;
                long jLongValue = ((Number) objF).longValue();
                fgVar2.f9560e.c(new Long(jLongValue), "placeholderProjectId");
                fgVar2.f9566h.setValue(ProjectEntity.copy$default(projectEntity, jLongValue, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -2, -1, 15, null));
                sh.z0 z0Var = fgVar2.f9599x0;
                Boolean bool = Boolean.FALSE;
                z0Var.getClass();
                z0Var.j(null, bool);
                return pg.f0.f21461a;
            }
            fgVar = jgVar.f9894a;
            pg.q.b(objF);
            n8.i iVar = fgVar.f9564g;
            Long l10 = iVar.f18471c;
            iVar.f18471c = null;
            projectEntity = new ProjectEntity(0L, "", "", "com.htmltoapk.app", 1, "1.0", 24, 36, null, "local", null, null, "[\"android.permission.INTERNET\",\"android.permission.ACCESS_NETWORK_STATE\",\"android.permission.VIBRATE\"]", null, null, "#2196F3", "portrait", true, false, false, false, false, "{}", null, ProjectKind.APK, "advanced", false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, l10, 0L, 0L, -134217728, -1, 13, null);
            n8.s sVar = fgVar.f9554b;
            jgVar.f9894a = fgVar;
            jgVar.f9895b = projectEntity;
            jgVar.f9898e = 3;
            objF = sVar.f18583a.insert(projectEntity, jgVar);
            if (objF != aVar) {
                fgVar2 = fgVar;
                long jLongValue2 = ((Number) objF).longValue();
                fgVar2.f9560e.c(new Long(jLongValue2), "placeholderProjectId");
                fgVar2.f9566h.setValue(ProjectEntity.copy$default(projectEntity, jLongValue2, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -2, -1, 15, null));
                sh.z0 z0Var2 = fgVar2.f9599x0;
                Boolean bool2 = Boolean.FALSE;
                z0Var2.getClass();
                z0Var2.j(null, bool2);
                return pg.f0.f21461a;
            }
            return aVar;
        }
        fgVar = jgVar.f9894a;
        pg.q.b(objF);
        ((Boolean) objF).getClass();
        fgVar.y();
        wh.c cVar2 = ph.z0.f21632a;
        wh.b bVar = wh.b.f31563c;
        kg kgVar = new kg(fgVar, null);
        jgVar.f9894a = fgVar;
        jgVar.f9898e = 2;
        if (ph.h.e(bVar, kgVar, jgVar) != aVar) {
            n8.i iVar2 = fgVar.f9564g;
            Long l102 = iVar2.f18471c;
            iVar2.f18471c = null;
            projectEntity = new ProjectEntity(0L, "", "", "com.htmltoapk.app", 1, "1.0", 24, 36, null, "local", null, null, "[\"android.permission.INTERNET\",\"android.permission.ACCESS_NETWORK_STATE\",\"android.permission.VIBRATE\"]", null, null, "#2196F3", "portrait", true, false, false, false, false, "{}", null, ProjectKind.APK, "advanced", false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, l102, 0L, 0L, -134217728, -1, 13, null);
            n8.s sVar2 = fgVar.f9554b;
            jgVar.f9894a = fgVar;
            jgVar.f9895b = projectEntity;
            jgVar.f9898e = 3;
            objF = sVar2.f18583a.insert(projectEntity, jgVar);
            if (objF != aVar) {
            }
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x039b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ProjectEntity k(ProjectEntity projectEntity) {
        Object next;
        String appName;
        String sourcePath;
        String str;
        String iconPath;
        String str2;
        Uri uri;
        String splashPath;
        String str3;
        String string;
        String string2;
        WebViewSettings webViewSettings = (WebViewSettings) this.W0.getValue();
        WebViewSettings webViewSettingsCopy = webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : ((Boolean) this.J.getValue()).booleanValue(), ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : (String) this.M.getValue(), ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : ((Boolean) this.N.getValue()).booleanValue(), ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : (String) this.O.getValue(), ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : ((Number) this.P.getValue()).intValue(), ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : ((Number) this.Q.getValue()).intValue(), ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : ((Number) this.R.getValue()).intValue(), ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : ((Number) this.S.getValue()).intValue(), ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : ((Number) this.T.getValue()).intValue(), ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : ((Number) this.U.getValue()).intValue(), (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : ((Number) this.V.getValue()).intValue(), (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : (String) this.W.getValue(), (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : ((Boolean) this.X.getValue()).booleanValue(), (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : ((Boolean) this.Y.getValue()).booleanValue(), (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0);
        sh.z0 z0Var = this.f9586r;
        Iterator<String> it = mh.x.D((CharSequence) z0Var.getValue()).iterator();
        while (true) {
            mh.f fVar = (mh.f) it;
            if (!fVar.hasNext()) {
                next = null;
                break;
            }
            next = fVar.next();
            if (!mh.x.A((String) next)) {
                break;
            }
        }
        String str4 = (String) next;
        if (str4 == null || (string2 = mh.x.W(str4).toString()) == null) {
            appName = projectEntity.getAppName();
        } else {
            appName = mh.y.b0(50, string2);
            if (mh.x.A(appName)) {
                appName = projectEntity.getAppName();
            }
            if (appName == null) {
            }
        }
        if (mh.x.A(appName)) {
            appName = projectEntity.getName();
        }
        String str5 = appName;
        String str6 = (String) z0Var.getValue();
        CharSequence packageName = (CharSequence) this.f9588s.getValue();
        if (mh.x.A(packageName)) {
            packageName = projectEntity.getPackageName();
        }
        String str7 = (String) packageName;
        Integer numG = mh.s.g((String) this.f9590t.getValue());
        int iIntValue = numG != null ? numG.intValue() : projectEntity.getVersionCode();
        CharSequence versionName = (CharSequence) this.f9592u.getValue();
        if (mh.x.A(versionName)) {
            versionName = projectEntity.getVersionName();
        }
        String str8 = (String) versionName;
        Integer numG2 = mh.s.g((String) this.f9594v.getValue());
        int iIntValue2 = numG2 != null ? numG2.intValue() : projectEntity.getMinSdk();
        Integer numG3 = mh.s.g((String) this.f9596w.getValue());
        int iIntValue3 = numG3 != null ? numG3.intValue() : projectEntity.getTargetSdk();
        Integer numG4 = mh.s.g((String) this.f9598x.getValue());
        sh.z0 z0Var2 = this.f9600y;
        String str9 = (String) z0Var2.getValue();
        if (kotlin.jvm.internal.r.a(z0Var2.getValue(), ProjectKind.PDF)) {
            Uri uri2 = (Uri) this.D.getValue();
            if (uri2 != null) {
                sourcePath = uri2.getPath();
                str = sourcePath;
            }
            str = null;
        } else {
            sh.z0 z0Var3 = this.F;
            Uri uri3 = (Uri) z0Var3.getValue();
            if (kotlin.jvm.internal.r.a(uri3 != null ? uri3.getScheme() : null, "file")) {
                Uri uri4 = (Uri) z0Var3.getValue();
                if (uri4 != null) {
                    sourcePath = uri4.getPath();
                }
                str = null;
            } else {
                sourcePath = projectEntity.getSourcePath();
            }
            str = sourcePath;
        }
        String strP = kotlin.jvm.internal.r.a(z0Var2.getValue(), "url") ? p((String) this.f9602z.getValue()) : projectEntity.getSourceUrl();
        boolean zA = kotlin.jvm.internal.r.a(z0Var2.getValue(), "url");
        sh.z0 z0Var4 = this.f9563f0;
        String strS = s(zA ? qg.x.x(qg.x.O(qg.p.j("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"), (Collection) z0Var4.getValue())) : (List) z0Var4.getValue());
        sh.z0 z0Var5 = this.I;
        Uri uri5 = (Uri) z0Var5.getValue();
        if (kotlin.jvm.internal.r.a(uri5 != null ? uri5.getScheme() : null, "file")) {
            Uri uri6 = (Uri) z0Var5.getValue();
            if (uri6 == null) {
                str2 = null;
                sh.z0 z0Var6 = this.L;
                uri = (Uri) z0Var6.getValue();
                if (kotlin.jvm.internal.r.a(uri == null ? uri.getScheme() : null, "file")) {
                    splashPath = projectEntity.getSplashPath();
                } else {
                    Uri uri7 = (Uri) z0Var6.getValue();
                    if (uri7 == null) {
                        str3 = null;
                        String str10 = (String) this.V0.getValue();
                        String str11 = (String) this.f9585q0.getValue();
                        boolean zBooleanValue = ((Boolean) this.f9587r0.getValue()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) this.f9589s0.getValue()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) this.f9591t0.getValue()).booleanValue();
                        boolean zBooleanValue4 = ((Boolean) this.f9593u0.getValue()).booleanValue();
                        boolean zBooleanValue5 = ((Boolean) this.f9595v0.getValue()).booleanValue();
                        String strE = E(webViewSettingsCopy);
                        Long l10 = (Long) this.f9583p0.getValue();
                        String str12 = (String) this.f9581o0.getValue();
                        boolean zBooleanValue6 = ((Boolean) this.f9599x0.getValue()).booleanValue();
                        boolean zBooleanValue7 = ((Boolean) this.f9597w0.getValue()).booleanValue();
                        String string3 = mh.x.W((String) this.f9601y0.getValue()).toString();
                        String str13 = !mh.x.A(string3) ? string3 : null;
                        boolean zBooleanValue8 = ((Boolean) this.f9603z0.getValue()).booleanValue();
                        String string4 = mh.x.W((String) this.A0.getValue()).toString();
                        String str14 = !mh.x.A(string4) ? string4 : null;
                        String string5 = mh.x.W((String) this.B0.getValue()).toString();
                        String str15 = !mh.x.A(string5) ? string5 : null;
                        String string6 = mh.x.W((String) this.C0.getValue()).toString();
                        String str16 = !mh.x.A(string6) ? string6 : null;
                        String string7 = mh.x.W((String) this.D0.getValue()).toString();
                        String str17 = !mh.x.A(string7) ? string7 : null;
                        string = mh.x.W((String) this.E0.getValue()).toString();
                        if (mh.x.A(string)) {
                            string = null;
                        }
                        if (string == null) {
                            string = "bottom";
                        }
                        String str18 = string;
                        boolean zBooleanValue9 = ((Boolean) this.F0.getValue()).booleanValue();
                        String string8 = mh.x.W((String) this.G0.getValue()).toString();
                        String str19 = !mh.x.A(string8) ? string8 : null;
                        boolean zBooleanValue10 = ((Boolean) this.H0.getValue()).booleanValue();
                        boolean zBooleanValue11 = ((Boolean) this.I0.getValue()).booleanValue();
                        boolean zBooleanValue12 = ((Boolean) this.J0.getValue()).booleanValue();
                        boolean zBooleanValue13 = ((Boolean) this.K0.getValue()).booleanValue();
                        boolean zBooleanValue14 = ((Boolean) this.L0.getValue()).booleanValue();
                        boolean zBooleanValue15 = ((Boolean) this.M0.getValue()).booleanValue();
                        Integer numG5 = mh.s.g((String) this.N0.getValue());
                        int iIntValue4 = numG5 != null ? numG5.intValue() : 0;
                        Integer numG6 = mh.s.g((String) this.O0.getValue());
                        int iIntValue5 = numG6 != null ? numG6.intValue() : 0;
                        int iIntValue6 = ((Number) this.P0.getValue()).intValue();
                        int iIntValue7 = ((Number) this.Q0.getValue()).intValue();
                        String str20 = (String) this.R0.getValue();
                        boolean zBooleanValue16 = ((Boolean) this.S0.getValue()).booleanValue();
                        String str21 = (String) this.T0.getValue();
                        String string9 = mh.x.W((String) this.U0.getValue()).toString();
                        return ProjectEntity.copy$default(projectEntity, 0L, str5, str6, str7, iIntValue, str8, iIntValue2, iIntValue3, numG4, str9, str, strP, strS, str2, str3, str10, str11, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, strE, l10, str12, null, zBooleanValue6, zBooleanValue7, str13, false, null, null, null, false, false, false, false, null, 0, null, null, null, zBooleanValue8, str14, str15, str16, str17, str18, zBooleanValue9, str19, zBooleanValue10, zBooleanValue11, zBooleanValue12, zBooleanValue13, zBooleanValue14, zBooleanValue15, iIntValue4, iIntValue5, iIntValue6, iIntValue7, str20, zBooleanValue16, str21, !mh.x.A(string9) ? string9 : null, null, null, 0L, System.currentTimeMillis(), -503316479, 1023, 7, null);
                    }
                    splashPath = uri7.getPath();
                }
                str3 = splashPath;
                String str102 = (String) this.V0.getValue();
                String str112 = (String) this.f9585q0.getValue();
                boolean zBooleanValue17 = ((Boolean) this.f9587r0.getValue()).booleanValue();
                boolean zBooleanValue22 = ((Boolean) this.f9589s0.getValue()).booleanValue();
                boolean zBooleanValue32 = ((Boolean) this.f9591t0.getValue()).booleanValue();
                boolean zBooleanValue42 = ((Boolean) this.f9593u0.getValue()).booleanValue();
                boolean zBooleanValue52 = ((Boolean) this.f9595v0.getValue()).booleanValue();
                String strE2 = E(webViewSettingsCopy);
                Long l102 = (Long) this.f9583p0.getValue();
                String str122 = (String) this.f9581o0.getValue();
                boolean zBooleanValue62 = ((Boolean) this.f9599x0.getValue()).booleanValue();
                boolean zBooleanValue72 = ((Boolean) this.f9597w0.getValue()).booleanValue();
                String string32 = mh.x.W((String) this.f9601y0.getValue()).toString();
                if (!mh.x.A(string32)) {
                }
                boolean zBooleanValue82 = ((Boolean) this.f9603z0.getValue()).booleanValue();
                String string42 = mh.x.W((String) this.A0.getValue()).toString();
                if (!mh.x.A(string42)) {
                }
                String string52 = mh.x.W((String) this.B0.getValue()).toString();
                if (!mh.x.A(string52)) {
                }
                String string62 = mh.x.W((String) this.C0.getValue()).toString();
                if (!mh.x.A(string62)) {
                }
                String string72 = mh.x.W((String) this.D0.getValue()).toString();
                if (!mh.x.A(string72)) {
                }
                string = mh.x.W((String) this.E0.getValue()).toString();
                if (mh.x.A(string)) {
                }
                if (string == null) {
                }
                String str182 = string;
                boolean zBooleanValue92 = ((Boolean) this.F0.getValue()).booleanValue();
                String string82 = mh.x.W((String) this.G0.getValue()).toString();
                if (!mh.x.A(string82)) {
                }
                boolean zBooleanValue102 = ((Boolean) this.H0.getValue()).booleanValue();
                boolean zBooleanValue112 = ((Boolean) this.I0.getValue()).booleanValue();
                boolean zBooleanValue122 = ((Boolean) this.J0.getValue()).booleanValue();
                boolean zBooleanValue132 = ((Boolean) this.K0.getValue()).booleanValue();
                boolean zBooleanValue142 = ((Boolean) this.L0.getValue()).booleanValue();
                boolean zBooleanValue152 = ((Boolean) this.M0.getValue()).booleanValue();
                Integer numG52 = mh.s.g((String) this.N0.getValue());
                if (numG52 != null) {
                }
                Integer numG62 = mh.s.g((String) this.O0.getValue());
                int iIntValue52 = numG62 != null ? numG62.intValue() : 0;
                int iIntValue62 = ((Number) this.P0.getValue()).intValue();
                int iIntValue72 = ((Number) this.Q0.getValue()).intValue();
                String str202 = (String) this.R0.getValue();
                boolean zBooleanValue162 = ((Boolean) this.S0.getValue()).booleanValue();
                String str212 = (String) this.T0.getValue();
                String string92 = mh.x.W((String) this.U0.getValue()).toString();
                return ProjectEntity.copy$default(projectEntity, 0L, str5, str6, str7, iIntValue, str8, iIntValue2, iIntValue3, numG4, str9, str, strP, strS, str2, str3, str102, str112, zBooleanValue17, zBooleanValue22, zBooleanValue32, zBooleanValue42, zBooleanValue52, strE2, l102, str122, null, zBooleanValue62, zBooleanValue72, str13, false, null, null, null, false, false, false, false, null, 0, null, null, null, zBooleanValue82, str14, str15, str16, str17, str182, zBooleanValue92, str19, zBooleanValue102, zBooleanValue112, zBooleanValue122, zBooleanValue132, zBooleanValue142, zBooleanValue152, iIntValue4, iIntValue52, iIntValue62, iIntValue72, str202, zBooleanValue162, str212, !mh.x.A(string92) ? string92 : null, null, null, 0L, System.currentTimeMillis(), -503316479, 1023, 7, null);
            }
            iconPath = uri6.getPath();
        } else {
            iconPath = projectEntity.getIconPath();
        }
        str2 = iconPath;
        sh.z0 z0Var62 = this.L;
        uri = (Uri) z0Var62.getValue();
        if (kotlin.jvm.internal.r.a(uri == null ? uri.getScheme() : null, "file")) {
        }
        str3 = splashPath;
        String str1022 = (String) this.V0.getValue();
        String str1122 = (String) this.f9585q0.getValue();
        boolean zBooleanValue172 = ((Boolean) this.f9587r0.getValue()).booleanValue();
        boolean zBooleanValue222 = ((Boolean) this.f9589s0.getValue()).booleanValue();
        boolean zBooleanValue322 = ((Boolean) this.f9591t0.getValue()).booleanValue();
        boolean zBooleanValue422 = ((Boolean) this.f9593u0.getValue()).booleanValue();
        boolean zBooleanValue522 = ((Boolean) this.f9595v0.getValue()).booleanValue();
        String strE22 = E(webViewSettingsCopy);
        Long l1022 = (Long) this.f9583p0.getValue();
        String str1222 = (String) this.f9581o0.getValue();
        boolean zBooleanValue622 = ((Boolean) this.f9599x0.getValue()).booleanValue();
        boolean zBooleanValue722 = ((Boolean) this.f9597w0.getValue()).booleanValue();
        String string322 = mh.x.W((String) this.f9601y0.getValue()).toString();
        if (!mh.x.A(string322)) {
        }
        boolean zBooleanValue822 = ((Boolean) this.f9603z0.getValue()).booleanValue();
        String string422 = mh.x.W((String) this.A0.getValue()).toString();
        if (!mh.x.A(string422)) {
        }
        String string522 = mh.x.W((String) this.B0.getValue()).toString();
        if (!mh.x.A(string522)) {
        }
        String string622 = mh.x.W((String) this.C0.getValue()).toString();
        if (!mh.x.A(string622)) {
        }
        String string722 = mh.x.W((String) this.D0.getValue()).toString();
        if (!mh.x.A(string722)) {
        }
        string = mh.x.W((String) this.E0.getValue()).toString();
        if (mh.x.A(string)) {
        }
        if (string == null) {
        }
        String str1822 = string;
        boolean zBooleanValue922 = ((Boolean) this.F0.getValue()).booleanValue();
        String string822 = mh.x.W((String) this.G0.getValue()).toString();
        if (!mh.x.A(string822)) {
        }
        boolean zBooleanValue1022 = ((Boolean) this.H0.getValue()).booleanValue();
        boolean zBooleanValue1122 = ((Boolean) this.I0.getValue()).booleanValue();
        boolean zBooleanValue1222 = ((Boolean) this.J0.getValue()).booleanValue();
        boolean zBooleanValue1322 = ((Boolean) this.K0.getValue()).booleanValue();
        boolean zBooleanValue1422 = ((Boolean) this.L0.getValue()).booleanValue();
        boolean zBooleanValue1522 = ((Boolean) this.M0.getValue()).booleanValue();
        Integer numG522 = mh.s.g((String) this.N0.getValue());
        if (numG522 != null) {
        }
        Integer numG622 = mh.s.g((String) this.O0.getValue());
        int iIntValue522 = numG622 != null ? numG622.intValue() : 0;
        int iIntValue622 = ((Number) this.P0.getValue()).intValue();
        int iIntValue722 = ((Number) this.Q0.getValue()).intValue();
        String str2022 = (String) this.R0.getValue();
        boolean zBooleanValue1622 = ((Boolean) this.S0.getValue()).booleanValue();
        String str2122 = (String) this.T0.getValue();
        String string922 = mh.x.W((String) this.U0.getValue()).toString();
        return ProjectEntity.copy$default(projectEntity, 0L, str5, str6, str7, iIntValue, str8, iIntValue2, iIntValue3, numG4, str9, str, strP, strS, str2, str3, str1022, str1122, zBooleanValue172, zBooleanValue222, zBooleanValue322, zBooleanValue422, zBooleanValue522, strE22, l1022, str1222, null, zBooleanValue622, zBooleanValue722, str13, false, null, null, null, false, false, false, false, null, 0, null, null, null, zBooleanValue822, str14, str15, str16, str17, str1822, zBooleanValue922, str19, zBooleanValue1022, zBooleanValue1122, zBooleanValue1222, zBooleanValue1322, zBooleanValue1422, zBooleanValue1522, iIntValue4, iIntValue522, iIntValue622, iIntValue722, str2022, zBooleanValue1622, str2122, !mh.x.A(string922) ? string922 : null, null, null, 0L, System.currentTimeMillis(), -503316479, 1023, 7, null);
    }

    public final void l() {
        ProjectEntity projectEntity = (ProjectEntity) this.f9566h.getValue();
        if (projectEntity != null && mh.x.A((CharSequence) this.f9586r.getValue()) && mh.x.A((CharSequence) this.f9602z.getValue()) && mh.x.A((CharSequence) this.B.getValue()) && projectEntity.getSourcePath() == null && projectEntity.getIconPath() == null && projectEntity.getSplashPath() == null) {
            ph.l2 l2Var = this.f9577m0;
            if (l2Var != null) {
                l2Var.cancel((CancellationException) null);
            }
            ph.h.c(androidx.lifecycle.x0.a(this), null, null, new g(projectEntity, null), 3);
        }
    }

    public final sh.z0 m() {
        return this.f9565g0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e7, code lost:
    
        if (r1.A(r3, true, r4) == r5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ff, code lost:
    
        if (r1.j(r4) == r5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0125, code lost:
    
        if (r1.A(r3, false, r4) == r5) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(long j10, vg.c cVar) {
        og ogVar;
        fg fgVar;
        fg fgVar2;
        ProjectEntity projectEntity;
        ProjectEntity projectEntity2;
        if (cVar instanceof og) {
            ogVar = (og) cVar;
            int i10 = ogVar.f10203d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                ogVar.f10203d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                ogVar = new og(this, cVar);
            }
        }
        Object byId = ogVar.f10201b;
        ug.a aVar = ug.a.f29706a;
        int i11 = ogVar.f10203d;
        if (i11 == 0) {
            pg.q.b(byId);
            ProjectEntity projectEntity3 = (ProjectEntity) this.f9566h.getValue();
            androidx.lifecycle.l0 l0Var = this.f9560e;
            if (projectEntity3 != null) {
                if (j10 != 0 && projectEntity3.getId() == j10) {
                    return pg.f0.f21461a;
                }
                Long l10 = (Long) l0Var.a("placeholderProjectId");
                if (j10 == 0 && (projectEntity3.getId() == 0 || (l10 != null && projectEntity3.getId() == l10.longValue()))) {
                    return pg.f0.f21461a;
                }
            }
            n8.s sVar = this.f9554b;
            if (j10 == 0) {
                Long l11 = (Long) l0Var.a("placeholderProjectId");
                if (l11 == null || l11.longValue() == 0) {
                    fgVar2 = this;
                    ogVar.f10200a = null;
                    ogVar.f10203d = 3;
                } else {
                    long jLongValue = l11.longValue();
                    ogVar.f10200a = this;
                    ogVar.f10203d = 1;
                    byId = sVar.f18583a.getById(jLongValue, ogVar);
                    if (byId != aVar) {
                        fgVar2 = this;
                        projectEntity = (ProjectEntity) byId;
                        if (projectEntity == null) {
                        }
                        ogVar.f10200a = null;
                        ogVar.f10203d = 3;
                    }
                }
            } else {
                ogVar.f10200a = this;
                ogVar.f10203d = 4;
                byId = sVar.f18583a.getById(j10, ogVar);
                if (byId != aVar) {
                    fgVar = this;
                    projectEntity2 = (ProjectEntity) byId;
                    fgVar.f9566h.setValue(projectEntity2);
                    if (projectEntity2 != null) {
                    }
                }
            }
            return aVar;
        }
        if (i11 == 1) {
            fgVar2 = ogVar.f10200a;
            pg.q.b(byId);
            projectEntity = (ProjectEntity) byId;
            if (projectEntity == null && kotlin.jvm.internal.r.a(projectEntity.getBuildMode(), "advanced")) {
                sh.z0 z0Var = fgVar2.f9566h;
                z0Var.getClass();
                z0Var.j(null, projectEntity);
                ogVar.f10200a = null;
                ogVar.f10203d = 2;
            } else {
                ogVar.f10200a = null;
                ogVar.f10203d = 3;
            }
        } else {
            if (i11 == 2) {
                pg.q.b(byId);
                return pg.f0.f21461a;
            }
            if (i11 == 3) {
                pg.q.b(byId);
                return pg.f0.f21461a;
            }
            if (i11 != 4) {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(byId);
                return pg.f0.f21461a;
            }
            fgVar = ogVar.f10200a;
            pg.q.b(byId);
            projectEntity2 = (ProjectEntity) byId;
            fgVar.f9566h.setValue(projectEntity2);
            if (projectEntity2 != null) {
                fgVar.y();
                return pg.f0.f21461a;
            }
            ogVar.f10200a = null;
            ogVar.f10203d = 5;
        }
    }

    public final void o(File file) {
        ArrayList arrayList = new ArrayList();
        e.a aVar = new e.a(lh.j.i(ah.l.p(file), new dg()));
        while (aVar.hasNext()) {
            File file2 = (File) aVar.next();
            String strH = ah.l.h(ah.l.l(file2, file));
            String name = file2.getName();
            kotlin.jvm.internal.r.b(name);
            ProjectFile.Type type = (mh.t.i(name, ".html", true) || mh.t.i(name, ".htm", true)) ? ProjectFile.Type.HTML : mh.t.i(name, ".css", true) ? ProjectFile.Type.CSS : mh.t.i(name, ".js", true) ? ProjectFile.Type.JS : ProjectFile.Type.ASSET;
            Uri uriFromFile = Uri.fromFile(file2);
            kotlin.jvm.internal.r.d(uriFromFile, "fromFile(...)");
            arrayList.add(new ProjectFile(uriFromFile, name, strH, file2.length(), type, null, 32, null));
        }
        ArrayList arrayList2 = new ArrayList(qg.p.h(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ProjectFile projectFileCopy$default = (ProjectFile) obj;
            if (projectFileCopy$default.isEditable() && projectFileCopy$default.getSizeBytes() <= 2097152) {
                try {
                    String path = projectFileCopy$default.getUri().getPath();
                    if (path == null) {
                        path = "";
                    }
                    projectFileCopy$default = ProjectFile.copy$default(projectFileCopy$default, null, null, null, 0L, null, ah.l.k(new File(path), mh.a.f18238b), 31, null);
                } catch (Exception unused) {
                }
            }
            arrayList2.add(projectFileCopy$default);
        }
        sh.z0 z0Var = this.Z;
        z0Var.getClass();
        z0Var.j(null, arrayList2);
        C();
    }

    public final void t(Uri uri, eh.a<pg.f0> aVar) {
        kotlin.jvm.internal.r.e(uri, "uri");
        ph.l2 l2Var = this.f9571j0;
        if (l2Var != null) {
            l2Var.cancel((CancellationException) null);
        }
        this.f9571j0 = ph.h.c(androidx.lifecycle.x0.a(this), null, null, new h(aVar, uri, null), 3);
    }

    public final void u(Uri uri) {
        kotlin.jvm.internal.r.e(uri, "uri");
        ph.l2 l2Var = this.f9573k0;
        if (l2Var != null) {
            l2Var.cancel((CancellationException) null);
        }
        this.f9573k0 = ph.h.c(androidx.lifecycle.x0.a(this), null, null, new i(uri, null), 3);
    }

    public final void v() throws IOException {
        ProjectEntity projectEntity = (ProjectEntity) this.f9566h.getValue();
        long id2 = projectEntity != null ? projectEntity.getId() : 0L;
        boolean zA = kotlin.jvm.internal.r.a(this.f9600y.getValue(), "paste");
        sh.z0 z0Var = this.C;
        sh.z0 z0Var2 = this.F;
        if (zA) {
            File file = new File(w(id2), "content");
            file.mkdirs();
            File file2 = new File(file, "index.html");
            try {
                ah.l.r(file2, (String) this.B.getValue(), mh.a.f18238b);
                z0Var2.setValue(Uri.fromFile(file2));
                z0Var.setValue(file2.getName());
                ph.h.c(androidx.lifecycle.x0.a(this), null, null, new yg(this, file2, null), 3);
                file2.getAbsolutePath();
                return;
            } catch (Exception e10) {
                BuildLogger buildLogger = BuildLogger.INSTANCE;
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                buildLogger.error(R.string.build_log_html_prepare_error, message);
            }
        }
        Uri uri = (Uri) z0Var2.getValue();
        if (uri == null) {
            return;
        }
        String string = mh.x.W(z(uri)).toString();
        if (mh.x.A(string)) {
            CharSequence charSequence = (CharSequence) z0Var.getValue();
            string = (String) (mh.x.A(charSequence) ? "index.html" : charSequence);
        }
        String str = string;
        String strI = i(uri, id2, "content", str);
        if (strI != null) {
            z0Var2.setValue(Uri.fromFile(new File(strI)));
            z0Var.getClass();
            z0Var.j(null, str);
            ph.h.c(androidx.lifecycle.x0.a(this), null, null, new zg(this, strI, null), 3);
        }
    }

    public final File w(long j10) {
        Application application = this.f9562f;
        return j10 == 0 ? new File(application.getFilesDir(), "projects/draft") : new File(application.getFilesDir(), m0.r.a("projects/", j10));
    }

    public final void y() {
        sh.z0 z0Var = this.f9586r;
        z0Var.getClass();
        z0Var.j(null, "");
        sh.z0 z0Var2 = this.f9588s;
        z0Var2.getClass();
        z0Var2.j(null, "com.htmltoapk.app");
        sh.z0 z0Var3 = this.f9590t;
        z0Var3.getClass();
        z0Var3.j(null, "1");
        sh.z0 z0Var4 = this.f9592u;
        z0Var4.getClass();
        z0Var4.j(null, "1.0");
        sh.z0 z0Var5 = this.f9594v;
        z0Var5.getClass();
        z0Var5.j(null, "24");
        sh.z0 z0Var6 = this.f9596w;
        z0Var6.getClass();
        z0Var6.j(null, "36");
        sh.z0 z0Var7 = this.f9598x;
        z0Var7.getClass();
        z0Var7.j(null, "");
        sh.z0 z0Var8 = this.f9600y;
        z0Var8.getClass();
        z0Var8.j(null, "local");
        sh.z0 z0Var9 = this.f9602z;
        z0Var9.getClass();
        z0Var9.j(null, "");
        sh.z0 z0Var10 = this.B;
        z0Var10.getClass();
        z0Var10.j(null, "");
        sh.z0 z0Var11 = this.C;
        z0Var11.getClass();
        z0Var11.j(null, "");
        this.F.setValue(null);
        this.D.setValue(null);
        sh.z0 z0Var12 = this.E;
        z0Var12.getClass();
        z0Var12.j(null, "");
        sh.z0 z0Var13 = this.Z;
        z0Var13.getClass();
        z0Var13.j(null, qg.z.f22752a);
        this.f9555b0.setValue(null);
        sh.z0 z0Var14 = this.H;
        z0Var14.getClass();
        z0Var14.j(null, "");
        this.I.setValue(null);
        Boolean bool = Boolean.FALSE;
        sh.z0 z0Var15 = this.J;
        z0Var15.getClass();
        z0Var15.j(null, bool);
        sh.z0 z0Var16 = this.K;
        z0Var16.getClass();
        z0Var16.j(null, "");
        this.L.setValue(null);
        sh.z0 z0Var17 = this.M;
        z0Var17.getClass();
        z0Var17.j(null, "#0F1318");
        Boolean bool2 = Boolean.TRUE;
        sh.z0 z0Var18 = this.N;
        z0Var18.getClass();
        z0Var18.j(null, bool2);
        sh.z0 z0Var19 = this.O;
        z0Var19.getClass();
        z0Var19.j(null, "circle");
        Integer numValueOf = Integer.valueOf(CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
        sh.z0 z0Var20 = this.P;
        z0Var20.getClass();
        z0Var20.j(null, numValueOf);
        sh.z0 z0Var21 = this.Q;
        z0Var21.getClass();
        z0Var21.j(null, 16);
        sh.z0 z0Var22 = this.R;
        z0Var22.getClass();
        z0Var22.j(null, 48);
        sh.z0 z0Var23 = this.S;
        z0Var23.getClass();
        z0Var23.j(null, 28);
        sh.z0 z0Var24 = this.T;
        z0Var24.getClass();
        z0Var24.j(null, 2);
        sh.z0 z0Var25 = this.U;
        z0Var25.getClass();
        z0Var25.j(null, 4);
        sh.z0 z0Var26 = this.V;
        z0Var26.getClass();
        z0Var26.j(null, 400);
        sh.z0 z0Var27 = this.W;
        z0Var27.getClass();
        z0Var27.j(null, "#00E5CC");
        sh.z0 z0Var28 = this.X;
        z0Var28.getClass();
        z0Var28.j(null, bool);
        sh.z0 z0Var29 = this.Y;
        z0Var29.getClass();
        z0Var29.j(null, bool);
        List listQ = q("[\"android.permission.INTERNET\",\"android.permission.ACCESS_NETWORK_STATE\",\"android.permission.VIBRATE\"]");
        sh.z0 z0Var30 = this.f9563f0;
        z0Var30.getClass();
        z0Var30.j(null, listQ);
        sh.z0 z0Var31 = this.f9581o0;
        z0Var31.getClass();
        z0Var31.j(null, ProjectKind.APK);
        this.f9583p0.setValue(null);
        sh.z0 z0Var32 = this.f9585q0;
        z0Var32.getClass();
        z0Var32.j(null, "portrait");
        sh.z0 z0Var33 = this.f9587r0;
        z0Var33.getClass();
        z0Var33.j(null, bool2);
        sh.z0 z0Var34 = this.f9589s0;
        z0Var34.getClass();
        z0Var34.j(null, bool);
        sh.z0 z0Var35 = this.f9591t0;
        z0Var35.getClass();
        z0Var35.j(null, bool);
        sh.z0 z0Var36 = this.f9593u0;
        z0Var36.getClass();
        z0Var36.j(null, bool);
        sh.z0 z0Var37 = this.f9595v0;
        z0Var37.getClass();
        z0Var37.j(null, bool);
        sh.z0 z0Var38 = this.f9597w0;
        z0Var38.getClass();
        z0Var38.j(null, bool);
        sh.z0 z0Var39 = this.f9599x0;
        z0Var39.getClass();
        z0Var39.j(null, bool);
        sh.z0 z0Var40 = this.f9601y0;
        z0Var40.getClass();
        z0Var40.j(null, "");
        sh.z0 z0Var41 = this.V0;
        z0Var41.getClass();
        z0Var41.j(null, "#2196F3");
        WebViewSettings webViewSettings = new WebViewSettings(false, false, false, false, false, false, false, false, false, false, 0, 0, (String) null, 0, false, false, false, false, false, false, false, (Boolean) null, false, (String) null, false, (String) null, 0, 0, 0, 0, 0, 0, 0, (String) null, false, false, (String) null, (String) null, "#000000", 0, (String) null, "#000000", 0, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, 0, -1, 4193727, (kotlin.jvm.internal.j) null);
        sh.z0 z0Var42 = this.W0;
        z0Var42.getClass();
        z0Var42.j(null, webViewSettings);
        sh.z0 z0Var43 = this.f9603z0;
        z0Var43.getClass();
        z0Var43.j(null, bool);
        sh.z0 z0Var44 = this.A0;
        z0Var44.getClass();
        z0Var44.j(null, "");
        sh.z0 z0Var45 = this.B0;
        z0Var45.getClass();
        z0Var45.j(null, "");
        sh.z0 z0Var46 = this.C0;
        z0Var46.getClass();
        z0Var46.j(null, "");
        sh.z0 z0Var47 = this.D0;
        z0Var47.getClass();
        z0Var47.j(null, "");
        sh.z0 z0Var48 = this.E0;
        z0Var48.getClass();
        z0Var48.j(null, "bottom");
        sh.z0 z0Var49 = this.F0;
        z0Var49.getClass();
        z0Var49.j(null, bool);
        sh.z0 z0Var50 = this.G0;
        z0Var50.getClass();
        z0Var50.j(null, "");
        sh.z0 z0Var51 = this.H0;
        z0Var51.getClass();
        z0Var51.j(null, bool);
        sh.z0 z0Var52 = this.I0;
        z0Var52.getClass();
        z0Var52.j(null, bool);
        sh.z0 z0Var53 = this.J0;
        z0Var53.getClass();
        z0Var53.j(null, bool2);
        sh.z0 z0Var54 = this.K0;
        z0Var54.getClass();
        z0Var54.j(null, bool);
        sh.z0 z0Var55 = this.L0;
        z0Var55.getClass();
        z0Var55.j(null, bool);
        sh.z0 z0Var56 = this.M0;
        z0Var56.getClass();
        z0Var56.j(null, bool);
        sh.z0 z0Var57 = this.N0;
        z0Var57.getClass();
        z0Var57.j(null, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.L0);
        sh.z0 z0Var58 = this.O0;
        z0Var58.getClass();
        z0Var58.j(null, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.L0);
        sh.z0 z0Var59 = this.P0;
        z0Var59.getClass();
        z0Var59.j(null, -1);
        sh.z0 z0Var60 = this.Q0;
        z0Var60.getClass();
        z0Var60.j(null, -1);
        sh.z0 z0Var61 = this.R0;
        z0Var61.getClass();
        z0Var61.j(null, "");
        sh.z0 z0Var62 = this.S0;
        z0Var62.getClass();
        z0Var62.j(null, bool);
        sh.z0 z0Var63 = this.T0;
        z0Var63.getClass();
        z0Var63.j(null, "DISABLED");
        sh.z0 z0Var64 = this.U0;
        z0Var64.getClass();
        z0Var64.j(null, "");
    }

    public final String z(Uri uri) throws IOException {
        Uri uri2;
        int columnIndex;
        kotlin.jvm.internal.r.e(uri, "uri");
        try {
        } catch (Exception unused) {
            uri2 = uri;
        }
        try {
            if (kotlin.jvm.internal.r.a(uri.getScheme(), "content")) {
                uri2 = uri;
                Cursor cursorQuery = this.f9562f.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        String string = null;
                        if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_display_name")) >= 0) {
                            string = cursorQuery.getString(columnIndex);
                        }
                        cursorQuery.close();
                        if (string != null) {
                            return string;
                        }
                    } finally {
                    }
                }
                String lastPathSegment = uri2.getLastPathSegment();
                if (lastPathSegment != null) {
                    return mh.x.T(lastPathSegment, '/', lastPathSegment);
                }
            } else {
                String lastPathSegment2 = uri.getLastPathSegment();
                if (lastPathSegment2 != null) {
                    return mh.x.T(lastPathSegment2, '/', lastPathSegment2);
                }
                String path = uri.getPath();
                if (path != null) {
                    return mh.x.T(path, '/', path);
                }
            }
            return "";
        } catch (Exception unused2) {
            String lastPathSegment3 = uri2.getLastPathSegment();
            return lastPathSegment3 != null ? mh.x.T(lastPathSegment3, '/', lastPathSegment3) : "";
        }
    }
}
