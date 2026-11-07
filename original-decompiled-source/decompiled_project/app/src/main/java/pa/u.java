package pa;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class u extends s {

    /* renamed from: c, reason: collision with root package name */
    public static final WeakReference f21406c = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f21407b;

    public u(byte[] bArr) {
        super(bArr);
        this.f21407b = f21406c;
    }

    public abstract byte[] A();

    @Override // pa.s
    public final byte[] c() {
        byte[] bArrA;
        synchronized (this) {
            try {
                bArrA = (byte[]) this.f21407b.get();
                if (bArrA == null) {
                    bArrA = A();
                    this.f21407b = new WeakReference(bArrA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrA;
    }
}
