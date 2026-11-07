package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
final class bj extends y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bk f6561a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j10) {
        super(str, j10);
        this.f6561a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f6561a.f6564e);
        return this.f6561a.f6562c.c(activity, bundle);
    }
}
