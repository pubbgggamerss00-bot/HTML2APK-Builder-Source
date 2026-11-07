package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kk {

    /* renamed from: a, reason: collision with root package name */
    public final mk f6439a;

    /* renamed from: b, reason: collision with root package name */
    public final cn f6440b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6441c;

    public kk() {
        this.f6440b = dn.M();
        this.f6441c = false;
        this.f6439a = new mk();
    }

    public final synchronized void a(jk jkVar) {
        if (this.f6441c) {
            try {
                jkVar.c(this.f6440b);
            } catch (NullPointerException e6) {
                zzv.zzp().h("AdMobClearcutLogger.modify", e6);
            }
        }
    }

    public final synchronized void b(int i6) {
        if (this.f6441c) {
            if (((Boolean) zzbe.zzc().a(zn.X4)).booleanValue()) {
                d(i6);
            } else {
                e(i6);
            }
        }
    }

    public final synchronized String c(int i6) {
        StringBuilder sb;
        String strJ = ((dn) this.f6440b.f4126t).J();
        long jB = zzv.zzC().b();
        String strEncodeToString = Base64.encodeToString(this.f6440b.g().i(), 3);
        sb = new StringBuilder("id=");
        sb.append(strJ);
        sb.append(",timestamp=");
        sb.append(jB);
        sb.append(",event=");
        sb.append(i6 - 1);
        sb.append(",data=");
        sb.append(strEncodeToString);
        sb.append("\n");
        return sb.toString();
    }

    public final synchronized void d(int i6) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        int i7 = pj1.f8098a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                try {
                    fileOutputStream.write(c(i6).getBytes());
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                zze.zza("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            zze.zza("Could not find file for Clearcut");
        }
    }

    public final synchronized void e(int i6) {
        cn cnVar = this.f6440b;
        cnVar.i();
        dn.C((dn) cnVar.f4126t);
        List listZzd = zzs.zzd();
        cnVar.i();
        dn.B((dn) cnVar.f4126t, listZzd);
        byte[] bArrI = this.f6440b.g().i();
        mk mkVar = this.f6439a;
        lk lkVar = new lk(mkVar, bArrI);
        int i7 = i6 - 1;
        lkVar.f6783b = i7;
        synchronized (lkVar) {
            mkVar.f7172c.execute(new b(3, lkVar));
        }
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i7, 10))));
    }

    public kk(mk mkVar) {
        this.f6440b = dn.M();
        this.f6439a = mkVar;
        this.f6441c = ((Boolean) zzbe.zzc().a(zn.W4)).booleanValue();
    }
}
