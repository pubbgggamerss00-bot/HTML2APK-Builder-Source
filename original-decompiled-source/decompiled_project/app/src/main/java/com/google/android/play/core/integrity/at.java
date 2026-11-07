package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final kc.k f6529a;

    /* renamed from: b, reason: collision with root package name */
    private final kc.k f6530b;

    public at(kc.k kVar, kc.k kVar2) {
        this.f6529a = kVar;
        this.f6530b = kVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, kc.e eVar) {
        Object objA = this.f6529a.a();
        objA.getClass();
        k kVar = (k) this.f6530b.a();
        kVar.getClass();
        activity.getClass();
        eVar.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, eVar);
    }
}
