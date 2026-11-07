package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes2.dex */
final class ar extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f6522a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.f6522a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 1) {
            this.f6522a.f6523a.trySetResult(3);
        } else if (i10 == 2) {
            this.f6522a.f6523a.trySetResult(2);
        } else {
            if (i10 != 3) {
                return;
            }
            this.f6522a.f6523a.trySetResult(1);
        }
    }
}
