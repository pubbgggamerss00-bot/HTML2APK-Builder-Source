package z6;

import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.r;
import t6.t;

/* loaded from: classes.dex */
public final class f extends b<y6.g> {

    /* renamed from: b, reason: collision with root package name */
    public final int f34778b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a7.i<y6.g> tracker) {
        super(tracker);
        r.e(tracker, "tracker");
        this.f34778b = 7;
    }

    @Override // z6.e
    public final boolean a(WorkSpec workSpec) {
        r.e(workSpec, "workSpec");
        return workSpec.f3176j.f28002a == t.f28053b;
    }

    @Override // z6.b
    public final int d() {
        return this.f34778b;
    }

    @Override // z6.b
    public final boolean e(y6.g gVar) {
        y6.g value = gVar;
        r.e(value, "value");
        return (value.f33977a && value.f33978b) ? false : true;
    }
}
