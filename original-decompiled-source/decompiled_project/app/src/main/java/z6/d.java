package z6;

import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class d extends b<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final int f34777b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a7.c tracker) {
        super(tracker);
        r.e(tracker, "tracker");
        this.f34777b = 5;
    }

    @Override // z6.e
    public final boolean a(WorkSpec workSpec) {
        r.e(workSpec, "workSpec");
        return workSpec.f3176j.f28006e;
    }

    @Override // z6.b
    public final int d() {
        return this.f34777b;
    }

    @Override // z6.b
    public final boolean e(Boolean bool) {
        return !bool.booleanValue();
    }
}
