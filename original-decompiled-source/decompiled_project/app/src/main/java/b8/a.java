package b8;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<g7.t> f3665a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3666b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3667c;

    public a(g7.t tVar) {
        this.f3665a = new WeakReference<>(tVar);
    }

    public final synchronized void a() {
        try {
            if (this.f3667c) {
                return;
            }
            this.f3667c = true;
            Context context = this.f3666b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            this.f3665a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (this.f3665a.get() == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i10) {
        r7.c cVarC;
        try {
            g7.t tVar = this.f3665a.get();
            if (tVar == null) {
                a();
            } else if (i10 >= 40) {
                r7.c cVarC2 = tVar.c();
                if (cVarC2 != null) {
                    cVarC2.clear();
                }
            } else if (i10 >= 10 && (cVarC = tVar.c()) != null) {
                cVarC.b(cVarC.getSize() / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
