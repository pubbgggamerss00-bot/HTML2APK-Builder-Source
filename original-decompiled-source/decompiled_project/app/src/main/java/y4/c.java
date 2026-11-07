package y4;

import java.nio.ByteBuffer;
import x0.b0;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f33935a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f33936b;

    /* renamed from: c, reason: collision with root package name */
    public int f33937c;

    /* renamed from: d, reason: collision with root package name */
    public int f33938d;

    public c() {
        if (b0.f31621a == null) {
            b0.f31621a = new b0();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f33938d) {
            return this.f33936b.getShort(this.f33937c + i10);
        }
        return 0;
    }
}
