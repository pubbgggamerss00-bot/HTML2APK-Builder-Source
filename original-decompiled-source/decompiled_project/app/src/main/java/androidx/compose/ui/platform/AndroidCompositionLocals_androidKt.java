package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.t;
import c6.c;
import com.basitce.htmltoapk.R;
import eh.l;
import eh.p;
import j2.j1;
import j2.j2;
import j2.k2;
import j2.n2;
import j2.o3;
import j2.p2;
import j2.q2;
import j2.r0;
import j2.t0;
import j2.u0;
import j2.w0;
import j2.x0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import pg.f0;
import x0.e2;
import x0.f2;
import x0.h2;
import x0.j;
import x0.k;
import x0.k0;
import x0.l0;
import x0.m0;
import x0.n1;
import x0.o0;
import x0.s3;
import x0.y;

/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f1280a = new m0(a.f1286a);

    /* renamed from: b, reason: collision with root package name */
    public static final s3 f1281b = new s3(b.f1287a);

    /* renamed from: c, reason: collision with root package name */
    public static final s3 f1282c = new s3(c.f1288a);

    /* renamed from: d, reason: collision with root package name */
    public static final s3 f1283d = new s3(d.f1289a);

    /* renamed from: e, reason: collision with root package name */
    public static final s3 f1284e = new s3(e.f1290a);

    /* renamed from: f, reason: collision with root package name */
    public static final s3 f1285f = new s3(f.f1291a);

    public static final class a extends s implements eh.a<Configuration> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1286a = new a(0);

        @Override // eh.a
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.b("LocalConfiguration");
            throw null;
        }
    }

    public static final class b extends s implements eh.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1287a = new b(0);

        @Override // eh.a
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.b("LocalContext");
            throw null;
        }
    }

    public static final class c extends s implements eh.a<o2.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1288a = new c(0);

        @Override // eh.a
        public final o2.b invoke() {
            AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
            throw null;
        }
    }

    public static final class d extends s implements eh.a<o2.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f1289a = new d(0);

        @Override // eh.a
        public final o2.d invoke() {
            AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
            throw null;
        }
    }

    public static final class e extends s implements eh.a<c6.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f1290a = new e(0);

        @Override // eh.a
        public final c6.e invoke() {
            AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
            throw null;
        }
    }

    public static final class f extends s implements eh.a<View> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f1291a = new f(0);

        @Override // eh.a
        public final View invoke() {
            AndroidCompositionLocals_androidKt.b("LocalView");
            throw null;
        }
    }

    public static final class g extends s implements l<Configuration, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n1<Configuration> f1292a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(n1<Configuration> n1Var) {
            super(1);
            this.f1292a = n1Var;
        }

        @Override // eh.l
        public final f0 invoke(Configuration configuration) {
            Configuration configuration2 = new Configuration(configuration);
            m0 m0Var = AndroidCompositionLocals_androidKt.f1280a;
            this.f1292a.setValue(configuration2);
            return f0.f21461a;
        }
    }

    public static final class h extends s implements l<l0, k0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n2 f1293a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(n2 n2Var) {
            super(1);
            this.f1293a = n2Var;
        }

        @Override // eh.l
        public final k0 invoke(l0 l0Var) {
            return new r0(this.f1293a);
        }
    }

    public static final class i extends s implements p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f1294a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j1 f1295b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<x0.j, Integer, f0> f1296c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(AndroidComposeView androidComposeView, j1 j1Var, p<? super x0.j, ? super Integer, f0> pVar) {
            super(2);
            this.f1294a = androidComposeView;
            this.f1295b = j1Var;
            this.f1296c = pVar;
        }

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                j2.a(this.f1294a, this.f1295b, this.f1296c, jVar2, 0);
            } else {
                jVar2.v();
            }
            return f0.f21461a;
        }
    }

    public static final class j extends s implements p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f1297a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<x0.j, Integer, f0> f1298b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(AndroidComposeView androidComposeView, p<? super x0.j, ? super Integer, f0> pVar, int i10) {
            super(2);
            this.f1297a = androidComposeView;
            this.f1298b = pVar;
        }

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(1);
            AndroidCompositionLocals_androidKt.a(this.f1297a, this.f1298b, jVar, iN);
            return f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AndroidComposeView androidComposeView, p<? super x0.j, ? super Integer, f0> pVar, x0.j jVar, int i10) {
        n1 n1Var;
        LinkedHashMap linkedHashMap;
        boolean z10;
        k kVarP = jVar.p(1396852028);
        int i11 = (kVarP.l(androidComposeView) ? 4 : 2) | i10 | (kVarP.l(pVar) ? 32 : 16);
        if (kVarP.A(i11 & 1, (i11 & 19) != 18)) {
            Context context = androidComposeView.getContext();
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(new Configuration(context.getResources().getConfiguration()));
                kVarP.C(objG);
            }
            n1 n1Var2 = (n1) objG;
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new g(n1Var2);
                kVarP.C(objG2);
            }
            androidComposeView.setConfigurationChangeObserver((l) objG2);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a) {
                objG3 = new j1(context);
                kVarP.C(objG3);
            }
            j1 j1Var = (j1) objG3;
            AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            c6.e eVar = viewTreeOwners.f1263b;
            Object objG4 = kVarP.g();
            if (objG4 == c0321a) {
                Object parent = androidComposeView.getParent();
                r.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = g1.i.class.getSimpleName() + ':' + strValueOf;
                c6.c savedStateRegistry = eVar.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        r.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str2, parcelableArrayList);
                        n1Var2 = n1Var2;
                    }
                } else {
                    linkedHashMap = null;
                }
                n1Var = n1Var2;
                s3 s3Var = g1.k.f11305a;
                final g1.j jVar2 = new g1.j(linkedHashMap, q2.f14866a);
                try {
                    savedStateRegistry.c(str, new c.b() { // from class: j2.o2
                        @Override // c6.c.b
                        public final Bundle a() {
                            Map<String, List<Object>> mapB = jVar2.b();
                            Bundle bundle = new Bundle();
                            for (Map.Entry<String, List<Object>> entry : mapB.entrySet()) {
                                String key = entry.getKey();
                                List<Object> value = entry.getValue();
                                bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
                            }
                            return bundle;
                        }
                    });
                    z10 = true;
                } catch (IllegalArgumentException unused) {
                    z10 = false;
                }
                n2 n2Var = new n2(jVar2, new p2(z10, savedStateRegistry, str));
                kVarP.C(n2Var);
                objG4 = n2Var;
            } else {
                n1Var = n1Var2;
            }
            n2 n2Var2 = (n2) objG4;
            f0 f0Var = f0.f21461a;
            boolean zL = kVarP.l(n2Var2);
            Object objG5 = kVarP.g();
            if (zL || objG5 == c0321a) {
                objG5 = new h(n2Var2);
                kVarP.C(objG5);
            }
            o0.a(f0Var, (l) objG5, kVarP);
            Object objG6 = kVarP.g();
            if (objG6 == c0321a) {
                objG6 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new o3() : new k2(androidComposeView.getView());
                kVarP.C(objG6);
            }
            y1.a aVar = (y1.a) objG6;
            Configuration configuration = (Configuration) n1Var.getValue();
            Object objG7 = kVarP.g();
            if (objG7 == c0321a) {
                objG7 = new o2.b();
                kVarP.C(objG7);
            }
            o2.b bVar = (o2.b) objG7;
            Object objG8 = kVarP.g();
            Object obj = objG8;
            if (objG8 == c0321a) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                kVarP.C(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object objG9 = kVarP.g();
            if (objG9 == c0321a) {
                objG9 = new u0(configuration3, bVar);
                kVarP.C(objG9);
            }
            u0 u0Var = (u0) objG9;
            boolean zL2 = kVarP.l(context);
            Object objG10 = kVarP.g();
            if (zL2 || objG10 == c0321a) {
                objG10 = new t0(context, u0Var);
                kVarP.C(objG10);
            }
            o0.a(bVar, (l) objG10, kVarP);
            Object objG11 = kVarP.g();
            if (objG11 == c0321a) {
                objG11 = new o2.d();
                kVarP.C(objG11);
            }
            o2.d dVar = (o2.d) objG11;
            Object objG12 = kVarP.g();
            if (objG12 == c0321a) {
                objG12 = new x0(dVar);
                kVarP.C(objG12);
            }
            x0 x0Var = (x0) objG12;
            boolean zL3 = kVarP.l(context);
            Object objG13 = kVarP.g();
            if (zL3 || objG13 == c0321a) {
                objG13 = new w0(context, x0Var);
                kVarP.C(objG13);
            }
            o0.a(dVar, (l) objG13, kVarP);
            m0 m0Var = j2.f14793v;
            y.b(new f2[]{f1280a.a((Configuration) n1Var.getValue()), f1281b.a(context), h5.k.f12264a.a(viewTreeOwners.f1262a), f1284e.a(eVar), g1.k.f11305a.a(n2Var2), f1285f.a(androidComposeView.getView()), f1282c.a(bVar), f1283d.a(dVar), m0Var.a(Boolean.valueOf(((Boolean) kVarP.f(m0Var)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), j2.f14783l.a(aVar)}, f1.c.b(1471621628, new i(androidComposeView, j1Var, pVar), kVarP), kVarP, 56);
        } else {
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new j(androidComposeView, pVar, i10);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final e2<t> getLocalLifecycleOwner() {
        return h5.k.f12264a;
    }

    public static final e2<c6.e> getLocalSavedStateRegistryOwner() {
        return f1284e;
    }
}
