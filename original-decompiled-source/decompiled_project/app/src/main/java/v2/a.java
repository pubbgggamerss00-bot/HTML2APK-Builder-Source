package v2;

import android.text.SegmentFinder;
import com.google.android.gms.common.api.internal.y;

/* loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f30548a;

    public a(y yVar) {
        this.f30548a = yVar;
    }

    public final int nextEndBoundary(int i10) {
        return this.f30548a.F(i10);
    }

    public final int nextStartBoundary(int i10) {
        return this.f30548a.w(i10);
    }

    public final int previousEndBoundary(int i10) {
        return this.f30548a.x(i10);
    }

    public final int previousStartBoundary(int i10) {
        return this.f30548a.E(i10);
    }
}
