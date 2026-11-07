package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s {
    public static void a(Serializable serializable, String str) {
        ClassCastException classCastException = new ClassCastException(androidx.activity.m.d(serializable == null ? "null" : serializable.getClass().getName(), " cannot be cast to ", str));
        j.f(classCastException, s.class.getName());
        throw classCastException;
    }
}
