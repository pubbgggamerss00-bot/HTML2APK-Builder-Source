package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import kc.c0;

/* loaded from: classes2.dex */
abstract class bm extends c0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f6567f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f6567f = bnVar;
    }

    @Override // kc.c0
    public final void a(Exception exc) {
        if (!(exc instanceof kc.f)) {
            super.a(exc);
        } else if (bn.k(this.f6567f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
