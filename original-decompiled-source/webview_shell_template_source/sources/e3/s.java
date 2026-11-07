package e3;

import com.google.android.gms.common.internal.k;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final a<?> f12901a;

    /* renamed from: b, reason: collision with root package name */
    public final c3.d f12902b;

    public /* synthetic */ s(a aVar, c3.d dVar) {
        this.f12901a = aVar;
        this.f12902b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof s)) {
            s sVar = (s) obj;
            if (com.google.android.gms.common.internal.k.a(this.f12901a, sVar.f12901a) && com.google.android.gms.common.internal.k.a(this.f12902b, sVar.f12902b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12901a, this.f12902b});
    }

    public final String toString() {
        k.a aVar = new k.a(this);
        aVar.a("key", this.f12901a);
        aVar.a("feature", this.f12902b);
        return aVar.toString();
    }
}
