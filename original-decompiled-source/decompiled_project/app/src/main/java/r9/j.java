package r9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends r {

    /* renamed from: a, reason: collision with root package name */
    public final String f23291a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f23292b;

    /* renamed from: c, reason: collision with root package name */
    public final o9.c f23293c;

    public j(String str, byte[] bArr, o9.c cVar) {
        this.f23291a = str;
        this.f23292b = bArr;
        this.f23293c = cVar;
    }

    @Override // r9.r
    public final String a() {
        return this.f23291a;
    }

    @Override // r9.r
    public final byte[] b() {
        return this.f23292b;
    }

    @Override // r9.r
    public final o9.c c() {
        return this.f23293c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f23291a.equals(rVar.a())) {
            return Arrays.equals(this.f23292b, rVar instanceof j ? ((j) rVar).f23292b : rVar.b()) && this.f23293c.equals(rVar.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f23291a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f23292b)) * 1000003) ^ this.f23293c.hashCode();
    }
}
