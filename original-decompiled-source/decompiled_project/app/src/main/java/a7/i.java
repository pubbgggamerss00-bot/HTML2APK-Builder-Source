package a7;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.r;
import pg.f0;
import qg.x;

/* loaded from: classes.dex */
public abstract class i<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e7.c f87a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f88b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f89c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<y6.a<T>> f90d;

    /* renamed from: e, reason: collision with root package name */
    public T f91e;

    public i(Context context, e7.c cVar) {
        this.f87a = cVar;
        Context applicationContext = context.getApplicationContext();
        r.d(applicationContext, "context.applicationContext");
        this.f88b = applicationContext;
        this.f89c = new Object();
        this.f90d = new LinkedHashSet<>();
    }

    public abstract T a();

    public final void b(T t3) {
        synchronized (this.f89c) {
            T t10 = this.f91e;
            if (t10 == null || !t10.equals(t3)) {
                this.f91e = t3;
                final List listC0 = x.c0(this.f90d);
                this.f87a.f8401d.execute(new Runnable() { // from class: a7.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it = listC0.iterator();
                        while (it.hasNext()) {
                            ((y6.a) it.next()).a(this.f91e);
                        }
                    }
                });
                f0 f0Var = f0.f21461a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
