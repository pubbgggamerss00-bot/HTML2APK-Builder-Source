package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements b2.b<m> {
    @Override // b2.b
    public final List<Class<? extends b2.b<?>>> a() {
        return e5.s.s;
    }

    @Override // b2.b
    public final m b(Context context) {
        kotlin.jvm.internal.j.e("context", context);
        b2.a aVarC = b2.a.c(context);
        kotlin.jvm.internal.j.d("getInstance(context)", aVarC);
        if (!aVarC.f1986b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!j.f1313a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type android.app.Application", applicationContext);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new j.a());
        }
        u uVar = u.A;
        uVar.getClass();
        uVar.f1332w = new Handler();
        uVar.f1333x.f(h.a.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type android.app.Application", applicationContext2);
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new v(uVar));
        return uVar;
    }
}
