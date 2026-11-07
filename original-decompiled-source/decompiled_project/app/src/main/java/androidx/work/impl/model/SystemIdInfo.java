package androidx.work.impl.model;

import androidx.datastore.preferences.protobuf.a1;
import b.b;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class SystemIdInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f3164a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3165b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3166c;

    public SystemIdInfo(String workSpecId, int i10, int i11) {
        r.e(workSpecId, "workSpecId");
        this.f3164a = workSpecId;
        this.f3165b = i10;
        this.f3166c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        return r.a(this.f3164a, systemIdInfo.f3164a) && this.f3165b == systemIdInfo.f3165b && this.f3166c == systemIdInfo.f3166c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3166c) + a1.a(this.f3165b, this.f3164a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f3164a);
        sb.append(", generation=");
        sb.append(this.f3165b);
        sb.append(", systemId=");
        return b.a(sb, this.f3166c, ')');
    }
}
