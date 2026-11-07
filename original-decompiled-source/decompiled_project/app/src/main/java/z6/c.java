package z6;

import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class c extends b<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final int f34776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a7.i<Boolean> tracker) {
        super(tracker);
        r.e(tracker, "tracker");
        this.f34776b = 6;
    }

    @Override // z6.e
    public final boolean a(WorkSpec workSpec) {
        r.e(workSpec, "workSpec");
        return workSpec.f3176j.f28004c;
    }

    @Override // z6.b
    public final int d() {
        return this.f34776b;
    }

    @Override // z6.b
    public final boolean e(Boolean bool) {
        return !bool.booleanValue();
    }
}
