package kotlinx.serialization.internal;

import di.q;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f16383e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final bi.f f16384a;

    /* renamed from: b, reason: collision with root package name */
    public final q.a f16385b;

    /* renamed from: c, reason: collision with root package name */
    public long f16386c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f16387d;

    public n(bi.f descriptor, q.a aVar) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        this.f16384a = descriptor;
        this.f16385b = aVar;
        int iE = descriptor.e();
        if (iE <= 64) {
            this.f16386c = iE != 64 ? (-1) << iE : 0L;
            this.f16387d = f16383e;
            return;
        }
        this.f16386c = 0L;
        int i10 = (iE - 1) >>> 6;
        long[] jArr = new long[i10];
        if ((iE & 63) != 0) {
            jArr[i10 - 1] = (-1) << iE;
        }
        this.f16387d = jArr;
    }
}
