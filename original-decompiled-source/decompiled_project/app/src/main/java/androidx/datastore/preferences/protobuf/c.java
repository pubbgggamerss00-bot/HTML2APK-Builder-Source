package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f1991a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f1992b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f1991a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f1992b = cls2 != null;
    }

    public static boolean a() {
        return (f1991a == null || f1992b) ? false : true;
    }
}
