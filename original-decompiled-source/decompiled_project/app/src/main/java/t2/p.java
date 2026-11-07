package t2;

import androidx.datastore.preferences.protobuf.a1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final b3.c f27872a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27873b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27874c;

    public p(b3.c cVar, int i10, int i11) {
        this.f27872a = cVar;
        this.f27873b = i10;
        this.f27874c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f27872a.equals(pVar.f27872a) && this.f27873b == pVar.f27873b && this.f27874c == pVar.f27874c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27874c) + a1.a(this.f27873b, this.f27872a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f27872a);
        sb.append(", startIndex=");
        sb.append(this.f27873b);
        sb.append(", endIndex=");
        return b.b.a(sb, this.f27874c, ')');
    }
}
