package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zc0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11257a;

    public /* synthetic */ zc0(int i6) {
        this.f11257a = i6;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f11257a) {
            case 0:
                String strZzd = zzbc.zzd();
                ih1.j(strZzd);
                return strZzd;
            case 1:
                return "banner";
            case 2:
                return null;
            case 3:
                return new it0();
            case 4:
                return new rt0(11, 12, 1007);
            case 5:
                return new rt0(13, 14, 1004);
            case 6:
                zzv.zzq();
                String string = UUID.randomUUID().toString();
                ih1.j(string);
                return string;
            case 7:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new p61(h70Var);
            case 8:
                sn snVar = zn.f11349a;
                return zzbe.zza().a();
            case 9:
                return new bc1();
            default:
                return new oc1();
        }
    }
}
