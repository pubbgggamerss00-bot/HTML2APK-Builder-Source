package le;

import com.google.android.gms.common.internal.o;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f17031a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return o.a(this.f17031a, ((b) obj).f17031a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17031a});
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        aVar.a(this.f17031a, "token");
        return aVar.toString();
    }
}
