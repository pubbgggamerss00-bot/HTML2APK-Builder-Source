package g7;

import android.app.ActivityManager;
import android.content.Context;
import g7.p;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r7.c;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11515b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f11514a = i10;
        this.f11515b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [r7.b] */
    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f11514a;
        Object obj = this.f11515b;
        switch (i10) {
            case 0:
                c.a aVar = new c.a();
                final Context context = ((p.a) obj).f11516a;
                final double d10 = 0.2d;
                try {
                    Object systemService = p3.b.getSystemService(context, ActivityManager.class);
                    kotlin.jvm.internal.r.b(systemService);
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d10 = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d10 || d10 > 1.0d) {
                    throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
                }
                aVar.f23219a = new eh.a() { // from class: r7.b
                    @Override // eh.a
                    public final Object invoke() {
                        int largeMemoryClass;
                        Context context2 = context;
                        try {
                            Object systemService2 = p3.b.getSystemService(context2, ActivityManager.class);
                            r.b(systemService2);
                            ActivityManager activityManager = (ActivityManager) systemService2;
                            largeMemoryClass = (context2.getApplicationInfo().flags & PKIFailureInfo.badCertTemplate) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                        } catch (Exception unused2) {
                            largeMemoryClass = 256;
                        }
                        return Long.valueOf((long) (d10 * largeMemoryClass * 1048576));
                    }
                };
                r7.g gVar = new r7.g();
                r7.b bVar = aVar.f23219a;
                if (bVar == null) {
                    throw new IllegalStateException("maxSizeBytesFactory == null");
                }
                long jLongValue = ((Number) bVar.invoke()).longValue();
                return new r7.e(jLongValue > 0 ? new r7.f(jLongValue, gVar) : new r7.a(gVar), gVar);
            default:
                int i11 = t8.w.f28523b;
                ((n1) obj).setValue(Boolean.FALSE);
                return pg.f0.f21461a;
        }
    }
}
