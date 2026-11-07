package androidx.work;

import android.annotation.SuppressLint;
import androidx.camera.camera2.internal.v0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final a.c f1838a = new a.c();

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final a.b f1839b = new a.b();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a {

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: androidx.work.n$a$a, reason: collision with other inner class name */
        public static final class C0022a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f1840a;

            public C0022a(Throwable th) {
                this.f1840a = th;
            }

            public final String toString() {
                return v0.b("FAILURE (", this.f1840a.getMessage(), ")");
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
