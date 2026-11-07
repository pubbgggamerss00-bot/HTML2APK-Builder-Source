package e3;

import d3.a;
import d3.a.c;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a<O extends a.c> {

    /* renamed from: a, reason: collision with root package name */
    public final int f12850a;

    /* renamed from: b, reason: collision with root package name */
    public final d3.a<O> f12851b;

    /* renamed from: c, reason: collision with root package name */
    public final O f12852c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12853d;

    public a(d3.a<O> aVar, O o6, String str) {
        this.f12851b = aVar;
        this.f12852c = o6;
        this.f12853d = str;
        this.f12850a = Arrays.hashCode(new Object[]{aVar, o6, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return com.google.android.gms.common.internal.k.a(this.f12851b, aVar.f12851b) && com.google.android.gms.common.internal.k.a(this.f12852c, aVar.f12852c) && com.google.android.gms.common.internal.k.a(this.f12853d, aVar.f12853d);
    }

    public final int hashCode() {
        return this.f12850a;
    }
}
