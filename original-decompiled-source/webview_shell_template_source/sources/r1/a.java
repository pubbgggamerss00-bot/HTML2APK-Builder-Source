package r1;

import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14256a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14257b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: r1.a$a, reason: collision with other inner class name */
    public static final class C0087a {
    }

    public a(String str, boolean z6) {
        this.f14256a = str;
        this.f14257b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f14256a, aVar.f14256a) && this.f14257b == aVar.f14257b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14257b) + (this.f14256a.hashCode() * 31);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f14256a + ", shouldRecordObservation=" + this.f14257b;
    }
}
