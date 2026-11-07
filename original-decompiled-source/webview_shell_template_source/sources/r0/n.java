package r0;

import android.os.Handler;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n<T> implements Runnable {
    public h s;

    /* renamed from: t, reason: collision with root package name */
    public i f14253t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f14254u;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public final /* synthetic */ i s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f14255t;

        public a(i iVar, Object obj) {
            this.s = iVar;
            this.f14255t = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.s.accept(this.f14255t);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.s.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f14254u.post(new a(this.f14253t, objCall));
    }
}
