package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j90 extends zzb {

    /* renamed from: a, reason: collision with root package name */
    public final p80 f5983a;

    /* renamed from: b, reason: collision with root package name */
    public final s90 f5984b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5985c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f5986d;

    public j90(p80 p80Var, s90 s90Var, String str, String[] strArr) {
        this.f5983a = p80Var;
        this.f5984b = s90Var;
        this.f5985c = str;
        this.f5986d = strArr;
        zzv.zzz().s.add(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.f5984b.q(this.f5985c, this.f5986d);
        } finally {
            zzs.zza.post(new p(4, this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final c5.a zzb() {
        return (((Boolean) zzbe.zzc().a(zn.f11384e2)).booleanValue() && (this.f5984b instanceof z90)) ? i70.f5591f.u(new i90(0, this)) : super.zzb();
    }
}
