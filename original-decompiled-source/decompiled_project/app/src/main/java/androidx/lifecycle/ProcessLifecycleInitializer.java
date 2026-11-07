package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.l;
import androidx.lifecycle.q;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements l6.b<t> {
    @Override // l6.b
    public final List<Class<? extends l6.b<?>>> a() {
        return qg.z.f22752a;
    }

    @Override // l6.b
    public final t b(Context context) {
        kotlin.jvm.internal.r.e(context, "context");
        l6.a aVarC = l6.a.c(context);
        kotlin.jvm.internal.r.d(aVarC, "getInstance(...)");
        if (!aVarC.f16734b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!q.f2340a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.r.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new q.a());
        }
        e0 e0Var = e0.f2260j;
        e0Var.getClass();
        e0Var.f2265e = new Handler();
        e0Var.f2266f.f(l.a.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.r.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new f0(e0Var));
        return e0Var;
    }
}
