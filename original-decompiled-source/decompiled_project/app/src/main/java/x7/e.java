package x7;

import android.view.View;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class e<T extends View> implements l<T> {

    /* renamed from: b, reason: collision with root package name */
    public final T f32189b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(View view) {
        this.f32189b = view;
    }

    @Override // x7.l
    public final T a() {
        return this.f32189b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && r.a(this.f32189b, ((e) obj).f32189b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f32189b.hashCode() * 31);
    }

    @Override // x7.l
    public final boolean k() {
        return true;
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.f32189b + ", subtractPadding=true)";
    }
}
