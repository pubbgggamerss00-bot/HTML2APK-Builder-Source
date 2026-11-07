package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.m f1713a;

    /* renamed from: b, reason: collision with root package name */
    public int f1714b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1715c = new Rect();

    public s(RecyclerView.m mVar) {
        this.f1713a = mVar;
    }

    public static s a(RecyclerView.m mVar, int i6) {
        if (i6 == 0) {
            return new q(mVar);
        }
        if (i6 == 1) {
            return new r(mVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i6);
}
