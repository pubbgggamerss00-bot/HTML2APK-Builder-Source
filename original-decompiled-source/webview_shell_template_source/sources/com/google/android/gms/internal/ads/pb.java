package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class pb implements Comparable {
    private final zb zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final tb zzf;
    private Integer zzg;
    private sb zzh;
    private boolean zzi;
    private za zzj;
    private ob zzk;
    private final fb zzl;

    public pb(int i6, String str, tb tbVar) {
        Uri uri;
        String host;
        this.zza = zb.f11246c ? new zb() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i6;
        this.zzc = str;
        this.zzf = tbVar;
        fb fbVar = new fb();
        fbVar.f4580a = 2500;
        this.zzl = fbVar;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((pb) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(strValueOf) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.f4580a;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final za zzd() {
        return this.zzj;
    }

    public final pb zze(za zaVar) {
        this.zzj = zaVar;
        return this;
    }

    public final pb zzf(sb sbVar) {
        this.zzh = sbVar;
        return this;
    }

    public final pb zzg(int i6) {
        this.zzg = Integer.valueOf(i6);
        return this;
    }

    public abstract ub zzh(lb lbVar);

    public final String zzj() {
        int i6 = this.zzb;
        String str = this.zzc;
        return i6 != 0 ? androidx.activity.m.d(Integer.toString(1), "-", str) : str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() {
        return Collections.EMPTY_MAP;
    }

    public final void zzm(String str) {
        if (zb.f11246c) {
            this.zza.a(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(xb xbVar) {
        tb tbVar;
        synchronized (this.zze) {
            tbVar = this.zzf;
        }
        tbVar.a(xbVar);
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        sb sbVar = this.zzh;
        if (sbVar != null) {
            synchronized (sbVar.f8875b) {
                sbVar.f8875b.remove(this);
            }
            synchronized (sbVar.f8881i) {
                try {
                    ArrayList arrayList = sbVar.f8881i;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        ((rb) obj).zza();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            sbVar.b();
        }
        if (zb.f11246c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new nb(this, str, id));
            } else {
                this.zza.a(str, id);
                this.zza.b(toString());
            }
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final void zzr() {
        ob obVar;
        synchronized (this.zze) {
            obVar = this.zzk;
        }
        if (obVar != null) {
            ((androidx.fragment.app.f0) obVar).l(this);
        }
    }

    public final void zzs(ub ubVar) {
        ob obVar;
        List list;
        synchronized (this.zze) {
            obVar = this.zzk;
        }
        if (obVar != null) {
            androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) obVar;
            za zaVar = ubVar.f9519b;
            if (zaVar != null) {
                if (zaVar.f11237e >= System.currentTimeMillis()) {
                    String strZzj = zzj();
                    synchronized (f0Var) {
                        list = (List) ((HashMap) f0Var.s).remove(strZzj);
                    }
                    if (list != null) {
                        if (ac.f2645a) {
                            ac.c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((xj1) f0Var.f1104v).k((pb) it.next(), ubVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            f0Var.l(this);
        }
    }

    public final void zzt(int i6) {
        sb sbVar = this.zzh;
        if (sbVar != null) {
            sbVar.b();
        }
    }

    public final void zzu(ob obVar) {
        synchronized (this.zze) {
            this.zzk = obVar;
        }
    }

    public final boolean zzv() {
        boolean z6;
        synchronized (this.zze) {
            z6 = this.zzi;
        }
        return z6;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() {
        return null;
    }

    public final fb zzy() {
        return this.zzl;
    }
}
