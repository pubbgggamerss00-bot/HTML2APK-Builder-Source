package y3;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f33803a;

    public static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ScrollFeedbackProvider f33804a;

        public a(NestedScrollView nestedScrollView) {
            this.f33804a = ScrollFeedbackProvider.createProvider(nestedScrollView);
        }

        @Override // y3.c0.c
        public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
            this.f33804a.onScrollLimit(i10, i11, i12, z10);
        }

        @Override // y3.c0.c
        public final void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.f33804a.onScrollProgress(i10, i11, i12, i13);
        }
    }

    public static class b implements c {
        @Override // y3.c0.c
        public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        }

        @Override // y3.c0.c
        public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        }
    }

    public interface c {
        void onScrollLimit(int i10, int i11, int i12, boolean z10);

        void onScrollProgress(int i10, int i11, int i12, int i13);
    }

    public c0(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f33803a = new a(nestedScrollView);
        } else {
            this.f33803a = new b();
        }
    }
}
