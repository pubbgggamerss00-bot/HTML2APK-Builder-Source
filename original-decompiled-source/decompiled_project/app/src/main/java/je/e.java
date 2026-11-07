package je;

import f1.m;
import ge.p;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f15699d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f15700e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final p f15701a;

    /* renamed from: b, reason: collision with root package name */
    public long f15702b;

    /* renamed from: c, reason: collision with root package name */
    public int f15703c;

    public e() {
        if (m.f8810a == null) {
            Pattern pattern = p.f12040c;
            m.f8810a = new m();
        }
        m mVar = m.f8810a;
        if (p.f12041d == null) {
            p.f12041d = new p(mVar);
        }
        this.f15701a = p.f12041d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a() {
        boolean z10;
        if (this.f15703c != 0) {
            this.f15701a.f12042a.getClass();
            z10 = System.currentTimeMillis() > this.f15702b;
        }
        return z10;
    }

    public final synchronized void b(int i10) {
        long jMin;
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            synchronized (this) {
                this.f15703c = 0;
            }
            return;
        }
        this.f15703c++;
        synchronized (this) {
            if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                double dPow = Math.pow(2.0d, this.f15703c);
                this.f15701a.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f15700e);
            } else {
                jMin = f15699d;
            }
            this.f15701a.f12042a.getClass();
            this.f15702b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
