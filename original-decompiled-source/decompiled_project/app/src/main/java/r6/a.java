package r6;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f23212a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23213b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23214c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23215d;

    public a(Rect rect) {
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        this.f23212a = i10;
        this.f23213b = i11;
        this.f23214c = i12;
        this.f23215d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        a aVar = (a) obj;
        return this.f23212a == aVar.f23212a && this.f23213b == aVar.f23213b && this.f23214c == aVar.f23214c && this.f23215d == aVar.f23215d;
    }

    public final int hashCode() {
        return (((((this.f23212a * 31) + this.f23213b) * 31) + this.f23214c) * 31) + this.f23215d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) a.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f23212a);
        sb.append(',');
        sb.append(this.f23213b);
        sb.append(',');
        sb.append(this.f23214c);
        sb.append(',');
        return x0.a.a(sb, this.f23215d, "] }");
    }
}
