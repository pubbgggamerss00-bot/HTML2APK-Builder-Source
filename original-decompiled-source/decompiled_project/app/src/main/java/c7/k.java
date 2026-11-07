package c7;

import androidx.work.impl.model.WorkName;

/* loaded from: classes.dex */
public final class k extends androidx.room.g<WorkName> {
    @Override // androidx.room.o0
    public final String b() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // androidx.room.g
    public final void d(i6.f fVar, WorkName workName) {
        fVar.o(1, null);
        throw null;
    }
}
