package e9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.FileProvider;
import androidx.lifecycle.b1;
import com.basitce.htmltoapk.R;
import j5.a;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import pg.p;
import t0.ra;
import x0.h2;
import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class q {
    /* JADX WARN: Removed duplicated region for block: B:125:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final p5.x navController, final long j10, final String str, s0 s0Var, x0.j jVar, final int i10) throws IOException {
        s0 s0Var2;
        int i11;
        final Uri uri;
        Object name;
        s0 s0Var3;
        boolean z10;
        boolean z11;
        String strC;
        String parent;
        boolean zL;
        Object objG;
        x0.k kVar;
        final s0 s0Var4;
        Object objA;
        h2 h2VarV;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(-1039738156);
        int i12 = i10 | (kVarP.l(navController) ? 4 : 2) | (kVarP.j(j10) ? 32 : 16) | (kVarP.K(str) ? 256 : 128) | 1024;
        if ((i12 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            s0Var4 = s0Var;
            kVar = kVarP;
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
                androidx.lifecycle.w0 w0VarB = k5.c.b(s0.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                s0Var2 = (s0) w0VarB;
                i11 = i12 & (-7169);
            } else {
                kVarP.v();
                i11 = i12 & (-7169);
                s0Var2 = s0Var;
            }
            kVarP.U();
            final Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            n1 n1VarB = bg.b.b(s0Var2.f8526m, kVarP);
            Long lValueOf = Long.valueOf(j10);
            kVarP.L(-882545548);
            boolean zL2 = ((i11 & 112) == 32) | kVarP.l(s0Var2);
            Object objG2 = kVarP.g();
            Object obj = j.a.f31715a;
            if (zL2 || objG2 == obj) {
                objG2 = new e(j10, s0Var2, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG2, lValueOf, kVarP);
            boolean zP = mh.t.p(str, "content://", false);
            Uri uri2 = zP ? Uri.parse(str) : null;
            final File file = (zP || mh.x.A(str)) ? null : new File(str);
            kVarP.L(-882516808);
            boolean zK = kVarP.K(uri2);
            Object objG3 = kVarP.g();
            if (zK || objG3 == obj) {
                if (uri2 != null) {
                    if (kotlin.jvm.internal.r.a(uri2.getScheme(), "content")) {
                        Uri uri3 = uri2;
                        Cursor cursorQuery = context.getContentResolver().query(uri3, new String[]{"_display_name"}, null, null, null);
                        uri = uri3;
                        if (cursorQuery != null) {
                            try {
                                name = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name")) : null;
                                cursorQuery.close();
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    ah.c.a(cursorQuery, th2);
                                    throw th3;
                                }
                            }
                        } else {
                            name = null;
                        }
                    } else {
                        uri = uri2;
                        name = uri.getLastPathSegment();
                    }
                    if (name == null) {
                    }
                    kVarP.C(name);
                } else {
                    uri = uri2;
                }
                name = file != null ? file.getName() : null;
                if (name == null) {
                    name = context.getString(R.string.app_name);
                    kotlin.jvm.internal.r.d(name, "getString(...)");
                }
                kVarP.C(name);
            } else {
                name = objG3;
                uri = uri2;
            }
            String str2 = (String) name;
            kVarP.T(false);
            boolean zI = mh.t.i(str2, ".aab", false);
            String str3 = zI ? "application/octet-stream" : "application/vnd.android.package-archive";
            kVarP.L(-882503670);
            Object objG4 = kVarP.g();
            if (objG4 == obj) {
                hh.c.f13027a.getClass();
                objG4 = Boolean.valueOf(hh.c.f13028b.c(100) < 30);
                kVarP.C(objG4);
            }
            boolean zBooleanValue = ((Boolean) objG4).booleanValue();
            kVarP.T(false);
            if (uri != null) {
                s0Var3 = s0Var2;
                kVarP.L(-1587688410);
                try {
                    z10 = zP;
                } catch (Throwable th4) {
                    th = th4;
                    z10 = zP;
                }
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            long statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                            if (statSize > 1048576) {
                                objA = String.format("%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(statSize / 1048576.0d)}, 1));
                            } else if (statSize > 1024) {
                                objA = String.format("%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(statSize / 1024.0d)}, 1));
                            } else {
                                objA = statSize + " B";
                            }
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } finally {
                        }
                    } else {
                        objA = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    objA = pg.q.a(th);
                    if (objA instanceof p.a) {
                    }
                    strC = (String) objA;
                    if (strC == null) {
                    }
                    kVarP.T(false);
                    z11 = true;
                    if (uri == null) {
                        z11 = false;
                    }
                    kVarP.L(-882467623);
                    if (!z10) {
                    }
                    kVarP.T(false);
                    f.g gVar = new f.g();
                    kVarP.L(-882424982);
                    zL = kVarP.l(uri) | kVarP.l(file) | kVarP.l(context);
                    objG = kVarP.g();
                    if (!zL) {
                        objG = new eh.l() { // from class: e9.c
                            @Override // eh.l
                            public final Object invoke(Object obj2) {
                                e.a it = (e.a) obj2;
                                kotlin.jvm.internal.r.e(it, "it");
                                Context context2 = context;
                                Uri uriB = q.b(context2, uri, file);
                                if (uriB == null) {
                                    org.bouncycastle.crypto.engines.a.b(context2, R.string.output_file_not_found, context2, 1);
                                    return pg.f0.f21461a;
                                }
                                if (context2.getPackageManager().canRequestPackageInstalls()) {
                                    q.c(context2, uriB);
                                } else {
                                    org.bouncycastle.crypto.engines.a.b(context2, R.string.install_permission_needed, context2, 1);
                                }
                                return pg.f0.f21461a;
                            }
                        };
                        kVarP.C(objG);
                        kVarP.T(false);
                        s0 s0Var5 = s0Var3;
                        kVar = kVarP;
                        ra.a(null, f1.c.b(-635968112, new g(navController), kVarP), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(1298151269, new p(str2, z11, zBooleanValue, zI, uri, file, context, str3, parent, navController, n1VarB, strC, c.d.a(gVar, (eh.l) objG, kVarP, 0)), kVarP), kVar, 806879280, 189);
                        s0Var4 = s0Var5;
                    }
                    h2VarV = kVar.V();
                    if (h2VarV == null) {
                    }
                }
                if (objA instanceof p.a) {
                    objA = null;
                }
                strC = (String) objA;
                if (strC == null) {
                    strC = f3.q.c(R.string.output_unknown_size, kVarP);
                }
                kVarP.T(false);
                z11 = true;
            } else {
                s0Var3 = s0Var2;
                z10 = zP;
                if (file == null || !file.exists()) {
                    z11 = true;
                    kVarP.L(-882472733);
                    strC = f3.q.c(R.string.output_unknown_size, kVarP);
                    kVarP.T(false);
                } else {
                    kVarP.L(-1587129604);
                    kVarP.T(false);
                    long length = file.length();
                    if (length > 1048576) {
                        z11 = true;
                        strC = String.format("%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(length / 1048576.0d)}, 1));
                    } else {
                        z11 = true;
                        if (length > 1024) {
                            strC = String.format("%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(length / 1024.0d)}, 1));
                        } else {
                            strC = length + " B";
                        }
                    }
                }
            }
            if (uri == null && (file == null || !file.exists())) {
                z11 = false;
            }
            kVarP.L(-882467623);
            if (!z10) {
                parent = f3.q.c(R.string.output_location_downloads, kVarP);
            } else if (file == null || (parent = file.getParent()) == null) {
                parent = "";
            }
            kVarP.T(false);
            f.g gVar2 = new f.g();
            kVarP.L(-882424982);
            zL = kVarP.l(uri) | kVarP.l(file) | kVarP.l(context);
            objG = kVarP.g();
            if (!zL || objG == obj) {
                objG = new eh.l() { // from class: e9.c
                    @Override // eh.l
                    public final Object invoke(Object obj2) {
                        e.a it = (e.a) obj2;
                        kotlin.jvm.internal.r.e(it, "it");
                        Context context2 = context;
                        Uri uriB = q.b(context2, uri, file);
                        if (uriB == null) {
                            org.bouncycastle.crypto.engines.a.b(context2, R.string.output_file_not_found, context2, 1);
                            return pg.f0.f21461a;
                        }
                        if (context2.getPackageManager().canRequestPackageInstalls()) {
                            q.c(context2, uriB);
                        } else {
                            org.bouncycastle.crypto.engines.a.b(context2, R.string.install_permission_needed, context2, 1);
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            s0 s0Var52 = s0Var3;
            kVar = kVarP;
            ra.a(null, f1.c.b(-635968112, new g(navController), kVarP), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(1298151269, new p(str2, z11, zBooleanValue, zI, uri, file, context, str3, parent, navController, n1VarB, strC, c.d.a(gVar2, (eh.l) objG, kVarP, 0)), kVarP), kVar, 806879280, 189);
            s0Var4 = s0Var52;
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
            h2VarV.f31703d = new eh.p(j10, str, s0Var4, i10) { // from class: e9.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f8416b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f8417c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ s0 f8418d;

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) throws IOException {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(1);
                    q.a(this.f8415a, this.f8416b, this.f8417c, this.f8418d, (x0.j) obj2, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final Uri b(Context context, Uri uri, File file) {
        if (uri != null) {
            return uri;
        }
        if (file == null) {
            return null;
        }
        return FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
    }

    public static final void c(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        intent.addFlags(1);
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (Exception e10) {
            Toast.makeText(context, context.getString(R.string.output_error_install, e10.getMessage()), 1).show();
        }
    }

    public static final boolean d(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            if (context.getPackageManager().resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) != null) {
                return true;
            }
        } else if (context.getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }
}
