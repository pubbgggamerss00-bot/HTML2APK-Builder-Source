package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.provider.Settings;
import com.google.android.gms.ads.internal.client.zzbc;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ua1 implements pl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9510b;

    public /* synthetic */ ua1(int i6, Object obj) {
        this.f9509a = i6;
        this.f9510b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pl1
    public final Object apply(Object obj) {
        switch (this.f9509a) {
            case 0:
                r30 r30Var = (r30) obj;
                va1 va1Var = new va1(r30Var, new hd1(r30Var.B));
                ((xa1) this.f9510b).f10454d = va1Var;
                return va1Var;
            default:
                f91 f91Var = (f91) this.f9510b;
                f91Var.getClass();
                zzbc.zzb();
                ContentResolver contentResolver = f91Var.f4565a.getContentResolver();
                return new g91(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new y2());
        }
    }
}
