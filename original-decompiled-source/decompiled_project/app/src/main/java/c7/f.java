package c7;

import androidx.work.impl.model.SystemIdInfo;

/* loaded from: classes.dex */
public final class f extends androidx.room.g<SystemIdInfo> {
    @Override // androidx.room.o0
    public final String b() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // androidx.room.g
    public final void d(i6.f fVar, SystemIdInfo systemIdInfo) {
        fVar.o(1, systemIdInfo.f3164a);
        fVar.d(2, r5.f3165b);
        fVar.d(3, r5.f3166c);
    }
}
