package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ Activity s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2355t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f2356u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f2357v;

    public d(Activity activity, String str, boolean z6, boolean z7) {
        this.s = activity;
        this.f2355t = str;
        this.f2356u = z6;
        this.f2357v = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzv.zzq();
        Activity activity = this.s;
        AlertDialog.Builder builderZzL = zzs.zzL(activity);
        builderZzL.setMessage(this.f2355t);
        if (this.f2356u) {
            builderZzL.setTitle("Error");
        } else {
            builderZzL.setTitle("Info");
        }
        if (this.f2357v) {
            builderZzL.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzL.setPositiveButton("Learn More", new c(activity));
            builderZzL.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzL.create().show();
    }
}
