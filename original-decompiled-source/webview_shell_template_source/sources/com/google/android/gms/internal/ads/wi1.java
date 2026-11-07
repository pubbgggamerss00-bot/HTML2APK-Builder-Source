package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wi1 {

    /* renamed from: a, reason: collision with root package name */
    public final File f10199a;

    /* renamed from: b, reason: collision with root package name */
    public final File f10200b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f10201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10202d;

    public wi1(Context context, int i6) {
        this.f10201c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        xi1.a(dir, false);
        this.f10199a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        xi1.a(dir2, true);
        this.f10200b = dir2;
        this.f10202d = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r10 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(nh nhVar, f0 f0Var) {
        boolean z6;
        boolean zG;
        String strJ = nhVar.C().J();
        byte[] bArrC = nhVar.E().c();
        byte[] bArrC2 = nhVar.D().c();
        if (!TextUtils.isEmpty(strJ) && bArrC2 != null && bArrC2.length != 0) {
            File file = this.f10200b;
            xi1.d(file);
            file.mkdirs();
            xi1.c(file, strJ).mkdirs();
            File fileB = xi1.b(strJ, file, "pcam.jar");
            if ((bArrC == null || bArrC.length <= 0 || xi1.e(fileB, bArrC)) && xi1.e(xi1.b(strJ, file, "pcbc"), bArrC2)) {
                File fileB2 = xi1.b(nhVar.C().J(), file, "pcam.jar");
                if (fileB2.exists() && f0Var != null) {
                    try {
                        zG = bq.g(fileB2);
                    } catch (GeneralSecurityException unused) {
                        zG = false;
                    }
                }
                String strJ2 = nhVar.C().J();
                if (TextUtils.isEmpty(strJ2)) {
                    z6 = false;
                } else {
                    File fileB3 = xi1.b(strJ2, file, "pcam.jar");
                    File fileB4 = xi1.b(strJ2, file, "pcbc");
                    File fileB5 = xi1.b(strJ2, c(), "pcam.jar");
                    File fileB6 = xi1.b(strJ2, c(), "pcbc");
                    if ((!fileB3.exists() || fileB3.renameTo(fileB5)) && fileB4.exists() && fileB4.renameTo(fileB6)) {
                        oh ohVarE = ph.E();
                        String strJ3 = nhVar.C().J();
                        ohVarE.i();
                        ph.O((ph) ohVarE.f4126t, strJ3);
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
                        ph phVar = (ph) ohVarE.g();
                        ph phVarB = b(1);
                        SharedPreferences.Editor editorEdit = this.f10201c.edit();
                        int i6 = this.f10202d;
                        if (phVarB != null && !phVar.J().equals(phVarB.J())) {
                            StringBuilder sb = new StringBuilder("FBAMTD");
                            sb.append(i6 - 1);
                            editorEdit.putString(sb.toString(), i3.e.a(phVarB.i()));
                        }
                        StringBuilder sb2 = new StringBuilder("LATMTD");
                        sb2.append(i6 - 1);
                        editorEdit.putString(sb2.toString(), i3.e.a(phVar.i()));
                        if (editorEdit.commit()) {
                            z6 = true;
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                ph phVarB2 = b(1);
                if (phVarB2 != null) {
                    hashSet.add(phVarB2.J());
                }
                ph phVarB3 = b(2);
                if (phVarB3 != null) {
                    hashSet.add(phVarB3.J());
                }
                for (File file2 : c().listFiles()) {
                    String name = file2.getName();
                    if (!hashSet.contains(name)) {
                        xi1.d(xi1.c(c(), name));
                    }
                }
                return z6;
            }
        }
        return false;
    }

    public final ph b(int i6) {
        String string;
        int i7 = this.f10202d;
        SharedPreferences sharedPreferences = this.f10201c;
        if (i6 == 1) {
            StringBuilder sb = new StringBuilder("LATMTD");
            sb.append(i7 - 1);
            string = sharedPreferences.getString(sb.toString(), null);
        } else {
            StringBuilder sb2 = new StringBuilder("FBAMTD");
            sb2.append(i7 - 1);
            string = sharedPreferences.getString(sb2.toString(), null);
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrB = i3.e.b(string);
                ph phVarG = ph.G(g42.s(0, bArrB.length, bArrB));
                String strJ = phVarG.J();
                File fileB = xi1.b(strJ, c(), "pcam.jar");
                if (!fileB.exists()) {
                    fileB = xi1.b(strJ, c(), "pcam");
                }
                File fileB2 = xi1.b(strJ, c(), "pcbc");
                if (fileB.exists()) {
                    if (fileB2.exists()) {
                        return phVarG;
                    }
                }
            } catch (u52 unused) {
            }
        }
        return null;
    }

    public final File c() {
        File file = new File(this.f10199a, Integer.toString(this.f10202d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
