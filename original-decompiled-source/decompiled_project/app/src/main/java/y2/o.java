package y2;

import androidx.datastore.preferences.protobuf.a1;
import r.o2;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: g, reason: collision with root package name */
    public static final o f33752g = new o(false, 0, true, 1, 1, a3.c.f24c);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33753a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33754b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33755c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33756d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33757e;

    /* renamed from: f, reason: collision with root package name */
    public final a3.c f33758f;

    public o(boolean z10, int i10, boolean z11, int i11, int i12, a3.c cVar) {
        this.f33753a = z10;
        this.f33754b = i10;
        this.f33755c = z11;
        this.f33756d = i11;
        this.f33757e = i12;
        this.f33758f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f33753a == oVar.f33753a && this.f33754b == oVar.f33754b && this.f33755c == oVar.f33755c && this.f33756d == oVar.f33756d && this.f33757e == oVar.f33757e && kotlin.jvm.internal.r.a(this.f33758f, oVar.f33758f);
    }

    public final int hashCode() {
        return this.f33758f.f25a.hashCode() + a1.a(this.f33757e, a1.a(this.f33756d, o2.a(a1.a(this.f33754b, Boolean.hashCode(this.f33753a) * 31, 31), 31, this.f33755c), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f33753a);
        sb.append(", capitalization=");
        int i10 = this.f33754b;
        sb.append((Object) (i10 == -1 ? "Unspecified" : i10 == 0 ? "None" : i10 == 1 ? "Characters" : i10 == 2 ? "Words" : i10 == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.f33755c);
        sb.append(", keyboardType=");
        sb.append((Object) r.a(this.f33756d));
        sb.append(", imeAction=");
        sb.append((Object) n.a(this.f33757e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f33758f);
        sb.append(')');
        return sb.toString();
    }
}
