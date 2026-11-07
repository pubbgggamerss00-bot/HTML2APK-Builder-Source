package di;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8013a;

    static {
        Object objA;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objA = property != null ? mh.s.g(property) : null;
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        Integer num = (Integer) (objA instanceof p.a ? null : objA);
        f8013a = num != null ? num.intValue() : PKIFailureInfo.badSenderNonce;
    }
}
