package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class a implements n, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16308a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f16309b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16310c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16311d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16312e = false;

    /* renamed from: f, reason: collision with root package name */
    public final int f16313f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16314g;

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f16308a = obj;
        this.f16309b = cls;
        this.f16310c = str;
        this.f16311d = str2;
        this.f16313f = i10;
        this.f16314g = i11 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16312e == aVar.f16312e && this.f16313f == aVar.f16313f && this.f16314g == aVar.f16314g && this.f16308a.equals(aVar.f16308a) && this.f16309b.equals(aVar.f16309b) && this.f16310c.equals(aVar.f16310c) && this.f16311d.equals(aVar.f16311d);
    }

    @Override // kotlin.jvm.internal.n
    public final int getArity() {
        return this.f16313f;
    }

    public final int hashCode() {
        return ((((l0.k.a(l0.k.a((this.f16309b.hashCode() + (this.f16308a.hashCode() * 31)) * 31, 31, this.f16310c), 31, this.f16311d) + (this.f16312e ? 1231 : 1237)) * 31) + this.f16313f) * 31) + this.f16314g;
    }

    public final String toString() {
        h0.f16332a.getClass();
        return i0.a(this);
    }
}
