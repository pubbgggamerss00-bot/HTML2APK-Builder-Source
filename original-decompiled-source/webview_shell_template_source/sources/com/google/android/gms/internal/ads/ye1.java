package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzx;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ye1 {

    /* renamed from: a, reason: collision with root package name */
    public final zzx f10936a;

    /* renamed from: b, reason: collision with root package name */
    public final zzu f10937b;

    /* renamed from: c, reason: collision with root package name */
    public final is1 f10938c;

    /* renamed from: d, reason: collision with root package name */
    public final ze1 f10939d;

    public ye1(zzx zzxVar, zzu zzuVar, is1 is1Var, ze1 ze1Var) {
        this.f10936a = zzxVar;
        this.f10937b = zzuVar;
        this.f10938c = is1Var;
        this.f10939d = ze1Var;
    }

    public final c5.a a(final int i6, final String str, final long j6) {
        String strD;
        zzx zzxVar = this.f10936a;
        if (i6 > zzxVar.zzc()) {
            ze1 ze1Var = this.f10939d;
            if (ze1Var == null || !zzxVar.zzd()) {
                return bs1.m(zzt.RETRIABLE_FAILURE);
            }
            fz0 fz0Var = new fz0(zzv.zzC().a(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, str, 2);
            dz0 dz0Var = ze1Var.f11270a;
            dz0Var.getClass();
            dz0Var.b(new ni0(13, dz0Var, fz0Var));
            return bs1.m(zzt.BUFFERED);
        }
        if (((Boolean) zzbe.zzc().a(zn.v8)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i6));
            strD = androidx.activity.m.d(String.valueOf(builderClearQuery.build()), "&", encodedQuery);
        } else {
            strD = str;
        }
        pr1 pr1Var = new pr1() { // from class: com.google.android.gms.internal.ads.xe1
            @Override // com.google.android.gms.internal.ads.pr1
            public final c5.a zza(Object obj) {
                zzt zztVar = (zzt) obj;
                if (zztVar != zzt.RETRIABLE_FAILURE) {
                    return bs1.m(zztVar);
                }
                ye1 ye1Var = this.f10547a;
                zzx zzxVar2 = ye1Var.f10936a;
                long jZzb = zzxVar2.zzb();
                int i7 = i6;
                if (i7 != 1) {
                    jZzb = (long) (zzxVar2.zza() * j6);
                }
                return ye1Var.a(i7 + 1, str, jZzb);
            }
        };
        is1 is1Var = this.f10938c;
        return j6 == 0 ? bs1.p(is1Var.u(new av0(2, this, strD)), pr1Var, is1Var) : bs1.p(is1Var.schedule(new vw0(2, this, strD), j6, TimeUnit.MILLISECONDS), pr1Var, is1Var);
    }
}
