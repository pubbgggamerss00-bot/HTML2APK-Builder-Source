package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;
import kc.b0;
import kc.c0;

/* loaded from: classes2.dex */
final class be extends c0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f6544a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f6545b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f6545b = bnVar;
        this.f6544a = context;
    }

    @Override // kc.c0
    public final void b() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Context context = this.f6544a;
        TaskCompletionSource taskCompletionSource = this.f6545b.f6571d;
        b0 b0Var = kc.g.f16288a;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            applicationInfo = packageInfo.applicationInfo;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        int i10 = (applicationInfo != null && applicationInfo.enabled && kc.g.a(packageInfo.signatures)) ? packageInfo.versionCode : 0;
        taskCompletionSource.trySetResult(Integer.valueOf(i10));
    }
}
