package c3;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a0 extends y {

    /* renamed from: u, reason: collision with root package name */
    public static final WeakReference f2163u = new WeakReference(null);

    /* renamed from: t, reason: collision with root package name */
    public WeakReference f2164t;

    public a0(byte[] bArr) {
        super(bArr);
        this.f2164t = f2163u;
    }

    public abstract byte[] e2();

    @Override // c3.y
    public final byte[] r() {
        byte[] bArrE2;
        synchronized (this) {
            try {
                bArrE2 = (byte[]) this.f2164t.get();
                if (bArrE2 == null) {
                    bArrE2 = e2();
                    this.f2164t = new WeakReference(bArrE2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrE2;
    }
}
