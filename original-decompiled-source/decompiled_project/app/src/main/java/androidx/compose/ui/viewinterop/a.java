package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.t;
import eh.l;
import eh.p;
import g1.i;
import i2.e0;
import i2.g;
import i2.v1;
import i3.h;
import j2.j2;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import pg.f0;
import x0.a2;
import x0.h2;
import x0.j;
import x0.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0019a f1379a = C0019a.f1380a;

    /* renamed from: androidx.compose.ui.viewinterop.a$a, reason: collision with other inner class name */
    public static final class C0019a extends s implements l<View, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0019a f1380a = new C0019a(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ f0 invoke(View view) {
            return f0.f21461a;
        }
    }

    public final class b extends s implements eh.a<e0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1381a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Context, View> f1382b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.s f1383c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f1384d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f1385e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ View f1386f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Context context, l<? super Context, View> lVar, x0.s sVar, i iVar, int i10, View view) {
            super(0);
            this.f1381a = context;
            this.f1382b = lVar;
            this.f1383c = sVar;
            this.f1384d = iVar;
            this.f1385e = i10;
            this.f1386f = view;
        }

        @Override // eh.a
        public final e0 invoke() {
            KeyEvent.Callback callback = this.f1386f;
            r.c(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
            return new i3.l(this.f1381a, this.f1382b, this.f1383c, this.f1384d, this.f1385e, (v1) callback).getLayoutNode();
        }
    }

    public final class c extends s implements p<e0, androidx.compose.ui.d, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1387a = new c(2);

        @Override // eh.p
        public final f0 invoke(e0 e0Var, androidx.compose.ui.d dVar) {
            a.c(e0Var).setModifier(dVar);
            return f0.f21461a;
        }
    }

    public final class d extends s implements p<e0, f3.d, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f1388a = new d(2);

        @Override // eh.p
        public final f0 invoke(e0 e0Var, f3.d dVar) {
            a.c(e0Var).setDensity(dVar);
            return f0.f21461a;
        }
    }

    public final class e extends s implements p<e0, t, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f1389a = new e(2);

        @Override // eh.p
        public final f0 invoke(e0 e0Var, t tVar) {
            a.c(e0Var).setLifecycleOwner(tVar);
            return f0.f21461a;
        }
    }

    public final class f extends s implements p<e0, c6.e, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f1390a = new f(2);

        @Override // eh.p
        public final f0 invoke(e0 e0Var, c6.e eVar) {
            a.c(e0Var).setSavedStateRegistryOwner(eVar);
            return f0.f21461a;
        }
    }

    public final class g extends s implements p<e0, f3.r, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f1391a = new g(2);

        @Override // eh.p
        public final f0 invoke(e0 e0Var, f3.r rVar) {
            int i10;
            i3.l lVarC = a.c(e0Var);
            int iOrdinal = rVar.ordinal();
            if (iOrdinal != 0) {
                i10 = 1;
                if (iOrdinal != 1) {
                    throw new pg.l();
                }
            } else {
                i10 = 0;
            }
            lVarC.setLayoutDirection(i10);
            return f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(l lVar, androidx.compose.ui.d dVar, l lVar2, l lVar3, j jVar, int i10, int i11) {
        int i12;
        l lVar4;
        l lVar5;
        h2 h2VarV;
        t tVar;
        f3.d dVar2;
        c6.e eVar;
        a2 a2Var;
        f3.r rVar;
        l lVar6 = lVar2;
        k kVarP = jVar.p(-180024211);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.l(lVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= kVarP.K(dVar) ? 32 : 16;
        }
        int i13 = i12 | 384;
        if ((i10 & 3072) == 0) {
            i13 |= kVarP.l(lVar6) ? 2048 : 1024;
        }
        int i14 = i11 & 16;
        if (i14 == 0) {
            if ((i10 & 24576) == 0) {
                lVar4 = lVar3;
                i13 |= kVarP.l(lVar4) ? 16384 : 8192;
            }
            if (kVarP.A(i13 & 1, (i13 & 9363) == 9362)) {
                kVarP.v();
                lVar5 = lVar4;
            } else {
                l lVar7 = i14 != 0 ? f1379a : lVar4;
                int i15 = kVarP.P;
                androidx.compose.ui.d dVarH = dVar.h(FocusGroupPropertiesElement.f1377b);
                FocusTargetNode.FocusTargetElement focusTargetElement = FocusTargetNode.FocusTargetElement.f1183b;
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH.h(focusTargetElement).h(FocusTargetPropertiesElement.f1378b).h(focusTargetElement), kVarP);
                f3.d dVar3 = (f3.d) kVarP.f(j2.f14779h);
                f3.r rVar2 = (f3.r) kVarP.f(j2.f14785n);
                a2 a2VarP = kVarP.P();
                t tVar2 = (t) kVarP.f(h5.k.f12264a);
                c6.e eVar2 = (c6.e) kVarP.f(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                kVarP.L(608635513);
                int i16 = i13 & 14;
                int iD = kVarP.D();
                Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
                k.b bVarE = kVarP.E();
                i iVar = (i) kVarP.f(g1.k.f11305a);
                View view = (View) kVarP.f(AndroidCompositionLocals_androidKt.f1285f);
                boolean zL = kVarP.l(context) | ((((i16 & 14) ^ 6) > 4 && kVarP.K(lVar)) || (i16 & 6) == 4) | kVarP.l(bVarE) | kVarP.l(iVar) | kVarP.i(iD) | kVarP.l(view);
                Object objG = kVarP.g();
                if (zL || objG == j.a.f31715a) {
                    tVar = tVar2;
                    dVar2 = dVar3;
                    eVar = eVar2;
                    a2Var = a2VarP;
                    rVar = rVar2;
                    b bVar = new b(context, lVar, bVarE, iVar, iD, view);
                    kVarP.C(bVar);
                    objG = bVar;
                } else {
                    tVar = tVar2;
                    rVar = rVar2;
                    dVar2 = dVar3;
                    eVar = eVar2;
                    a2Var = a2VarP;
                }
                eh.a aVar = (eh.a) objG;
                kVarP.q0(null, 125, 1, null);
                kVarP.f31744q = true;
                if (kVarP.O) {
                    kVarP.w(aVar);
                } else {
                    kVarP.z();
                }
                i2.g.f13861o.getClass();
                ph.v1.j(g.a.f13866e, a2Var, kVarP);
                ph.v1.j(c.f1387a, dVarC, kVarP);
                ph.v1.j(d.f1388a, dVar2, kVarP);
                ph.v1.j(e.f1389a, tVar, kVarP);
                ph.v1.j(f.f1390a, eVar, kVarP);
                ph.v1.j(g.f1391a, rVar, kVarP);
                g.a.C0128a c0128a = g.a.f13868g;
                if (kVarP.m() || !r.a(kVarP.g(), Integer.valueOf(i15))) {
                    l9.i.a(i15, kVarP, i15, c0128a);
                }
                ph.v1.j(i3.f.f14143a, lVar7, kVarP);
                lVar6 = lVar2;
                ph.v1.j(i3.g.f14144a, lVar6, kVarP);
                kVarP.T(true);
                kVarP.T(false);
                lVar5 = lVar7;
            }
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new h(lVar, dVar, lVar6, lVar5, i10, i11);
                return;
            }
            return;
        }
        i13 |= 24576;
        lVar4 = lVar3;
        if (kVarP.A(i13 & 1, (i13 & 9363) == 9362)) {
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    public static final void b(l lVar, androidx.compose.ui.d dVar, l lVar2, j jVar, int i10) {
        l lVar3;
        androidx.compose.ui.d dVar2;
        k kVarP = jVar.p(-1783766393);
        int i11 = (kVarP.l(lVar) ? 4 : 2) | i10 | 384;
        if (kVarP.A(i11 & 1, (i11 & 147) != 146)) {
            C0019a c0019a = f1379a;
            lVar3 = lVar;
            dVar2 = dVar;
            a(lVar3, dVar2, c0019a, c0019a, kVarP, (i11 & 14) | 27696, 4);
            lVar2 = c0019a;
        } else {
            lVar3 = lVar;
            dVar2 = dVar;
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new i3.e(lVar3, dVar2, lVar2, i10);
        }
    }

    public static final i3.l c(e0 e0Var) {
        i3.l lVar = e0Var.f13823q;
        if (lVar != null) {
            return lVar;
        }
        throw k1.a.a("Required value was null.");
    }
}
