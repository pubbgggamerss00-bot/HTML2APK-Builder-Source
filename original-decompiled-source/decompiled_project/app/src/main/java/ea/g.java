package ea;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.o;
import java.util.Arrays;

@Deprecated
/* loaded from: classes2.dex */
public final class g implements a.d {

    /* renamed from: c, reason: collision with root package name */
    public static final g f8637c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8638a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8639b;

    static {
        f fVar = new f();
        fVar.f8635a = Boolean.FALSE;
        f8637c = new g(fVar);
    }

    public g(f fVar) {
        this.f8638a = fVar.f8635a.booleanValue();
        this.f8639b = fVar.f8636b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return o.a(null, null) && this.f8638a == gVar.f8638a && o.a(this.f8639b, gVar.f8639b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f8638a), this.f8639b});
    }
}
