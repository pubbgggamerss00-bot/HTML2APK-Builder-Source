package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.internal.ads.ay;
import com.google.android.gms.internal.ads.b60;
import com.google.android.gms.internal.ads.b70;
import com.google.android.gms.internal.ads.eo;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hk;
import com.google.android.gms.internal.ads.ib0;
import com.google.android.gms.internal.ads.k90;
import com.google.android.gms.internal.ads.mi;
import com.google.android.gms.internal.ads.p70;
import com.google.android.gms.internal.ads.sz0;
import com.google.android.gms.internal.ads.t70;
import com.google.android.gms.internal.ads.tj;
import com.google.android.gms.internal.ads.tz0;
import com.google.android.gms.internal.ads.wo;
import com.google.android.gms.internal.ads.x30;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzv {
    private static final zzv zza = new zzv();
    private final b60 zzA;
    private final zzci zzB;
    private final k90 zzC;
    private final t70 zzD;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzn zzc;
    private final zzs zzd;
    private final ib0 zze;
    private final zzaa zzf;
    private final mi zzg;
    private final b70 zzh;
    private final zzab zzi;
    private final tj zzj;
    private final i3.a zzk;
    private final zzf zzl;
    private final eo zzm;
    private final wo zzn;
    private final zzay zzo;
    private final x30 zzp;
    private final p70 zzq;
    private final gx zzr;
    private final zzz zzs;
    private final zzbt zzt;
    private final zzad zzu;
    private final zzae zzv;
    private final ay zzw;
    private final zzbu zzx;
    private final tz0 zzy;
    private final hk zzz;

    public zzv() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzn zznVar = new com.google.android.gms.ads.internal.overlay.zzn();
        zzs zzsVar = new zzs();
        ib0 ib0Var = new ib0();
        int i6 = Build.VERSION.SDK_INT;
        zzaa zzyVar = i6 >= 30 ? new zzy() : i6 >= 28 ? new zzx() : i6 >= 26 ? new com.google.android.gms.ads.internal.util.zzv() : new com.google.android.gms.ads.internal.util.zzu();
        mi miVar = new mi();
        b70 b70Var = new b70();
        zzab zzabVar = new zzab();
        tj tjVar = new tj();
        zzf zzfVar = new zzf();
        eo eoVar = new eo();
        wo woVar = new wo();
        zzay zzayVar = new zzay();
        x30 x30Var = new x30();
        p70 p70Var = new p70();
        gx gxVar = new gx();
        zzz zzzVar = new zzz();
        zzbt zzbtVar = new zzbt();
        zzad zzadVar = new zzad();
        zzae zzaeVar = new zzae();
        ay ayVar = new ay();
        zzbu zzbuVar = new zzbu();
        sz0 sz0Var = new sz0();
        hk hkVar = new hk();
        b60 b60Var = new b60();
        zzci zzciVar = new zzci();
        k90 k90Var = new k90();
        t70 t70Var = new t70();
        this.zzb = zzaVar;
        this.zzc = zznVar;
        this.zzd = zzsVar;
        this.zze = ib0Var;
        this.zzf = zzyVar;
        this.zzg = miVar;
        this.zzh = b70Var;
        this.zzi = zzabVar;
        this.zzj = tjVar;
        this.zzk = i3.c.f13363a;
        this.zzl = zzfVar;
        this.zzm = eoVar;
        this.zzn = woVar;
        this.zzo = zzayVar;
        this.zzp = x30Var;
        this.zzq = p70Var;
        this.zzr = gxVar;
        this.zzt = zzbtVar;
        this.zzs = zzzVar;
        this.zzu = zzadVar;
        this.zzv = zzaeVar;
        this.zzw = ayVar;
        this.zzx = zzbuVar;
        this.zzy = sz0Var;
        this.zzz = hkVar;
        this.zzA = b60Var;
        this.zzB = zzciVar;
        this.zzC = k90Var;
        this.zzD = t70Var;
    }

    public static ib0 zzA() {
        return zza.zze;
    }

    public static tz0 zzB() {
        return zza.zzy;
    }

    public static i3.a zzC() {
        return zza.zzk;
    }

    public static zzf zza() {
        return zza.zzl;
    }

    public static mi zzb() {
        return zza.zzg;
    }

    public static tj zzc() {
        return zza.zzj;
    }

    public static hk zzd() {
        return zza.zzz;
    }

    public static eo zze() {
        return zza.zzm;
    }

    public static wo zzf() {
        return zza.zzn;
    }

    public static gx zzg() {
        return zza.zzr;
    }

    public static ay zzh() {
        return zza.zzw;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzi() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzj() {
        return zza.zzc;
    }

    public static zzz zzk() {
        return zza.zzs;
    }

    public static zzad zzl() {
        return zza.zzu;
    }

    public static zzae zzm() {
        return zza.zzv;
    }

    public static x30 zzn() {
        return zza.zzp;
    }

    public static b60 zzo() {
        return zza.zzA;
    }

    public static b70 zzp() {
        return zza.zzh;
    }

    public static zzs zzq() {
        return zza.zzd;
    }

    public static zzaa zzr() {
        return zza.zzf;
    }

    public static zzab zzs() {
        return zza.zzi;
    }

    public static zzay zzt() {
        return zza.zzo;
    }

    public static zzbt zzu() {
        return zza.zzt;
    }

    public static zzbu zzv() {
        return zza.zzx;
    }

    public static zzci zzw() {
        return zza.zzB;
    }

    public static p70 zzx() {
        return zza.zzq;
    }

    public static t70 zzy() {
        return zza.zzD;
    }

    public static k90 zzz() {
        return zza.zzC;
    }
}
