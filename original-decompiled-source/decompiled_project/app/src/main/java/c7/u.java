package c7;

import androidx.room.o0;

/* loaded from: classes.dex */
public final class u extends o0 {
    @Override // androidx.room.o0
    public final String b() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
