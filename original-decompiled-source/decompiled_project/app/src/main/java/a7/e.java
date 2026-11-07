package a7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f<Object> f82a;

    public e(f<Object> fVar) {
        this.f82a = fVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        r.e(context, "context");
        r.e(intent, "intent");
        this.f82a.f(intent);
    }
}
