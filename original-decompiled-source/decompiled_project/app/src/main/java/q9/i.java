package q9;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22559a;

    public i(ArrayList arrayList) {
        this.f22559a = arrayList;
    }

    @Override // q9.o
    public final List<r> a() {
        return this.f22559a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f22559a.equals(((o) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f22559a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f22559a + "}";
    }
}
