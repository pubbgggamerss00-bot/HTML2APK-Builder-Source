package c7;

import androidx.room.o0;

/* loaded from: classes.dex */
public final class s extends o0 {
    @Override // androidx.room.o0
    public final String b() {
        return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
    }
}
