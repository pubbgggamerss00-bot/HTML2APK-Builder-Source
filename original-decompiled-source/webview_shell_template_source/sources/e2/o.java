package e2;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final s f12824a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f12825b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(o.f12824a.a(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f6) {
            float fFloatValue = f6.floatValue();
            o.f12824a.b(view, fFloatValue);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f12824a = new t();
        } else {
            f12824a = new s();
        }
        f12825b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    public static void a(View view, int i6, int i7, int i8, int i9) {
        f12824a.f(view, i6, i7, i8, i9);
    }

    public static void b(View view, int i6) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f12824a.c(view, i6);
    }
}
