package e2;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {
    public static <T, V> ObjectAnimator a(T t6, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t6, property, (TypeConverter) null, path);
    }
}
