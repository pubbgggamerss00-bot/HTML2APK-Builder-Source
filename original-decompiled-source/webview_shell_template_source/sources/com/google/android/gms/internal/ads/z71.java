package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z71 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final y2 f11207a;

    /* renamed from: b, reason: collision with root package name */
    public final y2 f11208b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11209c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11210d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11211e = false;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11212f;

    public z71(y2 y2Var, y2 y2Var2, boolean z6, boolean z7, boolean z8) {
        this.f11207a = y2Var;
        this.f11208b = y2Var2;
        this.f11209c = z6;
        this.f11210d = z7;
        this.f11212f = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.google.android.gms.internal.ads.p81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        if (this.f11211e) {
            return;
        }
        Bundle bundleA = lc1.a("pii", bundle);
        boolean z6 = this.f11212f;
        if (!z6) {
            if (!((Boolean) zzbe.zzc().a(zn.f11385e3)).booleanValue()) {
                if (z6) {
                    if (((Boolean) zzbe.zzc().a(zn.f11399g3)).booleanValue()) {
                        y2 y2Var = this.f11207a;
                        String str = (String) y2Var.f10781b;
                        long j6 = y2Var.f10780a;
                        if (str != null && j6 > 0) {
                            bundleA.putString("paidv1_id_android", str);
                            bundleA.putLong("paidv1_creation_time_android", j6);
                        }
                    }
                }
            }
        }
        if (!z6) {
            if (!((Boolean) zzbe.zzc().a(zn.f11392f3)).booleanValue()) {
                if (z6) {
                    if (((Boolean) zzbe.zzc().a(zn.f11404h3)).booleanValue()) {
                        y2 y2Var2 = this.f11208b;
                        String str2 = (String) y2Var2.f10781b;
                        long j7 = y2Var2.f10780a;
                        if (str2 != null && j7 > 0) {
                            bundleA.putString("paidv2_id_android", str2);
                            bundleA.putLong("paidv2_creation_time_android", j7);
                        }
                        bundleA.putBoolean("paidv2_pub_option_android", this.f11209c);
                        bundleA.putBoolean("paidv2_user_option_android", this.f11210d);
                    }
                }
            }
        }
        if (bundleA.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleA);
    }

    public z71(boolean z6) {
        this.f11212f = z6;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}
