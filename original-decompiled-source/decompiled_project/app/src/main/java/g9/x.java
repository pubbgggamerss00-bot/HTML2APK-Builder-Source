package g9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.w0;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.ui.crop.CropActivity;
import f9.nb;
import f9.ob;
import j5.a;
import java.io.File;
import ph.i0;
import t0.e2;
import t0.f2;
import t0.m0;
import t0.ra;
import t0.x0;
import x0.h2;
import x0.j;
import x0.l0;
import x0.n1;
import x0.o0;
import x0.r3;
import x0.w2;
import z.g1;

/* loaded from: classes.dex */
public final class x {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(p5.x navController, y yVar, x0.j jVar, final int i10) {
        final y yVar2;
        b bVarValueOf;
        final p5.x xVar;
        x0.k kVar;
        final y yVar3;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(-2117505265);
        if (((i10 | (kVarP.l(navController) ? 4 : 2) | 16) & 19) == 18 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
            xVar = navController;
            yVar3 = yVar;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                kVarP.e(1890788296);
                b1 b1VarA = k5.b.a(kVarP);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA = f5.a.a(b1VarA, kVarP);
                kVarP.e(1729797275);
                w0 w0VarB = k5.c.b(y.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                yVar2 = (y) w0VarB;
            } else {
                kVarP.v();
                yVar2 = yVar;
            }
            kVarP.U();
            final Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                l0 l0Var = o0.f31834a;
                w2 w2Var = new w2(kVarP.x());
                kVarP.C(w2Var);
                objG = w2Var;
            }
            i0 i0Var = (i0) objG;
            n1 n1VarA = h5.b.a(yVar2.f11835i, kVarP);
            n1 n1VarA2 = h5.b.a(yVar2.f11836j, kVarP);
            String str = (String) h5.b.a(yVar2.f11837k, kVarP).getValue();
            kVarP.L(-227872487);
            kVarP.L(508122625);
            boolean zK = kVarP.K(str);
            Object objG2 = kVarP.g();
            if (zK || objG2 == c0321a) {
                try {
                    bVarValueOf = b.valueOf(str);
                } catch (IllegalArgumentException unused) {
                    bVarValueOf = b.f11687a;
                }
                objG2 = bVarValueOf;
                kVarP.C(objG2);
            }
            b bVar = (b) objG2;
            kVarP.T(false);
            kVarP.T(false);
            n1 n1VarA3 = h5.b.a(yVar2.f11838l, kVarP);
            n1 n1VarA4 = h5.b.a(yVar2.f11839m, kVarP);
            n1 n1VarA5 = h5.b.a(yVar2.f11840n, kVarP);
            n1 n1VarA6 = h5.b.a(yVar2.f11841o, kVarP);
            n1 n1VarA7 = h5.b.a(yVar2.f11842p, kVarP);
            n1 n1VarA8 = h5.b.a(yVar2.f11843q, kVarP);
            n1 n1VarA9 = h5.b.a(yVar2.f11844r, kVarP);
            n1 n1VarA10 = h5.b.a(yVar2.f11845s, kVarP);
            n1 n1VarA11 = h5.b.a(yVar2.f11832f, kVarP);
            n1 n1VarA12 = h5.b.a(yVar2.f11846t, kVarP);
            f.c cVar = new f.c();
            kVarP.L(1388245619);
            boolean zL = kVarP.l(yVar2);
            Object objG3 = kVarP.g();
            int i11 = 1;
            if (zL || objG3 == c0321a) {
                objG3 = new nb(yVar2, i11);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            c.k kVarA = c.d.a(cVar, (eh.l) objG3, kVarP, 0);
            f.c cVar2 = new f.c();
            kVarP.L(1388250674);
            boolean zL2 = kVarP.l(yVar2);
            Object objG4 = kVarP.g();
            if (zL2 || objG4 == c0321a) {
                objG4 = new ob(yVar2, 1);
                kVarP.C(objG4);
            }
            kVarP.T(false);
            c.k kVarA2 = c.d.a(cVar2, (eh.l) objG4, kVarP, 0);
            kVarP.L(1388253561);
            Object objG5 = kVarP.g();
            if (objG5 == c0321a) {
                objG5 = bg.b.h(null);
                kVarP.C(objG5);
            }
            final n1 n1Var = (n1) objG5;
            kVarP.T(false);
            f.g gVar = new f.g();
            kVarP.L(1388259071);
            boolean zL3 = kVarP.l(yVar2) | kVarP.l(context);
            Object objG6 = kVarP.g();
            if (zL3 || objG6 == c0321a) {
                objG6 = new eh.l() { // from class: g9.c
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        String message;
                        e.a result = (e.a) obj;
                        kotlin.jvm.internal.r.e(result, "result");
                        Intent intent = result.f8087b;
                        int i12 = result.f8086a;
                        y yVar4 = yVar2;
                        n1 n1Var2 = n1Var;
                        if (i12 == -1) {
                            Uri uri = intent != null ? (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri") : null;
                            if (uri != null) {
                                yVar4.k(uri);
                            }
                            n1Var2.setValue(null);
                        } else if (i12 == 96) {
                            kotlin.jvm.internal.r.b(intent);
                            Throwable th2 = (Throwable) intent.getSerializableExtra("com.yalantis.ucrop.Error");
                            if (th2 == null || (message = th2.getMessage()) == null) {
                                message = "";
                            }
                            Context context2 = context;
                            Toast.makeText(context2, context2.getString(R.string.editor_crop_error, message), 0).show();
                            Uri uri2 = (Uri) n1Var2.getValue();
                            if (uri2 != null) {
                                yVar4.k(uri2);
                                n1Var2.setValue(null);
                            }
                        } else {
                            n1Var2.setValue(null);
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG6);
            }
            kVarP.T(false);
            final c.k kVarA3 = c.d.a(gVar, (eh.l) objG6, kVarP, 0);
            kVarP.L(1388282153);
            boolean zL4 = kVarP.l(context) | kVarP.l(kVarA3) | kVarP.l(yVar2);
            Object objG7 = kVarP.g();
            if (zL4 || objG7 == c0321a) {
                objG7 = new eh.l() { // from class: g9.d
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        Context context2 = context;
                        c.k kVar2 = kVarA3;
                        Uri sourceUri = (Uri) obj;
                        kotlin.jvm.internal.r.e(sourceUri, "sourceUri");
                        n1 n1Var2 = n1Var;
                        n1Var2.setValue(sourceUri);
                        try {
                            Uri uriFromFile = Uri.fromFile(new File(context2.getFilesDir(), "cropped_icon_" + System.currentTimeMillis() + ".png"));
                            int i12 = CropActivity.f5745f;
                            kotlin.jvm.internal.r.b(uriFromFile);
                            hf.a.a(kVar2, context2, CropActivity.a.a(context2, sourceUri, uriFromFile), R.string.launch_no_app);
                        } catch (Exception unused2) {
                            org.bouncycastle.crypto.engines.a.b(context2, R.string.editor_crop_fallback, context2, 0);
                            yVar2.k(sourceUri);
                            n1Var2.setValue(null);
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG7);
            }
            eh.l lVar = (eh.l) objG7;
            kVarP.T(false);
            f.c cVar3 = new f.c();
            kVarP.L(1388305835);
            boolean zK2 = kVarP.K(lVar);
            Object objG8 = kVarP.g();
            if (zK2 || objG8 == c0321a) {
                objG8 = new b9.u(lVar, 2);
                kVarP.C(objG8);
            }
            kVarP.T(false);
            c.k kVarA4 = c.d.a(cVar3, (eh.l) objG8, kVarP, 0);
            xVar = navController;
            kVar = kVarP;
            ra.a(null, f1.c.b(-1713735221, new h(navController), kVarP), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(220384160, new u(yVar2, bVar, kVarA2, context, n1VarA, n1VarA6, n1VarA5, i0Var, lVar, kVarA, n1VarA4, n1VarA3, navController, n1VarA7, n1VarA8, n1VarA2, n1VarA9, kVarA4, n1VarA10, n1VarA12, n1VarA11), kVar), kVar, 806879280, 189);
            yVar3 = yVar2;
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(yVar3, i10) { // from class: g9.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ y f11721b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    x.a(this.f11720a, this.f11721b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final String str, final boolean z10, final w1.d dVar, final eh.a aVar, final androidx.compose.ui.d dVar2, x0.j jVar, final int i10) {
        int i11;
        long j10;
        x0.k kVarP = jVar.p(-596926671);
        if ((i10 & 6) == 0) {
            i11 = i10 | (kVarP.K(str) ? 4 : 2);
        } else {
            i11 = i10;
        }
        int i12 = i11 | (kVarP.c(z10) ? 32 : 16) | (kVarP.K(dVar) ? 256 : 128) | (kVarP.l(aVar) ? 2048 : 1024) | (kVarP.K(dVar2) ? 16384 : 8192);
        if ((i12 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            h0.e eVarA = h0.f.a(12);
            g1 g1Var = m0.f26400a;
            kVarP.L(246374678);
            long jC = z10 ? q1.b1.c(0.2f, ((e2) kVarP.f(f2.f25858a)).f25751a) : q1.b1.f21653g;
            kVarP.T(false);
            if (z10) {
                kVarP.L(246379652);
                j10 = ((e2) kVarP.f(f2.f25858a)).f25751a;
            } else {
                kVarP.L(246380909);
                j10 = ((e2) kVarP.f(f2.f25858a)).f25773s;
            }
            kVarP.T(false);
            int i13 = i12 >> 9;
            x0.d(aVar, dVar2, false, eVarA, m0.f(jC, j10, kVarP, 12), null, f1.c.b(667164244, new w(dVar, str), kVarP), kVarP, (i13 & 14) | 805306368 | (i13 & 112), 484);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: g9.f
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x.b(str, z10, dVar, aVar, dVar2, (x0.j) obj, f3.i.n(i10 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final String c(r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final String d(r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final String e(r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final Uri f(r3 r3Var) {
        return (Uri) r3Var.getValue();
    }

    public static final Uri g(r3 r3Var) {
        return (Uri) r3Var.getValue();
    }
}
