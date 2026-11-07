package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ei implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4296a;

    @Override // com.google.android.gms.internal.ads.ga2
    public /* synthetic */ Object zzb() {
        switch (this.f4296a) {
            case 0:
                return new di();
            case 1:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 2:
                return "interstitial";
            case 3:
                return new k41();
            case 4:
                return null;
            case 5:
                return new rt0(19, 20, 1008);
            default:
                return new rt0(1001, 1002, 1003);
        }
    }
}
