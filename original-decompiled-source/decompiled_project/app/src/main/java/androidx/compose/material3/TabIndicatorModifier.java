package androidx.compose.material3;

import androidx.compose.ui.d;
import i2.a1;
import java.util.List;
import kotlin.jvm.internal.r;
import t0.ie;
import t0.wd;
import x0.r3;
import x0.x1;

/* loaded from: classes.dex */
public final class TabIndicatorModifier extends a1<wd> {

    /* renamed from: b, reason: collision with root package name */
    public final r3<List<ie>> f1121b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1122c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1123d = true;

    public TabIndicatorModifier(x1 x1Var, int i10) {
        this.f1121b = x1Var;
        this.f1122c = i10;
    }

    @Override // i2.a1
    public final d.c a() {
        wd wdVar = new wd();
        wdVar.f27320q = this.f1121b;
        wdVar.f27321r = this.f1122c;
        wdVar.f27322s = this.f1123d;
        return wdVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        wd wdVar = (wd) cVar;
        wdVar.f27320q = this.f1121b;
        wdVar.f27321r = this.f1122c;
        wdVar.f27322s = this.f1123d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) obj;
        return r.a(this.f1121b, tabIndicatorModifier.f1121b) && this.f1122c == tabIndicatorModifier.f1122c && this.f1123d == tabIndicatorModifier.f1123d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1123d) + androidx.datastore.preferences.protobuf.a1.a(this.f1122c, this.f1121b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.f1121b + ", selectedTabIndex=" + this.f1122c + ", followContentSize=" + this.f1123d + ')';
    }
}
