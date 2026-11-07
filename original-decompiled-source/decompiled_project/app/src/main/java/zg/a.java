package zg;

/* loaded from: classes2.dex */
public final class a extends yg.a {

    /* renamed from: zg.a$a, reason: collision with other inner class name */
    public static final class C0360a {

        /* renamed from: a, reason: collision with root package name */
        public static final Integer f35074a;

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
            f35074a = num;
        }
    }
}
