package ld;

import android.app.Application;
import android.content.Context;
import com.google.crypto.tink.shaded.protobuf.l1;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final l f17023a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f17024b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f17025c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f17026d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f17027e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f17028f;

    public r(Context context, i iVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        com.google.android.gms.common.internal.p.f(context);
        l lVar = new l(iVar, executor, scheduledExecutorService);
        l1 l1Var = new l1();
        this.f17023a = lVar;
        this.f17024b = l1Var;
        this.f17027e = -1L;
        com.google.android.gms.common.api.internal.c.b((Application) context.getApplicationContext());
        com.google.android.gms.common.api.internal.c.f5945e.a(new q(this, lVar, l1Var));
    }

    public final boolean a() {
        return this.f17028f && !this.f17025c && this.f17026d > 0 && this.f17027e != -1;
    }
}
