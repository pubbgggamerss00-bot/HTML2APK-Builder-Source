package s9;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24768a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f24769b;

    public a() {
        throw null;
    }

    public a(ArrayList arrayList, byte[] bArr) {
        this.f24768a = arrayList;
        this.f24769b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f24768a.equals(aVar.f24768a)) {
            return Arrays.equals(this.f24769b, aVar instanceof a ? aVar.f24769b : aVar.f24769b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f24768a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24769b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f24768a + ", extras=" + Arrays.toString(this.f24769b) + "}";
    }
}
