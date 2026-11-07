package s9;

import android.content.Context;
import b.o;

/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24772a;

    /* renamed from: b, reason: collision with root package name */
    public final aa.a f24773b;

    /* renamed from: c, reason: collision with root package name */
    public final aa.a f24774c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24775d;

    public c(Context context, aa.a aVar, aa.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f24772a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f24773b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f24774c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f24775d = str;
    }

    @Override // s9.g
    public final Context a() {
        return this.f24772a;
    }

    @Override // s9.g
    public final String b() {
        return this.f24775d;
    }

    @Override // s9.g
    public final aa.a c() {
        return this.f24774c;
    }

    @Override // s9.g
    public final aa.a d() {
        return this.f24773b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f24772a.equals(gVar.a()) && this.f24773b.equals(gVar.d()) && this.f24774c.equals(gVar.c()) && this.f24775d.equals(gVar.b());
    }

    public final int hashCode() {
        return ((((((this.f24772a.hashCode() ^ 1000003) * 1000003) ^ this.f24773b.hashCode()) * 1000003) ^ this.f24774c.hashCode()) * 1000003) ^ this.f24775d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f24772a);
        sb.append(", wallClock=");
        sb.append(this.f24773b);
        sb.append(", monotonicClock=");
        sb.append(this.f24774c);
        sb.append(", backendName=");
        return o.a(sb, this.f24775d, "}");
    }
}
