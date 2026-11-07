package o9;

import com.google.android.gms.internal.play_billing.zzji;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f19060a;

    /* renamed from: b, reason: collision with root package name */
    public final c f19061b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(zzji zzjiVar) {
        if (zzjiVar == 0) {
            throw new NullPointerException("Null payload");
        }
        this.f19060a = zzjiVar;
        this.f19061b = c.f19063a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f19060a.equals(aVar.f19060a) && this.f19061b.equals(aVar.f19061b);
    }

    public final int hashCode() {
        return this.f19061b.hashCode() ^ (((1000003 * 1000003) ^ this.f19060a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f19060a + ", priority=" + this.f19061b + "}";
    }
}
