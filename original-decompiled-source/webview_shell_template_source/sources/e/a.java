package e;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: e.a$a, reason: collision with other inner class name */
    public static final class C0049a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Serializable f12747a;

        public C0049a(Serializable serializable) {
            this.f12747a = serializable;
        }
    }

    public abstract Intent a(Context context, I i6);

    public C0049a<O> b(Context context, I i6) {
        return null;
    }

    public abstract Object c(Intent intent, int i6);
}
