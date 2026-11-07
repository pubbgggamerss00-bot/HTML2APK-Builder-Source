package r1;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List<c> f14258a;

    public b(List<c> list) {
        j.e("topics", list);
        this.f14258a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        List<c> list = this.f14258a;
        int size = list.size();
        List<c> list2 = ((b) obj).f14258a;
        if (size != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    public final int hashCode() {
        return Objects.hash(this.f14258a);
    }

    public final String toString() {
        return "Topics=" + this.f14258a;
    }
}
