package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j71 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5957a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5958b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5959c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5960d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5961e;

    public j71(String str, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f5957a = str;
        this.f5958b = z6;
        this.f5959c = z7;
        this.f5960d = z8;
        this.f5961e = z9;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = ((ck0) obj).f3610a;
        String str = this.f5957a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z6 = this.f5958b;
        bundle.putInt("test_mode", z6 ? 1 : 0);
        boolean z7 = this.f5959c;
        bundle.putInt("linked_device", z7 ? 1 : 0);
        if (z6 || z7) {
            if (((Boolean) zzbe.zzc().a(zn.d9)).booleanValue()) {
                bundle.putInt("risd", !this.f5960d ? 1 : 0);
            }
            if (((Boolean) zzbe.zzc().a(zn.h9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f5961e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((ck0) obj).f3611b;
        String str = this.f5957a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z6 = this.f5958b;
        bundle.putInt("test_mode", z6 ? 1 : 0);
        boolean z7 = this.f5959c;
        bundle.putInt("linked_device", z7 ? 1 : 0);
        if (z6 || z7) {
            if (((Boolean) zzbe.zzc().a(zn.h9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f5961e);
            }
        }
    }
}
