package ne;

import b.o;

/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f18795a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18796b;

    public a(String str, String str2) {
        this.f18795a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f18796b = str2;
    }

    @Override // ne.e
    public final String a() {
        return this.f18795a;
    }

    @Override // ne.e
    public final String b() {
        return this.f18796b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f18795a.equals(eVar.a()) && this.f18796b.equals(eVar.b());
    }

    public final int hashCode() {
        return ((this.f18795a.hashCode() ^ 1000003) * 1000003) ^ this.f18796b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f18795a);
        sb.append(", version=");
        return o.a(sb, this.f18796b, "}");
    }
}
