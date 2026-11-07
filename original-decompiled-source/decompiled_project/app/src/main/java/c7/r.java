package c7;

import androidx.room.o0;

/* loaded from: classes.dex */
public final class r extends o0 {
    @Override // androidx.room.o0
    public final String b() {
        return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
    }
}
