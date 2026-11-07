package hh;

import java.util.Random;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class b extends hh.a {

    /* renamed from: c, reason: collision with root package name */
    public final a f13026c = new a();

    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // hh.a
    public final Random g() {
        Random random = this.f13026c.get();
        r.d(random, "get(...)");
        return random;
    }
}
