package u0;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final c f14582a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ScrollFeedbackProvider f14583a;

        public a(NestedScrollView nestedScrollView) {
            this.f14583a = ScrollFeedbackProvider.createProvider(nestedScrollView);
        }

        @Override // u0.v.c
        public final void onScrollLimit(int i6, int i7, int i8, boolean z6) {
            this.f14583a.onScrollLimit(i6, i7, i8, z6);
        }

        @Override // u0.v.c
        public final void onScrollProgress(int i6, int i7, int i8, int i9) {
            this.f14583a.onScrollProgress(i6, i7, i8, i9);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface c {
        void onScrollLimit(int i6, int i7, int i8, boolean z6);

        void onScrollProgress(int i6, int i7, int i8, int i9);
    }

    public v(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f14582a = new a(nestedScrollView);
        } else {
            this.f14582a = new b();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b implements c {
        @Override // u0.v.c
        public final void onScrollLimit(int i6, int i7, int i8, boolean z6) {
        }

        @Override // u0.v.c
        public final void onScrollProgress(int i6, int i7, int i8, int i9) {
        }
    }
}
