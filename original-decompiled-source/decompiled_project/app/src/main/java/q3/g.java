package q3;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f21890a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<b, SparseArray<a>> f21891b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f21892c = new Object();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ColorStateList f21893a;

        /* renamed from: b, reason: collision with root package name */
        public final Configuration f21894b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21895c;

        public a(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f21893a = colorStateList;
            this.f21894b = configuration;
            this.f21895c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f21896a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources.Theme f21897b;

        public b(Resources resources, Resources.Theme theme) {
            this.f21896a = resources;
            this.f21897b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f21896a.equals(bVar.f21896a) && Objects.equals(this.f21897b, bVar.f21897b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f21896a, this.f21897b);
        }
    }

    public static abstract class c {
        public final void a(final int i10) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: q3.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21900a.b(i10);
                }
            });
        }

        public abstract void b(int i10);

        public abstract void c(Typeface typeface);
    }
}
