package x2;

import android.graphics.Typeface;
import x0.r3;

/* loaded from: classes.dex */
public interface a0 extends r3<Object> {

    public static final class a implements a0 {

        /* renamed from: a, reason: collision with root package name */
        public final Object f32011a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f32012b = true;

        public a(Typeface typeface) {
            this.f32011a = typeface;
        }

        @Override // x2.a0
        public final boolean d() {
            return this.f32012b;
        }

        @Override // x0.r3
        public final Object getValue() {
            return this.f32011a;
        }
    }

    boolean d();
}
