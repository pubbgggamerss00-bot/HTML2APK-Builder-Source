package d4;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f12730q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f12730q = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    public final PointF a(int i6) {
        return this.f12730q.a(i6);
    }

    @Override // androidx.recyclerview.widget.o
    public final int h(View view, int i6) {
        CarouselLayoutManager carouselLayoutManager = this.f12730q;
        if (carouselLayoutManager.f12141u == null || !carouselLayoutManager.P0()) {
            return 0;
        }
        int iH = RecyclerView.m.H(view);
        return (int) (carouselLayoutManager.f12137p - carouselLayoutManager.M0(iH, carouselLayoutManager.L0(iH)));
    }

    @Override // androidx.recyclerview.widget.o
    public final int i(View view, int i6) {
        CarouselLayoutManager carouselLayoutManager = this.f12730q;
        if (carouselLayoutManager.f12141u == null || carouselLayoutManager.P0()) {
            return 0;
        }
        int iH = RecyclerView.m.H(view);
        return (int) (carouselLayoutManager.f12137p - carouselLayoutManager.M0(iH, carouselLayoutManager.L0(iH)));
    }
}
