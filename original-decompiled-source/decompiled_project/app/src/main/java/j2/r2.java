package j2;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<? extends Object>[] f14889a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof h1.t) {
            h1.t tVar = (h1.t) obj;
            if (tVar.a() == x0.q1.f31878a || tVar.a() == x0.u3.f31923a || tVar.a() == x0.s2.f31913a) {
                T value = tVar.getValue();
                if (value == 0) {
                    return true;
                }
                return a(value);
            }
        } else {
            if ((obj instanceof pg.f) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i10 = 0; i10 < 7; i10++) {
                if (f14889a[i10].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
