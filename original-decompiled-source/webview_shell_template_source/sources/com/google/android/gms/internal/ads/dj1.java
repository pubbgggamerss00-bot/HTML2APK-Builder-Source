package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dj1 {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f3955f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3956a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f3957b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3958c;

    /* renamed from: d, reason: collision with root package name */
    public final mi1 f3959d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3960e;

    public dj1(Context context, int i6, mi1 mi1Var, boolean z6) {
        this.f3960e = false;
        this.f3956a = context;
        this.f3958c = Integer.toString(i6 - 1);
        this.f3957b = context.getSharedPreferences("pcvmspf", 0);
        this.f3959d = mi1Var;
        this.f3960e = z6;
    }

    public static String d(nh nhVar) {
        oh ohVarE = ph.E();
        String strJ = nhVar.C().J();
        ohVarE.i();
        ph.O((ph) ohVarE.f4126t, strJ);
        String strI = nhVar.C().I();
        ohVarE.i();
        ph.K((ph) ohVarE.f4126t, strI);
        long jB = nhVar.C().B();
        ohVarE.i();
        ph.L((ph) ohVarE.f4126t, jB);
        long jD = nhVar.C().D();
        ohVarE.i();
        ph.N((ph) ohVarE.f4126t, jD);
        long jC = nhVar.C().C();
        ohVarE.i();
        ph.M((ph) ohVarE.f4126t, jC);
        return i3.e.a(((ph) ohVarE.g()).i());
    }

    public final boolean a(nh nhVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f3955f) {
            try {
                if (!xi1.e(new File(c(nhVar.C().J()), "pcbc"), nhVar.D().c())) {
                    e(4020, jCurrentTimeMillis);
                    return false;
                }
                String strD = d(nhVar);
                SharedPreferences.Editor editorEdit = this.f3957b.edit();
                editorEdit.putString("LATMTD".concat(String.valueOf(this.f3958c)), strD);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    e(5015, jCurrentTimeMillis);
                } else {
                    e(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002e, B:16:0x003e, B:19:0x0049, B:22:0x0054, B:31:0x0096, B:33:0x00b6, B:34:0x00bb, B:36:0x00bd, B:38:0x00cb, B:39:0x00d0, B:42:0x00d4, B:47:0x00de, B:48:0x00e4, B:50:0x00e6, B:52:0x0118, B:53:0x0127, B:55:0x012d, B:56:0x0132, B:58:0x0134, B:60:0x013f, B:61:0x0146, B:63:0x014d, B:64:0x0154, B:66:0x016a, B:68:0x0176, B:69:0x0179, B:70:0x017c, B:71:0x0181, B:23:0x0073, B:25:0x0079, B:28:0x0084, B:29:0x0094), top: B:75:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(nh nhVar, f0 f0Var) {
        boolean zG;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f3955f) {
            try {
                ph phVarF = f(1);
                String strJ = nhVar.C().J();
                if (phVarF != null && phVarF.J().equals(strJ)) {
                    e(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileC = c(strJ);
                if (fileC.exists()) {
                    this.f3959d.f(4023, "d:" + (true != fileC.isDirectory() ? "0" : "1") + ",f:" + (true != fileC.isFile() ? "0" : "1"), jCurrentTimeMillis2);
                    e(4015, jCurrentTimeMillis2);
                } else if (!fileC.mkdirs()) {
                    this.f3959d.f(4024, "cw:".concat(true != fileC.canWrite() ? "0" : "1"), jCurrentTimeMillis2);
                    e(4015, jCurrentTimeMillis2);
                    return false;
                }
                File fileC2 = c(strJ);
                File file = new File(fileC2, "pcam.jar");
                File file2 = new File(fileC2, "pcbc");
                if (!xi1.e(file, nhVar.E().c())) {
                    e(4016, jCurrentTimeMillis);
                    return false;
                }
                if (!xi1.e(file2, nhVar.D().c())) {
                    e(4017, jCurrentTimeMillis);
                    return false;
                }
                if (f0Var != null) {
                    try {
                        zG = bq.g(file);
                    } catch (GeneralSecurityException unused) {
                        zG = false;
                    }
                    if (zG) {
                        String strD = d(nhVar);
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        String string = this.f3957b.getString("LATMTD".concat(String.valueOf(this.f3958c)), null);
                        SharedPreferences.Editor editorEdit = this.f3957b.edit();
                        editorEdit.putString("LATMTD".concat(String.valueOf(this.f3958c)), strD);
                        if (string != null) {
                            editorEdit.putString("FBAMTD".concat(String.valueOf(this.f3958c)), string);
                        }
                        if (editorEdit.commit()) {
                            HashSet hashSet = new HashSet();
                            ph phVarF2 = f(1);
                            if (phVarF2 != null) {
                                hashSet.add(phVarF2.J());
                            }
                            ph phVarF3 = f(2);
                            if (phVarF3 != null) {
                                hashSet.add(phVarF3.J());
                            }
                            for (File file3 : new File(this.f3956a.getDir("pccache", 0), this.f3958c).listFiles()) {
                                if (!hashSet.contains(file3.getName())) {
                                    xi1.d(file3);
                                }
                            }
                            e(5014, jCurrentTimeMillis);
                            return true;
                        }
                        e(4019, jCurrentTimeMillis3);
                    } else {
                        e(4018, jCurrentTimeMillis);
                        xi1.d(fileC2);
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public final File c(String str) {
        return new File(new File(this.f3956a.getDir("pccache", 0), this.f3958c), str);
    }

    public final void e(int i6, long j6) {
        this.f3959d.c(i6, j6);
    }

    public final ph f(int i6) {
        u42 u42VarB;
        String str = this.f3958c;
        SharedPreferences sharedPreferences = this.f3957b;
        String string = i6 == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                byte[] bArrB = i3.e.b(string);
                e42 e42VarS = g42.s(0, bArrB.length, bArrB);
                if (this.f3960e) {
                    u42 u42Var = u42.f9458b;
                    u62 u62Var = u62.f9474c;
                    u42VarB = u42.f9459c;
                } else {
                    u42VarB = u42.b();
                }
                return ph.H(e42VarS, u42VarB);
            } catch (u52 unused) {
            } catch (NullPointerException unused2) {
                e(2029, jCurrentTimeMillis);
            } catch (RuntimeException unused3) {
                e(2032, jCurrentTimeMillis);
            }
        }
        return null;
    }
}
