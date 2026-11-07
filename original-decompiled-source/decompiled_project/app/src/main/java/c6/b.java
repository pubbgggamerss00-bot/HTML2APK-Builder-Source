package c6;

import android.os.Build;
import android.os.Bundle;
import b3.l;
import java.util.ArrayList;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import u3.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4992a = 0;

    public static final float a(Bundle bundle, String key) {
        r.e(key, "key");
        float f10 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f10 != Float.MIN_VALUE || bundle.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f10;
        }
        l.c(key);
        throw null;
    }

    public static final int b(Bundle bundle, String key) {
        r.e(key, "key");
        int i10 = bundle.getInt(key, PKIFailureInfo.systemUnavail);
        if (i10 != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10;
        }
        l.c(key);
        throw null;
    }

    public static final int[] c(Bundle bundle, String key) {
        r.e(key, "key");
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        l.c(key);
        throw null;
    }

    public static final long d(Bundle bundle, String key) {
        r.e(key, "key");
        long j10 = bundle.getLong(key, Long.MIN_VALUE);
        if (j10 != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j10;
        }
        l.c(key);
        throw null;
    }

    public static final ArrayList e(Bundle bundle, String key, h hVar) {
        r.e(key, "key");
        ArrayList arrayListC = Build.VERSION.SDK_INT >= 34 ? c.a.c(bundle, key, b3.e.c(hVar)) : bundle.getParcelableArrayList(key);
        if (arrayListC != null) {
            return arrayListC;
        }
        l.c(key);
        throw null;
    }

    public static final Bundle f(Bundle bundle, String key) {
        r.e(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        l.c(key);
        throw null;
    }

    public static final String g(Bundle bundle, String key) {
        r.e(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        l.c(key);
        throw null;
    }

    public static final ArrayList h(Bundle bundle, String key) {
        r.e(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        l.c(key);
        throw null;
    }

    public static final boolean i(Bundle bundle, String key) {
        r.e(key, "key");
        return bundle.containsKey(key) && bundle.get(key) == null;
    }
}
