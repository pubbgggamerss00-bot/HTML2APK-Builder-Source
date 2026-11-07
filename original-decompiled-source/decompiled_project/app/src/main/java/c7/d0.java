package c7;

import androidx.room.o0;

/* loaded from: classes.dex */
public final class d0 extends o0 {
    @Override // androidx.room.o0
    public final String b() {
        return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
    }
}
