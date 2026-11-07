package q0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14096a;

    /* renamed from: b, reason: collision with root package name */
    public a f14097b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14098c;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        void onCancel();
    }

    public final void a(a aVar) {
        synchronized (this) {
            while (this.f14098c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f14097b == aVar) {
                return;
            }
            this.f14097b = aVar;
            if (this.f14096a) {
                aVar.onCancel();
            }
        }
    }
}
