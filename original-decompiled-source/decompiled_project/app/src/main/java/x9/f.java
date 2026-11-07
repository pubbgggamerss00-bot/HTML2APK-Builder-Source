package x9;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;
import z9.b;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f33481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r9.j f33482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33483c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f33484d;

    public /* synthetic */ f(q qVar, r9.j jVar, int i10, Runnable runnable) {
        this.f33481a = qVar;
        this.f33482b = jVar;
        this.f33483c = i10;
        this.f33484d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final r9.j jVar = this.f33482b;
        final int i10 = this.f33483c;
        Runnable runnable = this.f33484d;
        final q qVar = this.f33481a;
        z9.b bVar = qVar.f33511f;
        try {
            try {
                final y9.d dVar = qVar.f33508c;
                Objects.requireNonNull(dVar);
                bVar.p(new b.a() { // from class: x9.h
                    @Override // z9.b.a
                    public final Object f() {
                        return Integer.valueOf(dVar.a());
                    }
                });
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) qVar.f33506a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    bVar.p(new b.a() { // from class: x9.i
                        @Override // z9.b.a
                        public final Object f() {
                            qVar.f33509d.b(jVar, i10 + 1);
                            return null;
                        }
                    });
                } else {
                    qVar.a(jVar, i10);
                }
                runnable.run();
            } catch (z9.a unused) {
                qVar.f33509d.b(jVar, i10 + 1);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }
}
