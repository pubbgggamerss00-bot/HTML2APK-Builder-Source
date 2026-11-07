package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.r;
import t6.d0;
import t6.s;
import u6.t0;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements l6.b<d0> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3110a = s.f("WrkMgrInitializer");

    @Override // l6.b
    public final List<Class<? extends l6.b<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // l6.b
    public final d0 b(Context context) {
        s.d().a(f3110a, "Initializing WorkManager with default configuration.");
        a aVar = new a(new a.C0045a());
        r.e(context, "context");
        t0.c(context, aVar);
        t0 t0VarB = t0.b(context);
        r.d(t0VarB, "getInstance(context)");
        return t0VarB;
    }
}
