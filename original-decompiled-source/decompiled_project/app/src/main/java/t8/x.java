package t8;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f28557a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28558b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28559c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28560d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f28561e;

    public x(String str, String str2, long j10, int i10, Long l10) {
        this.f28557a = str;
        this.f28558b = str2;
        this.f28559c = j10;
        this.f28560d = i10;
        this.f28561e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.r.a(this.f28557a, xVar.f28557a) && kotlin.jvm.internal.r.a(this.f28558b, xVar.f28558b) && this.f28559c == xVar.f28559c && this.f28560d == xVar.f28560d && kotlin.jvm.internal.r.a(this.f28561e, xVar.f28561e);
    }

    public final int hashCode() {
        int iA = androidx.datastore.preferences.protobuf.a1.a(this.f28560d, r.e2.a(l0.k.a(this.f28557a.hashCode() * 31, 31, this.f28558b), 31, this.f28559c), 31);
        Long l10 = this.f28561e;
        return iA + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = androidx.room.y0.a("AiHistoryItem(id=", this.f28557a, ", title=", this.f28558b, ", updatedAt=");
        sbA.append(this.f28559c);
        sbA.append(", turns=");
        sbA.append(this.f28560d);
        sbA.append(", projectId=");
        sbA.append(this.f28561e);
        sbA.append(")");
        return sbA.toString();
    }
}
