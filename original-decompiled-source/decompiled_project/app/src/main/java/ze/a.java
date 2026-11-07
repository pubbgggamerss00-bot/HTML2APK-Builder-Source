package ze;

import androidx.datastore.preferences.protobuf.y0;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class a implements Cloneable, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public double f35053d = 1.0d;

    /* renamed from: a, reason: collision with root package name */
    public double f35050a = 1.0d;

    /* renamed from: f, reason: collision with root package name */
    public double f35055f = 0.0d;

    /* renamed from: e, reason: collision with root package name */
    public double f35054e = 0.0d;

    /* renamed from: c, reason: collision with root package name */
    public double f35052c = 0.0d;

    /* renamed from: b, reason: collision with root package name */
    public double f35051b = 0.0d;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f35050a == aVar.f35050a && this.f35052c == aVar.f35052c && this.f35054e == aVar.f35054e && this.f35051b == aVar.f35051b && this.f35053d == aVar.f35053d && this.f35055f == aVar.f35055f) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        y0.a(a.class, sb, "[[");
        sb.append(this.f35050a);
        sb.append(", ");
        sb.append(this.f35052c);
        sb.append(", ");
        sb.append(this.f35054e);
        sb.append("], [");
        sb.append(this.f35051b);
        sb.append(", ");
        sb.append(this.f35053d);
        sb.append(", ");
        sb.append(this.f35055f);
        sb.append("]]");
        return sb.toString();
    }
}
