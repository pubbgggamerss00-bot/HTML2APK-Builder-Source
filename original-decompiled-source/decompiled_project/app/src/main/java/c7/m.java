package c7;

import androidx.work.impl.model.WorkProgress;

/* loaded from: classes.dex */
public final class m extends androidx.room.g<WorkProgress> {
    @Override // androidx.room.o0
    public final String b() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }

    @Override // androidx.room.g
    public final void d(i6.f fVar, WorkProgress workProgress) {
        fVar.o(1, null);
        throw null;
    }
}
