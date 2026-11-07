package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q80 {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f8249r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8250a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8251b;

    /* renamed from: c, reason: collision with root package name */
    public final VersionInfoParcel f8252c;

    /* renamed from: d, reason: collision with root package name */
    public final ko f8253d;

    /* renamed from: e, reason: collision with root package name */
    public final oo f8254e;

    /* renamed from: f, reason: collision with root package name */
    public final zzbh f8255f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f8256g;
    public final String[] h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8257i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8258j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8259k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8260l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8261m;

    /* renamed from: n, reason: collision with root package name */
    public b80 f8262n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8263o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8264p;

    /* renamed from: q, reason: collision with root package name */
    public long f8265q;

    static {
        f8249r = zzbc.zze().nextInt(100) < ((Integer) zzbe.zzc().a(zn.Ac)).intValue();
    }

    public q80(Context context, VersionInfoParcel versionInfoParcel, String str, oo ooVar, ko koVar) {
        zzbf zzbfVar = new zzbf();
        zzbfVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbfVar.zza("1_5", 1.0d, 5.0d);
        zzbfVar.zza("5_10", 5.0d, 10.0d);
        zzbfVar.zza("10_20", 10.0d, 20.0d);
        zzbfVar.zza("20_30", 20.0d, 30.0d);
        zzbfVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f8255f = zzbfVar.zzb();
        this.f8257i = false;
        this.f8258j = false;
        this.f8259k = false;
        this.f8260l = false;
        this.f8265q = -1L;
        this.f8250a = context;
        this.f8252c = versionInfoParcel;
        this.f8251b = str;
        this.f8254e = ooVar;
        this.f8253d = koVar;
        String str2 = (String) zzbe.zzc().a(zn.N);
        if (str2 == null) {
            this.h = new String[0];
            this.f8256g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.h = new String[length];
        this.f8256g = new long[length];
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            try {
                this.f8256g[i6] = Long.parseLong(strArrSplit[i6]);
            } catch (NumberFormatException e6) {
                zzo.zzk("Unable to parse frame hash target time number.", e6);
                this.f8256g[i6] = -1;
            }
        }
    }

    public final void a(b80 b80Var) {
        ko koVar = this.f8253d;
        oo ooVar = this.f8254e;
        fo.d(ooVar, koVar, "vpc2");
        this.f8257i = true;
        ooVar.b("vpn", b80Var.q());
        this.f8262n = b80Var;
    }

    public final void b() {
        this.f8261m = true;
        if (!this.f8258j || this.f8259k) {
            return;
        }
        fo.d(this.f8254e, this.f8253d, "vfp2");
        this.f8259k = true;
    }

    public final void c() {
        if (!f8249r || this.f8263o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f8251b);
        bundle.putString("player", this.f8262n.q());
        for (com.google.android.gms.ads.internal.util.zzbe zzbeVar : this.f8255f.zza()) {
            String strValueOf = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(zzbeVar.zze));
            String strValueOf2 = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(zzbeVar.zzd));
        }
        int i6 = 0;
        while (true) {
            long[] jArr = this.f8256g;
            if (i6 >= jArr.length) {
                zzv.zzq().zzi(this.f8250a, this.f8252c.afmaVersion, "gmob-apps", bundle, true);
                this.f8263o = true;
                return;
            }
            String str = this.h[i6];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i6]).toString()), str);
            }
            i6++;
        }
    }

    public final void d(b80 b80Var) {
        if (this.f8259k && !this.f8260l) {
            if (zze.zzc() && !this.f8260l) {
                zze.zza("VideoMetricsMixin first frame");
            }
            fo.d(this.f8254e, this.f8253d, "vff2");
            this.f8260l = true;
        }
        long jC = zzv.zzC().c();
        if (this.f8261m && this.f8264p && this.f8265q != -1) {
            this.f8255f.zzb(TimeUnit.SECONDS.toNanos(1L) / (jC - this.f8265q));
        }
        this.f8264p = this.f8261m;
        this.f8265q = jC;
        long jLongValue = ((Long) zzbe.zzc().a(zn.O)).longValue();
        long jI = b80Var.i();
        int i6 = 0;
        while (true) {
            String[] strArr = this.h;
            if (i6 >= strArr.length) {
                return;
            }
            if (strArr[i6] == null && jLongValue > Math.abs(jI - this.f8256g[i6])) {
                int i7 = 8;
                Bitmap bitmap = b80Var.getBitmap(8, 8);
                long j6 = 63;
                long j7 = 0;
                int i8 = 0;
                while (i8 < i7) {
                    int i9 = 0;
                    while (i9 < i7) {
                        int pixel = bitmap.getPixel(i9, i8);
                        j7 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j6);
                        j6--;
                        i9++;
                        i7 = 8;
                    }
                    i8++;
                    i7 = 8;
                }
                strArr[i6] = String.format("%016X", Long.valueOf(j7));
                return;
            }
            i6++;
        }
    }
}
