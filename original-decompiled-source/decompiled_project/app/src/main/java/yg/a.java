package yg;

import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public class a extends xg.a {

    /* renamed from: yg.a$a, reason: collision with other inner class name */
    public static final class C0349a {

        /* renamed from: a, reason: collision with root package name */
        public static final Integer f34405a;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f34405a = num;
        }
    }

    @Override // xg.a
    public final void a(Throwable cause, Throwable exception) {
        r.e(cause, "cause");
        r.e(exception, "exception");
        Integer num = C0349a.f34405a;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
