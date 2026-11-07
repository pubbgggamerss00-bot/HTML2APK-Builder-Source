package nc;

/* loaded from: classes2.dex */
public final class g {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(androidx.datastore.preferences.protobuf.z0.a(obj2, "null key in entry: null="));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void b(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }
}
