package g7;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f11499a;

    public interface a {
        long getSize();
    }

    public g(Drawable drawable) {
        this.f11499a = drawable;
    }

    @Override // g7.l
    public final int a() {
        return b8.t.b(this.f11499a);
    }

    @Override // g7.l
    public final boolean b() {
        return false;
    }

    @Override // g7.l
    public final void c(Canvas canvas) {
        this.f11499a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.r.a(this.f11499a, ((g) obj).f11499a);
    }

    @Override // g7.l
    public final int getHeight() {
        return b8.t.a(this.f11499a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g7.l
    public final long getSize() {
        Drawable drawable = this.f11499a;
        long size = drawable instanceof a ? ((a) drawable).getSize() : b8.t.b(drawable) * 4 * b8.t.a(drawable);
        if (size < 0) {
            return 0L;
        }
        return size;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f11499a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.f11499a + ", shareable=false)";
    }
}
