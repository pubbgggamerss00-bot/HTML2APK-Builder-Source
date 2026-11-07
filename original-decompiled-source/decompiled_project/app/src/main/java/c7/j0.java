package c7;

import androidx.work.impl.model.WorkTag;

/* loaded from: classes.dex */
public final class j0 extends androidx.room.g<WorkTag> {
    @Override // androidx.room.o0
    public final String b() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // androidx.room.g
    public final void d(i6.f fVar, WorkTag workTag) {
        WorkTag workTag2 = workTag;
        fVar.o(1, workTag2.f3191a);
        fVar.o(2, workTag2.f3192b);
    }
}
