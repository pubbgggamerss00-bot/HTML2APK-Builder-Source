package kotlinx.serialization.json;

import di.o0;

/* loaded from: classes2.dex */
public final class r extends x {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16452a;

    /* renamed from: b, reason: collision with root package name */
    public final bi.f f16453b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16454c;

    public r(Object body, boolean z10, bi.f fVar) {
        kotlin.jvm.internal.r.e(body, "body");
        this.f16452a = z10;
        this.f16453b = fVar;
        this.f16454c = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // kotlinx.serialization.json.x
    public final String c() {
        return this.f16454c;
    }

    @Override // kotlinx.serialization.json.x
    public final boolean e() {
        return this.f16452a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f16452a == rVar.f16452a && kotlin.jvm.internal.r.a(this.f16454c, rVar.f16454c);
    }

    public final int hashCode() {
        return this.f16454c.hashCode() + (Boolean.hashCode(this.f16452a) * 31);
    }

    @Override // kotlinx.serialization.json.x
    public final String toString() {
        boolean z10 = this.f16452a;
        String str = this.f16454c;
        if (!z10) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        o0.a(sb, str);
        return sb.toString();
    }
}
