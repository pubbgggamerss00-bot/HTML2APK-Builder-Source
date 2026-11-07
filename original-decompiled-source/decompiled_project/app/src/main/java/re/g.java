package re;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p5.d1;

/* loaded from: classes2.dex */
public abstract class g implements qe.a {

    /* renamed from: a, reason: collision with root package name */
    public String f23460a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f23461b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public d1 f23462c;

    /* renamed from: d, reason: collision with root package name */
    public byte[][] f23463d;

    /* renamed from: e, reason: collision with root package name */
    public byte[][] f23464e;

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.f23461b.put(str, obj);
        }
    }

    public abstract u b(int i10) throws IOException;

    public final String toString() {
        return getClass().getSimpleName() + "[name=" + this.f23460a + ", topDict=" + this.f23461b + ", charset=" + this.f23462c + ", charStrings=" + Arrays.deepToString(this.f23463d) + "]";
    }
}
