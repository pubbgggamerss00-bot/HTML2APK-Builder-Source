package oa;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static d f19077e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f19078a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f19079b;

    /* renamed from: c, reason: collision with root package name */
    public e f19080c = new e(this);

    /* renamed from: d, reason: collision with root package name */
    public int f19081d = 1;

    public d(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f19079b = scheduledExecutorService;
        this.f19078a = context.getApplicationContext();
    }
}
