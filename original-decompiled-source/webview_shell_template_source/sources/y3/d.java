package y3;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import e5.i;
import java.util.ArrayList;
import u0.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class d extends e<View> {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f15235c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f15236d;

    /* renamed from: e, reason: collision with root package name */
    public int f15237e;

    /* renamed from: f, reason: collision with root package name */
    public int f15238f;

    public d() {
        this.f15235c = new Rect();
        this.f15236d = new Rect();
        this.f15237e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
        AppBarLayout appBarLayoutV;
        s0 lastWindowInsets;
        int i9 = view.getLayoutParams().height;
        if ((i9 != -1 && i9 != -2) || (appBarLayoutV = v(coordinatorLayout.d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i8);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (appBarLayoutV.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.a() + lastWindowInsets.d();
        }
        int iX = x(appBarLayoutV) + size;
        int measuredHeight = appBarLayoutV.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iX -= measuredHeight;
        }
        coordinatorLayout.l(view, i6, i7, View.MeasureSpec.makeMeasureSpec(iX, i9 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // y3.e
    public final void u(CoordinatorLayout coordinatorLayout, View view, int i6) {
        AppBarLayout appBarLayoutV = v(coordinatorLayout.d(view));
        int iB = 0;
        if (appBarLayoutV == null) {
            coordinatorLayout.k(view, i6);
            this.f15237e = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
        int bottom = appBarLayoutV.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
        int bottom2 = ((appBarLayoutV.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
        Rect rect = this.f15235c;
        rect.set(paddingLeft, bottom, width, bottom2);
        s0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.b() + rect.left;
            rect.right -= lastWindowInsets.c();
        }
        int i7 = fVar.f926c;
        if (i7 == 0) {
            i7 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f15236d;
        Gravity.apply(i7, measuredWidth, measuredHeight, rect, rect2, i6);
        if (this.f15238f != 0) {
            float fW = w(appBarLayoutV);
            int i8 = this.f15238f;
            iB = i.b((int) (fW * i8), 0, i8);
        }
        view.layout(rect2.left, rect2.top - iB, rect2.right, rect2.bottom - iB);
        this.f15237e = rect2.top - appBarLayoutV.getBottom();
    }

    public abstract AppBarLayout v(ArrayList arrayList);

    public float w(View view) {
        return 1.0f;
    }

    public int x(View view) {
        return view.getMeasuredHeight();
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15235c = new Rect();
        this.f15236d = new Rect();
        this.f15237e = 0;
    }
}
