package v3;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public final p f14800a = new p();

    public final void a(Exception exc) {
        p pVar = this.f14800a;
        pVar.getClass();
        com.google.android.gms.common.internal.l.g("Exception must not be null", exc);
        synchronized (pVar.f14815a) {
            try {
                if (pVar.f14817c) {
                    return;
                }
                pVar.f14817c = true;
                pVar.f14820f = exc;
                pVar.f14816b.c(pVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
