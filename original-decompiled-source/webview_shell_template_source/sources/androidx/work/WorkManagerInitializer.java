package androidx.work;

import android.content.Context;
import androidx.work.c;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b2.b<q> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1739a = k.e("WrkMgrInitializer");

    @Override // b2.b
    public final List<Class<? extends b2.b<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // b2.b
    public final q b(Context context) {
        k.c().a(f1739a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        j2.k.c(context, new c(new c.a()));
        return j2.k.b(context);
    }
}
